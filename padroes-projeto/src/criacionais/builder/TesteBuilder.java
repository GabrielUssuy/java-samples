package criacionais.builder;

import java.math.BigDecimal;

public class TesteBuilder {
    public static void main(String[] args) {
        Pedido pedidoComDesconto = Pedido.builder()
                .withValorTotal(BigDecimal.TEN)
                .withTotalDisconto(BigDecimal.ONE)
                .build();

        System.out.println(pedidoComDesconto);

        Pedido pedidoSemDesconto = Pedido.builder()
                .withValorTotal(BigDecimal.TEN)
                .build();

        System.out.println(pedidoSemDesconto);
    }
}
