package parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import static extras.FileNames.*;

public class ParseDocument 
{

	public static void main(String[] args) 
	{
		try
		{
			new ParseDocument().parse(D_R_O, D_R_R);
			System.out.println("<<Done parsing document>>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void parse(String input, String output)throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader(input));
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		
		br.readLine(); //ignore the header line
		
		String line = "";
		int count = 1;
		String arg1 = "", type1 = "", rel = "", arg2 = "", type2 = "";
		
		while((line = br.readLine()) != null)
		{
			if(line.trim().length() == 0)
			{
				count = 1;
				bw.write(arg1 + "\tA1:[" + type1 + "]\t" + rel + "\t[" + type2 + "]\t" + arg2);
				bw.write("\n");
				continue;
			}
			
			count++;
			
			String[] elements = line.split("\t");
			int len = elements.length;
			
			if(count == 2)
			{
				arg1 = elements[2];
				if(elements[len - 1].contains(":"))
				{
					type1 = elements[len-1].substring(0, elements[len - 1].indexOf(':'));
				}
			}
			else if(count == 3)
			{
				rel = elements[len - 1];
			}
			else if(count == 4)
			{
				arg2 = elements[2];
				if(elements[len - 1].contains(":"))
				{
					type2 = elements[len - 1].substring(0, elements[len - 1].indexOf(':'));
				}
			}
		}
		
		br.close();
		bw.close();
	}

}

