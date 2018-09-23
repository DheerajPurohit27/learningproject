package strings;
public class StringFunctions {
	

	//Concatenate two strings
		public void concatenate(){
			String firstname="Amit";
			String lastname="Kumar";
			String fullname="";
			fullname=firstname.concat(lastname);
			System.out.println(fullname);
			System.out.println(firstname+lastname);
			
		}
		
		
		//Replace a character in the string
			public void replace(){
				String name="Amit";
				String firstName=name.replace('A','S');
				System.out.println(firstName);
				
				String lastName=name.replace("Am","Sum");
				System.out.println(lastName);
			}
		
		
		//reverse a string and check whether it is a palindrome or not
			public void reverse(){
				String name="Madam";
				String rev="";
				for (int j = name.length()-1; j>=0; j--) {
					rev=rev+name.charAt(j);
				}
				System.out.println(rev);
				
				if(rev.equalsIgnoreCase(name)){
					System.out.println("Reversed string is "+rev+" and it's a palindrome");
				}else{
					System.out.println("Reversed string is "+rev+" and it's not a palindrome");
				}
			}
			
			
		//compare two strings
			public void comparision(){
				String name1="Amit";
				String name2="amit";
				String name3="Suman";
				String name4="Aman";
				String name5="Amitabh";
				System.out.println(name1.compareToIgnoreCase(name2));  //Output = 0; exact match (Case is ignored)
				System.out.println(name1.compareToIgnoreCase(name3));  //Output = -18; first character itself didn't match
				System.out.println(name1.compareToIgnoreCase(name4));  //Output = 8; Third character didn't match, hence difference of third character
				System.out.println(name1.compareToIgnoreCase(name5));  //Output = -3; Three extra characters after the exact match
				}	
			
			
		//copy from one string to another
			/*public void copyString(){
				String name1="Mummy";
				String name2="";
				for (int j = name.length()-1; j>=0; j--) {
					
				}
				System.out.println(rev);	
			}*/	
			 
		//StartWith and EndWith
			public void Validate(){
				String[] name={"Amit", "Sumit", "Aman", "Kundan"};
				for(String n:name){
					if(n.startsWith("Am")){
					System.out.println(n +" Starts with Am");	
					}
				}
				
				for(String n:name){
					if(n.endsWith("an")){
					System.out.println(n +" ends with an");	
					}
				}
			}
				
			//Find index of the character, Sub String and replace in the given string
				public void findIndex(){
					String str="abcadeifsgdheadsi";
					System.out.println(str.indexOf('i'));    //Output: 6; Index of first occurrence of i in the string from left
					System.out.println(str.indexOf('a',2));  //Output: 3; Search of a starts from index 2
					System.out.println(str.indexOf("ad",4)); //Output: 13; Search of "ad" starts from 4th index 	
					System.out.println(str.substring(3)); // Output: adeifsgdheadsi; finds the string from 3rd index 
					System.out.println(str.substring(1, 3)); // Output: bc; finds the string from 1st index till 3rd index in the string
					System.out.println(str.replace(str.substring(0,3), "Am")); 
					System.out.println(str.replace((str.charAt(4)),'A')); //Output: abcaAeifsgdheadsi;
				}	
				
				//Convert in upper case or Lower case
				public void changeCase(){
					String firstName="amit";
					String lastname="KUMAR";
					String fullName="AmitKumar";
					
					System.out.println(firstName.toUpperCase());
					System.out.println(lastname.toLowerCase());
					System.out.println(fullName.toUpperCase());
					System.out.println(fullName.toLowerCase());
					System.out.println(fullName.contains("kumar"));
					System.out.println(fullName.contains("Kumar"));
				}
				
				
				//Trim the preceding and trailing blank spaces
				public void trimSpaces(){
					String firstName="    amit   ";
					String lastName="     amit kumar   ";
					System.out.println("Before Triming: "+firstName);
					System.out.println("After Triming: "+firstName.trim());
					System.out.println("Before Triming: "+lastName);
					System.out.println("After Triming: "+lastName.trim());
							
				}
				
				
				//Find the duplicate characters and remove them
				/* public void findDuplicate(){
				    String str="heysunonaitsmeagain";
				    					
					ArrayList<String> st=new ArrayList<>();
					String strNew="";
					Iterator<E> it=st Iterator();
					while(it.hasNext()){
						st.add(strNew);
											
					}
					
										
				} */
				
				
				//Print output as "World Hello" from a input "Hello World"
				public void SplitandReverse()
				{
						String input="Hello World";
						String[] words = input.split(" ");
						
						StringBuilder ReverseString = new StringBuilder(input.length());
						
						for(int i=words.length-1;i >= 0;i--)
						{
							ReverseString.append(words[i]);
							ReverseString.append(" ");
						}
								
						System.out.println("Result String: "+ ReverseString.toString());
					}
				
				//Print output as "olleh dlrow" from an input string "Hello World" 
				public void SplitandReverseAtPlace()
				{
					 String name="Hello World"  ;
				     String[] word=name.split(" ");
				     String reversename=" ";
				     int i,j;
				     for(i=0;i<word.length;i++){
				      String str=word[i];
				      String revstr=" "   ;
				      for(j=str.length()-1;j>=0;j--){
				         char chr=str.charAt(j) ;
				         revstr=revstr+chr;
				      }
				      reversename =reversename + revstr ;
				    }
				    System.out.println(reversename);
						
				}
				
			public void removeSpaces(){
				
				String str="Hello world";
			 //1. Using replaceAll() Method
				String strWithoutSpace = str.replaceAll(" ", "");
				System.out.println(strWithoutSpace);
		        
			//2. Without Using replaceAll() Method
		 
		        char[] strArray = str.toCharArray();
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < strArray.length; i++)
		        {
		            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
		            {
		                sb.append(strArray[i]);
		            }
		        }
		        System.out.println(sb); 
			}
				
		public static void main(String[] args){
			
			StringFunctions obj=new StringFunctions();
			
			obj.concatenate();
			obj.replace();
			obj.reverse();
			obj.comparision();
			obj.Validate();
			obj.findIndex();
			obj.changeCase();
			obj.trimSpaces();
		//	obj.findDuplicate();
			obj.SplitandReverse();
			obj.SplitandReverseAtPlace();
			obj.removeSpaces();

		}

	}

