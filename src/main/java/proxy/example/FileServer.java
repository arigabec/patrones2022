package proxy.example;

import java.util.ArrayList;
import java.util.List;

public class FileServer implements IServer {
    private String ipHost;
    private String port;
    private String hostName;
    private String sizeStorage;
    private List<File> fileList;

    public FileServer(){
        fileList = new ArrayList<>();
    }

    public String getIpHost() {
        return ipHost;
    }

    public FileServer setIpHost(String ipHost) {
        this.ipHost = ipHost;
        return this;
    }

    public String getPort() {
        return port;
    }

    public FileServer setPort(String port) {
        this.port = port;
        return this;
    }

    public String getHostName() {
        return hostName;
    }

    public FileServer setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public String getSizeStorage() {
        return sizeStorage;
    }

    public FileServer setSizeStorage(String sizeStorage) {
        this.sizeStorage = sizeStorage;
        return this;
    }

    @Override
    public void saveFile(File file) {
        fileList.add(file);
        System.out.println("Guardando archivo");
        file.showInfo();
    }
}
