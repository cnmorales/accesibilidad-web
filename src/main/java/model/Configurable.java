package model;

public enum Configurable {
	
	permite,
	noPermite;
	
	public Boolean isa(Configurable configurable) {
		
		return this.toString() == configurable.toString();
		
	}

}
