package manipulations;
import java.util.Scanner;

public class Total_Words {

	
		
		    public static int word(String s1) {


				char ch[]=s1.toCharArray();
				int count=0;
				for(int i=0;i<ch.length-1;i++)
				{
					if(ch[i]==' ' && ch[i+1]!=' ')
					{
						count++;
					}
				}
					if(ch[0]==' ')
					
						return count;
					
					else
						return count+1;
					
				
				
			}
		    public static void main(String[] args) 
		    
			
			 {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the string");
				String s1=sc.nextLine();
				System.out.println("count=" + word(s1));
				
			}
		


	}

