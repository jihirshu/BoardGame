# Assignment Two Feedback

## Group  tue09c
## Group members: "u6843015","Qiao","Jingfen","","u6567008","Liu","Tuo","","u6811576","Narayan","Jihirshu"

## Tutor Comment

Simple, effective gui design, would be great if you indicate that the game alternates between human player and AI

Some tiles are really hard to grab given it's shape, it would allow a more smooth user experience if you could group a transparent
rectangle with the tile and allow a larger area for actuating dragging/rotating/flipping

I really like your sufficient comment at the beginning of each method

But for the generateMoves method in your board class, although what the function does is very obvious,
it's very hard to follow your logic through such a lengthy code block without inline comment.
ALso it seems that a signinficant portion of this methods is the same. With some code blocks differ only in the parameters
passed to methods, please consider leveraging the power of encapsulation to make you code more succinct
and expandable

It's great that you choose to design your own structure to represent board / tile

Overall, you guys have done a fantastic job finishing all the tasks! Best of luck with your final exams!



## Mark

**  9.75/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | /.25 |
||Authorship clear for all classes      | /.25 |
||Appropriate use of Git                | /.5  |
||Program runs from JAR                 | /.25 |
|P|Appropriate use of OO features       | /.5  |
|P|Presentation PDF complete            | /.5  |
|CR|Program well designed               | /.5  |
|CR|Comments clear and sufficient       | /.5  |
|CR|Coding style good                   | /.25 |
|CR|Appropriate use of JUnit tests      | /.5  |
|D|Design and code of very high quality | /.25 |
|D|Demonstrates interesting extensions  | -.25/.25 |
|D|Works well and easy to run           | /.25 |
|HD|Game is exceptional                 | -.5/.5  |

**Total for miscellaneous marks:**  4.5/5.25

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Tiles snap into place            | /.25 |
|CR|Tiles can be rotated and flipped | /.25 |
|CR|Only valid placements allowed    | /.25 |
|CR|Basic score at game end          | /.25 |
|D |Basic computer opponent          | /.25 |
|HD|Advanced computer opponent       | -.5/.5  |

**Total for manual marks:** 1.25/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|IsTilePlacementWellFormed|3/3|.5|
|3|IsBoardStringWellFormed|6/6|.5|
|5|AreConnectedNeighbours|5/5|.5|
|6|IsValidPlacementSequence|5/5|.5|
|7|GenerateDiceRoll|4/4|.25|
|8|GetBasicScore|4/4|.5|
|10|GenerateMove|5/5|.5|
|12|GetAdvancedScore|2/2|.5|

**Total for tests:** 4.00/4.0

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of adding rules description is from our group discussion

* The idea of creating two rules which are normal and smart are from our group discussion

* The idea of adding a message label is Jihirshu's idea

Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of creating a class to represent tiles is Tuo Liu's idea.

* The idea of adding multiplayer mode is from our group discussion.

* The idea of creating getPlacement method is from a discussion between group members.

* findHighwayNeighboursRecursively and findRailwayNeighboursRecursively function was optimised with an idea taken from Piazaa discussion thread.
   https://piazza.com/class/jsi5zea482b2h4?cid=791

Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
#### Originality statements E
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The code in class Viewer that make two players use the same tiles and play on different board is my own idea.
* The idea of how to test TileToString is from a discussion between me and my group members.

Signed: Tuo Liu (u6567008)
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work with the following exceptions :

* The idea of using Board Class came from team discussion and Assignment 1 Hex Class

* The code in class <Tile> is based on a solution from a group discussion.

* The code in class <Viewer> is based on JAVAFX.


Signed: Jihirshu Narayan (u6811576)

I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of Junit test "testInvalidStringGetBasicScore" discussed with my group members.

Signed: Jingfen Qiao (u6843015)

#### Originality statements D
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The code in class Viewer that places tiles on the board and achieve drag and drop function uses the ideas from assignment 1 codes.

Signed: Tuo Liu (u6567008)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

The idea of using Board Class came from team discussion and Assignment 1 Hex Class .

Signed: Jihirshu Narayan (u6811576)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of came from a discussion with group memeber

Signed: Jingfen Qiao (u6843015)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The code in class <Tile> is based on a solution from a group discussion.

