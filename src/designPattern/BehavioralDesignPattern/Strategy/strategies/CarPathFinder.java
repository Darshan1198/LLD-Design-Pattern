package designPattern.BehavioralDesignPattern.Strategy.strategies;

public class CarPathFinder implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Path finding  for car  via "+from+ "to" +to);

    }
}
