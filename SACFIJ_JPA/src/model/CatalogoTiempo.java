package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the catalogo_tiempo database table.
 * 
 */
@Entity
@Table(name="catalogo_tiempo")
@NamedQuery(name="CatalogoTiempo.findAll", query="SELECT c FROM CatalogoTiempo c")
public class CatalogoTiempo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tiempo_id")
	private int tiempoId;

	@Column(name="tiempo_descripcion")
	private String tiempoDescripcion;

	@Column(name="tiempo_estado")
	private int tiempoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tiempo_fecha_crea")
	private Date tiempoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tiempo_fecha_modi")
	private Date tiempoFechaModi;

	@Column(name="tiempo_id_usuario_crea")
	private String tiempoIdUsuarioCrea;

	@Column(name="tiempo_id_usuario_modi")
	private String tiempoIdUsuarioModi;

	@Column(name="tiempo_magnitud")
	private String tiempoMagnitud;

	@Column(name="tiempo_nombre")
	private String tiempoNombre;

	public CatalogoTiempo() {
	}

	public int getTiempoId() {
		return this.tiempoId;
	}

	public void setTiempoId(int tiempoId) {
		this.tiempoId = tiempoId;
	}

	public String getTiempoDescripcion() {
		return this.tiempoDescripcion;
	}

	public void setTiempoDescripcion(String tiempoDescripcion) {
		this.tiempoDescripcion = tiempoDescripcion;
	}

	public int getTiempoEstado() {
		return this.tiempoEstado;
	}

	public void setTiempoEstado(int tiempoEstado) {
		this.tiempoEstado = tiempoEstado;
	}

	public Date getTiempoFechaCrea() {
		return this.tiempoFechaCrea;
	}

	public void setTiempoFechaCrea(Date tiempoFechaCrea) {
		this.tiempoFechaCrea = tiempoFechaCrea;
	}

	public Date getTiempoFechaModi() {
		return this.tiempoFechaModi;
	}

	public void setTiempoFechaModi(Date tiempoFechaModi) {
		this.tiempoFechaModi = tiempoFechaModi;
	}

	public String getTiempoIdUsuarioCrea() {
		return this.tiempoIdUsuarioCrea;
	}

	public void setTiempoIdUsuarioCrea(String tiempoIdUsuarioCrea) {
		this.tiempoIdUsuarioCrea = tiempoIdUsuarioCrea;
	}

	public String getTiempoIdUsuarioModi() {
		return this.tiempoIdUsuarioModi;
	}

	public void setTiempoIdUsuarioModi(String tiempoIdUsuarioModi) {
		this.tiempoIdUsuarioModi = tiempoIdUsuarioModi;
	}

	public String getTiempoMagnitud() {
		return this.tiempoMagnitud;
	}

	public void setTiempoMagnitud(String tiempoMagnitud) {
		this.tiempoMagnitud = tiempoMagnitud;
	}

	public String getTiempoNombre() {
		return this.tiempoNombre;
	}

	public void setTiempoNombre(String tiempoNombre) {
		this.tiempoNombre = tiempoNombre;
	}

}