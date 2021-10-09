package runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;






public class Reporting {

	
public static void jvmReport(String jsonFile) {
	File reportdirectory =new File("C:\\Users\\FIRE MANI\\eclipse-workspace\\cucumber\\src\\test\\resources\\Report");
	Configuration config = new Configuration(reportdirectory,"prabha");
	config.addClassifications("browser","chromebrowser");
	config.addClassifications("browserversion","95");
	List<String>jsonFiles=new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder= new ReportBuilder(jsonFiles,config);
	builder.generateReports();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
