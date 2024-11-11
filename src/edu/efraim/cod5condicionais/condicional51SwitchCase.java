package edu.efraim.cod5condicionais;

public class condicional51SwitchCase {
    public static void main(String[] args) {

        String plano = "S";

        if (plano == "S") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp ilimitado");
            System.out.println("5GB de Internet");

        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp ilimitado");

        } else if (plano == "B") {
            System.out.println("100 minutos de ligação");
        }
    }
}
