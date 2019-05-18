package comp1110.ass2.gui;


import comp1110.ass2.Tile;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static comp1110.ass2.RailroadInk.*;


/**
 * A very simple viewer for tile placements in the Railroad Ink game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various tile placements.
 */
public class Viewer extends Application {
    /* board layout */

    /**
     * Created by Tuo Liu
     */
    private static final int VIEWER_WIDTH = 1024; // The width of the viewer
    private static final int VIEWER_HEIGHT = 768; // The height of the viewer
    private static final double Tile_WIDTH = 70.0; // The width of the tile
    private static final double Tile_START_X = VIEWER_WIDTH / 10 * 2; // The start coordinate of the board
    private static final double Tile_START_Y = 60;
    private int specialCount1 = 0; // Total special tile used for player 1
    private int specialCount2 = 0; // Total special tile used for player 2
    private int round = 0; // Current round
    private int tilesLeft = 0; // The number of how many tiles left
    private boolean roundSpecialUsed = false; // If the special tile has been used on current round
    private boolean gameOver = false; // If the game is over
    private boolean multiPlayer = false; // If the game is multiplayer mode
    private boolean vsPC = false;
    private int currentPlayer = 1; // The current player
    private static final String URI_BASE = "assets/"; // The URI base of image resources

    /**
     * Created by Tuo Liu
     * Six different groups
     */
    private final Group root = new Group(); // The root group of the window
    private final Group tiles = new Group(); // The group of all tiles on the board
    private final Group board = new Group(); // The group of board
    private final Group controls = new Group(); // The group of all controls like buttons
    private final Group diceRolls = new Group(); // The group of four tiles generated by dice
    private final Group specialTiles = new Group(); // The group of special tiles

    String testNextMove(String boardString, String tiles) {
        String str;
        do {
            str = "";
            str += tiles.substring(0, 2);
            int row, col;
            do {
                row = (int)(Math.random() * 7);
                col = (int)(Math.random() * 7) ;
            } while (!grids[row][col].isEmpty2);
            str += rowtoString(row);
            str += col;
            str += Integer.toString((int)(Math.random() * 8));
        } while (!isValidPlacementSequence(getPlacement(2) + str));

        return str;
    }

    private String rowtoString(int row) { // This method is just to convert the row numbers 1 - 7 to 'A' - 'G'
        String value = "";
        switch (row) {
            case 0: value = "A"; break;
            case 1: value =  "B"; break;
            case 2: value =  "C"; break;
            case 3: value =  "D"; break;
            case 4: value =  "E"; break;
            case 5: value =  "F"; break;
            case 6: value =  "G"; break;
        }
        return value;
    }


    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Written by Tuo Liu
     * To represent the grids on board
     */

    class Grid {
        private double x; // The coordinate of the grid
        private double y;
        public boolean isEmpty1; // If there is no tile on the grid
        public boolean isEmpty2;

        public Grid(double x, double y) {
            this.x = x;
            this.y = y;
            this.isEmpty1 = true;
            this.isEmpty2 = true;
        }

        public boolean isEmpty() {
            return currentPlayer == 1 ? this.isEmpty1 : this.isEmpty2;
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }
    }

    Grid[][] grids = new Grid[7][7]; // To create a 7*7 grids.   Written by Tuo Liu

