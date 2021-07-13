
public abstract  class Abstract_class {


		// TODO Auto-generated method stub

		private String name;
		private String gender;
		
//		 define a constructor 
		public Abstract_class(String nam , String gen) {
			this.name= nam;
			this.gender=gen;
			
		}	
		
		public abstract void styding();
	   @Override
	   public String toString() {
		   return  ( this.name + "gender" + this.gender) ;
	   }
	   
	   
	   
	   
	   

}
