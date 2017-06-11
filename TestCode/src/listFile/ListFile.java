package listFile;

import java.io.File;

public class ListFile {

	public static void main(String[] args) {
		File file = new File("e:");
		list(file);
	}
	
	public static void list(File file){
		if(file.isDirectory()){
			File[] f = file.listFiles();
			if(f != null){
				for(int i=0; i<f.length; i++){
					list(f[i]);
				}
			}
		}
		System.out.println(file);
		
	}

}
