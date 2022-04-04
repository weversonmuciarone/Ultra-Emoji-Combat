package ultraemojicombat;
public class Lutador {
//Atributos
    private String nome,nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
//Metodos publicos
public void apresentar() {
    System.out.println("--------------------------------------");
    System.out.print("Chegou a hora de apresentar o lutador " + this.getNome());
    System.out.print(" diratamente da(O) " + this.getNacionalidade());
    System.out.print(" com a idade de " + this.getIdade() + " anos e " + this.getAltura() + " de altura ");
    System.out.println("e pesando " + this.getPeso() + " kg.");
    System.out.println(this.getNome() + " tem: ");
    System.out.println(this.getVitorias() + " Vitorias");
    System.out.println(this.getDerrotas() + " Derrotas");
    System.out.println(this.getEmpates() + " Empates");
    System.out.println("                           ");


}
public void status () {
    System.out.println("-----------------------------");
    System.out.println(this.getNome() + " e um peso " + this.getCategoria());
    System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Derrotas: " + this.getDerrotas());
    System.out.println("Empates: " + this.getEmpates());
    System.out.println("                      ");
}
public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
}
public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
}
public void empatarLuta () {
    this.setEmpates(this.getEmpates() + 1);
}  
//Metodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if (this.peso<52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
}
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
 
}
