package jTextFieldPersonalizadas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//JTextField com tamanho de caracteres digitados limitados

/* pra aplicar em uma JTextField já criada:
* 1º abaixo de "initComponents();" na classe da JFrame
* 2º digitar: NOME_DA_JTEXTFIELD.setDocument(new JTextFieldLimitada(NUMERO_MAXIMO_DESEJADO));
*/

public class JTextFieldLimitada extends PlainDocument{
    
    private int limit;
    
    public JTextFieldLimitada(int limit){
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException{
        if (str == null)
            return;
        if ((getLength() + str.length()) <= limit)
            super.insertString(offset, str, attr);
    }
}