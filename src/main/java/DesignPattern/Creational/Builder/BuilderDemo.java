package DesignPattern.Creational.Builder;

public class BuilderDemo {
    public static void main(String[] args) {

        // Without builder pattern
        URL url = new URL();
        url.setProtocol("http://");
        url.setHostname("mywebsite");
        url.setPort(":8080/");
        url.setPathParam("homepage");
        url.setQueryParam("?random");

        System.out.print(url.getProtocol());
        System.out.print(url.getHostname());
        System.out.print(url.getPort());
        System.out.print(url.getPathParam());
        System.out.println(url.getQueryParam());


        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("newwebsite:").port("443");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.println(urlBuilder.port);

    }
}
