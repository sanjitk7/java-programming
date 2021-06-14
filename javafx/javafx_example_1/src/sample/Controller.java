package sample;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.util.Callback;


public class Controller implements Initializable {

    @FXML
    private TableView tblData;


    Connection createConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanjit_tables","root","Luckyusa1");
        return con;
    }

    Connection con = null;
    public Controller() throws Exception{
        con = createConnection();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            fetColumnList();
            fetRowList();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    private ObservableList<ObservableList> data = FXCollections.observableArrayList();
    String SQL = "SELECT * from admins";
    private void fetColumnList() {

        try {
            System.out.println("fetching columns for inq");
            ResultSet rs = con.createStatement().executeQuery(SQL);
            System.out.println("fetching columns for inq 2");
            //SQL FOR SELECTING ALL OF CUSTOMER
            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                System.out.println("fetching columns for inq 3");
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1).toUpperCase());
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                System.out.println("fetching columns for inq 4");
                tblData.getColumns().removeAll(col);
                tblData.getColumns().addAll(col);
                System.out.println("fetching columns for inq 5");
                System.out.println("Column [" + i + "] ");

            }

        } catch (Exception e) {
            System.out.println("Error " + e);

        }
    }

    private void fetRowList() {
        data = FXCollections.observableArrayList();
        ResultSet rs;
        try {
            rs = con.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added " + row);
                data.add(row);

            }

            tblData.setItems(data);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
