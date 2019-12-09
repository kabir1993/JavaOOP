package co.edureka;

//Textual Representation how an object will look like in the memory
//Whatever we write in class is in actual the property of object as we are describing the object
//IF you want anything which should belong to class make it static !!!

class Product{
	
	//Attributes(State)
	private int pid;
	String name;
	int price;
	private int setPid;
	
	//Constructor()
	
	Product(){
		System.out.println(">> Data Written in Product Object");
	}
	
	//Methods(Behavior)
	//To write data in Product Object we have this Method
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		
	}
	// To read data from Product object
	void showProductDetails() {
		System.out.println("--------Product ID:"+pid+"--------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		
		System.out.println("-------------------------------");
	}
	//Setter
	void setPid(int pid) {
		this.pid = pid;
	}
	//Getter
	int getPid() {
		return pid;
	}
	
}

class Mobile extends Product{//IS-A Relation, Mobile is Child, Product is Parent
	
	//Additional attributes of Mobile other than the Product
	String os;
	int ram;
	int sdCardSize;
	public Mobile() {
		System.out.println(">>-------Mobile object constructed-----------");
	}
}

public class InheritanceApp {

	// main is executed by JVM when my program will run !!!!
	public static void main(String[] args) {
		
		//Create an Object : Product
		Product product1 = new Product();
		//product is not an object its a reference variable which holds the hashCode of the object in hexadecimal notation
		//System.out.println("product is: "+product);// we get 7852e922 as a hashCode, so product is a ref var not an object

		//Writting data in Object
		product1.setProductDetails(101, "iPhone", 100000);
		
		//Reading data from Object
		product1.showProductDetails();
		
		//Let's write the data directly
		Product product2 = new Product();
		product2.setPid(201);
		product2.name = "Pringles";
		product2.price = 100;
		
		product2.showProductDetails();
		
		//Requested to get Mobile Object Constructed !!
		Mobile mobile = new Mobile();
		//Product Object gets constructed before the Mobile Object !! 
		
		//mobile.setProductDetails(301, "iPhoneX", 10);
		//mobile.showProductDetails();
		
		
	}

}
