package comportamentais.templatemethod;

import java.math.BigDecimal;

public abstract class Desconto {

    public BigDecimal calcularDesconto(Pedido pedido) {
        if(deveAplicar(pedido)) {
            return calcular(pedido);
        }
        return proximo().calcularDesconto(pedido);
    }

    public abstract boolean deveAplicar(Pedido pedido);
    public abstract BigDecimal calcular(Pedido pedido);
    public abstract Desconto proximo();
}
