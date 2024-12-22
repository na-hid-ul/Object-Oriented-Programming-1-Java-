import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import java.util.Scanner;


public class Start{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String user,pass;
		System.out.println("**Fill the username please!**");
		user = sc.nextLine();
		
		System.out.println("**Fill the password please!** ");
		pass=sc.nextLine();
		if(user.equals("admin")&&(pass.equals("Hasebul"))){
		
		Owner f = new Owner();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("\n**Congratulations!! Your Password is correct**");
		System.out.println("\n-------------------------------------------");
		System.out.println("\t Welcome to our Pharmacy");
		System.out.println("-------------------------------------------\n");

		boolean repeat=true;

		while(repeat){
			System.out.println("Select your option ");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Pharmacy Management");
			System.out.println("\t3. Pharmacy Medicine Management");
			System.out.println("\t4. Medicine Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-------------------------------------------");
			System.out.print("Eneter you choice: ");
			int choice = sc.nextInt();
			switch(choice){

				case 1: 
						System.out.println("\n\n\n-------------------------------------------");
						System.out.println("You have chose Pharmacy Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Employee");
						System.out.println("\t2. Remove Existing Employee");
						System.out.println("\t3. Show All Employees");
						System.out.println("\t4. Search a Employee");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						int choice1 = sc.nextInt();

						switch(choice1){
							case 1: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Insert New Employee");
									System.out.println("-------------------------------------------");
							
									System.out.print("Employee  ID : ");
									String empId1 = sc.next();
									System.out.print("Employee Name : ");
									String name1 = sc.next();
									System.out.print("Employee Salary : ");
									double salary1 = sc.nextDouble();

									Employee e1 = new Employee(empId1, name1, salary1);

									if(f.insertEmployee(e1)){
										System.out.println("Employee Inserted Successfully.");
										System.out.print("Name "+ name1+ ",  Id "+ empId1);
									}
									else{System.out.println("Employee can not be created now. Try again later");}


									System.out.println("\n\n#######################################################\n\n");

								break;

							case 2 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Remove Employee");
									System.out.println("-------------------------------------------");
							
									System.out.print("Employee  ID: ");
									String empId2 = sc.next();

									Employee e2 = f.searchEmployee(empId2);

									System.out.println("Are You sure you want to delete this Employee? ");
									System.out.print("Press 1 to delete Employee  ");

									int delete = sc.nextInt();

									if(delete==1){

										if(e2 != null){
											if(f.removeEmployee(e2)){
												System.out.println("Employee ID " +empId2 +" Removed Successfully.");
											}
											else{System.out.println("Employee can not be removed now. Try again later");}
										}
										else{System.out.println("No Employee found.");}
									}
									else{System.out.println("Account is not deleted. Thanks for come back");}


									System.out.println("\n\n#######################################################\n\n");

								break;
							case 3: 


									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Show All Employee");
									System.out.println("-------------------------------------------");

									f.showAllEmployees();


									System.out.println("\n\n#######################################################\n\n");

								break;

							case 4 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Search Employee");
									System.out.println("-------------------------------------------");
									
									System.out.print("Employee  ID: ");
									String empId4 = sc.next();

									Employee e4 = f.searchEmployee(empId4);

									if(e4!= null){
										System.out.println("\n\n---------------------------------------------------\n");
										System.out.println("Employee has been founded.");
										System.out.println("Employee ID : "+e4.getEmpId());
										System.out.println("Employee Name : "+e4.getName());
										System.out.println("Employee Salary : "+e4.getSalary());
										System.out.println("\n---------------------------------------------------\n");
									}
									else{System.out.println("No Employee found.");}


									System.out.println("\n\n#######################################################\n\n");

								break;

							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");


									System.out.println("\n\n#######################################################\n\n");

								break;

							default :
						

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");


									System.out.println("\n\n#######################################################\n\n");

						
								break;
						}

					break;

				case 2 :

						System.out.println("\n\n-------------------------------------------");
						System.out.println("You have chose Pharmacy Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Pharmacy");
						System.out.println("\t2. Remove Existing Pharmacy");
						System.out.println("\t3. Show All Pharmacy");
						System.out.println("\t4. Search a Pharmacy");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						int choice2 = sc.nextInt();


						switch(choice2){
							case 1: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Insert New Pharmacy");
									System.out.println("-------------------------------------------");
							
									System.out.print("Pharmacy  ID: ");
									String rid1 = sc.next();
									System.out.print("Pharmacy Name: ");
									String name1 = sc.next();

									Pharmacy r1 = new Pharmacy(rid1, name1);

									if(f.insertPharmacy(r1)){
										System.out.print("Pharmacy Inserted Successfully.");
										System.out.print("Name "+ name1+ ",  Id  "+rid1);
									}
									else{System.out.println("Pharmacy can not be created now. Try again later");}

									System.out.println("\n\n#######################################################\n\n");

								break;

							case 2 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Remove Pharmacy");
									System.out.println("-------------------------------------------");
							
									System.out.print("Pharmacy  ID: ");
									String rid2 = sc.next();

									Pharmacy r2 = f.searchPharmacy(rid2);

									System.out.println("Are You sure you want to delete this Pharmacy? ");
									System.out.print("Press 1 to delete Pharmacy ");

									int delete = sc.nextInt();

									if(delete==1){

										if(r2 != null){
											if(f.removePharmacy(r2)){
												System.out.print("Pharmacy ID " + rid2+ " Removed Successfully.");
											}
											else{System.out.println("Pharmacy can not be removed now. Try again later");}
										}
										else{System.out.println("No Pharmacy found.");}
									}
									else{System.out.println("Account is not deleted. Thanks for come back");}
									System.out.println("\n\n#######################################################\n\n");

								break;
							case 3: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Show All Pharmacy");
									System.out.println("-------------------------------------------");

									f.showAllPharmacy();

									System.out.println("\n\n#######################################################\n\n");

								break;

							case 4 :

									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Search Pharmacy");
									System.out.println("-------------------------------------------");
									
									System.out.print("Pharmacy  ID: ");
									String rid4 = sc.next();

									Pharmacy r4 = f.searchPharmacy(rid4);

									if(r4!= null){
										System.out.println("Pharmacy has been founded.");
										System.out.println("---------------------------------------------");
										System.out.println("Pharmacy ID : "+r4.getPid());
										System.out.println("Pharmacy Name : "+r4.getName());
										System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
										r4.showAllMedicineItem();
										System.out.println("---------------------------------------------");
									}
									else{System.out.println("No Pharmacy found.");}
									System.out.println("\n\n#######################################################\n\n");

								break;

							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

						
								break;
						}

					break;

				case 3: 

						System.out.println("\n\n-------------------------------------------");
						System.out.println("You have chose Pharmacy Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Medicine Item");
						System.out.println("\t2. Remove Existing Medicine Item");
						System.out.println("\t3. Show All Medicine Item");
						System.out.println("\t4. Search a Medicine Item");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						int choice3 = sc.nextInt();


						switch(choice3){

							case 1: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have choose to Insert New Medicine Items");
									System.out.println("-------------------------------------------\n");

									System.out.print("Pharmacy ID: ");
									String rid3 = sc.next();

									if(f.searchPharmacy(rid3) != null){

										System.out.println("Which types of Medicine do you want to insert ?");
										System.out.println("\t1. Main Dish");
										System.out.println("\t2. Appitizers");
										System.out.println("\t3. Go Back");
								
										System.out.print("Enter Medicine Type: ");
										int choice31 = sc.nextInt();

										switch(choice31){
											case 1: 
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Medicine Id : ");
													String fid31 = sc.next();

													System.out.print("Medicine Name: ");
													String name31 = sc.next();

													System.out.print("Available Quantity : ");
													int availableQuantity31 = sc.nextInt();
									
													System.out.print("Medicine Price : ");
													double price31 = sc.nextDouble();
									
													System.out.print("Medicine Category : ");
													String category31 = sc.next();

													MedicineItem m31 = new Paracetamol(fid31,name31,availableQuantity31 ,price31, category31 );
													
													if(f.searchPharmacy(rid3).insertMedicineItem(m31))
													{
														System.out.println("Medicine Id Number "+ fid31 +" inserted for "+ rid3);
													}
													else
													{
														System.out.println("Medicine Item Can Not be inserted");
													}

													System.out.println("\n\n#######################################################\n\n");
													

												break;

											case 2 :

													
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Medicine Id : ");
													String fid32 = sc.next();

													System.out.print("Medicine Name: ");
													String name32 = sc.next();

													System.out.print("Available Quantity : ");
													int availableQuantity32 = sc.nextInt();
									
													System.out.print("Medicine Price : ");
													double price32 = sc.nextDouble();
									
													System.out.print("Medicine Size : ");
													String size32 = sc.next();

													MedicineItem m32 = new Antibiotics(fid32,name32, availableQuantity32 ,price32, size32  );

													if(f.searchPharmacy(rid3).insertMedicineItem(m32))
													{
														System.out.println("Medicine Id Number "+ fid32 +" inserted for "+ rid3);
													}
													else
													{
														System.out.println("Medicine Item Can Not be inserted");
													}

													System.out.println("\n\n#######################################################\n\n");
													

												break;

											case 3: 
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("Going Back to the main menu...............");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n#######################################################\n\n");
													

												break;

											default: 

													
													System.out.println("\n\n#######################################################\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("Invalid option . Try again...............");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n#######################################################\n\n");
													

												break;
											}
										}

									else{System.out.println("Medicine Id does not match. Try again.");}

												
								break;
			
							case 2 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have choose to Remove Medicine Items");
									System.out.println("-------------------------------------------\n\n");

									System.out.print("Pharmacy ID: ");
									String rid322 = sc.next();

									if(f.searchPharmacy(rid322) != null){
									Pharmacy r322 = f.searchPharmacy(rid322);
									System.out.print("Medicine Item  ID: ");
									String fid322 = sc.next();

									MedicineItem f322 = r322.searchMedicineItem(fid322);

										if(f322!= null){
											System.out.println("Are You sure you want to delete this Medicine Item? ");
											System.out.print("Press 1 to delete Medicine Item ");

											int delete = sc.nextInt();

											if(delete==1){
												if(r322.removeMedicineItem(f322)){
													System.out.print("Medicine Item Removed Successfully.");
												}
												else{System.out.println("Medicine Item can not be removed now. Try again later");}
												}
										
											else{System.out.println("Account is not deleted. Thanks for come back");}
											}
										else{System.out.println("No Medicine Item found.");}
									}
									else{System.out.println("No Pharmacy found.");}


									System.out.println("\n\n#######################################################\n\n");
													
									break;

							case 3: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Show All Medicine Item");
									System.out.println("-------------------------------------------\n\n");


									System.out.print("Pharmacy  ID: ");
									String rid332 = sc.next();

									Pharmacy r332 = f.searchPharmacy(rid332);

									if(f.searchPharmacy(rid332)!=null){
									System.out.println("Pharmacy has been founded.");
									r332.showAllMedicineItem();
									}

									else{System.out.println("No Pharmacy found.");}
									System.out.println("\n\n#######################################################\n\n");

								break;
			
							case 4 : 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Search Medicine Item");
									System.out.println("-------------------------------------------\n\n");
									
									System.out.print("Pharmacy ID: ");
									String rid44 = sc.next();

									if(f.searchPharmacy(rid44) != null){
									Pharmacy r44 = f.searchPharmacy(rid44);
									System.out.print("Medicine Item  ID: ");
									String fid44 = sc.next();

									MedicineItem f44 = r44.searchMedicineItem(fid44);

									if(f44!= null){
										System.out.println("MedicineItem has been founded.");
										System.out.println("\n-------------------------------------------\n");
										r44.showAllMedicineItem();
										System.out.println("\n-------------------------------------------\n");
									}
									else{System.out.println("No MedicineItem found.");}
									}

									else{System.out.println("No Pharmacy found.");}

									System.out.println("\n\n#######################################################\n\n");
			
								break;
							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");
			
								break;
			
							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");
			
								break;
						}



					break;

				case 4 :
						System.out.println("-------------------------------------------");
						System.out.println("You have chose MedicineItem Quantity Add-Sell");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Add  Medicine Item");
						System.out.println("\t2. Sell  Medicine Item");
						System.out.println("\t3. Show Add Sell History");
						System.out.println("\t4. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						int choice4 = sc.nextInt();
						switch(choice4){
							case 1: 
								System.out.println("\n\n#######################################################\n\n");
								System.out.println("-------------------------------------------");
								System.out.println("You have chose to Add Medicine Item");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Pharmacy ID: ");
								
								String rid411 = sc.next();

								if(f.searchPharmacy(rid411) != null){

									System.out.print("Enter Medicine Item ID: ");
								
									String fid411 = sc.next();

									if(f.searchPharmacy(rid411).searchMedicineItem(fid411) != null){

										System.out.print("Added Medicine Items Quantity : ");
										int amount1 = sc.nextInt();
										if(f.searchPharmacy(rid411).searchMedicineItem(fid411).addQuantity(amount1)){

										System.out.println("Medicine Amount Added ....");
										frwd.writeInFile("Amount : " +amount1 + "  added in "+ fid411+ " by "+ rid411);
										}
										else{System.out.println("Can Not Added");}
									}
									else{System.out.println("Invalid Medicine Item Id Number");}

								}
								else{System.out.println("Pharmacy ID  does not MISMATCH");}
								System.out.println("\n\n#######################################################\n\n");


								break;

							case 2 : 
								System.out.println("\n\n#######################################################\n\n");
								System.out.println("-------------------------------------------");
								System.out.println("You have chose to Sell Medicine Item");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Pharmacy ID: ");
								
								String rid412 = sc.next();

								if(f.searchPharmacy(rid412) != null){

									System.out.print("Enter Medicine Item ID: ");
								
									String fid412 = sc.next();

									if(f.searchPharmacy(rid412).searchMedicineItem(fid412) != null){

										System.out.print("Selled Medicine Item Quantity : ");
										int amount2 = sc.nextInt();
										if(f.searchPharmacy(rid412).searchMedicineItem(fid412).sellQuantity(amount2)){

										System.out.println("Medicine Item Selled ....");
										frwd.writeInFile("Amount : " +amount2 + "Selled in "+ fid412+ " by "+ rid412);
										}
										else{System.out.println("Can Not Selled");}
									}
									else{System.out.println("Invalid Medicine Item Id Number");}

								}
								else{System.out.println("Pharmacy ID  does not MISMATCH");}

								break;
							case 3: 
								System.out.println("\n\n#######################################################\n\n"); 
								System.out.println("-------------------------------------------");
								System.out.println("You have chose to Show ADD SELL History");
								System.out.println("-------------------------------------------");

								frwd.readFromFile();
								System.out.println("\n\n#######################################################\n\n");

								break;

							case 4 :
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");


								break;
							}			

					break;
				case 5: 
						
						System.out.println("\n\n#######################################################\n\n");
						repeat=false;
						System.out.println("-------------------------------------------");
						System.out.println("Thanks for being with us...............");
						System.out.println("-------------------------------------------");
						System.out.println("\n\n#######################################################\n\n");
						
					break;

				default :

						
						System.out.println("\n\n#######################################################\n\n");
						System.out.println("-------------------------------------------");
						System.out.println("Invalid option . Try again...............");
						System.out.println("-------------------------------------------");
						System.out.println("\n\n#######################################################\n\n");


					break;

			}

		}
	}
	else 
		{
			System.out.println("\t Invalid Password:");
		};
	
}




		
		}
		
		
		
			 
		
		