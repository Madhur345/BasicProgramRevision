
public class TestCustomException {
	static void validate(int age) throws InvalidAgeException{
		if(age < 18){
			throw new InvalidAgeException("");
		}
		else{
			System.out.println("welcome to vote");
		}

	}
	public static void main(String[] args)  {
		try {
			validate(12);
		} catch (Exception m) {
			System.out.println("Exception Occoured :" + m  +" " + "Not Valid");
		}
		System.out.println("rest of code");
	}
}