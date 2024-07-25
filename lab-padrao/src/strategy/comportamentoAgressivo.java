package strategy;

public class comportamentoAgressivo implements comportamento{

    @Override
    public void mover() {
        System.out.println("movendo agressivamente");
    }
}
