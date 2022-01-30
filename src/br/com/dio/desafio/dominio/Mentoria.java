package br.com.dio.desafio.dominio;

public class Mentoria extends Conteudo{

    private String data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public String getData() {
        return data;
    }

    public void setData(String string) {
        this.data = string;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
