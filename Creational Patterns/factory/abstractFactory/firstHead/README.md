# Abstract Factory 
### 1. What is?
- The Abstract Factory cung cấp một interface có chức năng tạo ra một tập hợp các đối tượng liên quan hoặc phụ thuộc lẫn nhau mà không chỉ ra đó là những lớp cụ thể nào tại thời điểm thiết kế.
### 2. When to use?
- Sử dụng khi bạn code với nhiều tập hợp những đối tượng liên quan đến nhau, nhưng bạn không muốn phụ thuộc vào lớp cụ thể của nó. Nó có thể không được biết trước hoặc đơn giản bạn muốn dễ dàng mở rộng hơn trong trương lai
### 3. How to implement
- Vạch ra những loại `product` khác nhau và những biến thể của chúng
- Khai báo các abstract interface cho những loại `product` đó
- Khai báo abstract factory interface với tập hợp các phương thức khởi tạo cho tất cả các `product`
- Triển khai một tập hợp các lớp factory cụ thể. Mỗi lớp cho một biển thể
- Viết những đoạn code khởi đầu cho factory. Nó nên khởi tạo một thể hiện của một lớp factory cụ thể, dựa vào app config hay là môi trường trên máy tính của bạn. Truyền đối tượng factory này cho tất cả các lớp tạo sản phẩm.
- Tìm tất cả những phương thức gọi trực tiếp đến phương thức khởi tạo của product. Replace chúng bằng cách gọi đến các phương thức khởi tạo trên đối tượng factory phù hợp. 
### 4. Pros and Cons
- :white_check_mark: Bạn có thể chắc chắn rằng product bạn láy được từ factory là phụ hợp với những đối tượng cùng biến thể khác.
- :white_check_mark: Tránh được tight coupling giữa các lớp product cụ thể với client code.
- :white_check_mark: **Single Responsibility Principle** Bạn có thể trích xuất code khởi tạo đối tượng ở một nơi để có thể thay đổi dễ dàng hơn.
- :white_check_mark: **Open/Closed Principle** Bạn có thể dễ dàng thêm mới biến thể của product mà không làm thay đổi bất cứ dòng code nào ở client.
- :white_check_mark: cung cấp hướng tiếp cận với Interface thay thì các implement, che giấu sự phức tạp của việc khởi tạo các đối tượng với người dùng (client), độc lập giữa việc khởi tạo đối tượng và hệ thống sử dụng,..
- :white_check_mark: Giúp tránh được việc sử dụng điều kiện logic bên trong Factory Pattern. Khi một Factory Method lớn (có quá nhiều sử lý if-else hay switch-case), chúng ta nên sử dụng theo mô hình Abstract Factory để dễ quản lý hơn (cách phân chia có thể là gom nhóm các sub-class cùng loại vào một Factory).
:x: Code có thể trở nên phức tạp hơn vì có rất nhiều interface và class được xuất hiện bên trong pattern này.

:x: Code có thể trở nên phức tạp hơn vì có rất nhiều interface và class được xuất hiện bên trong pattern này.


#### Diagram
![abstracFactoryDiagram](https://user-images.githubusercontent.com/108172013/189492333-7aebfcf8-1cca-4770-866e-ea0b3c0b06c6.png)

