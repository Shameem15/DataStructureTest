package practice;

public class LambdaTest1 {
	
	public static void main(String[] args) {
		int width=10;
		
		//without lambda, Drawable implementation using anonymous class  
		Drawable d=new Drawable(){
			public void draw(){System.out.println("Drawing "+width);}
		};
		d.draw();
		
		//with lambda, if functional Interface
		Drawable d2 = () -> {
			System.out.println("Drawing2 " + width);
		};
		d2.draw();
		
		// return String
		Sayable s=()->{
			return "I have nothing to say.";
		};
		System.out.println(s.say());
		
		// Lambda expression with single parameter.  
		Sayable1 s1=(name)->{
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));
		
		// You can omit function parentheses    
		Sayable1 s2= name ->{
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
		
		// You can omit function parentheses and return type  
		Sayable1 s3= name -> "Hello, " + name;
		System.out.println(s3.say("Sonoo"));
		
		// Multiple parameters in lambda expression  
		Addable ad1=(a,b)-> (a+b);
		System.out.println(ad1.add(10,20));
		
		// Multiple parameters with data type in lambda expression  
		Addable ad2=(int a,int b)->(a+b);
		System.out.println(ad2.add(100,200));
		
		// You can pass multiple statements in lambda expression  
		Sayable1 person = (message)-> {
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious."));
		
		
	}
	
}
