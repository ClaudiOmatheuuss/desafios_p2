public class Conta {
    private float saldo;

    public Conta(){
        saldo = 0;
    }

    public void deposita(float valor){
        saldo = saldo + valor;
    }

    public boolean saque(float valor){
        if (valor < 0) {
            return false;
        } else if ((saldo - valor) < 0) {
            return false;
        } else { // se valor não é negativo e a diferença não é menor que zero então o valor de saque só pode ser menor ou igual ao saldo disponivel
            saldo = saldo - valor;
            return true;
        }
    }

    public float getSaldo(){
        return saldo;
    }
}
