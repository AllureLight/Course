package COMPUTER_SCIENCE.JAVA.Progamming_2.HomeWork;

//Importacoes do java awt
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

//Importacoes do javax swing
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//Classe de imagem, utilizada para gerar um objeto imagem
//A partir dela e de seus metodos, vai haver a redimensionalização da imagem
//Consequentemente, nao haverá problemas quando a janela for esticada para qualquer lado
public class PainelFundo extends JPanel{
    private Image imagem;

    //Construtor da imagem, aceitando o caminho da imagem
    public PainelFundo(String caminho) {
        imagem = new ImageIcon(caminho).getImage();
        setLayout(new BorderLayout());
    }

    //Metodo para redimensionalizar a imagem
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
}
