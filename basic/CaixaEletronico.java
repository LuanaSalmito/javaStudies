public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 50.0;
        double valorSolicitado = 30.0;
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        else{
            System.out.println("Saldo: " + saldo);
        }
    
   }
}
