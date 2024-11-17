package edu.efraim.cod5d1;

import java.util.Random;

public class EntrarEmContato {
    public static void main(String[] args) {
        
        String [] candidatos = {"Axel","Nenai","Rupestre","Victor","Gabriel","Kletson", "Tayrony"};
    
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

            } while(continuarTentando && tentativasRealizadas < 3);

            if(atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª tentativa");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);

    }

    //Método auxiliar para sortear se atendeu ou não
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}
