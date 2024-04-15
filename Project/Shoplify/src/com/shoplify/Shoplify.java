package com.shoplify;

import com.shoplify.model.User;
import com.shoplify.service.AdminService;
import com.shoplify.service.Authentication;
import com.shoplify.service.AuthenticationImpl;
import com.shoplify.service.ProductService;
import com.shoplify.service.Session;
import com.shoplify.service.UserService;
import com.shoplify.service.electronicsService.ElectronicsService;
import com.shoplify.service.fashion.FashionService;
import com.shoplify.util.AppConstants;
import com.shoplify.util.InputHandler;

public class Shoplify {
	
	static {
		UserService.init();
		FashionService.init();
		ElectronicsService.init();
		
		System.out.println("Welcome to Shoplify - Your Ultimate Online Shopping Destination!");
        System.out.println();
        
        System.out.println("        SSSSSSS    HH       HH     OOOOO     PPPPPPPPP    LLL          IIIIIII    FFFFFFFFFF    YY      YY ");
        System.out.println("       SSSSSSSSS   HH       HH   OO     OO   PPPPPPPPPP   LLL            III      FFFFFFFFFF     YY    YY ");
        System.out.println("      SS       SS  HH       HH  OO       OO  PP       PP  LLL            III      FF              YY  YY ");
        System.out.println("      SS           HH       HH  OO       OO  PP       PP  LLL            III      FF              YY YY ");
        System.out.println("       SSSSSS      HHHHHHHHHHH  OO       OO  PPPPPPPPPP   LLL            III      FFFFFFFF       YYYY");
        System.out.println("           SSSS    HH       HH  OO       OO  PPPPPPPPP    LLL            III      FF            YYYY ");
        System.out.println("              SS   HH       HH  OO       OO  PP           LLL            III      FF           YYYY ");
        System.out.println("       SS      SS  HH       HH   OO     OO   PP           LLLLL  	 III      FF          YYYY ");
        System.out.println("        SSSSSSSS   HH       HH     OOOOO     PP           LLLLLLLLLL   IIIIIII    FF         YYYY ");

        
        System.out.println();
        System.out.println("Thank you for choosing Shoplify. Get ready to shop till you drop!");
   
	}
	
	public static void main(String args[]) {
		InputHandler sc = new InputHandler();
		Authentication auth = new AuthenticationImpl();
		
		System.out.println("Enter 1 for register");
		System.out.println("Enter 2 for login");
		System.out.println("Enter 3 for guest login");
		System.out.println("Enter 4 for exit");

		int cond = sc.nextInt();
		
		switch(cond) {
		case 1:
			auth.register();
			System.out.println("Registered Successfull");
		case 2:
			auth.login();
			System.out.println("Login Successfull");
			User user = Session.getUser();
			if(user!=null && user.getRole().equals(AppConstants.adminUser)){
				AdminService adminService = new AdminService();
				adminService.admin();
				break;
			}
		case 3:
			ProductService productService = new ProductService();
			productService.homePage();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.err.println("Invalid Input! Please try again");
			main(null);
		}
	}
	
}
