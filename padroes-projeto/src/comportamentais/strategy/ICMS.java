package comportamentais.strategy;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.10"));
    }

}
