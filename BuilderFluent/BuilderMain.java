package BuilderFluent;

import BuilderFluent.Model.House;
import BuilderFluent.builders.BuilderHouse;

public class BuilderMain {

	public static void main(String[] args) {
		House house = new BuilderHouse().setTypeHouse(TypeHouse.SOBRADO)
				.setWindows(8).setDoors(12).setHasGarage(true)
				.setHasGarden(true).setHasPool(true).setHasStatues(false).build();

		System.out.println("-------------");

		House house2 = new BuilderHouse().setTypeHouse(TypeHouse.CASA_SIMPLES)
				.setWindows(5).setDoors(6).setHasGarage(true)
				.setHasGarden(false).setHasPool(true).setHasStatues(false).build();

	}

}
