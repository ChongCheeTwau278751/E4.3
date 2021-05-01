package Exe4_2_1;

public class Kiwi extends Fruit {

	private String brand;
	private double mass;
    
    public Kiwi(String name, String size, String brand, double mass){ 			
       super(name,size);  										
       this.brand = brand;
       this.mass = mass;
       								
     }
    //Overriding method
    public void printData(){ 
    	System.out.println("Size \t\t\t= " + super.getSize());
    }
  	
  	public String brand(){
      return this.brand;
    }
  	
  	//Overloading without parameter
  	public double mass(){
        return this.mass;
    }
  	
  	//overloading with 1 parameter
  	public double mass(int quantity){
		   return this.mass*quantity;
	}
  	
  	//overloading with 2 parameters
  	public double mass(int quantity, double mass){
		   return mass*quantity;
	}
  	
  	//method toString as an overriding method(Fruit class)
  	public String toString() {									
  	  return super.toString() + 
  			  "\nBrand \t\t\t= " + brand() + 
  			  "\nMass(purchased) \t= " + mass() + " kg" +
  			  "\nMass(1 packet(12 pcs)) \t= " + mass(12) + " kg" +
  			  "\nMass(1 box(36 pcs)) \t= " + mass(36,0.10) + " kg" ;

  	}
	
}
