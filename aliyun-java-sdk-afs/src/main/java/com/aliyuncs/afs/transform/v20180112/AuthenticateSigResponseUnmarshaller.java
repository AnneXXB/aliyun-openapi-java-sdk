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
package com.aliyuncs.afs.transform.v20180112;

import com.aliyuncs.afs.model.v20180112.AuthenticateSigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthenticateSigResponseUnmarshaller {

	public static AuthenticateSigResponse unmarshall(AuthenticateSigResponse authenticateSigResponse, UnmarshallerContext context) {
		
		authenticateSigResponse.setRequestId(context.stringValue("AuthenticateSigResponse.RequestId"));
		authenticateSigResponse.setCode(context.integerValue("AuthenticateSigResponse.Code"));
		authenticateSigResponse.setMsg(context.stringValue("AuthenticateSigResponse.Msg"));
		authenticateSigResponse.setRiskLevel(context.stringValue("AuthenticateSigResponse.RiskLevel"));
		authenticateSigResponse.setDetail(context.stringValue("AuthenticateSigResponse.Detail"));
	 
	 	return authenticateSigResponse;
	}
}