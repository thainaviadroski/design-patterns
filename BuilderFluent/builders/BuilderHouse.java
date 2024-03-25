package BuilderFluent.builders;

import BuilderFluent.Model.House;
import BuilderFluent.TypeHouse;

public class BuilderHouse {
	private int windows;
	private int doors;
	private boolean hasGarage;
	private boolean hasPool;
	private boolean hasGarden;
	private boolean hasStatues;
	private TypeHouse typeHouse;

	public BuilderHouse setWindows(int windows) {
		this.windows = windows;
		return this;
	}

	public BuilderHouse setDoors(int doors) {
		this.doors = doors;
		return this;
	}

	public BuilderHouse setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
		return this;
	}

	public BuilderHouse setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
		return this;
	}

	public BuilderHouse setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
		return this;
	}

	public BuilderHouse setHasStatues(boolean hasStatues) {
		this.hasStatues = hasStatues;
		return this;
	}

	public BuilderHouse setTypeHouse(TypeHouse typeHouse) {
		this.typeHouse = typeHouse;
		return this;
	}

	public House build() {
		return new House(windows, doors, hasGarage, hasPool, hasGarden, hasStatues, typeHouse);
	}
}
