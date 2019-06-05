package com.sood.vaibhav.demo.basic;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class QuickSort implements SortAlgorithm {


@Override
public int[] sort(int[] array) {
	Arrays.sort(array);
	return array;
}
}
