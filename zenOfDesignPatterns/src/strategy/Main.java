/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package strategy;

/**
 * @author mr.24
 * @version Id: Main, v 1.0 2020-04-04 00:43 Exp $$
 */
public class Main {
    public static void main(String[] args) {
        TravelStrategy airPlaneStrategy = new Airplane();
        TravelStrategy trainStrategy = new Train();
        TravelStrategy busStrategy = new Bus();

        TravelContext context = new TravelContext();
        context.setTravelStrategy(busStrategy);
        context.travel();

        context.setTravelStrategy(trainStrategy);
        context.travel();
    }
}
