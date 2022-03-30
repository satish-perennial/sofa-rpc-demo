package com.example.sofarpc.server;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import com.example.sofarpc.server.services.SubtractService;
import com.example.sofarpc.server.services.SumService;
import com.example.sofarpc.server.services.impl.SubtractServiceImpl;
import com.example.sofarpc.server.services.impl.SumServiceImpl;

/**
 * Quick Start Server
 */
public class QuickStartServer {

    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                .setProtocol("bolt") // Set a protocol, which is bolt by default
                .setPort(12200) // set a port, which is 12200 by default
                .setDaemon(false); // non-daemon thread

        ProviderConfig<SumService> sumServiceProviderConfig = new ProviderConfig<SumService>()
                .setInterfaceId(SumService.class.getName()) // Specify the interface
                .setRef(new SumServiceImpl()) // Specify the implementation
                .setServer(serverConfig); // Specify the server

        ProviderConfig<SubtractService> subtractServiceProviderConfig = new ProviderConfig<SubtractService>()
                .setInterfaceId(SubtractService.class.getName()) // Specify the interface
                .setRef(new SubtractServiceImpl()) // Specify the implementation
                .setServer(serverConfig); // Specify the server

        sumServiceProviderConfig.export (); // Publish service

        subtractServiceProviderConfig.export (); // Publish service
    }
}