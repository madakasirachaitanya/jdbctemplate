package com.reddy.Model;

import java.time.LocalDate;

import org.springframework.jdbc.core.RowCallbackHandler;

public class ModelBook {

		private int isbn;
		private String bookname;
		private String author;
		private LocalDate publishdate;
		private String content;
		private int price;
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public LocalDate getPublishdate() {
			return publishdate;
		}
		public void setPublishdate(LocalDate publishdate) {
			this.publishdate = publishdate;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

	}


