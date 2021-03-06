package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.CloneUDiskSnapshotParam;
import cn.ucloud.udisk.model.CloneUDiskSnapshotResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 16:09
 */
public class CloneUDiskSnapshotTest {
    private UdiskClient client;

    private CloneUDiskSnapshotParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new CloneUDiskSnapshotParam("cn-sh2", "cn-sh2-01", "clone-snapshot-bsSnap-c4kkvk",
                "bsSnap-c4kkvk", 16);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void cloneUDiskSnapshot() {
        try {
            CloneUDiskSnapshotResult result = client.cloneUDiskSnapshot(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cloneUDiskSnapshotCallback() {
        client.cloneUDiskSnapshot(param, new UcloudHandler<CloneUDiskSnapshotResult>() {
            @Override
            public Object success(CloneUDiskSnapshotResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(CloneUDiskSnapshotResult result) {
                System.out.println("异步 failed：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步 error：" + e);
                return null;
            }
        }, false);
    }
}
