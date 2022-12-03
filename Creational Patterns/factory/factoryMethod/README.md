# Factory method

### 1. What is?

- Factory method cung cấp một interface cho việc khởi tạo đối tượng trong lớp cha, nó cho phép lớp con thay đổi kiểu mà đối tượng được tạo ra.
- Strong FM, chúng ta tạo ra đối tượng mà không cần phơi bày creation logic cho client code và ở phía clinet code chỉ cần dùng interface chung để tạo ra đối tượng

### 2. When to use

#### 2.1. Sử dụng Factory Method khi bạn không biết trước kiểu và các phụ thuộc của object mà code sẽ làm việc với nó.

- Factory method tách construction code của đối tượng cần khỏi tạo khỏi client code. Vì vậy rất dễ dàng để mở rộng construction code mà không ảnh hưởng đến client code.
- Ví dụ: Khi ta cần thêm một đối tượng mới chỉ cần tạo ra lớp đó và override lớp creator.

#### 2.2.Sử dụng Factory Method khi bạn muốn cung cấp cho người dùng các thư viện hay library của bạn cách để extend các thành phần bên trong của nó

#### 2.3. Sử dụng Factory Method khi bạn muốn tiết kiệm tài nguyên bằng cách sử dụng lại các đối tượng đang có thay vì phải tạo mới lại mỗi lần

### 3. How to implement

1. Khởi tạo một interface cho tất cả các product. Interface này nên khai báo những phương thức có nghĩa cho các products.
2. Thêm một factory method trống bên trong lớp creator. Kiểu trả về của phương thức này phải đúng kiểu với interface mà các product đã implement.
3. Trong code creator tìm tất cả tham chiếu đến hàm khởi tạo product. Từng cái một, thay thế nó với lệnh gọi phương thức factory, trong khi trích xuất product creation vào phương thức factory.
4. Tạo một tập hợp các lớp con của creator cho mỗi product. Override the factory method trong lớp con

#### 4. Pros and Cons

- Tránh được liên kết chặt chẽ giữa lớp creator và lớp product cụ thể.
- **Single Responsibility Principle**. Bạn có thể di chuyển mã creator product vào một nơi trong chương trình,giúp mã hỗ trợ dễ dà ng hơn.
- **Open/Closed Principle.** Bạn có thể tạo ra một loại mới của product mà không ảnh hưởng đến code tại client.

### Diagram
