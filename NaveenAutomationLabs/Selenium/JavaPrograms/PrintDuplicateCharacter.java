package JavaPrograms;

import java.util.HashMap;

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa="I love Coading";
		char words[]=aa.toCharArray();
		HashMap<Character,Integer> charmap=new HashMap<Character,Integer>();
		for(char ch:words)
		{
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch)+1);
			}
			else {
				charmap.put(ch, 1);
			}
		}
		System.out.println(charmap);
		
		String str="vijayshetty";
		int count=0;
		for(char e:str.toCharArray())
		{
			if(e=='y')
			{
				count++;
			}
		}
		System.out.println('y'+"="+count);
		occuranceOfCharacter("karanataka", 'k');
		getCharacterCount("karanataka", 'k');
	}
	
	public static void occuranceOfCharacter(String Str,Character cha)
	{
		int count=0;
		for(char e:Str.toCharArray())
		{
			if(e==cha)
			{
				count++;
			}
		}
		System.out.println(cha+"="+count);
	}
	public static void getCharacterCount(String str,Character cha)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==cha);
			count++;
				
		}
		System.out.println(cha+"="+count);
	}

}
