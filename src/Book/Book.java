package Book;

import java.util.Scanner;

public class Book implements IBook{
    private static int nextId=1;
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;

    private float importPrice;
    private float exportPrice;

    private float interest;
    private boolean bookStatus;


    public Book(){
        this.bookId=nextId++;
        this.bookStatus=true;
    }

    public Book( String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest) {

        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }


    @Override
    public void inputData() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        this.bookName=scanner.nextLine();

        System.out.print("tieu de: ");
        this.title=scanner.nextLine();
        System.out.print("Nhap Số trang sách: ");
        this.numberOfPages = scanner.nextInt();


        System.out.println("nhap gia nhap: ");
        while (true){
            this.importPrice=scanner.nextInt();
            if (importPrice>0){
                break;
            }else {
                System.out.println("gia nhap khong dung dinh dang");
            }
        }

        System.out.println("nhap gia xuat: ");
        while (true){
            this.exportPrice=scanner.nextInt();
            if (exportPrice>1.2*importPrice){
                break;
            }else {
                System.out.println("gia xuat phao lon hon: ");
            }
        }
        this.interest= (float) (exportPrice-importPrice);


        scanner.nextLine();

        System.out.println("trang thai true/false: ");
        this.bookStatus=scanner.nextBoolean();


    }

    @Override
    public void displayData() {
        System.out.println("ma sach:" +this.bookId);
        System.out.println("ten sach: " + this.bookName);
        System.out.println("tieu de : " +this.title);
        System.out.println("so trang sach: " + this.numberOfPages);
        System.out.println("gia nhap: " + this.importPrice);
        System.out.println("gia xuat: " + this.exportPrice);
        System.out.println("loi nhuan: " + this.interest);
        System.out.println("trang thai: " + this.bookStatus);
    }
}
