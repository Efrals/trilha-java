package edu.efraim.cod5;

public class condicional52SwitchCase {
    public static void main(String[] args) {

        String plano = "S";

        switch (plano) {
            case "S" : {
                System.out.println("100 minutos de ligação");
                System.out.println("Whatsapp ilimitado");
                System.out.println("5GB de Internet");
                break;
            }
            case "M" : {
                System.out.println("100 minutos de ligação");
                System.out.println("Whatsapp ilimitado");
                break;

            }
            case "B" : {
                System.out.println("100 minutos de ligação");
                break;
            }
        }
    }
}
