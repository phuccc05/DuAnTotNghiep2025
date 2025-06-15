package datn.service;

import datn.entity.GioHang;

import java.util.List;

public interface GioHangService {
    List<GioHang> getGioHang();

    GioHang getOneGioHang(int id);

    void deleteGioHang(int id);

    GioHang createGioHang(GioHang gioHang);

    GioHang updateGioHang(GioHang gioHang, int id);
}
