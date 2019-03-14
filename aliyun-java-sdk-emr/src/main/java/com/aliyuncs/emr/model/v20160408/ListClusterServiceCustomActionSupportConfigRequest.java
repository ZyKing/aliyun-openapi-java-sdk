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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceCustomActionSupportConfigRequest extends RpcAcsRequest<ListClusterServiceCustomActionSupportConfigResponse> {
	
	public ListClusterServiceCustomActionSupportConfigRequest() {
		super("Emr", "2016-04-08", "ListClusterServiceCustomActionSupportConfig", "emr");
	}

	private String serviceCustomActionName;

	private Long resourceOwnerId;

	private String serviceName;

	private String clusterId;

	public String getServiceCustomActionName() {
		return this.serviceCustomActionName;
	}

	public void setServiceCustomActionName(String serviceCustomActionName) {
		this.serviceCustomActionName = serviceCustomActionName;
		if(serviceCustomActionName != null){
			putQueryParameter("ServiceCustomActionName", serviceCustomActionName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<ListClusterServiceCustomActionSupportConfigResponse> getResponseClass() {
		return ListClusterServiceCustomActionSupportConfigResponse.class;
	}

}