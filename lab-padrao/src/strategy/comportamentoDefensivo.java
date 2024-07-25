package strategy;

public class comportamentoDefensivo implements comportamento{

    @Override
    public void mover() {
        System.out.println("movendo defensivamente");
    }
}
