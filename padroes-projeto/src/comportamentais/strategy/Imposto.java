package comportamentais.strategy;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(BigDecimal valor);
}
