package datn.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lich_su_dang_nhap")
public class LichSuDangNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "thoi_gian")
    private LocalDate thoiGian;

    @Column(name = "ip")
    private String ip;

    @ManyToOne
    @JoinColumn(name = "id_nguoi_dung", referencedColumnName = "id")
    private NguoiDung nguoiDung;

}
