public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela= new Conta(11 , 44);
        System.out.println(contaDaMarcela.getsaldo());
        //nao compila
       // contaDaMarcela.setTitular(marcela);
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
