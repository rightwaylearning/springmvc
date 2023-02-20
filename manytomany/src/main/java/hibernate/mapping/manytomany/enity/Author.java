package hibernate.mapping.manytomany.enity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@Column(name="author_id")
	private Integer authorId;
	
	@Column(name="author_name")
	private String authorName;
	
	@ManyToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "author"
			)
	@JoinTable(
			name="author_book",
			joinColumns =@JoinColumn(name="fk_aid", referencedColumnName = "author_id"),
			inverseJoinColumns =@JoinColumn(name="fk_bid",referencedColumnName = "book_id")
			)
	private List<Book> books;

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
