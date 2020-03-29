/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package chain;

import chain.handlers.AbstractHandler;
import chain.handlers.FirstLevelHandler;
import chain.handlers.SecondLevelHandler;
import chain.handlers.ThirdLevelHandler;

/**
 * @author mr.24
 * @version Id: Main, v 1.0 2020-03-29 16:47 Exp $$
 */
public class Main {
    public static void main(String[] args) {
        AbstractHandler firstLevelHandler = new FirstLevelHandler();
        AbstractHandler secondLevelHandler = new SecondLevelHandler();
        AbstractHandler thirdlevelHandler = new ThirdLevelHandler();

        firstLevelHandler.setNextHandler(secondLevelHandler);
        secondLevelHandler.setNextHandler(thirdlevelHandler);
        thirdlevelHandler.setNextHandler(null);

        Request request = new Request();
        request.setLevel(2);
        request.setMsg("申请6点下班");

        firstLevelHandler.handler(request);
    }
}
