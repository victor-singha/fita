class Reverse{
	public static void main(String args[]){
		//reverse a Number
		int number = 648;
		int reverse = 0;
		while(number!=0){
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		System.out.println(reverse);

		//reverse a String
		String st = "apple";
		char[] arr = st.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}
}