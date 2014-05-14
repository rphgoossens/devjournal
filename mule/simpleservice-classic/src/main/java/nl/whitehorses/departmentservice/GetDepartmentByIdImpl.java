package nl.whitehorses.departmentservice;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding; 

@WebService(targetNamespace = "http://whitehorses.nl/DepartmentService", name = "GetDepartmentById", serviceName="DepartmentService", portName="GetDepartmentById")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GetDepartmentByIdImpl implements GetDepartmentById {

	@Override
	public DepartmentServiceResponse getDepartmentById(
			DepartmentServiceRequest in) {
		// TODO Auto-generated method stub
		DepartmentServiceResponse response = new DepartmentServiceResponse();
		DepartmentType department = new DepartmentType();
		department.setDepartmentId(in.getDepartmentId());
		department.setDepartmentName("Eindhoven");
		response.setDepartment(department);
		
		return response;
	}

}
