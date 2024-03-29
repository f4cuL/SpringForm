package es.pildoras.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CPostalMadridValidacion.class) // Futura clase que contendra la l�gica de la validaci�n 
@Target({ElementType.METHOD, ElementType.FIELD}) // Destino de nuestra validaci�n a m�todos o campos
@Retention(RetentionPolicy.RUNTIME) // Checkea la anotaci�n en tiempo de ejecuci�n
public @interface CPostalMadrid {
	
	//Definir el c postal por defecto
	public String value() default"28";
	//Definir el mensaje de error
	public String message() default "El codigo debe comenzar por 28";
	//Definir los grupos
	Class<?>[] groups() default {};
	//Definir los payloads
	Class<? extends Payload>[] payload() default {};
}
