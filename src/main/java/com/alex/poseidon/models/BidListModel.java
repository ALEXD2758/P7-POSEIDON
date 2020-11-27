package com.alex.poseidon.models;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "bidlist")
public class BidListModel {

    @Id
    @Column(name = "bid_list_id")
    private int bidListId;
    @NotBlank(message = "Account is mandatory")
    @Size(max = 30)
    @Column(name = "account")
    private String account;
    @NotBlank(message = "Type is mandatory")
    @Size(max = 30)
    @Column(name = "type")
    private String type;
    @Positive(message = "Bid Quantity must be greater than zero")
    @Column(name = "bid_quantity")
    private double bidQuantity;
    @Column(name = "ask_quantity")
    private double askQuantity;
    @Column(name = "bid")
    private double bid;
    @Column(name = "ask")
    private double ask;
    @Size(max=125, message = "The size of benchmark must be of maximum 125 characters")
    @Column(name = "benchmark")
    private String benchmark;
    @FutureOrPresent(message = "The bid list date should be a date in the future or now")
    @Column(name = "bid_list_date")
    private Timestamp bidListDate;
    @Size(max=125, message = "The size of commentary must be of maximum 125 characters")
    @Column(name = "commentary")
    private String commentary;
    @Size(max=125, message = "The size of security must be of maximum 125 characters")
    @Column(name = "security")
    private String security;
    @Size(max=125, message = "The size of status must be of maximum 10 characters")
    @Column(name = "status")
    private String status;
    @Size(max=125, message = "The size of trader must be of maximum 125 characters")
    @Column(name = "trader")
    private String trader;
    @Size(max=125, message = "The size of book must be of maximum 125 characters")
    @Column(name = "book")
    private String book;
    @Size(max=125, message = "The size of the created name must be of maximum 125 characters")
    @Column(name = "creation_name")
    private String creationName;
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @Size(max=125, message = "The size of the revision name must be of maximum 125 characters")
    @Column(name = "revision_name")
    private String revisionName;
    @FutureOrPresent(message = "The revision date should be a date in the future or now")
    @Column(name = "revision_date")
    private Timestamp revisionDate;
    @Size(max=125, message = "The size of the deal name must be of maximum 125 characters")
    @Column(name = "deal_name")
    private String dealName;
    @Size(max=125, message = "The size of the deal type must be of maximum 125 characters")
    @Column(name = "deal_type")
    private String dealType;
    @Size(max=125, message = "The size of the source list Id must be of maximum 125 characters")
    @Column(name = "source_list_id")
    private String sourceListId;
    @Size(max=125, message = "The size of side must be of maximum 125 characters")
    @Column(name = "side")
    private String side;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBidListId() {
        return bidListId;
    }

    public void setBidListId(int bidListId) {
        this.bidListId = bidListId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBidQuantity() {
        return bidQuantity;
    }

    public void setBidQuantity(double bidQuantity) {
        this.bidQuantity = bidQuantity;
    }

    public double getAskQuantity() {
        return askQuantity;
    }

    public void setAskQuantity(double askQuantity) {
        this.askQuantity = askQuantity;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public String getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(String benchmark) {
        this.benchmark = benchmark;
    }

    public Timestamp getBidListDate() {
        return bidListDate;
    }

    public void setBidListDate(Timestamp bidListDate) {
        this.bidListDate = bidListDate;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getCreationName() {
        return creationName;
    }

    public void setCreationName(String creationName) {
        this.creationName = creationName;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getRevisionName() {
        return revisionName;
    }

    public void setRevisionName(String revisionName) {
        this.revisionName = revisionName;
    }

    public Timestamp getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Timestamp revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getSourceListId() {
        return sourceListId;
    }

    public void setSourceListId(String sourceListId) {
        this.sourceListId = sourceListId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}