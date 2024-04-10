import java.util.Scanner;
class MovieTicket
{
	public static void main(String[] args) 
	{
		Scanner gk = new Scanner(System.in);
		System.out.println("Which movie you want to watch : \n1. Jawan \n2. Jailer \n3. Gadar2 \n4. OMG 2");
        System.out.print("select movie by number : ");
		int i = gk.nextInt();
		if (i==1)
		{
		  System.out.print("You selected 1.Jawan \nLocation :\n1. Gurugram \n2. Delhi \n3. New Delhi \n4. Noida \nselect location:");
		  int j = gk.nextInt();
		  if (j==1 || j==2 || j==3 || j==4)
		  {
			 System.out.print("Theatre:\n1. Ambuja mall \n2. City centre mall \n3. 36 mall \nselect Theatre:");
			 int k = gk.nextInt();
			 if (k==1 || k==2 || k==3)
			 {
				System.out.println("Book your tickets : ");

				System.out.println("Platinum:250rs/-");
				System.out.println("F. 51 52 53 54 55 56 57 58 59 60 \nE. 41 42 33 44 45 46 47 48 49 50");
				System.out.println("Gold:200rs/-");
				System.out.println("D. 31 32 33 34 35 36 37 38 39 40 \nC. 21 22 23 24 25 26 27 28 29 30");
				System.out.println("silver:150rs/-");
				System.out.println("B. 11 12 13 14 15 16 17 18 19 20 \nA. 1 2 3 4 5 6 7 8 9 10");
				System.out.print("How many tickets you want to book:");
				int l = gk.nextInt();
				for (int m = 1;m<=l ;m++ )
				{
					System.out.println("Enter the ticket number:");
					int a = gk.nextInt();

				}
				if (l>=1 && l<=60)
				{
					System.out.print("select category:\n1. Platinum:250rs/- \n2. Gold:200rs/- \n3. silver:150rs/- \nselect by number:");
					int m = gk.nextInt();
					if (m>=1 && m<=3) 
					{
						if (m==1)
						{	int n = l*250;
							System.out.println("You selected "+l+" ticket for Platinum \nToatal amount:"+(n));
							System.out.print("Press \"1\" for confirm:");
				            int op = gk.nextInt();
					        if (op==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
					    }
						else if (m==2)
						{
							int p = l*200;
							System.out.println("You selected "+l+" ticket for Gold \nToatal amount:"+(p));
							System.out.print("Press \"1\" for confirm:");
				            int q = gk.nextInt();
					        if (q==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }

						}
						else if (m==3)
						{
							int r = l*150;
							System.out.println("You selected "+l+" ticket for Silver \nToatal amount:"+(r));
							System.out.print("Press \"1\" for confirm:");
				            int s = gk.nextInt();
					        if (s==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
						}
					}
					    else 
					    {
						      System.out.println("sorry:invailid input Try Again. ");
					    }
				}
				else 
				 {
					System.out.println("sorry:invailid input Try Again. ");
				 }
				

			 }
		  }

		}
		if (i==2)
		{
		  System.out.print("You selected 2.Jailer \nLocation :\n1. Gurugram \n2. Delhi \n3. New Delhi \n4. Noida \nselect location:");
		  int j = gk.nextInt();
		  if (j==1 || j==2 || j==3 || j==4)
		  {
			 System.out.print("Theatre:\n1. Ambuja mall \n2. City centre mall \n3. 36 mall \nselect Theatre:");
			 int k = gk.nextInt();
			 if (k==1 || k==2 || k==3)
			 {
				System.out.println("Book your tickets : ");

				System.out.println("Platinum:250rs/-");
				System.out.println("F. 51 52 53 54 55 56 57 58 59 60 \nE. 41 42 33 44 45 46 47 48 49 50");
				System.out.println("Gold:200rs/-");
				System.out.println("D. 31 32 33 34 35 36 37 38 39 40 \nC. 21 22 23 24 25 26 27 28 29 30");
				System.out.println("silver:150rs/-");
				System.out.println("B. 11 12 13 14 15 16 17 18 19 20 \nA. 1 2 3 4 5 6 7 8 9 10");
				System.out.print("How many tickets you want to book:");
				int l = gk.nextInt();
				if (l>=1 && l<=60)
				{
					System.out.print("select category:\n1. Platinum:250rs/- \n2. Gold:200rs/- \n3. silver:150rs/- \nselect by number:");
					int m = gk.nextInt();
					if (m>=1 && m<=3) 
					{
						if (m==1)
						{	int n = l*250;
							System.out.println("You selected "+l+" ticket for Platinum \nToatal amount:"+(n));
							System.out.print("Press \"1\" for confirm:");
				            int op = gk.nextInt();
					        if (op==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
					    }
						else if (m==2)
						{
							int p = l*200;
							System.out.println("You selected "+l+" ticket for Gold \nToatal amount:"+(p));
							System.out.print("Press \"1\" for confirm:");
				            int q = gk.nextInt();
					        if (q==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }

						}
						else if (m==3)
						{
							int r = l*150;
							System.out.println("You selected "+l+" ticket for Silver \nToatal amount:"+(r));
							System.out.print("Press \"1\" for confirm:");
				            int s = gk.nextInt();
					        if (s==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
						}
					}
					    else 
					    {
						      System.out.println("sorry:invailid input Try Again. ");
					    }
				}
				else 
				 {
					System.out.println("sorry:invailid input Try Again. ");
				 }
				

			 }
		  }

		}
		if (i==3)
		{
		  System.out.print("You selected 3. Gadar2 \nLocation :\n1. Gurugram \n2. Delhi \n3. New Delhi \n4. Noida \nselect location:");
		  int j = gk.nextInt();
		  if (j==1 || j==2 || j==3 || j==4)
		  {
			 System.out.print("Theatre:\n1. Ambuja mall \n2. City centre mall \n3. 36 mall \nselect Theatre:");
			 int k = gk.nextInt();
			 if (k==1 || k==2 || k==3)
			 {
				System.out.println("Book your tickets : ");

				System.out.println("Platinum:250rs/-");
				System.out.println("F. 51 52 53 54 55 56 57 58 59 60 \nE. 41 42 33 44 45 46 47 48 49 50");
				System.out.println("Gold:200rs/-");
				System.out.println("D. 31 32 33 34 35 36 37 38 39 40 \nC. 21 22 23 24 25 26 27 28 29 30");
				System.out.println("silver:150rs/-");
				System.out.println("B. 11 12 13 14 15 16 17 18 19 20 \nA. 1 2 3 4 5 6 7 8 9 10");
				System.out.print("How many tickets you want to book:");
				int l = gk.nextInt();
				if (l>=1 && l<=60)
				{
					System.out.print("select category:\n1. Platinum:250rs/- \n2. Gold:200rs/- \n3. silver:150rs/- \nselect by number:");
					int m = gk.nextInt();
					if (m>=1 && m<=3) 
					{
						if (m==1)
						{	int n = l*250;
							System.out.println("You selected "+l+" ticket for Platinum \nToatal amount:"+(n));
							System.out.print("Press \"1\" for confirm:");
				            int op = gk.nextInt();
					        if (op==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
					    }
						else if (m==2)
						{
							int p = l*200;
							System.out.println("You selected "+l+" ticket for Gold \nToatal amount:"+(p));
							System.out.print("Press \"1\" for confirm:");
				            int q = gk.nextInt();
					        if (q==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }

						}
						else if (m==3)
						{
							int r = l*150;
							System.out.println("You selected "+l+" ticket for Silver \nToatal amount:"+(r));
							System.out.print("Press \"1\" for confirm:");
				            int s = gk.nextInt();
					        if (s==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
						}
					}
					    else 
					    {
						      System.out.println("sorry:invailid input Try Again. ");
					    }
				}
				else 
				 {
					System.out.println("sorry:invailid input Try Again. ");
				 }
				

			 }
		  }

		}
		if (i==4)
		{
		  System.out.print("You selected 4. OMG 2 \nLocation :\n1. Gurugram \n2. Delhi \n3. New Delhi \n4. Noida \nselect location:");
		  int j = gk.nextInt();
		  if (j==1 || j==2 || j==3 || j==4)
		  {
			 System.out.print("Theatre:\n1. Ambuja mall \n2. City centre mall \n3. 36 mall \nselect Theatre:");
			 int k = gk.nextInt();
			 if (k==1 || k==2 || k==3)
			 {
				System.out.println("Book your tickets : ");

				System.out.println("Platinum:250rs/-");
				System.out.println("F. 51 52 53 54 55 56 57 58 59 60 \nE. 41 42 33 44 45 46 47 48 49 50");
				System.out.println("Gold:200rs/-");
				System.out.println("D. 31 32 33 34 35 36 37 38 39 40 \nC. 21 22 23 24 25 26 27 28 29 30");
				System.out.println("silver:150rs/-");
				System.out.println("B. 11 12 13 14 15 16 17 18 19 20 \nA. 1 2 3 4 5 6 7 8 9 10");
				System.out.print("How many tickets you want to book:");
				int l = gk.nextInt();
				if (l>=1 && l<=60)
				{
					System.out.print("select category:\n1. Platinum:250rs/- \n2. Gold:200rs/- \n3. silver:150rs/- \nselect by number:");
					int m = gk.nextInt();
					if (m>=1 && m<=3) 
					{
						if (m==1)
						{	int n = l*250;
							System.out.println("You selected "+l+" ticket for Platinum \nToatal amount:"+(n));
							System.out.print("Press \"1\" for confirm:");
				            int op = gk.nextInt();
					        if (op==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
					    }
						else if (m==2)
						{
							int p = l*200;
							System.out.println("You selected "+l+" ticket for Gold \nToatal amount:"+(p));
							System.out.print("Press \"1\" for confirm:");
				            int q = gk.nextInt();
					        if (q==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }

						}
						else if (m==3)
						{
							int r = l*150;
							System.out.println("You selected "+l+" ticket for Silver \nToatal amount:"+(r));
							System.out.print("Press \"1\" for confirm:");
				            int s = gk.nextInt();
					        if (s==1)
					        {
					          System.out.println("Booking Successful Enjoy Your Movie.");
					        }
					        else
				            {
					          System.out.println("sorry payment not successful try again....");
						    }
						}
					}
					    else 
					    {
						      System.out.println("sorry:invailid input Try Again. ");
					    }
				}
				else 
				 {
					System.out.println("sorry:invailid input Try Again. ");
				 }
				

			 }
		  }

		}
		else 
		{
			System.out.println("sorry:invalid input try again.");
		}



	}
}
