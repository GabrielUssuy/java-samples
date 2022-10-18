package estruturais.facade;

import java.math.BigDecimal;

public class TesteFacade {
    public static void main(String[] args) {
        AprovaPagamento aprovaPagamento = new AprovaPagamento();
        aprovaPagamento.aprovar(BigDecimal.TEN, "IdPedido");
    }
}
