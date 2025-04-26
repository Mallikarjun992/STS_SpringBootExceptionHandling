package springboot.global.exceptions.handlingg.exception;

public class CustomerNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 6963027884189989156L;

	public CustomerNotFoundException(String str)
	{
		super(str);
	}
}