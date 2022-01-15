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
                "Togetherness teaches us what is love, Loneliness teaches us what is life.",
                "A peaceful mind can think better than an exhausted mind. Allow a few minutes of silence to the mind everyday & see how it shapes your life.", "Mind seems more difficult to control than the wind. With practice and detachment get the success.",
				"Life is too short to start your day with broken pieces of yesterday. It will defintely destroy your wonderful today and your great tomorrow.",
				"If you develop a habit of praying to God for others. You will never need to pray for your own self...",
				"Holding onto anger is like drinking poison and expecting the other person to die",
				"Be easy on yourself and forgive yourself for what happened in the past",
				"Forgive yourself and those who have hurt you in the past. Have a love for them and wish them happiness.",
				"What can I do about my anger? Should I lose my power or let the hatred go?",
				"Transform your anger into motivation and use the motivation for something productive in your life. Try to switch your focus to something you love instead.",
				"Your focus on something good will make you feel like you’re on top of the world. Promote more love in your life, not hate in your life.",
				"What you think you create, what you feel you attract, what you imagine you become.",
				"Whatever the mind thinks, it becomes real. Your mind is the most powerful tool you have. Be mindful of how you think and feel.",
				"The mind can see your desires before you see them in the real world, as long as you believe in them and they will harden into a fact.",
				"Your thoughts are the results of who you have become today and the world is always a reflection of how you think and feel inside.",
				"You’re manifesting all the time, but you’re unaware of it. You don’t have to consume more negativity and turn them into a fact. Every thought is an affirmation and your dominant thoughts become a reflection in your life.",
				"You have to purge out the negative emotions instead of holding them inside, so you can feel better. If you need to cry out, do it. I do it as well.",
				"You will feel much better after getting up again from feeling defeated.",
				"Just dust yourself off and try again.It’s truly healing.",
				"Start by affirming some simple affirmations for your specific goal that is easy and simple. Stick to a few affirmations for your desire, so it doesn’t feel overwhelming for you.",
				"You don’t have to force yourself to feel anything, it will naturally come when you imagine what it’s like to have your desired accomplished.",
				"Always be aware of how you think and feel.",
				"Never let anyone influence how you think and feel about yourself. You shouldn’t let people’s limited beliefs change how you think.",
				"If you love writing, write down all the things you love about yourself and your life.",
				"Feed more focus on the blessings and less on the darkness.",
				"The important part is, that you have lived your life fully and without regret.",
				"We’ve been taught to live up to our family’s expectations, but one day we will regret the things we never did and ignore the voice inside us that knows our purpose in life.",
				"Never fear death but fear a wasted life.",
				"Do all the things you always wanted to do in life but were afraid of doing. Hug your loved ones and tell them you love them every day.",
				"Try out new skills or hobbies. Start to learn a new language and do some charity work if you want to make a little difference in the world. Try to help someone in your life.",
				"Spend more time in nature and laugh more because laughter is the medicine to your soul. Talk to the ones that you always wanted to talk to instead of being shy.",
				"Confront your fears and go out of your comfort zone if you want to grow and evolve. Make each of your days more meaningful by doing what you love the most.",
				"Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.",
				"It becomes difficult to live your life if you still have guilt on your part and are anxious about the future.",
				"The past is history and the future hasn’t happened yet. It’s better to hold dear to the memories and be excited about the future.",
				"The only way you will ever be able to enjoy your life fully is when you let go of what no longer serves you and enjoy your life at the present moment and think less of the future.",
				"The only thing happening now is in the present moment and that’s all you will ever have. Life becomes so vibrant when you meditate at the moment, it’s as if you’re living again since childhood where you had no responsibilities. Isn’t it wonderful?"
		};

		int index = (int) (Math.random() * quotes.length);
		return quotes[index];
	}
}
