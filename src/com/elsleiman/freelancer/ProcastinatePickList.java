package com.elsleiman.freelancer;


import java.util.ArrayList;
import java.util.List;

public class ProcastinatePickList<T> extends AbstractAutoPickList<T>  {

	T[] remainingList;
	@Override
	public T getNextTask() {
		int n = list.size();
		int c = (int) Math.floor( Math.log( Math.random() * (Math.pow(2, n)-1) + 1 ) / Math.log(2) );
		T x = list.get(c);
		list.remove(c);
		return x;
	}


}
