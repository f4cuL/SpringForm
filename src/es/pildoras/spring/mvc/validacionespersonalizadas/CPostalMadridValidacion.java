package es.pildoras.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>  {

	@Override
	public void initialize(CPostalMadrid arg0) {
		
		prefijoCodigoMadrid = arg0.value();
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		return false;
	}
	
	private String prefijoCodigoMadrid;
	
}
