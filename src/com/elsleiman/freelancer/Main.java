package com.elsleiman.freelancer;
import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		IAutoPick<String> list = new ProcastinatePickList<String>();
		for(String i : args ){
			list.addItem(i);
		}
		System.out.println(list.getNextTask());
	}

}
