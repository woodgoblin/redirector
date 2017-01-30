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
 * @author Stanislav Menshykov (smenshykov@productengine.com)
 */

package com.comcast.redirector.thucydides.pages.rules.flavor.template;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("/templates/templatePathRules/")
public class FlavorRulesTemplatesShowPage extends PageObject {

    public FlavorRulesTemplatesShowPage(WebDriver webDriver) {
        super(webDriver);
    }
}
