package com.aurionpro.exceptions;

import com.aurionpro.model.MarkType;

public class CellAlreadyMarkedException  extends RuntimeException{
	private MarkType markType;
	
	
	public CellAlreadyMarkedException(MarkType markType) {
		super();
		this.markType = markType;
	}


	public String getMessage() {
		return "Cell is already with " + markType;
	}

}
