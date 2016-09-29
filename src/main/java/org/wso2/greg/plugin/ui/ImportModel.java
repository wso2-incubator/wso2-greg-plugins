/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/

package org.wso2.greg.plugin.ui;

import com.eviware.x.form.support.AField;
import com.eviware.x.form.support.AForm;

/**
 * This class is used to generate the new project window for WSO2 API Manager projects.
 */
@AForm(name = "Create Project From WSDL/SWAGGER Specifications published on WSO2 Governance Registry",
       description = "Create Project From WSDL/SWAGGER Specifications published on WSO2 Governance Registry")
public interface ImportModel {

    @AField(name = "Project Name",
            description = "Name of the project",
            type = AField.AFieldType.STRING)
    public final static String PROJECT_NAME = "Project Name";

    @AField(name = "GREG Host Name",
            description = "GREG Host Name",
            type = AField.AFieldType.STRING)
    public final static String GREG_HOST = "GREG Host Name";

    @AField(name = "GREG Port",
            description = "GREG Port",
            type = AField.AFieldType.STRING)
    public final static String GREG_PORT = "GREG Port";

    @AField(name = "G-Reg Store User Name",
            description = "A user name to connect to the store",
            type = AField.AFieldType.STRING)
    public final static String USER_NAME = "G-Reg Store User Name";

    @AField(name = "G-Reg Store password",
            description = "The password of the above given user",
            type = AField.AFieldType.PASSWORD)
    public final static String PASSWORD = "G-Reg Store password";

    @AField(name = "Tenant Domain",
            description = "The tenant domain of the store",
            type = AField.AFieldType.STRING)
    public final static String TENANT_DOMAIN = "Tenant Domain";

    @AField(description = "RESOURCETYPE",
            type = AField.AFieldType.RADIOGROUP,
            values = { "wsdl", "rest" },
            defaultValue = "wsdl")
    public static final String RESOURCETYPE = "Resource Type";

    @AField(name = "WSO2 GReg Version",
            description = "The version of the GReg that is been used",
            type = AField.AFieldType.COMBOBOX,
            values = { "5.3.0" })
    public final static String PRODUCT_VERSION = "WSO2 GReg Version";

}
