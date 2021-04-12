import java.util.*;
class Atm{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean isPin = false;
		double balance = 100000.564;
		while(isPin!=true){
			System.out.println("Enter Pin:");
			int pin = sc.nextInt();
			if(pin==1234){
				isPin=true;
			}else{
				isPin=false;
				System.out.println("Wrong Pin!");
			}

		}
		System.out.println("Success");
		System.out.println("Enter Choice:");
		System.out.println("[1] Withdraw");
		System.out.println("[2] Deposit");
		System.out.println("[3] Check Balance");
		System.out.println("[4] Cancel");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println("Enter Amount:");
					int amount_with = sc.nextInt();
					if(amount_with<balance){
						balance=balance-amount_with;
						System.out.println("Collect Your Money");
						System.out.println("Remaining Balance: "+balance);
					}
			case 2:
					System.out.println("Enter Amount For Deposit:");
					int amount_depo = sc.nextInt();
					balance=balance+amount_depo;
					System.out.println("New Balance: "+balance);
			case 3:
					System.out.println("Total Balance: "+balance);
			case 4:
					break;
			default: 
					System.out.println("Wrong Choice");
					break;
		}
		
	}
}