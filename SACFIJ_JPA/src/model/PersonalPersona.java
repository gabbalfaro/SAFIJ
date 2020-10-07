package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personal_persona database table.
 * 
 */
@Entity
@Table(name="personal_persona")
@NamedQuery(name="PersonalPersona.findAll", query="SELECT p FROM PersonalPersona p")
public class PersonalPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="persona_id")
	private int personaId;

	@Column(name="persona_apellido1")
	private String personaApellido1;

	@Column(name="persona_apellido2")
	private String personaApellido2;

	@Column(name="persona_apellido3")
	private String personaApellido3;

	@Column(name="persona_direccion")
	private String personaDireccion;

	@Column(name="persona_dui")
	private String personaDui;

	@Column(name="persona_estado")
	private int personaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="persona_fecha_crea")
	private Date personaFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="persona_fecha_modifica")
	private Date personaFechaModifica;

	@Temporal(TemporalType.DATE)
	@Column(name="persona_fecha_nac")
	private Date personaFechaNac;

	@Column(name="persona_nit")
	private String personaNit;

	@Column(name="persona_nombre1")
	private String personaNombre1;

	@Column(name="persona_nombre2")
	private String personaNombre2;

	@Column(name="persona_observaciones")
	private String personaObservaciones;

	@Column(name="persona_telefono_fijo")
	private String personaTelefonoFijo;

	@Column(name="persona_telefono_movil")
	private String personaTelefonoMovil;

	@Column(name="persona_tipo")
	private int personaTipo;

	@Column(name="persona_usuario_crea")
	private int personaUsuarioCrea;

	@Column(name="persona_usuario_modifica")
	private int personaUsuarioModifica;

	//bi-directional many-to-one association to EnrolamientoUsuario
	@OneToMany(mappedBy="personalPersona")
	private List<EnrolamientoUsuario> enrolamientoUsuarios;

	//bi-directional many-to-one association to PersonalContacto
	@OneToMany(mappedBy="personalPersona")
	private List<PersonalContacto> personalContactos;

	//bi-directional many-to-one association to PersonalExperienciaLaboral
	@OneToMany(mappedBy="personalPersona")
	private List<PersonalExperienciaLaboral> personalExperienciaLaborals;

	//bi-directional many-to-one association to PersonalHabilidade
	@OneToMany(mappedBy="personalPersona")
	private List<PersonalHabilidade> personalHabilidades;

	//bi-directional many-to-one association to Civil
	@ManyToOne
	@JoinColumn(name="persona_estado_civil_id")
	private Civil civil;

	//bi-directional many-to-one association to Genero
	@ManyToOne
	@JoinColumn(name="persona_genero_id")
	private Genero genero;

	//bi-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="persona_municipio_id")
	private Municipio municipio;

	//bi-directional many-to-one association to PersonalProfesion
	@ManyToOne
	@JoinColumn(name="persona_profesion_id")
	private PersonalProfesion personalProfesion;

	public PersonalPersona() {
	}

	public int getPersonaId() {
		return this.personaId;
	}

	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}

	public String getPersonaApellido1() {
		return this.personaApellido1;
	}

	public void setPersonaApellido1(String personaApellido1) {
		this.personaApellido1 = personaApellido1;
	}

	public String getPersonaApellido2() {
		return this.personaApellido2;
	}

	public void setPersonaApellido2(String personaApellido2) {
		this.personaApellido2 = personaApellido2;
	}

	public String getPersonaApellido3() {
		return this.personaApellido3;
	}

	public void setPersonaApellido3(String personaApellido3) {
		this.personaApellido3 = personaApellido3;
	}

	public String getPersonaDireccion() {
		return this.personaDireccion;
	}

	public void setPersonaDireccion(String personaDireccion) {
		this.personaDireccion = personaDireccion;
	}

	public String getPersonaDui() {
		return this.personaDui;
	}

	public void setPersonaDui(String personaDui) {
		this.personaDui = personaDui;
	}

	public int getPersonaEstado() {
		return this.personaEstado;
	}

	public void setPersonaEstado(int personaEstado) {
		this.personaEstado = personaEstado;
	}

	public Date getPersonaFechaCrea() {
		return this.personaFechaCrea;
	}

	public void setPersonaFechaCrea(Date personaFechaCrea) {
		this.personaFechaCrea = personaFechaCrea;
	}

	public Date getPersonaFechaModifica() {
		return this.personaFechaModifica;
	}

	public void setPersonaFechaModifica(Date personaFechaModifica) {
		this.personaFechaModifica = personaFechaModifica;
	}

	public Date getPersonaFechaNac() {
		return this.personaFechaNac;
	}

	public void setPersonaFechaNac(Date personaFechaNac) {
		this.personaFechaNac = personaFechaNac;
	}

	public String getPersonaNit() {
		return this.personaNit;
	}

	public void setPersonaNit(String personaNit) {
		this.personaNit = personaNit;
	}

	public String getPersonaNombre1() {
		return this.personaNombre1;
	}

	public void setPersonaNombre1(String personaNombre1) {
		this.personaNombre1 = personaNombre1;
	}

	public String getPersonaNombre2() {
		return this.personaNombre2;
	}

	public void setPersonaNombre2(String personaNombre2) {
		this.personaNombre2 = personaNombre2;
	}

	public String getPersonaObservaciones() {
		return this.personaObservaciones;
	}

	public void setPersonaObservaciones(String personaObservaciones) {
		this.personaObservaciones = personaObservaciones;
	}

	public String getPersonaTelefonoFijo() {
		return this.personaTelefonoFijo;
	}

	public void setPersonaTelefonoFijo(String personaTelefonoFijo) {
		this.personaTelefonoFijo = personaTelefonoFijo;
	}

	public String getPersonaTelefonoMovil() {
		return this.personaTelefonoMovil;
	}

	public void setPersonaTelefonoMovil(String personaTelefonoMovil) {
		this.personaTelefonoMovil = personaTelefonoMovil;
	}

	public int getPersonaTipo() {
		return this.personaTipo;
	}

	public void setPersonaTipo(int personaTipo) {
		this.personaTipo = personaTipo;
	}

	public int getPersonaUsuarioCrea() {
		return this.personaUsuarioCrea;
	}

	public void setPersonaUsuarioCrea(int personaUsuarioCrea) {
		this.personaUsuarioCrea = personaUsuarioCrea;
	}

	public int getPersonaUsuarioModifica() {
		return this.personaUsuarioModifica;
	}

	public void setPersonaUsuarioModifica(int personaUsuarioModifica) {
		this.personaUsuarioModifica = personaUsuarioModifica;
	}

	public List<EnrolamientoUsuario> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuario> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuario addEnrolamientoUsuario(EnrolamientoUsuario enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setPersonalPersona(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuario removeEnrolamientoUsuario(EnrolamientoUsuario enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setPersonalPersona(null);

		return enrolamientoUsuario;
	}

	public List<PersonalContacto> getPersonalContactos() {
		return this.personalContactos;
	}

	public void setPersonalContactos(List<PersonalContacto> personalContactos) {
		this.personalContactos = personalContactos;
	}

	public PersonalContacto addPersonalContacto(PersonalContacto personalContacto) {
		getPersonalContactos().add(personalContacto);
		personalContacto.setPersonalPersona(this);

		return personalContacto;
	}

	public PersonalContacto removePersonalContacto(PersonalContacto personalContacto) {
		getPersonalContactos().remove(personalContacto);
		personalContacto.setPersonalPersona(null);

		return personalContacto;
	}

	public List<PersonalExperienciaLaboral> getPersonalExperienciaLaborals() {
		return this.personalExperienciaLaborals;
	}

	public void setPersonalExperienciaLaborals(List<PersonalExperienciaLaboral> personalExperienciaLaborals) {
		this.personalExperienciaLaborals = personalExperienciaLaborals;
	}

	public PersonalExperienciaLaboral addPersonalExperienciaLaboral(PersonalExperienciaLaboral personalExperienciaLaboral) {
		getPersonalExperienciaLaborals().add(personalExperienciaLaboral);
		personalExperienciaLaboral.setPersonalPersona(this);

		return personalExperienciaLaboral;
	}

	public PersonalExperienciaLaboral removePersonalExperienciaLaboral(PersonalExperienciaLaboral personalExperienciaLaboral) {
		getPersonalExperienciaLaborals().remove(personalExperienciaLaboral);
		personalExperienciaLaboral.setPersonalPersona(null);

		return personalExperienciaLaboral;
	}

	public List<PersonalHabilidade> getPersonalHabilidades() {
		return this.personalHabilidades;
	}

	public void setPersonalHabilidades(List<PersonalHabilidade> personalHabilidades) {
		this.personalHabilidades = personalHabilidades;
	}

	public PersonalHabilidade addPersonalHabilidade(PersonalHabilidade personalHabilidade) {
		getPersonalHabilidades().add(personalHabilidade);
		personalHabilidade.setPersonalPersona(this);

		return personalHabilidade;
	}

	public PersonalHabilidade removePersonalHabilidade(PersonalHabilidade personalHabilidade) {
		getPersonalHabilidades().remove(personalHabilidade);
		personalHabilidade.setPersonalPersona(null);

		return personalHabilidade;
	}

	public Civil getCivil() {
		return this.civil;
	}

	public void setCivil(Civil civil) {
		this.civil = civil;
	}

	public Genero getGenero() {
		return this.genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public PersonalProfesion getPersonalProfesion() {
		return this.personalProfesion;
	}

	public void setPersonalProfesion(PersonalProfesion personalProfesion) {
		this.personalProfesion = personalProfesion;
	}

}