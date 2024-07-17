// Property : 속성, 재산, SystemPropertiesAdvanced

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties infos = System.getProperties(); // getProperties() ~의 속성을 가져옴
		Enumeration<Object> enums = infos.keys();
		while( enums.hasMoreElements() ) {
			String key = (String)enums.nextElement();
			System.out.println( key + " => " + System.getProperty(key) ); //=> system의 속성 정보 출력
		}
	}
}
