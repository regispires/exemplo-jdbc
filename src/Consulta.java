import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Consulta {

	public static void main(String[] args) {
		String nomeCliente = JOptionPane.showInputDialog("Digite um nome");
		Connection con = null;
		try {
			con = ConnectionFactory.getConnection();
			String sql = "select * from cliente where nome ilike ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + nomeCliente + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				int idade = rs.getInt("idade");
				System.out.println(id + " " + nome + " " + idade);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
