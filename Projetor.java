import javax.swing.JOptionPane;
public class Projetor extends Produto implements IProduto{

  private boolean possuiHDMI;
  private int dias;
  float aluguel;
  String pagamento;

  public Projetor(){
    possuiHDMI=Boolean.parseBoolean(JOptionPane.showInputDialog("O projetor possui saida HDMI?\n->Para Sim, digite:\ntrue\n->Para Não, digite:\n false"));
    dias=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias que deseja usar: "));
    CalcularAluguel();
    }

  public void CalcularAluguel(){
    if(possuiHDMI == true){
      aluguel = dias*30;
    }

    if(possuiHDMI == false){
      aluguel = dias*25;
    }
    pagamento=JOptionPane.showInputDialog("Qual a forma de pagamento? \n [1] pix\n [2] dinheiro");

    if(pagamento.equalsIgnoreCase("pix") || pagamento.equalsIgnoreCase("dinheiro")){

      
      float desconto =(aluguel*(15/100));
      aluguel=aluguel-desconto;

    }

    JOptionPane.showMessageDialog(null,"O aluguel lhe custará: R$"+aluguel);
  }
  
  public void Exibir(){
    super.exibir();
    JOptionPane.showMessageDialog(null,"Possui HDMI: "+possuiHDMI+ "\nQuantidades de dias de aluguel: "+dias+"Valor do aluguel: R$"+aluguel);
  }

  public int getDias(){
    return dias;
  }
  
  }
  