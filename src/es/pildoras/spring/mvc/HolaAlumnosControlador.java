package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	@RequestMapping("/procesarFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
	  public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		
		nombre+=" es el mejor alumno";
		
		String mensajeFinal= "�Qui�n es el mejor alumno? "+nombre;
		
		//Agregando info al modelo
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);

		return "HolaAlumnosSpring";
		
	}
}
