package ar.com.educacionit.generic;

public abstract class BaseFile {

	protected String filePath;//alt+shit+r

	public BaseFile(String path) {
		if(path == null) {
			throw new IllegalArgumentException("Debe indicar un path de archivo");
		}
		this.filePath = path;
	}

	public String getFilePath() {
		
		//hay l�gica
		if(filePath == null) {
			//uso path por defecto...
		}
		
		return filePath;
	}

}