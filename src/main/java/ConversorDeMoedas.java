import javax.swing.*;

public class ConversorDeMoedas {

    private static Object[] conversoes = {"Real para Dólar", "Real para Euro", "Real para Libra Esterlina",
            "Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real", "Euro para Real",
            "Libra Esterlina para Real", "Peso Argentino para Real", "Peso Chileno para Real"};
    private static double cotacaoDolar = 4.79;
    private static double cotacaoEuro = 5.38;
    private static double cotacaoLibraEsterlina = 6.27;
    private static double cotacaoPesoArgentino = 0.018;
    private static double cotacaoPesoChileno = 0.0059;

    public static void escolheTipoDeMoeda(double valor){
        double resultado;
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha para qual moeda deseja converter", "Moedas",
                JOptionPane.INFORMATION_MESSAGE, null, conversoes, conversoes[0]);

        switch (escolha) {
            case "Real para Dólar" -> {
                resultado = valor / cotacaoDolar;
                String mensagem = String.format("Agora você tem U$ %.2f dolares", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Real para Euro" -> {
                resultado = valor / cotacaoEuro;
                String mensagem = String.format("Agora você tem € %.2f euros", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Real para Libra Esterlina" -> {
                resultado = valor / cotacaoLibraEsterlina;
                String mensagem = String.format("Agora você tem £ %.2f libras esterlinas", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Real para Peso Argentino" -> {
                resultado = valor / cotacaoPesoArgentino;
                String mensagem = String.format("Agora você tem $ %.2f pesos argentinos", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Real para Peso Chileno" -> {
                resultado = valor / cotacaoPesoChileno;
                String mensagem = String.format("Agora você tem $ %.2f pesos chilenos", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Dólar para Real" -> {
                resultado = valor * cotacaoDolar;
                String mensagem = String.format("Agora você tem R$ %.2f reais", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Euro para Real" -> {
                resultado = valor * cotacaoEuro;
                String mensagem = String.format("Agora você tem R$ %.2f reais", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Libra Esterlina para Real" -> {
                resultado = valor * cotacaoLibraEsterlina;
                String mensagem = String.format("Agora você tem R$ %.2f reais", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Peso Argentino para Real" -> {
                resultado = valor * cotacaoPesoArgentino;
                String mensagem = String.format("Agora você tem R$ %.2f reais", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Peso Chileno para Real" -> {
                resultado = valor * cotacaoPesoChileno;
                String mensagem = String.format("Agora você tem R$ %.2f reais", resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    }
}
