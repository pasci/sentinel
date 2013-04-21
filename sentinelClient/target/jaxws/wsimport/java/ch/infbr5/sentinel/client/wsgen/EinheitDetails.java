
package ch.infbr5.sentinel.client.wsgen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for einheitDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="einheitDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgbColor_Einh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgbColor_GsVb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgbColor_TrpK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text_Einh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text_GsVb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text_TrpK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "einheitDetails", propOrder = {
    "id",
    "name",
    "rgbColorEinh",
    "rgbColorGsVb",
    "rgbColorTrpK",
    "textEinh",
    "textGsVb",
    "textTrpK"
})
public class EinheitDetails {

    protected Long id;
    protected String name;
    @XmlElement(name = "rgbColor_Einh")
    protected String rgbColorEinh;
    @XmlElement(name = "rgbColor_GsVb")
    protected String rgbColorGsVb;
    @XmlElement(name = "rgbColor_TrpK")
    protected String rgbColorTrpK;
    @XmlElement(name = "text_Einh")
    protected String textEinh;
    @XmlElement(name = "text_GsVb")
    protected String textGsVb;
    @XmlElement(name = "text_TrpK")
    protected String textTrpK;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rgbColorEinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgbColorEinh() {
        return rgbColorEinh;
    }

    /**
     * Sets the value of the rgbColorEinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgbColorEinh(String value) {
        this.rgbColorEinh = value;
    }

    /**
     * Gets the value of the rgbColorGsVb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgbColorGsVb() {
        return rgbColorGsVb;
    }

    /**
     * Sets the value of the rgbColorGsVb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgbColorGsVb(String value) {
        this.rgbColorGsVb = value;
    }

    /**
     * Gets the value of the rgbColorTrpK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgbColorTrpK() {
        return rgbColorTrpK;
    }

    /**
     * Sets the value of the rgbColorTrpK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgbColorTrpK(String value) {
        this.rgbColorTrpK = value;
    }

    /**
     * Gets the value of the textEinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextEinh() {
        return textEinh;
    }

    /**
     * Sets the value of the textEinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextEinh(String value) {
        this.textEinh = value;
    }

    /**
     * Gets the value of the textGsVb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextGsVb() {
        return textGsVb;
    }

    /**
     * Sets the value of the textGsVb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextGsVb(String value) {
        this.textGsVb = value;
    }

    /**
     * Gets the value of the textTrpK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextTrpK() {
        return textTrpK;
    }

    /**
     * Sets the value of the textTrpK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextTrpK(String value) {
        this.textTrpK = value;
    }

}
