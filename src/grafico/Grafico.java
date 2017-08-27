package grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Timer;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;

public class Grafico extends ApplicationFrame implements ActionListener {

    //TimeSeries é uma classe que permite sequencia de itens com periodo de tempo e algum valor
    private TimeSeries aInfo;
    private double aValor;
    //executa ActionEvents em intervalos especificos, no caso, 1 seg
    private Timer aTimer = new Timer(1000, this);
    private int aMin;

    public int getaMin() {
        return aMin;
    }

    //construtor
    public Grafico(final String title, int pMin){
        super(title);
        this.aMin = pMin;
        this.aInfo = new TimeSeries("Velocidade", Millisecond.class);
        final TimeSeriesCollection aInfoSet = new TimeSeriesCollection(this.aInfo);
        final JFreeChart chart = createChart(aInfoSet);
        aTimer.setInitialDelay(0);
        //cor do fundo do grafico
        chart.setBackgroundPaint(Color.WHITE);
        //JPanel para o grafico
        JPanel jp = new JPanel(new BorderLayout());
        //ChartPanel para o grafico
        ChartPanel aQuadroGrafico = new ChartPanel(chart);
        aQuadroGrafico.setPreferredSize(new java.awt.Dimension(400, 400));
        jp.add(aQuadroGrafico);
        //tamanho
        setContentPane(jp);
        aTimer.start();
    }
    
    //cria grafico
    private JFreeChart createChart(final XYDataset dataset) {
        final JFreeChart aGrafico = ChartFactory.createTimeSeriesChart("Velocidade por Tempo", "Tempo", "Velocidade",dataset, true, true, false);
        final XYPlot plot = aGrafico.getXYPlot();
        //configurações de aparência do gráfico
        plot.setBackgroundPaint(new Color(0xffffe0));
        plot.setDomainGridlinePaint(Color.BLUE);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLUE);
        plot.setRangeGridlinesVisible(true);
        //ValueAxis é classe para valor dos eixos
        ValueAxis xaxis = plot.getDomainAxis();
        xaxis.setAutoRange(true);
        //eixo x é do tempo
        xaxis.setFixedAutoRange(60000.0);  //60 segundos
        xaxis.setVerticalTickLabels(true);

        ValueAxis yaxis = plot.getRangeAxis();
        yaxis.setRange(0.0, 25.0);
        
        return aGrafico;
    }
    
    //entrada de valores
    static ArrayList<Double> listaVelocidades = new ArrayList<Double>();
    
    public static void valores(){
        try {
            Scanner input = new Scanner(new File("listaDados.dat"));
            int i = 0;
            while (input.hasNext()) {
                String number = input.next();
                double n = Double.parseDouble(number);
                listaVelocidades.add(n);
            }
        } catch (Exception e){
        }
    }
    public int i = 0;

    public void actionPerformed(final ActionEvent e) {
        try{
            if (i < aMin) {
                this.aValor = listaVelocidades.get(i);
                i++;
                Millisecond now = new Millisecond();
                this.aInfo.add(new Millisecond(), this.aValor);
                System.out.println("Current Time in Milliseconds = " + now.toString() + ", Current Value : " + this.aValor);
            }
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}