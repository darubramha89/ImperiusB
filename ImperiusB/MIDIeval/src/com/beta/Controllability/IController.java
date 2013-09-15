package com.beta.Controllability;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;


/*Interface: IController
 *Function: Defines the basic functions of a controller class of instances, 
 *			eg) UI component, Sensor component, LFO and Automation
 *Author: Hrishik Mishra 
 */
public interface IController {
	//Members
	static final Queue<ControlValuePacket> queueObj_m = new PriorityQueue<ControlValuePacket>();
	Object lockObject_m = new Object();
	
	
	
	//Queue operations which will be implemented by controller classes 
	//based on the data they generate as Controllers.
	public abstract void fn_PutToQueue();
	public abstract ControlValuePacket fn_DequeueFromQueue();
	
	//Controller Specific information methods
	/*Function fn_FetchSubControllerMap
	 *Function: Fetch the subcontroller map in a hash map of <int, String> type
	 */
	HashMap fn_FetchSubControllerMap();
	/*Function: fn_FetchSubControllerMap
	 *Function: Each Controller will have to create it's own SubController map setting 
	 */
	void fn_SetSubControllerMap();
	
	//Properties
	/**
	 * @return the queueObj_m
	 */
	Queue getQueue();
	
	

}
