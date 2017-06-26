/*
 * Here we are making a program to show how the capacity is changing
 * here we are creating a class Capacity
 */
public class Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we are creating an empty string buffer with the initial capacity of 16.
		StringBuffer sb=new StringBuffer();
		//here we are printing the Capacity Method
		//default value of capacity method is 16
		System.out.println(sb.capacity());
		//Here we are applying the Append Method
		sb.append("Hello All"); 
		//Now the value of Capacity is 16
		System.out.println(sb.capacity()); 
		//here we are againg applying the append method to change the Capacity
		sb.append("I love Programming");
		//now the value will be (16*2)+2=34
		//(initial capacity*2)+2  
		System.out.println(sb.capacity());

	}

}
