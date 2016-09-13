package com.netease;

public class Kitchen {

    public static String makeNoodles(String vegetable) {

        if (vegetable == null) {
            vegetable = "Tomato";
        }
		StringBuffer s=new StringBuffer();
		s.append("<html><body>")
		 .append("<h1> Noodles with ")
		 .append(vegetable)
		 .append("</h1>") 
         .append("</body></html>");
		return s.toString();
    }
}
