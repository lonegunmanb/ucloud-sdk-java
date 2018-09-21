package cn.ucloud.client;

import cn.ucloud.model.DeleteSubnetParam;
import cn.ucloud.model.DeleteSubnetResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 16:06
 **/
public class DeleteSubnetTest {

    private VPCClient client;

    private DeleteSubnetParam param;

    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DeleteSubnetParam("cn-bj2","subnet-3t11uc");
        param.setProjectId("org-4nfe1i");
    }


    @Test
    public void deleteSubnet() {
        try {
            DeleteSubnetResult deleteSubnetResult = client.deleteSubnet(param);
            System.out.println(deleteSubnetResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}