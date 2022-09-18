# The Observer Pattern

Observer Pattern cung cập mối quan hệ phụ thuộc 1-nhiều giữa các đối tượng vì vậy khi đối tượng thay đổi tất cả các phụ thuộc của nó sẽ được thông báo đến sự thay đổi này.

### Nguyên tắc

**Strive for loosely coupled designs between objects that interact.**( tạm dịch là: cố gắng liên kết lỏng kẻo giữa các đối tượng tương tác với nhau )

- Thiết kế liên kết lỏng lẻo (Loosely coupled) cho phép chúng ta xây dựng một hệ thống hướng đối tượng linh loạt nhờ đó có thể dễ dàng xử lý thay đổi vì chúng giảm đi sự phụ thuộc giữa các đối tượng

### Các thành phần

Các thành phần tham gia Observer Pattern:

**Subject** : chứa danh sách các observer, cung cấp phương thức để có thể thêm và loại bỏ observer.
**Observer** : định nghĩa một phương thức update() cho các đối tượng sẽ được subject thông báo đến khi có sự thay đổi trạng thái.
**ConcreteSubject** : cài đặt các phương thức của Subject, lưu trữ trạng thái danh sách các ConcreateObserver, gửi thông báo đến các observer của nó khi có sự thay đổi trạng thái.
**ConcreteObserver** : cài đặt các phương thức của Observer, lưu trữ trạng thái của subject, thực thi việc cập nhật để giữ cho trạng thái đồng nhất với subject gửi thông báo đến.

### Ứng dụng

- Sử dụng Observer pattern khi thay đổi trạng thái của một đối tượng có thể yêu cầu thay đổi các đối tượng khác và tập hợp các đối tượng thực không được biết trước hoặc khi thay đổi động.
- Sử dụng pattern này khi một vài đối tượng trong ứng dụng phải quan sát đối tượng khác, nhưng chỉ trong thời gian cho phép hoặc những trường hợp đặc biệt.

### Các bước thực hiện

1. Chia code thành hai phần:
   - Chức năng chính, độc lập với code khác, đóng vai trò là Subject
   - Phần còn lại sẽ biến thành một tập hợp các lớp observer
2. Khai báo một Observer interface. Tại mức tối thiểu, nó chỉ nên khai báo một phương thức update
3. Khai báo một Subject interface và khởi tạo hai phương thức là thêm và xóa đối tượng Observer. Lưu ý rằng Subject chỉ tương tác với Observer thông qua Observer interface.
4. Quyết định nơi đặt danh sách các observer và các triển khai của phương thức observer. Thông thường, mã này trông giống nhau đối với tất cả các loại nhà xuất bản, do đó vị trí rõ ràng để đặt nó là trong một lớp trừu tượng được dẫn xuất trực tiếp từ Subject interface. Concrete subject mở rộng lớp đó, kế thừa hành vi đăng ký.
   - Tuy nhiên, nếu bạn đang áp dụng pattern này cho hệ thống phân cấp lớp hiện có, hãy xem xét cách tiếp cận dựa trên thành phần: đặt logic đăng ký vào một đối tượng riêng biệt và khiến tất cả các Subjecter thực sử dụng nó.
5. Tạo một lớp Subject cụ thể. Mỗi lần có thay đổi bên trong Subjecter, nó sẽ gửi thông báo đến các observer đã đăng ký nó.
6. Triển khai các phương thức cập nhật bên trong các lớp observer cụ thể. Hầu hết các oberver sẽ cần một số dữ liệu ngữ cảnh (Context data) về sự kiện đang theo dõi. Nó có thể được truyền trong đối số của phương thức notification.
7. Ở client phải tạo ra các Obeserver cần thiết và đăng ký chúng cho những Subjecters tùy chọn.

### Ưu điểm

- Open/Closed Principle: Ban có thể thêm vào một lớp Observer mà không cần thay đổi bất kỳ dòng code nào ở Subject ( và ngược lại ở phía Subject).
- Bạn có thể thiết lập mối liên hệ giữa 2 đối tượng tại thời điểm runtime.

### Nhược điểm

- Observer được thông báo theo thứ tự ngẫu nhiên.

### Diagram

### Tài liệu tham khảo

- [guru.refactoring](https://refactoring.guru/)
