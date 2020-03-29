/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2020 All Rights Reserved.
 */
package chain;

/**
 * @author mr.24
 * @version Id: Request, v 1.0 2020-03-29 16:18 Exp $$
 */
public class Request {
    /**
     * 定义在责任链中所处的层级
     */
    private int level;

    /**
     * 定义相应的msg
     */
    private String msg;

    public Request() {
    }

    public Request(int level, String msg) {
        this.level = level;
        this.msg = msg;
    }

    /**
     * Getter method for property <tt>level</tt>.
     *
     * @return property value of level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter method for property <tt>level</tt>.
     *
     * @param level value to be assigned to property level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     *
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter method for property <tt>msg</tt>.
     *
     * @param msg value to be assigned to property msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
