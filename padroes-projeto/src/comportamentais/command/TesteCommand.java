package comportamentais.command;

import java.math.BigDecimal;

public class TesteCommand {
    public static void main(String[] args) {
        GeraPedido geraPedido = new GeraPedido(1, BigDecimal.TEN);
        geraPedido.executa();
    }
}
