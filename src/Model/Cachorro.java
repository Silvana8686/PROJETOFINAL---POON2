package Model;

import javax.swing.JOptionPane;


public class Cachorro extends Animal {
public String tipoPelo; 


 public Cachorro(){
    
    }
 

public Cachorro (String nome, int id,String tomouVacina, double peso, String tipoPelo){
   
     this.nome =nome;
     this.id = id;
     this.peso = peso;
     this.tomouVacina = tomouVacina;
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
    public String Informacoes(){
        return "{'Id': '" + id + "'Nome': '" + nome+ " 'Vacinado': '" + this.getTomouVacina() + "' , 'Peso': " +peso+ "'Kg'" +" , 'Pelagem': " + tipoPelo + " }";
    
    }

   
}
