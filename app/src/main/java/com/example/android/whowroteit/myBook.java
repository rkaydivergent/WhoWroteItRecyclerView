package com.example.android.whowroteit;

/**
 * Created by pc on 9/10/2017.
 */

public class myBook {
        String title;
        String author;

        public myBook(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }
    }