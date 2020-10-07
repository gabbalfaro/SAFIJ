package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the inventario database table.
 * 
 */
@Entity
@Table(name="inventario")
@NamedQuery(name="Inventario.findAll", query="SELECT i FROM Inventario i")
public class Inventario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="inventario_id")
	private int inventarioId;

	@Column(name="bienes_id")
	private int bienesId;

	@Column(name="inventario_estado")
	private int inventarioEstado;

	@Column(name="inventario_estado_inventario")
	private int inventarioEstadoInventario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="inventario_fecha_crea")
	private Date inventarioFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="inventario_fecha_modi")
	private Date inventarioFechaModi;

	@Column(name="inventario_id_usuario_crea")
	private String inventarioIdUsuarioCrea;

	@Column(name="inventario_id_usuario_modi")
	private String inventarioIdUsuarioModi;

	//bi-directional many-to-one association to Depreciacion
	@OneToMany(mappedBy="inventario")
	private List<Depreciacion> depreciacions;

	//bi-directional many-to-one association to CatalogoAgencia
	@ManyToOne
	@JoinColumn(name="inventario_agencia_id")
	private CatalogoAgencia catalogoAgencia;

	//bi-directional many-to-one association to Mantenimiento
	@OneToMany(mappedBy="inventario")
	private List<Mantenimiento> mantenimientos;

	public Inventario() {
	}

	public int getInventarioId() {
		return this.inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public int getBienesId() {
		return this.bienesId;
	}

	public void setBienesId(int bienesId) {
		this.bienesId = bienesId;
	}

	public int getInventarioEstado() {
		return this.inventarioEstado;
	}

	public void setInventarioEstado(int inventarioEstado) {
		this.inventarioEstado = inventarioEstado;
	}

	public int getInventarioEstadoInventario() {
		return this.inventarioEstadoInventario;
	}

	public void setInventarioEstadoInventario(int inventarioEstadoInventario) {
		this.inventarioEstadoInventario = inventarioEstadoInventario;
	}

	public Date getInventarioFechaCrea() {
		return this.inventarioFechaCrea;
	}

	public void setInventarioFechaCrea(Date inventarioFechaCrea) {
		this.inventarioFechaCrea = inventarioFechaCrea;
	}

	public Date getInventarioFechaModi() {
		return this.inventarioFechaModi;
	}

	public void setInventarioFechaModi(Date inventarioFechaModi) {
		this.inventarioFechaModi = inventarioFechaModi;
	}

	public String getInventarioIdUsuarioCrea() {
		return this.inventarioIdUsuarioCrea;
	}

	public void setInventarioIdUsuarioCrea(String inventarioIdUsuarioCrea) {
		this.inventarioIdUsuarioCrea = inventarioIdUsuarioCrea;
	}

	public String getInventarioIdUsuarioModi() {
		return this.inventarioIdUsuarioModi;
	}

	public void setInventarioIdUsuarioModi(String inventarioIdUsuarioModi) {
		this.inventarioIdUsuarioModi = inventarioIdUsuarioModi;
	}

	public List<Depreciacion> getDepreciacions() {
		return this.depreciacions;
	}

	public void setDepreciacions(List<Depreciacion> depreciacions) {
		this.depreciacions = depreciacions;
	}

	public Depreciacion addDepreciacion(Depreciacion depreciacion) {
		getDepreciacions().add(depreciacion);
		depreciacion.setInventario(this);

		return depreciacion;
	}

	public Depreciacion removeDepreciacion(Depreciacion depreciacion) {
		getDepreciacions().remove(depreciacion);
		depreciacion.setInventario(null);

		return depreciacion;
	}

	public CatalogoAgencia getCatalogoAgencia() {
		return this.catalogoAgencia;
	}

	public void setCatalogoAgencia(CatalogoAgencia catalogoAgencia) {
		this.catalogoAgencia = catalogoAgencia;
	}

	public List<Mantenimiento> getMantenimientos() {
		return this.mantenimientos;
	}

	public void setMantenimientos(List<Mantenimiento> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	public Mantenimiento addMantenimiento(Mantenimiento mantenimiento) {
		getMantenimientos().add(mantenimiento);
		mantenimiento.setInventario(this);

		return mantenimiento;
	}

	public Mantenimiento removeMantenimiento(Mantenimiento mantenimiento) {
		getMantenimientos().remove(mantenimiento);
		mantenimiento.setInventario(null);

		return mantenimiento;
	}

}