package estruturais.decorator;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Pedido pedido) {
        return null;
    }
}
