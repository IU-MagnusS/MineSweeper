## Minesweeper

This is a Java implementation of the classic Minesweeper game. The game includes basic features such as flagging bombs (F) and revealing the number of adjacent bombs (numbers 10). In addition, it also includes two extra features: `Undo` and `Reset`. The game board is 16x16 grid as an Intermediate mode 

## Function

Here is the list of Minesweeper game functions:

- Put a flag to mark the boxes with bombs
- Color the cells without bombs to find the tiles with bombs
- `Undo` to return to the previous turn
- `Reset` to start the game again
- Table size 16x16 

## MineSweeper-GUI
A Java implementation of the classic game Minesweeper using Model-View-Controller. One user graphical user interface is implemented with Java Swing and AWT libraries

Minesweeper Implementation Rules and Play:
- This implementation of Minesweeper allows an Intermediate (16x16 grid with 40 mines).
- In Minesweeper, you are given a board of tiles which may contain mines ("F") or be empty (" ").
- If you click on a tile with a mine, and you do not have any more lives, you lose.
- If you click on a tile and an empty square appears, it indicates that no bombs are immediately adjacent to that tile, and so all surrounding tiles will be displayed.
- The objective is to fill in all non-mine tiles by clicking them (and optionally flagging the mine tiles).
- To flag ("F") a tile you think is a mine, point and right-click. 
- To unflag a tile you previously flagged, point and right-click again.
- The number of mines minus the number of flags used. 

### Game.java 
- JFrame frame: the main window of the game
- JPanel status_panel: the status information panel at the bottom of the window
- JLabel status: the current status information of the game
- GameBoard board: the board containing the squares and bombs of the game
- JPanel control_panel: the control panel at the top of the window
- JButton reset: the button to reset the game
- JButton undo: the button to undo previous moves

### MVC (Model-View-Controller) architecture is used in this game:
- `Model:` MineSweeper.java (game logic class)
- `View:` GameBoard.java (class that contains the GUI and displays the game's state)
- `Controller:` MouseAdapter() and methods in GameBoard.java (handles game events such as mouse click or game reset)

## Download

To play Minesweeper game, you need to install Java Development Kit (JDK) and Eclipse IDE.
Once you have installed the JDK and Eclipse IDE, you can download the source code of this project from [Github](https://github.com/IU-MagnusS/MineSweeper).

## License

This project is distributed under the [MIT License](https://github.com/[MagnusS]/Java-Minesweeper/blob/main/LICENSE). You are free to use and distribute this project under the terms of this license.

## Demo
![Demo](https://github.com/IU-MagnusS/MineSweeper/blob/main/MineSweeperProj/MineSweeper.gif)

## Acknowledgments

This project was inspired by the classic Minesweeper game and was created as a learning exercise in Java programming. Special thanks to [anyone you would like to acknowledge for their support and guidance during the development of this project.

## Conclusion

Thank you for checking out this Java Minesweeper game! I hope you find it enjoyable and useful for learning Java programming. If you have any feedback or suggestions for improvement, please let me know via [Magnus](mailto:magnusnguyen7@gmail.com)
