
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Declaraçao de variaveis
        float primeiroNumero;
        float segundoNumero;
        float resultado;
        String entrada;

        // Exibe uma caixa de dialogo com um botao de OK
        JOptionPane
                .showMessageDialog(null,
                        "Soma de dois números",
                        "Boas vindas",
                        JOptionPane.INFORMATION_MESSAGE,
                        null);

        // Exibe uma caixa de dialogo com entrada de dados e salva
        // O resultado, que esta no formato de string, na variavel entrada
        entrada = JOptionPane
                .showInputDialog("Por favor, informe o primeiro número");
        primeiroNumero = Integer.parseInt(entrada); // converte string em int
        entrada = JOptionPane
                .showInputDialog("Por favor, informe o segundo número");
        segundoNumero = Integer.parseInt(entrada);
        resultado = primeiroNumero + segundoNumero;
        JOptionPane.showMessageDialog(null,
                primeiroNumero + " + "
                        + segundoNumero + " = " + resultado,
                "Resultado da soma",
                JOptionPane.INFORMATION_MESSAGE,
                null);
    }
}











