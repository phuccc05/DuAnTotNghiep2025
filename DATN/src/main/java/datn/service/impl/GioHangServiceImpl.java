package datn.service.impl;

import datn.entity.GioHang;
import datn.exception.ResourceNotFoundException;
import datn.repository.GioHangRepo;
import datn.service.GioHangService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GioHangServiceImpl implements GioHangService {
    private final GioHangRepo gioHangRepo;

    public List<GioHang> getGioHang(){
     return gioHangRepo.findAll();
}
    public GioHang getOneGioHang(int id) {
        return gioHangRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy giỏ hàng với id = " + id));
    }
    @Override
    public GioHang updateGioHang(GioHang gioHang, int id){
        GioHang update= gioHangRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy giỏ hàng với id "+id));
        update.setSoLuong(gioHang.getSoLuong());
        return gioHangRepo.save(update);
    }

    @Override
    public void deleteGioHang(int id){
        GioHang delete = gioHangRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Không tìm thấy giỏ hàng với id "+id));
        gioHangRepo.delete(delete);
    }

    @Override
    public GioHang createGioHang (GioHang gioHang) {
        return gioHangRepo.save(gioHang);
    }


}
