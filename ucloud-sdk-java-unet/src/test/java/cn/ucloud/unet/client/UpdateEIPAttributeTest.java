package cn.ucloud.unet.client;

import cn.ucloud.unet.client.DefaultUnetClient;
import cn.ucloud.unet.client.UnetClient;
import cn.ucloud.unet.model.UpdateEIPAttributeParam;
import cn.ucloud.unet.model.UpdateEIPAttributeResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:09
 **/
public class UpdateEIPAttributeTest {

    private UnetClient client;

    private UpdateEIPAttributeParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new UpdateEIPAttributeParam("cn-bj2","eip-44ayct");
        param.setProjectId("org-4nfe1i");
        param.setName("sdk-java-test");
    }

    @Test
    public void updateEIPAttribute() {
        try {
            UpdateEIPAttributeResult updateEIPAttributeResult = client.updateEIPAttribute(param);
            System.out.println(updateEIPAttributeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}