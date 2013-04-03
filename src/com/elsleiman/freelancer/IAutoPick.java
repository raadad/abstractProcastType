package com.elsleiman.freelancer;

public interface IAutoPick<T>  {
		public void addItem(T a);
		public T getNextTask();
}
