import java.util.*;
import java.io.*;

public class CSV
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int line, count = 0;
		String inFile, outFile, readLine, strLine;
		
		System.out.print("Enter input file name with path : ");
		inFile = sc.next();
		System.out.print("Enter output file name with path : ");
		outFile = sc.next();
		System.out.print("Convert line : ");
		line = sc.nextInt();
		
		try{
			FileReader fr = new FileReader(inFile);
			FileWriter fw = new FileWriter(outFile);
			BufferedReader br = new BufferedReader(fr);
			strLine = "";
			while((readLine = br.readLine())!=null)
			{
				count++;
				
				if(count<line){
					strLine+="\""+readLine+"\",";
				}else if(count==line){
					strLine+="\""+readLine+"\"";
					System.out.println(strLine);
					fw.write(strLine+"\n");
					strLine="";
					count=0;
				}
				
			}
			
			fr.close();
			fw.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	
}