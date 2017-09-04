package com.example.nilima.recyclerviewexample2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar1);
        //  setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        bookAdapter = new BookAdapter(bookList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(bookAdapter);

        prepareBookData();

    }

    private void prepareBookData() {

        Book book = new Book("The God of Small Things", "Arundhati Roy", "$12.44");
        bookList.add(book);

        book = new Book("A fine Balance", "Rohinton Mistry", "$7.99");
        bookList.add(book);

        book = new Book("The White Tiger", "Aravind Adiga", "$36.68");
        bookList.add(book);

        book = new Book("Shantaram", "Gregory David Roberts", "$19.80");
        bookList.add(book);

        book = new Book("Siddhartha", "Harmann Hesse", "$1.30");
        bookList.add(book);

        book = new Book("Midnight Children", "Salman Rushdie", "$9.98");
        bookList.add(book);

        book = new Book("Interpreter of Maladies", "Jhumpa Lahiri", "$8.99");
        bookList.add(book);

        book = new Book("A Passage of India", "E.M. Forstar", "$12.94");
        bookList.add(book);

        book = new Book("Circle of Five", "Jan Raymond", "$11.99");
        bookList.add(book);

        book = new Book("The Story of My Experiment with Truth", "Mahatma Gandhi", "$9.30");
        bookList.add(book);

        book = new Book("A Suitable Boy", "Vikram seth", "$13.21");
        bookList.add(book);

        book = new Book("The Inheritence of Loss", "Kiran Desai", "$14.66");
        bookList.add(book);

        book = new Book("The Far Pavillions", "M.M. Kaye", "$3.20");
        bookList.add(book);

        book = new Book("The Bhagavad Gita", "Krishna Vyasa", "$96.00");
        bookList.add(book);

        book = new Book("Malgudi Days", "R.K. Narayan", "$80.75");
        bookList.add(book);

        book = new Book("Curiosity Kills the Katha", "Ashok Kallarakkal", "$7.00");
        bookList.add(book);

        book = new Book("The Chronicle of Sapta Sindhu", "Aporva Kula", "$1.23");
        bookList.add(book);

        book = new Book("Destiny of Shattered Dreams", "Nilesh Rathod", "$9.99");
        bookList.add(book);

        book = new Book("The Secrete Garden", "Frances Hodgson Burnett", "$3.72");
        bookList.add(book);

        book = new Book("The Jungle Book", "Rudyard Kipling", "$3.16");
        bookList.add(book);

        bookAdapter.notifyDataSetChanged();
    }
}
