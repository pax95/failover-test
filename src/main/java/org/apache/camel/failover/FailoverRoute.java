package org.apache.camel.failover;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
class FailoverRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo")
            .setBody()
            .simple("foo")
            .to("activemq:thequeue");

    }

}
