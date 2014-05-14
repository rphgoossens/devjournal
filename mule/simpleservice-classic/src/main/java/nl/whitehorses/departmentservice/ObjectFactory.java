
package nl.whitehorses.departmentservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.whitehorses.departmentservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.whitehorses.departmentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepartmentServiceResponse }
     * 
     */
    public DepartmentServiceResponse createDepartmentServiceResponse() {
        return new DepartmentServiceResponse();
    }

    /**
     * Create an instance of {@link DepartmentType }
     * 
     */
    public DepartmentType createDepartmentType() {
        return new DepartmentType();
    }

    /**
     * Create an instance of {@link DepartmentServiceRequest }
     * 
     */
    public DepartmentServiceRequest createDepartmentServiceRequest() {
        return new DepartmentServiceRequest();
    }

}
