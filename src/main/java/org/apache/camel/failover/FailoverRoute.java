package org.apache.camel.failover;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
class FailoverRoute extends SpringRouteBuilder  {

    @Override
    public void configure() throws Exception {
        from("timer:foo")
            .setBody().simple("foo")
            .to("activemq:thequeue");
        
    }


}
