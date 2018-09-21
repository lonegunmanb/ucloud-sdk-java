package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.ULBConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 09:35
 **/

public class DefaultULBClient implements ULBClient {

    /**
     * ULB 配置
     */
    private ULBConfig config;

    public DefaultULBClient(ULBConfig config) {
        this.config = config;
    }


    @Override
    public CreateULBResult createULB(CreateULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateULBResult.class);
        CreateULBResult result = (CreateULBResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUlb(CreateULBParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateULBResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeULBResult describeULB(DescribeULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeULBResult.class);
        DescribeULBResult result = (DescribeULBResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeUlb(DescribeULBParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeULBResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DeleteULBResult deleteULB(DeleteULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteULBResult.class);
        DeleteULBResult result = (DeleteULBResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteULB(DeleteULBParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteULBResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public UpdateULBAttributeResult updateULBAttribute(UpdateULBAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateULBAttributeResult.class);
        UpdateULBAttributeResult result = (UpdateULBAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateULBAttribute(UpdateULBAttributeParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateULBAttributeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public CreateVServerResult createVServer(CreateVServerParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVServerResult.class);
        CreateVServerResult result = (CreateVServerResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createVServer(CreateVServerParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVServerResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeVServerResult describeVServer(DescribeVServerParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVServerResult.class);
        DescribeVServerResult result = (DescribeVServerResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeVServer(DescribeVServerParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVServerResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DeleteVServerResult deleteVServer(DeleteVServerParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVServerResult.class);
        DeleteVServerResult result = (DeleteVServerResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteVServer(DeleteVServerParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVServerResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public UpdateVServerAttributeResult updateVServerAttribute(UpdateVServerAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateVServerAttributeResult.class);
        UpdateVServerAttributeResult result = (UpdateVServerAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateVServerAttribute(UpdateVServerAttributeParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateVServerAttributeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public AllocateBackendResult allocateBackend(AllocateBackendParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendResult.class);
        AllocateBackendResult result = (AllocateBackendResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void allocateBackend(AllocateBackendParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public ReleaseBackendResult releaseBackend(ReleaseBackendParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseBackendResult.class);
        ReleaseBackendResult result = (ReleaseBackendResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void releaseBackend(ReleaseBackendParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseBackendResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public AllocateBackendBatchResult allocateBackendBatch(AllocateBackendBatchParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendBatchResult.class);
        AllocateBackendBatchResult result = (AllocateBackendBatchResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void allocateBackendBatch(AllocateBackendBatchParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendBatchResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public UpdateBackendAttributeResult updateBackendAttribute(UpdateBackendAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateBackendAttributeResult.class);
        UpdateBackendAttributeResult result = (UpdateBackendAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateBackendAttribute(UpdateBackendAttributeParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateBackendAttributeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public CreatePolicyResult createPolicy(CreatePolicyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreatePolicyResult.class);
        CreatePolicyResult result = (CreatePolicyResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createPolicy(CreatePolicyParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreatePolicyResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public UpdatePolicyResult updatePolicy(UpdatePolicyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdatePolicyResult.class);
        UpdatePolicyResult result = (UpdatePolicyResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updatePolicy(UpdatePolicyParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdatePolicyResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeletePolicyResult.class);
        DeletePolicyResult result = (DeletePolicyResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deletePolicy(DeletePolicyParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeletePolicyResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DeleteSSLResult deleteSSL(DeleteSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSSLResult.class);
        DeleteSSLResult result = (DeleteSSLResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteSSL(DeleteSSLParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSSLResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public BindSSLResult bindSSL(BindSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BindSSLResult.class);
        BindSSLResult result = (BindSSLResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void bindSSL(BindSSLParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BindSSLResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public UnbindSSLResult unbindSSL(UnbindSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UnbindSSLResult.class);
        UnbindSSLResult result = (UnbindSSLResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void unbindSSL(UnbindSSLParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UnbindSSLResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public CreateSSLResult createSSL(CreateSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSSLResult.class);
        CreateSSLResult result = (CreateSSLResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createSSL(CreateSSLParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSSLResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSSLResult describeSSL(DescribeSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSSLResult.class);
        DescribeSSLResult result = (DescribeSSLResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeSSL(DescribeSSLParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSSLResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeletePolicyGroupResult deletePolicyGroup(DeletePolicyGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeletePolicyGroupResult.class);
        DeletePolicyGroupResult result = (DeletePolicyGroupResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deletePolicyGroup(DeletePolicyGroupParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeletePolicyGroupResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribePolicyGroupResult describePolicyGroup(DescribePolicyGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribePolicyGroupResult.class);
        DescribePolicyGroupResult result = (DescribePolicyGroupResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describePolicyGroup(DescribePolicyGroupParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribePolicyGroupResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreatePolicyGroupResult createPolicyGroup(CreatePolicyGroupParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreatePolicyGroupResult.class);
        CreatePolicyGroupResult result = (CreatePolicyGroupResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createPolicyGroup(CreatePolicyGroupParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSSLResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BaseResponseResult updatePolicyGroupAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updatePolicyGroupAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }
}
