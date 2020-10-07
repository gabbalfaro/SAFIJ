package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the departamento database table.
 * 
 */
@Entity
@Table(name="departamento")
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="departamento_id")
	private int departamentoId;

	@Column(name="departamento_estado")
	private int departamentoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="departamento_fecha_crea")
	private Date departamentoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="departamento_fecha_modifica")
	private Date departamentoFechaModifica;

	@Column(name="departamento_nombre")
	private String departamentoNombre;

	@Column(name="departamento_usuario_crea")
	private int departamentoUsuarioCrea;

	@Column(name="departamento_usuario_modifica")
	private int departamentoUsuarioModifica;

	//bi-directional many-to-one association to CatalogoAgencia
	@OneToMany(mappedBy="departamento")
	private List<CatalogoAgencia> catalogoAgencias;

	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="departamento_pais_id")
	private Pai pai;

	//bi-directional many-to-one association to Municipio
	@OneToMany(mappedBy="departamento")
	private List<Municipio> municipios;

	public Departamento() {
	}

	public int getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	public int getDepartamentoEstado() {
		return this.departamentoEstado;
	}

	public void setDepartamentoEstado(int departamentoEstado) {
		this.departamentoEstado = departamentoEstado;
	}

	public Date getDepartamentoFechaCrea() {
		return this.departamentoFechaCrea;
	}

	public void setDepartamentoFechaCrea(Date departamentoFechaCrea) {
		this.departamentoFechaCrea = departamentoFechaCrea;
	}

	public Date getDepartamentoFechaModifica() {
		return this.departamentoFechaModifica;
	}

	public void setDepartamentoFechaModifica(Date departamentoFechaModifica) {
		this.departamentoFechaModifica = departamentoFechaModifica;
	}

	public String getDepartamentoNombre() {
		return this.departamentoNombre;
	}

	public void setDepartamentoNombre(String departamentoNombre) {
		this.departamentoNombre = departamentoNombre;
	}

	public int getDepartamentoUsuarioCrea() {
		return this.departamentoUsuarioCrea;
	}

	public void setDepartamentoUsuarioCrea(int departamentoUsuarioCrea) {
		this.departamentoUsuarioCrea = departamentoUsuarioCrea;
	}

	public int getDepartamentoUsuarioModifica() {
		return this.departamentoUsuarioModifica;
	}

	public void setDepartamentoUsuarioModifica(int departamentoUsuarioModifica) {
		this.departamentoUsuarioModifica = departamentoUsuarioModifica;
	}

	public List<CatalogoAgencia> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgencia> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgencia addCatalogoAgencia(CatalogoAgencia catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setDepartamento(this);

		return catalogoAgencia;
	}

	public CatalogoAgencia removeCatalogoAgencia(CatalogoAgencia catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setDepartamento(null);

		return catalogoAgencia;
	}

	public Pai getPai() {
		return this.pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public List<Municipio> getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public Municipio addMunicipio(Municipio municipio) {
		getMunicipios().add(municipio);
		municipio.setDepartamento(this);

		return municipio;
	}

	public Municipio removeMunicipio(Municipio municipio) {
		getMunicipios().remove(municipio);
		municipio.setDepartamento(null);

		return municipio;
	}

}