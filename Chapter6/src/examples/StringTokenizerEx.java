package examples;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String query="name=hakyung&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();
		for(int i=0; i<n; i++){
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}


/*
It's now or never, come hole me tight. Kiss me darling, be mine tonight.
Tomorrow will be too late. It's now or never, my love won't wait.
When I first saw you, with your smile so tender.
My heart was captured, my soul surrendered.
I spent a lifetime, waiting for the right time.
Now that your near, the time is here, at last.
Just like a willow, we would cry an ocean.
If we lost true love and sweet devotion.
Your lips excited me, let your arms invite me.
For who knows when we'll meet again this way.
*/