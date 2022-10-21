import javax.swing.JOptionPane;

public class Fabricante{

  private String nome, telefone, email, rua , cep, cidade;

  public Fabricante(){
    nome=JOptionPane.showInputDialog("Informe o nome da fabricante: ");
    telefone = JOptionPane.showInputDialog("Informe o telefone da mesma: ");
    email=JOptionPane.showInputDialog("Informe o email da fabricante: ");
    rua=JOptionPane.showInputDialog("Informe a rua onde a mesma se localiza: ");
    cep=JOptionPane.showInputDialog("Informe o CEP onde se localiza a fabricante: ");
    cidade=JOptionPane.showInputDialog("Informe a cidade sede da mesma: ");
  }

  public void exibir(){
    JOptionPane.showMessageDialog(null, "Dados da fabricante:\nNome: "+nome+"\nTelefone: "+telefone+"\nE-mail: "+email+"\nRua: "+rua+"\nCEP: "+cep+"\nCidade: "+cidade);
  }

  public String getNome(){
    return nome;
  }

  public String getCidade(){
    return cidade;
  }
  
}