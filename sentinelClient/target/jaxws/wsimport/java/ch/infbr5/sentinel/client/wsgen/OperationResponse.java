
package ch.infbr5.sentinel.client.wsgen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counterAngemeldet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="counterIn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="counterOut" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="counterUrlaub" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personDetails" type="{http://ws.sentinel.infbr5.ch/}personDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personTriggerEintrag" type="{http://ws.sentinel.infbr5.ch/}operatorEintrag" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.sentinel.infbr5.ch/}operationResponseStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationResponse", propOrder = {
    "counterAngemeldet",
    "counterIn",
    "counterOut",
    "counterUrlaub",
    "imageId",
    "message",
    "personDetails",
    "personTriggerEintrag",
    "status"
})
public class OperationResponse {

    protected Long counterAngemeldet;
    protected Long counterIn;
    protected Long counterOut;
    protected Long counterUrlaub;
    protected String imageId;
    protected String message;
    @XmlElement(nillable = true)
    protected List<PersonDetails> personDetails;
    protected OperatorEintrag personTriggerEintrag;
    protected OperationResponseStatus status;

    /**
     * Gets the value of the counterAngemeldet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCounterAngemeldet() {
        return counterAngemeldet;
    }

    /**
     * Sets the value of the counterAngemeldet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCounterAngemeldet(Long value) {
        this.counterAngemeldet = value;
    }

    /**
     * Gets the value of the counterIn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCounterIn() {
        return counterIn;
    }

    /**
     * Sets the value of the counterIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCounterIn(Long value) {
        this.counterIn = value;
    }

    /**
     * Gets the value of the counterOut property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCounterOut() {
        return counterOut;
    }

    /**
     * Sets the value of the counterOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCounterOut(Long value) {
        this.counterOut = value;
    }

    /**
     * Gets the value of the counterUrlaub property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCounterUrlaub() {
        return counterUrlaub;
    }

    /**
     * Sets the value of the counterUrlaub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCounterUrlaub(Long value) {
        this.counterUrlaub = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the personDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDetails }
     * 
     * 
     */
    public List<PersonDetails> getPersonDetails() {
        if (personDetails == null) {
            personDetails = new ArrayList<PersonDetails>();
        }
        return this.personDetails;
    }

    /**
     * Gets the value of the personTriggerEintrag property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEintrag }
     *     
     */
    public OperatorEintrag getPersonTriggerEintrag() {
        return personTriggerEintrag;
    }

    /**
     * Sets the value of the personTriggerEintrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEintrag }
     *     
     */
    public void setPersonTriggerEintrag(OperatorEintrag value) {
        this.personTriggerEintrag = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResponseStatus }
     *     
     */
    public OperationResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResponseStatus }
     *     
     */
    public void setStatus(OperationResponseStatus value) {
        this.status = value;
    }

}
