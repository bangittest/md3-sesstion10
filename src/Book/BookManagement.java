package Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        ArrayList<IBook>books=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("Chọn 1: Nhập thông tin sách");
            System.out.println("Chọn 2: Hiển thị thông tin sách");
            System.out.println("Chọn 3: Sắp xếp giảm dần theo lợi nhuận");
            System.out.println("Chọn 4: Xóa sách");
            System.out.println("Chọn 5: Tìm sách theo tên");
            System.out.println("Chọn 6: Thay đổi trạng thái sách");
            System.out.println("Chọn 7: Thoát");
            System.out.print("Nhập lựa chọn: ");
            try {
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhap so sach can nhap");
                    int n=scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        IBook book=new Book();
                        book.inputData();
                        books.add(book);
                    }
                    break;
                case 2:
                    for (IBook book:books) {
                        book.displayData();
                    }
                    break;
                case 3:
                    Collections.sort(books,(book1,book2) ->{
                        if (book1 instanceof Book &&book2 instanceof Book) {
                            return Float.compare(((Book) book2).getInterest(), ((Book) book1).getInterest());
                        }
                        return 0;
                    });
                    System.out.println("xap xep thanh cong");
                    // Hiển thị danh sách sau khi đã sắp xếp
                    System.out.println("Danh sách sách sau khi đã sắp xếp theo lợi nhuận:");
                    for (IBook book : books) {
                        book.displayData();
                    }
                    break;
                case 4:
                    System.out.println("nhap id can xoa sach: ");
                    int idDelete= scanner.nextInt();


                    boolean remove= books.removeIf(book->(book instanceof Book)&&
                            ((Book) book).getBookId() == idDelete);
                   if (remove){
                       System.out.println("xoa thanh cong");
                   }else {
                       System.out.println("xoa that bai");
                   }
                    break;
                case 5:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhập tên sách cần tìm: ");
                    String bookNameToFind = scanner.nextLine();
                    boolean found = false;

                    for (IBook book : books) {
                        if (book instanceof Book && ((Book) book).getBookName().equalsIgnoreCase(bookNameToFind)) {
                            book.displayData();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sách có tên " + bookNameToFind);
                    }
                    break;
                case 6:
                    System.out.print("Nhập mã sách cần thay đổi trạng thái: ");
                    int idStatus = scanner.nextInt();
                    scanner.nextLine();
                    boolean updated = false;

                    for (IBook book : books) {
                        if (book instanceof Book && ((Book) book).getBookId() == idStatus) {
                            ((Book) book).setBookStatus(!((Book) book).getBookStatus());
                            updated = true;
                            break;
                        }
                    }

                    if (updated) {
                        System.out.println("Thay đổi trạng thái thành công.");
                    } else {
                        System.out.println("Không tìm thấy sách có mã " + idStatus);
                    }
                    break;
                case 7:
                    System.out.println("chuong trinh ket thuc");
                    break;
            }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                scanner.next(); // Đọc và bỏ qua lựa chọn không hợp lệ từ bàn phím
            }

        }
    }
}
