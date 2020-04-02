package componentscan;

import org.springframework.stereotype.Component;

@Component
public class EmployeScan {

	public EmployeScan() {
		System.out.println("Employee constructor!!!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello components scan done!!";
	}
}
