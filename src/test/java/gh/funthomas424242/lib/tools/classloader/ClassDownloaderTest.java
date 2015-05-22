package gh.funthomas424242.lib.tools.classloader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import gh.funthomas424242.lib.tools.classloader.ClassDownloader;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;

public class ClassDownloaderTest {

	private static final String EXAMPLE_CLASS_NAME = "org.apache.commons.collections4.list.NodeCachingLinkedList";
	
	@Test
	public void downloadClassExample() {
		try {
			final URL url = new URL(
					"https://repo1.maven.org/maven2/org/apache/commons/commons-collections4/4.0/commons-collections4-4.0.jar");
			final ClassDownloader downloader = new ClassDownloader(
					new URL[] { url });
			final Class<?> cls = downloader.loadClass(EXAMPLE_CLASS_NAME);
			assertNotNull(cls);
			assertEquals(EXAMPLE_CLASS_NAME, cls.getName());
		} catch (ClassNotFoundException | IOException ex) {
			fail();
		}
	}

}
