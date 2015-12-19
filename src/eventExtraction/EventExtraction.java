package eventExtraction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

import parser.ParseDocument;
import parser.ParseDocumentForRelgramsApp;
import parser.ParseSchema;
import textual_entailment.TextEntail;

public class EventExtraction 
{
	public static void main(String[] args)
	{
		HashSet<String> res = new HashSet<String>();
		EventExtraction ee =new EventExtraction();
		res = ee.getGoodMatches(args);
		for(String s: res)
			System.out.println(s);
	}
	
	public HashSet<String> getGoodMatches(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> goodMatchesDoc = null;
		
		try
		{
			System.out.println("textual-entailment is running as service (Y-YES, N-NO)\t");
			if(!br.readLine().equalsIgnoreCase("y"))
			{
				throw new Exception("--Please run textual-entailment--");
			}
			
			System.out.println("Copy required schema lines in manual_schema_original.txt (Y-YES, N-NO)\t");
			if(!br.readLine().equalsIgnoreCase("y"))
			{
				throw new Exception("--Please copy required schema lines in manual_schema_original.txt--");
			}
			
			ParseSchema.main(args);
			
			System.out.println("Copy news article in news_article.txt (Y_YES, N-NO)\t");
			if(!br.readLine().equalsIgnoreCase("y"))
			{
				throw new Exception("--Please copy news article--");
			}
			
			ParseDocumentForRelgramsApp.main(args);
			
			System.out.println("Copy news_relgram_input.txt in relgramtuples-app directory");
			System.out.println("<<Run the command below from the terminal:>>");
			System.out.println("java -cp lib/relgramtuples-1.0.0-SNAPSHOT-jar-with-dependencies.jar "
					+ "edu.washington.cs.knowitall.relgrams.apps.RelgramTuplesApp"
					+ " --wnHome resources/wordnet3.0 --wnTypesFile resources/wordnet-selected-classes.txt "
					+ "--ne7ModelFile resources/english.muc.7class.nodistsim.crf.ser.gz "
					+ "--ne3ModelFile resources/english.all.3class.nodistsim.crf.ser.gz "
					+ "-mpp resources/engmalt.linear-1.7.mco "
					+ "news_relgram_input.txt document_relgram_original.txt");
			
			System.out.println("Copy generated document_relgram_original.txt in workspace (Y-YES, N-NO)\t");
			if(!br.readLine().equalsIgnoreCase("y"))
			{
				throw new Exception("--Pleas copy relgram output in workspace--");
			}
			
			ParseDocument.main(args);
			
			TextEntail text_entail = new TextEntail();
			goodMatchesDoc = text_entail.getGoodMatches();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return goodMatchesDoc;
	}
}
