package org.example.virtualkey.screens;

import org.example.virtualkey.services.DirService;
import org.example.virtualkey.services.PageService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class HomeScreen implements Screen {

    private String welcomeText = "Welcome..!";
    private String developerText = "Developer: Sanjay P";

    private ArrayList<String> options = new ArrayList<>();


    public HomeScreen() {
        options.add("1. Show Files");
        options.add("2. Show File Options Menu");
        options.add("3. Quit");

    }
    
    public void introWS() {
        System.out.println("*********************");
        System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("*********************");
        Show();
    }
    
    
    
    @Override
    public void Show() {
    	System.out.println("Main Menu");
        System.out.println("*********************");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.ShowFiles();
                
                this.Show();
                
                break;
                
            case 2: // Show File Options menu
            	PageService.setCurrentScreen(PageService.FileOptionsScreen);
                PageService.getCurrentScreen().Show();
                PageService.getCurrentScreen().GetUserInput();
                
                this.Show();
                
                break;
                
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {

        System.out.println("List of Files: ");
        System.out.println("*********************");
    	DirService.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}
