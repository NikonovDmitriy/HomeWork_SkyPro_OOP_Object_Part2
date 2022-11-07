package live_coding;

public class Solution {

    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("123", "abcde"),
                new Book("345", "fghig")
        };

        try{
            var o = getAll(books);
            for (int i = 0; i < o.length; i++) {
                System.out.println(o[i]);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e){
            throw new RuntimeException(e);
        }
    }

    static String[] getAll(Book[] books) {
        var newArr = new String[books.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = String.format("\"%s\" %s", books[i].getTitle(), books[i].getName());
        }
        return newArr;
    }
}
