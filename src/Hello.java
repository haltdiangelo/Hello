
public class Hello {
	void main() {
		int number = 4;
		
	}
	
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Hello only loves to use three arguments but you have passed in " + args.length + " arguments.");
			System.exit(5);
		}
		int number;
		System.out.println("\"Hello, big, wide world.\", said " + args[2]);
		System.out.println("\"Hi, Daphne.\", said " + args[1]);
		System.out.println("Hi, Audrey.");
		System.out.println("\"I'm alive!  I'm alive!  At las, I'm alive!\", said " + args[0]);
	}
}