    /**
     * Written by Tuo Liu
     * To give the x and y to 7*7 girds
     */
    private void initGrids() {
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                grids[i][j] = new Grid(Tile_START_X + Tile_WIDTH * j, Tile_START_Y + Tile_WIDTH * (i+1));
            }
        }
    }

    /**
     * Created by Tuo Liu
     * To create five groups of Tiles
     */
    List<TileImage> specialTiles1 = new ArrayList<>();
    List<TileImage> specialTiles2 = new ArrayList<>();
    List<TileImage> placement1 = new ArrayList<>();
    List<TileImage> placement2 = new ArrayList<>();
    List<TileImage> diceTiles = new ArrayList<>();


    /**
     * Created by Tuo Liu
     * To create a class to represent the Tiles
     */
    class TileImage extends ImageView {
        double mouseX, mouseY; //To implement snap function
        double homeX, homeY; // To represent the original location of the tile
        String name; // The name of tiles like A1, B1, S1
        int orientation; // The orientation of the tile
        int row, col; // The position on the Board
        boolean isPlaced; // To judge if the tile has been placed on the board
        boolean isSpecial; // To judge if the tile is a special tile

        TileImage(Image image, String name, double startX, double startY, int orientation) {
            super(image);
            this.row = -1;
            this.col = -1;
            this.isPlaced = false;
            this.name = name;
            this.orientation = orientation;
            this.homeX = startX;
            this.homeY = startY;
            if(name.charAt(0) == 'S') { // To determine if the tile is a special tile
                this.isSpecial = true;
            } else {
                this.isSpecial = false;
            }

            setFitHeight(Tile_WIDTH);
            setFitWidth(Tile_WIDTH);
            setLayoutX(startX);
            setLayoutY(startY);
            setOrientation();

            setOnMousePressed(event -> { // Set up mouse press event
                if(!this.isPlaced && !gameOver) {
                    mouseX = event.getSceneX();
                    mouseY = event.getSceneY();
                }
            });

            setOnMouseDragged(event -> { // Set up mouse drag event
                if(!this.isPlaced && !gameOver){
                    toFront();
                    double movementX = event.getSceneX() - mouseX;
                    double movementY = event.getSceneY() - mouseY;
                    setLayoutX(getLayoutX() + movementX);
                    setLayoutY(getLayoutY() + movementY);
                    mouseX = event.getSceneX();
                    mouseY = event.getSceneY();
                }
                event.consume();
            });

            setOnMouseReleased(event -> { // Set up mouse release event
                if(!this.isPlaced && !gameOver) {
                    if(!snapToGrid())
                        snapToHome();
                }
            });

            setOnScroll(event -> { // Set up mouse scroll event, change the orientation of the tile
                if (!this.isPlaced && !gameOver)
                {
                    this.orientation = (this.orientation + 1) % 8;
                    setOrientation();
                    event.consume();
                }
            });

        }

        public TileImage clone() { // To create a new tile that has the same features
            return new TileImage(this.getImage(), this.name, this.homeX, this.homeY, this.orientation);
        }

        @Override
        public String toString() { // Convert the tile to board String
            return this.name + rowtoString(this.row) + this.col + this.orientation;
        }

        private void setOrientation() { // Rotate the tile to its current orientation
            if(this.orientation >= 4) {
                setScaleX(-1);
                setRotate(this.orientation * 90);
            } else {
                setScaleX(1);
                setRotate(this.orientation * 90);
            }

        }


        private void snapToHome() { // snap the tile to its home location
                setLayoutX(homeX);
                setLayoutY(homeY);
        }

        private boolean snapToGrid() { // To snap the tile to the nearest grid
            // To determine if the special tile has been used over times
            if(this.isSpecial) {
                if(currentPlayer == 1) {
                    if(specialCount1 >= 3 || roundSpecialUsed) {
                        return false;
                    }
                } else {
                    if(specialCount2 >= 3 || roundSpecialUsed) {
                        return false;
                    }
                }

            }

            // To determine if the tile has been snapped to near a grid
            for(int i = 0; i < 7; i++) {
                for(int j = 0; j < 7; j++) {
                    if((Math.abs(getLayoutX() - grids[i][j].getX()) < (Tile_WIDTH / 4)) && (Math.abs(getLayoutY() - grids[i][j].getY()) < (Tile_WIDTH / 4))) {
                        if(grids[i][j].isEmpty()) { // To determine if there is already a tile on the grid
                            if(isValidPlacementSequence((getPlacement(currentPlayer)) + this.name + rowtoString(i) + j + this.orientation)){ // To determine if the new placement is legal
                                if(this.isSpecial) {
                                    if(currentPlayer == 1) {
                                        specialCount1 += 1; // Add the total number of special tiles used to player 1
                                        specialTiles1.remove(this); // Remove the tile from special tiles list of player 1
                                    } else {
                                        specialCount2 += 1; // Add the total number of special tiles used to player 2
                                        specialTiles2.remove(this); // Remove the tile from special tiles list of player 2
                                    }
                                    specialTiles.getChildren().remove(this); // Remove the tile from the group of special tiles
                                    roundSpecialUsed = true; // Set the round special tile use status
                                    specialLabel.setText("Special tiles used: " + (currentPlayer == 1 ? specialCount1 : specialCount2)); // Update the special tile label
                                } else {
                                    diceRolls.getChildren().remove(this); // Remove the tile from the group of tiles generated from dice
                                    tilesLeft -= 1;
                                }

                                /**
                                 * Create a new tile and put it onto the board
                                 * Put the current tile back to the dice roll for next player to use
                                 * */
                                TileImage tile = clone(); // Create a new tile that has the same features to current tile
                                setLayoutX(homeX); //
                                setLayoutY(homeY);
                                tile.setLayoutX(grids[i][j].getX());
                                tile.setLayoutY(grids[i][j].getY());
                                tile.row = i;
                                tile.col = j;

                                tile.isPlaced = true;
                                tiles.getChildren().add(tile);

                                if(currentPlayer == 1) {
                                    placement1.add(tile); // Add the tile to placement list for player 1
                                    grids[i][j].isEmpty1 = false;
                                } else {
                                    placement2.add(tile); // ADd the tile to placement list for player 2
                                    grids[i][j].isEmpty2 = false;
                                }
//                            /*
//                            if(generateMove(CURRENT_PLACEMENT, ROLL_MEMBERS) == "") {
//                                gameOver();
//                            }
//                            */
                                /*if(tilesLeft == 0) { // If there is no tiles left, go to next round
                                    nextRound();
                                }*/
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    /**
     * Written by Jingfen Qiao
     * Implement the placement to the board
     */
    void makePlacement() {
        tiles.getChildren().clear();
        if(currentPlayer == 1) {
            for(int i = 0; i < placement1.size(); i++) {
                tiles.getChildren().add(placement1.get(i));
            }
        } else {
            for(int i = 0; i < placement2.size(); i++) {
                tiles.getChildren().add(placement2.get(i));
            }
        }

    }


    /*void testPlacement(String placement) {
            tiles.getChildren().clear();
            for(int i = 0; i < placement.length(); i+=5) {
                String img = placement.substring(i, i + 2);
                int row = placement.charAt(i + 2) - 65 + 1;
                int col = placement.charAt(i + 3) - 48;
                int orientation = placement.charAt(i + 4) - 48;

                Image image =new Image(Viewer.class.getResource(URI_BASE+img+".png").toString());

                TileImage tileImage = new TileImage(image, img, Tile_START_X + Tile_WIDTH * col, Tile_START_Y + Tile_WIDTH * row, orientation);

                tiles.getChildren().add(tileImage);

            }
    }*/

    /**
     * Created by Tuo Liu
     * To get the placement String of current player
     * @param player
     * @return
     */
    public String getPlacement(int player) {
        String placement = "";
        if(player == 1) {
            for(int i = 0; i < placement1.size(); i++) {
                placement += placement1.get(i).toString();
            }
        } else {
            for(int i = 0; i < placement2.size(); i++) {
                placement += placement2.get(i).toString();
            }
        }
        return placement;
    }

    /**
     * Created by Tuo Liu
     * To make the board
     */
    void makeBoard() {
        initGrids(); // Initial the grids

        // Add the 8x8 lines
        for(int i = 0; i <= 7; i++) {
            Line l_vertical = new Line();
            l_vertical.setStartX(Tile_START_X + Tile_WIDTH * i);
            l_vertical.setStartY(Tile_START_Y + Tile_WIDTH);
            l_vertical.setEndX(Tile_START_X + Tile_WIDTH * i);
            l_vertical.setEndY(Tile_START_Y + Tile_WIDTH * 8);
            board.getChildren().add(l_vertical);

            Line l_horizontal = new Line();
            l_horizontal.setStartX(Tile_START_X);
            l_horizontal.setStartY(Tile_START_Y + Tile_WIDTH * (i + 1));
            l_horizontal.setEndX(Tile_START_X + Tile_WIDTH * 7);
            l_horizontal.setEndY(Tile_START_Y + Tile_WIDTH * (i + 1));
            board.getChildren().add(l_horizontal);
        }

        // Add the red line in the middle
        Line sl_vertical1 = new Line();
        sl_vertical1.setStroke(Color.RED);
        sl_vertical1.setStrokeWidth(2);
        sl_vertical1.setStartX(Tile_START_X + Tile_WIDTH * 2);
        sl_vertical1.setStartY(Tile_START_Y + Tile_WIDTH * 3);
        sl_vertical1.setEndX(Tile_START_X + Tile_WIDTH * 2);
        sl_vertical1.setEndY(Tile_START_Y + Tile_WIDTH * 6);
        board.getChildren().add(sl_vertical1);

        Line sl_vertical2 = new Line();
        sl_vertical2.setStroke(Color.RED);
        sl_vertical2.setStrokeWidth(2);
        sl_vertical2.setStartX(Tile_START_X + Tile_WIDTH * 5);
        sl_vertical2.setStartY(Tile_START_Y + Tile_WIDTH * 3);
        sl_vertical2.setEndX(Tile_START_X + Tile_WIDTH * 5);
        sl_vertical2.setEndY(Tile_START_Y + Tile_WIDTH * 6);
        board.getChildren().add(sl_vertical2);

        Line sl_horizontal1 = new Line();
        sl_horizontal1.setStroke(Color.RED);
        sl_horizontal1.setStrokeWidth(2);
        sl_horizontal1.setStartX(Tile_START_X + Tile_WIDTH * 2);
        sl_horizontal1.setStartY(Tile_START_Y + Tile_WIDTH * 3);
        sl_horizontal1.setEndX(Tile_START_X + Tile_WIDTH * 5);
        sl_horizontal1.setEndY(Tile_START_Y + Tile_WIDTH * 3);
        board.getChildren().add(sl_horizontal1);

        Line sl_horizontal2 = new Line();
        sl_horizontal2.setStroke(Color.RED);
        sl_horizontal2.setStrokeWidth(2);
        sl_horizontal2.setStartX(Tile_START_X + Tile_WIDTH * 2);
        sl_horizontal2.setStartY(Tile_START_Y + Tile_WIDTH * 6);
        sl_horizontal2.setEndX(Tile_START_X + Tile_WIDTH * 5);
        sl_horizontal2.setEndY(Tile_START_Y + Tile_WIDTH * 6);
        board.getChildren().add(sl_horizontal2);

        // Add Exit to the board
        Image highExit = new Image(Viewer.class.getResource(URI_BASE + "HighExit.png").toString());
        Image railExit = new Image(Viewer.class.getResource(URI_BASE + "RailExit.png").toString());

        for(int i = 0; i < 12; i++) {
            double x = 0.0;
            double y = 0.0;
            int orientation = 0;
            switch (i) {
                case 0:
                    x = Tile_START_X + Tile_WIDTH * 1;
                    y = Tile_START_Y + Tile_WIDTH * 0.5;
                    orientation = 0;
                    break;
                case 1:
                    x = Tile_START_X + Tile_WIDTH * 3;
                    y = Tile_START_Y + Tile_WIDTH * 0.5;
                    orientation = 0;
                    break;
                case 2:
                    x = Tile_START_X + Tile_WIDTH * 5;
                    y = Tile_START_Y + Tile_WIDTH * 0.5;
                    orientation = 0;
                    break;
                case 3:
                    x = Tile_START_X + Tile_WIDTH * 6.5;
                    y = Tile_START_Y + Tile_WIDTH * 2;
                    orientation = 1;
                    break;
                case 4:
                    x = Tile_START_X + Tile_WIDTH * 6.5;
                    y = Tile_START_Y + Tile_WIDTH * 4;
                    orientation = 1;
                    break;
                case 5:
                    x = Tile_START_X + Tile_WIDTH * 6.5;
                    y = Tile_START_Y + Tile_WIDTH * 6;
                    orientation = 1;
                    break;
                case 6:
                    x = Tile_START_X + Tile_WIDTH * 5;
                    y = Tile_START_Y + Tile_WIDTH * 7.5;
                    orientation = 2;
                    break;
                case 7:
                    x = Tile_START_X + Tile_WIDTH * 3;
                    y = Tile_START_Y + Tile_WIDTH * 7.5;
                    orientation = 2;
                    break;
                case 8:
                    x = Tile_START_X + Tile_WIDTH * 1;
                    y = Tile_START_Y + Tile_WIDTH * 7.5;
                    orientation = 2;
                    break;
                case 9:
                    x = Tile_START_X + Tile_WIDTH * -0.5;
                    y = Tile_START_Y + Tile_WIDTH * 6;
                    orientation = 3;
                    break;
                case 10:
                    x = Tile_START_X + Tile_WIDTH * -0.5;
                    y = Tile_START_Y + Tile_WIDTH * 4;
                    orientation = 3;
                    break;
                case 11:
                    x = Tile_START_X + Tile_WIDTH * -0.5;
                    y = Tile_START_Y + Tile_WIDTH * 2;
                    orientation = 3;
                    break;
            }
            ImageView exitView = new ImageView();
            exitView.setFitWidth(Tile_WIDTH);
            exitView.setFitHeight(Tile_WIDTH);
            if(i%2 == 0) {
                exitView.setImage(highExit);

            } else {
                exitView.setImage(railExit);
            }
            exitView.setX(x);
            exitView.setY(y);
            exitView.setRotate(orientation * 90);
            board.getChildren().add(exitView);
        }

    }

    /**
     * Created by Tuo Liu
     * Add specials to the special tile lists
     */
    private void initSpecialTiles() {
        double x = Tile_START_X + Tile_WIDTH;
        for(int i = 0; i < 6; i++) {
            String img = "S" + i;
            Image image = new Image(Viewer.class.getResource(URI_BASE + img + ".png").toString());
            specialTiles1.add(new TileImage(image, img, x,Tile_START_Y / 3,0));
            specialTiles2.add(new TileImage(image, img, x,Tile_START_Y / 3,0));
            specialTiles1.get(i).isSpecial = true;
            specialTiles2.get(i).isSpecial = true;
            x += Tile_WIDTH * 1.5;
        }
    }

    /**
     * Created by Tuo Liu
     * Add all the special tiles of current player to the special tile group
     */
    private void makeSpecialTiles() {
        specialTiles.getChildren().clear();
        if(currentPlayer == 1) {
            for(int i = 0; i < specialTiles1.size(); i++) {
                specialTiles.getChildren().add(specialTiles1.get(i));
            }
        } else {
            for(int i = 0; i < specialTiles2.size(); i++) {
                if(vsPC) {
                    specialTiles2.get(i).isPlaced = true;
                }
                specialTiles.getChildren().add(specialTiles2.get(i));
            }
        }

        specialLabel.setText("Special tiles used: " + (currentPlayer == 1 ? specialCount1 : specialCount2));
    }

    /**
     * Created by Tuo Liu
     * Add the tiles generated from dice to the tile group
     */
    private void makeDiceTiles() {
        diceRolls.getChildren().clear();
        for(int i = 0; i < diceTiles.size(); i++) {
            if(vsPC && currentPlayer == 2) {
                diceTiles.get(i).isPlaced = true;
            }
            diceRolls.getChildren().add(diceTiles.get(i));
        }
    }

    private TileImage makeTile(String placement) {
        String img = placement.substring(0, 2);
        int row = placement.charAt(2) - 65;
        int col = placement.charAt(3) - 48;
        int orientation = placement.charAt(4) - 48;

        Image image =new Image(Viewer.class.getResource(URI_BASE+img+".png").toString());
        TileImage tileImage = new TileImage(image, img, Tile_START_X + Tile_WIDTH * col, Tile_START_Y + Tile_WIDTH * (row + 1), orientation);
        tileImage.row = row;
        tileImage.col = col;

        return tileImage;
    }

    private void pcGo () {
        makePlacement();
        String diceRoll = "";
        for(int i = 0; i < diceTiles.size(); i++) {
            diceRoll += diceTiles.get(i).name;
        }
        System.out.println("BoardString: "+ getPlacement(2) + ", DiceRolls: " + diceRoll);
        String place = computerOpponent(getPlacement(2), diceRoll);
        System.out.println("Got: " + place);
        for(int i = 0; i < place.length(); i+=5) {

            String tilePlacement = place.substring(i, i+5);
            TileImage tmpTile = makeTile(tilePlacement);
            tmpTile.isPlaced = true;
            placement2.add(tmpTile);
            grids[tmpTile.row][tmpTile.col].isEmpty2 = false;
            if(tilePlacement.charAt(0) == 'S') {
                for(int j = 0; j < specialTiles2.size(); j++) {
                    if(specialTiles2.get(j).name.equals(tmpTile.name)) {
                        specialTiles2.remove(j);
                        break;
                    }
                }
            } else {
                for(int j = 0; j < diceTiles.size(); j++) {
                    if(diceTiles.get(j).name.equals(tmpTile.name)) {
                        diceTiles.remove(j);
                        break;
                    }
                }
                diceRoll = diceRoll.replaceFirst(tilePlacement.substring(0, 2), "");
            }
            makePlacement();
            makeDiceTiles();
            makeSpecialTiles();

        }
        makeDiceTiles();

    }

    /**
     * Created by Tuo Liu
     * To go to next round
     */
    private void nextRound() {
        if(round <= 7) {
            if(multiPlayer == true) { // If the game is in multiplayer mode
                if(currentPlayer == 2) {
                    if(round == 7) { // If the round is 7, finish the game
                        gameOver();
                        return;
                    }
                    currentPlayer = 1;
                    round ++;
                    roundLabel.setText("Round: " + round);
                    rollDice();

                } else {
                    currentPlayer = 2;
                    if(vsPC) {
                        makePlacement();
                        makeSpecialTiles();
                        playerLabel.setText("Player: " + currentPlayer);
                        pcGo();
                    }
                }
                if(!(vsPC && currentPlayer == 2)) {
                    makeDiceTiles();
                    makeSpecialTiles();
                }
                makePlacement();
                makeSpecialTiles();
            } else {
                if(round == 7) {
                    gameOver();
                    return;
                }
                round ++;
                roundLabel.setText("Round: " + round);
                rollDice(); // Generate new tile rolls
                makeDiceTiles();
                makePlacement();
            }

        } else {
            gameOver();
        }
        playerLabel.setText("Player: " + currentPlayer);
        roundSpecialUsed = false;
        tilesLeft = 4;
    }

    /**
     * Created by Tuo Liu
     * Generate new dice rolls and add to the group
     */
    private void rollDice() {

            diceTiles.clear();
            String diceRoll = generateDiceRoll();
            double y = Tile_START_Y + Tile_WIDTH * 1.5;
            for(int i=0; i<8; i+=2) {
                String img = diceRoll.substring(i, i+2);
                Image image =new Image(Viewer.class.getResource(URI_BASE + img + ".png").toString());
                TileImage tileImage = new TileImage(image, img, Tile_START_X + Tile_WIDTH * 9, y, 0);
                y += Tile_WIDTH * 1.5;
                diceTiles.add(tileImage);
            }
            tilesLeft = 4;
    }

    /**
     * Created by Tuo Liu
     */
    Label roundLabel = new Label("Round: " + round);
    Label playerLabel = new Label("Player: " + currentPlayer);
    Label specialLabel = new Label("Special tiles used: " + (currentPlayer == 1 ? specialCount1 : specialCount2));


    // Written by Jingfen Qiao
    // Open an new window to display the scores.
    private void gameOver() {

        gameOver = true;

        // image for the window of single player
        Image img = new Image(Viewer.class.getResource(URI_BASE+"WOW.png").toString());
        ImageView imageview = new ImageView(img);
        imageview.setX(250);
        imageview.setY(10);
        imageview.setFitWidth(120);
        imageview.setFitHeight(120);

        // image for the window of multi-players
        ImageView imageview2 = new ImageView(img);
        imageview2.setX(250);
        imageview2.setY(10);
        imageview2.setFitWidth(120);
        imageview2.setFitHeight(120);


        // Words to remind the player about the score
        Label label1 = new Label("CONGRATULATIONS... YOU BEAT THE GAME!");
        label1.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,20));
        label1.setLayoutX(120);
        label1.setLayoutY(130);

        // Words to remind two players about scores
        Label label5 = new Label("CONGRATULATIONS... YOU BEAT THE GAME!");
        label5.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,20));
        label5.setLayoutX(120);
        label5.setLayoutY(130);

        // Generate the score of single player by invoking the function getPlacement
        Label label2 = new Label("Your Score: " + getBasicScore(getPlacement(1)));
        label2.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
        label2.setLayoutX(250);
        label2.setLayoutY(170);

        // Generate the score of first player between two players by invoking the function getPlacement
        Label label3 = new Label("First player's score: " + getBasicScore(getPlacement(1)));
        label3.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
        label3.setLayoutX(220);
        label3.setLayoutY(170);

        // Generate the score of second player between two players by invoking the function getPlacement as well
        Label label4 = new Label("Second player's score: " + getBasicScore(getPlacement(2)));
        label4.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
        label4.setLayoutX(220);
        label4.setLayoutY(220);

        // Get the advanced score
        Label label6 = new Label("Advanced score: " + getAdvancedScore(getPlacement(1)));
        label6.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
        label6.setLayoutX(220);
        label6.setLayoutY(270);

        Label label7 = new Label("Advanced score: " + getAdvancedScore(getPlacement(1)));
        label7.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
        label7.setLayoutX(220);
        label7.setLayoutY(210);

        // Group label1, label2 and image together for the window of single player
        Group rootOne = new Group();
        rootOne.getChildren().addAll(label1,label2,label7,imageview);

        // Group label5,label4, imageview2 together for the window of multi-players
        Group rootMulti = new Group();
        rootMulti.getChildren().addAll(label5,label3,label4,label6,imageview2);

        // Show the window of single player if they select the singe player, otherwise, show the window of multi-players
        Scene scene;
        if(multiPlayer)
        {
            scene = new Scene(rootMulti, 640, 300);
        }

        else
        {
            scene = new Scene(rootOne, 640, 300);
        }

        //Scene scene = new Scene(root, 640, 300);

        //New window
        Stage gameOverWindow = new Stage();
        gameOverWindow.setTitle("Game Over");
        gameOverWindow.setScene(scene);

        gameOverWindow.setX(200);
        gameOverWindow.setY(100);

        gameOverWindow.setAlwaysOnTop(true);
        gameOverWindow.show();
    }


    /**
     * Created by Tuo Liu
     * To restart the game
     */
    private void restartGame() {
        controls.getChildren().clear();
        board.getChildren().clear();
        specialTiles.getChildren().clear();
        diceRolls.getChildren().clear();
        tiles.getChildren().clear();
        specialTiles1.clear();
        specialTiles2.clear();
        diceTiles.clear();
        placement1.clear();
        placement2.clear();
        specialCount1 = 0;
        specialCount2 = 0;
        round = 0;
        roundSpecialUsed = false;
        currentPlayer = 1;
        makeControls();
        gameOver = false;
    }

    /**
     * Created by Tuo Liu
     * To create all the controls on the window
     */
    private void makeControls() {

        Button nextRoundButton = new Button("Next Round");
        nextRoundButton.setOnAction(e -> {
            nextRound();
        });
        nextRoundButton.setLayoutX(Tile_START_X + Tile_WIDTH * 9);
        nextRoundButton.setLayoutY(Tile_START_X + Tile_WIDTH * 6);

        Label label = new Label("Special Tiles:");
        label.setFont(Font.font("Cambria", 24));
        label.setLayoutX(Tile_START_X / 5);
        label.setLayoutY(Tile_START_Y / 2);

        specialLabel.setFont(Font.font("Cambria", 15));
        specialLabel.setLayoutX(Tile_START_X / 5);
        specialLabel.setLayoutY(Tile_START_Y * 1.2);

        roundLabel.setFont(Font.font("Cambria", 20));
        roundLabel.setLayoutX(Tile_START_X / 5);
        roundLabel.setLayoutY(Tile_START_Y * 2);

        playerLabel.setFont(Font.font("Cambria", 20));
        playerLabel.setLayoutX(Tile_START_X / 5);
        playerLabel.setLayoutY(Tile_START_Y * 2.5);

        Button newGameButton = new Button("Restart Game");
        newGameButton.setOnAction(e -> {
            restartGame();
        });
        newGameButton.setLayoutX(Tile_START_X / 5);
        newGameButton.setLayoutY(Tile_START_Y * 3.5);

        /*TextField textField = new TextField();
        Button testButton = new Button("Refresh");
        testButton.setOnAction(e -> {
                    testPlacement(textField.getText());
                }

        );
        HBox hBox = new HBox();
        hBox.setLayoutX(20);
        hBox.setLayoutY(700);
        hBox.getChildren().addAll(textField, testButton);*/



        controls.getChildren().addAll(label, roundLabel, specialLabel, playerLabel, nextRoundButton, newGameButton);

        initGrids();
        initSpecialTiles();
        makeSpecialTiles();

        makeBoard();
        rollDice();
        makeDiceTiles();
        round = 1;
        roundLabel.setText("Round: " + round);
        playerLabel.setText("Player: " + currentPlayer);
    }


    /**
     * Created by Tuo Liu
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {



        primaryStage.setTitle("StepsGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        // Add all groups to the root group
        root.getChildren().add(controls);
        root.getChildren().add(tiles);
        root.getChildren().add(board);
        root.getChildren().add(diceRolls);
        root.getChildren().add(specialTiles);

        makeControls();

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);


        //choose mode
        Group modeChoosingGroup = new Group();
        Scene modeChoosingScene = new Scene(modeChoosingGroup, 400, 150);

        Label label1 = new Label("Please choose game mode: ");
        label1.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,20));
        label1.setLayoutX(50);
        label1.setLayoutY(30);

        Stage modeChoosingWindow = new Stage();
        Button singleButton = new Button("Single player");
        singleButton.setOnAction(e -> {
            multiPlayer = false;
            primaryStage.show();
            modeChoosingWindow.close();
        });
        singleButton.setLayoutX(50);
        singleButton.setLayoutY(80);

        Button multiButton = new Button("Multi player");
        multiButton.setOnAction(e -> {
            multiPlayer = true;
            primaryStage.show();
            modeChoosingWindow.close();
        });
        multiButton.setLayoutX(155);
        multiButton.setLayoutY(80);

        Button pcButton = new Button("PVE");
        pcButton.setOnAction(e -> {
            multiPlayer = true;
            vsPC = true;
            primaryStage.show();
            modeChoosingWindow.close();
        });
        pcButton.setLayoutX(250);
        pcButton.setLayoutY(80);

        modeChoosingGroup.getChildren().addAll(label1, singleButton, multiButton, pcButton);
        modeChoosingWindow.setTitle("Mode Choosing");
        modeChoosingWindow.setScene(modeChoosingScene);
        modeChoosingWindow.setResizable(false);

        modeChoosingWindow.show();

    }
}
