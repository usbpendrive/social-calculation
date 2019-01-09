module org.ragnarok.mmj.rest {
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires org.ragnarok.mmj.lib;

    exports org.ragnarok.mmj.rest;
    exports org.ragnarok.mmj.rest.resources;

    opens org.ragnarok.mmj.rest;
    opens org.ragnarok.mmj.rest.resources;
}