import javax.swing.JOptionPane;
public class Notebook extends Produto implements IProduto{
  private String quantidadeRAM;
  int dias;
  float aluguel;

  public Notebook(){
    
   quantidadeRAM=JOptionPane.showInputDialog("Digite a quantidade de RAM que o Notebook possui?");
    dias=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias em que o notebook foi alugado:"));
    CalcularAluguel();
    
  }
  
  public void CalcularAluguel(){
    
    if(fabricante.getNome().equalsIgnoreCase("Acer") || fabricante.getNome().equalsIgnoreCase("Samsung")){
      aluguel=dias*35;
    }else
      aluguel = dias*30;

    JOptionPane.showMessageDialog(null, "O aluguel lhe custará R$"+aluguel);
  }

  public void Exibir(){
    
    super.exibir();
    JOptionPane.showMessageDialog(null, "Quantidade de RAM: "+quantidadeRAM+ "\nQuantidade de dias de aluguel: "+dias+ "\nValor do aluguel: R$"+aluguel);
  }

  public int getDias(){
    return dias;

  }
}