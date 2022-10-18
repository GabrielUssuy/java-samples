package comportamentais.templatemethod;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    @Override
    public boolean deveAplicar(Pedido pedido) {
        return true;
    }

    @Override
    public BigDecimal calcular(Pedido pedido) {
        return BigDecimal.ZERO;
    }

    @Override
    public Desconto proximo() {
        throw new RuntimeException("Não implementado");
    }
}
