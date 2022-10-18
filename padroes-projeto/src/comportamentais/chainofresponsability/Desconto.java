package comportamentais.chainofresponsability;

import java.math.BigDecimal;

public interface Desconto {
    BigDecimal calcular(Pedido pedido);
}
