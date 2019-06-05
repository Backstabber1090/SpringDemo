package com.sood.vaibhav.demo.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("bubble")
public class BubbleSortClass implements SortAlgorithm {

	
	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	
}
