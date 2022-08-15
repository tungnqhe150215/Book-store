
CREATE TABLE Publisher(
ID INT IDENTITY(1,1) PRIMARY KEY, 
NAME NVARCHAR(MAX),
)

CREATE TABLE ACCOUNT(
username VARCHAR(20) PRIMARY KEY,
password VARCHAR(20),
userlevel TINYINT
)

CREATE TABLE CUSTOMER(
ID INT IDENTITY(1,1) PRIMARY KEY,
Name NVARCHAR(MAX),
Gender NVARCHAR(5),
Phone VARCHAR(10),
Email VARCHAR(30),
Address NVARCHAR(MAX),
accname VARCHAR(20) FOREIGN KEY REFERENCES dbo.ACCOUNT(username),
)

CREATE TABLE SELLER(
ID INT IDENTITY(1,1) PRIMARY KEY,
Name NVARCHAR(MAX),
Phone VARCHAR(10),
Email VARCHAR(30),
PlaceofReceipt NVARCHAR(MAX),
accname VARCHAR(20) FOREIGN KEY REFERENCES dbo.ACCOUNT(username)
)

CREATE TABLE COVER(
ID INT IDENTITY(1,1) PRIMARY KEY,
Name NVARCHAR(MAX)
)

CREATE TABLE AUTHOR(
ID INT IDENTITY(1,1) PRIMARY KEY,
Name VARCHAR(30)
)

CREATE TABLE BOOK(
ID INT IDENTITY(1,1) PRIMARY KEY,
Name NVARCHAR(MAX),
Images NVARCHAR(MAX),
NXB INT FOREIGN KEY REFERENCES dbo.Publisher(ID),
PublicationDate DATE,
Author INT FOREIGN KEY REFERENCES dbo.AUTHOR(ID),
Seller INT FOREIGN KEY REFERENCES dbo.SELLER(ID),
Size VARCHAR(10),
TypeofCover INT FOREIGN KEY REFERENCES dbo.COVER(ID),
Description NVARCHAR(MAX),
UnitPrice MONEY,
UnitInStock TINYINT,
Discount FLOAT
)

CREATE TABLE Orders(
OrderID INT IDENTITY(1,1) PRIMARY KEY,
CustomerID INT FOREIGN KEY REFERENCES dbo.CUSTOMER,
Address NVARCHAR(max),
OrderDate DATE,
ShippedDate DATE,
)

CREATE TABLE OrderDetail(
OrderID INT FOREIGN KEY REFERENCES dbo.Orders(OrderID),
BookID INT FOREIGN KEY REFERENCES dbo.BOOK(ID),
Quantity SMALLINT,
Total MONEY
)

CREATE TABLE status(
ID INT PRIMARY KEY,
Name NVARCHAR(20)
)

CREATE TABLE shoppingcart(
CustomerID INT FOREIGN KEY REFERENCES dbo.CUSTOMER(ID),
bookID INT FOREIGN KEY REFERENCES dbo.BOOK(ID),
quantity SMALLINT,
PRIMARY KEY(CustomerID,bookID)
)

ALTER TABLE dbo.Orders
add status INT FOREIGN KEY REFERENCES dbo.status(ID) 
GO 

INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'fahasa','123456', 2 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'tritueviet','123456', 2 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'phuongdong','123456', 2 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'alphabook','123456', 2 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'ahabook','123456', 2 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'admin1','123456', 3 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'admin2','123456', 3 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'admin3','123456', 3 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'customer1','123456', 1 )
INSERT INTO dbo.ACCOUNT(username,password,userlevel)VALUES(   'customer2','123456', 1 )


INSERT INTO dbo.Publisher(NAME)VALUES( N'AMAK')
INSERT INTO dbo.Publisher(NAME)VALUES( N'IPM')
INSERT INTO dbo.Publisher(NAME)VALUES( N'AZ Việt Nam')
INSERT INTO dbo.Publisher(NAME)VALUES( N'NXB Kim Đồng')

INSERT INTO dbo.SELLER(Name,Phone,Email,PlaceofReceipt,accname)VALUES(   N'Nhà sách FaHaSa', '0123456789', 'fahasa@gmail.com',N'Số 3 Nguyễn Chí Thanh Hà Nội', 'fahasa')
INSERT INTO dbo.SELLER(Name,Phone,Email,PlaceofReceipt,accname)VALUES(   N'Bookstore Trí Tuệ Việt', '0111203040', 'tritueviet@gmail.com',N'Số 10 Trần Quốc Toản Hà Nội', 'tritueviet')
INSERT INTO dbo.SELLER(Name,Phone,Email,PlaceofReceipt,accname)VALUES(   N'Phương Đông', '0376633663', 'phuongdong@gmail.com',N'Số 2 Trần Nhật Duật Hà Nội', 'phuongdong')
INSERT INTO dbo.SELLER(Name,Phone,Email,PlaceofReceipt,accname)VALUES(   N'Alphabook', '0987654321', 'alphabook@gmail.com',N'Số 10 Thái Hà Hà Nội', 'alphabook')
INSERT INTO dbo.SELLER(Name,Phone,Email,PlaceofReceipt,accname)VALUES(   N'Ahabook', '0999988877', 'ahabook@gmail.com',N'Số 11 Trần Nhân Tông Hà Nội', 'ahabook')

