package hrmsProject.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="createDate")
	private Date createDate;
	@Column(name="active")
	private boolean active;


}
