/**
 * Copyright 2016 Comcast Cable Communications Management, LLC 
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
 * @author Paul Guslisty (pguslisty@productengine.com)
 */

package com.comcast.redirector.api.redirector.service.weightcalculator;

import org.springframework.stereotype.Component;

@Component
public class SimpleTrafficCalculator extends BaseTrafficCalculator {

    public long calculateTotalConnectionLimitOfHosts(long numberOfConnectionsPerHost, long numberOfHosts) {
        return numberOfConnectionsPerHost * numberOfHosts;
    }

    public long calculateNumberOfConnectionsPerHost(long totalNumberOfConnectionsOfFlavor, long numberOfHostsOfFlavor) {
        return numberOfHostsOfFlavor == 0 ? 0 : totalNumberOfConnectionsOfFlavor / numberOfHostsOfFlavor;
    }
}