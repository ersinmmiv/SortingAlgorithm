package SortingAlgorithm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

import java.awt.*;

public class XYLineChart_AWT extends ApplicationFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	Color bgColor = new Color(41, 45, 62);


	public XYLineChart_AWT(String applicationTitle, String chartTitle,String name,XYSeries bbl, XYSeries qks, XYSeries ins, XYSeries sls ) {
		super(applicationTitle);
		JFreeChart xylineChart = ChartFactory.createXYLineChart(chartTitle, name, "Time",
				createDatasetGroup(bbl, qks, ins, sls), PlotOrientation.VERTICAL, true, true, false);

		ChartPanel chartPanel = new ChartPanel(xylineChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		final XYPlot plot = xylineChart.getXYPlot();

//		chartPanel.setBackground(bgColor);
		plot.setBackgroundPaint(bgColor);

		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		renderer.setSeriesPaint(0, Color.RED);
		renderer.setSeriesPaint(1, Color.GREEN);
		renderer.setSeriesPaint(2, Color.YELLOW);
		renderer.setSeriesPaint(3, Color.CYAN);
		renderer.setSeriesStroke(0, new BasicStroke(2.0f));
		renderer.setSeriesStroke(1, new BasicStroke(2.0f));
		renderer.setSeriesStroke(1, new BasicStroke(2.0f));
		renderer.setSeriesStroke(3, new BasicStroke(2.0f));
		plot.setRenderer(renderer);
		setContentPane(chartPanel);
	}

	public XYLineChart_AWT(String applicationTitle, String chartTitle,String name,XYSeries set) {
		super(applicationTitle);
		JFreeChart xylineChart = ChartFactory.createXYLineChart(chartTitle, name, "Time",
				createDataset(set), PlotOrientation.VERTICAL, true, true, false);

		ChartPanel chartPanel = new ChartPanel(xylineChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		final XYPlot plot = xylineChart.getXYPlot();

		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		renderer.setSeriesPaint(0, Color.RED);

//		chartPanel.setBackground(bgColor);
		plot.setBackgroundPaint(bgColor);



		renderer.setSeriesStroke(0, new BasicStroke(2.0f));

		plot.setRenderer(renderer);
		setContentPane(chartPanel);
	}

	private XYDataset createDataset(XYSeries set) {
		// TODO Auto-generated method stub
		final XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(set);
		return dataset;
	}

	public XYDataset createDatasetGroup(XYSeries bbl, XYSeries qks, XYSeries ins, XYSeries sls) {

		final XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(bbl);
		dataset.addSeries(qks);
		dataset.addSeries(ins);
		dataset.addSeries(sls);

		return dataset;
	}

}