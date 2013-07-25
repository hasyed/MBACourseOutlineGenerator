package report;


import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import com.lowagie.text.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 * 
 * @author Hans Kristanto
 */
public class MainApplication {
int classNbr;
	Connection connect = null;

	public void initConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		// Setup the connection with the DB
		connect = DriverManager.getConnection("jdbc:mysql://localhost/iba?"
				+ "user=root&password=root");
	}

	@SuppressWarnings("unchecked")
	public void showReport() throws FileNotFoundException {

		// Path to your .jasper file in your package
		//String reportName = "report/1.jasper";

		// Get a stream to read the file
		InputStream is2 = this.getClass().getClassLoader()
				.getResourceAsStream("report/2.jasper");
		InputStream is3 = this.getClass().getClassLoader()
				.getResourceAsStream("report/3.jasper");
		InputStream is4 = this.getClass().getClassLoader()
				.getResourceAsStream("report/4.jasper");
		InputStream is6 = this.getClass().getClassLoader()
				.getResourceAsStream("report/6.jasper");
		InputStream is8 = this.getClass().getClassLoader()
				.getResourceAsStream("report/8.jasper");
		InputStream is9 = this.getClass().getClassLoader()
				.getResourceAsStream("report/9.jasper");
		InputStream is10 = this.getClass().getClassLoader()
				.getResourceAsStream("report/10.jasper");

		try {			 
			 HashMap map1 = new HashMap();			 
			 map1.put("Class_Code", classNbr);
			 
			 ArrayList<JasperPrint> jps = new ArrayList<JasperPrint>();
		
			// Fill the report with parameter, connection and the stream reader
			JasperReport jasperReport2 = (JasperReport) JRLoader.loadObject(is2);
			JasperPrint jp2 = JasperFillManager.fillReport(jasperReport2, map1, connect);
			jps.add(jp2);
			
			// Fill the report with parameter, connection and the stream reader
			JasperReport jasperReport3 = (JasperReport) JRLoader.loadObject(is3);				
			JasperPrint jp3 = JasperFillManager.fillReport(jasperReport3, map1, connect);
			jps.add(jp3);
			
			JasperReport jasperReport4 = (JasperReport) JRLoader.loadObject(is4);				
			JasperPrint jp4 = JasperFillManager.fillReport(jasperReport4, map1, connect);
			jps.add(jp4);
			
			 JasperReport jasperReport6 = (JasperReport) JRLoader.loadObject(is6);				
			JasperPrint jp6 = JasperFillManager.fillReport(jasperReport6, map1, connect);
			jps.add(jp6);
			
			 JasperReport jasperReport8 = (JasperReport) JRLoader.loadObject(is8);				
			JasperPrint jp8 = JasperFillManager.fillReport(jasperReport8, map1, connect);
			jps.add(jp8);
			
			/* JasperReport jasperReport9 = (JasperReport) JRLoader.loadObject(is9);				
			JasperPrint jp9 = JasperFillManager.fillReport(jasperReport9, map1, connect);
			jps.add(jp9);
			
			 JasperReport jasperReport10 = (JasperReport) JRLoader.loadObject(is10);				
			JasperPrint jp10 = JasperFillManager.fillReport(jasperReport10, map1, connect);
			jps.add(jp10);
			*/
			// Viewer for JasperReport
//			JRViewer jv = new JRViewer(jp2);

			JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRPdfExporterParameter.JASPER_PRINT_LIST, jps);

            OutputStream output = new FileOutputStream(new File("mytestbatch.pdf"));

            exporter.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
            exporter.exportReport();

			
		/*	// Insert viewer to a JFrame to make it showable
			JFrame jf = new JFrame();
			jf.getContentPane().add(jv);
			jf.validate();
			jf.setVisible(true);
			jf.setSize(new Dimension(800, 600));
			jf.setLocation(300, 100);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	public MainApplication (int cnbr) throws Exception{
		classNbr=cnbr;

		try {
			JasperCompileManager.compileReportToFile(
			        "report/2.jrxml", "report/2.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/3.jrxml", "report/3.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/4.jrxml", "report/4.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/6.jrxml", "report/6.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/8.jrxml", "report/8.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/9.jrxml", "report/9.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/10.jrxml", "report/10.jasper");
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //the path to the jrxml file to compile
                //2.jasper");//the path and name we want to save the compiled file to

		initConnection();
		showReport();
	
	}
	
	/*public static void main(String[] args) throws Exception {

		MainApplication ma = new MainApplication(12345678);

		try {
			JasperCompileManager.compileReportToFile(
			        "report/2.jrxml", "report/2.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/1.jrxml", "report/3.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/1.jrxml", "report/4.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/1.jrxml", "report/6.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/1.jrxml", "report/8.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/1.jrxml", "report/9.jasper");
			JasperCompileManager.compileReportToFile(
			        "report/1.jrxml", "report/10.jasper");
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //the path to the jrxml file to compile
                //2.jasper");//the path and name we want to save the compiled file to

		ma.initConnection();
		ma.showReport();
}*/
	
}
