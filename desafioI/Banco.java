public class Banco {
    private Conta conta;
    private String nome;

    public Banco (String nomeBanco){
        nome = nomeBanco;
        conta = new Conta();
    }

    public void deposita(float valor){
        conta.deposita(valor);
    }

    public void saque(float valor){
        conta.saque(valor);
    }

    public float getSaldo(){
        return conta.getSaldo();
    }

    public String getNome(){
        return nome;
    }
}
