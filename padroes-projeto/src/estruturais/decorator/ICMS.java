package estruturais.decorator;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Pedido pedido) {
        return null;
    }
}
