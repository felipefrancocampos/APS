/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Gustavo
 */
public class AnaliseDados extends javax.swing.JFrame {

    /**
     * Creates new form AnaliseDados
     */
    public AnaliseDados() {
        initComponents();
        GraficoAnual();
        GraficoCarros1();
        GraficoCarros2();
        GraficoMensal();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        grafico1 = new javax.swing.JPanel();
        grafico3 = new javax.swing.JPanel();
        grafico2 = new javax.swing.JPanel();
        grafico4 = new javax.swing.JPanel();
        kml = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        ano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1930, 1023));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grafico1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(grafico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 460));

        grafico3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(grafico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 850, 420));

        grafico2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(grafico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 900, 460));

        grafico4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(grafico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, 900, 410));

        kml.setText("jLabel1");
        jPanel1.add(kml, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1000, -1, -1));

        modelo.setText("jLabel1");
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 510, -1, -1));

        marca.setText("jLabel1");
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1000, -1, -1));

        ano.setText("jLabel1");
        jPanel1.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1000, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     void GraficoCarros1()
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(200, "Amount", "Tesla-Model 3");
            dataset.setValue(150, "Amount", "Nissan Leaf");
            dataset.setValue(18, "Amount", "Chevrolet Bolt EV");
            dataset.setValue(100, "Amount", "BMW i3");
            dataset.setValue(80, "Amount", "Audi e-tron");
            dataset.setValue(250, "Amount", "Kia e-Nitro");

            JFreeChart chart = ChartFactory.createBarChart("Nossos carros","modelos","Veículos  KM/H", 
                    dataset, PlotOrientation.VERTICAL, false,true,false);

            CategoryPlot categoryPlot = chart.getCategoryPlot();
            //categoryPlot.setRangeGridlinePaint(Color.BLUE);
            categoryPlot.setBackgroundPaint(Color.WHITE);
            BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
            Color clr3 = new Color(0,168,132);
            
            renderer.setSeriesPaint(0, clr3);
            

            ChartPanel barpChartPanel = new ChartPanel(chart);
      
            grafico1.removeAll();
            grafico1.add(barpChartPanel, BorderLayout.CENTER);
            grafico1.validate();
      
        }
      private  void GraficoCarros2() {
         
          
            
           
            
          
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(50,"volvo", "volvo");
            dataset.setValue(70,"poluição emitida CO2", "poluição emitida CO2");
            dataset.setValue(170,"gasto mês", "meta anual");

            JFreeChart chart = ChartFactory.createBarChart("Seu carro","modelo","Veículos  KM/L", 
                    dataset, PlotOrientation.VERTICAL, false,true,false);

            CategoryPlot categoryPlot = chart.getCategoryPlot();
            //categoryPlot.setRangeGridlinePaint(Color.BLUE);
            categoryPlot.setBackgroundPaint(Color.WHITE);
            BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
            Color clr3 = new Color(0,168,132);
            
            renderer.setSeriesPaint(0, clr3);
            

            ChartPanel barpChartPanel = new ChartPanel(chart);
      
            grafico2.removeAll();
            grafico2.add(barpChartPanel, BorderLayout.CENTER);
            grafico2.validate();
        
        
 
      
    
     }
        private void GraficoMensal()
        {
            //cria data set
            DefaultPieDataset barDataset  = new DefaultPieDataset();
        barDataset.setValue("Consumo", new Float(8.0f));
        barDataset.setValue("Economia", new Float(13.0f));
        barDataset.setValue("Gastos", new Float(29.0f));
       
        
        JFreeChart piechart = ChartFactory.createPieChart
        ("Consumo", barDataset,false,true,false);
        
        PiePlot  piePlot =( PiePlot) piechart.getPlot();
        
        piePlot.setSectionPaint("Consumo", new Color(0,102,102));
        piePlot.setSectionPaint("Economia", new Color(255,0,0));
        piePlot.setSectionPaint("Gastos", new Color(255,255,0));
        
        
        piePlot.setBackgroundPaint(Color.white);
        
        ChartPanel barChartPanel = new ChartPanel(piechart);
        
        grafico3.removeAll();
        grafico3.add(barChartPanel,BorderLayout.CENTER);
        grafico3.validate();
      
        }
        
        private void GraficoAnual()
        {
            //cria data set
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(289,"Gerado","Consumo");
            dataset.setValue(235,"Gerado","Economia");
            dataset.setValue(456,"Gerado","Gastos");
            
            //cria chart
            JFreeChart lineChart = ChartFactory.createLineChart
        ("Gasto ao mês","mês","resultado",dataset,PlotOrientation.VERTICAL,false,true,false);
            
            //cria plot object
            CategoryPlot lineCategoryPlot = lineChart.getCategoryPlot();
            
            lineCategoryPlot.setBackgroundPaint(Color.white);
            
            
            //cria objeto render para mostrar o chart
            LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
            Color lineChartColor = new Color(204,0,51);
            lineRenderer.setSeriesPaint(0, lineChartColor);
            
            ChartPanel lineChartPanel = new ChartPanel(lineChart);
            grafico4.removeAll();
            grafico4.add(lineChartPanel,BorderLayout.CENTER);
            grafico4.validate();
      
        }
        
    void setModelo(String modelo) 
    {
        this.modelo.setText(modelo);
    }
    
    String getModelo () 
    {
        return this.modelo.getText();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaliseDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaliseDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaliseDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaliseDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaliseDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ano;
    private javax.swing.JPanel grafico1;
    private javax.swing.JPanel grafico2;
    private javax.swing.JPanel grafico3;
    private javax.swing.JPanel grafico4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kml;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modelo;
    // End of variables declaration//GEN-END:variables
}
