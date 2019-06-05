package com.sood.vaibhav.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XmlDAO {

XmlConnection xmlConnection;

public XmlConnection getXmlConnection() {
	return xmlConnection;
}

public void setXmlConnection(XmlConnection jdbcConnection) {
	this.xmlConnection = jdbcConnection;
}
}
