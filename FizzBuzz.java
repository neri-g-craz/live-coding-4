package livecd4;

public class FizzBuzz {
	
	String correrFizzBuzz(){
	
	for(int i=0, i<100, i++) {
		if (1%3 == 0) {
			System.out.println("Fizz");
		}
		else if (1%5 == 0) {
			System.out.println("Buzz");
		}
		else if (i%3 == 0 && i%5 == 0) {
			System.out.println("FizzBuzz");
		}
		else {
			System.out.println(i);
		}
	}
		
	}
	
}
