import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {
    private String nomeCompleto;
    private float saldoAtual = 100;
    private float dinheiroResgate;

    private float dinheiroDepositado;

    float valorInvestido;

    Scanner scanner = new Scanner(System.in);

    public void resgateDinheiro() {
        System.out.println("Digite o saldo que você deseja retirar");
        float dinheiroResgate = scanner.nextFloat();
        float total = saldoAtual - dinheiroResgate;
        System.out.println("O seu saldo atual agora é de: " + total);
    }

    public void depositoBancario() {
        System.out.println("Digite o valor que você deseja depositar");
        float dinheiroDepositado = scanner.nextFloat();
        float totalDepositado = saldoAtual + dinheiroDepositado;
    }

    public void visualizarConta() {
        System.out.println("O estado atual da sua conta é: ");

        System.out.println("Nome completo:" + nomeCompleto);
        System.out.println("Saldo atual: " + saldoAtual);
        System.out.println("Valor investido: ");
    }

    public void investimentoBancario () {
        System.out.println("Digite o valor que você deseja investir:");
        valorInvestido = scanner.nextFloat();

        System.out.println("O valor inicial investido foi de " + valorInvestido + " , a cada nova transação realizada esse valor irá aumentar 5%");

        System.out.println("Valor atual: " +valorInvestido);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public float getDinheiroResgate() {
        return dinheiroResgate;
    }

    public void setDinheiroResgate(float dinheiroResgate) {
        this.dinheiroResgate = dinheiroResgate;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
