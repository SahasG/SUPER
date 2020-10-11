# SUPER

S.U.P.E.R – Super Ultimate Power Epic Raider
This program is for helping with entertainment and more importantly to allow the user to use problem solving and creativity to progress through the game. As this
game requires strategy and careful thinking it can help improve focus and with the variety of possibilities available it encourages the user to be open minded. The
program will use Java FX as the front end to animate the dungeon and probably a stack to hold the data at the backend such as the user’s save files. This is a
dungeon game where the user must attempt to leave the dungeon by clearing 100 floors where enemies can appear and attack them. At the end of each level the user 
gets stronger and gets an item that may help them and from the next floor the monsters will also power up. Also, the fights against monsters are turn based where 
they will be able to use their class abilities to attack monster with the help of MP – magic power – and survive with their HP – health points.

The primary stakeholder for the program is people of all ages who want to enjoy a game that involves a lot of strategy and problem solving. As it targets the 
general audience it is very easy to pick up and learn for both younger and older people. 


# Front-End

Starting Menu: The menu will feature an opening screen with a button to either start the game and quit along with a picture of the title and a sprite of the player.

Character Selection Screen: After the starting menu the player will be taken to character selection if they choose to start the game. The screen will feature a 
choice of three different classes: Wizard, Knight or Thief. After selecting their class, they can press the button at the bottom of the screen that will allow them 
to either confirm and go to the game or return to the main menu.

Game Screen: The game screen will begin in a single room with arrows pointing in the directions which the player can travel in. As it is a maze dungeon, the dungeon
it will be randomized and so the pathway to the staircase into the next level will not be the same and the player must navigate through the maze. As the player can 
only see the room, they are in so they may have to remember the pathway they took so they can backtrack. The player can go in any direction that has an arrow which
only includes forward, backwards, and to the left and right. There is also a 50 percent chance of a monster appearing when entering or reentering a room and so the
user must attempt to find a way out of the dungeon floor before they lose all their health. At the end of the floor they will regain all their health and gain an 
item. 

Save Screen: At the 25th, 50th, 75th and 100th floor there will be save points. If they beat the floor, the floor will serve as a checkpoint if they lose in any 
higher floor. 

Ending Screen: The screen will congratulate the player for successfully reaching the end of the game and completing all 100 floors and will allows the user to exit
or try again with a different class.

# Back-End

The data being stored for the program is mainly within the different objects which are stored in the heap. However, the game does have the option to save their 
progress and continue from the save file. This can be stored within a stack so their latest save file can be popped out and the user can continue from the save 
point. A stack is very efficient for this as the ability to access the most recent data helps in this case as the user can either start from the latest save file or 
an older save file by going back through the stack.

# Class Summary

![UML Diagram](/UML.png)
