
package ch.infbr5.sentinel.client.wsgen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for praesenzStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="praesenzStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INNERHALB"/>
 *     &lt;enumeration value="AUSSERHALB"/>
 *     &lt;enumeration value="ANGEMELDET"/>
 *     &lt;enumeration value="URLAUB"/>
 *     &lt;enumeration value="ABGEMELDET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "praesenzStatus")
@XmlEnum
public enum PraesenzStatus {

    INNERHALB,
    AUSSERHALB,
    ANGEMELDET,
    URLAUB,
    ABGEMELDET;

    public String value() {
        return name();
    }

    public static PraesenzStatus fromValue(String v) {
        return valueOf(v);
    }

}
