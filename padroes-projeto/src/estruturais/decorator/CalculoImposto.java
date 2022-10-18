package estruturais.decorator;

import java.math.BigDecimal;

public class CalculoImposto {

    public BigDecimal calcular (Pedido pedido, Imposto imposto) {
        return imposto.calcular(pedido);
    }

}
