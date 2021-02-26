package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
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
