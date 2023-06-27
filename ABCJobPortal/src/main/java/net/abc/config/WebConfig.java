package net.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="net.abc")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
		registry.addResourceHandler("/css/**")
        	.addResourceLocations("/resources/css/");

		registry.addResourceHandler("/js/**")
		        .addResourceLocations("/resources/js/");
		
		registry.addResourceHandler("/imgs/**")
		        .addResourceLocations("/resources/imgs/");
		
		registry.addResourceHandler("/svgs/**")
				.addResourceLocations("/resources/svgs/");
		
		registry.addResourceHandler("/video/**")
        	.addResourceLocations("/resources/video/");
	}

	
}