public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta= new Conta(555 , 5555);
        conta.setNumero(1237);
        System.out.println(conta.getNumero());
        Cliente allan = new Cliente();
        allan.setNome("allan mateus");
        conta.setTitular(allan);
        conta.getTitular().setProfissao("desenvolvedor");
        // outra form de alterar a profissao 
        Cliente TitularDaConta =conta.getTitular();
        TitularDaConta.setProfissao("desnvolvedor");
         // TitularDaConta , allan e conta possuem o mesmo valor 
         System.out.println(TitularDaConta);
         System.out.println(allan);
         System.out.println(conta.getTitular());
    }
}
