package controleatleta;

import java.util.ArrayList;

public class Lutador extends Atleta {

    private char estilo;
    private ArrayList<Premiacao> premiacoes;
    private int totalLutas;
    private int totalVitorias;
    private int totalVitoriasNocaute;
    private int totalEmpates;
    private int totalDerrotas;
    private int totalDesistencias;

    public Lutador(String nome) {
        super(nome);
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalDesistencias() {
        return totalDesistencias;
    }

    public void setTotalDesistencias(int desistencias) {
        this.totalDesistencias = desistencias;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int empates) {
        this.totalEmpates = empates;
    }

    public char getEstilo() {
        return estilo;
    }

    public void setEstilo(char estilo) {
        this.estilo = estilo;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int numLutas) {
        this.totalLutas = numLutas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitorias = vitorias;
    }

    public int getTotalVitoriasNocaute() {
        return totalVitoriasNocaute;
    }

    public void setTotalVitoriasNocaute(int vitoriasNocaute) {
        this.totalVitoriasNocaute = vitoriasNocaute;
    }
}
