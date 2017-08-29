package com.example.nilima.recyclerviewexample2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Created by nilima on 29/8/17.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private List<Book> bookList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title,author,price;

        public MyViewHolder(View view){
            super(view);
            title=(TextView) view.findViewById(R.id.btitle);
            author=(TextView) view.findViewById(R.id.bauthor);
            price=(TextView) view.findViewById(R.id.bprice);
        }
    }

    public BookAdapter(List<Book> bookList){
        this.bookList=bookList;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View itemView =LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_row,parent,false);

        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder,int position){
        Book book=bookList.get(position);
        holder.title.setText(book.getTitle());
        holder.author.setText(book.getAuthor());
        holder.price.setText(book.getPrice());
    }

    public int getItemCount(){
        return bookList.size();
    }
}
