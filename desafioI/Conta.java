public class Conta {
    private float saldo;

    public Conta(){
        saldo = 0;
    }

    public void deposita(float valor){
        saldo = saldo + valor;
    }

    public void saque(float valor){
        saldo = saldo - valor;
    }

    public float getSaldo(){
        return saldo;
    }
}
