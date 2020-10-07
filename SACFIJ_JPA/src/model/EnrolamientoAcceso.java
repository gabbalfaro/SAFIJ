package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the enrolamiento_accesos database table.
 * 
 */
@Entity
@Table(name="enrolamiento_accesos")
@NamedQuery(name="EnrolamientoAcceso.findAll", query="SELECT e FROM EnrolamientoAcceso e")
public class EnrolamientoAcceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="accesos_id")
	private int accesosId;

	@Column(name="accesos_descripcion")
	private int accesosDescripcion;

	@Column(name="accesos_estado")
	private int accesosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="accesos_fecha_crea")
	private Date accesosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="accesos_fecha_modi")
	private Date accesosFechaModi;

	@Column(name="accesos_id_usuario_crea")
	private String accesosIdUsuarioCrea;

	@Column(name="accesos_id_usuario_modi")
	private String accesosIdUsuarioModi;

	@Column(name="accesos_nivel0")
	private int accesosNivel0;

	@Column(name="accesos_nivel1")
	private int accesosNivel1;

	@Column(name="accesos_nivel2")
	private int accesosNivel2;

	@Column(name="accesos_nivel3")
	private int accesosNivel3;

	@Column(name="accesos_nivel4")
	private int accesosNivel4;

	@Column(name="accesos_nombre")
	private int accesosNombre;

	//bi-directional many-to-one association to EnrolamientoRole
	@OneToMany(mappedBy="enrolamientoAcceso")
	private List<EnrolamientoRole> enrolamientoRoles;

	//bi-directional many-to-one association to EnrolamientoUsuario
	@OneToMany(mappedBy="enrolamientoAcceso")
	private List<EnrolamientoUsuario> enrolamientoUsuarios;

	public EnrolamientoAcceso() {
	}

	public int getAccesosId() {
		return this.accesosId;
	}

	public void setAccesosId(int accesosId) {
		this.accesosId = accesosId;
	}

	public int getAccesosDescripcion() {
		return this.accesosDescripcion;
	}

	public void setAccesosDescripcion(int accesosDescripcion) {
		this.accesosDescripcion = accesosDescripcion;
	}

	public int getAccesosEstado() {
		return this.accesosEstado;
	}

	public void setAccesosEstado(int accesosEstado) {
		this.accesosEstado = accesosEstado;
	}

	public Date getAccesosFechaCrea() {
		return this.accesosFechaCrea;
	}

	public void setAccesosFechaCrea(Date accesosFechaCrea) {
		this.accesosFechaCrea = accesosFechaCrea;
	}

	public Date getAccesosFechaModi() {
		return this.accesosFechaModi;
	}

	public void setAccesosFechaModi(Date accesosFechaModi) {
		this.accesosFechaModi = accesosFechaModi;
	}

	public String getAccesosIdUsuarioCrea() {
		return this.accesosIdUsuarioCrea;
	}

	public void setAccesosIdUsuarioCrea(String accesosIdUsuarioCrea) {
		this.accesosIdUsuarioCrea = accesosIdUsuarioCrea;
	}

	public String getAccesosIdUsuarioModi() {
		return this.accesosIdUsuarioModi;
	}

	public void setAccesosIdUsuarioModi(String accesosIdUsuarioModi) {
		this.accesosIdUsuarioModi = accesosIdUsuarioModi;
	}

	public int getAccesosNivel0() {
		return this.accesosNivel0;
	}

	public void setAccesosNivel0(int accesosNivel0) {
		this.accesosNivel0 = accesosNivel0;
	}

	public int getAccesosNivel1() {
		return this.accesosNivel1;
	}

	public void setAccesosNivel1(int accesosNivel1) {
		this.accesosNivel1 = accesosNivel1;
	}

	public int getAccesosNivel2() {
		return this.accesosNivel2;
	}

	public void setAccesosNivel2(int accesosNivel2) {
		this.accesosNivel2 = accesosNivel2;
	}

	public int getAccesosNivel3() {
		return this.accesosNivel3;
	}

	public void setAccesosNivel3(int accesosNivel3) {
		this.accesosNivel3 = accesosNivel3;
	}

	public int getAccesosNivel4() {
		return this.accesosNivel4;
	}

	public void setAccesosNivel4(int accesosNivel4) {
		this.accesosNivel4 = accesosNivel4;
	}

	public int getAccesosNombre() {
		return this.accesosNombre;
	}

	public void setAccesosNombre(int accesosNombre) {
		this.accesosNombre = accesosNombre;
	}

	public List<EnrolamientoRole> getEnrolamientoRoles() {
		return this.enrolamientoRoles;
	}

	public void setEnrolamientoRoles(List<EnrolamientoRole> enrolamientoRoles) {
		this.enrolamientoRoles = enrolamientoRoles;
	}

	public EnrolamientoRole addEnrolamientoRole(EnrolamientoRole enrolamientoRole) {
		getEnrolamientoRoles().add(enrolamientoRole);
		enrolamientoRole.setEnrolamientoAcceso(this);

		return enrolamientoRole;
	}

	public EnrolamientoRole removeEnrolamientoRole(EnrolamientoRole enrolamientoRole) {
		getEnrolamientoRoles().remove(enrolamientoRole);
		enrolamientoRole.setEnrolamientoAcceso(null);

		return enrolamientoRole;
	}

	public List<EnrolamientoUsuario> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuario> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuario addEnrolamientoUsuario(EnrolamientoUsuario enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoAcceso(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuario removeEnrolamientoUsuario(EnrolamientoUsuario enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoAcceso(null);

		return enrolamientoUsuario;
	}

}