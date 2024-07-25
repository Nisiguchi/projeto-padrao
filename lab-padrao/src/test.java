import facade.fac;



public class test {
    public static void main(String[] args) {
        /*singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        singletonEager eager = singletonEager.getInstancia();
        System.out.println(eager);
        eager = singletonEager.getInstancia();
        System.out.println(eager);

        singletonLazyHolder lazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        comportamento normal = new comportamentoNormal();
        comportamento defensivo = new comportamentoDefensivo();
        comportamento agressivo = new comportamentoAgressivo();

        robo rob = new robo();
        rob.setComportamento(normal);

        rob.mover();*/

        fac fac = new fac();
        fac.migrarCliente("venus", "123445431");
    }
}
