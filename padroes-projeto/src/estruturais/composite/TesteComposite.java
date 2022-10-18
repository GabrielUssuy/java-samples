package estruturais.composite;

import java.math.BigDecimal;

public class TesteComposite {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento(BigDecimal.TEN);

        Orcamento novo = new Orcamento(BigDecimal.ZERO);
        novo.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        novo.adicionarItem(antigo);
    }
}
