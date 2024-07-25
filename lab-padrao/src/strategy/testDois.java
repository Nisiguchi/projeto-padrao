package strategy;

public class testDois {
    comportamento normal = new comportamentoNormal();
    comportamento defensivo = new comportamentoDefensivo();
    comportamento agressivo = new comportamentoAgressivo();

    robo robo = new robo();
    robo.setComportamento(normal);

    robo.mover();
    robo.mover();
}
