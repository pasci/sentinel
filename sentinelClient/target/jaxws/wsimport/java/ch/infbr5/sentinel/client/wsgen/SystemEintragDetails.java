
package ch.infbr5.sentinel.client.wsgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemEintragDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemEintragDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sentinel.infbr5.ch/}journalEintragDetails">
 *       &lt;sequence>
 *         &lt;element name="incidenceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemEintragDetails", propOrder = {
    "incidenceClass"
})
public class SystemEintragDetails
    extends JournalEintragDetails
{

    protected String incidenceClass;

    /**
     * Gets the value of the incidenceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidenceClass() {
        return incidenceClass;
    }

    /**
     * Sets the value of the incidenceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidenceClass(String value) {
        this.incidenceClass = value;
    }

}
