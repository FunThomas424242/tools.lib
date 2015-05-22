package gh.funthomas424242.lib.tools.classloader;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassDownloader {
	
	protected URL[] urls;

	public ClassDownloader(final URL[] urls){
		this.urls=urls;
	}

	public Class<?> loadClass(final String exampleClassName) throws ClassNotFoundException, IOException {
		final URLClassLoader cl=new URLClassLoader(urls);
		final Class<?> cls=cl.loadClass(exampleClassName);
		cl.close();
		return cls;
	}
	
}
