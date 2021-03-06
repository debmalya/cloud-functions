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
				"Every child is an artist.  The problem is how to remain an artist once he grows up. ???Pablo Picasso",
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
				"Your focus on something good will make you feel like you're on top of the world. Promote more love in your life, not hate in your life.",
				"What you think you create, what you feel you attract, what you imagine you become.",
				"Whatever the mind thinks, it becomes real. Your mind is the most powerful tool you have. Be mindful of how you think and feel.",
				"The mind can see your desires before you see them in the real world, as long as you believe in them and they will harden into a fact.",
				"Your thoughts are the results of who you have become today and the world is always a reflection of how you think and feel inside.",
				"You're manifesting all the time, but you're unaware of it. You don't have to consume more negativity and turn them into a fact. Every thought is an affirmation and your dominant thoughts become a reflection in your life.",
				"You have to purge out the negative emotions instead of holding them inside, so you can feel better. If you need to cry out, do it. I do it as well.",
				"You will feel much better after getting up again from feeling defeated.",
				"Just dust yourself off and try again.It's truly healing.",
				"Start by affirming some simple affirmations for your specific goal that is easy and simple. Stick to a few affirmations for your desire, so it doesn't feel overwhelming for you.",
				"You don't have to force yourself to feel anything, it will naturally come when you imagine what it's like to have your desired accomplished.",
				"Always be aware of how you think and feel.",
				"Never let anyone influence how you think and feel about yourself. You shouldn't let people's limited beliefs change how you think.",
				"If you love writing, write down all the things you love about yourself and your life.",
				"Feed more focus on the blessings and less on the darkness.",
				"The important part is, that you have lived your life fully and without regret.",
				"We've been taught to live up to our family's expectations, but one day we will regret the things we never did and ignore the voice inside us that knows our purpose in life.",
				"Never fear death but fear a wasted life.",
				"Do all the things you always wanted to do in life but were afraid of doing. Hug your loved ones and tell them you love them every day.",
				"Try out new skills or hobbies. Start to learn a new language and do some charity work if you want to make a little difference in the world. Try to help someone in your life.",
				"Spend more time in nature and laugh more because laughter is the medicine to your soul. Talk to the ones that you always wanted to talk to instead of being shy.",
				"Confront your fears and go out of your comfort zone if you want to grow and evolve. Make each of your days more meaningful by doing what you love the most.",
				"Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.",
				"It becomes difficult to live your life if you still have guilt on your past and are anxious about the future.",
				"The past is history and the future hasn't happened yet. It's better to hold dear to the memories and be excited about the future.",
				"The only way you will ever be able to enjoy your life fully is when you let go of what no longer serves you and enjoy your life at the present moment and think less of the future.",
				"The only thing happening now is in the present moment and that's all you will ever have. Life becomes so vibrant when you meditate at the moment, it's as if you're living again since childhood where you had no responsibilities. Isn't it wonderful?",
				"Set yourself up for a daily meditation every day and write it down all the inspirations you get from it after the meditation session has ended.",
				"Be aware of all the sounds, music, and colors around you. Try to sit on a bench and observe the view of nature in front of you in silence.",
				"Find beauty and blessings in all the things you have right now and you will find out that you're richer than you think.",
				"There are only two mistakes one can make along the road to truth; not going all the way, and not starting.",
				"it's better to try and think 'At least I did it.' than to never try and think 'I wish I did it.'",
				"The biggest mistake is never doing what you wanted to do because your family said so and friends think it's an unrealistic goal. You should never care about what anyone thinks about your journey, it's your journey, no one else.",
				"The second biggest mistake is giving up when you fail a few times on your desired goal. You're only getting stronger when you keep going for your desires.",
				"The important thing is to stay consistent because you are always learning something valuable along the road to your dream. You should enjoy the journey.",
				"Follow your heart and write down a list of things you've always wanted to do in your life.",
				"It doesn't matter how many obstacles you will face, as long as you persist.",
				"To keep the body in good health is a duty, otherwise we shall not be able to keep our mind strong and clear.",
				"Your body is your sacred temple, after all, take care of it.",
				"It's not enough to have a healthy diet, you have to keep your mental and emotional diet healthy as well. You should never take anything personally and you should be less stressed about the unnecessary things in your life.",
				"Stress makes our body weaker and having a healthy body helps us to extend our lifespan.",
				"When you live a healthy lifestyle, you will end up removing all the unnecessary crap in your body and in your mind.",
				"Meditate daily to have a quiet mind. You will live a longer life when you're overthinking less and it will make you look younger.",
				"Tell yourself, 'I don't have time to think about things or people that make me feel miserable.' and change your focus into what makes your heart happy.",
				"Let people's words go from one ear to another. You should never take anything personally when someone reflects their insecurity on you. It's always about them, never about you.",
				"There isn't enough darkness in all the world to snuff out the light of one little candle.",
				"No evil in this world can stop someone from being good by shining their light in this world.",
				"The lies may run fast but the truth will slowly arrive and shine in a world of blinded people. The truth will never be oppressed by evil.",
				"You can try to hide away from the truth, but the truth will always find a way back to you. The more you deny the truth, the more resistance you will create.",
				"The easiest way is to surrender to the truth and listen, even if it's hurting your ego. You have to ask yourself, 'What can I learn from this? What is this teaching me?'",
				"Speak your truth even if you become nervous and everyone thinks you're the weird one. It doesn't matter what anyone thinks, it matters how you think and feel.",
				"Surrender to the harsh truth, no matter how much it hurts your ego, when you do it, you will set yourself free from the lie you have lived in.",
				"Write down a list of what makes you special and you will be reminded of how worthy you are in this world.",
				"Never let the ignorance of this world stop you from following your heart and what feels right for you. Listen to the inner voice inside you.Your intuition knows what???s best for you.",
				"Heart is the only machine that works without any rest for years. Keep it always happy, whether it is 'yours' or 'others'.",
				"If you want something you never had. You have to do something you've never done.",
				"Nothing ever comes to me, that is worth having, except as the result of hard work. - Booker T. Washington",
				"Best graduation degree in life is B.Calm",
                "We do not grow when things are easy. We grow when we face challenge",
                "Ups and downs in life are very important to keep us going, because a straight line even in an E.C.G. means we are not alive.",	
                "Speak in such a way that others love to listen you. Listen in such a way that others love to speak to you.",
				"If you want to destroy something. Destroy your negative thinking",	
				"Accept life like a pair of walking legs. The foot forward has no pride and the foot behind has no shame. Both know their situation will soon change."
		};

		int index = (int) (Math.random() * quotes.length);
		return quotes[index];
	}
}
