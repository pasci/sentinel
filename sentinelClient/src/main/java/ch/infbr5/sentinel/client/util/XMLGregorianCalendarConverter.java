package ch.infbr5.sentinel.client.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
 
/**
 * Converts different objects into XMLGregorianCalendar
 * Source: http://www.heber.it/wordpress/?p=239#anchor_2
 */
public class XMLGregorianCalendarConverter {
 
    /**
     * Converts Date object into XMLGregorianCalendar
     *
     * @param date Object to be converted
     * @return XMLGregorianCalendar
     */
    private static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) {
 
        try {
            GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
            gc.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (DatatypeConfigurationException e) {
            // TODO: Optimize exception handling
            System.out.print(e.getMessage());
            return null;
        }
    }
 
    /**
     * Converts a formatted string into XMLGregorianCalendar
     *
     * @param datetime Formatted string
     * @param sdf Date format of the given string
     * @return XMLGregorianCalendar
     */
    public static XMLGregorianCalendar stringToXMLGregorianCalendar(String datetime, SimpleDateFormat sdf) {
        try {
            Date date = sdf.parse(datetime);
            
            return dateToXMLGregorianCalendar(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
