/*
 *    This file is part of lBORC.
 *    
 *    Copyright 2010 Bernhard Eder
 * 
 *    bboTS is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    bboTS is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with lBORC.  If not, see <http://www.gnu.org/licenses/>.
 */


package at.bbgen.lborc;

/**
 * Exception thrown by {@link BOServerWorker}
 * @author Bernhard Eder <bbots@bbgen.net>
 *
 */
public class RConnectionException extends Exception
{
	private static final long serialVersionUID = 1L;

	public RConnectionException()
	{
		super();
	}
	
	public RConnectionException(String err)
	{
		super(err);
	}
}