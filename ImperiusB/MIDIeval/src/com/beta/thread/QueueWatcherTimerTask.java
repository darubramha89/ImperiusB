package com.beta.thread;

import java.util.Queue;
import java.util.TimerTask;

import com.beta.Controllability.ControlValuePacket;
import com.beta.Controllability.IController;

public class QueueWatcherTimerTask extends TimerTask{
	private IController controllerRef_m;
	private Queue<ControlValuePacket> queueObj_m;
	private static QueueWatcherTimerTask timerTaskInstance_m;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	
	//Non-parametric Constructor
	private QueueWatcherTimerTask(){
		this.queueObj_m = IController.queueObj_m;
		QueueWatcherTimerTask.timerTaskInstance_m = this;
	}
	
	public static QueueWatcherTimerTask fn_FetchTimerTaskInstance(){
		if ( QueueWatcherTimerTask.timerTaskInstance_m != null ){
			return  QueueWatcherTimerTask.timerTaskInstance_m;
		}
		return null;
	}

}
