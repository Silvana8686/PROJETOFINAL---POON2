package Model;

import javax.swing.JOptionPane;


public class Gato extends Animal{
public String cores;  


public Gato(){
    
    }


public Gato (String nome, int id,String tomouVacina, String cores){
     
     this.nome =nome;
     this.id = id;
     this.tomouVacina = tomouVacina;
     this.cores = cores;
      
}


    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
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
    return "{'Id': '" + id + "'Nome': '" + nome+ " 'Vacinado': '" + this.getTomouVacina() + "' , 'Peso': " +peso+ "'Kg'" +" , 'As cores': " + cores + " }";
    
    }

   
    
}

