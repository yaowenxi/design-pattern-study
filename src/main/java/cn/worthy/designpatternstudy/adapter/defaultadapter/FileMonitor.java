package cn.worthy.designpatternstudy.adapter.defaultadapter;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

/***************************************************************************
 * @Description - 默认适配器
 *
 * @author yaowx001 2018/12/24
 * @version 1.0
 **************************************************************************/
@Slf4j
public class FileMonitor extends FileAlterationListenerAdaptor{


    @Override
    public void onFileCreate(final File file) {
        // 文件创建
        log.info("do something");
    }

    @Override
    public void onFileDelete(final File file) {
        // 文件删除
        log.info("do something");
    }
}
