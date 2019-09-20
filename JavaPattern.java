package assignment;

/*
 Mila 
 Assignment 2.2
 
 This program displays word Java in a specific pattern
 */
public class JavaPattern {

	public static void main(String[] args) {

		    //Declare count
		    int count = 2;
			
			//Does for loop until count equals 0
			while(count > 0)
			{
				//Declare i
				int i = 4;
				//Displays the variable i until it equals count.
				while(i != 0)
				{
					if(i == 4 || i == 1)
					{
						System.out.print("  " + i + " ");
						System.out.println(i + "  \t \t 11");
					}
					else if(i == 3 || i == 2)
					{
						System.out.print(i+ " ");
						System.out.print(i+ " ");
						System.out.print(i+ " ");
						System.out.println(i+ " \t 11");
					}
					i--;
				}
				System.out.println("\t \t 11");

				
				//Increase count by 1
				count--;
			}
		  }
		}
