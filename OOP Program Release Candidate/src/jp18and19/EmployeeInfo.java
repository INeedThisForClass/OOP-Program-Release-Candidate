package jp18and19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

	StringBuilder name;
	String code;
	String deptId;
	Pattern p;
	Scanner in;

	public EmployeeInfo() {
		in = new Scanner(System.in);
		setName(new StringBuilder(inputName()));
		if (checkName(new String(name))) {
			createEmployeeCode(new StringBuilder(name));
		} else {
			code = "guest";
		}
		p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
		String id = getId();
		if (validId(id)) {
			setDeptId(id);
		} else {
			setDeptId("None01");
		}
		in.close();
	}

	public String toString() {
		return "Employee Code: " + code + "\n" + "Department Number: " + deptId;
	}

	public String getDeptId() {
		return deptId;
	}

	private void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	private String getId() {
		System.out.print("Please enter the department ID: ");
		return in.nextLine();
	}

	private boolean validId(String id) {
		return Pattern.matches("[A-Z][a-z]{3}[0-9]{2}", id);
	}

	public StringBuilder getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	private void setName(StringBuilder name) {
		this.name = name;
	}

	private void createEmployeeCode(StringBuilder name) {
		int spaceChar = name.indexOf(" ");
		this.code = name.charAt(0) + name.substring(spaceChar + 1);
	}

	private String inputName() {
		System.out.print("Please enter your first and last name: ");
		String name = in.nextLine();
		return name;
	}

	private boolean checkName(String name) {
		if (name.contains(" "))
			return true;
		return false;
	}

}