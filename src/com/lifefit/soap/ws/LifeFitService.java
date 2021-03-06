
package com.lifefit.soap.ws;

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
@WebServiceClient(name = "LifeFitService", targetNamespace = "http://ws.soap.lifefit.com/", wsdlLocation = "https://lifefit-localdb-181499.herokuapp.com/ws/lifefit?wsdl")
public class LifeFitService
    extends Service
{

    private final static URL LIFEFITSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIFEFITSERVICE_EXCEPTION;
    private final static QName LIFEFITSERVICE_QNAME = new QName("http://ws.soap.lifefit.com/", "LifeFitService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://lifefit-localdb-181499.herokuapp.com/ws/lifefit?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIFEFITSERVICE_WSDL_LOCATION = url;
        LIFEFITSERVICE_EXCEPTION = e;
    }

    public LifeFitService() {
        super(__getWsdlLocation(), LIFEFITSERVICE_QNAME);
    }

    public LifeFitService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIFEFITSERVICE_QNAME, features);
    }

    public LifeFitService(URL wsdlLocation) {
        super(wsdlLocation, LIFEFITSERVICE_QNAME);
    }

    public LifeFitService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIFEFITSERVICE_QNAME, features);
    }

    public LifeFitService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LifeFitService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LifeFit
     */
    @WebEndpoint(name = "LifeFitImplPort")
    public LifeFit getLifeFitImplPort() {
        return super.getPort(new QName("http://ws.soap.lifefit.com/", "LifeFitImplPort"), LifeFit.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LifeFit
     */
    @WebEndpoint(name = "LifeFitImplPort")
    public LifeFit getLifeFitImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.soap.lifefit.com/", "LifeFitImplPort"), LifeFit.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIFEFITSERVICE_EXCEPTION!= null) {
            throw LIFEFITSERVICE_EXCEPTION;
        }
        return LIFEFITSERVICE_WSDL_LOCATION;
    }

}
