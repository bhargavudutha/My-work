package carinventory;

import java.io.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;

public class Car {
	static int count = 0;

	public static void main(String[] args) throws Exception {
		int year;
		float sale_price = 0;
		String make = null, model;
		Connection con = null;
		Statement s = null;
		ResultSet rs = null;
		int ch;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Car_inventory", "root", "root");
		} catch (Exception e) {
			System.out.println("error" + e);
		}
		System.out.println("Welcome to Hitler's Car Inventory");
		System.out.println("Press 1 to ADD a car into the Catalog");
		System.out.println("Press 2 to DELETE a car from Catalog");
		System.out.println("Press 3 to UPDATE a car in the Catalog");
		System.out.println("Press 4 to VIEW the cars list of Catalog");
		System.out.println("Press 5 to QUIT");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		String option = sc.next();

		switch (option) {
		case "1":
			int sum1 = 0;
			;
			String str1 = "select count(year) from car";
			PreparedStatement stmt1 = con.prepareStatement(str1);
			try {
				rs = stmt1.executeQuery();
				while (rs.next()) {
					int i = rs.getInt(1);
					if (i < 3) {
						System.out.println(" enter car's maker");
						make = sc.next();
						System.out.println(" enter car model");
						model = sc.next();
						System.out.println(" enter year");
						year = sc.nextInt();
						System.out.println(" enter sale price ");
						sale_price = sc.nextFloat();
						String query = "Insert into car values('" + make + "','" + model + "','" + year + "','"
								+ sale_price + "')";
						s = con.createStatement();
						s.executeUpdate(query);
						System.out.println("row inserted");
						count++;
						System.out.println(count);
					}

					else
						System.out.println("Inventory is full");
				}
			} catch (Exception e) {
				System.out.println("error1" + e);
			}

			break;

		case "2":

			System.out.println(" enter car's maker to deleted");
			make = sc.next();
			String str2 = "delete from car where make=?";
			PreparedStatement st = con.prepareStatement(str2);
			try {
				st.setString(1, make);
				st.executeUpdate();
				System.out.println("deleted successfully");
			} catch (Exception e) {
				System.out.println("error2" + e);
			}

			break;

		case "3":

			System.out.println(" enter car's model  to be updated");
			model = sc.next();
			System.out.println(" enter respective car's maker ");
			make = sc.next();
			String str3 = "update car set model=?" + "where make=?";
			PreparedStatement st9 = con.prepareStatement(str3);
			try {
				st9.setString(1, model);
				st9.setString(2, make);
				st9.executeUpdate();
				System.out.println("updated successfully");
			} catch (Exception e) {
				System.out.println("error3" + e);
			}
			break;

		case "4":
			try {

				String query = "select * from car ";
				s = con.createStatement();
				rs = s.executeQuery(query);
				boolean rec = rs.next();
				if (!rec)

				{
					System.out.println("no cars in the catalog");
				}

				do {
					make = rs.getString(1);
					model = rs.getString(2);
					year = rs.getInt(3);
					sale_price = rs.getFloat(4);
					System.out.print(make + "\t");
					System.out.print(model + "\t");
					System.out.print(year + "\t");
					System.out.println("\t" + sale_price);

				} while (rs.next());

			}

			catch (Exception e) {
				System.out.println("error5" + e);

			} finally {
				float sum = 0;
				String str4 = "select sum(sale_price) from car";

				PreparedStatement stmt4 = con.prepareStatement(str4);

				try {
					rs = stmt4.executeQuery();
					while (rs.next()) {
						float c = rs.getFloat(1);
						sum = sum + c;
						System.out.println("Total inventory cost is:" + sum);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					int sum4 = 0;
					;
					String str5 = "select count(year) from car";
					PreparedStatement stmt5 = con.prepareStatement(str5);
					try {
						rs = stmt5.executeQuery();
						while (rs.next()) {
							int i = rs.getInt(1);
							System.out.println("Number of cars in inventory is:" + i);
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

				}
			}

			break;

		case "5":
			System.out.println("Thank you! For using our services");
			System.exit(1);
			break;
		default:
			System.out.println("sorry! The command you entered is Invalid please try again");
			break;
		}
		System.out.println("DO YOU WANT TO CONTINUE: (YES/NO)");

		String o = sc.next();
		if (o.equalsIgnoreCase("yes")) {
			main(args);
		} else if (o.equalsIgnoreCase("no")) {
			System.out.println("Terminated");
		} else {
			System.err.println("choose only yes or no");
		}
	}

}

