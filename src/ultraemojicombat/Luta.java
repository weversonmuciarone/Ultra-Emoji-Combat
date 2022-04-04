package ultraemojicombat;

import java.util.Random;

public class Luta {
//Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
// Metodos Publicos
public void marcarLuta(Lutador l1, Lutador l2){
    if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
    this.setAprovada(true);
    desafiado = l1;
    desafiante = l2;
} else {
    this.setAprovada(false);
    desafiado = null;
    desafiante = null;
}

}
public void lutar(){
if (this.aprovada){
    System.out.println("### DESAFIADO ###");
    this.desafiado.apresentar();
    System.out.println("### DESAFIANTE ###");
    this.desafiante.apresentar();
Random aleatorio = new Random();
int vencedor = aleatorio.nextInt(3);
    System.out.println("=========RESULTADO DA lUTA==========");
switch(vencedor){
    case 0:
        System.out.println("EMPATOU");
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
        break;
    case 1:
        System.out.println("Vitoria do " + this.desafiado.getNome());
        this.desafiado.ganharLuta();
        this.desafiante.perderLuta();
        break;
    case 2:
        System.out.println("Vitoria do " + this.desafiante.getNome());
        this.desafiante.ganharLuta();
        this.desafiado.perderLuta();
        break;
}
} else {
    System.out.println("A Luta nao pode acontecer");
}
}
// Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
