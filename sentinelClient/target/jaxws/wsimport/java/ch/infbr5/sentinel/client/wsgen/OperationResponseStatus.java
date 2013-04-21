
package ch.infbr5.sentinel.client.wsgen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationResponseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operationResponseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCESS"/>
 *     &lt;enumeration value="FAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationResponseStatus")
@XmlEnum
public enum OperationResponseStatus {

    SUCESS,
    FAIL;

    public String value() {
        return name();
    }

    public static OperationResponseStatus fromValue(String v) {
        return valueOf(v);
    }

}
