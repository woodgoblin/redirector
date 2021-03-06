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
 * @author Alexey Smolenskiy (asmolenskiy@productengine.com)
 */

package com.comcast.redirector.api.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "serviceInstances")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceInstances {

    @XmlElement(name = "instances")
    List<String> instances = new ArrayList<String>();

    public ServiceInstances() {
    }

    public ServiceInstances(List<String> instances) {
        this.instances = instances;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public void add(String s) {
        instances.add(s);
    }

    public String get(int index) {
        return instances.get(index);
    }

    public boolean remove(String s) {
        return instances.remove(s);
    }

    public void clear() {
        instances.clear();
    }
}
