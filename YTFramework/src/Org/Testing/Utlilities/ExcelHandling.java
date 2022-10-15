package Org.Testing.Utlilities;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelHandling {

	public void writedata(int rowno) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../YTFramework/Part1.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("DC", 0);
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==rowno)
				{
				System.out.println("Enter the details for " +i);
				String s=sc.next();
				Label l=new Label(j, i, s);
				ws.addCell(l);
				}
				
			}
		}
		wk.write();
		wk.close();
	}
	

	public void writedatarange(int ini,int fin) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../YTFramework/Part1.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("DC", 0);
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==ini && j==fin)
				{
				System.out.println("Enter the details for ");
				String s=sc.next();
				Label l=new Label(j, i, s);
				ws.addCell(l);
				}
			}
		}
		wk.write();
	}
	
	
	
	public void readparticularrow(int rowno) throws BiffException, IOException
	{
		File f= new File("../YTFramework/amanexcel.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet s= wk.getSheet(0);
		
		int row=s.getRows();
		int col=s.getColumns();
		
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)	
		{
			if(i==rowno)
			{
			Cell c=s.getCell(j, i);
			System.out.println(c.getContents());
			}
		}
		}
	}
	
	public void readparticularcol(int colno) throws BiffException, IOException
	{
		File f= new File("../YTFramework/amanexcel.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet s= wk.getSheet(0);
		
		int row=s.getRows();
		int col=s.getColumns();
		
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)	
		{
			if(j==colno)
			{
			Cell c=s.getCell(j, i);
			System.out.println(c.getContents());
			}
		}
		}
	}
	
	
	public void readinrange(int rown, int coln) throws BiffException, IOException
	{
		File f= new File("../YTFramework/amanexcel.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet s= wk.getSheet(0);
		
		int row=s.getRows();
		int col=s.getColumns();
		
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)	
		{
			if(i==rown && j==coln)
			{
			Cell c=s.getCell(j, i);
			System.out.println(c.getContents());
			}
		}
		}
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		ExcelHandling q=new ExcelHandling();
		q.readinrange(3,3);
	}
	}
	
	
	

