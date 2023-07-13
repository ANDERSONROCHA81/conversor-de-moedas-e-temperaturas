import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int escolha;
        do {
            Object[] opcoes = {"Conversor de Moedas", "Conversor de Temperaturas"};
            String entrada;
            String conversorEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversor", "Menu",
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (conversorEscolhido.equals("Conversor de Moedas")){
                entrada = JOptionPane.showInputDialog(null, "Insira um valor", "Input",
                        JOptionPane.QUESTION_MESSAGE);
                validaEntrada(entrada);
            }

            escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Escolha a opção",
                    JOptionPane.YES_NO_OPTION);
        }while (escolha == 0);
    }

    public static void validaEntrada(String entrada){
        double valor;
        if (entrada.matches("[0-9]*")){
            valor = Double.parseDouble(entrada);
            ConversorDeMoedas.escolheTipoDeMoeda(valor);
        }else {
            JOptionPane.showMessageDialog(null, "A entrada deve ser apenas números");
        }
    }
}
