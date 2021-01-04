package net.zsbj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;



// SpringBoot 应用标识
@SpringBootApplication
@EnableAsync
public class BootApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootApiApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootApiApplication.class, args);
	}
}
