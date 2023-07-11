package cn.ilovewj.cloudsdk.ali;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceAttributeResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import java.util.List;

public class AliSDK {
    public void getIp() throws ClientException {
        IClientProfile profile = DefaultProfile.getProfile("cn-hongkong", "", "");
        IAcsClient client = new DefaultAcsClient(profile);
        DescribeInstanceAttributeRequest request = new DescribeInstanceAttributeRequest();
        request.setInstanceId("i-j6cc0e17e6i28zswoabz");
        request.setActionName("DescribeInstanceAttribute");
        DescribeInstanceAttributeResponse response = client.getAcsResponse(request);
        List<String> publicIpAddress = response.getPublicIpAddress();
        System.out.println(publicIpAddress);
    }

    public static void main(String[] args) throws Exception {
        new AliSDK().getIp();
    }

}
