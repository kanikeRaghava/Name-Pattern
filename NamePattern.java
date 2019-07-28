import java.util.Scanner;
class NamePattern{
	public static void main(String args[])
	{
		int n=8;//height of the pattern
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=(sc.next()).toUpperCase();
		int len=s.length();
	
		
	for(int k=0;k<len;k++)
	{

		char a=s.charAt(k);
		
		
	
     switch(a)
     	{  
      
           case 'A':
             
      			for(int i=0;i<=n;i++)
      			{ 
       				for(int j=0;j<=n;j++)
       					{	
          					if(j==0&&i>=n/2||i+j==n/2||j==n/2+i||j==n&&i>=n/2||i==n/2)
          						System.out.print("*");
          					else
          						System.out.print(" ");
       					}
       				System.out.println("");
      			} 
      			System.out.println();
      			
    		break; 

    	case 'B': 
           
      			for(int i=0;i<=n;i++)
      			{ 
       				for(int j=0;j<=n;j++)
       					{
          					if(i==0||i==n/2||j==0||j==n||i==n)
          						System.out.print("*");
          					else
          						System.out.print(" ");
       					}
       				System.out.println();
      			}
      			System.out.println();
      			

  
    		break;  

    	case 'C': 
    		
      			for(int i=0;i<=n;i++)
      			{ 
       				for(int j=0;j<=n;j++)
       					{
          					if(i==0||j==0||i==n)
          						System.out.print("*");
          					else
          						System.out.print(" ");
       					}
      				 System.out.println();
      			}
      			System.out.println();
      			
  
    		break;

    	case 'D': 
           
      			for(int i=0;i<=n;i++)
                 { 
       				for(int j=0;j<=n;j++)
       				{
          				if(i==0||j==0||i==n||j==n)
         				 System.out.print("*");
          				else
          				 System.out.print(" ");
       				}
       				System.out.println();
      				
      			 }
      			System.out.println();
      			

      		break; 

      	case 'E': 
      	       
       			for(int i=0;i<=n;i++)
      	  			{ 
      	  			 for(int j=0;j<=n;j++)
      	  			 {
      	  			       if(i==0||j==0||i==n||i==n/2)
      	  			         System.out.print("*");
      	  			       else
      	  			    	 System.out.print(" ");
      	  		     }
      	  			 System.out.println();
      	  		     				
      	  			 }
      	  			
      	  			System.out.println();

      	  		break; 

      	case 'F': 
      	       
       			for(int i=0;i<=n;i++)
       			      { 
       			       for(int j=0;j<=n;j++)
       			       {
       			          if(i==0||j==0||i==n/2)
       			          System.out.print("*");
       			          else
       			          	System.out.print(" ");
       			       }
       			       System.out.println();
       			      }
      	  			
      	  			System.out.println();

      	  		break; 
      	  		
      	case 'G': 
      	       
       			for(int i=0;i<=n;i++)
     				 { 
       					for(int j=0;j<=n;j++)
       					  {
          					if(i==0||j==0||i==n&&j<=n/2||j==n/2&&i>=n/2||i==n/2&&j>=n/2||j==n&&i>=n/2)
          						System.out.print("*");
          					else
          						System.out.print(" ");
       						}
       					System.out.println();
      				}
      	  			
      	  			System.out.println();

      	  		break; 

      	case 'H': 
      	 	       
      	  		for(int i=0;i<=n;i++)
                  { 
       				for(int j=0;j<=n;j++)
       					{
          					if(j==0||j==n||i==n/2)
          						System.out.print("*");
          					else
          						System.out.print(" ");
       					}
       					System.out.println();
      				}
      	 	  	
      	 	  	System.out.println();

      	 	  	break;  	   	

      	case 'I': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      				{ 
       					for(int j=0;j<=n;j++)
       						{
          						if(i==0||i==n||j==n/2)  
          							System.out.print("*");
          						else
          							System.out.print(" ");
       						}
       					System.out.println();
      				}
      	 	  	
      	 	  	System.out.println();

      	 	  	break; 

      	case 'J': 
      	 	       
      	  		for(int i=0;i<=n;i++)
     				 { 
       					for(int j=0;j<=n;j++)
       						{
          						if(i==0||j==n/2||i==n&&j<=(i/2))  
          							System.out.print("*");
          						else
          							System.out.print(" ");
       						}
       					System.out.println();
      					}
      	 	  	
      	 	  	System.out.println();

      	 	break; 

      	case 'K': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		            if(j==0||j==n/2-i||i-j==n/2)
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }

      	 	  	
      	 	  	System.out.println();

      	 	break;  
      	 	

      	case 'L': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(j==0||i==n)
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }

      	 	  	
      	 	  	System.out.println();

      	 	break;  

      	case 'M': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		{ 
      	  		 for(int j=0;j<=n;j++)
      	  		 {
      	  		    if(j==0||j==n||i==j&&i<=n/2-1||j==(n-1)-i&&j>=n/2)
      	  		    System.out.print("*");
      	  		    else
      	  		    	System.out.print(" ");
      	  		 }
      	  		 System.out.println();
      	  		}
      	 	  	System.out.println();
      	 	  	

      	 	break;

      	case 'N': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(j==0||j==n||i==j)
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }

