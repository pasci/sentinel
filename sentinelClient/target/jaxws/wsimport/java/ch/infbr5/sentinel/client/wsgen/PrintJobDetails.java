
package ch.infbr5.sentinel.client.wsgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for printJobDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="printJobDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="pintJobFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="printJobDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="printJobDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="printJobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "printJobDetails", propOrder = {
    "pdf",
    "pintJobFile",
    "printJobDate",
    "printJobDesc",
    "printJobId"
})
public class PrintJobDetails {

    protected byte[] pdf;
    protected String pintJobFile;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar printJobDate;
    protected String printJobDesc;
    protected Long printJobId;

    /**
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdf(byte[] value) {
        this.pdf = value;
    }

    /**
     * Gets the value of the pintJobFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPintJobFile() {
        return pintJobFile;
    }

    /**
     * Sets the value of the pintJobFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPintJobFile(String value) {
        this.pintJobFile = value;
    }

    /**
     * Gets the value of the printJobDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintJobDate() {
        return printJobDate;
    }

    /**
     * Sets the value of the printJobDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintJobDate(XMLGregorianCalendar value) {
        this.printJobDate = value;
    }

    /**
     * Gets the value of the printJobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintJobDesc() {
        return printJobDesc;
    }

    /**
     * Sets the value of the printJobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintJobDesc(String value) {
        this.printJobDesc = value;
    }

    /**
     * Gets the value of the printJobId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrintJobId() {
        return printJobId;
    }

    /**
     * Sets the value of the printJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrintJobId(Long value) {
        this.printJobId = value;
    }

}
