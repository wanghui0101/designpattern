package personal.wh.designpattern.ch02.simplefactory.sample;

public class ImplB implements Api {

	@Override
	public void operation(String s) {
		System.out.println("ImplB s==" + s);
	}

}
