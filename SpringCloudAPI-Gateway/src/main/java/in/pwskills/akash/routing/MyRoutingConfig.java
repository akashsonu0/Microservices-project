package in.pwskills.akash.routing;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRoutingConfig {
	
	//Define the Routing information
	@Bean
    RouteLocator configureRoutes(RouteLocatorBuilder builder) {
			
		return builder
				.routes()
				.route("CARTDETAILS", r->r.path("/v1/api/cart/**").uri("lb://CART-SERVICE"))
				.route("ORDERDETAILS", r->r.path("/v1/api/order/**").uri("lb://ORDER-SERVICE"))
				.build();
	}

}
