
 class CustomExceptionsTest {
	static void validate(int age) throws InvalidAgeExceptions{
		if (age < 18){
			throw new InvalidAgeExceptions("Age must be equal or greater than 18");
		}else{
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
		try{
			validate(11);
		}catch(Exception m){
			System.out.println("Exception Occoured : " + m);
		}
	}
}