INSERT INTO dbo.COVER(Name)VALUES(N'Bìa Cứng')
INSERT INTO dbo.COVER(Name)VALUES(N'Bìa Mềm')
INSERT INTO dbo.COVER(Name)VALUES(N'Bìa Gập')

INSERT INTO dbo.AUTHOR(Name)VALUES('Tappei Nagatsuki')
INSERT INTO dbo.AUTHOR(Name)VALUES('Koushi Tachibana')
INSERT INTO dbo.AUTHOR(Name)VALUES('Reki Kawahara')
INSERT INTO dbo.AUTHOR(Name)VALUES('Shirakome Ryo')
INSERT INTO dbo.AUTHOR(Name)VALUES('Patora Fuyuhara')
INSERT INTO dbo.AUTHOR(Name)VALUES('Gen Orobuchi')

INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Re:zero 3', 'ln/Rz3.jpg',2,'2018-01-01', 1,2,'13x18cm',2,N'Subaru hạ quyết tâm quay lại với dinh thự Roswaal. Vào ngày đầu tiên ở đó, trước bao kí ức luân hồi đang trải ra, cậu muốn chọn cách tốt nhất để tránh được thảm kịch, nhưng trái tim cứ bị gặm nhấm bởi nỗi sợ hãi và sức ép về thất bại. Đúng lúc tinh thần Subaru sắp suy sụp thì Emilia nở nụ cười giống như lần đầu tiên “Chết để quay lại”, chìa tay về phía cậu…

“Chúng ta cùng mỉm cười sánh vai bước, nói chuyện về tương lai, chuyện về ngày mai đi.”

Mời các bạn tiếp tục đọc tập 3 bộ truyện rất được yêu thích này, với phần nội dung đang lên cao trào!',95000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Re:zero 4', 'ln/Rz4.jpg',2,'2018-03-21', 1,2,'13x18cm',2,N'Sau khi thoát khỏi vòng lặp tử vong tại dinh thự, Subaru trở lại với tháng ngày bình yên. Nhưng rồi sứ giả đến thông báo về cuộc tuyển chọn quốc vương, cậu tạm biệt khoảng thời gian nghỉ ngơi ngắn ngủi, cùng Emilia quay lại vương đô, nơi khởi đầu của mọi chuyện. Ở đây, cậu tìm gặp những người quen cũ, ôn kỉ niệm xưa, lòng sục sôi quyết tâm cho cuộc tuyển chọn. Nhưng Emilia kiên quyết từ chối mong muốn hỗ trợ của cậu.

Cảm xúc bất đồng tạo nên xích mích, dẫn tới những cuộc gặp gỡ mới chốn vương đô. Subaru tất tả ngược xuôi với bộn bề tình cảm dành cho Emilia…

“Nếu Emilia cần một hiệp sĩ bên mình, tôi sẽ làm. Tôi sẽ giúp cô ấy trở thành quốc vương!”

Cuốn tiểu thuyết mạng cực kì nổi tiếng bắt đầu bước sang phần mới!

Cảm xúc không thể truyền tải tới đối phương, ngôn từ chẳng đủ bộc lộ, Subaru sẽ ra sao…?',95000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Re:zero 5', 'ln/Rz5.jpg',2,'2018-05-21', 1,2,'13x18cm',2,N'“Đủ rồi… Natsuki Subaru.” Đã ba ngày trôi qua kể từ cuộc chia ly nghiệt ngã với Emilia. Trốn tránh tại dinh thự của Crusch, được Rem nuông chiều, tinh thần Subaru dần mục rữa. Cậu đang trăn trở về cách sống của mình thì hay tin Emilia gặp khó khăn.

“Đúng thế… Không có mình là hỏng bét. Nhất định là vậy.”

“Mình sẽ cứu Emilia để chứng minh giá trị bản thân.” Mặc cho những người xung quanh can ngăn, Subaru mang suy nghĩ đen tối ấy thẳng tiến đến dinh thự Roswaal. Nhưng khi về tới nơi thân thương ngày nào, Subaru phải đối mặt với “cái ác” thực sự…

Nỗi tuyệt vọng và cái chết đang cận kề trong tập 5 đầy kích động và sóng gió.',95000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Re:zero 6', 'ln/Rz6.jpg',2,'2018-07-21', 1,2,'13x18cm',2,N'Sau khi chết vì giá buốt trước ma thú của đất băng vĩnh cửu, Subaru sống lại, thề trả thù Giám mục Tội lỗi Petelgeuse.

Để đánh lui Giáo phái Phù thủy và cứu Emilia, cậu bôn ba khắp nơi tìm cứu viện, nhưng các ứng cử viên cho vị trí quốc vương đều coi cậu là ấu trĩ và chẳng buồn đáp ứng.

