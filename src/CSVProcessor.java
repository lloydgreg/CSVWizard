import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CSVProcessor {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		System.out.println("What country would you like the postcodes for? ");
		String country = reader.nextLine();
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin/Desktop//" + saveFileName + ".csv"), ',','"');
		CSVReader beanReader = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//sweden.csv"), "UTF-8"), ",".charAt(0), '"');
		List<String[]> theCSV = beanReader.readAll();
		List<String[]> countrySpecific = new ArrayList<String[]>();
		for(String[] st : theCSV){
			String[] currentLine = new String[11];
			if(st[0].equals(country)){
				currentLine[0] = st[0];
				currentLine[1] = st[1].replace(" ", "");
				System.out.println(st[2]);
				currentLine[2] = st[2];
				currentLine[3] = st[3];
				currentLine[4] = st[4];
				currentLine[5] = st[5];
				currentLine[6] = st[6];
				currentLine[7] = st[7];
				currentLine[8] = st[8];
				currentLine[9] = st[9];
				currentLine[10] = st[10];
			}else{
				continue;
			}
			countrySpecific.add(currentLine);
		}
		System.out.println("Finished Reading...File Created");
		writer.writeAll(countrySpecific);
		writer.close();
		reader.close();
	}
	
	public static void createPostcodeCSV() throws IOException {
		Scanner reader = new Scanner(System.in);
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin/Desktop//" + saveFileName + ".csv"), ',','"');
		CSVReader beanReader = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//postcodes.csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String> formatted = new ArrayList<String>();
		List<String[]> theCSV = beanReader.readAll();
		for(String[] st : theCSV){
			st[0] = st[0].replace(" ","");
			if(st[0].contains("-")){
				int lowValue = Integer.valueOf(st[0].split("-")[0]);
				int highValue = Integer.valueOf(st[0].split("-")[1]);
				formatted.add(String.valueOf(lowValue));
				formatted.add(String.valueOf(highValue));
				int currentNumber = lowValue;
				System.out.println("Number is range   -----");
				System.out.println("Low Value is -- " + lowValue);
				while(currentNumber < highValue){
					currentNumber ++;
					formatted.add(String.valueOf(currentNumber));
					System.out.println("Number in between is -- " + currentNumber);
				}
				System.out.println("High Value is -- " + highValue);
			}else{
				System.out.println("Number is Straight PCode   -----");
				System.out.println("PCODE is -- " + st[0]);
				formatted.add(st[0]);
			}
		}
		List<String[]> formattedPostcode = new ArrayList<String[]>();
		for(String st : formatted){
			String[] currentLine = new String[4];
			currentLine[0] = st;
			currentLine[1] = "Town Name";
			formattedPostcode.add(currentLine);
		}
		writer.writeAll(formattedPostcode);
		writer.close();
		reader.close();
	}
	
	public static void createDodgyJobCSV() throws IOException {
		Scanner reader =  new Scanner(System.in);
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin//Desktop//" + saveFileName + ".csv"), ',', '"');
		List<String[]> DownloadList = new ArrayList<String[]>();
		reader.close();
		String testString = getRandomPromptWithSymbols();
		int iCount = 1;
		while(iCount < 16){
			String[] currentLine = new String[90];
			//---------------------------A - Z
			currentLine[0] = "CS";
			currentLine[1] = "Express";
			currentLine[2] = "CLI1";
			currentLine[3] = testString;
			currentLine[4] = testString;
			currentLine[5] = testString;
			currentLine[6] = testString;
			currentLine[7] = testString;
			currentLine[8] = testString;
			currentLine[9] = testString;
			currentLine[10] = testString;
			currentLine[11] = testString;
			currentLine[12] = testString;
			currentLine[13] = testString;
			currentLine[14] = testString;
			currentLine[15] = testString;
			currentLine[16] = testString;
			
			//-----------------------------------Collection Address
			//Company
			currentLine[17] = testString;
			//Address Line 1
			currentLine[18] = "Address Line 1 : " + iCount;
			//Address Line 2
			currentLine[19] = "Address Line 2 : " + iCount;
			//Address Line 3
			currentLine[20] = "Address Line 3 : " + iCount;
			//Address Line 4
			currentLine[21] = "Address Line 4 : " + iCount;
			//Address Line Postcode
			currentLine[22] = testString;
			//Collection Place
			currentLine[23] = "London";
			//Collection Country
			currentLine[24] = "GB";
			//Address Line Code
			currentLine[25] = testString;
			
			
			//---------------------------AA - AZ
			currentLine[26] = testString;
			currentLine[27] = testString;
			currentLine[28] = testString;
			currentLine[29] = testString;
			currentLine[30] = testString;
			currentLine[31] = testString;
			currentLine[32] = testString;
			currentLine[33] = testString;
			currentLine[34] = testString;
			currentLine[35] = testString;
			currentLine[36] = testString;
			currentLine[37] = testString;
			currentLine[38] = testString;
			currentLine[39] = testString;
			currentLine[40] = testString;
			currentLine[41] = testString;
			currentLine[42] = testString;
			//Collection Place
			currentLine[43] = "W14";
			//Collection Country
			currentLine[44] = "GB";
			currentLine[45] = testString;
			currentLine[46] = testString;
			currentLine[47] = testString;
			currentLine[48] = testString;
			currentLine[49] = testString;
			currentLine[50] = testString;
			currentLine[51] = testString;
			//---------------------------BA - CB
			currentLine[52] = testString;
			currentLine[53] = testString;
			currentLine[54] = testString;
			currentLine[55] = testString;
			currentLine[56] = testString;
			currentLine[57] = testString;
			currentLine[58] = testString;
			currentLine[59] = testString;
			currentLine[60] = testString;
			//Contents Type
			currentLine[61] = "Document";
			currentLine[62] = String.valueOf(iCount);
			currentLine[63] = testString;
			currentLine[64] = testString;
			currentLine[65] = testString;
			currentLine[66] = testString;
			currentLine[67] = testString;
			currentLine[68] = testString;
			currentLine[69] = testString;
			currentLine[70] = testString;
			currentLine[71] = testString;
			currentLine[72] = testString;
			currentLine[73] = testString;
			currentLine[74] = testString;
			currentLine[75] = testString;
			currentLine[76] = testString;
			currentLine[77] = testString;
			System.out.println("Writing Line.....  " + iCount);
			iCount ++;
			DownloadList.add(currentLine);
		}
		writer.writeAll(DownloadList);
		writer.close();
		
	}
	
	public static String getRandomPromptWithSymbols() {

		char[] chars = "abcdefghijklmnopqrstuvwxyz123456789@!".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 15; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String ranPrompt = sb.toString();

		return ranPrompt;
	}
	
	public static void createNonExistingPlaces() throws IOException{
		// TODO Auto-generated method stub

		CSVReader beanReader = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//placeFile.csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String[]> theCSV = beanReader.readAll();
		HashMap<String, String> placeMap = new HashMap<String,String>();
		for(String[] st : theCSV){
			placeMap.put(st[0].trim().toUpperCase(), "1");
		}
		beanReader.close();
		Scanner reader =  new Scanner(System.in);
		System.out.println("Please enter the Check file name : ");
		String fileName = reader.nextLine();
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin//Desktop//" + saveFileName + ".csv"), ',', '"');
		List<String[]> DownloadList = new ArrayList<String[]>();
		CSVReader beanReader2 = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//" + fileName +".csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String[]> theCSV2 =beanReader2.readAll();
		
		System.out.println("Ignore Header? Y/N");
		String ignore = reader.nextLine();
		if("Y".equalsIgnoreCase(ignore)) theCSV2.remove(0);
		for(String[] st : theCSV2){
			String[] currentLine = new String[14];
			if(!placeMap.containsKey(st[1].trim().toUpperCase())){
				currentLine[0] = st[1];
				currentLine[1] = "";
				currentLine[2] = "GB";
				currentLine[3] = "CT";
				currentLine[4] = "";
				currentLine[5] = "";
				currentLine[6] = "";
				currentLine[7] = "";
				currentLine[8] = "";
				currentLine[9] = "";
				currentLine[10] = "";
				currentLine[11] = "";
				currentLine[12] = "";
				currentLine[13] = "";
			}else{
				continue;
			}
			DownloadList.add(currentLine);
			System.out.println(currentLine);
		}
		beanReader2.close();
		writer.writeAll(DownloadList);
		writer.close();
	}
	
	public static void createAllocationFileSaturday() throws IOException{
		Scanner reader =  new Scanner(System.in);
		System.out.println("Please enter the file name to read : ");
		String fileName = reader.nextLine();
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin//Desktop//dhlSaturday.csv"), ',', '"');
		
		List<String[]> DownloadList = new ArrayList<String[]>();
		CSVReader beanReader2 = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//" + fileName +".csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String[]> theCSV2 =beanReader2.readAll();
		
		System.out.println("Ignore Header? Y/N");
		String ignore = reader.nextLine();
		if("Y".equalsIgnoreCase(ignore)) theCSV2.remove(0);
		for(String[] st : theCSV2){
			String[] currentLine = new String[6];
			
			currentLine[0] = "DHL-GB-SAT";
			int numDigits = countDigits(st[1]);
			if(countCharacters(st[1]) > 1){
				numDigits ++;
			}
			currentLine[1] = st[1].substring(0, numDigits);
			currentLine[3] = "GB";
			currentLine[4] = "DZ";
			currentLine[5] = "Standard";
			
			DownloadList.add(currentLine);
			System.out.println(currentLine);
		}
		beanReader2.close();
		writer.writeAll(DownloadList);
		writer.close();
	}

	public static void createAllocationFilePre9pRE12() throws IOException{

		Scanner reader =  new Scanner(System.in);
		System.out.println("Please enter the file name to read : ");
		String fileName = reader.nextLine();
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin//Desktop//dhlpre9and12.csv"), ',', '"');
		
		List<String[]> DownloadList = new ArrayList<String[]>();
		CSVReader beanReader2 = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//" + fileName +".csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String[]> theCSV2 =beanReader2.readAll();
		
		System.out.println("Ignore Header? Y/N");
		String ignore = reader.nextLine();
		if("Y".equalsIgnoreCase(ignore)) theCSV2.remove(0);
		for(String[] st : theCSV2){
			String[] currentLine = new String[6];
			String[] pre9Line = new String[6];
			if("900".equals(st[2])){
				pre9Line[0] = "DHL-GB-PRE09";
				int numDigits = countDigits(st[1]);
				if(countCharacters(st[1]) > 1){
					numDigits ++;
				}
				pre9Line[1] = st[1].substring(0, numDigits);
				pre9Line[3] = "GB";
				pre9Line[4] = "DZ";
				pre9Line[5] = "Standard";
				DownloadList.add(pre9Line);
				currentLine[0] = "DHL-GB-PRE12";
				numDigits = countDigits(st[1]);
				if(countCharacters(st[1]) > 1){
					numDigits ++;
				}
				currentLine[1] = st[1].substring(0, numDigits);
				currentLine[3] = "GB";
				currentLine[4] = "DZ";
				currentLine[5] = "Standard";
			}
			else{
				currentLine[0] = "DHL-GB-PRE12";
					int numDigits = countDigits(st[1]);
					if(countCharacters(st[1]) > 1){
						numDigits ++;
					}
					currentLine[1] = st[1].substring(0, numDigits);
					currentLine[3] = "GB";
					currentLine[4] = "DZ";
					currentLine[5] = "Standard";
			}
			DownloadList.add(currentLine);
			System.out.println(currentLine);
		}
		beanReader2.close();
		writer.writeAll(DownloadList);
		writer.close();
	}
	
	public static int countDigits(String s){
		int count = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
		    if (Character.isDigit(s.charAt(i))) {
		        count++;
		    }
		}
		return count;
	}
	
	public static int countCharacters(String s){
		int count = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
		    if (Character.isAlphabetic(s.charAt(i))) {
		        count++;
		    }
		}
		return count;
	}
	
	public void createHolidayFile() throws IOException{
		// TODO Auto-generated method stub

		CSVReader beanReader = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//CC.csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String[]> theCSV = beanReader.readAll();
		HashMap<String, String> countryMap = new HashMap<String,String>();
		for(String[] st : theCSV){
			countryMap.put(st[0].trim().toUpperCase(), st[1]);
		}
		beanReader.close();
		Scanner reader =  new Scanner(System.in);
		System.out.println("Please enter the allocation file name : ");
		String fileName = reader.nextLine();
		System.out.println("What would you like to call the new file? ");
		String saveFileName = reader.nextLine();
		CSVWriter writer = new CSVWriter(new FileWriter("//Users//admin//Desktop//" + saveFileName + ".csv"), ',', '"');
		List<String[]> DownloadList = new ArrayList<String[]>();
		CSVReader beanReader2 = new CSVReader(new InputStreamReader(
				new FileInputStream("//Users//admin//Desktop//" + fileName +".csv"), "ISO-8859-1"), ",".charAt(0), '"');
		List<String[]> theCSV2 =beanReader2.readAll();
		
		System.out.println("Ignore Header? Y/N");
		String ignore = reader.nextLine();
		if("Y".equalsIgnoreCase(ignore)) theCSV2.remove(0);
		for(String[] st : theCSV2){
			String[] currentLine = new String[6];
			currentLine[0] = st[0];
			if(countryMap.containsKey(st[1].toUpperCase().trim())){
				currentLine[3] = countryMap.get(st[1].toUpperCase().trim());
			}else{
				currentLine[3] = st[1];
			}
			String[] date = st[2].split("-");
			String fromDate = date[2].split("T")[0] + "/" + date[1] + "/" + date[0];
			currentLine[1] = fromDate;
			currentLine[2] = fromDate;
			DownloadList.add(currentLine);
			System.out.println(currentLine);
		}
		beanReader2.close();
		writer.writeAll(DownloadList);
		writer.close();
	}
}
