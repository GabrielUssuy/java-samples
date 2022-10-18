package estruturais.decorator;

import java.math.BigDecimal;
import java.util.Objects;

public abstract  class Imposto {

    private Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal realizarCalculo(Pedido pedido);

    public BigDecimal calcular(Pedido pedido) {
        BigDecimal valorImposto = realizarCalculo(pedido);
        if(Objects.nonNull(outroImposto)) {
            valorImposto = valorImposto.add(outroImposto.realizarCalculo(pedido));
        }
        return valorImposto;
    }
}
