package com.elsleiman.freelancer;

public class FirstInPickList<T> extends AbstractAutoPickList<T>  {

	@Override
	public T getNextTask() {
		return list.remove(0);
		
	}
}
