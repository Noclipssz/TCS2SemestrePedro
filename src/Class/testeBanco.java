package Class;

import BancoDeDados.ConectBank;
import BancoDeDados.InsertBank;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class testeBanco {
    public void Ler(){
        Scanner sc = new Scanner(System.in);
        InsertBank a = new InsertBank();

        System.out.println("Insert make: ");
        String make = sc.nextLine();
        System.out.println("Insert model: ");
        String model = sc.nextLine();
        System.out.println("Insert year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Insert color: ");
        String color = sc.nextLine();
        System.out.println("Insert mileage: ");
        double mileage = sc.nextDouble();
        System.out.println("Insert price: ");
        double price = sc.nextDouble();

        a.insert(make, model, year, color, mileage, price);
    }

    public void ListarCar(){
        ConectBank db = new ConectBank();

        Connection conn;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = db.getConexao();

            st = conn.createStatement();

            rs = st.executeQuery("select * from vehicles");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            db.closeStatmente(st);
            db.closeResult(rs);
            db.close();

        }
    }
}
