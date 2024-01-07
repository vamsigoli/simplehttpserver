package com.vamsi;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.file.FileSystems;
import com.sun.net.httpserver.SimpleFileServer;

import static com.sun.net.httpserver.SimpleFileServer.OutputLevel;

public class SWSJRT {
    private static final InetSocketAddress LOOPBACK_ADDR =
            new InetSocketAddress(InetAddress.getLoopbackAddress(), 8080);

    public static void main( String[] args ) {
        var fs = FileSystems.getFileSystem(URI.create("jrt:/"));
        var root = fs.getPath("modules").toAbsolutePath();
        var server = SimpleFileServer.createFileServer(LOOPBACK_ADDR, root, OutputLevel.VERBOSE);
        server.start();
    }
}