package com.example.demo_details.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "details")
public class DetailsDAO {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Integer id;

    @Column(name = "prod_code", nullable = false, length = 20)
    private String prodCode;

    @Column(name = "img_path", nullable = true, length = 100)
    private String imgPath;

    @Column(name = "create_date", nullable = true)
    private Date createDate;

    @Column(name = "prod_name", nullable = true, length = 20)
    private String prodName;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.valueOf(id + ", " + prodCode + ", " + imgPath + ", " + createDate + ", " +prodName);
    }

    // @OneToOne(cascade={CascadeType.ALL})
    // @JoinColumn(name="prod_code", insertable = false)
    // private ProdCodeDAO prodCodeDAO;

    // public ProdCodeDAO getProdCodeDAO() {
    //     return prodCodeDAO;
    // }

    // public void setProdCodeDAO(ProdCodeDAO prodCodeDAO) {
    //     this.prodCodeDAO = prodCodeDAO;
    // }

    
}

