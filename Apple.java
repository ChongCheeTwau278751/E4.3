package Exe4_2_1;

public class Apple extends Fruit {

	protected int price;
	protected int quantity;
    
    public Apple(String name, String size, int price, int quantity){		
       super(name,size);  											
       this.price = price;											
       this.quantity = quantity;														
       
     }
    //Overriding method
    public void printData(){ 
        System.out.println("Size \t\t\t= " + super.getSize());
    }
      
     public int getPrice(){
  	    return price;
  	}
     
     public int getQuantity(){
   	    return quantity;
   	}
     //Overloading (no parameter)
     public int total(){
 	    return price*quantity;
    }
     
     //Overloading (1 parameter)
     public int total(int quantity){
 	    return 10*quantity;
    }
     
     //Overloading (2 parameters)
     public int total(int price, int quantity){
    	    return price*quantity;
    }
     
    //method toString as an overriding method(fruit class)
  	public String toString() { 
  	  return super.toString() +
  			  "\nPrice \t\t\t= RM" + price + 
  			  "\nQuantity \t\t= " + quantity + 
  			  "\nTotal Amount(purchased) = RM" + total() +
  			  "\nPrice(1 packet(12 pcs)) = RM" + total(12) +
  			  "\nPrice(1 box(36 pcs)) \t= RM" + total(36,5);
  	}
}
