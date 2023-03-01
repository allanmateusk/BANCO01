public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
     private static int total;
    // costrutor
    public Conta(int agencia , int numero){
        Conta.total++;
        //System.out.println(" o tatal de contas e "+total);
        if(agencia<=0){
            System.out.println("nao pode valor menor ou igual a 0");
        return;

        }
        if( numero<=0){
            System.out.println("nao pode valor menor ou igual a 0");
        return;
        }
        this.agencia=agencia;
        this.numero=numero;
        
    }
    
    public void deposita(double valor){
        this.saldo= this.saldo+valor;
    }
    public boolean saca(double valor ){
if(this.saldo>=valor){
    this.saldo=this.saldo-valor;
    return true;
}
else {
    return false;
}
  
}
public boolean transfere(double valor,Conta destino){
    if(this.saldo>=valor){
        this.saldo-=valor;
        destino.deposita(valor);
        return true;
}
return false;
}
public double getsaldo(){
    return this.saldo;
}
public int getNumero(){
    return this.numero;
}
public void setNumero(int novoNumero) {
    if(numero<=0){
        System.out.println("nao pode valor menor ou igual a 0");
        return;
    }
    this.numero = novoNumero;
}
public int getAgencia(){
    return this.agencia;
}
public void setAgencia(int agencia) {
    if(agencia<=0 ){
        System.out.println("nao pode valor menor ou igual a 0");
        return;
    }
    this.agencia = agencia;
}
 public Cliente getTitular(){
    return this.titular;
 }
 public void setTitular(Cliente titular){
 this.titular= titular;}
 public static int getTotal() {
     return total;
 }

}

