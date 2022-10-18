package estruturais.facade;

import java.math.BigDecimal;

public class AprovaPagamento {

    void aprovar(BigDecimal valor, String pedido) {
        new VerificaoAntiFraude().verificacaoFraude();
        new NotificaPagamentoRecebido().notificaPagamento();
    }
}
