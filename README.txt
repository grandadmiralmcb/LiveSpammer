--------------------------------------------------------------------------------

To use this program, you must supply a username and password for the site you
are trying to POST to.  Enter the URL you are trying to POST to, e.g. the
default parameter is "http://live.xbox.com/en-US/MessageCenter/Compose"
for POST'ing messages to the Xbox Live messaging system.  If you leave URL
blank, this is the site you will POST to.

Parameters can be specified in any .txt file that you choose, in the format of
key:value.

For example, the message box on the Xbox Live messaging system is named
"reply0."  To POST a message of "Hello, World" to the message box, the parameter
I would put in my file would be:

reply0:Hello, World

Parameters are separated by a newline character.

--------------------------------------------------------------------------------