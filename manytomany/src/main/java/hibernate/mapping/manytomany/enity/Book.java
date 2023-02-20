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
@Table(name="book")
public class Book {

	@Id
	@Column(name="book_id")
	private Integer bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@ManyToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "book"
			)
	@JoinTable(
			name="author_book",
			joinColumns =@JoinColumn(name="fk_bid",referencedColumnName = "book_id"),
			inverseJoinColumns =@JoinColumn(name="fk_aid", referencedColumnName = "author_id") 
			)
	private List<Author> authors;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
		
}
