package gh.funthomas424242.lib.analyse.classloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

public class ClassloaderAnalyser {

	public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, InstantiationException, IllegalAccessException{
		final ClassloaderAnalyser analyser=new ClassloaderAnalyser();
		analyser.printClassLoaderHierarchy();
	}

	protected  void printClassLoaderHierarchy() {
		ClassLoader loader = getClass().getClassLoader();
		while(loader!=null){
			System.out.println(loader.getClass().getName());
			loader=loader.getParent();
		}
		System.out.println(String.class.getClassLoader());
	}

	
}
