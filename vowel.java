import java.util.Scanner;
class vowel
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  char vowel='a';
switch(vowel)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':System.out.println("vowel");
         break;
default:System.out.println("consonants");
}
}
}