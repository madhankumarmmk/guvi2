class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
            int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println("First number "+x+" is largest.");
      else if ( y > x && y > z )
         System.out.println("Second number "+y+" is largest.");
      else if ( z > x && z > y )
         System.out.println("Third number "+z+" is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");	
		}
}