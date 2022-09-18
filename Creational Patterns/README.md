# Creational pattern

Creational pattern là các mẫu thiết kế xử lý các cơ chế tạo đối tượng, cố gắng tạo các đối tượng theo cách phù hợp với từng tình huống. Hình thức tạo đối tượng thông thường có thể dẫn đến các vấn đề thiết kế hoặc làm tăng thêm độ phức tạp cho thiết kế. Các mẫu creational giải quyết vấn đề này bằng cách nào đó để kiểm soát việc tạo đối tượng.

Các mẫu thiết kế sáng tạo bao gồm hai ý tưởng chủ đạo. Một là đóng gói thông tin về các lớp cụ thể mà hệ thống sử dụng. Hai là ẩn cách mà các thể hiện của các lớp cụ thể này được tạo và kết hợp.

Các creational design pattern được phân loại sâu hơn thành các mẫu sáng tạo đối tượng (object-creational patterns) và các mẫu sáng tạo lớp(class-creational patterns), trong đó các mẫu sáng tạo đối tượng xử lý việc tạo đối tượng và các mẫu sáng tạo lớp giải quyết việc tạo lớp. Nói chi tiết hơn, các mẫu tạo đối tượng trì hoãn một phần quá trình tạo đối tượng của nó cho một đối tượng khác, trong khi các mẫu sáng tạo lớp trì hoãn việc tạo đối tượng của nó thành các lớp con

### Các design pattern tiêu biểu như: 

### Mục đích

Mục đích creational patterns là tách biệt hệ thống khỏi cách mà đối tượng được khởi tạo, cấu tạo và biểu diễn. Chúng tăng tính linh hoạt cho hệ thống về cái gì, ai, như thế nào khi nào tọa đối tượng.

### Cách sử dụng

Trong kỹ thuật phần mềm hiện đại phụ thuộc nhiều hơn vào **object composition** hơn là lớp kế thừa. sự nhấn mạnh sẽ thay đổi từ các hành vi mã hóa cứng (hard-coding) sang việc xác định một nhóm nhỏ các hành vi cơ bản có thể được tổng hợp thành những hành vi phức tạp hơn. Các hành vi mã hóa cứng là không linh hoạt vì chúng yêu cầu ghi đè hoặc thực hiện lại toàn bộ để thay đổi các phần của thiết kế. Ngoài ra, mã hóa cứng không thúc đẩy việc sử dụng lại và gây khó khăn cho việc theo dõi các lỗi. Vì những lý do này, các creational design pattern hữu ích hơn các hành vi mã hóa cứng. Các mẫu sáng tạo giúp thiết kế trở nên linh hoạt hơn. Chúng cung cấp các cách khác nhau để loại bỏ các tham chiếu rõ ràng trong các lớp cụ thể khỏi mã cần khởi tạo chúng. Nói cách khác, họ tạo ra

### Khi cần sử dụng creational design pattern

- Hệ thống cần cần biết về cáhc mà các đối tượng hay sản phẩm được khởi tạo.
- Một tập hợp các đối tượng liên quan được thiết kế để sử dụng chung.
- Ẩn đi cách thực thi của các lớp library hay product, chỉ tiết lộ những interface của chúng.
- Xây dựng các thể hiện khác nhau của các đối tượng phức tạp độc lập
- Các lớp muốn những lớp con thực thi các đối tượng mà nó tạo ra
- Các lớp khởi tạo chỉ được chỉ định tại run-time.
  There must be a single instance and client can access this instance at all times.
- Phải có một thể hiện duy nhất và client có thể truy cập thể hiện nay bất cứ thời điểm nào
- Có thể mở rộng mà không bi thay đổi.

### Reference 
- [Wiki](https://en.wikipedia.org/wiki/Creational_pattern#cite_note-1)
