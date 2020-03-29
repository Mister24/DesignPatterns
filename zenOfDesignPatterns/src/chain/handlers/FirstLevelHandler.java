/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package chain.handlers;

import chain.Request;
import chain.handlers.AbstractHandler;

/**
 * @author mr.24
 * @version Id: FirstLevelHandler, v 1.0 2020-03-29 16:45 Exp $$
 */
public class FirstLevelHandler extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void process(Request request) {
        System.out.println("当前处于责任链的第 1 级");
        System.out.println("对msg ：" + request.getMsg() + "处理完毕.");
    }
}
