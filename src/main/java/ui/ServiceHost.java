public class ServiceHost {
    private String host;
    private String port;

    private String location;

    public ServiceHost(String host, String port, String location) {
        this.host = host;
        this.port = port;
        this.location = location;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
