# Strategy Design pattern

- Strategy Design pattern hiểu một cách đơn giản thì đây là mẫu thiết kế giúp bạn trừu tượng hóa những hành vi (behavior, method, function) của một đối tượng bằng cách đưa ra những cài đặt vào những lớp khác nhau.
- Ý nghĩa thực sự của mẫu Strategy là bạn tách rời phần xử lý một chức năng cụ thể ra khỏi đối tượng của bạn. Sau đó tạo ra một tập hợp các thuật toán để xử lý chức năng đó và lựa chọn thuật toán nào mà bạn thấy đúng đắn nhất khi thực thi chương trình. Mẫu thiết kế này thường được sử dụng để thay thế cho sự kế thừa, khi bạn muốn chấm dứt việc theo dõi và chỉnh sửa một chức năng qua nhiều lớp con.

### Applicability

- Sử dụng khi bạn muốn dùng một trong những biến thể của thuật toán đó trong một đối tượng và muốn chuyển đổi chúng trong runtime.
- Sử dụng khi bạn có một loạt các class liên quan nhưng chúng chỉ khác nhau ở cách thực thi một vài hành động.
- Khi muốn tách những logic nghiệp vụ của một lớp ra khỏi những triển khai chi tiết của thuật toán có thể không quan trọng trong ngữ cảnh của logic đó.
- Khi mà class có một câu lệnh điều kiện có nhiều chuyển đổi giữa các biến thể khác nhau của một thuật toán.
- Bạn có một đoạn code dễ thay đổi, và bạn tách chúng ra khỏi chương trình chính để dễ dàng bảo trì
- Bạn muốn tránh sự rắc rối, khi phải hiện thực một chức năng nào đó qua quá nhiều lớp con.
- Bạn muốn thay đổi thuật toán sử dụng khi chạy chương trình

#### Structure
1. Strategy (Chiến lược): Giao diện hoặc lớp trừu tượng định nghĩa các phương thức mà các thuật toán cụ thể phải triển khai.
    execute(data): Phương thức để thực hiện thuật toán.
2. ConcreteStrategy (Chiến lược cụ thể): Các lớp triển khai cụ thể của Strategy, cài đặt các thuật toán khác nhau.
    Triển khai phương thức execute(data).
3. Context (Ngữ cảnh): Lớp sử dụng Strategy, chứa một tham chiếu đến một đối tượng Strategy. Context không biết chi tiết cụ thể về các thuật toán, chỉ biết cách sử dụng chúng thông qua giao diện Strategy.
  set_strategy(strategy: Strategy): Phương thức để đặt chiến lược hiện tại.
  do_something(data): Phương thức để thực hiện công việc với chiến lược hiện tại.

### How to implement

1. Trong context class, xác định thuật toán mà dễ dàng hay thường xuyên bị thay đổi.Nó cùng có thể là một khối lệnh điều kiện để chọn và thực thi biến thể của một thuật toán tại runtime.
2. Khai báo một statery interface cho tất cả các biển thể của thuật toán đó.
3. Tạo từng class cho từng biến thể của thuật toán đó và implement tất cả các interface đã khai báo ở bước 2.
4. Tại context class, tạo một trường giá trị để tham chiếu đến đối tượng stratery. Cung cấp setter để thay thế giá trị của trường đó. Trong context class đó chỉ nên tương tác thông qua stratery interface. Context có thể định nghĩa interface đó để cho phép stratery truy cập data.
5. Phía client của phải tương tác với stratery phù hợp để context có thể làm việc đúng theo cách họ mong đợi.

### Pros

- Có thể thay đổi thuật toán đang dùng bên trong đối tượng trong runtime.
- Bạn có thể tách biệt chi tiết cách thực thi của thuật toán ra khỏi code nơi đang dùng nó.
- Open/Closed Principle. Bạn có thể thêm thuật toán mới mà không làm thay đổi code ở phía client.

### Cons

- Nếu bạn có một vài thuật toán mà nó rất ít khi thay đổi thì không có lý do gì để làm phức tạp vấn đề bằng cách thêm các lớp hay các interface cho giống như pattern này.
- Phía client phải hiểu được sự khác nhau giữa các strategy để có thể sử dụng nó sao cho phù hợp.

#### Diagram

![strategyDiagram](https://github.com/duclongdev/Design-Patterns/blob/main/Behavioral%20Patterns/strategy/Stategy.png)

#### Reference

[refactoring.guru](https://refactoring.guru/design-patterns/strategy)
[viblo.asia](https://viblo.asia/p/tim-hieu-strategy-pattern-znmMdy7YGr69)
