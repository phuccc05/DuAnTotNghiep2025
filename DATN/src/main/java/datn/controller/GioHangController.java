package datn.controller;

import datn.entity.GioHang;
import datn.service.GioHangService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("api/gio-hang")
@AllArgsConstructor
public class GioHangController {
    private final GioHangService gioHangService;

    @GetMapping
    public ResponseEntity<List<GioHang>> getGioHang(){
        List<GioHang> gioHangs=gioHangService.getGioHang();
        return ResponseEntity.ok(gioHangs);
    }
    @GetMapping("{id}")
    public ResponseEntity<GioHang> getOne(@PathVariable("id") int id) {
        GioHang gioHang = gioHangService.getOneGioHang(id);
        return ResponseEntity.ok(gioHang);
    }
    @PutMapping("{id}")
    public ResponseEntity<GioHang> updateGioHang(@RequestBody GioHang gioHang, @PathVariable("id") int id){
        GioHang updateGioHang= gioHangService.updateGioHang(gioHang,id);
        return  ResponseEntity.ok(updateGioHang);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGioHang(@PathVariable("id") int id){
        gioHangService.deleteGioHang(id);
        return ResponseEntity.ok("Delete order with id ="+id);
    }
    @PostMapping("/create")
    public ResponseEntity<GioHang> createGioHang(@RequestBody GioHang gioHang) {
        gioHang.setId(null);
        GioHang createGioHang = gioHangService.createGioHang(gioHang);
        return ResponseEntity.ok(createGioHang);
    }

}