Giữa lúc Subaru bị mọi người ruồng bỏ, thân cô thế cô thì bánh răng số phận của cậu lại một lần nữa vận hành…

“Tôi… tôi căm ghét chính bản thân mình!”

Khi thốt lên não nuột, than thở cho sự yếu đuối của bản thân, Subaru cũng chính thức bắt đầu cuộc sống của mình ở thế giới khác này.

Tập 6, tập trung vào vùng dậy và phản kích, dẫn đến bước ngoặt cho một sự tích anh hùng mới!',95000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Date a live Tập 1', 'ln/dal1.jpg',2,'2017-01-01', 2,3,'13x18cm',2,N'Ngày đầu tiên đi học sau kỳ nghỉ xuân, Itsuka Shido được em gái dễ thương của mình đánh thức như mọi khi. Nhưng cậu không biết rằng hôm nay là ngày mà định mệnh cậu thay đổi chỉ bởi một cuộc gặp gỡ tình cờ với một cô gái vô danh...

Cùng với một cơn địa chấn đột ngột, một phần của thị trấn đã biến mất mà không để lại dấu vết gì. Tại góc thành phố đã lún sâu thành hố khổng lồ xuất hiện một thiếu nữ.

"Cậu cũng đến để giết tôi ư?"

Cô ấy là tai họa sẽ hủy diệt nhân loại, là một con quái vật không rõ nguồn gốc, và là một sinh linh bị ruồng bỏ. Chỉ có hai cách để ngăn chặn cô gái này: tiêu diệt hoặc nói chuyện. 

"Vì thế, hãy hẹn hò và khiến cô ta yêu anh đi!"

Nhờ sự giúp đỡ của Kotori, em gái mình, Shido sẽ giải cứu cô gái ấy và cả nhân loại bằng cách sử dụng "mỹ nam kế" - làm cô yêu cậu say đắm??!!! Là phúc hay họa đây?!! 

Một thế giới mới cùng những mối quan hệ lãng mạn xin được phép bắt đầu!',100000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Date a live Tập 2', 'ln/dal2.jpg',2,'2017-07-01', 2,3,'13x18cm',2,N'Kể từ khi Tohka chuyển đến trường cấp ba nơi Itsuka Shidou đang theo học, ngày nào cũng thấy cô chí chóe với cô bạn cùng lớp của Shidou là Origami và cứ mỗi lần như vậy, Shidou lại phải chen vào ngăn cản hai người. Thế rồi vào một ngày mưa, cậu bỗng chạm trán Tinh linh thứ hai trên đường đi học về. Một thiếu nữ nhỏ nhắn, tay trái mang một con rối bông hình thỏ đang tung tăng chạy giữa đường mà không buồn giương ô để rồi hụt chân ngã sõng soài.
 
Khi Shidou chạy đến định đỡ cô bé dậy, cô đáp lại cậu với vẻ sợ sệt. “Xin đừ làm đau ” Bị cả thế giới phủ nhận, thậm chí cự tuyệt và không biết bao nhiêu lần bị truy sát. Dù vậy, cô bé vẫn cố gắng chịu đựng, làm sao để sự tồn tại của mình không gây tổn thương cho người khác. Đó là một Tinh linh nhân hậu hơn bất cứ ai - Yoshino. Hãy giúp anh, Kotori. Anh nhất đị phải cứu cô bé ấ!” Để ngăn cản thiếu nữ sở hữu năng lực có thể hủy diệt cả thế giới ấy, Shidou sẽ phải hẹn hò và khiến cô bé mở lòng với mình!?',100000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Date a live Tập 3', 'ln/dal3.jpg',2,'2017-12-01', 2,3,'13x18cm',2,N'“Mình là một tinh linh”

Lời giới thiệu từ cô gái mới chuyển trường Kurumi. Cô ấy thì thầm, khẽ nở một nụ cười với Shidou khi nhờ cậu dẫn đi thăm thú ngôi trường mới này.

“Mình có việc muốn nhờ Shidou. Cậu có thể nghe mình nói không?”

Một  cô gái là hiện thân cho thảm họa hủy diệt thế giới, một Tinh linh tàn bạo mang đầy sát ý và lấy việc giết người là thú vui

“Tinh linh xuất hiện rồi ư? Vậy chỉ còn cách giết chúng thôi”

Và sự xuất hiện cô gái chuyên săn Tinh linh Mana

Cuộc đối đầu giữa hai thiếu nữ chuyên giết người và giết hại tinh linh sẽ ra sao? Cách để vượt qua cơn ác mộng này là hẹn hò và khiến các cô gái rơi vào lưới tình!?',100000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Date a live Tập 4', 'ln/dal4.jpg',2,'2018-03-01', 2,3,'13x18cm',2,N'Dù đã nói sẽ cứu Tinh linh tồi tệ nhất – Kurumi và Mana, nhưng cuối cùng Shidou vẫn không thể làm được gì.

Có lẽ mọi chuyện đã kết thúc nếu Itsuka Kotori không xuất hiện.

