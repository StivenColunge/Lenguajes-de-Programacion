
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CONSULTAS extends CONEXION {
           public boolean registrar (MASCOTAS masco){
        PreparedStatement ps = null;
        Connection c = getConnection();
        
        String sql = "INSERT INTO usuario (mascota, raza, edad, dueño, celular)VALUES (?,?,?,?)";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1,masco.getMascota());
            ps.setString(2,masco.getRaza());
            ps.setInt(3,masco.getEdad());
            ps.setString(4,masco.getDueño());
            ps.setInt(4,masco.getCelular());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("no se pudo incertar");
            return false;
        }finally{
            try {
                c.close();
            } catch (Exception e) {
                System.out.println("no se pudo incertar");
            }
        }
        
       }

            public boolean moificar (MASCOTAS masco){
        PreparedStatement ps = null;
        Connection c = getConnection();
        
        String sql = "UPDATE usuario SET (mascota=?, raza=?, edad=?, dueño=?, celular=?)WHERE mascota=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1,masco.getMascota());
            ps.setString(2,masco.getRaza());
            ps.setInt(3,masco.getEdad());
            ps.setString(4,masco.getDueño());
            ps.setInt(5,masco.getCelular());
            ps.setString(6,masco.getMascota());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("no se pudo incertar");
            return false;
        }finally{
            try {
                c.close();
            } catch (Exception e) {
                System.out.println("no se pudo incertar");
            }
        }
        
       }
            public boolean eliminar (MASCOTAS masco){
        PreparedStatement ps = null;
        Connection c = getConnection();
        
        String sql = "DELETE FROM usuario WHERE mascota=?";
        try {
            ps.setString(1,masco.getMascota());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("no se pudo incertar");
            return false;
        }finally{
            try {
                c.close();
            } catch (Exception e) {
                System.out.println("no se pudo incertar");
            }
        }
        
       }
            public boolean ver (MASCOTAS masco){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection c = getConnection();
        
        String sql = "SELECT * FROM usuario WHERE mascota=? ";
        try {
            ps.setString(1,masco.getMascota());
            rs=ps.executeQuery();
            
            if (rs.next()) {
                masco.setMascota(rs.getString(1));
                masco.setRaza(rs.getString(2));
                masco.setEdad(rs.getInt(3));
                masco.setDueño(rs.getString(4));
                masco.setCelular(rs.getInt(5));
                return true;
                
            }
            return false;
        } catch (Exception e) {
            System.out.println("no se pudo incertar");
            return false;
        }finally{
            try {
                c.close();
            } catch (Exception e) {
                System.out.println("no se pudo incertar");
            }
        }
        
       }




}    
