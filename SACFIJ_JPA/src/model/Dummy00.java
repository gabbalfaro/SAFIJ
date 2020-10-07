package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DUMMY00 database table.
 * 
 */
@Entity
@Table(name="DUMMY00")
@NamedQuery(name="Dummy00.findAll", query="SELECT d FROM Dummy00 d")
public class Dummy00 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="task_id")
	private int taskId;

	@Lob
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="due_date")
	private Date dueDate;

	private byte priority;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private byte status;

	private String title;

	public Dummy00() {
	}

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public byte getPriority() {
		return this.priority;
	}

	public void setPriority(byte priority) {
		this.priority = priority;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}