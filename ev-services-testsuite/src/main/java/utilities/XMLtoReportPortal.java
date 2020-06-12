/*
package com.wipro.webservice.appassure;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static com.wipro.webservice.appassure.ReportPortalGlobal.*;
import static com.wipro.webservice.appassure.APIRequest.*;


public class XMLtoReportPortal {


	public static void main(String[] args) throws IOException {
		try {
		sendtoReportPortal();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("TC Map: "+StepMap.toString());

	}

	public static void sendtoReportPortal() throws IOException {
		Logs = Logger.getLogger(Log4JLogger.class.getName());
		DOMConfigurator.configure("./log4j.xml");

		getlaunchDetails();
		post_StartLaunch();

		getTestsDetails();
		getStepsDetails();

			for(Map.Entry<String, Object> entry : StepMap.entrySet()) {
			PostStepID = entry.getKey();
			@SuppressWarnings("unchecked")
			HashMap<String, String> attribute = (HashMap<String, String>) entry.getValue();
			StepNumber = attribute.get("tempStepNumber");
			StepDescription = attribute.get("tempStepDescription");
			StepComments = attribute.get("tempStepComments");
			StepResult = attribute.get("tempStepResult");
			put_Step();
		} 


		for(Map.Entry<String, Object> entry : TestCaseMap.entrySet()) {
			PostTestID = entry.getKey();
			@SuppressWarnings("unchecked")
			HashMap<String, String> attribute = (HashMap<String, String>) entry.getValue();
			TestCaseID = attribute.get("tempTestCaseID");
			TestCaseDescription = attribute.get("tempTestCaseDescription");
			TestResult = attribute.get("tempTestResult");
			put_Test();
		} 

		put_Launch();

		System.out.println("-------------Bingo!-----------Result has Pushed to reportPortal-------");
	}

	public static Document convertXMLtoDoc() {
		Document doc=null;;
		File xmlFile = new File(getInputXML());
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xmlFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();
		return doc;
	}

	//Get launch details to push in reportPortal
	public static void getlaunchDetails() {
		NodeList nListLaunch = convertXMLtoDoc().getElementsByTagName("TEST_RESULT_NAME");
		Node nNode = nListLaunch.item(0);
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;
			LaunchDescription = eElement.getElementsByTagName("HEADER").item(0).getTextContent().substring(0,28);
			System.out.println("launch description: "+LaunchDescription);
		}
	}

	//Get suite details to push in reportPortal
	public static void getTestsDetails() throws IOException {
		NodeList nListTestCase = convertXMLtoDoc().getElementsByTagName("TestCase");
		System.out.println(nListTestCase.getLength());
		for (int count = 0; count < nListTestCase.getLength(); count++) {
			HashMap<String, String> testAttribute = new HashMap<String, String>();
			Node nNode = nListTestCase.item(count);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				TestCaseID = eElement.getElementsByTagName("TESTCASE-ID").item(0).getTextContent();
				testAttribute.put("tempTestCaseID", TestCaseID);
				TestCaseDescription = eElement.getElementsByTagName("TESTCASE-DESCRIPTION").item(0).getTextContent();
				testAttribute.put("tempTestCaseDescription", TestCaseDescription);
				TestResult = eElement.getElementsByTagName("OVERALL-RESULT").item(0).getTextContent().substring(0, 4);
				testAttribute.put("tempTestResult", TestResult);

			}

			post_StartTest();
			TestCaseMap.put(PostTestID, testAttribute);
		}

	}

	//Get test details to push in reportPortal
	public static void getStepsDetails() throws IOException {
		NodeList nListStep = convertXMLtoDoc().getElementsByTagName("Step");
		System.out.println(nListStep.getLength());
		for (int count = 0; count < nListStep.getLength(); count++) {
			HashMap<String, String> stepAttribute = new HashMap<String, String>();
			Node nNode = nListStep.item(count);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				StepNumber = eElement.getElementsByTagName("StepNumber").item(0).getTextContent();
				stepAttribute.put("tempStepNumber", StepNumber);
				StepDescription = eElement.getElementsByTagName("Description").item(0).getTextContent();
				stepAttribute.put("tempStepDescription", StepDescription);
				StepComments = eElement.getElementsByTagName("Comments").item(0).getTextContent().substring(0, 5);
				stepAttribute.put("tempStepComments", StepComments);
				if(eElement.getElementsByTagName("Result").item(0).getTextContent().equals("Pass")||eElement.getElementsByTagName("Result").item(0).getTextContent().equals("PASS")) {
					StepResult = "PASSED";
					stepAttribute.put("tempStepResult", StepResult);
				}else {
					StepResult = eElement.getElementsByTagName("Result").item(0).getTextContent();
					stepAttribute.put("tempStepResult", StepResult);
				}
				post_StartStep();
				post_Log();

			}
			StepMap.put(PostStepID, stepAttribute);
			System.out.println("---------------------------------------------");
		}

	}

}

*/
