/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package strategy;

/**
 * @author mr.24
 * @version Id: Bus, v 1.0 2020-04-04 00:41 Exp $$
 */
public class Bus implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("乘坐大巴");
    }
}
