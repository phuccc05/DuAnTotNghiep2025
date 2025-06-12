package datn.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "voucher")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma_voucher")
    private String maVoucher;

    @Column(name = "ten_voucher")
    private String tenVoucher;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "kieu_giam")
    private boolean kiemGiam;

    @Column(name = "muc_giam")
    private BigDecimal mucGiam;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "so_luong_con")
    private int soLuongCon;

    @Column(name = "ngay_bat_dau")
    private Date ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private Date ngayKetThuc;

    @Column(name = "dieu_kien_toi_thieu")
    private BigDecimal dKienToithieu;

    @Column(name = "trang_thai")
    private Boolean trangThai;
}
