package telaExercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import telaErro.TelaInfo;
import telaPrincipal.TelaPrincipal;

public class Exercicios{
    
    private String nomeEx;
    private String velocidade;
    private String tempo;
    private String dados;
    
    //encapsulamento das variáveis
    
    public String getNomeEx(){
        return nomeEx;
    }
    
    protected void setNomeEx(String nomeEx){
        this.nomeEx = nomeEx;
    }
    
    public String getVelocidade(){
        return velocidade;
    }
    
    protected void setVelocidade(String velocidade){
        this.velocidade = velocidade;
    }
    
    public String getTempo(){
        return tempo;
    }
    
    protected void setTempo(String tempo){
        this.tempo = tempo;
    }
    
    protected void salvar(String d, String arqU)
    {
        try{
            BufferedWriter arqW = new BufferedWriter(new FileWriter("ex" + arqU));
            arqW.write("Exercicio: " + getNomeEx());
            arqW.newLine();
            arqW.write(d);
            arqW.flush();
            arqW.close();
        }catch(IOException e){}
    }
    
    protected void setVariacoes(String d)
    {
        if(d.equals(""))
            dados = getVelocidade() + " " + getTempo();
        else
            dados = d + " " + getVelocidade() + " " + getTempo();
    }
    
    public String getVariacoes()
    {
        return dados;
    }
}