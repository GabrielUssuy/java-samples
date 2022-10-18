package comportamentais.templatemethod;

import java.math.BigDecimal;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        CalculadorDesconto calculadorDesconto =  new CalculadorDesconto();
        System.out.println(calculadorDesconto.calcular(new Pedido(6, new BigDecimal("100"))));
        System.out.println(calculadorDesconto.calcular(new Pedido(1, new BigDecimal("600"))));
        System.out.println(calculadorDesconto.calcular(new Pedido(1, new BigDecimal("50"))));
    }
}
