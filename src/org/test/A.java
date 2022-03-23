package org.test;

public class A {
		public static void main(String[] args) {
			String s="Welcome to class java";
			
			String replaceAll =s.replaceAll(s,"Welcome to class sql");
			System.out.println(replaceAll);
          
			String s1="Greens Adayar";
			
			String replaceAll1 =s1.replaceAll(s1,"Greens Omr");
			System.out.println(replaceAll1);
			
            String s2="Welcome to java class";
			
			String replaceAll2 =s2.replaceAll(s2,"Welcome#to#java#class");
			System.out.println(replaceAll2);
			
			 String s3="Nishakerala24@gmail.com";
			 
			 boolean contains=s3.contains("gmail");
			 System.out.println(contains);
				
			String replaceAll3 =s3.replaceAll("gmail","yahoo");
			System.out.println(replaceAll3);
			
			String s5="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
			 
			 boolean contains1=s5.contains(",pincode-626101");
			 System.out.println(contains1);
				
			String replaceAll4 =s5.replaceAll(",pincode-626101"," ");
			System.out.println(replaceAll4);
			
			
		}
			
			
			  
	    
	    
  }


