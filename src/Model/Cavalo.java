package Model;

import javax.swing.JOptionPane;

public class Cavalo extends Animal{
    public  double velocidade;  


    public Cavalo(){
    
    }

    public Cavalo(double velocidade, String nome, double peso, String ultimaVacina) {
        super(nome, peso, ultimaVacina);
        this.velocidade = velocidade;
    }

    public Cavalo(double velocidade, String nome, double peso, int id, String ultimoVacina) {
        super(nome, peso, id, ultimoVacina);
        this.velocidade = velocidade;
    }

    

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    
    @Override
    public void cadastrar() {
       String texto = "Nome: " + this.nome + "\n Cadastrado" ;
        JOptionPane.showMessageDialog(null, texto );
    }

    @Override
    public void excluir() {
        String texto = "Id: " + this.id + "\n Removido" ;
        JOptionPane.showMessageDialog(null, texto );
    }
   
    
    @Override
    public String listar(){
         return "\nNome: "+ nome +"\nPeso: " + peso + "\nData da Última Vacina: " + ultimaVacina + "\nVelocidade: " + velocidade;
    
    }

   
}
