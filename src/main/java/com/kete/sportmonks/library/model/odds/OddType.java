package com.kete.sportmonks.library.model.odds;

import java.util.List;

public class OddType 
{
	private String name = null;
	private OddBookmakerData bookmaker = null;
	
	public OddType() {}
	
	public String getName()
	{
		return name;
	}
	
	public List<OddBookmaker> getBookmakers()
	{
		return bookmaker.getOddBookmakers();
	}
}