“Từ năm năm về trước…Em đã trở thành Tinh linh, khả năng hồi phục của Shidou vốn dĩ là sức mạnh của em”

Sự thật được Kotori tiết lộ. Về việc cô ấy trở thành Tinh linh, lần đầu tiên phong ấn Tinh linh Shidou và bố mẹ của Origami bị Tinh linh sát hại năm năm về trước như thế nào.

“Hôm nay, em sẽ không còn là chính em nữa và trước lúc đó, em muốn hẹn hò với anh hai”

Thời gian chỉ giới hạn trong một ngày. Để cứu cô em gái đáng yêu cũng như vị chỉ huy kiên định và lạnh lùng, hãy hẹn hò và cưa đổ anh ấy. ',100000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Swort art online tập 18', 'ln/sao18.jpg',2,'2021-01-25', 3,2,'13x18cm',2,N'Ngày thứ hai của giai đoạn thực nghiệm phụ tải cuối ở Underworld.

Kirito rơi vào tay chỉ huy quân đỏ. Giữa lúc ngã quỵ dưới đất, cậu chợt nghe vang lên tiếng gọi. Tiếng gọi của người bạn thân từng kề vai chiến đấu, từng vui cười với cậu…

Cũng là chất giọng đẹp đẽ chỉ có một trên đời.

Gọi cậu thức tỉnh, để cứu lấy sự sống ở Underworld.

SWORD ART ONLINE 018, đúng như tên phụ của nó “Lasting”, là tập khép lại arc Alicization rất dài, và khép lại theo cách đẹp đẽ nhất, cũng bề thế và hứa hẹn nhất.

Sự trưởng thành của Kirito đến đây rõ ràng và tỏa sáng hơn bao giờ hết. Từ một cậu bé đôi chút vị kỉ, thu mình ở tập đầu, Kirito giờ đã là một người đầy đủ ý thức về mọi hành động của mình. Từ một người sẵn sàng rụt lại khi thấy ai định làm thân, giờ quanh cậu đã có rất nhiều người để yêu thương và yêu thương cậu. Tuy đời thực của cậu đã ngưng đọng không chỉ một lần trong thế giới ảo, nhưng Kirito chưa từng để phí một giây nào cho sự trưởng thành, không chỉ qua bề ngoài mà còn cả tính cách. Càng tuyệt vời hơn khi Kawahara uyển chuyển đem sự trưởng thành của cá nhân này lồng vào không gian trưởng thành chung của xã hội, từ ý thức đến văn minh nhân loại, được điển hình hóa qua sự biến chuyển công nghệ suốt chiều dài câu chuyện, từ một trò chơi trực tuyến tiến đến thực tế ảo của tương lai.

Tuy khép lại, nhưng chưa dừng lại. Kirito will return …',125000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Swort art online tập 17', 'ln/sao17.jpg',2,'2020-09-25', 3,2,'13x18cm',2,N'Dù có phải hi sinh toàn bộ quân đoàn Bóng tối, cũng phải chiếm cho bằng được Vu nữ Ánh sáng Alice.

Ngày thứ hai của thực nghiệm phụ tải cuối

Yếu thế trước tinh thần chiến đấu liều mạng của Hiệp sĩ Chỉnh hợp, quân Dark Territory bắt đầu phản kháng bằng kế sách hèn hạ. Từ bên ngoài, Critter đã đưa nhiều người từ thế giới thực vào trận quyết chiến sau cùng. Số lượng tester cho một "game VRMMO chính thống” như lời bọn họ quảng bá, đã vượt hơn 50.000 người.

Quân đoàn Bóng tối được tăng viện khiến quân Nhân giới lâm vào đường cùng.

Một mình Asuna không thể đập tan hết bọn chúng. Bất ngờ, các vị thần sáng thế trong truyền thuyết giáng xuống Underworld, gồm thần mặt trời Solus rạng ngời sắc trắng và thần mặt đất Terraria hiền từ ấm áp. Hai vị thần ấy mang hình dáng Sinon và Leafa.',125000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Swort art online tập 16', 'ln/sao16.jpg',2,'2020-01-25', 3,2,'13x18cm',2,N'Dời trọng tâm khỏi kiếm kĩ, theo đuổi lý luận về tâm ý, không có anh hùng cứu mỹ nhân, Eugeo rời sân quá sớm, cách xây dựng Alice… là vài trong số nhiều chủ đề hay được bàn luận trái chiều về arc Alicization.

Nhưng mà sau tất cả, không thể phủ nhận đây là một phần truyện giàu sức tưởng tượng, diễn giải tâm huyết, nội dung sâu rộng, và ấp ủ cả hi vọng của tác giả dù không viết rõ ra.

Alicization trải ra với chiều dài đầu tư chưa từng thấy trong cả bộ, phải chăng ở đây mới ẩn chứa thứ “sword art” thực sự của Kawahara?
Nếu có thì thứ “Sword art” ấy mang hình hài nào?

