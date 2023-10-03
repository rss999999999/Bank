public class Conta {

    private int numero;
    private double saldo;


    //////////////////////////////////////////////////////////////////////////////
                                // Construtores
    //////////////////////////////////////////////////////////////////////////////

    //Os construtores possuem o mesmo nome da classe
    //Os construtores não têm tipo de retorno (nem mesmo void)
    //Os construtores são chamados com o operador new
    //Os construtores podem ter parâmetros
    //Os construtores podem ter qualquer modificador de acesso
    //Os construtores podem lançar exceções
    //Os construtores não podem retornar valor no método usando a instrução return (nem mesmo void)
    //Os construtores podem ser sobrecarregados
    //Os construtores podem chamar outros construtores da mesma classe usando a instrução this
    //Os construtores podem chamar outros construtores da mesma classe usando a instrução super
    //Os construtores podem ser declarados como privados, mas nesse caso só podem ser chamados de dentro da própria classe

    //////////////////////////////////////////////////////////////////////////////


    //construtor padrão
    public Conta() {

    }

    //construtor com parâmetros
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //Sobrecarga de construtor
    public Conta (int numero) {
        this.numero = numero;
        this.saldo = 0; //saldo inicial
    }

    //Sobrecarga de construtor
    public Conta(double saldo) {
        this.saldo = saldo;
    }



    //////////////////////////////////////////////////////////////////////////////
                                    // Métodos
    //////////////////////////////////////////////////////////////////////////////
    public double recuperarSaldo() {
        return saldo;

    }

    public void depositar(double valor) {
        saldo += valor;
    }

}
