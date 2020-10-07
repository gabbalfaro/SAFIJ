package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the depreciacion database table.
 * 
 */
@Entity
@Table(name="depreciacion")
@NamedQuery(name="Depreciacion.findAll", query="SELECT d FROM Depreciacion d")
public class Depreciacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="depreciacion_id")
	private int depreciacionId;

	@Column(name="depreciacion_control")
	private int depreciacionControl;

	@Column(name="depreciacion_correlativo")
	private int depreciacionCorrelativo;

	@Column(name="depreciacion_estado")
	private int depreciacionEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="depreciacion_fecha_crea")
	private Date depreciacionFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="depreciacion_fecha_fin")
	private Date depreciacionFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="depreciacion_fecha_inicio")
	private Date depreciacionFechaInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="depreciacion_fecha_modi")
	private Date depreciacionFechaModi;

	@Column(name="depreciacion_id_usuario_crea")
	private String depreciacionIdUsuarioCrea;

	@Column(name="depreciacion_id_usuario_modi")
	private String depreciacionIdUsuarioModi;

	@Column(name="depreciacion_monto_depreciado")
	private int depreciacionMontoDepreciado;

	@Column(name="depreciacion_monto_inicial")
	private int depreciacionMontoInicial;

	@Column(name="depreciacion_monto_restante")
	private int depreciacionMontoRestante;

	//bi-directional many-to-one association to CatalogoTipoActivo
	@ManyToOne
	@JoinColumn(name="tipo_activo_id")
	private CatalogoTipoActivo catalogoTipoActivo;

	//bi-directional many-to-one association to Inventario
	@ManyToOne
	@JoinColumn(name="inventario_id")
	private Inventario inventario;

	//bi-directional many-to-one association to Periodo
	@ManyToOne
	@JoinColumn(name="periodos_id")
	private Periodo periodo;

	public Depreciacion() {
	}

	public int getDepreciacionId() {
		return this.depreciacionId;
	}

	public void setDepreciacionId(int depreciacionId) {
		this.depreciacionId = depreciacionId;
	}

	public int getDepreciacionControl() {
		return this.depreciacionControl;
	}

	public void setDepreciacionControl(int depreciacionControl) {
		this.depreciacionControl = depreciacionControl;
	}

	public int getDepreciacionCorrelativo() {
		return this.depreciacionCorrelativo;
	}

	public void setDepreciacionCorrelativo(int depreciacionCorrelativo) {
		this.depreciacionCorrelativo = depreciacionCorrelativo;
	}

	public int getDepreciacionEstado() {
		return this.depreciacionEstado;
	}

	public void setDepreciacionEstado(int depreciacionEstado) {
		this.depreciacionEstado = depreciacionEstado;
	}

	public Date getDepreciacionFechaCrea() {
		return this.depreciacionFechaCrea;
	}

	public void setDepreciacionFechaCrea(Date depreciacionFechaCrea) {
		this.depreciacionFechaCrea = depreciacionFechaCrea;
	}

	public Date getDepreciacionFechaFin() {
		return this.depreciacionFechaFin;
	}

	public void setDepreciacionFechaFin(Date depreciacionFechaFin) {
		this.depreciacionFechaFin = depreciacionFechaFin;
	}

	public Date getDepreciacionFechaInicio() {
		return this.depreciacionFechaInicio;
	}

	public void setDepreciacionFechaInicio(Date depreciacionFechaInicio) {
		this.depreciacionFechaInicio = depreciacionFechaInicio;
	}

	public Date getDepreciacionFechaModi() {
		return this.depreciacionFechaModi;
	}

	public void setDepreciacionFechaModi(Date depreciacionFechaModi) {
		this.depreciacionFechaModi = depreciacionFechaModi;
	}

	public String getDepreciacionIdUsuarioCrea() {
		return this.depreciacionIdUsuarioCrea;
	}

	public void setDepreciacionIdUsuarioCrea(String depreciacionIdUsuarioCrea) {
		this.depreciacionIdUsuarioCrea = depreciacionIdUsuarioCrea;
	}

	public String getDepreciacionIdUsuarioModi() {
		return this.depreciacionIdUsuarioModi;
	}

	public void setDepreciacionIdUsuarioModi(String depreciacionIdUsuarioModi) {
		this.depreciacionIdUsuarioModi = depreciacionIdUsuarioModi;
	}

	public int getDepreciacionMontoDepreciado() {
		return this.depreciacionMontoDepreciado;
	}

	public void setDepreciacionMontoDepreciado(int depreciacionMontoDepreciado) {
		this.depreciacionMontoDepreciado = depreciacionMontoDepreciado;
	}

	public int getDepreciacionMontoInicial() {
		return this.depreciacionMontoInicial;
	}

	public void setDepreciacionMontoInicial(int depreciacionMontoInicial) {
		this.depreciacionMontoInicial = depreciacionMontoInicial;
	}

	public int getDepreciacionMontoRestante() {
		return this.depreciacionMontoRestante;
	}

	public void setDepreciacionMontoRestante(int depreciacionMontoRestante) {
		this.depreciacionMontoRestante = depreciacionMontoRestante;
	}

	public CatalogoTipoActivo getCatalogoTipoActivo() {
		return this.catalogoTipoActivo;
	}

	public void setCatalogoTipoActivo(CatalogoTipoActivo catalogoTipoActivo) {
		this.catalogoTipoActivo = catalogoTipoActivo;
	}

	public Inventario getInventario() {
		return this.inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public Periodo getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

}