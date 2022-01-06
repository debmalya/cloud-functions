package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;

public class Example implements HttpFunction {
  @Override
  public void service(HttpRequest request, HttpResponse response) throws Exception {
    BufferedWriter writer = response.getWriter();
    writer.write(quoteSuppier());
  }

  	private static String quoteSuppier() {
		String[] quotes = new String[] {
				"If you can't explain it simply you don't understand it well enough - Albert Einstein",
				"If the plan doesn't work, change the plan. Not the goal. Learn to adapt to a situation and how to improve your vision from there. Dea Kurti,",
				"Raise your words, not voice. It is rain that grows flowers, not thunder. - Rumi",
				"Simplicity is the ultimate sophistication. - Leonardo da Vinci", "Life is all about the next step",
				"A man is relieved and gay when he has put his heart into his work and done his best. Emerson, Ralph Waldo",
				"Instead of focusing on being the best, focus on being the best you can be - Maxie McCoy",
				"Great minds have purposes; others have wishes. Little minds are tamed and subdued by misfortune; but great minds rise above them. Washington Irving",
				"Without great solitude, no serious work is possible. Pablo Picasso",
				"Start where you are. Use what you have. Do what you can. Arthur Ashe",
				"Beauty is about living your life & being happy with yourself inside & out & not worrying about what people think of you.",
				"If you want to fly, you have to give up the stuff that weighs you down.",
				"Do not let the shadows of your past darken the doorstep of your future. Forgive and forget.",
				"NEVER make permanent decisions on temporary feelings.",
				"It is nice to be important, But it is more important to be nice",
				"A smile is the lighting system of the face, the cooling system of the head and the heating system of the heart.",
				"Be happy in the moment, that's enough. Each moment is all we need, not more. -Mother Teresa",
				"The best time to start was yesterday. The next best time is now. ",
				"Expect nothing and you will be never disappointed",
				"Friends are angels who lift our feet when our own wings have trouble remembering how to fly.",
				"We either win or we learn.",
				"I attribute my success to this: I never gave or took any excuse. Florence Nightingale",
				"Every child is an artist.  The problem is how to remain an artist once he grows up - Pablo Picasso",
				"Take control of your emotions before emotions take control of you...",
				"Mistakes are proof, that you are trying", "Your failure does not define you, your determination does.",
				"Being the richest man in the cemetery doesn't matter to me. Going to bed at night saying we've done something wonderful, that's what matters to me. Steve Jobs",
				"What you do today can improve all your tomorrows.  Ralph Marston",
				"It does not matter how slowly you go as long as you do not stop. Confucius",
				"Judge of a man by his questions rather than by his answers. Voltaire",
				"God gave us the gift of life; it is up to us to give ourselves the gift of living well.  - Voltaire",
				"Beleive in yourself, others will believe you.",
				"Every child is an artist.  The problem is how to remain an artist once he grows up. –Pablo Picasso",
				"Take control of your emotions before emotions take control of you...",
				"Mistakes are proof, that you are trying", "Reality is a product of our dreams, decisions & actions.",
				"Where words fail, music speaks.  Hans Christian Andersen",
				"Your failure does not define you, your determination does.",
				"Being the richest man in the cemetery doesn't matter to me. Going to bed at night saying we've done something wonderful, that's what matters to me. Steve Jobs",
				"What you do today can improve all your tomorrows.  Ralph Marston",
				"It does not matter how slowly you go as long as you do not stop. Confucius",
				"Judge of a man by his questions rather than by his answers. Voltaire",
				"God gave us the gift of life; it is up to us to give ourselves the gift of living well.  - Voltaire",
				"Appreciation is a wonderful thing: It makes what is excellent in others belong to us as well - Voltaire",
				"Common sense is not so common - Voltaire", "Tears are the silent language of grief. - Voltaire",
				"Music fills the infinite between two souls - Rabindranath Tagore",
				"By plucking her petals, you do not gather the beauty of the flower - Rabindranath Tagore",
				"Depth of friendship does not depend on length of acquaintance  - Rabindranath Tagore",
				"The world is the great gymnasium where we come to make ourselves strong - Swami Vivekananda",
				"As cold water and warm iron take away the wrinkles of clothes. A cool mind and warm heart takes out the worries of life.",
				"Feeling are just visitors, let them come and go. Keep moving ahead",
                "Togetherness teaches us what is love, Loneliness teaches us what is life."	};

		int index = (int) (Math.random() * quotes.length);
		return quotes[index];
	}
}
