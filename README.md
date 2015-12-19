# NLP-project

Input:  news_articles.txt, 
	    manual_schema_original.txt
Output: results.txt
Required Files: 
1. json-simple-1.1.1
2. stanford-corenlp-3.5.1-models
3. stanford-corenlp-3.5.1
4. relgramtuples-app
5. textual-entailment running as service (go to textual-entailment directory and run following from terminal: i) sbt, ii) service/reStart)

Instructions to run:
1.   Copy required schema lines in manual_schema_original.txt.
2. 
i)   Save news article in news_articles.txt.
ii)  Run ParseDocumentForRelgramsApp.java to output news_relgram_input.txt.
iii) Copy news_relgram_input.txt in relgramtuples-app directory.
iv)  Go to relgramtuples-app directory from terminal and run the following command:
	 java -cp lib/relgramtuples-1.0.0-SNAPSHOT-jar-with-dependencies.jar edu.washington.cs.knowitall.relgrams.apps.RelgramTuplesApp --wnHome resources/wordnet3.0 --wnTypesFile resources/wordnet-selected-classes.txt --ne7ModelFile resources/english.muc.7class.nodistsim.crf.ser.gz --ne3ModelFile resources/english.all.3class.nodistsim.crf.ser.gz -mpp resources/engmalt.linear-1.7.mco news_relgram_input.txt document_relgram_original.txt
v)   copy generated document_relgram_original.txt in workspace	
3.   Run ParseDocument.java and ParseSchema.java to parse above files.
4.   Run TextEntail.java to see desired output.

Steps to run the web interface:
1.   Add the external jar "mysql-connector-java-5.1.37-bin.jar" to the BuildPath of the project in eclipse. The jar file is available in "WebContent\WEB-INF\lib" folder of the project.
2.   Download and install tomcat version v7.0 and associate the project with this server.
3.   Start the server and browse to the following url:
     http://localhost:9999/NLPproj_webinterface/news1
