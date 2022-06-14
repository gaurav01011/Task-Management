package org.cap.include;

import java.util.LinkedHashMap;
import org.cap.model.Task;
import org.cap.views.MainFrame;



public class Config {
    public static MainFrame mainframe = null;
    
    public static LinkedHashMap<String,Task> taskMap = new LinkedHashMap<>();
   
}
