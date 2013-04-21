
package ch.infbr5.sentinel.client.wsgen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConfigurationQueryService", targetNamespace = "http://ws.sentinel.infbr5.ch/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConfigurationQueryService {


    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPersonenRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPersonenResponse")
    public ConfigurationResponse getPersonen();

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getEinheitenRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getEinheitenResponse")
    public ConfigurationResponse getEinheiten();

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPrintJobsRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPrintJobsResponse")
    public ConfigurationResponse getPrintJobs();

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getZonenRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getZonenResponse")
    public ConfigurationResponse getZonen();

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getCheckpointsRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getCheckpointsResponse")
    public ConfigurationResponse getCheckpoints();

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getConfigurationValuesRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getConfigurationValuesResponse")
    public ConfigurationResponse getConfigurationValues();

    /**
     * 
     * @param arg0
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPersonByAhvNrRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPersonByAhvNrResponse")
    public ConfigurationResponse getPersonByAhvNr(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param personDetails
     */
    @WebMethod
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updatePersonRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "PersonDetails", partName = "PersonDetails")
        PersonDetails personDetails);

    /**
     * 
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removePersonRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removePersonResponse")
    public boolean removePerson(
        @WebParam(name = "personId", partName = "personId")
        long personId);

    /**
     * 
     * @param arg0
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPrintJobRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getPrintJobResponse")
    public ConfigurationResponse getPrintJob(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

    /**
     * 
     * @param einheitDetails
     */
    @WebMethod
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updateEinheitRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updateEinheitResponse")
    public void updateEinheit(
        @WebParam(name = "EinheitDetails", partName = "EinheitDetails")
        EinheitDetails einheitDetails);

    /**
     * 
     * @param einheitId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removeEinheitRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removeEinheitResponse")
    public boolean removeEinheit(
        @WebParam(name = "einheitId", partName = "einheitId")
        long einheitId);

    /**
     * 
     * @param checkpointDetails
     */
    @WebMethod
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updateCheckpointRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updateCheckpointResponse")
    public void updateCheckpoint(
        @WebParam(name = "CheckpointDetails", partName = "CheckpointDetails")
        CheckpointDetails checkpointDetails);

    /**
     * 
     * @param checkpointId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removeCheckpointRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removeCheckpointResponse")
    public boolean removeCheckpoint(
        @WebParam(name = "checkpointId", partName = "checkpointId")
        long checkpointId);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updateConfigurationValueRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/updateConfigurationValueResponse")
    public void updateConfigurationValue(
        @WebParam(name = "arg0", partName = "arg0")
        ConfigurationDetails arg0);

    /**
     * 
     * @param checkpointId
     * @param key
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getConfigurationValueRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getConfigurationValueResponse")
    public ConfigurationResponse getConfigurationValue(
        @WebParam(name = "checkpointId", partName = "checkpointId")
        long checkpointId,
        @WebParam(name = "key", partName = "key")
        String key);

    /**
     * 
     * @param key
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getGlobalConfigurationValueRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getGlobalConfigurationValueResponse")
    public ConfigurationResponse getGlobalConfigurationValue(
        @WebParam(name = "key", partName = "key")
        String key);

    /**
     * 
     * @param configurationId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removeConfigurationRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/removeConfigurationResponse")
    public boolean removeConfiguration(
        @WebParam(name = "configurationId", partName = "configurationId")
        long configurationId);

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/printAusweiseRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/printAusweiseResponse")
    public ConfigurationResponse printAusweise();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/printAusweisListeRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/printAusweisListeResponse")
    public ConfigurationResponse printAusweisListe(
        @WebParam(name = "arg0", partName = "arg0")
        boolean arg0,
        @WebParam(name = "arg1", partName = "arg1")
        boolean arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.ConfigurationResponse
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/printAusweisboxInventarRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/printAusweisboxInventarResponse")
    public ConfigurationResponse printAusweisboxInventar(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns ch.infbr5.sentinel.client.wsgen.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getGradValuesRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getGradValuesResponse")
    public StringArray getGradValues();

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/exportConfigDataRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/exportConfigDataResponse")
    public byte[] exportConfigData(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/exportPersonDataRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/exportPersonDataResponse")
    public byte[] exportPersonData(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/importPersonDataRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/importPersonDataResponse")
    public boolean importPersonData(
        @WebParam(name = "arg0", partName = "arg0")
        byte[] arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/importConfigDataRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/importConfigDataResponse")
    public boolean importConfigData(
        @WebParam(name = "arg0", partName = "arg0")
        byte[] arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getLocalImagePathRequest", output = "http://ws.sentinel.infbr5.ch/ConfigurationQueryService/getLocalImagePathResponse")
    public String getLocalImagePath();

}
