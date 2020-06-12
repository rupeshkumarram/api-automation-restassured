/*
package com.wipro.webservice.appassure;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.wipro.webservice.appassure.ReportPortalGlobal.*;

public class PayLoads {

	public static String startLaunch() {
		String payLoad = "{\"description\": \""+LaunchDescription+"\",\r\n\"mode\": \"DEFAULT\",\r\n\"name\": \""+LaunchName+"\",\r\n\"start_time\": \""+getDate()+"\",\r\n\"tags\": [\"tag\"]}";
		Logs.info("Start launch payload called");
		return payLoad;
	}

	public static String startTest() {
		String payLoad = "{\"description\": \""+TestCaseDescription+"\",\r\n\"launch_id\": \""+PostLaunchID+"\",\r\n\"name\": \""+TestCaseID+"\",\r\n\"parameters\": [\r\n{\r\n\"key\": \"parameter key\",\r\n\"value\": \"parameter value\"\r\n}\r\n],\r\n\"start_time\": \""+getDate()+"\",\r\n\"tags\": [\"demo\"],\r\n\"type\": \"TEST\",\r\n\"uniqueId\": \"uniquedId\"}";
		Logs.info("Start suite payload called");
		return payLoad;
	}

	public static String startStep() {
		String payLoad = "{\"description\": \""+StepDescription+"\",\r\n\"launch_id\": \""+PostLaunchID+"\",\r\n\"name\": \""+StepNumber+"\",\r\n\"parameters\": [\r\n{\r\n\"key\": \"parameter key\",\r\n\"value\": \"parameter value\"\r\n}\r\n],\r\n\"start_time\": \""+getDate()+"\",\r\n\"tags\": [\"demo\"],\r\n\"type\": \"TEST\",\r\n\"uniqueId\": \"unique id\"}";
		Logs.info("Start test payload called");
		return payLoad;
	}

	public static String postLogs() {
		String payLoad = "{\"file\": {\r\n\"name\": \"photo\",\r\n\"content\" : \"byte content\",\r\n\"contentType\" : \"jpeg\"\r\n},\r\n\"item_id\": \""+PostStepID+"\",\r\n\"level\": \"log info\",\r\n\"message\": \""+StepComments+"\",\r\n\"time\": \""+getDate()+"\"}";
		Logs.info("Test logs payload called");
		return payLoad;
	}

	public static String finishStep() {
		String payLoad = "{\"description\": \""+StepDescription+"\",\r\n\"end_time\": \""+getDate()+"\",\r\n\"issue\": {\r\n\"comment\": \"comment_text\",\r\n\"issue_type\": \"TI001\"\r\n},\r\n\"status\": \""+StepResult+"\",\r\n\"tags\": [\"demo\"]}";
		Logs.info("Finish test payload called");
		return payLoad;
	}

	public static String finishTest() {
		String payLoad = "{\"description\": \""+TestCaseDescription+"\",\r\n\"end_time\": \""+getDate()+"\",\r\n\"issue\": {\r\n\"comment\": \"string\",\r\n\"issue_type\": \"TI001\"\r\n},\r\n\"status\": \""+TestResult+"\",\r\n\"tags\": [\"demo\"]}";
		Logs.info("Finish suite payload called");
		return payLoad;
	}

	public static String finishLaunch() {
		String payLoad = "{\"description\": \""+LaunchDescription+"\",\r\n\"end_time\": \""+getDate()+"\",\r\n\"tags\": [\"demo\"]}";
		Logs.info("Finish launch payload called");
		return payLoad;
	}

	public static String getDate() {
		String pattern = "yyyy-MM-dd'T'HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dateWIthoutZ = sdf.format(new Date());
		String date = dateWIthoutZ+"Z";
		return date;
	}

}
*/