package comportamentais.templatemethod;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {
    @Override
    public boolean deveAplicar(Pedido pedido) {
        return pedido.getValorTotal().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValorTotal().multiply(new BigDecimal("0.20"));
    }

    @Override
    public Desconto proximo() {
        return new SemDesconto();
    }
}
