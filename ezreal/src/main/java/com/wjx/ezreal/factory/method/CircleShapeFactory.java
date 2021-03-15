package com.wjx.ezreal.factory.method;

import com.wjx.ezreal.factory.bean.CircleShape;
import com.wjx.ezreal.factory.bean.Shape;

/**
 * @author wangjinxin
 * @date 2021/3/11 19:32
 * @mail wjxScott@icloud.com
 * @description 圆形工厂
 */
public class CircleShapeFactory implements SharpFactory {
    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
