package HelperFunction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class InputFile {
	private String filepath;
	private BufferedReader br;
	private Vector<String> getlineList;

	public InputFile(String filepath) {
		this.filepath = filepath;
		getlineList = new Vector<String>();
		try {
			br = new BufferedReader(new FileReader(filepath));
			while(br.ready()) {
				String getline = br.readLine();
				getlineList.add(getline);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}	finally {
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Vector<String> getVectorString() {
		return getlineList;
	}
}
