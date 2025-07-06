package ImpPrograms;

public class Capitalword2ndtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i have myself";
		String[] st=str.split(" ");
		String output="";
		String temp="";
		for(String word:st)
		{
			for(int i=0;i<word.length();i++)
			{
				{
					if(i==0) 
					{
						output=output+word.charAt(i);
						output=output.toUpperCase();
					}
					else
					{
						output=output+word.charAt(i);
					}
//					temp=temp+" "+output;
//					output="";
					
				}
				
			}
			
			temp=temp+" "+output;
			output="";
			}
		
		System.out.println(temp.trim());
	}

}
