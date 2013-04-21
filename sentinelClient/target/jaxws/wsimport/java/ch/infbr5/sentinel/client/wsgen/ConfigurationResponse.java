
package ch.infbr5.sentinel.client.wsgen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkpointDetails" type="{http://ws.sentinel.infbr5.ch/}checkpointDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configurationDetails" type="{http://ws.sentinel.infbr5.ch/}configurationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="einheitDetails" type="{http://ws.sentinel.infbr5.ch/}einheitDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personDetails" type="{http://ws.sentinel.infbr5.ch/}personDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="printJobDetails" type="{http://ws.sentinel.infbr5.ch/}printJobDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zoneDetails" type="{http://ws.sentinel.infbr5.ch/}zoneDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationResponse", propOrder = {
    "checkpointDetails",
    "configurationDetails",
    "einheitDetails",
    "personDetails",
    "printJobDetails",
    "zoneDetails"
})
public class ConfigurationResponse {

    @XmlElement(nillable = true)
    protected List<CheckpointDetails> checkpointDetails;
    @XmlElement(nillable = true)
    protected List<ConfigurationDetails> configurationDetails;
    @XmlElement(nillable = true)
    protected List<EinheitDetails> einheitDetails;
    @XmlElement(nillable = true)
    protected List<PersonDetails> personDetails;
    @XmlElement(nillable = true)
    protected List<PrintJobDetails> printJobDetails;
    @XmlElement(nillable = true)
    protected List<ZoneDetails> zoneDetails;

    /**
     * Gets the value of the checkpointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkpointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckpointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckpointDetails }
     * 
     * 
     */
    public List<CheckpointDetails> getCheckpointDetails() {
        if (checkpointDetails == null) {
            checkpointDetails = new ArrayList<CheckpointDetails>();
        }
        return this.checkpointDetails;
    }

    /**
     * Gets the value of the configurationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationDetails }
     * 
     * 
     */
    public List<ConfigurationDetails> getConfigurationDetails() {
        if (configurationDetails == null) {
            configurationDetails = new ArrayList<ConfigurationDetails>();
        }
        return this.configurationDetails;
    }

    /**
     * Gets the value of the einheitDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the einheitDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEinheitDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EinheitDetails }
     * 
     * 
     */
    public List<EinheitDetails> getEinheitDetails() {
        if (einheitDetails == null) {
            einheitDetails = new ArrayList<EinheitDetails>();
        }
        return this.einheitDetails;
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
     * Gets the value of the printJobDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printJobDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintJobDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrintJobDetails }
     * 
     * 
     */
    public List<PrintJobDetails> getPrintJobDetails() {
        if (printJobDetails == null) {
            printJobDetails = new ArrayList<PrintJobDetails>();
        }
        return this.printJobDetails;
    }

    /**
     * Gets the value of the zoneDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneDetails }
     * 
     * 
     */
    public List<ZoneDetails> getZoneDetails() {
        if (zoneDetails == null) {
            zoneDetails = new ArrayList<ZoneDetails>();
        }
        return this.zoneDetails;
    }

}
