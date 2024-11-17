package edu.efraim.cod5d1;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //Inicia método selecaoCandidatos()
        selecaoCandidatos();
    }

    //Seleciona candidatos através de salarios gerados randomicamente
    static void selecaoCandidatos() {
        String [] candidatos = {"Axel","Nenai","Sabrini","Rupestre","Gabi","Victor","Wallace","Gabriel","Kletson", "Tayrony"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O(A) candidato(a) " + candidato + " solicitou este salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O(A) candidato(a) " + candidato + " foi selecionado(a) para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }   

    //Gera valores aleatórios
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //ANTERIOR
    //Analisa salário pretendido por candidato
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase >  salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}