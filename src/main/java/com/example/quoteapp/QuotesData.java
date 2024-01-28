package com.example.quoteapp;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {

    @NonNull
    public static List<QuotesList> getLifeQuotes(){

        final List<QuotesList> lifeQuotesList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("he purpose of our lives is to be happy.", "Dalai Lama");
        lifeQuotesList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList("Life is what happens when you're busy making other plans", "John Lennon");
        lifeQuotesList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("Get busy living or get busy dying.", "Stephen King");
        lifeQuotesList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("You only live once, but if you do it right, once is enough.", "Mae West");
        lifeQuotesList.add(lifeQuote4);

        QuotesList lifeQuote5 = new QuotesList("Many of life's failures are people who did not realize how close they were to success when they gave up", "Thimas A.Edison");
        lifeQuotesList.add(lifeQuote5);

        return lifeQuotesList;

    }

    public static List<QuotesList> getLoveQuotes(){
        final  List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuote1 = new QuotesList("Love her but leave her wild ", "Atticus");
        loveQuotesList.add(loveQuote1);

        QuotesList loveQuote2 = new QuotesList("I need you like a heart needs a beat", "Unknown");
        loveQuotesList.add(loveQuote2);

        QuotesList loveQuote3 = new QuotesList("You're the closest to heaven, that I'll ever be", "Goo goo Dools");
        loveQuotesList.add(loveQuote3);

        QuotesList loveQuote4 = new QuotesList("Its always better when we're together", "Jack Johnson");
        loveQuotesList.add(loveQuote4);

        QuotesList loveQuote5 = new QuotesList("I love you and thats the beginning and end of everything", "f. Scoot Fitzgerald");
        loveQuotesList.add(loveQuote5);

        return loveQuotesList;
    }
    public static List<QuotesList> getMotivationQuotes(){

        final List<QuotesList> MotivationQuotesList = new ArrayList<>();

        QuotesList MotivationQuote1 = new QuotesList("When you have a dream you've got to grab it and never let go", " Carol burnett");
        MotivationQuotesList.add(MotivationQuote1);

        QuotesList MotivationQuote2 = new QuotesList("Nothing is impoosible . the word itself says I'm possible ", "Audrey Hepburn");
        MotivationQuotesList.add(MotivationQuote2);

        QuotesList MotivationQuote3 = new QuotesList("There is nothing impossible to they who will try", "Alexxander the Great");
        MotivationQuotesList.add(MotivationQuote3);

        QuotesList MotivationQuote4 = new QuotesList("The bad news is time files.The good news is you're the pilot", "Michael Altshuler");
        MotivationQuotesList.add(MotivationQuote4);

        QuotesList MotivationQuote5 = new QuotesList("Life has got all those twists and turns. You've got to hold on tight and off you go", "Nicole Kidman");
        MotivationQuotesList.add(MotivationQuote5);

        return MotivationQuotesList;
    }

    public static List<QuotesList> getSuccessQuotes(){

        final List<QuotesList> SuccessQuotesList = new ArrayList<>();

        QuotesList SuccessQuotes1 = new QuotesList("Try not to become a man of suucess but rather try to becomde a man of value", "Albert Einstein");
        SuccessQuotesList.add(SuccessQuotes1);

        QuotesList SuccessQuotes2 = new QuotesList("Succes is a lousy teacher.It seduces smart people into thinking they can't lose", "Bill Gates");
        SuccessQuotesList.add(SuccessQuotes2);

        QuotesList SuccessQuotes3 = new QuotesList("Ambition is the path to success.Persistence is the vehicle you arrive in.", "Bill Bradley");
        SuccessQuotesList.add(SuccessQuotes3);

        QuotesList SuccessQuotes4 = new QuotesList("Success is where preparation and opportunity meet.", "Bobby unser");
        SuccessQuotesList.add(SuccessQuotes4);

        QuotesList SuccessQuotes5 = new QuotesList("Happiness lies in the joy of acievement and the thrill of creative effort", "Franklin D. Rossevelt");
        SuccessQuotesList.add(SuccessQuotes5);

        return SuccessQuotesList;
    }
    public static List<QuotesList> getAtitudeQuotes(){

        final List<QuotesList> AtitudeQuotesList = new ArrayList<>();

        QuotesList AtitudeQuotes1 = new QuotesList("If you look the right way, you can see that the whole world is a garden.", "Frances Hodgson Burnett");
        AtitudeQuotesList.add(AtitudeQuotes1);

        QuotesList AtitudeQuotes2 = new QuotesList("Live life to the fullest, and focus on the positive.", "Matt Cameron");
        AtitudeQuotesList.add(AtitudeQuotes2);

        QuotesList AtitudeQuotes3 = new QuotesList("Optimism is the faith that leads to achievement; nothing can be done without hope.", "Helen Keller");
        AtitudeQuotesList.add(AtitudeQuotes3);

        QuotesList AtitudeQuotes4 = new QuotesList("The only disability in life is a bad attitude.", "Scott Hamilton");
        AtitudeQuotesList.add(AtitudeQuotes4);

        QuotesList AtitudeQuotes5 = new QuotesList("The only disability in life is a bad attitude.", "Dale Carnegie");
        AtitudeQuotesList.add(AtitudeQuotes5);

        return AtitudeQuotesList;
    }
}
