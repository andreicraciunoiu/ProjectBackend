package com.db.internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationJwt {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationJwt.class, args);
	}
}	
//	Book book1 = new Book("Adaptive Code via C#. Agile Coding with Design Patterns and SOLID Principles", "Gary McLean Hall", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/3OJEEEN.jpg");
//	Book book2 = new Book("Advanced Credit Risk Analysis and Management", "Cib Joseph", "Finance", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/n3EKnhY.jpg");
//	Book book3 = new Book("Advanced Programming in the UNIX Environment. 3rd Edition.", "W. Richard", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/rSkf1Pb.jpg");
//	Book book4 = new Book("Advanced Software Testing Vol. 2", "Rex Black", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/8euXq5G.jpg");
//	Book book5 = new Book("An intro to Banking - Liquidity Risk & ALM", "Oldrich Masek", "Banking", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/uXZHKp6.jpg");
//	Book book6 = new Book("Big Data Smack.", "Raul Estrada", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/7REyOWv.jpg");
//	Book book7 = new Book("Building a Scalable Data Warehouse with Data Vault 2.0", "Daniel Linstedt", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/VG3yhWR.jpg");
//	Book book8 = new Book("Business Analysis for Practitioners. A Practice Guide", "Project Management Institute", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/PZAg2Lw.jpg");
//	Book book9 = new Book("Central Counterparties. Mandatory Clearing and Bilateral Margin Requirements for OTC Derivatives", "Jon Gregory", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/lhZjEQg.jpg");
//	Book book10 = new Book("Clean Code - A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/jBY2cyr.jpg");
//	Book book11 = new Book("Coders at Work - Reflections on the Craft of Programming", "Peter Seibel", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/eolZE2N.jpg");
//	Book book12 = new Book("Core J2EE Patterns. Best Practices and Design Strategies", "Dan Malks", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/Shexqib.jpg");
//	Book book13 = new Book("Design Patterns. Elements of Reusable Object-Oriented Software", "Ralph Johnson", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/Ya4k9WR.jpg");
//	Book book14 = new Book("Domain-Driven Design Reference. Definitions and Pattern Summaries", "Eric Evans", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/stwObQ5.jpg");
//	Book book15 = new Book("Domain-Driven Design. Tackling Complexity in the Heart of Software", "Eric Evans", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/Bgic3b2.jpg");
//	Book book16 = new Book("Elasticsearch 5.x Cookbook - 3rd Edition", "Alberto Paro", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/v6zr6Cj.jpg");
//	Book book17 = new Book("Expert Oracle Database Architecture (3rd Edition)", "Thomas Kyte", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/6fbEj3W.jpg");
//	Book book18 = new Book("Financial Times Guides - Banking", "Glen Arnold", "Finance", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/N8fI0Wq.jpg");
//	Book book19 = new Book("Forta Gandirii Pozitive", "Norman Vincent Peale", "Finance", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/GvYPoWD.jpg");
//	Book book20 = new Book("Go in Action", "William Kennedy", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/90wkwMw.jpg");
//	Book book21 = new Book("Head First Java (A Brain-Friendly Guide)", "Kathy Sierra", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/c4bC3Bb.jpg");
//	Book book22 = new Book("Head First Object-Oriented Analysis & Design. A Brain-Friendly Guide", "David West", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/7UAowgb.jpg");
//	Book book23 = new Book("Introduction to Oracle - SQL and PL-SQL. Vol 2 - Student Guide", "Oracle", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/70rpcyl.jpg");
//	Book book24 = new Book("IT Architecture for Dummies", "Susan L. Cook", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/VL5k2qC.jpg");
//	Book book25 = new Book("It's not Luck", "Eliyauh M. Goldratt", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/1G7qHuP.jpg");
//	Book book26 = new Book("J2EE Development without EJB", "Rob Johnson", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/UmOzs1w.jpg");
//	Book book27 = new Book("Java - de la 0 la Expert", "Stefan Andrei", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/D14rqxz.jpg");
//	Book book28 = new Book("Java EE6 - A Quick Reference for Simplified Enterprise Java Development (Pocket Guide)", "Arun Gupta", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/qMIcDGe.jpg");
//	Book book29 = new Book("Java Performance. The Definitive Guide", "Scott Oaks", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/GusnJNx.jpg");
//	Book book30 = new Book("Learning AngularJS - A Guide to AngularJS Development", "Ken Williamson", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/0CeEJXK.jpg");
//	Book book31 = new Book("Learning Spark. Lightning-Fast Data Analysis", "Patrick Wendell", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/Kx7Qlgl.jpg");
//	Book book32 = new Book("Linux - Essential commands (Pocket Guide)", "Daniel J. Barrett", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/Go7YqK0.jpg");
//	Book book33 = new Book("Liquidity Risk Measurement and Management - Basel III and Beyond", "Leonard Matz", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/tYxXYYz.jpg");
//	Book book34 = new Book("Managing the Test People. A Guide to Practical Technical Management", "Judy McKay", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/3rt86HZ.jpg");
//	Book book35 = new Book("Mastering Concurrency in Go", "Nathan Kozyra", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/L0t8iEA.jpg");
//	Book book36 = new Book("Mastering Elasticsearch 5.x. 3rd Edition", "Bharvi Dixit", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/vIB9asT.jpg");
//	Book book37 = new Book("Maven. A Developer's Notebook", "Vincent Massol", "IT", BookState.AVAILABLE, 0, 
//			"http://i.imgur.com/umzMXpY.jpg");
