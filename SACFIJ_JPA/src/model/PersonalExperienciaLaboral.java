package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the personal_experiencia_laboral database table.
 * 
 */
@Entity
@Table(name="personal_experiencia_laboral")
@NamedQuery(name="PersonalExperienciaLaboral.findAll", query="SELECT p FROM PersonalExperienciaLaboral p")
public class PersonalExperienciaLaboral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="experiencia_laboral_id")
	private int experienciaLaboralId;

	@Column(name="experiencia_laboral_anio")
	private int experienciaLaboralAnio;

	@Column(name="experiencia_laboral_cargo")
	private String experienciaLaboralCargo;

	@Column(name="experiencia_laboral_comentarios")
	private String experienciaLaboralComentarios;

	@Column(name="experiencia_laboral_contacto")
	private String experienciaLaboralContacto;

	@Column(name="experiencia_laboral_empresa")
	private String experienciaLaboralEmpresa;

	@Column(name="experiencia_laboral_estado")
	private int experienciaLaboralEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="experiencia_laboral_fecha_crea")
	private Date experienciaLaboralFechaCrea;

	@Temporal(TemporalType.DATE)
	@Column(name="experiencia_laboral_fecha_desde")
	private Date experienciaLaboralFechaDesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="experiencia_laboral_fecha_modifica")
	private Date experienciaLaboralFechaModifica;

	@Column(name="experiencia_laboral_telefono")
	private String experienciaLaboralTelefono;

	@Column(name="experiencia_laboral_usuario_crea")
	private int experienciaLaboralUsuarioCrea;

	@Column(name="experiencia_laboral_usuario_modifica")
	private int experienciaLaboralUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@ManyToOne
	@JoinColumn(name="experiencia_laboral_persona_id")
	private PersonalPersona personalPersona;

	public PersonalExperienciaLaboral() {
	}

	public int getExperienciaLaboralId() {
		return this.experienciaLaboralId;
	}

	public void setExperienciaLaboralId(int experienciaLaboralId) {
		this.experienciaLaboralId = experienciaLaboralId;
	}

	public int getExperienciaLaboralAnio() {
		return this.experienciaLaboralAnio;
	}

	public void setExperienciaLaboralAnio(int experienciaLaboralAnio) {
		this.experienciaLaboralAnio = experienciaLaboralAnio;
	}

	public String getExperienciaLaboralCargo() {
		return this.experienciaLaboralCargo;
	}

	public void setExperienciaLaboralCargo(String experienciaLaboralCargo) {
		this.experienciaLaboralCargo = experienciaLaboralCargo;
	}

	public String getExperienciaLaboralComentarios() {
		return this.experienciaLaboralComentarios;
	}

	public void setExperienciaLaboralComentarios(String experienciaLaboralComentarios) {
		this.experienciaLaboralComentarios = experienciaLaboralComentarios;
	}

	public String getExperienciaLaboralContacto() {
		return this.experienciaLaboralContacto;
	}

	public void setExperienciaLaboralContacto(String experienciaLaboralContacto) {
		this.experienciaLaboralContacto = experienciaLaboralContacto;
	}

	public String getExperienciaLaboralEmpresa() {
		return this.experienciaLaboralEmpresa;
	}

	public void setExperienciaLaboralEmpresa(String experienciaLaboralEmpresa) {
		this.experienciaLaboralEmpresa = experienciaLaboralEmpresa;
	}

	public int getExperienciaLaboralEstado() {
		return this.experienciaLaboralEstado;
	}

	public void setExperienciaLaboralEstado(int experienciaLaboralEstado) {
		this.experienciaLaboralEstado = experienciaLaboralEstado;
	}

	public Date getExperienciaLaboralFechaCrea() {
		return this.experienciaLaboralFechaCrea;
	}

	public void setExperienciaLaboralFechaCrea(Date experienciaLaboralFechaCrea) {
		this.experienciaLaboralFechaCrea = experienciaLaboralFechaCrea;
	}

	public Date getExperienciaLaboralFechaDesde() {
		return this.experienciaLaboralFechaDesde;
	}

	public void setExperienciaLaboralFechaDesde(Date experienciaLaboralFechaDesde) {
		this.experienciaLaboralFechaDesde = experienciaLaboralFechaDesde;
	}

	public Date getExperienciaLaboralFechaModifica() {
		return this.experienciaLaboralFechaModifica;
	}

	public void setExperienciaLaboralFechaModifica(Date experienciaLaboralFechaModifica) {
		this.experienciaLaboralFechaModifica = experienciaLaboralFechaModifica;
	}

	public String getExperienciaLaboralTelefono() {
		return this.experienciaLaboralTelefono;
	}

	public void setExperienciaLaboralTelefono(String experienciaLaboralTelefono) {
		this.experienciaLaboralTelefono = experienciaLaboralTelefono;
	}

	public int getExperienciaLaboralUsuarioCrea() {
		return this.experienciaLaboralUsuarioCrea;
	}

	public void setExperienciaLaboralUsuarioCrea(int experienciaLaboralUsuarioCrea) {
		this.experienciaLaboralUsuarioCrea = experienciaLaboralUsuarioCrea;
	}

	public int getExperienciaLaboralUsuarioModifica() {
		return this.experienciaLaboralUsuarioModifica;
	}

	public void setExperienciaLaboralUsuarioModifica(int experienciaLaboralUsuarioModifica) {
		this.experienciaLaboralUsuarioModifica = experienciaLaboralUsuarioModifica;
	}

	public PersonalPersona getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersona personalPersona) {
		this.personalPersona = personalPersona;
	}

}