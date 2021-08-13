package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac answer) {
		switch(answer) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "Legal papers might need attention today, Aries. This could concern a positive development in financial matters. Though you might not be too clear on the language, you will still be glad to do it since it could represent a highly desirable turn of events for you. New self-confidence could result. You could find more interesting people drawn into your aura. Sparkle and shine!");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "A new romance or friendship could develop with someone who's very creative and shares your spiritual values. This is a very positive development, Taurus. Just avoid idealizing your new friend. This person is human like everyone else, and needs to be loved as is. Don't create an unrealistic impression of the person. If you acknowledge and accept this, a rewarding new relationship could result.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "You could have heightened psychic awareness today, Gemini. You will probably notice it first when you pick up thoughts and feelings of family members, perhaps coming up with the same words at the same time. You may notice this phenomenon more throughout the day. You might experience visions or powerful premonitions. Make the most of this ability. It can increase your understanding of others.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Someone who lives near you who may not have said much to you before could suddenly strike up a conversation that results in a new friendship, Cancer. You could be wondering why you didn't speak to him or her before. You could share a number of interests, and because of that, you could learn about some new group activities. Don't push too hard, and don't idealize your new friend.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "Some paperwork might need execution today, Leo. This may be tedious, but it's apt to open new doors for you and pave the way to more success and good fortune. Writing or speaking might be involved in some way, and modern technology plays a definite part in what you will be doing. This could lead to valuable contacts and new friendships. Explore your options.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Strong intuitive rapport with someone who lives far away could create a desire to contact this person. This is a good idea, Virgo, as this person may be going through a positive transition in life and eager to share the news. This communication could bring you closer together, so go for it. Whatever is happening with your friend could spill over into your life in some way.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Your intuition could bring you an interesting opportunity to increase your income in an unconventional way. Others may think the idea strange, Libra, but for you it's definitely worth considering. Check all the pros and cons, talk to people in the know, and then give it some serious thought. Whether this is the source or not, an increased level of financial security is strongly indicated now.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Social events could put you in touch with interesting people involved in intriguing fields like astrology, alchemy, and other occult sciences, or perhaps in social, political, or humanitarian causes. There could be a possible new love interest. You're going to enjoy these people, Scorpio, and probably want to see them again. You need to make the effort.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "More pleasant conditions that are a lot easier to deal with could lull you into a new sense of security in your relationships. Personal and professional interactions should be especially warm and supportive. This should last for a while, Sagittarius, but then the situation will probably revert to whatever it was before. Make the most of the situation while it lasts. Don't expect it to be permanent.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "Your sharp intuition and imagination could bring enlightening spiritual insights, Capricorn. Metaphysical or religious books could be especially appealing. Relations with close friends and family should benefit from this enhanced sensitivity. You may be able to understand them better because of it. This could be inspiring. It might move you to write or start some other creative activity.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Some intense dreams about someone you haven't seen for a long time could have you wondering what this person is doing now, Aquarius. It might also awaken the desire to be in contact again. Call if you can. You might be pleasantly surprised. An increased psychic sensitivity could cause you to better understand the thoughts and feelings of family members. Communication of all kinds should go well today.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Social events or group activities concerned primarily with spiritual, metaphysical, social, or humanitarian issues could take place in your community today, Pisces. These could be enlightening and enjoyable, and you could make some new friends. The exchange of ideas could get your mind going a thousand miles an hour. Get a little exercise to clear your head or you might have trouble sleeping tonight.");
			break;
		}
		}
		
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac aquarius = Zodiac.AQUARIUS;
	
		horoscope(aquarius);
	}
}
