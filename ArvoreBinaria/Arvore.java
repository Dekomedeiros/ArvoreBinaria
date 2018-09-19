/*
Árvore Binária tem graus 0, 1 ou 2. Nunca mais que isso;
 */
package ArvoreBinaria;

import javax.swing.JOptionPane;

public class Arvore {

    private No raiz;

    public void incluir(No novoNo) {
        incluir(raiz, novoNo);
    }

    private No incluir(No noAtual, No novoNo) {
        if (noAtual == null) {
            noAtual = novoNo;
            if (raiz == null) {
                raiz = novoNo;
            }
        } else if (novoNo.getValor() < noAtual.getValor()) {
            noAtual.setEsq(incluir(noAtual.getEsq(), novoNo));
        } else if (novoNo.getValor() > noAtual.getValor()) {
            noAtual.setDir(incluir(noAtual.getDir(), novoNo));
        } else {
            JOptionPane.showMessageDialog(null, "O valor já foi cadastrado na árvore");
        }
        return noAtual;
    }

    public void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(No noAtual) {
        if (noAtual != null) {
            System.out.println(noAtual.getValor());

            preOrdem(noAtual.getEsq());
            preOrdem(noAtual.getDir());
        }
    }

    public void central() {
        central(raiz);
    }

    private void central(No noAtual) {
        if (noAtual != null) {
            central(noAtual.getEsq());
            System.out.println(noAtual.getValor());
            central(noAtual.getDir());
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
    }

    private void posOrdem(No noAtual) {
        if (noAtual != null) {
            posOrdem(noAtual.getEsq());
            posOrdem(noAtual.getDir());
            System.out.println(noAtual.getValor());

        }
    }
}
