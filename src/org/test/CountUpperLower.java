package org.test;

public class CountUpperLower {
	public static void main(String args[]){
String str = "Welcome To Java class @123";
int upper = 0, lower = 0, number = 0, special = 0;
for(int i = 0; i < str.length(); i++)
{
    char ch = str.charAt(i);
    if (ch >= 'A' && ch <= 'Z')
        upper++;
    else if (ch >= 'a' && ch <= 'z')
        lower++;
    else if (ch >= '0' && ch <= '9')
        number++;
    else
        special++;
}
System.out.println("caps count : " + upper);
System.out.println("small count : " + lower);
System.out.println("number count : " + number);
System.out.println("Special char : " + special);
}
}
