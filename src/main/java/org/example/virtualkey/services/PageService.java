package org.example.virtualkey.services;

import org.example.virtualkey.screens.FileOptions;
import org.example.virtualkey.screens.Screen;
import org.example.virtualkey.screens.HomeScreen;


public class PageService {
	
	//static Directory dir = new Directory();
	
	
	
	public static HomeScreen WelcomeScreen = new HomeScreen();
    public static FileOptions FileOptionsScreen = new FileOptions();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
