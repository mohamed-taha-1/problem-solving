

interface calculator{
	void add(int num1,int num2);
}

class calc{
	public static void addSomething(int n1,int n2) {
		System.out.println("the result is : "+ (n1+n2));
	}
	
	
	
	
	
	public  void lastAdd(int n1,int n2) {
		System.out.println("the result is : "+ (n1+n2));
	}
}
// for constructor 




interface message{
	message getMessage(String msg);
}

class mesenger{
	mesenger(String msg){
		System.out.println("message is : "+ msg);
	}
}







public class lambda {
	public static void main(String[] args){
		
		
		// 1: refrencing to static method 
	/**	
		calculator c =calc::addSomething;
		c.add(4, 8);
		
	**/
		
		// 2: if there are function not static and i want to make refrence to it 
	
		
		calc c=new calc();
		
		calculator c2= c::lastAdd;
		
		c2.add(14, 34);
		
		
		
		//3: refrence to constructor 
		/**
		message m= mesenger:: new; 
		m.getMessage("welcome pro !");
		**/
		
		
		
		
		
	} 

}
