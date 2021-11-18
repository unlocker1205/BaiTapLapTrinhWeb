package com.example.lab6.service;

import com.example.lab6.bean.GroupProduct;
import com.example.lab6.bean.OutstandingBrand;
import com.example.lab6.bean.ProductItems;
import com.example.lab6.bean.ProductLab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
    private static ProductService instance;
    Map<String, ProductLab6> map = new HashMap<>();

    {
        map.put("SP1", new ProductLab6("SP1", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 1 sản phẩm", 228000, 100000, 3, "image/sp1.png"));
        map.put("SP2", new ProductLab6("SP2", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 2 sản phẩm", 228000, 100000, 3, "image/sp2.png"));
        map.put("SP3", new ProductLab6("SP3", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 3 sản phẩm", 228000, 100000, 3, "image/sp3.png"));
        map.put("SP4", new ProductLab6("SP4", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 4 sản phẩm", 228000, 100000, 3, "image/sp4.png"));
        map.put("SP5", new ProductLab6("SP5", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 5 sản phẩm", 228000, 100000, 3, "image/sp5.png"));
        map.put("SP6", new ProductLab6("SP6", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 6 sản phẩm", 228000, 100000, 3, "image/sp2.png"));
        map.put("SP7", new ProductLab6("SP7", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 7 sản phẩm", 228000, 100000, 3, "image/sp1.png"));
        map.put("SP8", new ProductLab6("SP8", "Đế tản nhiệt Laptop DEEPCOOL Windpal Mini", "Còn 8 sản phẩm", 228000, 100000, 3, "image/sp5.png"));
    }

    Map<String, String> imageSlider = new HashMap<>();

    {
        imageSlider.put("Slider1", "image/Slider-image1.png");
        imageSlider.put("Slider2", "image/Slider-image2.jpg");
        imageSlider.put("Slider3", "image/Slider-image3.jpg");
        imageSlider.put("Slider4", "image/Slider-image4.jpg");
        imageSlider.put("Slider5", "image/Slider-image5.jpg");
    }

    Map<String, String> imageCarousel = new HashMap<>();

    {
        imageCarousel.put("Carousel1", "image/Carousel1.png");
        imageCarousel.put("Carousel2", "image/Carousel2.png");
        imageCarousel.put("Carousel3", "image/Carousel3.png");
    }

    Map<String, OutstandingBrand> imgOutstandingBrand = new HashMap<>();

    {
        imgOutstandingBrand.put("OutstandingBrand1", new OutstandingBrand("image/OutstandingBrand1.png", "Lenovo"));
        imgOutstandingBrand.put("OutstandingBrand2", new OutstandingBrand("image/OutstandingBrand2.png", "ASUS"));
        imgOutstandingBrand.put("OutstandingBrand3", new OutstandingBrand("image/OutstandingBrand3.png", "HP"));
        imgOutstandingBrand.put("OutstandingBrand4", new OutstandingBrand("image/OutstandingBrand4.png", "MSI"));
    }

    ProductItems items1 = new ProductItems("image/product-item1.png", "MSI Gaming", "Sức mạnh từ nhà rồng");
    ProductItems items2 = new ProductItems("image/product-item2.png", "Lễ hội HP", "Siêu khuyến mãi");
    ProductItems items3 = new ProductItems("image/product-item3.png", "LG Gram", "Siêu nhẹ siêu tiện lợi");
    ProductItems items4 = new ProductItems("image/product-item4.png", "Lenovo", "Dành cho doanh nhân");
    ArrayList<ProductItems> list1 = new ArrayList<>();

    ProductItems items5 = new ProductItems("image/product-item5.png", "PC", "Làm việc chuẩn mực");
    ProductItems items6 = new ProductItems("image/product-item6.png", "SSD", "Load nhanh trong tích tắc");
    ProductItems items7 = new ProductItems("image/product-item7.png", "Màn hình gaming", "Cảm nhận sự khác biệt");
    ProductItems items8 = new ProductItems("image/product-item8.png", "RTX 30 Series", "Hiệu năng vượt bậc");
    ArrayList<ProductItems> list2 = new ArrayList<>();

    ProductItems items9 = new ProductItems("image/product-item9.png", "Chuột gaming", "Tốc độ chuyên nghiệp");
    ProductItems items10 = new ProductItems("image/product-item10.png", "Tai nghe bluetooth", "Âm thanh cuốn hút");
    ProductItems items11 = new ProductItems("image/product-item11.png", "Bàn phím gaming", "Phím hay, giá vừa tay");
    ProductItems items12 = new ProductItems("image/product-item12.png", "Ổ cứng di động", "Lưu trữ không biên giới");
    ArrayList<ProductItems> list3 = new ArrayList<>();

    ProductItems items13 = new ProductItems("image/product-item13.png", "PC văn phòng", "Chuyên nghiệp & bền bỉ");
    ProductItems items14 = new ProductItems("image/product-item14.png", "Combo máy in", "Giải pháp cho doanh nghiệp");
    ProductItems items15 = new ProductItems("image/product-item15.png", "Phần mềm bản quyền", "Bảo mật chuyên nghiệp");
    ProductItems items16 = new ProductItems("image/product-item16.png", "Giải pháp camera", "An ninh toàn diện");
    ArrayList<ProductItems> list4 = new ArrayList<>();

    private ArrayList<ProductItems> addList(ArrayList result, ProductItems... pro){
        for (ProductItems x : pro) {
            result.add(x);
        }
        return result;
    }

    Map<String, GroupProduct> groupProduct = new HashMap<>();
    {
        groupProduct.put("GR1", new GroupProduct(addList(list1, items1, items2, items3, items4),"LAPTOP - MACBOOK", "image/poster1.png"));
        groupProduct.put("GR2", new GroupProduct(addList(list2, items5, items6, items7, items8),"PC - MÀN HÌNH - LINH KIỆN MÁY TÍNH", "image/poster2.png"));
        groupProduct.put("GR3", new GroupProduct(addList(list3, items9, items10, items11, items12),"LOA - TAI NGHE - THIẾT BỊ NGOẠI VI", "image/poster3.png"));
        groupProduct.put("GR4", new GroupProduct(addList(list4, items13, items14, items15, items16),"THIẾT BỊ MẠNG - VĂN PHÒNG", "image/poster4.png"));
    }

    public static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductService();
        }
        return instance;
    }

    private ProductService() {

    }

    public List<ProductLab6> getAll() {
        return new ArrayList<>(map.values());
    }

    public List<String> getAllImageSlide() {
        return new ArrayList<>(imageSlider.values());
    }

    public List<String> getAllImageCarousel() {
        return new ArrayList<>(imageCarousel.values());
    }

    public List<OutstandingBrand> getAllImageOutstandingBrand() {
        return new ArrayList<>(imgOutstandingBrand.values());
    }

    public List<GroupProduct> getAllGroupProduct() {
        return new ArrayList<>(groupProduct.values());
    }
}
