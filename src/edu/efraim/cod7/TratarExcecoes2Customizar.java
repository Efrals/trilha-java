package edu.efraim.cod7;

public class TratarExcecoes2Customizar {
    public static void main(String[] args) {

        try {
            String cpfFormatado = formatarCpf("1245678910");
            System.out.println(cpfFormatado);
        } catch (CpfInvalidoException e) {
            System.out.println("CPF tem de ser formatado");
        }
    }

    static String formatarCpf(String cpf) throws CpfInvalidoException {
        if (cpf.length() != 11)
            throw new CpfInvalidoException();
            
            //simula um CPF formatado
            return "123.456.789-10";
    }
}