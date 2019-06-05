package com.sood.vaibhav.demo.basic;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
//	Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	

public int binarySearch(int[] array, int toBeSearched) {
	
	sortAlgorithm.sort(array);
	
	return Arrays.binarySearch(array, toBeSearched);
	
}

@PostConstruct
public void postConstruct() {
	//LOGGER.info("post Construct");
}
@PreDestroy
public void preDestroy() {
	//LOGGER.info("Pre Destroy");
}
}
