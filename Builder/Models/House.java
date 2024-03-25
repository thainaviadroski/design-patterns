package Builder.Models;

import Builder.Components.TypeHouse;
import Builder.Components.Wall;

public class House {
	private int windows;
	private int doors;
	private boolean hasGarage;
	private boolean hasPool;
	private boolean hasGarden;
	private boolean hasStatues;
	private TypeHouse typeHouse;

	private Wall wall;

	public House(int windows, int doors, boolean hasGarage, boolean hasPool, boolean hasGarden, boolean hasStatues, TypeHouse typeHouse, Wall wall) {
		this.windows = windows;
		this.doors = doors;
		this.hasGarage = hasGarage;
		this.hasPool = hasPool;
		this.hasGarden = hasGarden;
		this.hasStatues = hasStatues;
		this.typeHouse = typeHouse;
		this.wall = new Wall();
	}
}
