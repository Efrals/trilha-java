package edu.efraim.cod4argumentos;

public class Argumentos1 {
    public static void main(String[] args) {
        
        /*
        executa via cmd ou terminal ou por launch.json do VS Code passando os dados
        //Ex CMD: java Argumentos1 Efraim Rocha 30 1.70
        Ex VS Code: {
                        "type": "java",
                        "request": "launch",
                        "mainClass": "Argumentos1",
                        "args": [
                            "Efraim",
                            "Rocha",
                            "30",
                            "1.70"
                        ]
                    }
        */
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }

}
