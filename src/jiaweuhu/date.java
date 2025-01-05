package jiawei_hu;

import java.util.*;
import java.text.SimpleDateFormat;

public class date {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dstring=dateFormat.format(d);
		
		System.out.println("当前的时间是" + dstring);
	}

}
