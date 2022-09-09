# Factory method
### What is?
- Factory method là một creational design pattern. Cung cấp một interface cho việc khởi tạo đối tượng trong lớp cha, nó cũng cho phép lớp con thay đổi kiểu mà đối tượng được tạo ra.
- Strong FM, chúng ta tạo ra đối tượng mà không cần phơi bày creation logic cho client code và ở phía clinet code chỉ cần dùng interface chung để tạo ra đối tượng
### When to use
#### 1. Khi bạn không biết trước kiểu đối tượng mà bạn sẽ sử dụng
- Factory method tách construction code của đối tượng cần khỏi tạo khỏi client code. Vì vậy rất dễ dàng để mở rộng construction code mà không ảnh hưởng đến client code.
  - Ví dụ: Khi ta cần thêm một đối tượng mới chỉ cần tạo ra lớp đó và override lớp creator. 
#### 2.Sử dụng Factory Method khi bạn muốn cung cấp cho người dùng các thư viện hay library của bạn cách để extend các thành phần bên trong của nó
#### 3. Sử dụng Factory Method khi bạn muốn tiết kiệm tài nguyên bằng cách sử dụng lại các đối tượng đang có thay vì phải tạo mới lại mỗi lần
