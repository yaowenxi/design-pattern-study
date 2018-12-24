package cn.worthy.designpatternstudy.adapter.defaultadapter;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

/***************************************************************************
 * @Description - 定义一个适配器，继承大多数的接口方法
 *
 * @author yaowx001 2018/12/24
 * @version 1.0
 **************************************************************************/
public class FileAlterationListenerAdaptor implements FileAlterationListener {

    @Override
    public void onStart(FileAlterationObserver fileAlterationObserver) {

    }

    @Override
    public void onDirectoryCreate(File file) {

    }

    @Override
    public void onDirectoryChange(File file) {

    }

    @Override
    public void onDirectoryDelete(File file) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onStop(FileAlterationObserver fileAlterationObserver) {

    }
}
