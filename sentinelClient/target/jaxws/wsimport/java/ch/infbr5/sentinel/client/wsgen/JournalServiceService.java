
package ch.infbr5.sentinel.client.wsgen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JournalServiceService", targetNamespace = "http://ws.sentinel.infbr5.ch/", wsdlLocation = "http://localhost:8080/journal?wsdl")
public class JournalServiceService
    extends Service
{

    private final static URL JOURNALSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException JOURNALSERVICESERVICE_EXCEPTION;
    private final static QName JOURNALSERVICESERVICE_QNAME = new QName("http://ws.sentinel.infbr5.ch/", "JournalServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/journal?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JOURNALSERVICESERVICE_WSDL_LOCATION = url;
        JOURNALSERVICESERVICE_EXCEPTION = e;
    }

    public JournalServiceService() {
        super(__getWsdlLocation(), JOURNALSERVICESERVICE_QNAME);
    }

    public JournalServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JOURNALSERVICESERVICE_QNAME, features);
    }

    public JournalServiceService(URL wsdlLocation) {
        super(wsdlLocation, JOURNALSERVICESERVICE_QNAME);
    }

    public JournalServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JOURNALSERVICESERVICE_QNAME, features);
    }

    public JournalServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JournalServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JournalService
     */
    @WebEndpoint(name = "JournalServicePort")
    public JournalService getJournalServicePort() {
        return super.getPort(new QName("http://ws.sentinel.infbr5.ch/", "JournalServicePort"), JournalService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JournalService
     */
    @WebEndpoint(name = "JournalServicePort")
    public JournalService getJournalServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.sentinel.infbr5.ch/", "JournalServicePort"), JournalService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JOURNALSERVICESERVICE_EXCEPTION!= null) {
            throw JOURNALSERVICESERVICE_EXCEPTION;
        }
        return JOURNALSERVICESERVICE_WSDL_LOCATION;
    }

}
