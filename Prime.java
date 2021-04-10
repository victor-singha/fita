import java.util.*;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int flag=1;
		for(int i=2;i<number;i++){
			if(number%i==0){
				flag=0;
				break;	
			}else{
				flag=1;
			}
		}
		if(flag==1){
			System.out.println(number+" is Prime");
		}else
			System.out.println(number+" is Not Prime");

	}
}