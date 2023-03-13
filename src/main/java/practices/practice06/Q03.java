package practices.practice06;

public class Q03 {

    //Type code to add books to a library application with its info(bookName, authorName, pageNumber)
    //then create a method to show information of the book

    String bookName;
    String authorName;
    int numOfPage;
    String bookId;
    static int numOfBooks;

    public static void main(String[] args) {

        Q03 book1= new Q03("Crime and Punishment", "Dostoyevski", 650);
        Q03 book2=new Q03("Thousand Shiny Suns", "Khaled Houseyni", 276);
        Q03 book3= new Q03("A Wild Sheep Chase","Murakami", 756);

        book1.display();
    }
    Q03 (String bookName,String authorName,int numOfPage){

        this.bookName=bookName;
        this.authorName=authorName;
        this.numOfPage=numOfPage;

        numOfBooks++;

        bookId=bookName.substring(0,2)+numOfBooks;
    }
    public void display(){

        System.out.println("Book Name: "+ bookName + " Author Name: "+authorName +" Number of Page: "+numOfPage+" "+" Book ID: "+bookId);
    }




}
