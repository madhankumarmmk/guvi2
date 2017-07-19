	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);
	 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		
	{
	System.out.println( "Entered character "+ch+" is alphabet"); 
	}
	
	      else
		System.out.println("Not an alphabet");		
	
	}
}