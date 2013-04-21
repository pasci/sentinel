
package ch.infbr5.sentinel.client.wsgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operatorEintragDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operatorEintragDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sentinel.infbr5.ch/}journalEintragDetails">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="done" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="personTriggerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatorEintragDetails", propOrder = {
    "action",
    "done",
    "personTriggerId"
})
public class OperatorEintragDetails
    extends JournalEintragDetails
{

    protected String action;
    protected boolean done;
    protected String personTriggerId;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the done property.
     * 
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     */
    public void setDone(boolean value) {
        this.done = value;
    }

    /**
     * Gets the value of the personTriggerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTriggerId() {
        return personTriggerId;
    }

    /**
     * Sets the value of the personTriggerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTriggerId(String value) {
        this.personTriggerId = value;
    }

}
