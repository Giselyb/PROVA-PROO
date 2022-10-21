import java.util.*;
import javax.swing.JOptionPane;

public class Cadastro{
  ArrayList<Notebook> notebooks=new ArrayList();
  ArrayList<Projetor> projetores=new ArrayList();
  char r;
   
  public void Cadastrar(){
    int resp;
    
    do{
    resp=Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar:\n[1] Novo notebook\n[2] Novo projetor\n[3] Sair")); 
      
      if(resp==1){
        do{
        Notebook n=new Notebook();
        notebooks.add(n);

        r=JOptionPane.showInputDialog("Deseja adicionar mais um notebook?\n[S] Sim\n[N] Não").charAt(0);
  
      }while(r!='N');
      }

      if(resp==2){
       do{
       Projetor p=new Projetor(); 
       projetores.add(p);

      r=JOptionPane.showInputDialog("Deseja adicionar mais um pojetor?\n[S] Sim\n[N] Não").charAt(0);
      
       }while(r!='N');
      }
  
    }while(resp!=3);
  }

  public void ExibirFArapiraca(){

    for(int i=0;i<notebooks.size();i++){

      if(notebooks.get(i).fabricante.getCidade().equalsIgnoreCase("Arapiraca")){
      
      }else{
        notebooks.get(i).Exibir();
      }
    }
    
    for(int i=0;i<projetores.size();i++){
      
    if(projetores.get(i).fabricante.getCidade().equalsIgnoreCase("Arapiraca")){
        
      }else{
        projetores.get(i).Exibir();
        
    }
    }
  
  }

  public void ExibirAluguel(){
    int p_aluguel;
    char rsp;
    do{
     p_aluguel=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto que você deseja verificar o aluguel:"));
                                                                   
      for(int i=0; i<projetores.size();i++){
        if(p_aluguel==projetores.get(i).getCodigo()){
          projetores.get(i).CalcularAluguel();
        }
      }
      
      for(int i=0; i<notebooks.size();i++){
        if(p_aluguel==notebooks.get(i).getCodigo()){

          notebooks.get(i).CalcularAluguel();
        }
      }
      rsp=JOptionPane.showInputDialog("Deseja consultar mais um aluguel?\n[S] Sim\n[N] Não").charAt(0);
      
      }while(rsp!='N');
    }
    
}
