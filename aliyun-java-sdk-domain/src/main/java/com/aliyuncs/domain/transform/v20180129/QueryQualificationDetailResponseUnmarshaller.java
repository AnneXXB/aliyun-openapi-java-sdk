/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryQualificationDetailResponse;
import com.aliyuncs.domain.model.v20180129.QueryQualificationDetailResponse.QualificationCredential;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryQualificationDetailResponseUnmarshaller {

	public static QueryQualificationDetailResponse unmarshall(QueryQualificationDetailResponse queryQualificationDetailResponse, UnmarshallerContext context) {
		
		queryQualificationDetailResponse.setRequestId(context.stringValue("QueryQualificationDetailResponse.RequestId"));
		queryQualificationDetailResponse.setTrackId(context.stringValue("QueryQualificationDetailResponse.TrackId"));
		queryQualificationDetailResponse.setAuditStatus(context.integerValue("QueryQualificationDetailResponse.AuditStatus"));

		List<QualificationCredential> credentials = new ArrayList<QualificationCredential>();
		for (int i = 0; i < context.lengthValue("QueryQualificationDetailResponse.Credentials.Length"); i++) {
			QualificationCredential qualificationCredential = new QualificationCredential();
			qualificationCredential.setCredentialNo(context.stringValue("QueryQualificationDetailResponse.Credentials["+ i +"].CredentialNo"));
			qualificationCredential.setCredentialType(context.stringValue("QueryQualificationDetailResponse.Credentials["+ i +"].CredentialType"));
			qualificationCredential.setCredentialUrl(context.stringValue("QueryQualificationDetailResponse.Credentials["+ i +"].CredentialUrl"));
			qualificationCredential.setParams(context.mapValue("QueryQualificationDetailResponse.Credentials["+ i +"].Params"));

			credentials.add(qualificationCredential);
		}
		queryQualificationDetailResponse.setCredentials(credentials);
	 
	 	return queryQualificationDetailResponse;
	}
}