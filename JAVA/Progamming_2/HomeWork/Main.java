package COMPUTER_SCIENCE.JAVA.Progamming_2.HomeWork;

//Aluno: Guilherme Andrade Nascimento Medeiros
//Aluna: Ayssa Hadassa de Paiva Amorim

//Importacoes do javax swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//Importacoes do java awt
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Importacoes do ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Inicializando o JFrame
        JFrame trabalho = new JFrame("Gato Acadêmico");
        trabalho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //configurar a operação de fechar janela
        trabalho.setSize(800,800); //redimensionar a janela inicialmente
        trabalho.setResizable(true); //permiti redimensionar a janela
        trabalho.setLocationRelativeTo(null); //configura a janela para abrir no meio da tela
        
        //Colacar icone no programa
        ImageIcon imagemIcone = new ImageIcon("COMPUTER_SCIENCE/JAVA/Progamming_2/HomeWork/Icone.jpeg");
        trabalho.setIconImage(imagemIcone.getImage());
        
        //Criando Titulo 
        JLabel Titulo = new JLabel("Seja Bem-Vindo ao Gato Acadêmico!");
        Titulo.setFont(new Font("Arial", Font.BOLD, 25));
        Titulo.setForeground(Color.BLACK);

        //Criando Sub Titulo
        JLabel subTitulo = new JLabel("Informe as Notas dos Seus Alunos e Descubra Quem Está Aprovado, em Recuperação ou Reprovado");
        subTitulo.setFont(new Font("Arial", Font.BOLD, 15));
        subTitulo.setForeground(Color.BLACK);

        //Painel de Titulo e Sub Titulo
        JPanel painelTitulo = new JPanel();
        //Customização do Painel de Titulo e Sub Titulo
        painelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        painelTitulo.setPreferredSize(new Dimension(750, 200));
        painelTitulo.setMaximumSize(new Dimension(750, 200));
        painelTitulo.setOpaque(false);
        painelTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        //Adicionando o Titulo e Sub Titulo no Painel
        painelTitulo.add(Titulo);
        painelTitulo.add(subTitulo);


        //Criando os Campos de Texto
        //Campo de Texto do Nome do Aluno
        JLabel labelNome = new JLabel("Nome: ");
        JTextField nome = new JTextField(10);
        //Campo de Texto da Nota 1 do Aluno
        JLabel labelNota1 = new JLabel("Nota 1: ");
        JTextField nota1 = new JTextField(10);
        //Campo de Texto da Nota 2 do Aluno
        JLabel labelNota2 = new JLabel("Nota 2: ");
        JTextField nota2 = new JTextField(10);

        
        //Painel Principal que vai Possuir a entrada do nome e das notas
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 13));
        painelPrincipal.setPreferredSize(new Dimension(200, 117));
        painelPrincipal.setMaximumSize(new Dimension(200, 117));
        painelPrincipal.setOpaque(false);
        painelPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT);
        //Adicionando o Nome e as Notas do Aluno no Painel Principal
        painelPrincipal.add(labelNome);
        painelPrincipal.add(nome);
        painelPrincipal.add(labelNota1);
        painelPrincipal.add(nota1);
        painelPrincipal.add(labelNota2);
        painelPrincipal.add(nota2);


        //Criando os Botoes
        JButton cadastrar = new JButton("Cadastrar Aluno");
        JButton historico = new JButton("Ver Histórico");
        //O botao de apagar o historico existe devido a interpretacao dada nas intrucoes do trabalho
        //foi mencionado a necessidade de ter um botao chamado "Limpar Campos", mas os alunos interpretaram
        //que nao faria muito sentido o nome e sua funcao, devido isso foi alterado seu nome para "Apagar Historico"
        JButton apagar = new JButton("Apagar Histórico");
        JButton sair = new JButton("Sair do Programa");

        //Painel Secundario que vai possuir os botoes
        JPanel painelSecundario = new JPanel();
        painelSecundario.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 13));
        painelSecundario.setPreferredSize(new Dimension(600, 50));
        painelSecundario.setMaximumSize(new Dimension(600, 50));
        painelSecundario.setOpaque(false);
        painelSecundario.setAlignmentX(Component.CENTER_ALIGNMENT);
        //Adicionando os Botoes no Painel Secundario
        painelSecundario.add(cadastrar);
        painelSecundario.add(historico);
        painelSecundario.add(apagar);
        painelSecundario.add(sair);


        //Area de Historico, vai ser utilizado para exibir o historico de alunos cadastrados
        JTextArea areaHistorico = new JTextArea(10, 40);
        areaHistorico.setEditable(false);
        //O scroll foi adicionado pela necessidade quando houver uma grande quantidade de alunos
        //sendo cadastrado, permitindo a rolagem da lista para verificar todos os cadastramentos
        JScrollPane scroll = new JScrollPane(areaHistorico);
        scroll.setPreferredSize(new Dimension(550, 150));
        scroll.setMaximumSize(new Dimension(550, 150));
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);


        //Painel que conterá todos os outros, facilitando o uso do Fundo e Organizar os Componentes
        JPanel painelOrganizador = new JPanel();
        painelOrganizador.setLayout(new BoxLayout(painelOrganizador, BoxLayout.Y_AXIS));
        painelOrganizador.setOpaque(false);

        //Organizando o Painel que conterá os botoes, historico, entrada e titulo
        painelOrganizador.add(Box.createVerticalGlue());
        painelOrganizador.add(painelTitulo);
        painelOrganizador.add(Box.createVerticalStrut(20));
        painelOrganizador.add(painelPrincipal);
        painelOrganizador.add(Box.createVerticalStrut(20));
        painelOrganizador.add(painelSecundario);
        painelOrganizador.add(Box.createVerticalStrut(20));
        painelOrganizador.add(scroll);
        painelOrganizador.add(Box.createVerticalGlue());


        //Criando a Imagem de Fundo
        PainelFundo imagemFundo = new PainelFundo("COMPUTER_SCIENCE/JAVA/Progamming_2/HomeWork/Fundo.jpeg");
        //Adicionando o Painel que contem todos os outros na imagem de Fundo
        imagemFundo.add(painelOrganizador);
        //Adicionando a imagem de Fundo na janela do trabalho
        trabalho.setContentPane(imagemFundo);


        //Criando o Array de Alunos
        ArrayList<Aluno> alunos = new ArrayList<>();

        //Configurando a Cadastrar na Lista de Alunos
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double n1 = Double.parseDouble(nota1.getText());
                    double n2 = Double.parseDouble(nota2.getText());

                    if(n1 < 0 || n1 > 10){
                        throw new NotaInvalidaException("Nota 1 é inválida.");
                    }

                    if(n2 < 0 || n2 > 10){
                        throw new NotaInvalidaException("Nota 2 é inválida.");
                    }

                    Aluno al = new Aluno(nome.getText(), n1, n2);
                    alunos.add(al);
                    JOptionPane.showMessageDialog(trabalho, "Aluno Cadastrado com Sucesso!");
                }
                catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(trabalho, "Digita apenas números nas notas.");
                }

                catch(NotaInvalidaException e2){
                    JOptionPane.showMessageDialog(trabalho, e2.getMessage());
                }
                nome.setText("");
                nota1.setText("");
                nota2.setText("");
            }
        });

        //Configurando a ação de Ver Historico da Lista de Alunos
        historico.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                areaHistorico.setText("");

                if(alunos.isEmpty()) {
                    areaHistorico.append("Não há nenhum aluno cadastrado." + "\n");
                }

                for(Aluno a : alunos){
                    areaHistorico.append(a.toString() + "\n");
                }
            }
        });

        //Configurando a ação de Apagar a Lista de Alunos
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alunos.clear();
                areaHistorico.setText("");
                JOptionPane.showMessageDialog(trabalho, "Histórico Apagado!");
            }
        });

        //Configurando a ação de Sair do Programa
        sair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        //Configurando a visibilidade da janela
        trabalho.setVisible(true);
    }
}