Không khó nhận ra, đó là tâm ý. Cái mà trong giới tu tập võ nghệ người ta gọi là vô chiêu thắng hữu chiêu, kiếm ý hơn kiếm kĩ.
Tâm ý này được thể hiện rất trực quan trong Vol. 16, qua trận chiến dữ dội mà ngày sau người ta gọi là Đại chiến Underworld. Ở đây sẽ có quyền đấu sĩ dùng thịt da chấn gãy binh khí, có người khổng lồ dùng năng lượng căm thù trấn áp kiếm pháp siêu quần của hiệp sĩ, và nhất là có trí tuệ con người ẩn trong hình dạng á nhân bắt đầu vượt lên thân xác tầm thường để kiếm tìm tự do tồn tại…

Đằng sau khung cảnh chiến trận dữ dội ấy là một Kirito vẫn trầm cảm ngồi trên xe lăn, nhưng khát khao bảo vệ con người tỏa ra từ trái tim cậu đang tiếp sức và kêu gọi rất nhiều bạn bè người quen tìm đến, tiếp tục sứ mệnh cậu đang làm dở.

Trong đó tất nhiên không thể thiếu Asuna, đăng nhập vào UW bằng siêu tài khoản nữ thần sáng thế…',125000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Swort art online tập 15', 'ln/sao15.jpg',2,'2019-07-01', 3,2,'13x18cm',2,N'“Kirito, cho tớ biết, tớ phải làm sao mới được đây?”
Cái giá phải trả của việc đánh bại tư tế tối cao Administrator, là cái chết của Eugeo, và trạng thái tinh thần suy sụp của Kirito.
Đã nửa năm trôi qua từ trận chiến tàn khốc ấy.
Alice đưa Kirito về lại làng Rulid. Bấy giờ cậu đã không còn ý chí gì nữa, vẻ mặt thì trống rỗng, người lại ngồi trên xe lăn.
Tra trả nhiệm vụ bảo vệ Nhân giới cho Bercouli, Alice chọn lựa sống đời yên ả cùng Kirito. Nhưng giai đoạn phụ tải cuối, như nhà hiền triết Cardinal tiên đoán, đang từng bước áp sát…
Bầu không khí tà ác từ Vương quốc Bóng tối bắt đầu tràn sang Nhân giới. Quân đoàn Bóng tối khủng khiếp cuối cùng cũng đã rục rịch hành động.',125000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Swort art online tập 14', 'ln/sao14.jpg',2,'2019-01-25', 3,2,'13x18cm',2,N'Tòa tháp trắng Central Cathedral tượng trưng cho Giáo hội Công lý.

Nhờ sự giúp đỡ của Cardinal, nhà hiền triết bị cách li trong tàng thư các, Eugeo và Kirito bắt đầu hành trình lên tầng 100, tầng cao nhất của Cathedral, nơi ở của tư tế tối cao Administrator.

Mục đích của Eugeo là lấy lại “nguyên bản” cho Alice, nay đã bị biến thành Hiệp sĩ Chỉnh hợp, còn mục đích của Kirito là để cứu rỗi Underworld khỏi sự diệt vong.

Họ đã đến tầng 99.

Xuất hiện trước mắt Kirito và Alice lại là Eugeo. Nhưng là một Eugeo mặc giáp Hiệp sĩ Chỉnh hợp và đôi mắt lóe lên lạnh giá.

Eugeo phũ phàng vung kiếm, Kirito bất đắc dĩ phải đánh trả.

Lẽ nào điềm báo về trận chiến và li biệt mà cậu cảm nhận được trong tiếng sấm xa xăm vào ngày đầu khởi hành khỏi làng đã thành sự thật? Tiếng gọi thiết tha của Kirito liệu có lay chuyển được một Eugeo đã bị phong ấn kí ức?

Alicization, phần “Nhân giới”, kết thúc!',125000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Arifureta tập 1', 'ln/ari1.jpg',1,'2019-02-10', 4,5,'13x18cm',1,N'Hajime, nạn nhân bị bắt nạt và các bạn cùng lớp bị triệu hồi đến một thế giới khác. Trái ngược với chúng bạn có khả năng chiến đấu siêu cường như hack game, Hajime chỉ có năng lực rất đỗi bình thường, đó chính là khả năng biến đổi. Đến thế giới khác rồi mà Hajime vẫn chỉ là người yếu nhất. Vì thế một người bạn cùng lớp ác ý đã khiến cậu rơi xuống đáy vực thẳm.

Bên bờ vực của sự tuyệt vọng, khi không còn cách nào thoát thân, Hajime tìm ra con đường để trở thành người mạnh nhất với tư cách một biến đổi sư. Lúc đó, cuộc gặp gỡ định mệnh giữa cậu và ma cà rồng tên Yue cũng diễn ra…

“Tôi sẽ bảo vệ Yue, Yue cũng sẽ bảo vệ tôi. Chúng ta sẽ trở thành người mạnh nhất, chinh phạt tất cả và rời khỏi thế giới này.”

