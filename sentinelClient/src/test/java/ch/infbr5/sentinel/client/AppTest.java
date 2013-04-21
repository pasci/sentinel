package ch.infbr5.sentinel.client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ch.infbr5.sentinel.client.wsgen.OperationResponse;
import ch.infbr5.sentinel.client.wsgen.SentinelQueryService;
import ch.infbr5.sentinel.client.wsgen.SentinelQueryServiceService;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		System.setProperty("javax.net.ssl.trustStore", ClassLoader.getSystemResource("META-INF/sentinel.jks").getFile());

		System.setProperty("javax.net.ssl.trustStorePassword", "infbr5");
		System.setProperty("javax.net.ssl.keyStore", ClassLoader.getSystemResource("META-INF/sentinel.jks").getFile());
		System.setProperty("javax.net.ssl.keyStorePassword", "infbr5");
		// System.setProperty("javax.net.ssl.keyStoreType", "JKS");

		// done to prevent CN verification in client keystore
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		});

		SentinelQueryService service;
		// try {
		// service = new SentinelQueryServiceService(new
		// URL("https://localhost:7443/services?wsdl"), new QName(
		// "http://ws.sentinel.infbr5.ch/",
		// "SentinelQueryServiceService")).getSentinelQueryServicePort();

		service = new SentinelQueryServiceService().getSentinelQueryServicePort();

		OperationResponse resp = service.checkin(1, "A123456");
		System.out.println(resp.getMessage());
		// resp = service.checkin(0, "test");
		// System.out.println(resp.getMessage());

		// } catch (MalformedURLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//

	}
}
