public class TestaMetodo {
public static void main(String[] args) {
    Conta contaDoAllan =new Conta(12 , 33);
    contaDoAllan.deposita(100);
    contaDoAllan.deposita(50);
    System.out.println(contaDoAllan.getsaldo());
    boolean coseguiuRetirar = contaDoAllan.saca(20);
    System.out.println(contaDoAllan.getsaldo());
    System.out.println(coseguiuRetirar);
   Conta contaDaMarcela= new Conta(11, 55);
   contaDaMarcela.deposita(1000);
   if(contaDaMarcela.transfere(3000, contaDoAllan)){
    System.out.println("trasferencia com sucesso ");
   }
   else{
    System.out.println("saldo insuficiente");
   }
   System.out.println(contaDaMarcela.getsaldo());
   System.out.println(contaDoAllan.getsaldo());
   
} 

}