Câu chuyện viễn tưởng “mạnh mẽ nhất” của thiếu niên rơi xuống địa ngục và ma cà rồng ở nơi sâu thẳm ấy bắt đầu!',150000,75,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Arifureta tập 2', 'ln/ari2.jpg',1,'2019-08-10', 4,5,'13x18cm',1,N'Nagumo Hajime, người được triệu tập đến thế giới khác cùng các bạn học, đã gặp gỡ Yue tại đáy vực thẳm của Đại Mê Cung Orcus, và trở lại mặt đất. Lâu lắm Hajime và Yue mới lại được tận hưởng bầu không khí trên mặt đất, nhưng lại bị Shea Haulia, cô gái người thỏ đang bị lũ ma vật săn đuổi yêu cầu giúp đỡ. Bằng năng lực nhìn trước tương lai, Shea đã thấy cảnh Hajime giải cứu toàn gia tộc cô khỏi hiểm nguy, nên cô tìm kiếm cậu tại Vực thẳm Reisen. Hajime lưỡng lự, nhưng nhỡ lời cầu khẩn ấy liên quan tới việc băng qua Bảy Đại Mê cung để tìm kiếm manh mối quay trở về thế giới ban đầu thì sao---!?

“Thật may khi tôi là một ma vật. Nhờ vậy mà tôi có thể đi cùng các bạn.”

Một thế giới huyền diệu tự hào với hơn 100 triệu lượt xem video quảng cáo nay đã ra mắt tập 2!',150000,75,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Arifureta tập 3', 'ln/ari3.jpg',1,'2020-05-10', 4,5,'13x18cm',1,N'Sau khi chinh phục thành công Đại mê cung Reisen, Nagumo Hajime đã cho phép Shea trở thành bạn đồng hành của mình, ba người cùng di chuyển đến thành phố thương mại trung lập Fuhren. Khi được Hội nhà thám hiểm nhờ tìm kiếm người mất tích, Hajime đã chấp nhận cùng các điều kiện đi kèm. Tại thị trấn gần với địa điểm tìm kiếm, một cuộc hội ngộ không tưởng đã diễn

Trong quá trình tìm kiếm, một con rồng đen với sức mạnh khổng lồ đã xuất hiện trước họ. Tuy nhiên bằng sức mạnh áp đảo, hội Hajime đã chiến thắng. Hơn nữa kẻ địch của họ chính là một tuyệt sắc giai nhân có tên Tio thuộc Long nhân tộc!

“Từ giờ tiểu nữ xin phép được gọi ngài là ‘Chủ nhân’ và nguyện hiến dâng tất cả cho ngài!”

Những ai đang bị cuốn hút bởi lòng quyết tâm trở thành kẻ “bất khả chiến bại”, chào mừng đến với dị giới của sự “bất khả chiến bại” trong tập 3!',150000,75,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Arifureta tập 4', 'ln/ari4.jpg',1,'2020-12-12', 4,5,'13x18cm',1,N'Dù hiểu nhầm vẫn còn đó nhưng Hajime cùng những cô gái đồng hành đã quyết định từ biệt đội Dũng sĩ và quay lại Thị trấn thương mại Fuhren. Sau khi nhóm Yue có được bảng trạng thái từ Hội nhà thám hiểm, Hajime quyết định tạm thời nghỉ chân tại thị trấn này. Một phần muốn cảm ơn Shea vì đã cứu Aiko nên Hajime đã cùng Shea đi hẹn hò tại khu phố du lịch của Fuhren. Thế nhưng tại đây, Hajime lại bị cuốn vào rắc rối. Kết quả là sau khi giao chiến kịch liệt với một tổ chức ngầm, Hajime đã cứu được một bé gái thuộc Hải nhân tộc mang tên Myu… Tuy nhiên…!?

“Em có thể ngừng gọi ta là ‘anh trai’ được không?”

“… Vậy thì, PAPA!”

Thiếu niên bất khả chiến bại Hajime đã trở thành papa của một bé gái rồi sao?

Hãy cùng đón đọc tập 4 của bộ truyện viễn tưởng dị giới “BẤT KHẢ CHIẾN BẠI” nhé!',150000,75,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Đến thế giới mới với smartphone tập 1', 'ln/sm1.jpg',1,'2019-01-07', 5,3,'13x18cm',2,N'Câu chuyện phiêu lưu kì ảo đến một thế giới khác cùng điện thoại thông minh!

Do sự nhầm lẫn của Thượng Đế, Mochizuki Touya đã mất đi mạng sống và được hồi sinh đến một thế giới khác để bắt đầu cuộc sống mới. Thượng Đế ban cho cậu một thân thể đã được cường hóa, đồng thời cậu vẫn có thể sử dụng chiếc điện thoại thông minh của mình tại nơi này. Với bản tính lương thiện, trong khi gặp gỡ nhiều người, kết thêm những người bạn tốt, nhân vật chính đã vô tình phát hiện ra bí mật của thế giới mới. Kế thừa di sản của nền văn minh Trung Cổ, kết hợp sức mạnh cùng vị vua của thế giới này, bằng sự lạc quan của mình, cậu chu du khắp thế gian...',100000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Đến thế giới mới với smartphone tập 2', 'ln/sm2.jpg',1,'2019-06-07', 5,3,'13x18cm',2,N'Chuyến phiêu lưu tiếp theo là đất nước của Á nhân!

