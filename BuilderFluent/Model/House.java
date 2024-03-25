package BuilderFluent.Model;

import BuilderFluent.TypeHouse;

public class House {
	private int windows;
	private int doors;
	private boolean hasGarage;
	private boolean hasPool;
	private boolean hasGarden;
	private boolean hasStatues;
	private TypeHouse typeHouse;

	public House(int windows, int doors, boolean hasGarage, boolean hasPool, boolean hasGarden, boolean hasStatues, TypeHouse typeHouse) {
		this.windows = windows;
		this.doors = doors;
		this.hasGarage = hasGarage;
		this.hasPool = hasPool;
		this.hasGarden = hasGarden;
		this.hasStatues = hasStatues;
		this.typeHouse = typeHouse;
	}
}
