package com.ug14.rumahsakit;

import java.sql.*;

public class DAO {
    public Dokter getDokterByID(int idDokter) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahsakit","root","");
        PreparedStatement stmt = con.prepareStatement("SELECT idDokter FROM dokter VALUE (?)");
        stmt.setInt(1, idDokter);
        stmt.executeUpdate();
        return null;
    }

    public Dokter getSusterByID(int idSuster) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahsakit","root","");
        PreparedStatement stmt = con.prepareStatement("SELECT idDokter FROM jadwal VALUE (?)");
        stmt.setInt(1, idSuster);
        stmt.executeUpdate();
        return null;
    }

    public Pelayanan getPelayananByID(int idPelayanan) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahsakit","root","");
        PreparedStatement stmt = con.prepareStatement("SELECT idDokter FROM jadwal VALUE (?)");
        stmt.setInt(1, idPelayanan);
        int id = stmt.executeUpdate();
        return null;
    }

    public static void inputPasien(Pasien pasien) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahsakit","root","");
        PreparedStatement stmt = con.prepareStatement("INSERT INTO pasien VALUE (?,?,?,?)");
        stmt.setInt(1, pasien.getRm());
        stmt.setString(2, pasien.getNama());
        stmt.setInt(3, pasien.getUsia());
        stmt.setString(4, pasien.getAlamat());
        stmt.executeUpdate();
    }

    public static void inputJadwal(Jadwal jadwal) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumahsakit","root","");
        PreparedStatement stmt = con.prepareStatement("INSERT INTO jadwal VALUE (?,?,?,?)");
        stmt.setInt(1, jadwal.getIdPemeriksaan());
        stmt.setInt(2, jadwal.getPasien().getRm());
        stmt.setInt(3, jadwal.getDokter().getIdDokter());
        stmt.setInt(4, jadwal.getSuster().getIdSuster());
        stmt.executeUpdate();
    }


}