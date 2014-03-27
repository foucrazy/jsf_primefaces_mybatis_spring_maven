package com.foucrazy.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;

import com.foucrazy.model.Curso;
import com.foucrazy.model.Nivel;
import com.foucrazy.model.Profesor;
import com.foucrazy.service.CursosService;
import com.foucrazy.service.NivelesService;
import com.foucrazy.service.ProfesoresService;

public class CursoBean implements Serializable {

	private final Logger LOGGER = Logger.getLogger(CursoBean.class);

	private static final long serialVersionUID = 6278561386236206879L;
	private Integer idCurso;
	private String titulo;
	private Integer horas;
	private Integer idNivel;
	private Integer idProfesor;
	private boolean activo;
	//Cache de listado de cursos activos
	private List<Curso> listaActivos;
	private UploadedFile file;
	private CursosService cursosService;
	private NivelesService nivelesService;
	private ProfesoresService profesoresService;
	
	private final String LISTADO_VIEW="listado";

	public CursoBean() {

	}
	
    public UploadedFile getFile() {
        return file;
    }
 
    public void setFile(UploadedFile file) {
        this.file = file;
    }	
	
	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(Integer idNivel) {
		this.idNivel = idNivel;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public CursosService getCursosService() {
		return cursosService;
	}

	public void setCursosService(CursosService cursosService) {
		this.cursosService = cursosService;
	}

	public NivelesService getNivelesService() {
		return nivelesService;
	}

	public void setNivelesService(NivelesService nivelesService) {
		this.nivelesService = nivelesService;
	}

	public ProfesoresService getProfesoresService() {
		return profesoresService;
	}

	public void setProfesoresService(ProfesoresService profesoresService) {
		this.profesoresService = profesoresService;
	}

	/**
	 * Limpia los datos del Bean ya que utiliza un scope de session
	 */
	private void clean(){
		this.setTitulo("");
		this.setActivo(false);
		this.setHoras(null);
		this.setIdProfesor(null);
		this.setIdNivel(null);		
		this.listaActivos=null;//Para forzar recarga del listado
	}

	public List<Curso> getListadoActivos() {
		if (listaActivos==null){
			LOGGER.debug("Obteniendo listado cursos activos");
			this.listaActivos = cursosService.getAllActive();			
		}
		return this.listaActivos;
	}
	
	public Nivel[] getListadoNiveles() {
		LOGGER.debug("Obteniendo listado niveles");
		List<Nivel> lista = nivelesService.getAll();
		Nivel[] niveles = lista.toArray(new Nivel[lista.size()]);
		return niveles;
	}
	
	public Profesor[] getListadoProfesores() {
		LOGGER.debug("Obteniendo listado profesores");
		List<Profesor> lista = profesoresService.getAll();
		Profesor[] profesores = lista.toArray(new Profesor[lista.size()]);
		return profesores;
	}    
	    
	public String guardar() {
		LOGGER.debug("Guardando curso: " + this.toString());
		String documento="";
		if (this.getFile()!=null){
			documento=getFile().getFileName();
	        try {
	            copyFile(documento, getFile().getInputstream());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }			
		}
		
		Nivel nivel = new Nivel(getIdNivel());
		Profesor profesor = new Profesor(getIdProfesor());
		Curso nuevoCurso = new Curso(getTitulo(), getHoras(),nivel,	profesor, isActivo(),documento);
		cursosService.create(nuevoCurso);		
		
		this.clean();	
		return LISTADO_VIEW;
	}    

    public void copyFile(String fileName, InputStream in) {
       try {
    	   String path=System.getProperty("catalina.base")+"\\webapps\\jsf_primefaces_mybatis_spring_maven\\" + fileName;
    	   LOGGER.info("Copiando archivo a "+path);
           OutputStream out = new FileOutputStream(new File(path));
         
            int read = 0;
            byte[] bytes = new byte[1024];
         
            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
         
            in.close();
            out.flush();
            out.close();             
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
	
	@Override
	public String toString() {
		return "CursoBean [idCurso=" + idCurso + ", titulo=" + titulo
				+ ", horas=" + horas + ", idNivel=" + idNivel + ", idProfesor="
				+ idProfesor + ", activo=" + activo + "]";
	}	

}
