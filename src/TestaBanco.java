public class TestaBanco {
    public static void main(String[] args) {
        Cliente allan=new Cliente();
        allan.setNome("allan mateus");
        allan.setCpf("111.111.111-11");
        allan.setProfissao("estudante");
        Conta contaDoAllan = new Conta(12 , 33);
        contaDoAllan.deposita(100);
        contaDoAllan.setTitular(allan);
        System.out.println(contaDoAllan.getTitular().getNome());
    }
}
