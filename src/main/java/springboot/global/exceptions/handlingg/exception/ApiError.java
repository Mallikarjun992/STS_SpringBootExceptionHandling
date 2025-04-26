package springboot.global.exceptions.handlingg.exception;

import java.util.Date;

import lombok.Data;

@Data
public class ApiError
{
	private Integer errorCode;
	private String errorDescription;
	private Date date;
	
	public ApiError(Integer errorCode, String errorDescription, Date date)
	{
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		this.date = date;
	}	
}