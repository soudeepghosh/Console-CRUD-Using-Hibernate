package in.soudeep.dao;

import in.soudeep.dataobjects.Employee;

public interface IEmployeeDao {
	public String insertRecord(Employee employee);
	public Employee readRecord(Integer eid);
	public String updateRecord(Employee employee);
	public String deleteRecord(Integer eid);
	
}