      	 	  	System.out.println();

      	 	break;  

      	case 'O': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(j==n/2-i||i-j==n/2||j==n/2+i||i+j==n+n/2)  
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }

      	 	  	
      	 	  	System.out.println();

      	 	break;

      	case 'P': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		{ 
      	  		 for(int j=0;j<=n;j++)
      	  		 {
      	  		    if(j==0||i==0||j==n&&i<=n/2||i==n/2)
      	  		    System.out.print("*");
      	  		    else
      	  		    	System.out.print(" ");
      	  		 }
      	  		 System.out.println();
      	  		}
      	 	  	
      	 	  	System.out.println();

      	 	break;

      	case 'Q': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(j==n/2-i||i-j==n/2||j==n/2+i||i+j==n+n/2||i==j&&i>=n/2)  
      	  		          System.out.print("*");
      	  		          else
      	  		            System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }
      	 	  	
      	 	  	System.out.println();

      	 	break; 


      	case 'R': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		     { 
      	  		      for(int j=0;j<=n;j++)
      	  		      {
      	  		         if(j==0||i==0||j==n&&i<=n/2||i==n/2||i-j==n/2)
      	  		         System.out.print("*");
      	  		         else
      	  		         	System.out.print(" ");
      	  		      }
      	  		      System.out.println();
      	  		     }
      	 	  	
      	 	  	System.out.println();

      	 	break;

      	case 'S': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(i==0||j==0&&i<=n/2||i==n/2||j==n&&i>=n/2||i==n)  
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }
      	 	  	
      	 	  	System.out.println();

      	 	break;  	
      	 	
      	case 'T': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(i==0||j==n/2)  
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }
      	 	  	
      	 	  	System.out.println();

      	 	break; 

      	case 'U': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		     { 
      	  		      for(int j=0;j<=n;j++)
      	  		      {
      	  		         if(j==0||j==n||i==n)
      	  		         System.out.print("*");
      	  		         else
      	  		         	System.out.print(" ");
      	  		      }
      	  		      System.out.println();
      	  		     }
      	 	  	
      	 	  	System.out.println();

      	 	break;  	 		

      	case 'V': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(j==0&&i<=n/2||i-j==n/2||i+j==n+n/2||j==n&&i<=n/2)  
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }
      	  		     
      	 	  	
      	 	  	System.out.println();

      	 	break; 

      	case 'W': 
      	      	 	       
      	      	for(int i=0;i<=n;i++)
      	      	      { 
      	      	       for(int j=0;j<=n;j++)
      	      	       {
      	      	          if(j==0||j==n||i+j==n&&i>=n/2||i==j&&i>=n/2 )  
      	      	          System.out.print("*");
      	      	          else
      	      	          	System.out.print(" ");
      	      	       }
      	      	       System.out.println();
      	      	      }
      	      	 	  	
      	      	 	  	System.out.println();

      	      	 	break; 


      	case 'X': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		     { 
      	  		      for(int j=0;j<=n;j++)
      	  		      {
      	  		         if(j==i||j==n-i)
      	  		         System.out.print("*");
      	  		         else
      	  		         	System.out.print(" ");
      	  		      }
      	  		      System.out.println();
      	  		     }
      	 	  	
      	 	  	System.out.println();

      	 	break;  

      	case 'Y': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		      { 
      	  		       for(int j=0;j<=n;j++)
      	  		       {
      	  		          if(j==n-i||i==j&&i<=n/2)
      	  		          System.out.print("*");
      	  		          else
      	  		          	System.out.print(" ");
      	  		       }
      	  		       System.out.println();
      	  		      }
      	 	  	
      	 	  	System.out.println();

      	 	break; 

      	case 'Z': 
      	 	       
      	  		for(int i=0;i<=n;i++)
      	  		     { 
      	  		      for(int j=0;j<=n;j++)
      	  		      {
      	  		         if(i==0||i==n||j==(n-i))
      	  		         System.out.print("*");
      	  		         else
      	  		         	System.out.print(" ");
      	  		      }
      	  		      System.out.println();
      	  		     }
      	 	  	
      	 	  	System.out.println();

      	 	break; 	 	 	 		 	 	  	 	 	 		 	 	 		 		   	 	 	 		   	 	  	 	 		   	 	 	 	   	 	  	 	   		 	  			 
      	  		   	 	   	  	  	  	 		   	 	 	 		   	 	  	 	 		   	 	 	 	   	 	  	 	   		 	  			 	 	 	   	 	  	 	   		 	  			 
      	  		   	 	 	  		   	 	 	 	   	 	  	 	   		 	  		   	 	 	 	   	 	  	 	   		 	  			 	 	 
     default:
     		System.out.println("enter only alphabet");  
       }  
	}
  }
}

 
