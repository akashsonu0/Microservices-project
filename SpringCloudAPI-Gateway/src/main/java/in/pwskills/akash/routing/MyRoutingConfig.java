package in.pwskills.akash.routing;

import java.util.UUID;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

//@Configuration
public class MyRoutingConfig {
	
	//Define the Routing information
	@Bean
    RouteLocator configureRoutes(RouteLocatorBuilder builder) {
			
		return builder
				.routes()
				.route("CARTDETAILS",
						r->r.path("/v1/api/cart/**")
						    .filters(f->f.addRequestHeader("TOKENID",UUID.randomUUID().toString())
						    		     .addResponseHeader("SERVICESTATUS", "ACTIVE"))
						.uri("lb://CART-SERVICE"))
				.route("ORDERDETAILS", r->r.path("/v1/api/order/**").uri("lb://ORDER-SERVICE"))
				.build();
	}

}
