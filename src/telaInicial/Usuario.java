package telaInicial;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import telaPrincipal.TelaPrincipal;
import java.io.IOException;
import telaErro.TelaInfo;

public class Usuario{
    
    private String usuario;
    private String senha;
    
    //encapsulamento das variáveis
    
    public String getUsuario(){
        return usuario;
    }
    
    protected void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    protected void setSenha(String senha){
        this.senha = senha;
    }
    
    //confirma se algum campo não foi preenchido e se "senha" e "confirma senha" são iguais
    private boolean preenchimento(String cSenha){
        //campos s preenchidos
        if(getUsuario().equals("Escolha seu usuário") || getSenha().equals("Escolha sua senha"))
        {
            new TelaInfo("Erro", "Campos não foram preenchidos.<br>Por favor, verifique.").setVisible(true);
            return false;
        }
        //senha
        else if(!(getSenha().equals(cSenha)))
        {
            new TelaInfo("Erro", "As senhas não coincidem.<br>Por favor, digite-as novamente.").setVisible(true);
            return false;
        }
        else
            return true;
    }
    
    //confirma se algum campo não foi preenchido
    public boolean preenchimento(){
        if(getUsuario().isEmpty() || getSenha().isEmpty())
        {
            new TelaInfo("Erro", "Campos não foram preenchidos.<br>Por favor, verifique.").setVisible(true);
            return false;
        }
        else
            return true;
    }
    
    protected boolean cadastrar(String cSenha){
        if(!preenchimento(cSenha)) //valida os campos
            return false;
        else{
            try{
                //cria ou escreve arquivo que guarda o usuario e sua senha e o respectivo nome de arquivo com dados
                BufferedWriter arqW = new BufferedWriter(new FileWriter("listaUsu.dat", true)); //para escrever
                BufferedReader arqR = new BufferedReader(new FileReader("listaUsu.dat")); //para ler
                while(arqR.readLine() != null){} //para encontrar a ultima linha
                arqW.write(getUsuario() + " ");
                arqW.write(getSenha() + " ");
                arqW.write(getUsuario() + "Arq.dat");
                arqW.newLine(); //pular linha
                arqW.flush(); //eliminar lixo
                arqW.close();
            }catch(IOException e){
            }
            try{
                //cria arquivo com dados de um unico usuario
                BufferedWriter arqW = new BufferedWriter(new FileWriter(getUsuario() + "Arq.dat", true)); //para escrever
                arqW.write("Usuário: " + getUsuario() + " " + getSenha()); arqW.newLine();
                arqW.write("Nome: nome"); arqW.newLine();
                arqW.write("E-mail: email"); arqW.newLine();
                arqW.write("CPF: cpf"); arqW.newLine();
                arqW.write("Sexo: Selecione..."); arqW.newLine();
                arqW.write("Nascimento: idade"); arqW.newLine();
                arqW.write("Altura: altura"); arqW.newLine();
                arqW.write("Peso: peso");
                arqW.flush();
                arqW.close();
            }catch(IOException e){
            }
            new TelaInfo("Ok", "Cadastrado com sucesso!<br>Seja bem-vindo, " + getUsuario()).setVisible(true);
            return true;
        }
    }
    
    public boolean entrar(){
        if(!preenchimento()) //valida os campos
            return false;
        else{
            String arqU;
            try{
                //abre e compara o arquivo de usuarios cadastrados com a entrada dada
                Scanner input = new Scanner (new File("listaUsu.dat"));
                while(input.hasNext())
                {
                    String nome = input.next();
                    String senha = input.next();
                    arqU = input.next();
                    if(getUsuario().equals(nome) && getSenha().equals(senha))
                    {
                        //abre a tela principal do programa
                        new TelaPrincipal(arqU).setVisible(true);
                        return true;
                    }
                }
                input.close();
            }catch (Exception e){
            }
            new TelaInfo("Erro", "Usuário ou senha incorretos.<br>Por favor, verifique.").setVisible(true);
            return false;
        }
    }
}