package GC_JavaLabs;

import java.util.Scanner; 

public class MeasureRoom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double roomLength;
		double roomWidth;
		double bonus_ROOMHEIGHT_ = 10.0;
		double roomArea;
		double roomPerimeter;
		double bonus_RoomVolume;
		char userReturns = 'y';
		
		//TODO Establish the actual unit of measurement.
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		while (userReturns == 'y') {
		
		System.out.println("Enter Length: ");
		roomLength = input.nextDouble();
		
		System.out.println("Enter Length: ");
		roomWidth = input.nextDouble();
		
		// For room height, just always using a value of 10, instead of user input.
		
		roomArea = (roomLength * roomWidth);
		roomPerimeter = ((roomLength + roomWidth) * 2);
		bonus_RoomVolume = (roomLength * roomWidth * bonus_ROOMHEIGHT_);

		System.out.println("Room Area = " + roomArea);
		System.out.println("Room Perimeter = " + roomPerimeter);
		System.out.println("Room Volume with 10ft ceilings = " + bonus_RoomVolume);

		System.out.println("Do you want to measure more rooms? y/n: ");
		userReturns = input.next().charAt(0);
		}
		
		System.exit(0);

		input.close(); // Stops Eclipse' "Resource leak" warning when using scanner.
		}
	}