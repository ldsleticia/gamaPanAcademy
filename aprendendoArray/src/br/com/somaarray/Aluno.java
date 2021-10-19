package br.com.somaarray;

public class Aluno {
    private String nome; //atributo = variavel
    private double[] notas;

    private double media(){
        double soma = 0;
        for (double i : notas) {
            soma += i;
        }
        return soma/notas.length;
    }

    private String aprovado(){
        if(media() > 7 ){
            return "Aprovado";
        } else {
            return "Reprovado"; //quando crio um método que tem return e coloco um if, precisa ter um else
        }
    }

    private double maiorNota(){
        double maior = 0;
        for(double i = 0; i < notas.length; i++){
            if(notas[(int) i] > maior){
                maior = notas[(int) i];
                return maior;
            }
    }

    public String getNome(){
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}