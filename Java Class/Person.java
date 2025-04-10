
package SmartContactBook.SmartContactBook;

public class Person {
    
    private String name,phoneNumber,email,address;
    
    //Constructor
    public Person(String name, String phoneNumber, String email, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    //Setter getter method to access Private variable.
    public void setName(String name){
        this.name = name;
    }    
    public String getName(){
        return name;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    
   //Method
    public void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Email : "+email);
        System.out.println("Address : "+address);
    }
}
