package Model;

import javax.swing.JOptionPane;


public class Cachorro extends Animal {
    
    public String tipoPelo; 
    

    public Cachorro(){
    
    }

    public Cachorro(String tipoPelo, String nome, double peso, String ultimaVacina) {
        super(nome, peso, ultimaVacina);
        this.tipoPelo = tipoPelo;
    }

    public Cachorro(String tipoPelo, String nome, double peso, int id, String ultimoVacina) {
        super(nome, peso, id, ultimoVacina);
        this.tipoPelo = tipoPelo;
    }
 

    

   
    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
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
        return "\nNome: "+ nome +"\nPeso: " + peso + "\nData da Última Vacina: " + ultimaVacina + "\nTipo de Pêlo: " + tipoPelo;
    
    }

   
}
