package zohoassessment;

import org.junit.Test;

public class Question1 {
	
	@Test
	public void example1() {
		String s = "WELCOME";
		letterCount(s);
	}
	
	public void letterCount(String s) {
		StringBuilder sb  = new StringBuilder();
		
		int len = s.length()-1;
		StringBuilder space  = new StringBuilder();
		while(len>=0) {
			space.append(" ");
			len--;
		}
		
		int mid = s.length()/2;
		int count = 0;
		while(count<s.length()) {
			sb.append(s.charAt(mid++));
			space.deleteCharAt(0);
			System.out.println(space.toString() +sb.toString());
			count++;
			if(mid==s.length()) {
				mid = 0;
			}
			
		}
	}

}
