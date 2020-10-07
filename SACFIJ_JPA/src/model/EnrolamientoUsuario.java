package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the enrolamiento_usuarios database table.
 * 
 */
@Entity
@Table(name="enrolamiento_usuarios")
@NamedQuery(name="EnrolamientoUsuario.findAll", query="SELECT e FROM EnrolamientoUsuario e")
public class EnrolamientoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="usuario_id")
	private int usuarioId;

	@Column(name="usuarios_descripcion")
	private String usuariosDescripcion;

	@Column(name="usuarios_estado")
	private int usuariosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="usuarios_fecha_crea")
	private Date usuariosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="usuarios_fecha_modi")
	private Date usuariosFechaModi;

	@Column(name="usuarios_id_usuario_crea")
	private String usuariosIdUsuarioCrea;

	@Column(name="usuarios_id_usuario_modi")
	private String usuariosIdUsuarioModi;

	@Column(name="usuarios_tipo")
	private int usuariosTipo;

	//bi-directional many-to-one association to EnrolamientoAcceso
	@ManyToOne
	@JoinColumn(name="accesos_id")
	private EnrolamientoAcceso enrolamientoAcceso;

	//bi-directional many-to-one association to EnrolamientoRole
	@ManyToOne
	@JoinColumn(name="roles_id")
	private EnrolamientoRole enrolamientoRole;

	//bi-directional many-to-one association to PersonalPersona
	@ManyToOne
	@JoinColumn(name="persona_id")
	private PersonalPersona personalPersona;

	public EnrolamientoUsuario() {
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuariosDescripcion() {
		return this.usuariosDescripcion;
	}

	public void setUsuariosDescripcion(String usuariosDescripcion) {
		this.usuariosDescripcion = usuariosDescripcion;
	}

	public int getUsuariosEstado() {
		return this.usuariosEstado;
	}

	public void setUsuariosEstado(int usuariosEstado) {
		this.usuariosEstado = usuariosEstado;
	}

	public Date getUsuariosFechaCrea() {
		return this.usuariosFechaCrea;
	}

	public void setUsuariosFechaCrea(Date usuariosFechaCrea) {
		this.usuariosFechaCrea = usuariosFechaCrea;
	}

	public Date getUsuariosFechaModi() {
		return this.usuariosFechaModi;
	}

	public void setUsuariosFechaModi(Date usuariosFechaModi) {
		this.usuariosFechaModi = usuariosFechaModi;
	}

	public String getUsuariosIdUsuarioCrea() {
		return this.usuariosIdUsuarioCrea;
	}

	public void setUsuariosIdUsuarioCrea(String usuariosIdUsuarioCrea) {
		this.usuariosIdUsuarioCrea = usuariosIdUsuarioCrea;
	}

	public String getUsuariosIdUsuarioModi() {
		return this.usuariosIdUsuarioModi;
	}

	public void setUsuariosIdUsuarioModi(String usuariosIdUsuarioModi) {
		this.usuariosIdUsuarioModi = usuariosIdUsuarioModi;
	}

	public int getUsuariosTipo() {
		return this.usuariosTipo;
	}

	public void setUsuariosTipo(int usuariosTipo) {
		this.usuariosTipo = usuariosTipo;
	}

	public EnrolamientoAcceso getEnrolamientoAcceso() {
		return this.enrolamientoAcceso;
	}

	public void setEnrolamientoAcceso(EnrolamientoAcceso enrolamientoAcceso) {
		this.enrolamientoAcceso = enrolamientoAcceso;
	}

	public EnrolamientoRole getEnrolamientoRole() {
		return this.enrolamientoRole;
	}

	public void setEnrolamientoRole(EnrolamientoRole enrolamientoRole) {
		this.enrolamientoRole = enrolamientoRole;
	}

	public PersonalPersona getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersona personalPersona) {
		this.personalPersona = personalPersona;
	}

}