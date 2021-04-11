import java.util.Random;
class Game{
    public static void main( String args[] ) {
      int min = -1;
      int max = 1;
        
      //Generate random int value from 50 to 100 
     // System.out.println("Random value in int from "+min+" to "+max+ ":");
      //if 0 its a draw
      int num =100;
      int count=0;
      while(num>0 && num<200)
      {
    	  int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
    	  System.out.println(random_int);
    	  num=num+random_int;
    	  System.out.println(num);
    	  count++;
      }
      
      if(num==200)
      {
    	  System.out.println("win");
    	  System.out.println("total num of moves "+count);
      }
      else
      {
    	  System.out.println("lose");
    	  System.out.println("total num of moves "+count);
      }
    }
}