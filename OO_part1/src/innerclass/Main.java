package innerclass;

import java.util.Scanner;

import innerclass.Button.OnClickListener;

public class Main {
	
	private static Scanner scanner= new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gearbox mcLaren = new Gearbox(6);
//		Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//		System.out.println(first.driveSpeed(1000));
//		mcLaren.addGear(1, 1.3);
//		mcLaren.addGear(2, 10.6);
//		mcLaren.addGear(3, 15.9);
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheelSpeed(3000));
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(3);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(6000));
		
//		class ClickListener implements Button.OnClickListener {
//			public ClickListener() {
//				System.out.println("I have been attched");
//			}
//			
//			@Override
//			public void onClick(String title) {
//				// TODO Auto-generated method stub
//				System.out.println(title + " was clicked");
//			}
//			
//		}
//		
//		btnPrint.setOnClickListenter(new ClickListener());
		
		btnPrint.setOnClickListenter(new OnClickListener() {
			
			@Override
			public void onClick(String title) {
				// TODO Auto-generated method stub
				System.out.println(title + " was clicked");
			}
		});
		listen();
	}
	
	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
				break;
			}
		}
	}

}
