package proxy.example;

import java.util.ArrayList;
import java.util.List;

public class FileServerProxy implements IServer {
    private FileServer fileServer;

    public FileServerProxy(String ipHost, String port, String hostName, String sizeStorage) {
        fileServer = new FileServer();
        fileServer.setHostName(hostName).setIpHost(ipHost).setPort(port).setSizeStorage(sizeStorage);
    }

    @Override
    public void saveFile(File file) {
        if(file.getExtension().toLowerCase().equals("pdf")){
            fileServer.saveFile(file);
        } else {
            System.out.println("ERROR! No puede cargar archivos que no sean PDF");
            file.showInfo();
        }
    }
}
