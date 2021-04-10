import java.lang.Math;
class Gambler{
	public static void main(String args[]){
		int money = 100;
		int limit=200;
		int win=0;
		int loss=0;
		int bet=0;

		while(money!=0 && money !=200){
			int res = toss();
			if(res==1){
				System.out.println("head");
				win++;
				bet++;
				money++;				
			}else{
				System.out.println("tail");
				loss++;
				bet++;
				money--;
			}
			System.out.println("Bet No.: "+bet+""); 
			System.out.println("Money Left: "+money+"$");
			System.out.println("---------------");
		}
			System.out.println("Bets Made: "+bet+"");
			System.out.println("Wins: "+win+"");
			System.out.println("Losses: "+loss+"");
			System.out.println("Money: "+money+"$");
		if(money==200){
			System.out.println("Won 200 bucks :)");
		}else System.out.println("No money left :(");
}

	static int toss(){
			int res = (int)(Math.random()*(1-0+1)+0);
			return res;
		}
}