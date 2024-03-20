package com.maven.UserFile.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="u_id")
	int u_id;
    @Column(name="text")
	String text; 
    @Column(name="image")
	String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int id, int u_id, String text, String image) {
		super();
		this.id = id;
		this.u_id = u_id;
		this.text = text;
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", u_id=" + u_id + ", text=" + text + ", image=" + image + "]";
	}
}
