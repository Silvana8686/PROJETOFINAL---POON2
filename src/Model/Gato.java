package Model;

import javax.swing.JOptionPane;


public class Gato extends Animal{
    public String cor;  


    public Gato(){
    
    }

    public Gato(String cor, String nome, double peso, String ultimaVacina) {
        super(nome, peso, ultimaVacina);
        this.cor = cor;
    }

    public Gato(String cor, String nome, double peso, int id, String ultimoVacina) {
        super(nome, peso, id, ultimoVacina);
        this.cor = cor;
    }

    
    
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
    return "\nNome: "+ nome +"\nPeso: " + peso + "\nData da Última Vacina: " + ultimaVacina + "\nCor: " + cor;
    
    }

   
    
}

