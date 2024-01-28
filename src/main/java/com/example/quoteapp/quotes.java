package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class quotes extends AppCompatActivity {

    private TextView quotesTxt, writer;
    private final List<QuotesList> quotesLists = new ArrayList<>();

    private int currentQuotePosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView CN = findViewById(R.id.Categoryname);
        quotesTxt = findViewById(R.id.quoteTxt);
        writer = findViewById(R.id.writer);

        final Button prev = findViewById(R.id.prev);
        final Button next = findViewById(R.id.next);
        final ImageView copy = findViewById(R.id.copy);

        final String getName = getIntent().getStringExtra("name");

        CN.setText(getName);

        if (getName.equals("Life")) {
            quotesLists.addAll(QuotesData.getLifeQuotes());

        } else if (getName.equals("Success")) {
            quotesLists.addAll(QuotesData.getSuccessQuotes());

        } else if (getName.equals("Love")) {
            quotesLists.addAll(QuotesData.getLoveQuotes());

        } else if (getName.equals("Motivation")) {
            quotesLists.addAll(QuotesData.getMotivationQuotes());

        } else if (getName.equals("Atitude")) {
            quotesLists.addAll(QuotesData.getAtitudeQuotes());

        }

        // check for your own quotes here

        // get first quote from quotesLists and set to TextView


        Object setQuotesToTextView;
        setQuotesToTextView() ;
        setQuotesToTextView();
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentQuotePosition--;
                if (currentQuotePosition < 0) {
                    currentQuotePosition = quotesLists.size() - 1;
                }


            }

            private void setQuotesToTextView() {
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentQuotePosition++;

                if (currentQuotePosition >= quotesLists.size()) {
                    currentQuotePosition = 0;
                }
            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quotes", quotesLists.get(currentQuotePosition).getQuote() + "\nby " + quotesLists.get(currentQuotePosition).getWriter());
                clipboardManager.setPrimaryClip(clipData);
            }
        });
    }

    private void setQuotesToTextView() {
        quotesTxt.setText(quotesLists.get(currentQuotePosition).getQuote());
        writer.setText(quotesLists.get(currentQuotePosition).getWriter());
    }
    }