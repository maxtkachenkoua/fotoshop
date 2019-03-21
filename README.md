# fotoshop
upwork contract

# Refactoring done

# Editor.java
1. Avoid using package default acccess, change to private for class variables.
2. Default constructor doesn't have any parameters, so makes no sense to 
create instance of parser on constructor. Use inline object initialization.
3. Parser has to be final, providing class immutabiity. 
4. Default constructor with empty body can be removed. 
It will be used by java compiler implicitly. 
5. edit() function  while-loop can be replaced in one line:
6. Replace multiple System.out.print() with String Builder. 
7. Replace concatenation of filters1.N with java streams with joiner. 
8. method processCommand: 
   replace several if-else checks with switch block. 
9. printHelp replace several system.out.println() with stringbuilder
10. look() replace used filters joining with streams. 

# CommandWords.java
1.Empty default constructor is not required
2. Change validCommands type to List<String>
3. isCommand method. use contains() to simplify search

# Parser.java
1. Make commands and scanner objects final, make inline initialization, 
2. getComand() change if-else to ternary return operator.

# ColorImage.java
1. setPixel - optimize to one line
2. getPixel - optimize to one line

# Command.java
1. Make class fields immutable. 

