/**
 * Reads a chosen CSV file of our preferences and prints each field.
 * 
 * @author Duke Software Team
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class FirstCSVExample {
	public void readFood() {
		FileResource fr = new FileResource();
		CSVParser parser = fr.getCSVParser();
		for (CSVRecord record : parser){
			System.out.print(record.get("Name") + " ");
			System.out.print(record.get("Favorite Color") + " ");
			System.out.println(record.get("Favorite Food"));
		}
	}
	public void countryInfo(CSVParser parser,String country)
	{//for each loop for through the csv
	    for(CSVRecord record:parser)
	    { if(record.get("Country").equals(country))
	        {
	            System.out.println(record.get("Country")+":"+record.get("Exports")+":"+record.get("Value (dollars)"));
	            return;
	        }
	    }
	    System.out.print("Not Country found");
	}
	public void tester()
	{FileResource fr=new FileResource();
	 CSVParser parser=fr.getCSVParser();
	 //countryInfo(parser,"Nauru");
              //listExportersTwoProducts(parser,"gold","diamonds");
	 // int num =numberOfExporters(parser,"gold");
         //  System.out.println(num+"CountriesEXports this good");
         bigExporters(parser,"$999,999,999,999");
        }
       
	public void listExportersTwoProducts (CSVParser parser,String export1,String export2)
	{
	    for(CSVRecord record:parser)
	    { String export=record.get("Exports");
	        if(export.contains(export1)&& export.contains(export2))
	        {System.out.println(record.get("Country"));
	        }
	    }
	}
	public int  numberOfExporters(CSVParser parser,String ExportItem)
	{ int numcountry=0;
	    for(CSVRecord record:parser)
	    {
	        String Exports=record.get("Exports");
	        if(Exports.contains(ExportItem))
	        {numcountry++;}
	    }
	    return numcountry;
	}
	public void bigExporters(CSVParser parser,String Exportvalue)
	{
	    int length=Exportvalue.length();
	    for(CSVRecord record :parser)
	    {String value=record.get("Value (dollars)");
	        if(value.length()>length)
	        {System.out.println(record.get("Country" )+" "+record.get("Value (dollars)"));
	         }
	     }
	}
	
	
}
