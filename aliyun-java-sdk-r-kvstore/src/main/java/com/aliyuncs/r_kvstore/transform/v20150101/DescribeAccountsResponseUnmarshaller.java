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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeAccountsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAccountsResponse.Account;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAccountsResponse.Account.DatabasePrivilege;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setInstanceId(context.integerValue("DescribeAccountsResponse.Accounts["+ i +"].InstanceId"));
			account.setAccountName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			account.setAccountStatus(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			account.setAccountType(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));
			account.setAccountDescription(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			account.setPrivExceeded(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PrivExceeded"));

			List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < context.lengthValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setAccountPrivilege(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));
				databasePrivilege.setAccountPrivilegeDetail(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilegeDetail"));

				databasePrivileges.add(databasePrivilege);
			}
			account.setDatabasePrivileges(databasePrivileges);

			accounts.add(account);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}