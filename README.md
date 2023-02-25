This app is the recreation of a live code session we got about creating a Black Jack game in Java using UML notation.

This project has educational purpose only.

Link that led to the implementation of the solution: https://github.com/tobias-dv-lnu/evoBlackJack

UML notation to implement the solution: 

![alt text](/BlackJackDiagram.jpg)

1) Ok so the first thing I remember was to make the enumeration of the values and the color, hence creating the class for that.

2) Then, it's time to create the card. We should remember that the goal of the card is to be created, to be hidden or shown, to give back a value and a colour taken from the enumeration classes (Colour and Values). This could be possible to create the enumeration directly into the card class. Let's then create the class card with the method: Hide, show, getValue, getColour

Notes: whyen enumerating something, we can send back enumerationClass.valuewanted. Example: Colour.Hidden

3) Then we will make the card which is basically an array of cards. To do so, we will start by creating the deck at the beginning which means we will start to create the cards according to the number of colours and values we have. 
To do so, we create a nested for loops, one for the colours, the other one for the values. In the list, we have also the value Hidden, inside of it, we need to insert a Count value to get the number when a counter goes onto the Count. We do that using the Colour.Count.ordinal()
Then we create new cards and to create them we call the constructor and to get the values we use Coloiur.values().['number']

After that, we need to create a method that get a random card. We need to generate a random number modulo the size of the deck. Create a new card and insert the chosen card and then remove it from the deck.

The we create a shufle method, where we get a random card 1017 times. 

Then a get top card method where we ask for the card on top of the deck

4) In forth, we will create a hand class where we will stock the cards, so an array of cards. The class has no constructor, only an array list.

Then we need to make a getScore method where we will hard code heach card and its value. Then we loop among the cards to get the value. If the socre is superior to 21 and there is an Ace, then the ace become 1

We also need to override the toString method to bring back the number of cards we have

5) Now we will make the method Player, basically, a player only has a hand as attribute, then as method: addCrad, wantsToHit, isBust, getScorre, and a toString

WantsToHit means that as long as the player is under 19 he wants to hit. So big risks to loose

6) We then need to do the dealer classs which is the longest one. It has the attribute: Hand and Deck. It has the methods:  isBust(), wantsToHit(), play(Player), startGame(Player), playGame(Player), endGame(Player), dealCardTo(Player), dealCardTo(), playersTurn(Player), dealersTurn()