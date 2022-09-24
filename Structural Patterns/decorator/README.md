# Decorator Pattern

### 1. Khái niệm

- Mẫu thiết kế này sẽ linh động thay đổi tính chất (functionality) đã có trong một đối tượng khi chương trình đang chạy (runtime) mà không ảnh hưởng đến các tình chất đã tồn tại của các đối tượng khác.
- Là một mẫu thiết kế cấu trúc cho phép bạn đính kèm các hành vi mới vào các đối tượng bằng cách đặt các đối tượng này vào bên trong các đối tượng trình bao bọc đặc biệt có chứa các hành vi.

### 2. Các bước thực hiện

- B1: Đảm bảo rằng phần code nghiệp vụ có thể biểu diễn bằng 1 component chính với các lớp tùy chọn trên nó
- B2: Tìm ra các phương thức chung cho component và các lớp tùy chọn. Tạo interface component và khai báo các phương thức cho nó.
- B3: Tạo lớp concrete component và xác định hành vi cơ sở của nó
- B4: Tạo lớp decorator cơ sở. Nó nên có trường để lưu trữ đến các đối tượng được bọc. Trường này nên khai báo cùng kiểu interface component để cho phép liên kết đến concrete component cũng như các decorator.Decorator sẽ ũy thác tất cả công việc cho các đối tuợng được bọc
- B5: Đảm bảo cho tất cả các lớp triển khai theo interface component
- B6: Tạo concrete decorator bằng cách mở rộng nó từ decorator cơ sở. Concrete decorator phải thực thi hành vi của nó trước hoặc sau gọi đến phương thức cha (nơi lưu uỷ thác công việc cho đối tượng được bọc).
- B7: Code client phải chịu trách nhiệm tạo decorator và cấu trúc chúng khi cần sử dụng.

### 3. Lợi ích

- Tăng cường khả năng mở rộng của đối tượng, bởi vì những thay đổi được thực hiện bằng cách implement trên các lớp mới.
- Client sẽ không nhận thấy sự khác biệt khi bạn đưa cho nó một wrapper thay vì đối tượng gốc.
- Một đối tượng có thể được bao bọc bởi nhiều wrapper cùng một lúc.
- Cho phép thêm hoặc xóa tính năng của một đối tượng lúc thực thi (run-time).

### 4. Sử dụng khi nào

- Khi muốn thêm tính năng mới cho các đối tượng mà không ảnh hưởng đến các đối tượng này.
- Khi không thể mở rộng một đối tượng bằng cách thừa kế (inheritance).

### 5. Ưu nhược điểm

- :white_check_mark: Bạn có thể mở rộng hành vi của đối tượng mà không cần tạo ra một subclass
- :white_check_mark: Bạn có thể thêm hoặc xoá hành vi khỏi đối tượng khi đang chạy.
- :white_check_mark: Bạn có thể kết hợp nhiều hành vi bằng cách bọc đối tượng trong nhiều decorator.
- :white_check_mark: Single Responsibility Principle. Bạn có thể chia một khối lớp thành nhiều hành vi cho các lớp con.
- :x: Gặp khó khi xoá một wrapper cụ thể khỏi ngăn xếp.
- :x: Gặp khó khi triển khai decorator nếu hành vi của nó không theo thứ tự trong ngăn xếp.
- :x: Code cấu hình ban đầu của lớp sẽ rất tệ.
