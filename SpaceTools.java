package lab3;

public class SpaceTools {
	public static double travelTime(Planet p, double speed) {
		return (p.getDistanceFromSun() * 1_000_000) / speed;
	}
	public static Planet compareDistance(Planet a, Planet b) {
		if (a.getDistanceFromSun() < b.getDistanceFromSun()) {
			return a;
		} else {
			return b;
		}
	}
	public static String abbreviation(Planet p) {
		return p.getName().substring(0,3);
	}
	public static double orbitTime(Planet p) {
		return (p.getDistanceFromSun() * 20 * Math.PI);
	}
	public static double orbitTime(Planet p, double speed) {
		return (p.getDistanceFromSun() * (2_000_000 / speed) * Math.PI);
	}
}