* The code in class <Viewer> is based on JAVAFX.


Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using Board Class came from team discussion and Assignment 1 <Hex Class> (noted in source code comments)



Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
## Git Log
```
commit 57e2a4b64abae8f0bf456fe20b03bbdbe7efd101
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 24 11:22:05 2019 +1000

    Final Commit

commit 56ecabbf7e14cc459bc34583eb630a9dc6bf092c
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 24 10:42:50 2019 +1000

    Tests for class route added

commit a9fb4f435963f17dc6ee436fdf5ccd82713a5f35
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 24 03:19:00 2019 +1000

    Optimizing Code, documentation and updated G-best-6811576.

commit 4f9cda3c122cf1ad655bdb36ee58e6ceea58cd5c
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 24 03:06:18 2019 +1000

    Optimizing Code, documentation and updated G-best-6811576.

commit 76ce3ef2e10e4adeae6fa9ded385ec99e3cad493
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 24 02:52:24 2019 +1000

    Optimizing Code and documentation.

commit 6bebb97b312a6d57e5e38fbdcb74005de346e9eb
Merge: c1c16d3 dbfaa57
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 24 01:28:27 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit c1c16d337413c454e16a490df04178506568a1b8
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Fri May 24 01:27:39 2019 +1000

    Optimizing Code and documentation.

commit dbfaa571c2910d6c5adfb890ebc7e181acccc619
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Thu May 23 23:57:25 2019 +1000

    Added orginality H

commit a44af3920d95900c664265aeaa5274cb7aa265b6
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 23:40:17 2019 +1000

    Added presentation

commit 712f10cc654b6562c52cd915eba60ca3d43d3db2
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 21:00:10 2019 +1000

    Edited contribution!

commit f27dfcc329dd4c10d1ff2191a4a3175f676237f5
Merge: 70f3fce 91d9992
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu May 23 20:22:44 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 70f3fce4ece7977638c37eae6f0933265ca777d6
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Thu May 23 20:21:32 2019 +1000

    Optimizing Code.

commit 91d9992086fe1da943402a48a15d1e7639a530aa
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 19:35:34 2019 +1000

    Added checkIfMovePossibleTest

commit d75a4a26fe195902960fb6819562b48db382695c
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 19:02:26 2019 +1000

    deleted useless codes

commit 8e9b0c765227eda6aa8ca14acb1ad51db0b7600d
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Thu May 23 18:45:12 2019 +1000

    Completed the game!

commit 5d13a6aa000715efbb56a98a4a9437a1c3b5e5eb
Merge: ad34190 1b50266
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Thu May 23 18:39:24 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit ad341906a1d54edeebd71a5fb1d840b34cce25d1
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Thu May 23 18:39:15 2019 +1000

    Added message label!

commit 1b50266ebdb2edda08059fbfbf1e36444560b19a
Merge: 1c34831 676442f
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Thu May 23 18:31:31 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 1c3483188c6c69ab3759aaaed818af3f01f91f7b
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Thu May 23 18:31:18 2019 +1000

    Best code

commit 676442fbc9d1bd0d1d37ccc4322931886cfe3c7c
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 13:50:11 2019 +1000

    Added testVaildMove

commit 64e1a4287216df417ec5b1a5df763da1d1bc64f6
Merge: eb2aa8d 7f6a97c
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 13:47:15 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit eb2aa8d34e4c4867b0481aa202cd86f6c83b22af
Author: Troy <slunar@slunar.net>
Date:   Thu May 23 13:47:08 2019 +1000

    Added testVaildMove

commit 7f6a97c3a095261fd6c6aff32d5ccf50c28d0f35
Merge: 285a2fb f2888fd
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu May 23 13:45:08 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 285a2fb16ad7a5e615d5a4e936b5c22ed6cf6f46
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu May 23 13:44:51 2019 +1000

    Added function to board class which tells us if there is a valid move possible for the given boardString and diceroll

commit f75828385e37ac861d00637f647ea3f735487cea
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu May 23 13:24:37 2019 +1000

    Added function to board class which tells us if there is a valid move possible for the given boardString and diceroll

commit f2888fd9ade3466ff60f3f746c08f443ec78c367
Author: Troy <slunar@slunar.net>
Date:   Wed May 22 19:38:54 2019 +1000

    Added admin files!

commit 66c777c375aff13ee8422f202d6a86d154e8978d
Author: Troy <slunar@slunar.net>
Date:   Wed May 22 19:32:37 2019 +1000

    Added admin files!

commit 5a900c9c7ecc6dbf64094e89e90d3222ae201136
Author: Troy <slunar@slunar.net>
Date:   Wed May 22 19:14:03 2019 +1000

    Added rules description

commit b80d45390e7e3180abf30afbf16e687636ac644e
Author: Troy <slunar@slunar.net>
Date:   Wed May 22 18:54:59 2019 +1000

    Fixed computer thinking time

commit 802fc3ea581fc0f629fd82cbce03b69de3b7a652
Merge: 092df92 4b42189
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Wed May 22 18:52:19 2019 +1000

    Optimized computer opponent wth different possible move set size for each round

commit 4b42189829412955a8f15adc0b23697fa46c3953
Author: Troy <slunar@slunar.net>
Date:   Wed May 22 18:42:53 2019 +1000

    Fixed png files drag problem

commit 092df92d9100c2de15547b67200a73af1e25a1b1
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Wed May 22 18:41:55 2019 +1000

    Optimizing computer opponent with no restrictions

commit a40894c55ce602660f126bbb15f4741afb39280c
Author: Troy <slunar@slunar.net>
Date:   Mon May 20 17:09:03 2019 +1000

    Added rule selection function

commit 1b6da2d91abb75f5a5f61e6dbca104905e9deabc
Merge: 984ea70 7c8b829
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 20 16:22:19 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       game.jar

commit 984ea706d63182492bb9b3a69f0f62a78bdeb1a0
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 20 16:20:23 2019 +1000

    Optimizing computer opponent with no restrictions

commit 7c8b82988f7bfafaa1e9adbd4a6a8d7027ae0f91
Author: Troy <slunar@slunar.net>
Date:   Mon May 20 16:17:10 2019 +1000

    Added rule selection function

commit 69a23d19f99e8fec8f8db055be51266c7b24ec0d
Author: Troy <slunar@slunar.net>
Date:   Mon May 20 15:21:29 2019 +1000

    Fixed special tiles counts bug, deleted useless files.

commit 81ea0e88cdb4963102c6b08737aadd6c5c0ef1fc
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Sat May 18 20:13:00 2019 +1000

    advance score

commit a21133470a50b3e88816dd64620bc9e24226b442
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Sat May 18 17:29:59 2019 +1000

    advance score

commit 7212b1602afea867e86014fcb82513a70ef6803a
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Sat May 18 17:02:53 2019 +1000

    Achieved AI function!

commit 6167c5157d6b626f7b16d5886ac1240b97be29d3
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat May 18 16:11:53 2019 +1000

    Optimizing computer opponent.

commit 7f61bdd6943ca3b4efee398fc0925f1f2be27098
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat May 18 01:09:40 2019 +1000

    Optimizing computer opponent.

commit 8cecf350f22efe4797527596e305226aaf7aa0b2
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat May 18 00:24:56 2019 +1000

    Optimizing computer opponent.

commit 1d9bee204ef90df05e4481887c7201cc8e11128b
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat May 18 00:24:41 2019 +1000

    Optimizing computer opponent.

commit 3cfea52b5bb13f4021ad96d2bbfe361c4c4567dc
Author: Troy <slunar@slunar.net>
Date:   Fri May 17 23:21:45 2019 +1000

    Edited AI function

commit a57b03d3817bc8aa187d6a62ebf3360823a5c094
Merge: 0990331 e19cb45
Author: Troy <slunar@slunar.net>
Date:   Fri May 17 23:17:59 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 0990331d753bfe8f86805e9e68781d294ebf2d14
Author: Troy <slunar@slunar.net>
Date:   Fri May 17 23:17:33 2019 +1000

    Edited AI function

commit e19cb4530037d8376c85cbf88ddc439bd6e183ca
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 17 23:16:18 2019 +1000

    Optimizing generateMoves function

commit b6c698503079580034abc18e6def3e620db2868b
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 17 22:31:28 2019 +1000

    Optimizing generateMoves function

commit 32998c9a0133990cd78f059fa4ef84dd88bb5a9a
Merge: 5ec5db7 b64f92e
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 17 21:37:53 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 5ec5db76ab66607a7a620884065baf685488a35f
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 17 21:35:43 2019 +1000

    Optimizing generateMoves function

commit b64f92ef5b07756f642aff22c9443f516d0bda2c
Author: Troy <slunar@slunar.net>
Date:   Fri May 17 21:33:59 2019 +1000

    Edited AI function

commit cbc09807b412ddb1e1deab671358a9fef0595720
Merge: ae1cecc c12eed9
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Wed May 15 21:09:12 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit ae1cecc08e54028a6e03d2b1158540509db49d22
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Wed May 15 21:09:06 2019 +1000

    Optimizing generateMoves function

commit c12eed994f258dcc77b8c0ae85f7b239854d7f86
Merge: 5315b86 ea4a0b3
Author: Troy <u6567008@anu.edu.au>
Date:   Wed May 15 21:06:01 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 5315b86ce674398c1994036d9b5b8f2101d49e18
Author: Troy <u6567008@anu.edu.au>
Date:   Wed May 15 21:05:01 2019 +1000

    added test

commit ea4a0b36c5381e0496955e530cda1566c94af915
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Wed May 15 16:55:23 2019 +1000

    Optimizing generateMoves function.

commit bdc3f4a770369c8e819c50dfaba592e4be6ec65d
Merge: c3abfce 6323b6a
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Wed May 15 16:08:24 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit c3abfce22b57e11afbb54c710efa16a1f3845177
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Wed May 15 16:07:26 2019 +1000

    Optimizing generateMoves function

commit 6323b6a01799ef1e40fd4a4e474059fdcb7cf480
Merge: 9b0669c 1756808
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Tue May 14 10:52:12 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 9b0669c1628911cb93d6c926ebfef58814c34cb5
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Tue May 14 10:51:47 2019 +1000

    Documentation about gameOver method

commit 175680893e591eb8423e91ad5b1468dd22ef9f21
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue May 14 03:43:39 2019 +1000

    Further Authorship and Documentation : Jihirshu Narayan.

commit 1e51ae7cadd0f51514a9fe564f746994f167f41b
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue May 14 01:35:14 2019 +1000

    Additional j unit tests created.

commit 2c2411546e4d565d3d53093c77f5a815154d93aa
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue May 14 01:34:14 2019 +1000

    Additional j unit tests created.

commit 3c358c66db8eea6c37e5f5fdb05692401609d6eb
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue May 14 01:00:11 2019 +1000

    F-Originality statement updated.

commit 58cf0006a7c7a9d0feb871d8bcc59b16f7bf25d2
Merge: ed5a65d dc2f64a
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 13 20:33:40 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit ed5a65d7af61f3c8efccf62ee9e2f14f49bd4758
Merge: 5d7717d 09c9cdc
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 13 20:28:24 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit dc2f64ab87a819b2fb81a358332e7559156d9e4b
Merge: 6f5eb31 09c9cdc
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 13 16:47:18 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 6f5eb3187cc29ea04a7db7904b7a3c4684f910ca
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 13 16:47:07 2019 +1000

    Jingfen's review

commit 09c9cdcd770b577f4ef6d00ff16ea1ccc338392b
Merge: 962e696 c0d362e
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:46:11 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 962e6965501266dfffa3babc1c3745fa27f242ae
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:43:14 2019 +1000

    Completed Code Review Task. Reviewd Tuo Liu's code in Viewer.java.

commit c0d362e3a3187405ce1634b7f5bf57929dca0688
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 16:38:04 2019 +1000

    Edited contribution and originality

commit e1e08aafecab5c5a97bcdcd9ca5e10512a287db2
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 16:37:58 2019 +1000

    Edited contribution and originality

commit 1c4d3adb376e9208dd6aef2b90af8f495449d686
Merge: 020297f 121a222
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 16:32:11 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 020297fff5c02bfc8759b80c3e75312a8bec7625
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 16:32:04 2019 +1000

    Reviewed codes for Jingfen Qiao

commit 19271bc6196981247ed8877ee0b5a14d1a811df0
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:19:11 2019 +1000

    Documentation and Authorship work in progress.

commit 121a222870b54b7ce17a88b6c079c4b671b28637
Merge: 1842109 200d021
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:12:54 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 1842109530e86a5ec061f7ed457e95129af302c4
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:12:44 2019 +1000

    Documentation and Authorship work in progress.

commit 200d0219f313d7a858b6a5349230521abf1809c8
Merge: 3f5d5dd c034c25
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 16:11:44 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Viewer.java

commit 3f5d5dd76b707ab21868ac8d75796bb70ff2242f
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 16:11:10 2019 +1000

    Added authorship

commit c034c25c5dd34b46db8be0e3fdb146798a1ae646
Merge: 06cfad1 27f7750
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 13 16:04:51 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 27f7750e9fdca4ebf20eb0c7aead0621526a625a
Merge: d381a6e 93986a9
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:04:14 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 06cfad1ac780369ae7b12418f75961bcc0cc2bfa
Merge: e7b480d 93986a9
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 13 16:04:11 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit e7b480d3bc74149314802512738cba4259989eb2
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 13 16:03:56 2019 +1000

    Changes

commit d381a6e14e09e768b588f291b329a2f78eb3e253
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 13 16:01:08 2019 +1000

    Documentation and Authorship work in progress.

commit 93986a9d86e976c44e0a196fc78ae06c0d93d7c0
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 15:14:18 2019 +1000

    Created game.jar

commit d056a1dec710713f211578e95c22f961b48993ed
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 15:13:54 2019 +1000

    Created game.jar

commit fa3aa73b99fd0592efa20d42d5099f5c744a1223
Author: Troy <slunar@slunar.net>
Date:   Mon May 13 15:00:57 2019 +1000

    Deleted test part.

commit d221550741c4a106310d2536c9703d98494b087e
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Fri May 10 21:37:30 2019 +1000

    Task #12 Completed.

commit b9ea298c438406017225627c351200e1778593bc
Merge: 3326ec1 e354965
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri May 10 15:07:48 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 3326ec193981757ede8ed2b218052fa1a8eefdc4
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Fri May 10 15:07:33 2019 +1000

    Working on task 12.

commit e3549650aff2a857877e6f18fc17372b8d377413
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Fri May 10 15:05:22 2019 +1000

    Added testPlacement

commit 41c68351ea80dc5a189c11db49ba1250f60d99d6
Merge: 7df843b 5b32c3d
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Fri May 10 14:58:29 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Viewer.java

commit 7df843b9354930df05455e6ba1fbad02f1edb4bb
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Fri May 10 14:54:21 2019 +1000

    Added testPlacement

commit 5b32c3d8cc567fe219b8b2ac981aaa87a4195c5f
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu May 9 13:58:46 2019 +1000

    Task 6 updated. isValidPlacemenetSequence will return false if it finds two tiles in the same location.

commit 0501a0040afa8ee98b01ec3cb56cfd8a6fd64645
Merge: 81970d1 5cc4487
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu May 9 13:51:46 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 5d7717d689b3402a5e3f7ad8dbcf3b85c6c800ae
Merge: 81970d1 5cc4487
Author: Troy <u6567008@anu.edu.au>
Date:   Thu May 9 09:28:33 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 5cc448733278de86218c9944959e10b73d690ea9
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu May 9 00:26:38 2019 +1000

    fix chi-squared test values

commit 83638167f37ebcc8b4ba7857a67b38c1857f9d47
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Wed May 8 09:51:54 2019 +1000

    improve GenerateDiceRollTest to be statistically more rigorous
    
    added more tests for invalid placements due to duplicates

commit f6998e646dc7b8d48abb21808d8c2acdf7141aae
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Wed May 8 08:19:25 2019 +1000

    isValidPlacementSequenceTest: fix and add test for invalid connection
    
    add test for duplicate placements

commit 81970d180b043b0bd8473120f26711ee6e88cd76
Merge: a9daa1b e1caa44
Author: Troy <slunar@slunar.net>
Date:   Tue May 7 16:00:01 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit a9daa1bb1d9622c57a5595e115a76db1ad5dea0d
Author: Troy <slunar@slunar.net>
Date:   Tue May 7 15:59:54 2019 +1000

    Added author information.

commit e1caa44946676a69e4c8369737ced70e41735910
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Tue May 7 08:10:09 2019 +1000

    updated test samples!

commit c52dcd299fcc90b5fee1a53f40febf29012d8184
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue May 7 00:11:04 2019 +1000

    Updated Originality statement for D2E.

commit 751d581b21f4ae528d5df3108062d0471be2b616
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Mon May 6 23:18:41 2019 +1000

    Updated Originality statement for D2E.

commit 7ca5ec74aaa229a9094ede2dfbe4ba9d37c87add
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 18:43:05 2019 +1000

    Changes with game over

commit ab5e979fee6e63ee3979336b793137ee369087b4
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 18:10:38 2019 +1000

    Changes with game over

commit b9aaa10840ee23c0e4ee9a01a035a75ea65db03a
Merge: be36b13 8a1eaf6
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 18:08:40 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit be36b137a4b77eaec269ea697b675d7ce225a268
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 18:08:25 2019 +1000

    Jingfen's originality

commit 8a1eaf6fb9a2f05223f7f1126c2066fa24e82a6b
Merge: bfcc862 2eb2680
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 6 18:06:24 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit bfcc862d46da3ffa1efd9881ff3dfd75d2be94c8
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 6 18:06:04 2019 +1000

    Fixed some bugs!

commit 2eb26806caf658cda33c0391eca513d5eb460742
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 17:56:04 2019 +1000

    Change with the Game over method

commit 4ff8f17025639d705f544f076c20939aa0ff7486
Merge: 4ec9cd8 56b546c
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 17:50:37 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 4ec9cd827797d7fafbb0c9034f1ffd6b3b3d899f
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 17:50:27 2019 +1000

    Change with the Game over method

commit 56b546c8766f4931a8b383d9a460c8678210ca25
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Mon May 6 17:26:17 2019 +1000

    Fixed the grid can be placed many times bug.

commit 95d6cbee9d4947af6b6a4f39d3fe58854226c7ae
Merge: 10604fa 88fd47a
Author: Troy <slunar@slunar.net>
Date:   Mon May 6 16:24:10 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 10604fa9244be2a865c17fc90537eaa30a0c11d3
Author: Troy <slunar@slunar.net>
Date:   Mon May 6 16:23:53 2019 +1000

    Updated originality, made game availiable for two players, add test.

commit 3cc63217d763751f4810209fb3f310c3420bbb90
Merge: 6f95245 88fd47a
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 15:58:02 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 88fd47a95a39b3cabfd1d1b5ee533ede586cd6a0
Merge: 17024f6 57ed3f1
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 6 15:57:51 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 17024f62d1d1ae6c976a57d9e20a1e5ae2d2d549
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 6 15:57:31 2019 +1000

    changed score for invalid string to -9999

commit 6f952450a30b71508939dc0aae27153b812f255c
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 15:57:19 2019 +1000

    Junit test added

commit 57ed3f174806d39cadf4218692370291f67531e7
Merge: 91de1cb 9cc9be8
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 15:49:19 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit 91de1cbcc1cb4e9b045431d47489b1ba2370bd31
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Mon May 6 15:49:09 2019 +1000

    Junit test added

commit 9cc9be8df048048d86d3b270b5feb0c066cea210
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Mon May 6 15:42:27 2019 +1000

    getBasicScore returns 0 for empty string.

commit 40adc7b1082414732c3023e19b93c57fe10dbb4d
Merge: ea40bd9 c589e74
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon May 6 15:13:36 2019 +1000

    Merge remote-tracking branch 'origin/master'

commit ea40bd99cad74165035fa1e230b0aebcc4509206
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Mon May 6 15:13:20 2019 +1000

    Function getBasicScore updated to return -1 for invalid board string.

commit c589e7410f75505c4952194c137287fc1968e355
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 6 10:53:44 2019 +1000

    Edited initSpecialTiles method!

commit 20f94fc800715ea7183ddbd6f90ebc0fd31459b0
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon May 6 10:50:23 2019 +1000

    remove unused code

commit b953060a4dd8bf37489323395d6cff489c72ced8
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon May 6 10:49:17 2019 +1000

    fix GenerateDiceRollTest.testDieFaces to correctly count dice rolls

commit ddab6563ecc0840c3024f20b7e55c54fe91fccb4
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 6 10:47:13 2019 +1000

    Edited makeSpecialTiles method!

commit 3ab9bd414538d0816bf3a2c3c36d5d9e6e2cd962
Merge: 0708d4d d1e151f
Author: Troy <u6567008@anu.edu.au>
Date:   Mon May 6 10:40:50 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit d1e151ff6c5afb809608b9ac3bbfcde8201f724f
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Sun May 5 23:23:30 2019 +1000

    Made the game available for multi players!

commit 418687e599a9151ae7119971126a1c343e38a327
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Sun May 5 23:21:54 2019 +1000

    Made the game available for multi players!

commit 4951905702df9ace1e7811c9fd070534ff90a4d1
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Sun May 5 00:14:44 2019 +1000

    Test added to ensure that the move generated by function generateMove does not decrease player's current basic score.

commit 6a4dd2bd49f04bf8ed1c03ca800027981ed3fbce
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Apr 30 08:49:37 2019 +1000

    Originality updated.

commit e1bb14e904be7ac14e18870fd79982315842f886
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Apr 30 08:48:47 2019 +1000

    Originality D u6811576 created.

commit 2f1dd3e424b0f571c1ce3269205eb0eb193da396
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Apr 30 08:45:27 2019 +1000

    Originality D u6811576 created.

commit da3affac9ecaf7ab7492dab703c1f5f42c9951aa
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Tue Apr 30 08:34:24 2019 +1000

    Updated setOrientation Method!

commit 80f7997b5c3bd32abd32c96d1eca1e8d2dc065bd
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Sat Apr 27 00:13:13 2019 +1000

    Updated originality.

commit 4705a71262b0101ed3c8aea8cb2400782483b02b
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Sat Apr 27 00:01:33 2019 +1000

    Updated originality

commit 97ca009ed558db32d7715ec8a57d07593a0c1745
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Sat Apr 27 00:00:05 2019 +1000

    Jingfen originality

commit 3b9a48f10fc0d5f92bb6ae85a5bbd31c17d6911e
Merge: 4340368 b24a700
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Fri Apr 26 22:51:35 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit b24a700a0e88f946ae484719fcdc797d6c464cfe
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri Apr 26 22:50:23 2019 +1000

    Scroll direction defined. Stop rotating when tile is placed.

commit 4340368568ee250aa7a98b16c775df2446f4a09f
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Fri Apr 26 22:49:43 2019 +1000

    Game over method

commit 0708d4debc7a04c846022f31a8bf21399b1fd7ba
Merge: 98676a3 141cf9d
Author: Troy <u6567008@anu.edu.au>
Date:   Mon Apr 22 21:27:10 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 141cf9dbf89109796c86f89ca437bdb841a1ec62
Merge: 7d40859 c2f319d
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon Apr 22 21:06:28 2019 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Viewer.java

commit 7d408592e90f7c6e6bd2d09b49fc4689a4af1cc1
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon Apr 22 21:03:46 2019 +1000

    Scroll direction defined.

commit c2f319d6eda1b2e81694deabef2aec4bc28869b3
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Mon Apr 22 20:26:49 2019 +1000

    Almost finish task 9

commit 401e853b6190331246de8387674be12829c02336
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Mon Apr 22 19:36:54 2019 +1000

    Achieved drag and drop function!

commit 862c2b5ad7ff171ad2ba17a4e61dd011697451fe
Author: Troy <slunar@slunar.net>
Date:   Mon Apr 22 09:54:00 2019 +1000

    Updated TileImage Class

commit 98676a3cefbbb0e12042c5f94ee3ba523fe743ed
Merge: 2954001 955f191
Author: Troy <u6567008@anu.edu.au>
Date:   Mon Apr 22 01:18:24 2019 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 955f191fbc44f90854020a898aed09fd2ae58984
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Mon Apr 22 00:43:35 2019 +1000

    Mouse scroll!

commit 6c66b31839a483467b15fe2c35b7ee54b83bb8a9
Author: Troy <slunar@slunar.net>
Date:   Sun Apr 21 20:41:07 2019 +1000

    Updated board

commit fcfb2608ffa6a16cb9b664fbeca326b0470f5f99
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Sun Apr 21 16:22:15 2019 +1000

    Added Exits on Board!

commit c52535cd1be9c4e493ff122e865ebd7343f9b623
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sun Apr 21 06:16:33 2019 +1000

    Task #10 Completed.

commit 94c3ea31cd2fd8b1c1c1a7ff00e4876f82d3b1fa
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue Apr 16 00:37:15 2019 +1000

    Task #10 Completed.

commit a82b4061ea6547b93edb25b67cefe710fbe69af1
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Thu Apr 11 23:53:56 2019 +1000

    Task #7 and Task #8 completed.

commit b0f2d8ab0df537a2c07b3c0fa57aa0671661672d
Merge: 2ba9277 42847d6
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue Apr 2 21:46:54 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 42847d605d00b4524d6d008c73b0f8db551c626a
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Tue Apr 2 21:46:20 2019 +1100

    Updated task 4! Fixed flip function.

commit 2ba927733b7cc6939a99a37b3b3d0f26725dd867
Merge: 74269c7 58f5c06
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Tue Apr 2 21:36:07 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 58f5c067491360368109866ded1ec738d731dc84
Merge: 47af7ef cd75304
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Tue Apr 2 09:49:48 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit 47af7efa7b4a3e2cd846a8fd58b71a9965d3d5d7
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Tue Apr 2 09:49:38 2019 +1100

    Updated task 4.

commit cd75304bdc6a3e0d6a1f06aae24675b7138fe02c
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Apr 2 09:21:03 2019 +1100

    Contribution C updated

commit 9cee2b5b00726f2f206ecd616012ddcc36018c90
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 2 09:12:01 2019 +1100

    AreConnectedNeighboursTest: more tests for mirror-asymmetric tiles

commit 4dc6c23cb9552cfb279f276c42d45b3bf86dad65
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Tue Apr 2 08:45:31 2019 +1100

    Updated Contribution and Originality of stage C

commit 74269c728073b5e7b292c6d984b4f8821f0458ec
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon Apr 1 15:34:15 2019 +1100

    Updates in class Tile.

commit 0bbfde5341e13f51caf818ceff7dd23bb27c8e72
Author: Troy <slunar@slunar.net>
Date:   Mon Apr 1 11:11:46 2019 +1100

    Updated task 2!

commit f9d12655bdb68ed2a2a5127283a643ef82bc7593
Merge: f628461 7e808ac
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon Apr 1 01:55:19 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit 295400171db40a4982b26b5734ea2e882620d608
Merge: 909cd90 7e808ac
Author: Troy <u6567008@anu.edu.au>
Date:   Mon Apr 1 01:54:18 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 7e808ac23181b29d9fda8cac4bcfd38b1665a567
Author: Troy <slunar@slunar.net>
Date:   Mon Apr 1 01:50:37 2019 +1100

    Done with task 4!

commit f628461e775eb780cc54aa687b6ec8483252aabe
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Mon Apr 1 01:42:00 2019 +1100

    Task #6 Completed.

commit 2e02c6c69daaac7e28d02fd56a37ad09c0861a83
Merge: 3777608 c31ba1e
Author: Troy Liu <u6567008@anu.edu.au>
Date:   Sun Mar 31 20:26:37 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit c31ba1ef10ecf073353dddfbfd2bb72343c6c495
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 31 08:54:35 2019 +1100

    T10 GenerateMoveTest

commit 5a0302f1af1a21b7302a7be2b7061203f7531b48
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sat Mar 30 22:39:34 2019 +1100

    T8 GetBasicScoreTest, T12 GetAdvancedScoreTest

commit 909cd906392479b93a4518f27dde1a3bf7ce38a7
Merge: 9dae358 3777608
Author: Troy <u6567008@anu.edu.au>
Date:   Sat Mar 30 18:13:33 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit d61559a8eace9eb0de8948899ccf1a333a7a43eb
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sat Mar 30 14:39:59 2019 +1100

    test more types of invalid piece placements

commit 3777608df25209cf788bf758738d94518c1dcd94
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat Mar 30 12:41:45 2019 +1100

    Working on task #6 in master branch.

commit 040888eacbe67a218b3f75e45461bfe775019847
Merge: a30be95 1de5f2d
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat Mar 30 12:19:01 2019 +1100

    merge with master

commit a30be95a1ee736db105985e05ac15cbeb20f5962
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat Mar 30 11:57:48 2019 +1100

    Working on task #6 on my own branch.

commit 6a6a7b02e4d940bed881c7773cd23fe4217a73f7
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Fri Mar 29 12:08:06 2019 +1100

    Completed task #5 in my own branch.

commit 1de5f2dff08203ec95fa35e985c9098cdd4eb926
Author: Cindy <u6843015@anu.edu.au>
Date:   Tue Mar 26 10:09:51 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 7d2bb0012780c4196832df4915b2fd12fc1b1111
Merge: eb6db84 2ca1973
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Tue Mar 26 10:08:00 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit eb6db84bee9b7c98f19f0cb604f6816b878dda4a
Merge: 39d2480 395462d
Author: jingfenqiao <u6843015@anu.edu.au>
Date:   Tue Mar 26 10:07:38 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 2ca1973b7c19a14915978c87209c2f5ab12c1c23
Merge: 8b7c8b0 395462d
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Mar 26 10:03:58 2019 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 39d2480bb8018c4bc779f8c7304495803972449f
Author: Cindy <u6843015@anu.edu.au>
Date:   Tue Mar 26 10:02:09 2019 +1100

    Edited the main

commit 8b7c8b0ff51c0dad6cdeaaf24aee62d51ac32cb7
Author: Bob <u6811576@anu.edu.au>
Date:   Tue Mar 26 09:59:41 2019 +1100

    Main function edited.

commit 395462d71952bcba49a09e19d2995111fc2f801b
Author: Alice <u6567008@anu.edu.au>
Date:   Tue Mar 26 09:58:42 2019 +1100

    Added a line to Main method.

commit 5e32f22759d3785e27d6c443a83f40e1315e4933
Author: Bob <u6811576@anu.edu.au>
Date:   Tue Mar 26 09:46:46 2019 +1100

    ToString function added

commit 18826b91b83ec042cd538991a151bee0f3ec10c7
Merge: d81a42c c7b5160
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Mar 26 09:44:16 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit c7b5160f67dc22ac8716782825cf05b4e5e547b9
Author: Jingfen Qiao <u6843015@anu.edu.au>
Date:   Tue Mar 26 09:42:44 2019 +1100

    Done with class C

commit d81a42cb6614b30d4f53e42a5a3a9d91dfb73d10
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Mar 26 09:26:26 2019 +1100

    Class B created.

commit 8f8a55dfb5dd32c0bf5c53af239a830c7df35ba0
Merge: fc4538f c59aaad
Author: u6567008 <tuo.liu@anu.edu.au>
Date:   Tue Mar 26 09:24:49 2019 +1100

    Merge remote-tracking branch 'origin/master'

commit fc4538f5be6b22f8269b3a4e39a8dafdb7fd3047
Author: Alice <u6567008@anu.edu.au>
Date:   Tue Mar 26 09:24:41 2019 +1100

    Done with Alice's work!

commit c59aaadd5e0452453164c15c52a21809061aec3b
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Mar 26 09:17:07 2019 +1100

    Update B-originality.md

commit fdbffddaa4c7f68736d94b626aca43070c0901b5
Merge: b54dcd1 87f0a67
Author: Jihirshu Narayan <jihirshu.narayan@anu.edu.au>
Date:   Tue Mar 26 09:11:13 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 9dae358cce85a62e5e4cce11ba1faaa2e7cad3ac
Merge: 0ac1cc2 b54dcd1
Author: Troy <u6567008@anu.edu.au>
Date:   Sun Mar 24 13:29:37 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit b54dcd1d3fb6d07be392d725e424b614a1859395
Author: jihirshu <jihirshu.narayan@gmail.com>
Date:   Sat Mar 23 16:01:21 2019 +1100

    Finished with general class and method outline. B - Originality and B - Contribution updated as well.

commit 0ac1cc2d7755381843d17d7930d64e2fd2d453c3
Merge: cc05272 87f0a67
Author: Troy <u6567008@anu.edu.au>
Date:   Fri Mar 22 19:08:46 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit cc0527288d0c55c6b16f2d327f57fcc6097ff709
Merge: 18759bc 6bb993c
Author: Troy <u6567008@anu.edu.au>
Date:   Fri Mar 22 19:08:30 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6843015/comp1110-ass2-tue09c

commit 87f0a67a1ea2b01ea570f9cbe66f23eacfe13a1c
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Fri Mar 22 16:57:27 2019 +1100

    fix off-by-one errors in Javadoc spec

commit 6bb993c8abc789ca79ab1b6fbc60685908f57a0c
Author: Troy <slunar@slunar.net>
Date:   Fri Mar 22 12:19:27 2019 +1100

    Finished task 2 and 3!

commit 538c6231c152f405f62849874e28567aadf6f115
Merge: dfdcb39 6899cf1
Author: Troy <slunar@slunar.net>
Date:   Fri Mar 22 11:16:56 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 18759bc4ec13eac45a939893e6d0f67ecfa59cb1
Merge: dfdcb39 6899cf1
Author: Troy <u6567008@anu.edu.au>
Date:   Thu Mar 21 23:06:25 2019 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 6899cf1bfb33883edba7d29b261aa2e63950d6be
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Mar 21 21:40:31 2019 +1100

    fix specification for dice roll - B can only roll 0-2
    
    fix IsTilePlacementWellFormedTest and GenerateDiceRollTest accordingly

commit dfdcb3938b54ba5cc4addaa500db97fca1769008
Author: Troy Liu <tuo.liu@anu.edu.au>
Date:   Wed Mar 20 22:45:08 2019 +1100

    Delete group_information

commit 1d43b1a88a70b92e8814afde51176a43a68acd1d
Author: Troy <u6567008@anu.edu.au>
Date:   Wed Mar 20 22:44:29 2019 +1100

    Updated ccontact info

commit f91a07f415d2b01c2edb9226dfe888012db6bfeb
Author: Jingfen Qiao <jingfen.qiao@anu.edu.au>
Date:   Tue Mar 19 09:29:55 2019 +1100

    Group Information recorded

commit 984e9fef1b9f26e2d4f38cf136ad5e85b4a9a6cd
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 19 02:08:41 2019 +1100

    assignment published
```
## Changes
``` diff
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2019-05-24 13:59:03.704392235 +1000
+++ comp1110-ass2/admin/B-contribution.md	2019-05-24 14:12:20.513108211 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6811576 33.33
+* u6567008 33.33
+* u6843015 33.33
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2019-05-24 13:59:03.724392356 +1000
+++ comp1110-ass2/admin/B-originality.md	2019-05-24 14:12:20.537108352 +1000
@@ -1,9 +1,7 @@
 We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of using Board Class came from team discussion and Assignment 1 <Hex Class> (noted in source code comments)
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
 
-*  ....
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2019-05-24 13:59:03.740392452 +1000
+++ comp1110-ass2/admin/C-contribution.md	2019-05-24 14:12:20.549108423 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6811576 33.33
+* u6567008 33.33
+* u6843015 33.33
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2019-05-24 13:59:03.768392620 +1000
+++ comp1110-ass2/admin/C-originality.md	2019-05-24 14:12:20.565108516 +1000
@@ -1,9 +1,8 @@
 We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The code in class <Tile> is based on a solution from a group discussion.
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The code in class <Viewer> is based on JAVAFX.
 
-*  ....
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.md
Only in comp1110-ass2/admin: D-originality-u6567008.md
Only in comp1110-ass2/admin: D-originality-u6811576.md
Only in comp1110-ass2/admin: D-originality-u6843015.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.md
Only in comp1110-ass2/admin: E-originality-u6567008.md
Only in comp1110-ass2/admin: E-originality-u6811576.md
Only in comp1110-ass2/admin: E-originality-u6843015.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2019-05-24 13:59:03.852393125 +1000
+++ comp1110-ass2/admin/F-contribution.md	2019-05-24 14:12:20.669109126 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* u6567008 33.33
+* u6811576 33.33
+* u6843015 33.33
 
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2019-05-24 13:59:03.884393317 +1000
+++ comp1110-ass2/admin/F-originality.md	2019-05-24 14:12:20.689109243 +1000
@@ -1,9 +1,12 @@
 We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of creating a class to represent tiles is Tuo Liu's idea.
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The idea of adding multiplayer mode is from our group discussion.
 
-* ....
+* The idea of creating getPlacement method is from a discussion between group members.
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* findHighwayNeighboursRecursively and findRailwayNeighboursRecursively function was optimised with an idea taken from Piazaa discussion thread.
+   https://piazza.com/class/jsi5zea482b2h4?cid=791
+
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
\ No newline at end of file
Only in ../master/comp1110-ass2/admin: F-review-u1234567.md
Only in comp1110-ass2/admin: F-review-u6567008.md
Only in comp1110-ass2/admin: F-review-u6811576.md
Only in comp1110-ass2/admin: F-review-u6843015.md
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u6567008.md
Only in comp1110-ass2/admin: G-best-u6811576.md
Only in comp1110-ass2/admin: G-best-u6843015.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2019-05-24 13:59:04.000394015 +1000
+++ comp1110-ass2/admin/G-contribution.md	2019-05-24 14:12:20.857110228 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* u6811576 37
+* u6567008 33
+* u6843015 30
 
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2019-05-24 13:59:04.028394183 +1000
+++ comp1110-ass2/admin/G-features.md	2019-05-24 14:12:20.877110346 +1000
@@ -1,13 +1,15 @@
 In addition to the features that are auto-graded, the graphical user interface
 of our project implements the following features:
 
-*(Remove those that are unimplemented)*
 
  - A simple placement viewer (Task 4)
  - A basic playable game
  - A basic playable game that snaps pieces to the board and checks for validity (Task 7)
  - Generates basic starting piece placements (Task 8)
- - Implements hints (Task 10)
- - Implements interesting starting placements (Task 11)
+ - Implemented hints (Task 10)
+ - Implemented interesting starting placements (Task 11)
+ - Implemented multiplayer mode where two human players can play the game
+ - Implemented Player vs Environment mode where the computer opponent takes place of player 2
+ - Implemented the game in 2 modes - normal and smart. In normal mode it is compulsory for players to use all 4 tiles if possible. In smart mode there is no such restriction.
+ 
 
-additional features...
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2019-05-24 13:59:04.048394304 +1000
+++ comp1110-ass2/admin/G-originality.md	2019-05-24 14:12:20.893110440 +1000
@@ -1,9 +1,9 @@
 We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of adding rules description is from our group discussion
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The idea of creating two rules which are normal and smart are from our group discussion
 
-* ....
+* The idea of adding a message label is Jihirshu's idea
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
\ No newline at end of file
Only in comp1110-ass2/admin: group_information
diff -ru -x .git ../master/comp1110-ass2/admin/H-contribution.md comp1110-ass2/admin/H-contribution.md
--- ../master/comp1110-ass2/admin/H-contribution.md	2019-05-24 13:59:04.068394424 +1000
+++ comp1110-ass2/admin/H-contribution.md	2019-05-24 14:12:20.917110580 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage H was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* u6811576 33.33
+* u6567008 33.33
+* u6843015 33.33
 
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/H-originality.md comp1110-ass2/admin/H-originality.md
--- ../master/comp1110-ass2/admin/H-originality.md	2019-05-24 13:59:04.096394593 +1000
+++ comp1110-ass2/admin/H-originality.md	2019-05-24 14:12:20.937110698 +1000
@@ -1,10 +1,5 @@
 We declare that the work we have submitted for Stage H of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
-
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* The idea of how to make the presentation was from our group discussion
 
+Signed: Jihirshu Narayan (u6811576), Jingfen Qiao (u6843015), and Tuo Liu (u6567008)
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2/.idea: artifacts
Only in comp1110-ass2: META-INF
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2/src/comp1110/ass2: Board.class
Only in comp1110-ass2/src/comp1110/ass2: Board.java
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A3.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A3.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A4.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A4.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/A5.png and comp1110-ass2/src/comp1110/ass2/gui/assets/A5.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/B0.png and comp1110-ass2/src/comp1110/ass2/gui/assets/B0.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/B1.png and comp1110-ass2/src/comp1110/ass2/gui/assets/B1.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/B2.png and comp1110-ass2/src/comp1110/ass2/gui/assets/B2.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S0.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S0.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S1.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S1.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S2.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S2.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S4.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S4.png differ
Binary files ../master/comp1110-ass2/src/comp1110/ass2/gui/assets/S5.png and comp1110-ass2/src/comp1110/ass2/gui/assets/S5.png differ
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: WOW.png
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$Grid.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2019-05-24 13:59:04.616397720 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2019-05-24 14:12:23.477125587 +1000
@@ -1,14 +1,28 @@
 package comp1110.ass2.gui;
 
+import comp1110.ass2.Board;
 import javafx.application.Application;
+import javafx.collections.FXCollections;
 import javafx.scene.Group;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
+import javafx.scene.control.ChoiceBox;
 import javafx.scene.control.Label;
-import javafx.scene.control.TextField;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Line;
+import javafx.scene.text.Font;
+import javafx.scene.text.FontPosture;
+import javafx.scene.text.FontWeight;
 import javafx.stage.Stage;
 
+import java.util.ArrayList;
+import java.util.List;
+
+import static comp1110.ass2.RailroadInk.*;
+
 /**
  * A very simple viewer for tile placements in the Railroad Ink game.
  * <p>
@@ -17,54 +31,967 @@
  */
 public class Viewer extends Application {
     /* board layout */
-    private static final int VIEWER_WIDTH = 1024;
-    private static final int VIEWER_HEIGHT = 768;
 
-    private static final String URI_BASE = "assets/";
+    /**
+     * Created by Tuo Liu
+     */
+    private static final int VIEWER_WIDTH = 1024; // The width of the viewer
+    private static final int VIEWER_HEIGHT = 768; // The height of the viewer
+    private static final double Tile_WIDTH = 70.0; // The width of the tile
+    private static final double Tile_START_X = VIEWER_WIDTH / 10 * 2; // The start coordinate of the board
+    private static final double Tile_START_Y = 60;
+    private int specialCount1 = 0; // Total special tile used for player 1
+    private int specialCount2 = 0; // Total special tile used for player 2
+    private int round = 0; // Current round
+    private int tilesLeft = 0; // The number of how many tiles left
+    private boolean roundSpecialUsed = false; // If the special tile has been used on current round
+    private boolean gameOver = false; // If the game is over
+    private boolean multiPlayer = false; // If the game is multiplayer mode
+    private boolean vsPC = false;
+    private boolean smartGame = false;
+    private int currentPlayer = 1; // The current player
+    private static final String URI_BASE = "assets/"; // The URI base of image resources
+
+    /**
+     * Created by Tuo Liu
+     * Six different groups
+     */
+    private final Group root = new Group(); // The root group of the window
+    private final Group tiles = new Group(); // The group of all tiles on the board
+    private final Group board = new Group(); // The group of board
+    private final Group controls = new Group(); // The group of all controls like buttons
+    private final Group diceRolls = new Group(); // The group of four tiles generated by dice
+    private final Group specialTiles = new Group(); // The group of special tiles
+
+    private Label msgLabel = new Label("");
+
+    /**
+     * Created by Tuo Liu
+     * To convert the row numbers 1 - 7 to chars 'A' to 'G'
+     * @param row
+     * @return
+     */
+    private String rowtoString(int row) {
+        String value = "";
+        switch (row) {
+            case 0: value = "A"; break;
+            case 1: value =  "B"; break;
+            case 2: value =  "C"; break;
+            case 3: value =  "D"; break;
+            case 4: value =  "E"; break;
+            case 5: value =  "F"; break;
+            case 6: value =  "G"; break;
+        }
+        return value;
+    }
+
+
+    public static void main(String[] args) {
+        launch(args);
+    }
+
+    /**
+     * Written by Tuo Liu
+     * To represent the grids on board
+     */
+
+    class Grid {
+        private double x; // The coordinate of the grid
+        private double y;
+        public boolean isEmpty1; // If there is no tile on the grid
+        public boolean isEmpty2;
+
+        public Grid(double x, double y) {
+            this.x = x;
+            this.y = y;
+            this.isEmpty1 = true;
+            this.isEmpty2 = true;
+        }
+
+        public boolean isEmpty() {
+            return currentPlayer == 1 ? this.isEmpty1 : this.isEmpty2;
+        }
+
+        public double getX() {
+            return this.x;
+        }
+
+        public double getY() {
+            return this.y;
+        }
+    }
+
+    Grid[][] grids = new Grid[7][7]; // To create a 7*7 grids.   Written by Tuo Liu
+
+    /**
+     * Written by Tuo Liu
+     * To give the x and y to 7*7 girds
+     */
+    private void initGrids() {
+        for(int i = 0; i < 7; i++) {
+            for(int j = 0; j < 7; j++) {
+                grids[i][j] = new Grid(Tile_START_X + Tile_WIDTH * j, Tile_START_Y + Tile_WIDTH * (i+1));
+            }
+        }
+    }
+
+    /**
+     * Created by Tuo Liu
+     * To create five groups of Tiles
+     */
+    List<TileImage> specialTiles1 = new ArrayList<>();
+    List<TileImage> specialTiles2 = new ArrayList<>();
+    List<TileImage> placement1 = new ArrayList<>();
+    List<TileImage> placement2 = new ArrayList<>();
+    List<TileImage> diceTiles = new ArrayList<>();
+
+
+    /**
+     * Created by Tuo Liu
+     * To create a class to represent the Tiles
+     */
+    class TileImage extends ImageView {
+        double mouseX, mouseY; //To implement snap function
+        double homeX, homeY; // To represent the original location of the tile
+        String name; // The name of tiles like A1, B1, S1
+        int orientation; // The orientation of the tile
+        int row, col; // The position on the Board
+        boolean isPlaced; // To judge if the tile has been placed on the board
+        boolean isSpecial; // To judge if the tile is a special tile
+
+        TileImage(Image image, String name, double startX, double startY, int orientation) {
+            super(image);
+            this.row = -1;
+            this.col = -1;
+            this.isPlaced = false;
+            this.name = name;
+            this.orientation = orientation;
+            this.homeX = startX;
+            this.homeY = startY;
+            if(name.charAt(0) == 'S') { // To determine if the tile is a special tile
+                this.isSpecial = true;
+            } else {
+                this.isSpecial = false;
+            }
+
+            setFitHeight(Tile_WIDTH);
+            setFitWidth(Tile_WIDTH);
+            setLayoutX(startX);
+            setLayoutY(startY);
+            setOrientation();
+
+            setOnMousePressed(event -> { // Set up mouse press event
+                if(!this.isPlaced && !gameOver) {
+                    mouseX = event.getSceneX();
+                    mouseY = event.getSceneY();
+                }
+            });
+
+            setOnMouseDragged(event -> { // Set up mouse drag event
+                if(!this.isPlaced && !gameOver){
+                    toFront();
+                    double movementX = event.getSceneX() - mouseX;
+                    double movementY = event.getSceneY() - mouseY;
+                    setLayoutX(getLayoutX() + movementX);
+                    setLayoutY(getLayoutY() + movementY);
+                    mouseX = event.getSceneX();
+                    mouseY = event.getSceneY();
+                }
+                event.consume();
+            });
+
+            setOnMouseReleased(event -> { // Set up mouse release event
+                if(!this.isPlaced && !gameOver) {
+                    if(!snapToGrid())
+                        snapToHome();
+                }
+            });
+
+            setOnScroll(event -> { // Set up mouse scroll event, change the orientation of the tile
+                if (!this.isPlaced && !gameOver)
+                {
+                    this.orientation = (this.orientation + 1) % 8;
+                    setOrientation();
+                    event.consume();
+                }
+            });
+
+        }
+
+        public TileImage clone() { // To create a new tile that has the same features
+            return new TileImage(this.getImage(), this.name, this.homeX, this.homeY, this.orientation);
+        }
+
+        @Override
+        public String toString() { // Convert the tile to board String
+            return this.name + rowtoString(this.row) + this.col + this.orientation;
+        }
+
+        private void setOrientation() { // Rotate the tile to its current orientation
+            if(this.orientation >= 4) {
+                setScaleX(-1);
+                setRotate(this.orientation * 90);
+            } else {
+                setScaleX(1);
+                setRotate(this.orientation * 90);
+            }
 
-    private final Group root = new Group();
-    private final Group controls = new Group();
-    TextField textField;
+        }
+
+
+        private void snapToHome() { // snap the tile to its home location
+                setLayoutX(homeX);
+                setLayoutY(homeY);
+        }
+
+        private boolean snapToGrid() { // To snap the tile to the nearest grid
+            // To determine if the special tile has been used over times
+            if(this.isSpecial) {
+                if(currentPlayer == 1) {
+                    if(specialCount1 >= 3 || roundSpecialUsed) {
+                        msgLabel.setText("No more special tiles allowed!");
+                        return false;
+                    }
+                } else {
+                    if(specialCount2 >= 3 || roundSpecialUsed) {
+                        msgLabel.setText("No more special tiles allowed!");
+                        return false;
+                    }
+                }
+
+            }
+
+            // To determine if the tile has been snapped to near a grid
+            for(int i = 0; i < 7; i++) {
+                for(int j = 0; j < 7; j++) {
+                    if((Math.abs(getLayoutX() - grids[i][j].getX()) < (Tile_WIDTH / 4)) && (Math.abs(getLayoutY() - grids[i][j].getY()) < (Tile_WIDTH / 4))) {
+                        if(grids[i][j].isEmpty()) { // To determine if there is already a tile on the grid
+                            if(isValidPlacementSequence((getPlacement(currentPlayer)) + this.name + rowtoString(i) + j + this.orientation)){ // To determine if the new placement is legal
+                                if(this.isSpecial) {
+                                    if(currentPlayer == 1) {
+                                        specialCount1 += 1; // Add the total number of special tiles used to player 1
+                                        specialTiles1.remove(this); // Remove the tile from special tiles list of player 1
+                                    } else {
+                                        specialCount2 += 1; // Add the total number of special tiles used to player 2
+                                        specialTiles2.remove(this); // Remove the tile from special tiles list of player 2
+                                    }
+                                    specialTiles.getChildren().remove(this); // Remove the tile from the group of special tiles
+                                    roundSpecialUsed = true; // Set the round special tile use status
+                                    specialLabel.setText("Special tiles used: " + (currentPlayer == 1 ? specialCount1 : specialCount2)); // Update the special tile label
+                                } else {
+                                    diceRolls.getChildren().remove(this); // Remove the tile from the group of tiles generated from dice
+                                    tilesLeft -= 1;
+                                }
+
+                                /**
+                                 * Create a new tile and put it onto the board
+                                 * Put the current tile back to the dice roll for next player to use
+                                 * */
+                                TileImage tile = clone(); // Create a new tile that has the same features to current tile
+                                setLayoutX(homeX); //
+                                setLayoutY(homeY);
+                                tile.setLayoutX(grids[i][j].getX());
+                                tile.setLayoutY(grids[i][j].getY());
+                                tile.row = i;
+                                tile.col = j;
+
+                                tile.isPlaced = true;
+                                tiles.getChildren().add(tile);
+
+                                if(currentPlayer == 1) {
+                                    placement1.add(tile); // Add the tile to placement list for player 1
+                                    grids[i][j].isEmpty1 = false;
+                                } else {
+                                    placement2.add(tile); // ADd the tile to placement list for player 2
+                                    grids[i][j].isEmpty2 = false;
+                                }
+
+                                return true;
+                            }
+                        }
+                    }
+                }
+            }
+            return false;
+        }
+    }
+
+    /**
+     * Written by Jingfen Qiao
+     * Implement the placement to the board
+     */
+    void makePlacement() {
+        tiles.getChildren().clear();
+        if(currentPlayer == 1) {
+            for(int i = 0; i < placement1.size(); i++) {
+                tiles.getChildren().add(placement1.get(i));
+            }
+        } else {
+            for(int i = 0; i < placement2.size(); i++) {
+                tiles.getChildren().add(placement2.get(i));
+            }
+        }
+
+    }
+
+    /**
+     * Created by Tuo Liu
+     * To get the placement String of current player
+     * @param player
+     * @return
+     */
+    public String getPlacement(int player) {
+        String placement = "";
+        if(player == 1) {
+            for(int i = 0; i < placement1.size(); i++) {
+                placement += placement1.get(i).toString();
+            }
+        } else {
+            for(int i = 0; i < placement2.size(); i++) {
+                placement += placement2.get(i).toString();
+            }
+        }
+        return placement;
+    }
+
+    /**
+     * Created by Tuo Liu
+     * To make the board
+     */
+    void makeBoard() {
+        initGrids(); // Initial the grids
+
+        // Add the 8x8 lines
+        for(int i = 0; i <= 7; i++) {
+            Line l_vertical = new Line();
+            l_vertical.setStartX(Tile_START_X + Tile_WIDTH * i);
+            l_vertical.setStartY(Tile_START_Y + Tile_WIDTH);
+            l_vertical.setEndX(Tile_START_X + Tile_WIDTH * i);
+            l_vertical.setEndY(Tile_START_Y + Tile_WIDTH * 8);
+            board.getChildren().add(l_vertical);
+
+            Line l_horizontal = new Line();
+            l_horizontal.setStartX(Tile_START_X);
+            l_horizontal.setStartY(Tile_START_Y + Tile_WIDTH * (i + 1));
+            l_horizontal.setEndX(Tile_START_X + Tile_WIDTH * 7);
+            l_horizontal.setEndY(Tile_START_Y + Tile_WIDTH * (i + 1));
+            board.getChildren().add(l_horizontal);
+        }
+
+        // Add the red line in the middle
+        Line sl_vertical1 = new Line();
+        sl_vertical1.setStroke(Color.RED);
+        sl_vertical1.setStrokeWidth(2);
+        sl_vertical1.setStartX(Tile_START_X + Tile_WIDTH * 2);
+        sl_vertical1.setStartY(Tile_START_Y + Tile_WIDTH * 3);
+        sl_vertical1.setEndX(Tile_START_X + Tile_WIDTH * 2);
+        sl_vertical1.setEndY(Tile_START_Y + Tile_WIDTH * 6);
+        board.getChildren().add(sl_vertical1);
+
+        Line sl_vertical2 = new Line();
+        sl_vertical2.setStroke(Color.RED);
+        sl_vertical2.setStrokeWidth(2);
+        sl_vertical2.setStartX(Tile_START_X + Tile_WIDTH * 5);
+        sl_vertical2.setStartY(Tile_START_Y + Tile_WIDTH * 3);
+        sl_vertical2.setEndX(Tile_START_X + Tile_WIDTH * 5);
+        sl_vertical2.setEndY(Tile_START_Y + Tile_WIDTH * 6);
+        board.getChildren().add(sl_vertical2);
+
+        Line sl_horizontal1 = new Line();
+        sl_horizontal1.setStroke(Color.RED);
+        sl_horizontal1.setStrokeWidth(2);
+        sl_horizontal1.setStartX(Tile_START_X + Tile_WIDTH * 2);
+        sl_horizontal1.setStartY(Tile_START_Y + Tile_WIDTH * 3);
+        sl_horizontal1.setEndX(Tile_START_X + Tile_WIDTH * 5);
+        sl_horizontal1.setEndY(Tile_START_Y + Tile_WIDTH * 3);
+        board.getChildren().add(sl_horizontal1);
+
+        Line sl_horizontal2 = new Line();
+        sl_horizontal2.setStroke(Color.RED);
+        sl_horizontal2.setStrokeWidth(2);
+        sl_horizontal2.setStartX(Tile_START_X + Tile_WIDTH * 2);
+        sl_horizontal2.setStartY(Tile_START_Y + Tile_WIDTH * 6);
+        sl_horizontal2.setEndX(Tile_START_X + Tile_WIDTH * 5);
+        sl_horizontal2.setEndY(Tile_START_Y + Tile_WIDTH * 6);
+        board.getChildren().add(sl_horizontal2);
+
+        // Add Exit to the board
+        Image highExit = new Image(Viewer.class.getResource(URI_BASE + "HighExit.png").toString());
+        Image railExit = new Image(Viewer.class.getResource(URI_BASE + "RailExit.png").toString());
+
+        for(int i = 0; i < 12; i++) {
+            double x = 0.0;
+            double y = 0.0;
+            int orientation = 0;
+            switch (i) {
+                case 0:
+                    x = Tile_START_X + Tile_WIDTH * 1;
+                    y = Tile_START_Y + Tile_WIDTH * 0.5;
+                    orientation = 0;
+                    break;
+                case 1:
+                    x = Tile_START_X + Tile_WIDTH * 3;
+                    y = Tile_START_Y + Tile_WIDTH * 0.5;
+                    orientation = 0;
+                    break;
+                case 2:
+                    x = Tile_START_X + Tile_WIDTH * 5;
+                    y = Tile_START_Y + Tile_WIDTH * 0.5;
+                    orientation = 0;
+                    break;
+                case 3:
+                    x = Tile_START_X + Tile_WIDTH * 6.5;
+                    y = Tile_START_Y + Tile_WIDTH * 2;
+                    orientation = 1;
+                    break;
+                case 4:
+                    x = Tile_START_X + Tile_WIDTH * 6.5;
+                    y = Tile_START_Y + Tile_WIDTH * 4;
+                    orientation = 1;
+                    break;
+                case 5:
+                    x = Tile_START_X + Tile_WIDTH * 6.5;
+                    y = Tile_START_Y + Tile_WIDTH * 6;
+                    orientation = 1;
+                    break;
+                case 6:
+                    x = Tile_START_X + Tile_WIDTH * 5;
+                    y = Tile_START_Y + Tile_WIDTH * 7.5;
+                    orientation = 2;
+                    break;
+                case 7:
+                    x = Tile_START_X + Tile_WIDTH * 3;
+                    y = Tile_START_Y + Tile_WIDTH * 7.5;
+                    orientation = 2;
+                    break;
+                case 8:
+                    x = Tile_START_X + Tile_WIDTH * 1;
+                    y = Tile_START_Y + Tile_WIDTH * 7.5;
+                    orientation = 2;
+                    break;
+                case 9:
+                    x = Tile_START_X + Tile_WIDTH * -0.5;
+                    y = Tile_START_Y + Tile_WIDTH * 6;
+                    orientation = 3;
+                    break;
+                case 10:
+                    x = Tile_START_X + Tile_WIDTH * -0.5;
+                    y = Tile_START_Y + Tile_WIDTH * 4;
+                    orientation = 3;
+                    break;
+                case 11:
+                    x = Tile_START_X + Tile_WIDTH * -0.5;
+                    y = Tile_START_Y + Tile_WIDTH * 2;
+                    orientation = 3;
+                    break;
+            }
+            ImageView exitView = new ImageView();
+            exitView.setFitWidth(Tile_WIDTH);
+            exitView.setFitHeight(Tile_WIDTH);
+            if(i%2 == 0) {
+                exitView.setImage(highExit);
+
+            } else {
+                exitView.setImage(railExit);
+            }
+            exitView.setX(x);
+            exitView.setY(y);
+            exitView.setRotate(orientation * 90);
+            board.getChildren().add(exitView);
+        }
+
+    }
 
     /**
-     * Draw a placement in the window, removing any previously drawn one
-     *
-     * @param placement A valid placement string
+     * Created by Tuo Liu
+     * Add specials to the special tile lists
      */
-    void makePlacement(String placement) {
-        // FIXME Task 4: implement the simple placement viewer
+    private void initSpecialTiles() {
+        double x = Tile_START_X + Tile_WIDTH;
+        for(int i = 0; i < 6; i++) {
+            String img = "S" + i;
+            Image image = new Image(Viewer.class.getResource(URI_BASE + img + ".png").toString());
+            specialTiles1.add(new TileImage(image, img, x,Tile_START_Y / 3,0));
+            specialTiles2.add(new TileImage(image, img, x,Tile_START_Y / 3,0));
+            specialTiles1.get(i).isSpecial = true;
+            specialTiles2.get(i).isSpecial = true;
+            x += Tile_WIDTH * 1.5;
+        }
     }
 
     /**
-     * Create a basic text field for input and a refresh button.
+     * Created by Tuo Liu
+     * Add all the special tiles of current player to the special tile group
+     */
+    private void makeSpecialTiles() {
+        specialTiles.getChildren().clear();
+        if(currentPlayer == 1) {
+            for(int i = 0; i < specialTiles1.size(); i++) {
+                specialTiles.getChildren().add(specialTiles1.get(i));
+            }
+        } else {
+            for(int i = 0; i < specialTiles2.size(); i++) {
+                if(vsPC) {
+                    specialTiles2.get(i).isPlaced = true;
+                }
+                specialTiles.getChildren().add(specialTiles2.get(i));
+            }
+        }
+
+        specialLabel.setText("Special tiles used: " + (currentPlayer == 1 ? specialCount1 : specialCount2));
+    }
+
+    /**
+     * Created by Tuo Liu
+     * Add the tiles generated from dice to the tile group
+     */
+    private void makeDiceTiles() {
+        diceRolls.getChildren().clear();
+        for(int i = 0; i < diceTiles.size(); i++) {
+            if(vsPC && currentPlayer == 2) {
+                diceTiles.get(i).isPlaced = true;
+            }
+            diceRolls.getChildren().add(diceTiles.get(i));
+        }
+    }
+
+    /**            System.out.println(tilesLeft);
+     * Created by Tuo Liu
+     * To convert a placement string to a TileImage object
+     * @param placement
+     * @return
+     */
+    private TileImage makeTile(String placement) {
+        String img = placement.substring(0, 2);
+        int row = placement.charAt(2) - 65;
+        int col = placement.charAt(3) - 48;
+        int orientation = placement.charAt(4) - 48;
+
+        Image image =new Image(Viewer.class.getResource(URI_BASE+img+".png").toString());
+        TileImage tileImage = new TileImage(image, img, Tile_START_X + Tile_WIDTH * col, Tile_START_Y + Tile_WIDTH * (row + 1), orientation);
+        tileImage.row = row;
+        tileImage.col = col;
+
+        return tileImage;
+    }
+
+    /**
+     * Created by Tuo Liu
+     * To generate the next move by computer and place the placement on the board
+     */
+    private void pcGo () {
+        makePlacement();
+        String diceRoll = "";
+        for(int i = 0; i < diceTiles.size(); i++) {
+            diceRoll += diceTiles.get(i).name;
+        }
+        tilesLeft = 4;
+        String place = smartGame ? computerOpponentNoRestriction(getPlacement(2), diceRoll, round) :computerOpponent(getPlacement(2), diceRoll, round);
+        for(int i = 0; i < place.length(); i+=5) {
+
+            String tilePlacement = place.substring(i, i+5);
+            TileImage tmpTile = makeTile(tilePlacement);
+            tmpTile.isPlaced = true;
+            placement2.add(tmpTile);
+            grids[tmpTile.row][tmpTile.col].isEmpty2 = false;
+            if(tilePlacement.charAt(0) == 'S') {
+                for(int j = 0; j < specialTiles2.size(); j++) {
+                    if(specialTiles2.get(j).name.equals(tmpTile.name)) {
+                        specialTiles2.remove(j);
+                        break;
+                    }
+                }
+                specialCount2++;
+            } else {
+                for(int j = 0; j < diceTiles.size(); j++) {
+                    if(diceTiles.get(j).name.equals(tmpTile.name)) {
+                        diceTiles.remove(j);
+                        break;
+                    }
+                }
+                tilesLeft--;
+                diceRoll = diceRoll.replaceFirst(tilePlacement.substring(0, 2), "");
+            }
+            makePlacement();
+            makeDiceTiles();
+            makeSpecialTiles();
+
+        }
+        makeDiceTiles();
+
+    }
+
+    /**
+     * Created by Tuo Liu
+     * To go to next round
+     */
+    private void nextRound() {
+        String diceRoll = "";
+        for(int i = 0; i < diceTiles.size(); i++) {
+            diceRoll += diceTiles.get(i).name;
+        }
+        Board board = new Board(getPlacement(currentPlayer));
+        if((!smartGame && (tilesLeft == 0 || !board.checkIfMovePossible(diceRoll))) || smartGame) {
+            if(round <= 7) {
+                if(multiPlayer == true) { // If the game is in multiplayer mode
+                    if(currentPlayer == 2) {
+                        if(round == 7) { // If the round is 7, finish the game
+                            gameOver();
+                            return;
+                        }
+                        currentPlayer = 1;
+                        round ++;
+                        roundLabel.setText("Round: " + round);
+                        rollDice();
+
+                    } else {
+                        currentPlayer = 2;
+                        if(vsPC) {
+                            makePlacement();
+                            makeSpecialTiles();
+                            playerLabel.setText("Player: " + currentPlayer);
+                            pcGo();
+                        }
+                    }
+                    if(!(vsPC && currentPlayer == 2)) {
+                        makeDiceTiles();
+                        makeSpecialTiles();
+                    }
+                    makePlacement();
+                    makeSpecialTiles();
+                } else {
+                    if(round == 7) {
+                        gameOver();
+                        return;
+                    }
+                    round ++;
+                    roundLabel.setText("Round: " + round);
+                    rollDice(); // Generate new tile rolls
+                    makeDiceTiles();
+                    makePlacement();
+                }
+
+            } else {
+                gameOver();
+            }
+            playerLabel.setText("Player: " + currentPlayer);
+            roundSpecialUsed = false;
+            if(smartGame) {
+                tilesLeft = 4;
+            }
+            msgLabel.setText("");
+        } else {
+            msgLabel.setText("All tiles must be placed!");
+        }
+
+    }
+
+    /**
+     * Created by Tuo Liu
+     * Generate new dice rolls and add to the group
+     */
+    private void rollDice() {
+
+            diceTiles.clear();
+            String diceRoll = generateDiceRoll();
+            double y = Tile_START_Y + Tile_WIDTH * 1.5;
+            for(int i=0; i<8; i+=2) {
+                String img = diceRoll.substring(i, i+2);
+                Image image =new Image(Viewer.class.getResource(URI_BASE + img + ".png").toString());
+                TileImage tileImage = new TileImage(image, img, Tile_START_X + Tile_WIDTH * 9, y, 0);
+                y += Tile_WIDTH * 1.5;
+                diceTiles.add(tileImage);
+            }
+            tilesLeft = 4;
+    }
+
+    /**
+     * Created by Tuo Liu
+     */
+    Label roundLabel = new Label("Round: " + round);
+    Label playerLabel = new Label("Player: " + currentPlayer);
+    Label specialLabel = new Label("Special tiles used: " + (currentPlayer == 1 ? specialCount1 : specialCount2));
+
+    // Written by Jingfen Qiao
+    // Open an new window to display the scores.
+    private void gameOver() {
+
+        gameOver = true;
+
+        // image for the window of single player
+        Image img = new Image(Viewer.class.getResource(URI_BASE+"WOW.png").toString());
+        ImageView imageview = new ImageView(img);
+        imageview.setX(250);
+        imageview.setY(10);
+        imageview.setFitWidth(120);
+        imageview.setFitHeight(120);
+
+        // image for the window of multi-players
+        ImageView imageview2 = new ImageView(img);
+        imageview2.setX(250);
+        imageview2.setY(10);
+        imageview2.setFitWidth(120);
+        imageview2.setFitHeight(120);
+
+
+        // Words to remind the player about the score
+        Label label1 = new Label("CONGRATULATIONS... YOU BEAT THE GAME!");
+        label1.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,20));
+        label1.setLayoutX(120);
+        label1.setLayoutY(130);
+
+        // Words to remind two players about scores
+        Label label5 = new Label("CONGRATULATIONS... YOU BEAT THE GAME!");
+        label5.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,20));
+        label5.setLayoutX(120);
+        label5.setLayoutY(130);
+
+        // Generate the score of single player by invoking the function getPlacement
+        Label label2 = new Label("Your Score: " + getAdvancedScore(getPlacement(1)));
+        label2.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
+        label2.setLayoutX(250);
+        label2.setLayoutY(170);
+
+        // Generate the score of first player between two players by invoking the function getPlacement
+        Label label3 = new Label("First player's score: " + getAdvancedScore(getPlacement(1)));
+        label3.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
+        label3.setLayoutX(220);
+        label3.setLayoutY(170);
+
+        // Generate the score of second player between two players by invoking the function getPlacement as well
+        Label label4 = new Label("Second player's score: " + getAdvancedScore(getPlacement(2)));
+        label4.setFont(Font.font("family", FontWeight.BLACK.BOLD, FontPosture.ITALIC,20));
+        label4.setLayoutX(220);
+        label4.setLayoutY(230);
+
+        // Group label1, label2 and image together for the window of single player
+        Group rootOne = new Group();
+        rootOne.getChildren().addAll(label1,label2,imageview);
+
+        // Group label5,label4, imageview2 together for the window of multi-players
+        Group rootMulti = new Group();
+        rootMulti.getChildren().addAll(label5,label3,label4,imageview2);
+
+        // Show the window of single player if they select the singe player, otherwise, show the window of multi-players
+        Scene scene;
+        if(multiPlayer)
+        {
+            scene = new Scene(rootMulti, 640, 300);
+        }
+
+        else
+        {
+            scene = new Scene(rootOne, 640, 300);
+        }
+
+        //Scene scene = new Scene(root, 640, 300);
+
+        //New window
+        Stage gameOverWindow = new Stage();
+        gameOverWindow.setTitle("Game Over");
+        gameOverWindow.setScene(scene);
+
+        gameOverWindow.setX(200);
+        gameOverWindow.setY(100);
+
+        gameOverWindow.setAlwaysOnTop(true);
+        gameOverWindow.show();
+    }
+
+
+    /**
+     * Created by Tuo Liu
+     * To restart the game
+     */
+    private void restartGame() {
+        controls.getChildren().clear();
+        board.getChildren().clear();
+        specialTiles.getChildren().clear();
+        diceRolls.getChildren().clear();
+        tiles.getChildren().clear();
+        specialTiles1.clear();
+        specialTiles2.clear();
+        diceTiles.clear();
+        placement1.clear();
+        placement2.clear();
+        specialCount1 = 0;
+        specialCount2 = 0;
+        round = 0;
+        roundSpecialUsed = false;
+        currentPlayer = 1;
+        makeControls();
+        gameOver = false;
+    }
+
+    /**
+     * Created by Tuo Liu
+     * To create all the controls on the window
      */
     private void makeControls() {
-        Label label1 = new Label("Placement:");
-        textField = new TextField();
-        textField.setPrefWidth(300);
-        Button button = new Button("Refresh");
-        button.setOnAction(e -> {
-            makePlacement(textField.getText());
-            textField.clear();
+
+        Button nextRoundButton = new Button("Next Round");
+        nextRoundButton.setOnAction(e -> {
+            nextRound();
+        });
+        nextRoundButton.setLayoutX(Tile_START_X + Tile_WIDTH * 9);
+        nextRoundButton.setLayoutY(Tile_START_X + Tile_WIDTH * 6);
+
+        Label label = new Label("Special Tiles:");
+        label.setFont(Font.font("Cambria", 24));
+        label.setLayoutX(Tile_START_X / 5);
+        label.setLayoutY(Tile_START_Y / 2);
+
+        specialLabel.setFont(Font.font("Cambria", 15));
+        specialLabel.setLayoutX(Tile_START_X / 5);
+        specialLabel.setLayoutY(Tile_START_Y * 1.2);
+
+        roundLabel.setFont(Font.font("Cambria", 20));
+        roundLabel.setLayoutX(Tile_START_X / 5);
+        roundLabel.setLayoutY(Tile_START_Y * 2);
+
+        playerLabel.setFont(Font.font("Cambria", 20));
+        playerLabel.setLayoutX(Tile_START_X / 5);
+        playerLabel.setLayoutY(Tile_START_Y * 2.5);
+
+        Label modeLabel = new Label();
+        modeLabel.setFont(Font.font("Cambria", 15));
+        modeLabel.setText((smartGame? "Smart" : "Normal") + " Mode");
+        modeLabel.setLayoutX(Tile_START_X / 5);
+        modeLabel.setLayoutY(Tile_START_Y * 3);
+
+        Button newGameButton = new Button("Restart Game");
+        newGameButton.setOnAction(e -> {
+            restartGame();
         });
-        HBox hb = new HBox();
-        hb.getChildren().addAll(label1, textField, button);
-        hb.setSpacing(10);
-        hb.setLayoutX(130);
-        hb.setLayoutY(VIEWER_HEIGHT - 50);
-        controls.getChildren().add(hb);
+        newGameButton.setLayoutX(Tile_START_X / 5);
+        newGameButton.setLayoutY(Tile_START_Y * 3.5);
+
+        msgLabel.setFont(Font.font("Cambria", 15));
+        msgLabel.setLayoutX(Tile_START_X);
+        msgLabel.setLayoutY(VIEWER_HEIGHT * 0.9);
+        msgLabel.setText("");
+
+        controls.getChildren().addAll(label, roundLabel, specialLabel, playerLabel, modeLabel,nextRoundButton,newGameButton, msgLabel);
+
+        initGrids();
+        initSpecialTiles();
+        makeSpecialTiles();
+
+        makeBoard();
+        rollDice();
+        makeDiceTiles();
+        round = 1;
+        roundLabel.setText("Round: " + round);
+        playerLabel.setText("Player: " + currentPlayer);
     }
 
+
+    /**
+     * Created by Tuo Liu
+     * @param primaryStage
+     * @throws Exception
+     */
     @Override
     public void start(Stage primaryStage) throws Exception {
+
+
+
         primaryStage.setTitle("StepsGame Viewer");
         Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
 
+        // Add all groups to the root group
         root.getChildren().add(controls);
+        root.getChildren().add(tiles);
+        root.getChildren().add(board);
+        root.getChildren().add(diceRolls);
+        root.getChildren().add(specialTiles);
 
-        makeControls();
 
         primaryStage.setScene(scene);
-        primaryStage.show();
+        primaryStage.setResizable(false);
+
+        makeControls();
+
+        //choose mode
+        Group modeChoosingGroup = new Group();
+        Scene modeChoosingScene = new Scene(modeChoosingGroup, 380, 250);
+
+        Label label1 = new Label("Please choose game mode: ");
+        label1.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,20));
+        label1.setLayoutX(50);
+        label1.setLayoutY(30);
+
+        Stage modeChoosingWindow = new Stage();
+
+        HBox hBox1 = new HBox();
+        HBox hBox2 = new HBox();
+
+        hBox1.setLayoutX(50);
+        hBox1.setLayoutY(80);
+
+        hBox2.setLayoutX(50);
+        hBox2.setLayoutY(130);
+
+
+
+        Label ruleLabel = new Label("Select Rule: ");
+        ruleLabel.setFont(Font.font("family", FontWeight.BLACK.EXTRA_BOLD, FontPosture.REGULAR,15));
+
+        ChoiceBox ruleChoiceBox = new ChoiceBox();
+        ruleChoiceBox.setItems(FXCollections.observableArrayList(
+                "Normal", "Smart"
+        ));
+        ruleChoiceBox.setValue("Normal");
+
+        hBox2.getChildren().addAll(ruleLabel, ruleChoiceBox);
+
+        Button singleButton = new Button("Single player");
+        singleButton.setOnAction(e -> {
+            multiPlayer = false;
+            if(ruleChoiceBox.getValue().equals("Smart")) {
+                smartGame = true;
+            }
+            restartGame();
+            primaryStage.show();
+            modeChoosingWindow.close();
+        });
+
+        Button multiButton = new Button("Multi player");
+        multiButton.setOnAction(e -> {
+            multiPlayer = true;
+            if(ruleChoiceBox.getValue().equals("Smart")) {
+                smartGame = true;
+            }
+            restartGame();
+            primaryStage.show();
+            modeChoosingWindow.close();
+        });
+
+        Button pcButton = new Button("PVE");
+        pcButton.setOnAction(e -> {
+            multiPlayer = true;
+            if(ruleChoiceBox.getValue().equals("Smart")) {
+                smartGame = true;
+            }
+            vsPC = true;
+            restartGame();
+            primaryStage.show();
+            modeChoosingWindow.close();
+        });
+
+        hBox1.getChildren().addAll(singleButton, multiButton, pcButton);
+
+        Label rulesLabel = new Label ("Normal - Use all 4 tiles if possible\n" +
+                "Smart - You can skip tile placements");
+        rulesLabel.setLayoutY(180);
+        rulesLabel.setLayoutX(50);
+
+        modeChoosingGroup.getChildren().addAll(label1, hBox1, hBox2, rulesLabel);
+        modeChoosingWindow.setTitle("Mode Choosing");
+        modeChoosingWindow.setScene(modeChoosingScene);
+        modeChoosingWindow.setResizable(false);
+
+        modeChoosingWindow.show();
+
     }
 }
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$TileImage.class
Only in comp1110-ass2/src/comp1110/ass2: mySet.class
Only in comp1110-ass2/src/comp1110/ass2: mySet.java
Only in comp1110-ass2/src/comp1110/ass2: RailroadInk.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/RailroadInk.java comp1110-ass2/src/comp1110/ass2/RailroadInk.java
--- ../master/comp1110-ass2/src/comp1110/ass2/RailroadInk.java	2019-05-24 13:59:04.556397359 +1000
+++ comp1110-ass2/src/comp1110/ass2/RailroadInk.java	2019-05-24 14:12:23.421125259 +1000
@@ -1,7 +1,11 @@
 package comp1110.ass2;
 
+import java.util.ArrayList;
+import java.util.Random;
+import java.util.Set;
 public class RailroadInk {
     /**
+     * Created by Jingfen Qiao
      * Determine whether a tile placement string is well-formed:
      * - it consists of exactly 5 characters;
      * - the first character represents a die A or B, or a special tile S
@@ -15,10 +19,34 @@
      */
     public static boolean isTilePlacementWellFormed(String tilePlacementString) {
         // FIXME Task 2: determine whether a tile placement is well-formed
+        if(tilePlacementString.length() == 5) {
+            if(tilePlacementString.charAt(0) == 'A' || tilePlacementString.charAt(0) == 'B' || tilePlacementString.charAt(0) == 'S') {
+                int tileLength;
+                if(tilePlacementString.charAt(0) == 'A' || tilePlacementString.charAt(0) == 'S') {
+                    tileLength = 6;
+
+                } else {
+                    tileLength = 3;
+                }
+                if(Character.isDigit(tilePlacementString.charAt(1)) && Character.isDigit(tilePlacementString.charAt(3)) && Character.isDigit(tilePlacementString.charAt(4))) {
+
+                    if (Integer.parseInt(String.valueOf(tilePlacementString.charAt(1))) >= 0 && Integer.parseInt(String.valueOf(tilePlacementString.charAt(1))) < tileLength) {
+                        if (tilePlacementString.charAt(2) >= 'A' && tilePlacementString.charAt(2) <= 'G') {
+                            if (Integer.parseInt(String.valueOf(tilePlacementString.charAt(3))) >= 0 && Integer.parseInt(String.valueOf(tilePlacementString.charAt(3))) <= 6) {
+                                if (Integer.parseInt(String.valueOf(tilePlacementString.charAt(4))) >= 0 && Integer.parseInt(String.valueOf(tilePlacementString.charAt(4))) <= 7) {
+                                    return true;
+                                }
+                            }
+                        }
+                    }
+                }
+            }
+        }
         return false;
     }
 
     /**
+     * Created by Tuo Liu
      * Determine whether a board string is well-formed:
      * - it consists of exactly N five-character tile placements (where N = 1 .. 31);
      * - each piece placement is well-formed
@@ -29,76 +57,284 @@
      */
     public static boolean isBoardStringWellFormed(String boardString) {
         // FIXME Task 3: determine whether a board string is well-formed
-        return false;
+        boolean isWellFormed = true;
+        if(boardString!=null){
+            if(boardString.length()%5 == 0 && (boardString.length()/5 >= 1 && boardString.length()/5 <= 31 )) {
+                int cntS = 0;
+                for(int i=0; i<boardString.length(); i+=5) {
+                    if(isTilePlacementWellFormed(boardString.substring(i, i+5))) {
+                        if(boardString.charAt(i) == 'S') {
+                            if(++cntS > 3){
+                                isWellFormed = false;
+                                break;
+                            }
+                        }
+                    } else {
+                        isWellFormed = false;
+                        break;
+                    }
+                }
+            } else {
+                isWellFormed = false;
+            }
+        } else {
+            isWellFormed = false;
+        }
+
+        return isWellFormed;
     }
 
 
+
     /**
-     * Determine whether the provided placements are neighbours connected by at least one validly connecting edge.
-     * For example,
-     * - areConnectedNeighbours("A3C10", "A3C23") would return true as these tiles are connected by a highway edge;
-     * - areConnectedNeighbours("A3C23", "B1B20") would return false as these neighbouring tiles are disconnected;
-     * - areConnectedNeighbours("A0B30", "A3B23") would return false as these neighbouring tiles have an
-     * invalid connection between highway and railway; and
-     * areConnectedNeighbours("A0B30", "A3C23") would return false as these tiles are not neighbours.
+     * Author : Jihirshu Narayan
+     * Created on : 29/03/2019
+     * Last modified : -
+     * @param tilePlacementStringA
+     * @param tilePlacementStringB
+     * @return boolean value telling us if the two tile placement strings are connected neighbours or not
+     *
+     * Description : The tile id, tile location and tile orientation information is extracted from each tile placement string
+     *              and two tile objects are connected accordingly. We check if they are connected using the isConnected function from class Tile.
      *
-     * @return true if the placements are connected neighbours
      */
-    public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB) {
-        // FIXME Task 5: determine whether neighbouring placements are connected
-        return false;
+
+    public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB)
+    {
+        Tile a = new Tile(tilePlacementStringA.substring(0,2));
+        Tile b = new Tile(tilePlacementStringB.substring(0,2));
+        a.set_default();
+        b.set_default();
+        a.translate(tilePlacementStringA.substring(2,4));
+        b.translate(tilePlacementStringB.substring(2,4));
+        a.rotate90(tilePlacementStringA.charAt(4));
+        b.rotate90(tilePlacementStringB.charAt(4));
+
+        return (a.isConnected(b));
     }
 
+
     /**
-     * Given a well-formed board string representing an ordered list of placements,
-     * determine whether the board string is valid.
-     * A board string is valid if each tile placement is legal with respect to all previous tile
-     * placements in the string, according to the rules for legal placements:
-     * - A tile must be placed such that at least one edge connects to either an exit or a pre-existing route.
-     *   Such a connection is called a valid connection.
-     * - Tiles may not be placed such that a highway edge connects to a railway edge;
-     *   this is referred to as an invalid connection.
-     *   Highways and railways may only join at station tiles.
-     * - A tile may have one or more edges touching a blank edge of another tile;
-     *   this is referred to as disconnected, but the placement is still legal.
+     * Author : Jihirshu Narayan
+     * Created : 29/03/2019
+     * Last modified : 09/05/2019
+     * @param boardString
+     * @return boolean value representing if the boardstring represents valid placement of tiles
+     * Description : The boardString is a string of multiple tileplacement strings concatenated together. We extract tile placement strings one at a time
+     *              by incrementing 5 steps in the boardstring. In each iteration we create a tile object which is then added to an array of tile objects.
      *
-     * @param boardString a board string representing some placement sequence
-     * @return true if placement sequence is valid
+     *              Once we have the tile array ready, we iterate over each tile object making sure its either connected to an exit or another tile object in the
+     *              array. We also check for invalid connections. If all tile have a valid placement then the function returns true.
      */
-    public static boolean isValidPlacementSequence(String boardString) {
+
+    public static boolean isValidPlacementSequence(String boardString)
+    {
         // FIXME Task 6: determine whether the given placement sequence is valid
-        return false;
+
+        int numberOfTiles = boardString.length()/5;
+        Tile[] tile_array = new Tile[numberOfTiles];
+
+        int counter = 0;
+        for (int i = 0;i < boardString.length();i=i+5)
+        {
+            String temp_substring = boardString.substring(i,i+5);
+            tile_array[counter] = new Tile(temp_substring.substring(0,2));
+            tile_array[counter].set_default();
+            tile_array[counter].translate(temp_substring.substring(2,4));
+            tile_array[counter].rotate90(temp_substring.charAt(4));
+
+            counter++;
+        }
+
+
+        boolean[] tile_result = new boolean[numberOfTiles];
+
+        for (int i = 0;i<numberOfTiles;i++)
+        {
+            if (tile_array[i].checkInvalidExitConnection())
+                return false;
+            if ((i==0) && (!tile_array[i].checkExitConnection()))
+                return false;
+            if (tile_array[i].checkExitConnection())
+                tile_result[i] = true;
+
+            for (int j = 0;j<numberOfTiles;j++)
+            {
+                if (i!=j)
+                {
+                    if (tile_array[i].getLocation().equals(tile_array[j].getLocation()))
+                        return false;
+                    if (tile_array[i].isInvalidConenction(tile_array[j]))
+                        return false;
+                    if (tile_array[i].isConnected(tile_array[j]))
+                        tile_result[i] = true;
+                }
+            }
+        }
+        boolean result = true;
+        for (int i = 0;i<numberOfTiles;i++)
+        {
+            result = result && tile_result[i];
+        }
+
+        return result;
+
     }
 
+
+
     /**
-     * Generate a random dice roll as a string of eight characters.
-     * Dice A should be rolled three times, dice B should be rolled once.
-     * Die A has faces numbered 0-5.
-     * Die B has faces numbered 0-2.
-     * Each die roll is composed of a character 'A' or 'B' representing the dice,
-     * followed by a digit character representing the face.
-     *
-     * @return a String representing the die roll e.g. A0A4A3B2
+     * Author : Jihirshu Narayan
+     * Created on : 11/04/2019
+     * Last modified : -
+     * @return a String representing dice roll for a round.
+     * Decription : 4 randomly selected dice out of A0,A1,A2,A3,A4,A5,B0,B1,B2 (repitition allowed)
      */
+
     public static String generateDiceRoll() {
         // FIXME Task 7: generate a dice roll
-        return "";
+        String dice_roll = "";
+        int temp;
+        Random random = new Random();
+        for (int i=0;i<4;i++)
+        {
+            if (i == 3)
+            {
+                temp = random.nextInt(3);
+                dice_roll = dice_roll + "B" + Integer.toString(temp);
+
+            }
+            else
+            {
+                temp = random.nextInt(6);
+                dice_roll = dice_roll + "A" + Integer.toString(temp);
+            }
+        }
+
+        return dice_roll;
     }
 
+
+
+
     /**
+     * Author : Jihirshu Narayan
+     * Created on : 11/04/2019
+     * Last Modified : -
      * Given the current state of a game board, output an integer representing the sum of all the following factors
      * that contribute to the player's final score.
      * <p>
      * * Number of exits mapped
      * * Number of centre tiles used
      * * Number of dead ends in the network
-     *
      * @param boardString a board string representing a completed game
-     * @return integer (positive or negative) for score *not* considering longest rail/highway
+     * @return an integer value representing basic score for the given boardstring
+     * Description : We create an array of tile objects from the given boardstring. Tile B2 is repeated twice for every occurrence since it represents a highway
+     *              connection as well as a railway connection but not connected to each other. Once the tile array is created, we create all possible routes
+     *              from the tiles and store each as a route object in a list of routes objects. Then we iterate through the routes list and check if any of
+     *              these routes are  connected to each other and merge them if they are. At the end of the iteration, we have a list of disconnected routes and
+     *              we count their exits.
+     *
+     *              We also create a board object which contains a 2D array of tile objects. Using the board object we find out how many tiles are placed in the
+     *              center and how many errors are on the board. We get the basic score by summing exit score, center tile score and subtracting the errors.
+     *
      */
-    public static int getBasicScore(String boardString) {
+
+
+    public static int getBasicScore(String boardString)
+    {
         // FIXME Task 8: compute the basic score
-        return -1;
+
+        if (!isValidPlacementSequence(boardString))
+            return -9999;                                           // returning absurdly large negative number which indicates that an invalid boardstring was received
+
+        if (boardString.isEmpty())
+            return 0;
+
+        int basicScore = 0;
+        int b2Counter = 0;
+        for (int i = 0;i < boardString.length();i=i+5)
+        {
+            if (boardString.substring(i,i+2).equals("B2"))          //Piece B2 will be treated as two individual piece on the same location. Counting B2 pieces in boardstring here
+                b2Counter++;
+
+        }
+        ArrayList<Route> routes = new ArrayList<>();
+
+        int tile_number = (boardString.length())/5;
+        Tile[] tile_array = new Tile[tile_number + b2Counter];      // Adjusting the length of tile_array to accomodate B2 piece copies
+        Board board = new Board();
+        int counter = 0;
+        for (int i = 0;i < boardString.length();i=i+5)
+        {
+            String temp_substring = boardString.substring(i,i+5);
+            tile_array[counter] = new Tile(temp_substring.substring(0,2));
+            tile_array[counter].set_default();
+            tile_array[counter].translate(temp_substring.substring(2,4));
+            tile_array[counter].rotate90(temp_substring.charAt(4));
+            board.place_tile(tile_array[counter]);
+            if (tile_array[counter].getName().equals("B2"))
+            {
+                tile_array[counter+1] = new Tile(temp_substring.substring(0,2));
+                tile_array[counter+1].set_default();
+                tile_array[counter+1].translate(temp_substring.substring(2,4));
+                tile_array[counter+1].rotate90(temp_substring.charAt(4));
+                tile_array[counter].shape[5] = 0;
+                tile_array[counter+1].shape[4] = 0;
+                counter++;
+            }
+
+
+            counter++;
+        }
+        Route route = new Route(tile_array[0]);
+        outer:
+        for (int i=1;i<tile_array.length;i++)
+        {
+            if (routes.isEmpty())
+                routes.add(route);
+            inner:
+            for (Route x : routes)
+            {
+                if (x.connectedToRoute(tile_array[i]))
+                    continue outer;
+            }
+            routes.add(new Route(tile_array[i]));
+        }
+
+        for (int i = 0;i<routes.size();i++)
+        {
+            for (int j = 0;j<routes.size();j++)
+            {
+                if (i!=j)
+                {
+                    if (routes.get(i).checkRoutesConnected(routes.get(j)))
+                    {
+                        routes.get(i).mergeRoutes(routes.get(j));
+                        routes.remove(j);
+                        i=0;
+                        j=0;
+                    }
+                }
+            }
+        }
+
+        for (Route x : routes)
+        {
+            int exits = x.numberOfExitsConnected();
+            if (exits == 12)
+                basicScore = basicScore + 45;
+            else if (exits > 1)
+                basicScore = basicScore + (4*(exits-1));
+        }
+
+        basicScore = basicScore + board.centreTileScore();
+
+        basicScore = basicScore - board.countErrors();
+
+        return basicScore;
+
+
     }
 
     /**
@@ -109,24 +345,317 @@
      * @return a String representing an ordered sequence of valid piece placements for the current round
      * @see RailroadInk#generateDiceRoll()
      */
+
+
+    /**
+     * Author : Jihirshu Narayan
+     * Created : 16/04/2019
+     * Last modified : -
+     * Given a valid boardString and a dice roll for the round,
+     * return a String representing an ordered sequence of valid piece placements for the round.
+     * @param boardString a board string representing the current state of the game as at the start of the round
+     * @param diceRoll a String representing a dice roll for the round
+     * @return A string representing the best possible move given a boardString and a dice roll
+     *
+     * Description : An array of Tile objects is created from the boardString. A Board object is created as well. The board object has a function which returns
+     *               an array of all possible moves for a given baordString and dice roll. We add all the generated move string to the original boardString one by one
+     *               and evaluate the basic score for in each iteration. The generated move which returns the highest basic score is selected and returned as the best
+     *               possible single move.
+     *
+     */
+
     public static String generateMove(String boardString, String diceRoll) {
         // FIXME Task 10: generate a valid move
-        return null;
+        String[] choices = {"","","",""};
+        int tile_number = (boardString.length())/5;
+        Tile[] tile_array = new Tile[tile_number];
+        Board board = new Board();
+        int counter = 0;
+
+        for (int i=0;i<boardString.length();i=i+5)
+        {
+            String temp = boardString.substring(i,i+5);
+            tile_array[counter] = new Tile(temp.substring(0,2));
+            tile_array[counter].set_default();
+            tile_array[counter].translate(temp.substring(2,4));
+            tile_array[counter].rotate90(temp.charAt(4));
+            board.place_tile(tile_array[counter]);
+        }
+        int pieceCounter=0;
+        for (int i=0;i<diceRoll.length();i=i+2)
+        {
+                choices[pieceCounter] = diceRoll.substring(i,i+2);
+                pieceCounter++;
+
+        }
+
+        int initial_score = getBasicScore(boardString);
+
+        int max = initial_score;
+        String result_final = "";
+
+
+        Set results = board.generateMove(choices, 6);
+
+        for (Object result : results)
+        {
+            String newBoardString = boardString + result;
+            int currentScore = getBasicScore(newBoardString);
+            if ( currentScore > max)
+            {
+                result_final = result.toString();
+                max = currentScore;
+            }
+
+        }
+
+
+
+        return result_final;
+
+
+
+    }
+
+    public static String computerOpponent(String boardString, String diceRoll, int round) {
+
+        String[] choices = {"","","",""};
+        int tile_number = (boardString.length())/5;
+        Tile[] tile_array = new Tile[tile_number];      // Adjusting the length of tile_array to accomodate B2 piece copies
+        Board board = new Board();
+        int counter = 0;
+
+        for (int i=0;i<boardString.length();i=i+5)
+        {
+            String temp = boardString.substring(i,i+5);
+            tile_array[counter] = new Tile(temp.substring(0,2));
+            tile_array[counter].set_default();
+            tile_array[counter].translate(temp.substring(2,4));
+            tile_array[counter].rotate90(temp.charAt(4));
+            board.place_tile(tile_array[counter]);
+        }
+        int pieceCounter=0;
+        for (int i=0;i<diceRoll.length();i=i+2)
+        {
+            choices[pieceCounter] = diceRoll.substring(i,i+2);
+            pieceCounter++;
+
+        }
+
+        int initial_score = getBasicScore(boardString);
+
+        int max = initial_score;
+        String result_final = "";
+
+        Set result = board.generateMove(choices, round);
+
+        for (Object first : result)
+        {
+            if (isValidPlacementSequence(boardString+first.toString()))
+            {
+                max = getBasicScore(boardString + first.toString());
+                result_final=first.toString();
+                break;
+            }
+        }
+
+        for (Object x : result)
+        {
+            String newBoardString = boardString + x.toString();
+            if (!isValidPlacementSequence(newBoardString))
+                continue;
+            int currentScore = getBasicScore(newBoardString);
+            if ( currentScore > max)
+            {
+                result_final = x.toString();
+                max = currentScore;
+            }
+
+        }
+
+
+
+        return result_final;
+
+
+
+    }
+
+    public static String computerOpponentNoRestriction(String boardString, String diceRoll, int round) {
+
+        String[] choices = {"","","",""};
+        int tile_number = (boardString.length())/5;
+        Tile[] tile_array = new Tile[tile_number];      // Adjusting the length of tile_array to accomodate B2 piece copies
+        Board board = new Board();
+        int counter = 0;
+
+        for (int i=0;i<boardString.length();i=i+5)
+        {
+            String temp = boardString.substring(i,i+5);
+            tile_array[counter] = new Tile(temp.substring(0,2));
+            tile_array[counter].set_default();
+            tile_array[counter].translate(temp.substring(2,4));
+            tile_array[counter].rotate90(temp.charAt(4));
+            board.place_tile(tile_array[counter]);
+        }
+        int pieceCounter=0;
+        for (int i=0;i<diceRoll.length();i=i+2)
+        {
+            choices[pieceCounter] = diceRoll.substring(i,i+2);
+            pieceCounter++;
+
+        }
+
+        int initial_score = getBasicScore(boardString);
+
+        int max = initial_score;
+        String result_final = "";
+
+        Set result = board.generateMoveNoRestriction(choices, round);
+
+        for (Object first : result)
+        {
+            if (isValidPlacementSequence(boardString+first.toString()))
+            {
+                max = getBasicScore(boardString + first.toString());
+                result_final=first.toString();
+                break;
+            }
+        }
+
+        for (Object x : result)
+        {
+            String newBoardString = boardString + x.toString();
+            if (!isValidPlacementSequence(newBoardString))
+                continue;
+            int currentScore = getBasicScore(newBoardString);
+            if ( currentScore > max)
+            {
+                result_final = x.toString();
+                max = currentScore;
+            }
+
+        }
+
+
+
+        return result_final;
+
     }
 
+
     /**
-     * Given the current state of a game board, output an integer representing the sum of all the factors contributing
-     * to `getBasicScore`, as well as those attributed to:
-     * <p>
-     * * Longest railroad
-     * * Longest highway
+     * Author : Jihirshu Narayan
+     * Created : 10/05/2019
+     * Last Modified : -
+     * Description : This method follows the same implementation as basic score. However, in addition to basic score, we calculate the longest highway and
+     *                longest railway route as well and add that as bonus points to the basic score.
      *
      * @param boardString a board string representing a completed game
-     * @return integer (positive or negative) for final score (not counting expansion packs)
+     * @return an integer value representing advanced score which considers bonus points for longest highway and railway length
      */
-    public static int getAdvancedScore(String boardString) {
+
+    public static int getAdvancedScore(String boardString)
+    {
         // FIXME Task 12: compute the total score including bonus points
-        return -1;
+        if (!isValidPlacementSequence(boardString))
+            return -9999;                                       // returning absurdly large negative number which indicates that an invalid boardstring was received
+
+        if (boardString.isEmpty())
+            return 0;
+
+        int basicScore = 0;
+        int b2Counter = 0;
+        for (int i = 0;i < boardString.length();i=i+5)
+        {
+            if (boardString.substring(i,i+2).equals("B2"))          //Piece B2 will be treated as two individual piece on the same location. Counting B2 pieces in boardstring here
+                b2Counter++;
+
+        }
+        ArrayList<Route> routes = new ArrayList<>();
+
+        int tile_number = (boardString.length())/5;
+        Tile[] tile_array = new Tile[tile_number + b2Counter];      // Adjusting the length of tile_array to accomodate B2 piece copies
+        Board board = new Board();
+        int counter = 0;
+        for (int i = 0;i < boardString.length();i=i+5)
+        {
+            String temp_substring = boardString.substring(i,i+5);
+            tile_array[counter] = new Tile(temp_substring.substring(0,2));
+            tile_array[counter].set_default();
+            tile_array[counter].translate(temp_substring.substring(2,4));
+            tile_array[counter].rotate90(temp_substring.charAt(4));
+            board.place_tile(tile_array[counter]);
+            if (tile_array[counter].getName().equals("B2"))
+            {
+                tile_array[counter+1] = new Tile(temp_substring.substring(0,2));
+                tile_array[counter+1].set_default();
+                tile_array[counter+1].translate(temp_substring.substring(2,4));
+                tile_array[counter+1].rotate90(temp_substring.charAt(4));
+                tile_array[counter].shape[5] = 0;
+                tile_array[counter+1].shape[4] = 0;
+                counter++;
+            }
+
+
+            counter++;
+        }
+        Route route = new Route(tile_array[0]);
+        outer:
+        for (int i=1;i<tile_array.length;i++)
+        {
+            if (routes.isEmpty())
+                routes.add(route);
+            inner:
+            for (Route x : routes)
+            {
+                if (x.connectedToRoute(tile_array[i]))
+                    continue outer;
+            }
+            routes.add(new Route(tile_array[i]));
+        }
+
+        for (int i = 0;i<routes.size();i++)
+        {
+            for (int j = 0;j<routes.size();j++)
+            {
+                if (i!=j)
+                {
+                    if (routes.get(i).checkRoutesConnected(routes.get(j)))
+                    {
+                        routes.get(i).mergeRoutes(routes.get(j));
+                        routes.remove(j);
+                        i=0;
+                        j=0;
+                    }
+                }
+            }
+        }
+
+        for (Route x : routes)
+        {
+            int exits = x.numberOfExitsConnected();
+            if (exits == 12)
+                basicScore = basicScore + 45;
+            else if (exits > 1)
+                basicScore = basicScore + (4*(exits-1));
+        }
+
+        basicScore = basicScore + board.centreTileScore();
+
+        basicScore = basicScore - board.countErrors();
+
+        board.generateConnections();
+        board.getLongestHighwayCount();
+        board.getLongestRailwayCount();
+
+
+        return basicScore + board.longestRailway + board.longestHighway;
+
+
+
+
     }
-}
 
+
+}
Only in comp1110-ass2/src/comp1110/ass2: Route.class
Only in comp1110-ass2/src/comp1110/ass2: Route.java
Only in comp1110-ass2/src/comp1110/ass2: Tile.class
Only in comp1110-ass2/src/comp1110/ass2: Tile.java
Only in comp1110-ass2/src: gittest
Only in comp1110-ass2/tests/comp1110/ass2: classBoardTest.java
Only in comp1110-ass2/tests/comp1110/ass2: classTileTest.java
Only in comp1110-ass2/tests/comp1110/ass2: RouteTest.java
Only in comp1110-ass2/tests/comp1110/ass2: testBetterMoveGenerated.java
Only in comp1110-ass2/tests/comp1110/ass2: testInvalidStringGetBasicScore.java
Only in comp1110-ass2/tests/comp1110/ass2: TileToStringTest.java
```
## Test log
```
--javac output--
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: comp1110-ass2/src/comp1110/ass2/gui/Viewer.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
----
JUnit version 4.12
...
Time: 0.041

OK (3 tests)

JUnit version 4.12
......
Time: 0.055

OK (6 tests)

JUnit version 4.12
.....
Time: 0.032

OK (5 tests)

JUnit version 4.12
.....
Time: 0.091

OK (5 tests)

JUnit version 4.12
....
Time: 0.102

OK (4 tests)

JUnit version 4.12
.Sample game A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33A1A30S4E11A4E21A3C21A3C31S5F11
score 24
Sample game A3A10A3A52A3G10B2F10S1B50A2B61A0C60A1B41B1A35A4A41A2B31A1C30B0D32A2C50A4E10A3D12B2B10A2F01A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41
score 18
Sample game A2A30A0A43A3A50B2B50A4C50A3D50A2B43B0G12B0A14A2B33A0B11A4E50A3D61A2B21A3G52B1G45A3F52B2F41A3F33A1E40A1D40A3E32A3E27B0F10S0E12B1D17A4D01A1B61A0C43
score 21
Sample game A4A50A1F61A0B61S5F50B1F46A1F01S1F12A2F23A1E20B2D21A3D03A1C20A0B22B1A61A4D11A4G10B1G44A2G30A3C01A3C12B0B31A1B01A4B50B0C50A2F32A0E32A0E40A4D31B1D47A1B11
score 15
Sample game A4A50A1A30B2B31A0C34A3B41B2C40A3B52A2B60A2C62S5C50B1D65A4B21A2A60A3B10A4A10A4C10B2G10B2F10A4E10A3D12A1F01S2D00A4C00B1B02A0F23A0G20A2F61B2F50A3G52A0G02
score 23
Sample game A4G10B2F10A4E10A0F20A3D17A0E22A2E31B1E44S0D42A3D23A4D31A2F30B1F42A1G30A0C42A0C57B0C22A2F03A1E02S5D01A0B22B0A50A4D51A3D61B2B53A0B30B2A31A4E60A3A41A0B03
score 23
Sample game A3A10B2A31A1B30A0F61A4A21B1B14A4A41A4D61S2A50A5A63A2B01A1C02B0G52S0B63A0E63A2E51A4D51B0C32A5D31A5C61A0E41S5D41B1D03A5B51A4G10A0C42B0G30A2F52A5F12B2F21A0F00
score 26
Sample game A0B06A5A50A5A42A3B44A3C42A3D44B2D35B2C37A0B33A2B27A2E35B2C27A4C13A5C05A1F01B2D21A1F15A5D04A4D11A2E20B1B10A4A10S4E44A3E55A2F25S3F40B2F30A3D50A4D67
score 13
Sample game B2A37A3A43A3A54A3A21A5A14B2B20A0B30A4C20A1B17A2B07B2D05A0E04A1C00B0G16A0F13A0G32B2D11A5D20A0E10A5B51B2G46A4F40A5E42A0C15B1G52A5E50A1F03A2F63
score 18
Sample game A1A30A3D05A3C06B0B06A3C13A3C27B2C33A1B30B0D32A5E30A0A02A2A11S4E24S2D20A4D15B0B16A1E17A0E02A3C43A4B40A3A47A5A50A3C57B0D50A0E51A0E63A0F64
score 13
...
Time: 0.08

OK (4 tests)

JUnit version 4.12
.....
Time: 1.538

OK (5 tests)

JUnit version 4.12
.Sample game A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33A1A30S4E11A4E21A3C21A3C31S5F11
score 41
Sample game A3A10A3A52A3G10B2F10S1B50A2B61A0C60A1B41B1A35A4A41A2B31A1C30B0D32A2C50A4E10A3D12B2B10A2F01A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41
score 36
Sample game A2A30A0A43A3A50B2B50A4C50A3D50A2B43B0G12B0A14A2B33A0B11A4E50A3D61A2B21A3G52B1G45A3F52B2F41A3F33A1E40A1D40A3E32A3E27B0F10S0E12B1D17A4D01A1B61A0C43
score 42
Sample game A4A50A1F61A0B61S5F50B1F46A1F01S1F12A2F23A1E20B2D21A3D03A1C20A0B22B1A61A4D11A4G10B1G44A2G30A3C01A3C12B0B31A1B01A4B50B0C50A2F32A0E32A0E40A4D31B1D47A1B11
score 32
Sample game A4A50A1A30B2B31A0C34A3B41B2C40A3B52A2B60A2C62S5C50B1D65A4B21A2A60A3B10A4A10A4C10B2G10B2F10A4E10A3D12A1F01S2D00A4C00B1B02A0F23A0G20A2F61B2F50A3G52A0G02
score 42
Sample game A4G10B2F10A4E10A0F20A3D17A0E22A2E31B1E44S0D42A3D23A4D31A2F30B1F42A1G30A0C42A0C57B0C22A2F03A1E02S5D01A0B22B0A50A4D51A3D61B2B53A0B30B2A31A4E60A3A41A0B03
score 42
Sample game A3A10B2A31A1B30A0F61A4A21B1B14A4A41A4D61S2A50A5A63A2B01A1C02B0G52S0B63A0E63A2E51A4D51B0C32A5D31A5C61A0E41S5D41B1D03A5B51A4G10A0C42B0G30A2F52A5F12B2F21A0F00
score 41
Sample game A0B06A5A50A5A42A3B44A3C42A3D44B2D35B2C37A0B33A2B27A2E35B2C27A4C13A5C05A1F01B2D21A1F15A5D04A4D11A2E20B1B10A4A10S4E44A3E55A2F25S3F40B2F30A3D50A4D67
score 44
Sample game B2A37A3A43A3A54A3A21A5A14B2B20A0B30A4C20A1B17A2B07B2D05A0E04A1C00B0G16A0F13A0G32B2D11A5D20A0E10A5B51B2G46A4F40A5E42A0C15B1G52A5E50A1F03A2F63
score 39
Sample game A1A30A3D05A3C06B0B06A3C13A3C27B2C33A1B30B0D32A5E30A0A02A2A11S4E24S2D20A4D15B0B16A1E17A0E02A3C43A4B40A3A47A5A50A3C57B0D50A0E51A0E63A0F64
score 31
.
Time: 0.147

OK (2 tests)

```
