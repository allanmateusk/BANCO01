public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta=new Conta(1 , 2);
        conta.deposita(100);
       System.out.println(conta.saca(200));
        System.out.println(conta.getsaldo());
        
    }
}
