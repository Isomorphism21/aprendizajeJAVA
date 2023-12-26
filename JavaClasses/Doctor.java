public class Doctor {
    static int id = 0;//autoincrement
    String name;
    String speciality;
    int sueldo = 0;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID doctor: " + id);
        
    }

}
