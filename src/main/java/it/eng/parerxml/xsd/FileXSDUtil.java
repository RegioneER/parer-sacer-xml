package it.eng.parerxml.xsd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe che restituisce i nomi dei file XSD
 * 
 * In questo modo gli utilizzatori della libreria non devono conoscere i path dei file
 *
 * @author Moretti_Lu
 */
public class FileXSDUtil {

    private URL getResource(String fileName) {
        URL result = null;
        ClassLoader classLoader = getClass().getClassLoader();
        result = classLoader.getResource(fileName);
        return result;
    }

    public static URL getURLFileXSD(FileXSD file) {
        URL result = null;

        if (file != null) {
            result = new FileXSDUtil().getResource(file.getFilename());
        }

        return result;
    }

    private InputStream getResourceAsStream(String fileName) {
        InputStream result = null;
        ClassLoader classLoader = getClass().getClassLoader();
        result = classLoader.getResourceAsStream(fileName);
        return result;
    }

    public static File getFileXSD(FileXSD file) {
        File result = null;

        try {
            if (file != null) {
                InputStream in = new FileXSDUtil().getResourceAsStream(file.getFilename());
                if (in == null) {
                    return null;
                }

                Path tempDir = Files.createTempDirectory(String.valueOf(in.hashCode()));
                Path tempFile = Files.createTempFile(tempDir, "output_", ".tmp");
                tempDir.toFile().deleteOnExit();

                try (FileOutputStream out = new FileOutputStream(tempFile.toFile())) {
                    // copy stream
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                }

                String fileName = file.getFilename().substring(file.getFilename().lastIndexOf('/') + 1);
                result = new File(tempDir.toString(), fileName);
                Files.move(tempFile, result.toPath());
            }
        } catch (IOException e) {
            return null;
        }
        return result;
    }
}
