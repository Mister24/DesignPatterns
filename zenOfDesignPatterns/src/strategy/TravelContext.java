/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package strategy;

/**
 * @author mr.24
 * @version Id: TravelContext, v 1.0 2020-04-04 00:42 Exp $$
 */
public class TravelContext {
    private TravelStrategy travelStrategy;

    public void travel() {
        travelStrategy.travel();
    }

    /**
     * Getter method for property <tt>travelStrategy</tt>.
     *
     * @return property value of travelStrategy
     */
    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    /**
     * Setter method for property <tt>travelStrategy</tt>.
     *
     * @param travelStrategy value to be assigned to property travelStrategy
     */
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
}
