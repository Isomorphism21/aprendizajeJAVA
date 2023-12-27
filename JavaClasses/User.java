public class User {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;   
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    } 

    public String getAdress(){
        return address;
    }

    public void setAdress(String adress){
        this.address = adress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.length() > 8){
            System.out.println("El número telefonico sera de 8 digitos");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }
}
