package com.wjx.ezreal.singleton;

/**
 * @author liusha
 * @date 2021/3/10 16:15
 * @mail liusha@wacai.com
 * @description 枚举实现单例模式
 */
public class InnerEnumSingletonMode {

    private InnerEnumSingletonMode() {
    }

    private enum SingletonModeEnum {
        INSTANCE;

        private InnerEnumSingletonMode instance;

        SingletonModeEnum() {
            instance = new InnerEnumSingletonMode();
        }

        public InnerEnumSingletonMode getInstance() {
            return SingletonModeEnum.INSTANCE.instance;
        }

    }
}
