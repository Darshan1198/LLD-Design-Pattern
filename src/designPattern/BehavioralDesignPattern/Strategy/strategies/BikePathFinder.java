package designPattern.BehavioralDesignPattern.Strategy.strategies;

public class BikePathFinder implements PathFinder {

    @Override
    public void findPath(String from, String to) {
        System.out.println("Path via BIKE"+from+ " to "+to);

    }
}
