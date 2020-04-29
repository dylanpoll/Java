This is a managment system to deploy a node.js bot.

the node bot in use is a email crawler that checks for keywords, this does not include the node.js bot.

this only includes the source code for the java part of this system.

first it brings the user to a configuration menu, to add in details, 
like:
a mongoDB key
{email address+password}

the user can add as many emails as they want but only one database key at the moment. 

after the user exits the configuration menu, it will then :
deploy the node.js bot using the email from index 1

upon finishing that deployment it will
swap out credentials for the next indexed email

it will do this for however many email addresses are on file. 



it works by reading and writing the .env files and generating email and password arrayLists and the size of those arrayLists
is used to facilitate a for loop that when completed gives the system a cooldown period before re-starting the loop.

it calls the node.js bots by use of processbuilder, and declarations of the working directory it is in, and relative pathways
to the needed files. 
process builder calls CMD in this, so this is currently for Windows, but will soon be ported over to shell for use on linux. 
the process builder pulls the contents in the CMD window with buffered reader, and repeats them to the java program.
it is hard codded to issue the command "node emailParser.js" in its designated directory. 
