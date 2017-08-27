package jTextFieldPersonalizadas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

//JTextField que só aceita numeros

/* pra aplicar em uma JTextField já criada:
* 1º botão direito na JTextField
* 2º "Personalizar Código"
* 3º na primeira linha trocar "código default" para "criação personalizada"
* 4º substituir a parte "new javax.swing.JTextField();" por "new JTextFieldNumero();"
*/

public class JTextFieldNumero extends JTextField{
    
    public JTextFieldNumero(){
        addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char dig = e.getKeyChar(); //"e" captura a tecla pressionada
                if(!numero(dig) && dig != '\b') //se dig não for número ou backspace
                    e.consume(); //o que foi teclado não aparece na JTextField
            }
        });
    }

    private boolean numero(char dig){
        return dig >= '0' && dig <= '9';
    }
}