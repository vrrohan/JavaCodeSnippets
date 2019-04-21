package my;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

class PlayerClient {
	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("PlayerConf.xml");
		BeanFactory cont = new XmlBeanFactory(res);

		Player p = (Player)cont.getBean("my_bean");
		System.out.println(p.hashCode());
		System.out.println(p.getRegisDay("wayne"));
	}
}