/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package chain.handlers;

import chain.Request;

/**
 * @author mr.24
 * @version Id: AbstractHandler, v 1.0 2020-03-29 16:05 Exp $$
 */
public abstract class AbstractHandler {

    /**
     * 责任链下一环节
     */
    private AbstractHandler nextHandler;

    /**
     * 获取责任链中的level
     *
     * @return level数值
     */
    protected abstract int getHandlerLevel();

    /**
     * 处理请求
     *
     * @param request 请求
     */
    protected abstract void process(Request request);

    public final void handler(Request request) {
        if (request.getLevel() == this.getHandlerLevel()) {
            this.process(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.process(request);
            } else {
                System.out.println("没有合适的处理环节");
            }
        }
    }

    /**
     * Setter method for property <tt>nextHandler</tt>.
     *
     * @param nextHandler value to be assigned to property nextHandler
     */
    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
