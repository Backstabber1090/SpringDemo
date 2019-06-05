package com.sood.vaibhav.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

public class XmlConnection {
public XmlConnection() {
	System.out.println("jdbc Connection");
}
}
