public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
    }

    public void setPhoneNumber(String phoneNumber) {
        
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeigth(){
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return height + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
