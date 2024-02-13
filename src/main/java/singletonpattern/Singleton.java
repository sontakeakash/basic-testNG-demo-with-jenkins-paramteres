package singletonpattern;

public class Singleton {
	//constructor as private
	//write a public static method (getInstance) that has return type of object of this singleton class(lazy initialization)
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey this is singleton pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance == null)
			singleton_instance = new Singleton(); //lazy initialization
		return singleton_instance;
		
	}
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		
		//next ref variables y and z will point to same object as by x and thus new objects creation is not allowed
		Singleton y =Singleton.getInstance();
		Singleton z =Singleton.getInstance();
		
		System.out.println(x);
		System.out.println(y);
		
		x.str = x.str.toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
	}

}
