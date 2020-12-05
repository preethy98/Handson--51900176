package com.hcl.task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		String[] details = null;
		String line = " ";
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\PREETHY\\Desktop\\data.csv"));
			pw = new PrintWriter(new FileWriter("C:\\Users\\PREETHY\\Desktop\\data.csv"));
			User user = new User();

			System.out.println("Enter the number of users to be added :");
			int no = s.nextInt();
			s.nextLine();
			String[] det = new String[no];
			String[] detail = null;
			for (int i = 0; i < no; i++) {
				System.out.println("Enter the user" + (i + 1) + "detail in csv form");
				det[i] = s.nextLine();
			}
			for (int i = 0; i < det.length; i++) {
				detail = det[i].split(",");
				user.setName(detail[0]);
				user.setUserName(detail[1]);
				user.setEmail(detail[2]);
				user.setContactNumber(detail[3]);
				user.display();
			}
			UserBO obj = new UserBO(user);
			if (obj.getList() != null) {
				pw.print(obj.getList());
				pw.flush();
			}
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				br.close();
		}
	}

}
