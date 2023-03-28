## how to change Java version in Mac Os after installing multiple version of JDK
1. Right click on Finder -> Go to Folder...
2. type "/Library" and hit Enter
3. go to "/Library/Java/JavaVirtualMachines/". There you will see multiple folder which represent each java version. 
4. copy that folder name. IE "/Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home"
5. now go to terminal
6. `vi ~/.zshrc` 
7. and modify export JAVA_HOME to export JAVA_HOME="/Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home"
