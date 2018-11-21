package com.springExmpl.beans;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.springExmpl.Ibeans.IArticleData;

import java.util.Date;

import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy;

public class ArticleDataBean implements IArticleData{
	
	Logger  logger = Logger.getLogger(this.getClass().getName());
	
	private int id;
	private String name;
	private double price;
	private Date creationDate;
	private String chaine;
	private int entier;
	private float reel;
	private boolean booleen;
	private char caractere;
	private java.util.Properties proprietes; 
	private java.util.Locale localisation; 
	private java.net.URL url;
	private java.io.File fichier; 
	private java.lang.Class classe; 
	private byte[] tab2bytes; 
	private String[] tab2chaines;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}	
	

	public String getChaine() {
		return chaine;
	}
	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	public int getEntier() {
		return entier;
	}
	public void setEntier(int entier) {
		this.entier = entier;
	}
	public float getReel() {
		return reel;
	}
	public void setReel(float reel) {
		this.reel = reel;
	}
	public boolean isBooleen() {
		return booleen;
	}
	public void setBooleen(boolean booleen) {
		this.booleen = booleen;
	}
	public char getCaractere() {
		return caractere;
	}
	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}
	public java.util.Properties getProprietes() {
		return proprietes;
	}
	public void setProprietes(java.util.Properties proprietes) {
		this.proprietes = proprietes;
	}
	public java.util.Locale getLocalisation() {
		return localisation;
	}
	public void setLocalisation(java.util.Locale localisation) {
		this.localisation = localisation;
	}
	public java.net.URL getUrl() {
		return url;
	}
	public void setUrl(java.net.URL url) {
		this.url = url;
	}
	public java.io.File getFichier() {
		return fichier;
	}
	public void setFichier(java.io.File fichier) {
		this.fichier = fichier;
	}
	public java.lang.Class getClasse() {
		return classe;
	}
	public void setClasse(java.lang.Class classe) {
		this.classe = classe;
	}
	public byte[] getTab2bytes() {
		return tab2bytes;
	}
	public void setTab2bytes(byte[] tab2bytes) {
		this.tab2bytes = tab2bytes;
	}
	public String[] getTab2chaines() {
		return tab2chaines;
	}
	public void setTab2chaines(String[] tab2chaines) {
		this.tab2chaines = tab2chaines;
	}
	public double initPrice() {
		System.out.println("init price");
		this.setPrice(6.0);
		return this.getPrice();
	}


	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}

}
