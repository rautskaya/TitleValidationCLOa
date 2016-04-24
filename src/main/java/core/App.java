package core;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(separators = ":")

public class App {
	     
//	     @Parameter(names = { "-u", "--url" }, description = "url", required = true)
	     @Parameter(names = { "-u", "--url" }, description = "Url is")
	       private static String url = "www.google.com";
	     
//	     @Parameter(names = { "e", "--expectedtitle" }, description = "Expected title", required = true)
	     @Parameter(names = { "-e", "--expectedtitle" }, description = "Expected title is")
	       private static String expectedtitle = "Google";
	     
	     @Parameter(names = "--help", help = true, hidden = true)
	            private static boolean help = false;
	
	public static void main(String[] args) {
		
		new JCommander(new App(), args);
//		            JCommander cli = new JCommander(new App(), args);
		              if (help) {
		                     new JCommander(new App(), args).usage();
//		                  cli.usage();
		                     System.exit(0);
		              }
		           System.out.println("Url is " + url + ", Expected title is " + expectedtitle);
		           
		       }

}