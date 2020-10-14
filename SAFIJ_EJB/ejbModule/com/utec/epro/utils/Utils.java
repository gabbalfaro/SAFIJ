package com.utec.epro.utils;

import java.util.Date;

public class Utils {
	private Date dateHoy;
	
	public Date fechaActual(){
		dateHoy = new Date();
		return dateHoy;
	}

}
