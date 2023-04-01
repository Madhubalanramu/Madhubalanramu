package com.example.exception;

public class ResourceNotFoundException extends RuntimeException
{
	private static final long serialVersionUID=1L;
	private String resourcename;//name
	private String fieldname;//id
	private Object fieldvalue;
	public ResourceNotFoundException(String resourcename, String fieldname, Object fieldvalue) {
		super(resourcename + "Not Found With The Value "+ fieldname +": "+fieldvalue);
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	
}
