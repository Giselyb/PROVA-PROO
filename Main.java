import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {

    Cadastro cadastro = new Cadastro ();
    int y;
    
do{
  y=Integer.parseInt(JOptionPane.showInputDialog("MENU\n [1] Cadastrar\n [2] Exibir fabricantes fora de Arapiraca\n [3] Exibir aluguel de determinado produto\n [4] Sair"));

  if (y == 1){
    cadastro.Cadastrar();
  }
  
  if(y == 2){
    cadastro.ExibirFArapiraca();
  }
  
  if(y == 3){
    cadastro.ExibirAluguel();
  }
  
  if(y == 4){
    break;
  }
}
while (y != 4);
  }
}