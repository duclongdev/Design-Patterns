# Singleton pattern

- Đảm bảo rằng một lớp chỉ có một thể hiện (instance) duy nhất và cung cấp một điểm truy cập toàn cục đến nó
- Singleton xử lý 2 vấn đề cùng một lúc
  - Đảm bảo rằng một class chỉ có đúng một instance
  - Cung cấp một điểm truy cập global cho phiên bản đó

### 1. Các bước thực hiện

- Thêm một trường static vào class để lưu một singleton instance
- Khai báo một phương thức khởi tạo public static method cho việc lấy được thể hiện của singleton.
- Triển khai "lazy initialization" bên trong phương thức static method. Nó nên khởi tạo đối tượng khi lần đầu được gọi. Và luôn trả về trường hợp đó trong mọi lần gọi tiếp theo
- Làm cho constructor của class là private. Phương thức static vẫn sẽ gọi đến constructor nhưng không phải là các đối tượng khác.
- Quay về client code và thay thế tất cả những lệnh gọi trực tiếp tới constructor của singleton bằng lệnh gọi đến phương thức tạo static.(**Singleton**.getInstance())
### Dùng khi nào
- Sử dụng Singleton khi class trong chương trình chỉ cần một thể hiện cho tất cả 
- Sử dụng khi bạn cần kiểm soát chặt chẽ hơn đối với các biến toàn cục.
### Ưu điểm

- Chắc chắn rằng class đó chỉ có một instance
- Bạn có được một điểm truy cập toàn cầu vào instance đó.
- Đối tượng singleton chỉ

### Nhược điểm

- Vi phạm nguyên tắc Singhle Responsibility Principle. Mẫu này xử lý 2 vấn đề cùng lúc(Tạo một điểm truy cập globle và chỉ có một thể hiện duy nhất)
  -Có thể che giấu thiết kế xấu. Ví dụ khi các thành phần của chương trình biết quá nhiều về nhau.
- Nó yêu cầu xử lý đặc biệt trong môi trường đa luồng để không tạo ra nhiều đối tượng singleton nhiều lần
- Nó có thể khiến việc viết unit test gặp khó khăn. Vì hiện nay rất nhiều test framework dựa trên kế thừa tạo ra các đối tượng giả(mock object).Vì hàm tạo của lớp singleton là các private và việc ghi đè phương thức tình hầu như là không thể trong hầu hết các ngôn ngữ. Bạn phải nghĩ ra một cách để giả lập singleton. Hoặc thậm chí không viết test hay không sử dụng singleton pattern.
