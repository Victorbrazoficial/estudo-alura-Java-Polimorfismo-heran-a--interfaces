package package02;

public abstract class Conta {
    
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        
        if (this.getSaldo() >= valor) {

            this.saldo -= valor;
            return true; 

        } else {

            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {

        if (this.saca(valor)) {

            destino.deposita(valor);
            return true;

        } else {

            return false;
        }
    } 

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {

        if (agencia <= 0) {
            System.out.println("Numero de agencia n pode ser igual nem menor que 0");
            return;
        } 
        this.agencia = agencia;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        
        if (numero <= 0) {
            System.out.println("Numero n pode ser igual nem menor que 0");
            return;    
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}