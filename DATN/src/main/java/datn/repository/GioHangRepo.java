package datn.repository;

import datn.entity.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GioHangRepo extends JpaRepository<GioHang,Integer> {

}
