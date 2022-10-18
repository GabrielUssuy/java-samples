package comportamentais.strategy;

import java.math.BigDecimal;

public class CalculoImposto {

    public BigDecimal calcular (BigDecimal valor, Imposto imposto) {
        return imposto.calcular(valor);
    }

}
