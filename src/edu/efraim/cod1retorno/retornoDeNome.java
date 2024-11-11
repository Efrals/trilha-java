package edu.efraim.cod1retorno;
public class retornoDeNome {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Efraim";
        String segundoNome = "Rocha";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        //return primeiroNome.concat(" ").concat(segundoNome);
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}