Touya nhận một căn nhà ở khu trung tâm kinh đô làm thù lao cho việc cứu Đức vua của Belfast, đồng thời dần chấp nhận chuyện đính hôn với Yumina. Đức vua đã công nhận năng lực và nhân cách của Touya, lần này cậu được chọn làm mật thám tới đất nước Á nhân Mismede. Tuy gánh vác trọng trách là một sứ giả quan trọng, nhưng trên đường đi cậu vẫn cứu người, chế tác vật dụng và khá thờ ơ với chuyến hành trình tới Mismede. Touya chế tạo ra "súng", "xe đạp" và cả "cờ shogi" nữa sao?!

Các bạn hãy đón đọc tập 2 của chuyến phiêu lưu kì ảo đang nhận được sự yêu thích đặc biệt này nhé!',100000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Đến thế giới mới với smartphone tập 3', 'ln/sm3.jpg',1,'2019-11-07', 5,3,'13x18cm',2,N'Ở tập trước cậu thiếu niên bị cướp đi sự sống do sai lầm của thượng đế đã được hồi sinh ở một thế giới khác. Thế giới mà cậu được đưa đến, cậu đã được ban cho năng lực có thể cảm nhận được ma pháp và một chiếc smartphone có thể sử dụng đầy quyền lực. Những hành trình đến vùng đất mới, cùng với những khó khăn mà Touya phải vượt qua đang được tiếp tục, cậu ấy sẽ vượt qua như thế nào? Có ai là người đồng hành tiếp theo của cậu, theo dõi tập tiếp theo nhé',100000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Đến thế giới mới với smartphone tập 4', 'ln/sm4.jpg',1,'2020-03-07', 5,3,'13x18cm',2,N'Touya và những người bạn tiếp tục chuyến thám hiểm tại di tích trên sa mạc, kinh doanh quán café sách và bắt đầu cuộc sống riêng của mình. Để nhập sách cho quán cà phê, họ đã ghé thăm Đế quốc Regulus, đúng lúc nơi đó xảy ra một cuộc đảo chính quân sự. Trước vị tổng tư lệnh được triệu hồi cùng sự xuất hiện của ác ma cao cấp có thể vô hiệu hóa đòn tấn công vật lý lẫn ma pháp, Touya đã ra tay giúp đỡ Hoàng tộc và xin rút lui một thời gian. Nhưng sau đó, cậu lên một kế hoạch bí mật khủng khiếp tại thế giới này và quyết định tiêu diệt ác ma cấp cao đó.

Cuộc phiêu lưu kỳ bí ở thế giới khác ngày càng được yêu thích! Đến thế giới mới với smartphone 4 – Sức đánh vạn người, xin được ra mắt!',100000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Đến thế giới mới với smartphone tập 5', 'ln/sm5.jpg',1,'2020-09-07', 5,3,'13x18cm',2,N'Cuối cùng thì Touya đã trở thành chủ của một tòa lâu đài, một đất nước. Cậu cũng đã có tùy tùng và quyết định sẽ lên ngôi vua. Cùng với nhóm Yumina, Touya đã cố gắng và nghiêm túc hơn trong mọi chuyện, và bây giờ cậu quyết định sẽ tổ chức một bữa tiệc khai quốc hoành tráng. Mảnh đất từng bị lãng quên nằm giáp với các quốc gia mà cậu đã tới giao lưu nay đã trở thành một vương quốc.

Tập 5, cuộc phiêu lưu ở thế giới kỳ ảo đang rất được yêu thích về lễ khai quốc Brunhild đã được ra mắt!!!',100000,50,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Fate/Zero 1', 'ln/fz1.jpg',4,'2018-04-17', 6,3,'13x18cm',3,N'Chém giết là chuyện cực chẳng đã, nên chấm dứt những trận chiến sao cho hiệu quả, chóng vánh nhất, và ít tổn thất nhất. Chẳng có gì là gian lận hay hèn hạ ở đây. Hành xử chính nghĩa mới là vô ích. Chính nghĩa không cứu rỗi được thế gian này.

Đây là câu chuyện…

Về một người đàn ông đã đánh đổi tất cả để thực hiện lý tưởng của mình: giết thiểu số để thêm cơ hội sống cho đa số. Để xóa sạch sự vô tình trên thế gian, hắn quyết phải vô tình hơn hết thảy… Nhưng khi hắn có người để yêu thương, thì nguyên tắc sống đó lại trở thành hình phạt nặng nề nhất. Hắn theo đuổi lý tưởng vượt tầm nhân loại, trong khi bản thân hắn lại quá “người”. Đây cũng là câu chuyện… Về một người đàn ông vô cùng mẫn cán với nhiệm vụ, tinh anh trong học hành, khổ hạnh trong rèn luyện, và cũng vô cùng hoang mang trong đường đời. Gã không có lý tưởng, không có mục đích, cũng không tìm được người tri kỷ. Đây còn là câu chuyện… Về một người đàn ông dòng dõi cao quý, tinh thần kiêu hãnh, tính tình tàn nhẫn, nhưng không quên trên vai nặng mang niềm tự hào gia tộc cùng nguyện vọng chưa đạt được của tiền nhân.

