package controleatleta;

import java.util.ArrayList;

public class ControleLutador {

    private ArrayList<Lutador> listaLutadores;

    /*public ControleLutador() {
        this.listaLutadores = new ArrayList<Lutador>();
    }
    
    public ArrayList<Lutador> getListaLutadores() {
        return listaLutadores;
    }
    
    public void adicionar(Lutador umLutador) {
        listaLutadores.add(umLutador);
    }
    
    public void remover(Lutador umLutador) {
        listaLutadores.remove(umLutador);
    }
    
    public Lutador pesquisar(String nome) {
        for (Lutador b: listaLutadores) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;*/
    /**
     *
     */
    public ControleLutador() {
        this.listaLutadores = new ArrayList<Lutador>();
    }
    
    public ArrayList<Lutador> getListaLutadores() {
        return listaLutadores;
    }
    
    public void adicionar(Lutador umLutador) {
        getListaLutadores().add(umLutador);
    }
    
    public void remover(Lutador umLutador) {
        getListaLutadores().remove(umLutador);
    }
    
    public Lutador pesquisar(String nome) {
        for (Lutador b: getListaLutadores()) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }

    /**
     * @param listaLutadores the listaLutadores to set
     */
    public void setListaLutadores(ArrayList<Lutador> listaLutadores) {
        this.listaLutadores = listaLutadores;
    }
}
