package TestCase;

import java.io.IOException;

import DataEng.ExcelData;
import Keyword.Objlden;

public class DriverScrpt {
	public static void main(String[] args) {
		
		ExcelData da=new ExcelData();
		ExcelData dak=new ExcelData();
		Objlden idm=new Objlden();
		try {
			// 1st excel always test data
			da.Excel("C:\\Users\\BLTuser.BLT1204\\Documents\\Keyworddriven2.xlsx");
			// 2nd excel always keyword 
			dak.Excel("C:\\Users\\BLTuser.BLT1204\\Documents\\keyworddriven1.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<=da.rowco();i++)
		{
		 String SearchString=da.getCellVa(i,0);
		
		for (int j=1;j<=dak.rowco();j++)
		{
		 String keyword1=dak.getCellVa(j,2);
		 if (keyword1.equalsIgnoreCase("OpenBrow"))
		 {
			idm.OpenBrow(); 
		 }
		 else if (keyword1.equalsIgnoreCase("SetUrl"))
			 
		 {
			 idm.SetUrl();
		 }
		 else if(keyword1.equalsIgnoreCase("Search"))
		 {
			 idm.Search(SearchString);
		 }
		 
		 else if (keyword1.equalsIgnoreCase("closeBrow"))
		 {
			 idm.closeBrow();
		 }
		}
		}
	}

}
