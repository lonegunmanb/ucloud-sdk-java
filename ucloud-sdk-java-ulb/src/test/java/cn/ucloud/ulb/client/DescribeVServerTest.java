package cn.ucloud.ulb.client;

import cn.ucloud.ulb.client.DefaultULBClient;
import cn.ucloud.ulb.client.ULBClient;
import cn.ucloud.ulb.model.DescribeVServerParam;
import cn.ucloud.ulb.model.DescribeVServerResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.ulb.pojo.ULBConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 14:10
 **/
public class DescribeVServerTest {

    private ULBClient client;

    private DescribeVServerParam param;

    @Before
    public void initData() {
        client = new DefaultULBClient(new ULBConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeVServerParam("cn-bj2","ulb-0kawkr");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeVServer() {
        try {
            DescribeVServerResult describeVServerResult = client.describeVServer(param);
            System.out.println(describeVServerResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}