Tất cả họp mặt trong một trận chiến đẫm máu, mong giải quyết những vấn đề của mình nhờ phần thưởng chung cuộc - Chén Thánh, một báu vật có quyền năng thực hiện mọi ước nguyện trên đời.Mỗi người được phép triệu hồi một linh hồn của anh hùng hoặc nhân vật huyền thoại đã khuất lên hỗ trợ. Có các anh linh hùng mạnh như Gilgamesh, Vua Arthur, Alexander Đại đế… hiệp đồng tác chiến, cùng quyết tâm, bản lĩnh và trí tuệ tự thân, ai sẽ là quán quân trong cuộc chiến vốn có lịch sử mù mịt này?

Tập thứ nhất, bắt đầu trước thềm trận chiến Chén Thánh lần IV.',90000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Fate/Zero 2', 'ln/fz2.jpg',4,'2018-09-27', 6,3,'13x18cm',3,N'Giờ G sắp điểm, các pháp sư và anh linh ồ ạt đổ về Fuyuki, trận địa của Cuộc chiến Chén Thánh.

Tuy xây dựng trên cùng một cơ cấu là master và servant, nhưng quan hệ cũng như phân bổ vai trò và chiến lược giữa các cặp rất khác nhau.

Thông qua đụng độ và giao chiến, các nhân vật hé lộ dần bản lĩnh, khát vọng, tinh thần cũng như cá tính.

Tập 2 này đi vào chi tiết cuộc đấu tay đôi giữa Lancer và Saber, với sự can thiệp giữa chừng của Rider, Archer và Berserker. Assassin và Caster vẫn thu mình ở vị trí quan sát.

Đồng thời, một điểm sáng khác của tập chính là, Kirei đã dấn những bước đầu tiên trên chặng đường săn đuổi Kiritsugu.',90000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Fate/Zero 3', 'ln/fz3.jpg',4,'2019-02-17', 6,3,'13x18cm',3,N'Với chút tác động xảo quyệt của Emiya Kiritsugu, Cuộc chiến Chén Thánh lần IV đang được đẩy tới hồi gay cấn. Tên thừa hành giả vốn ráo riết tìm kiếm hắn đã tới được sát bên, hứa hẹn một cuộc chạm trán nảy lửa giữa hai kì phùng địch thủ. Trong lúc đó, vua chinh phạt Iskandar (Rider) lại đề xuất mở một cuộc so tài nghiêm túc bằng một hình thức đặc biệt. Bữa tiệc của các đấng quân vương, trong đó họ tham gia hỏi đáp, tự vấn và tìm hiểu quan điểm của các anh linh khác về tư cách thực sự của một vị vua. Vậy, với những người đều từng ở ngôi cao như Archer, hay Saber... phẩm chất và phương pháp cai trị như thế nào là đúng?

Bên cạnh những quan điểm thâm thúy, tập 3 chứa đựng các màn giao đấu cao trào, huyền hoặc và ác hiểm!',90000,100,0.0)
INSERT INTO dbo.BOOK(Name,Images,NXB,PublicationDate,Author,Seller,Size,TypeofCover,Description,UnitPrice,UnitInStock,Discount)VALUES(   N'Fate/Zero 4', 'ln/fz4.jpg',4,'2019-07-17', 6,3,'13x18cm',3,N'Trong cơn điên loạn, anh linh Caster, hiện thân của bá tước Gilles de Rais ác quỷ thần thánh đã triệu hồi một con thủy quái khổng lồ.

Con quái vật không ai ngờ là tồn tại trên đời ấy đã đẩy thành phố Fuyuki và cả thế giới vào nguy cơ hủy diệt.

Không còn cách nào khác, các anh linh tụ hội trong Cuộc chiến Chén Thánh bắt đầu hiệp đồng tác chiến trong tuyệt vọng hòng ngăn chặn con thủy quái hung hăng… Saber cũng kiên cường chiến đấu dù tay trái chưa lành. Liệu cô có phát huy được sức mạnh thực sự của Excalibur?

Phần truyện đầy cuồng nộ này, là tập 4 của câu chuyện dẫn về khởi điểm!',90000,100,0.0)
GO

INSERT INTO dbo.status(ID,Name)VALUES(1,N'Đang Tiến Hành')
INSERT INTO dbo.status(ID,Name)VALUES(2,N'Đã hoàn thành')
INSERT INTO dbo.status(ID,Name)VALUES(3,N'Đã hủy')
INSERT INTO dbo.status(ID,Name)VALUES(4,N'Chờ xác nhận')

ALTER TABLE dbo.CUSTOMER
DROP COLUMN Gender

ALTER TABLE dbo.BOOK
ADD  FOREIGN KEY(NXB) REFERENCES dbo.Publisher(ID)

