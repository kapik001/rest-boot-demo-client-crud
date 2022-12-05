package com.kapusta.demo;

import com.kapusta.RestBoot;
import com.kapusta.config.RestBootConfig;

class Run {
    public static void main(String[] args) {
        RestBootConfig config = RestBootConfig.builder()
                .hostName("localhost")
                .port(8080)
                .threadPoolSize(8)
                .packagesToScan(new String[]{"com.kapusta.demo"})
                .build();

        new RestBoot(config).run();
    }
}
