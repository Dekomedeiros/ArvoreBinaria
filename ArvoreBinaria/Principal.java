package ArvoreBinaria;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Arvore arvore = new Arvore();

        int menu = 1;
        while (menu > 0) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Informe uma opção do menu: \n"
                    + "1) Incluir. \n"
                    + "2) Pre Ordem \n"
                    + "3) Central. \n"
                    + "4) Pos Ordem. \n"));

            switch (menu) {
                case 1:
                    No novoNo = new No();
                    novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado")));
                    arvore.incluir(novoNo);
                    break;
                    
                case 2:
                    arvore.preOrdem();
                    break;
                    
                case 3:
                    arvore.central();
                    break;
                    
                case 4:
                    arvore.posOrdem();
                    break;
            }
        }
    }
}