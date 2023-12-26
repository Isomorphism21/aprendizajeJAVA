public class Funciones {
    public static void main(String[] args) {
        /** */
        double y = 3;
        double area = circleArea(y);
        String color = "Blanco";
        System.out.println(area);
        System.out.println(colores(color));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que devuelve que color tienes dependiende de una variable
     * @param select Variable donde se guarda el resultado
     * @param color Parametro que trae el color
     * @return Devuelve el resultado dependiendo del color del parametro
     * 
    */
    public static String colores(String color){
        String select = "";
        switch (color) {
            case "Negro":
                select = "Tu color es Negro";
                break;
            case "Blanco":
                select = "Tu color es Blanco";
                break;
        } 

        return select;
    }
}
