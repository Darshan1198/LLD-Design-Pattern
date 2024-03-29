package designPattern.BehavioralDesignPattern.Strategy.FactorymethodClasses;

import designPattern.BehavioralDesignPattern.Strategy.strategies.PathFinder;

public abstract class GoogleMaps implements PathFinder {
    @Override
    public void findPath(String from, String to) {
        PathFinder pf  = gpf();
        pf.findPath(from, to);
    }

    abstract  PathFinder gpf();  // this  is factory method

}
