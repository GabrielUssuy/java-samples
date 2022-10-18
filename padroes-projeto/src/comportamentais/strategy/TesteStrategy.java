package comportamentais.strategy;

import java.math.BigDecimal;

public class TesteStrategy {

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        CalculoImposto calculoImposto = new CalculoImposto();
        System.out.println("ICMS: " + calculoImposto.calcular(valor, new ICMS()));
        System.out.println("ISS: " + calculoImposto.calcular(valor, new ISS()));
    }
}
