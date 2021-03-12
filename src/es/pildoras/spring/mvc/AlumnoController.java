package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder Binder) {
		StringTrimmerEditor recortaEspaciosBlancos = new StringTrimmerEditor(true);
		
		Binder.registerCustomEditor(String.class, recortaEspaciosBlancos);
	}
	
	@RequestMapping("/muestraFormulario")
	public String mostrarFormulario(Model modelo) {
		
		Alumno alumno1 = new Alumno();
		
		modelo.addAttribute("alumno1",alumno1);
		
		return "alumnoRegistroFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarformulario(@Valid @ModelAttribute("alumno1")Alumno alumno, BindingResult ResultadoValidacion) {
		
		if(ResultadoValidacion.hasErrors()){
			return "alumnoRegistroFormulario";
		}
		else {
			return "confirmacionRegistroAlumno";
		}
		
	}
}
