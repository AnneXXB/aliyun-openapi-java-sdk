/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlsResponse.IpControlInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeIpControlsResponseUnmarshaller {

	public static DescribeIpControlsResponse unmarshall(DescribeIpControlsResponse describeIpControlsResponse, UnmarshallerContext context) {
		
		describeIpControlsResponse.setRequestId(context.stringValue("DescribeIpControlsResponse.RequestId"));
		describeIpControlsResponse.setTotalCount(context.integerValue("DescribeIpControlsResponse.TotalCount"));
		describeIpControlsResponse.setPageSize(context.integerValue("DescribeIpControlsResponse.PageSize"));
		describeIpControlsResponse.setPageNumber(context.integerValue("DescribeIpControlsResponse.PageNumber"));

		List<IpControlInfo> ipControlInfos = new ArrayList<IpControlInfo>();
		for (int i = 0; i < context.lengthValue("DescribeIpControlsResponse.IpControlInfos.Length"); i++) {
			IpControlInfo ipControlInfo = new IpControlInfo();
			ipControlInfo.setIpControlId(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].IpControlId"));
			ipControlInfo.setIpControlName(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].IpControlName"));
			ipControlInfo.setIpControlType(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].IpControlType"));
			ipControlInfo.setDescription(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].Description"));
			ipControlInfo.setCreateTime(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].CreateTime"));
			ipControlInfo.setModifiedTime(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].ModifiedTime"));
			ipControlInfo.setRegionId(context.stringValue("DescribeIpControlsResponse.IpControlInfos["+ i +"].RegionId"));

			ipControlInfos.add(ipControlInfo);
		}
		describeIpControlsResponse.setIpControlInfos(ipControlInfos);
	 
	 	return describeIpControlsResponse;
	}
}