package jTextFieldPersonalizadas;

public class FormataTexto {
    
    public String formata(String texto)
    {
        String textoNovo = "";
        if(texto.contains(" "))
        {
            int pos = 1;
            while(pos > 0) //remove espaço duplo (ou triplo ou ++)
            {
                texto = texto.replace("  ", " "); 
                pos = texto.indexOf("  ");            
            }
            texto = texto.trim(); //remove espaços à esquerda e direita, se houver
            String palavras[] = texto.split(" ");
            for (int i=0; i<palavras.length; i++) //primeira letra maiúscula e resto minúsculo
            {
                palavras[i] = (palavras[i].substring(0,1).toUpperCase() + palavras[i].substring(1,palavras[i].length()).toLowerCase());
                textoNovo = textoNovo + " " + palavras[i]; 
            }
        }
        else //se for só uma palavra
        {
            texto = texto.trim();
            textoNovo = (texto.substring(0,1).toUpperCase() + texto.substring(1,texto.length()).toLowerCase());
        }
        return textoNovo;
    }
}
