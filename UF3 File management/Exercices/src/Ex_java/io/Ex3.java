package Ex_java.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Ex3 {
    public static void main(String[] args) {
        File workspaceDir = new File(System.getProperty("user.dir"));
        File fotosDir = new File(workspaceDir, "fotos");
        if (!fotosDir.exists()) {
            fotosDir.mkdir();
        }

        File descargasDir = new File(System.getProperty("user.home"), "descargas");
        File[] pngFiles = descargasDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));
        for (File pngFile : pngFiles) {
            try {
                Files.move(pngFile.toPath(), new File(fotosDir, pngFile.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        deleteDir(fotosDir);
    }

    private static void deleteDir(File dir) {
        if (dir.exists()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDir(file);
                    } else {
                        file.delete();
                    }
                }
            }
            dir.delete();
        }
    }
}
