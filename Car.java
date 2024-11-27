class Car {

   
 // Class variables

    String companyName;
  
         String color;
 
           int sittingCap;
  
               int maxSpeed;
    
                   String model1;

                      String fuelType;

   
// Constructor
  
  Car(String companyName, String model1, String fuelType, String color, int sittingCap, int maxSpeed) {
    
    this.companyName = companyName;
 
       this.model1 = model1;

        this.fuelType = fuelType;
 
       this.color = color;
 
       this.sittingCap = sittingCap;
 
       this.maxSpeed = maxSpeed;
   
 }

  
  // Method to start the car
 
   public void start() {
    
    System.out.println("Car started...");
  
  }

    
// Method to drive the car
  
  public void drive() {
  
      System.out.println("Car is in driving mode...");
 
   }

  
  // Method to apply brakes
 
   public void brake() {
      
  System.out.println("Brake applied...");
 
   }

   
 // Main method
    
    public static void main(String[] args) {
      
   // Create a car object
 
       Car myCar = new Car("Tata", "Nano", "CNG", "Pink", 5, 200);

     
   // Call methods on the car object
   
     System.out.println("Car Details:");
    
    System.out.println("Company Name: " + myCar.companyName);
   
     System.out.println("Model: " + myCar.model1);
  
      System.out.println("Fuel Type: " + myCar.fuelType);
  
      System.out.println("Color: " + myCar.color);
 
       System.out.println("Sitting Capacity: " + myCar.sittingCap);
    
    System.out.println("Max Speed: " + myCar.maxSpeed + " km/h");

 
       myCar.start();
      
       myCar.drive();
    
       myCar.brake();
   
     } 

  }