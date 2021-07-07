# update
I made this before I knew what docker was. I feel like thats all that really needs to be said here... it accomplishes the same goal of making sure my node bots re launch if they ever do crash, but in a much less ideal and reliable way. it also does some of the most redundant json manipulation as I did not know about json libraries/modules existing at the time of originally making this so I handles json manually.

I honestly only keep this up to remember where I started.. but this is true for other repos.

#original read-me below
so far.... 767 lines of code.

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

it also reads a json file generated from a node.js bot that pulls collection documents from a mongo database and strips them down to just the string values and places them into a .env file for easier access.

markdown
![example](https://github.com/dylanpoll/Java/blob/master/nodeEmailCrawlDeployAndManagementSystem/serverdone.png?raw=true)
