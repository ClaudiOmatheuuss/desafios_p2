public class Banco {
    private Conta conta;
    private String nome;
    Conta[] contas;

    Conta contaUsuario;
    public Conta BuscaConta (int contaEscolhida) {
        return contas[contaEscolhida];
    }

    public Banco (String nomeBanco, int numContas){
        this.nome = nomeBanco;
        this.contas = new Conta[numContas];
        
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new Conta();
        }
    }

    public void deposita(float valor, int contaEscolhida){
        contaUsuario = BuscaConta(contaEscolhida);
        contaUsuario.deposita(valor);
    }

    public boolean saque(float valor, int contaEscolhida){
        contaUsuario = BuscaConta(contaEscolhida);

        if (contaEscolhida == 0) {
            // Aplica taxa de 1% na conta de índice 0
            float taxa = valor * 0.01f;
            float valorComTaxa = valor + taxa;
            return contaUsuario.saque(valorComTaxa);

        } else {
            return contaUsuario.saque(valor);
        }    
    }

    public float getSaldo(int contaEscolhida){
        contaUsuario = BuscaConta(contaEscolhida);
        return contaUsuario.getSaldo();
    }

    public String getNome(){
        return nome;
    }
}
