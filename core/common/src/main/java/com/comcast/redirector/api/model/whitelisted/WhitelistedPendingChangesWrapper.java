/**
 * Copyright 2017 Comcast Cable Communications Management, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Alexander Pletnev (apletnev@productengine.com)
 */

package com.comcast.redirector.api.model.whitelisted;

import com.comcast.redirector.api.model.pending.PendingChange;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement (name = "stackManagementChanges")
public class WhitelistedPendingChangesWrapper {
    private Map<String, PendingChange> changeMap;

    public Map<String, PendingChange> getChangeMap() {
        return changeMap;
    }

    public void setChangeMap(Map<String, PendingChange> changeMap) {
        this.changeMap = changeMap;
    }
}
