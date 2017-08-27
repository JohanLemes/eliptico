package jTextFieldPersonalizadas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

//JTextField que só aceita caracteres

/* pra aplicar em uma JTextField já criada:
* 1º botão direito na JTextField
* 2º "Personalizar Código"
* 3º na primeira linha trocar "código default" para "criação personalizada"
* 4º substituir a parte "new javax.swing.JTextField();" por "new JTextFieldChar();"
*/

public class JTextFieldChar extends JTextField{
    
    public JTextFieldChar(){
        addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char dig = e.getKeyChar(); //"e" captura a tecla pressionada
                //se dig não for letra, espaço ou backspace
                if(!letraMinuscula(dig) && !letraMaiuscula(dig) && !espaco(dig) && dig != '\b')
                    e.consume(); //o que foi teclado não aparece na JTextField
            }
        });
    }

    private boolean letraMinuscula(char dig){
        return dig >= 'a' && dig <= 'z';
    }
    
    private boolean letraMaiuscula(char dig){
        return dig >= 'A' && dig <= 'Z';
    }

    private boolean espaco(char dig){
        if(!(getText() == null || "".equals(getText().trim())) && dig == ' ')
            return true;
        return false;
    }
}