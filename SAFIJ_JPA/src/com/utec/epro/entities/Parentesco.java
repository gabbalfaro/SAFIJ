package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the parentesco database table.
 * 
 */
@Entity
@Table(name="parentesco")
@NamedQueries({
	@NamedQuery(name="Parentesco.findAll", query="SELECT p FROM Parentesco p"),
	@NamedQuery(name="Parentesco.findByParentescoId", query="SELECT p FROM Parentesco p where p.parentescoId = :parentescoId")
})
public class Parentesco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="parentesco_id", unique=true, nullable=false)
	private int parentescoId;

	@Column(name="parentesco_estado", nullable=false)
	private int parentescoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="parentesco_fecha_crea")
	private Date parentescoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="parentesco_fecha_modifica")
	private Date parentescoFechaModifica;

	@Column(name="parentesco_nombre", length=100)
	private String parentescoNombre;

	@Column(name="parentesco_usuario_crea")
	private int parentescoUsuarioCrea;

	@Column(name="parentesco_usuario_modifica")
	private int parentescoUsuarioModifica;

	//bi-directional many-to-one association to PersonalContactos
	@OneToMany(mappedBy="parentesco")
	private List<PersonalContactos> personalContactos;

	public Parentesco() {
	}

	public int getParentescoId() {
		return this.parentescoId;
	}

	public void setParentescoId(int parentescoId) {
		this.parentescoId = parentescoId;
	}

	public int getParentescoEstado() {
		return this.parentescoEstado;
	}

	public void setParentescoEstado(int parentescoEstado) {
		this.parentescoEstado = parentescoEstado;
	}

	public Date getParentescoFechaCrea() {
		return this.parentescoFechaCrea;
	}

	public void setParentescoFechaCrea(Date parentescoFechaCrea) {
		this.parentescoFechaCrea = parentescoFechaCrea;
	}

	public Date getParentescoFechaModifica() {
		return this.parentescoFechaModifica;
	}

	public void setParentescoFechaModifica(Date parentescoFechaModifica) {
		this.parentescoFechaModifica = parentescoFechaModifica;
	}

	public String getParentescoNombre() {
		return this.parentescoNombre;
	}

	public void setParentescoNombre(String parentescoNombre) {
		this.parentescoNombre = parentescoNombre;
	}

	public int getParentescoUsuarioCrea() {
		return this.parentescoUsuarioCrea;
	}

	public void setParentescoUsuarioCrea(int parentescoUsuarioCrea) {
		this.parentescoUsuarioCrea = parentescoUsuarioCrea;
	}

	public int getParentescoUsuarioModifica() {
		return this.parentescoUsuarioModifica;
	}

	public void setParentescoUsuarioModifica(int parentescoUsuarioModifica) {
		this.parentescoUsuarioModifica = parentescoUsuarioModifica;
	}

	public List<PersonalContactos> getPersonalContactos() {
		return this.personalContactos;
	}

	public void setPersonalContactos(List<PersonalContactos> personalContactos) {
		this.personalContactos = personalContactos;
	}

	public PersonalContactos addPersonalContacto(PersonalContactos personalContacto) {
		getPersonalContactos().add(personalContacto);
		personalContacto.setParentesco(this);

		return personalContacto;
	}

	public PersonalContactos removePersonalContacto(PersonalContactos personalContacto) {
		getPersonalContactos().remove(personalContacto);
		personalContacto.setParentesco(null);

		return personalContacto;
	}

}