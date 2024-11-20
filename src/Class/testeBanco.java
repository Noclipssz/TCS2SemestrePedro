package Class;

import BancoDeDados.ConectBank;
import BancoDeDados.InsertBank;
import model.dao.CarDao;
import model.dao.DaoFactory;
import model.dao.impl.CarDaoJDBC;
import model.entities.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class testeBanco {
    public void Ler(){
        CarDao carDao = DaoFactory.createCarDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert valor: ");
        String valor = sc.nextLine();
        System.out.println("Insert cor: ");
        String cor = sc.nextLine();
        System.out.println("Insert modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Insert ano: ");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Insert marca: ");
        String marca = sc.nextLine();
        System.out.println("Insert placa: ");
        String placa = sc.nextLine();

        Car NewCar = new Car(null, valor,cor, modelo, ano, marca, placa);
        carDao.inserir(NewCar);
        carDao.deleteById(NewCar, 1);
        System.out.println("Car adicionado com sucesso!");
        System.out.println(NewCar.getId());
    }

    public void ListarCar   (){
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
