class Reverse{
	public static void main(String args[]){
		reverse_number(648);
		reverse_string("apple");		
	}

//reverse a Number Function
	static void reverse_number(int number){
		int reverse = 0;
		while(number!=0){
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		System.out.println(reverse);
	}
	
//reverse a String Function
	static void reverse_string(String st){
		char[] arr = st.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}
}