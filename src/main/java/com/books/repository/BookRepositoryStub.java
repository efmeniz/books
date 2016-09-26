package com.books.repository;

import com.books.model.Book;
import com.util.data.CustomPage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BookRepositoryStub implements BookRepository {

    private static List<Book> books = new ArrayList<>();

    static {
        //generated from https://tr.wikipedia.org/wiki/D%C3%BCnya_%C3%A7ap%C4%B1nda_en_%C3%A7ok_satan_kitaplar_listesi
        books.add(new Book("Hite Raporu", "Shere Hite"));
        books.add(new Book("Zencefil Adam", "J. P. Donleavy"));
        books.add(new Book("Tavşan Peter'in Bütün Maceraları", "Beatrix Potter"));
        books.add(new Book("Harry Potter ve Ölüm Yadigârları", "J. K. Rowling"));
        books.add(new Book("Martı Jonathan Livingston", "Richard Bach"));
        books.add(new Book("A Message to Garcia", "Elbert Hubbard"));
        books.add(new Book("Sofie'nin Dünyası", "Jostein Gaarder"));
        books.add(new Book("Melekler ve Şeytanlar", "Dan Brown"));
        books.add(new Book("Ve Çeliğe Su Verildi", "Nikolay Ostrovskiy"));
        books.add(new Book("Savaş ve Barış", "Leo Tolstoy"));
        books.add(new Book("Pinokyo", "Carlo Collodi"));
        books.add(new Book("Düşünce Gücüyle Tedavi", "Louise Hay"));
        books.add(new Book("Kane ve Abel", "Jeffrey Archer"));
        books.add(new Book("Anne Frank'in Hatıra Defteri", "Anne Frank"));
        books.add(new Book("In His Steps: What Would Jesus Do?", "Charles M. Sheldon"));
        books.add(new Book("Bülbülü Öldürmek", "Harper Lee"));
        books.add(new Book("Bebekler Vadisi", "Jacqueline Susann"));
        books.add(new Book("Rüzgâr Gibi Geçti", "Margaret Mitchell"));
        books.add(new Book("Yüzyıllık Yalnızlık", "Gabriel García Márquez"));
        books.add(new Book("Maksatlı Yaşam", "Rick Warren"));
        books.add(new Book("Gazap Kuşları", "Colleen McCullough"));
        books.add(new Book("The Revolt of Mamie Stover", "William Bradford Huie"));
        books.add(new Book("Ejderha Dövmeli Kız", "Stieg Larsson"));
        books.add(new Book("Aç Tırtıl", "Eric Carle"));
        books.add(new Book("The Late, Great Planet Earth", "Hal Lindsey, C. C. Carlson"));
        books.add(new Book("Who Moved My Cheese?", "Spencer Johnson"));
        books.add(new Book("Bin Dokuz Yüz Seksen Dört", "George Orwell"));
        books.add(new Book("Baba", "Mario Puzo"));
        books.add(new Book("The Happy Hooker: My Own Story", "Xaviera Hollander"));
        books.add(new Book("Jaws", "Peter Benchley"));
        books.add(new Book("Love You Forever", "Robert Munsch"));
        books.add(new Book("The Women's Room", "Marilyn French"));
        books.add(new Book("Kon-Tiki: Across the Pacific in a Raft", "Thor Heyerdahl"));
        books.add(new Book("Where the Wild Things Are", "Maurice Sendak"));
        books.add(new Book("The Secret", "Rhonda Byrne"));
        books.add(new Book("Fear of Flying", "Erica Jong"));
        books.add(new Book("Goodnight Moon", "Margaret Wise Brown"));
        books.add(new Book("Bitmeyecek Öykü", "Michael Ende"));
        books.add(new Book("Guess How Much I Love You", "Sam McBratney"));
        books.add(new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey"));
        books.add(new Book("Shōgun", "James Clavell"));
        books.add(new Book("The Poky Little Puppy", "Janette Sebring Lowrey"));
        books.add(new Book("The Pillars of the Earth", "Ken Follett"));
        books.add(new Book("Dost Kazanma ve İnsanları Etkileme Sanatı", "Dale Carnegie"));
        books.add(new Book("Gazap Üzümleri", "John Steinbeck"));
        books.add(new Book("Atlara Fısıldayan Adam", "Nicholas Evans"));
        books.add(new Book("Rüzgarın Gölgesi", "Carlos Ruiz Zafón"));
        books.add(new Book("Otostopçunun Galaksi Rehberi", "Douglas Adams"));
        books.add(new Book("Ögretmenim Mori’yle salı buluşmaları", "Mitch Albom"));
        books.add(new Book("God's Little Acre", "Erskine Caldwell"));
        books.add(new Book("The Outsiders", "S. E. Hinton"));
        books.add(new Book("Charlie'nin Çikolata Fabrikası", "Roald Dahl"));
        books.add(new Book("The Shack", "William P. Young"));
        books.add(new Book("Peyton Place", "Grace Metalious"));
        books.add(new Book("Çöl Gezegeni Dune", "Frank Herbert"));
        books.add(new Book("The Naked Ape", "Desmond Morris"));
        books.add(new Book("The Bridges of Madison County", "Robert James Waller"));
        books.add(new Book("The Exorcist", "William Peter Blatty"));
        books.add(new Book("The Gruffalo", "Julia Donaldson"));
        books.add(new Book("Eye of the Needle", "Ken Follett"));
        books.add(new Book("Zamanın Kısa Tarihi: Büyük Patlamadan Karadeliklere", "Stephen Hawking"));
        books.add(new Book("The Cat in the Hat", "Dr. Seuss"));
        books.add(new Book("The Lovely Bones", "Alice Sebold"));
        books.add(new Book("Wild Swans", "Jung Chang"));
        books.add(new Book("Santa Evita", "Tomás Eloy Martínez"));
        books.add(new Book("Uçurtma Avcısı", "Khaled Hosseini"));
        books.add(new Book("What Color is Your Parachute?", "Richard Nelson Bolles"));
        books.add(new Book("The Dukan Diet", "Pierre Dukan"));
        books.add(new Book("The Joy of Sex", "Alex Comfort"));
        books.add(new Book("The Gospel According to Peanuts", "Robert L. Short"));
        books.add(new Book("A Wrinkle in Time", "Madeleine L'Engle"));
        books.add(new Book("Açlık Oyunları", "Suzanne Collins"));
    }

    @Override
    public CustomPage<Book> listBooksByPageByLimit(int page, int limit) {

        CustomPage<Book> resultPage = new CustomPage<>(books, page, limit);

        return resultPage;
    }
}
