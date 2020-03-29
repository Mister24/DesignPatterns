/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package chain.handlers;

import chain.Request;

/**
 * @author mr.24
 * @version Id: ThirdLevelHandler, v 1.0 2020-03-29 16:51 Exp $$
 */
public class ThirdLevelHandler extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 3;
    }

    @Override
    protected void process(Request request) {
        System.out.println("当前处于责任链的第 3 级");
        System.out.println("对msg ：" + request.getMsg() + "处理完毕.");
    }
}
