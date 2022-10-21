import javax.swing.JOptionPane;
public abstract class Produto{

  Fabricante fabricante;
  String modelo;
  int codigo;

  public Produto(){
 
    fabricante=new Fabricante();
    
    modelo=JOptionPane.showInputDialog("Digite o modelo do produto:");

    codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
    
  }
  public int getCodigo(){
    return codigo;
  }
  
  public void exibir(){
    JOptionPane.showMessageDialog(null,"Modelo: "+ modelo+ "\nCódigo: "+codigo);
  }

  
} 
