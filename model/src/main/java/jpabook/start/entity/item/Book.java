package jpabook.start.entity.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item{

    private String author;
    private String ibsn;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIbsn() {
        return ibsn;
    }
    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }
}
