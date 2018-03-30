/**
 * 
 */
package com.bridgelab.todo.notes.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bridgelab.todo.user.model.User;

/**
 * @author bridgeit
 *
 */

@Entity
@Table(name="notes")
public class Notes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1802508173596798656L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long noteId;
	
	@Column
	private String title;	
	
	@Column
	private String description;
	
	@Column
	private Date createdDate;
	
	@Column
	private Date updatedDate;
	
	@ManyToOne
	@JoinColumn(name="id")
	private User user;

	public Notes() {

	}

	public Notes(long noteId, String title, String description/*, Date createdDate, Date updatedDate*/) {

		this.noteId = noteId;
		this.title = title;
		this.description = description;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public long getNoteId() {
		return noteId;
	}

	public void setNoteId(long noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
