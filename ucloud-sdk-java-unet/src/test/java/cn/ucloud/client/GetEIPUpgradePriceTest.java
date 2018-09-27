package cn.ucloud.client;

import cn.ucloud.model.GetEIPUpgradePriceParam;
import cn.ucloud.model.GetEIPUpgradePriceResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 13:57
 **/
public class GetEIPUpgradePriceTest {

    private UnetClient client;

    private GetEIPUpgradePriceParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new GetEIPUpgradePriceParam("cn-bj2","eip-44ayct",100);
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void getEIPUpgradePrice() {
        try {
            GetEIPUpgradePriceResult eipUpgradePrice = client.getEIPUpgradePrice(param);
            System.out.println(eipUpgradePrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}