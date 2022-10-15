package Org.Testing.TestScripts;

public class Array {
  public static void main(String[] args) {
	  
 String name="My name is deepak";
 String[] s1=name.split(" ");
 int len=s1.length;
 String s2="";
 String s3="";
 for(int i=name.length()-1;i>=0;i--)
 {
         s3=s3+	name.charAt(i);
 }
  System.out.print(s3);
}
}
