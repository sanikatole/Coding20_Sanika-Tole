// 18. How to calculate the number of vowels and consonants in a string?

import java.util.*;
class Vowel
{
  public static void main(String args[])
  {
  String str = "Maharashtra";
  int vowels=0, consonants=0;
  str = str.toLowerCase();
  for(int i=0;i<str.length();i++)
  {
  char ch = str.charAt(i);
  if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
  {
    vowels++;
  }
  else 
  {
    consonants++;
  }
  }
  System.out.println("Vowels: " + vowels);
  System.out.println("Consonants: " + consonants);
  }
}
