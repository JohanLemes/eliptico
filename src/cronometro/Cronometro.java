package cronometro;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import org.jfree.ui.RefineryUtilities;
import telaErro.TelaInfo;

public class Cronometro {
    private Timer cronometro;
    private DateFormat formato = new SimpleDateFormat("HH:mm:ss");
    private Calendar calendario = Calendar.getInstance();
    private final byte contagem;
    //decidir se vai ser contagem regressiva ou progressiva
    public static final byte progressiva = 1;
    public static final byte regressiva = -1;
    
    //construtor
    public Cronometro(int ano, int mes, int dia, int horas, int minutos, int segundos, byte tipoContagem){
        cronometro = new Timer();
        calendario.set(ano, mes, dia, horas, minutos, segundos);
        contagem = tipoContagem;
    }
    
    //função para pegar o tempo do dado instante
    public String getTime(){
        calendario.add(Calendar.SECOND, contagem);
        return formato.format(calendario.getTime());
    }
    
    //função para printar o cronometro
    public void cronometro()
    {
        TimerTask tarefa = new TimerTask(){
            public void run() {
                String hr = getTime();
                if(!hr.equals("00:00:00"))
                    System.out.println(hr);
                else{
                    new TelaInfo("Ok", "Fim do exercício").setVisible(true);
                    System.exit(0);
                }  
            }
        };
        cronometro.scheduleAtFixedRate(tarefa, 0, 1000);
        this.cronometro = null;
    }
}