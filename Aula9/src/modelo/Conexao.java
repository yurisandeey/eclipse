package modelo;

import javax.swing.*;
import java.sql.*;

public class Conexao
{

	public void  Conecta ()
	{
	
	//OptionPane.showMessageDialog(null,"Chegou!!!");
	try

	{
		Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/banco","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select*From login");
		if (rs!=null)
		{
			JOptionPane.showMessageDialog(null, "Conectou!");
			rs.close ();
		}
			con.close ();
	}
	catch (SQLException e)
	{
		JOptionPane.showMessageDialog(null,"Erro" + e);
	}
		
	}
}
