Firstly, enter <cd folderpath> to the root directory containing the pom.xml file
Secondly, run the command:  jar cfm WordAnalysisProject-1.0-SNAPSHOT.jar target/META-INF/MANIFEST.MF -C target/classes . 
Thirdly, run the following command to see the results: java -cp WordAnalysisProject-1.0-SNAPSHOT.jar WordCount "This is a Sample string"
"This is Sample string" can be replaced by any of the other string you want to test.
