package Model;

public abstract class Animal{
    
    public String nome;
    public double peso;
    public int id;
    public String ultimaVacina;
    
    public abstract void cadastrar();
    public abstract void excluir();
    
    public String listar(){
        return "\nNome: "+ nome +"\nPeso: " + peso + "\nData da Última Vacina: " + ultimaVacina;
    
    }
 
    public Animal(){
    
    }

    public Animal(String nome, double peso, String ultimaVacina) {
        this.nome = nome;
        this.peso = peso;
        this.ultimaVacina = ultimaVacina;
    }
  
    public Animal(String nome, double peso, int id, String ultimaVacina) {
        this.nome = nome;
        this.peso = peso;
        this.id = id;
        this.ultimaVacina = ultimaVacina;
    }
 
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUltimaVacina() {
        return ultimaVacina;
    }

    public void setUltimaVacina(String ultimaVacina) {
        this.ultimaVacina = ultimaVacina;
    }

    

}