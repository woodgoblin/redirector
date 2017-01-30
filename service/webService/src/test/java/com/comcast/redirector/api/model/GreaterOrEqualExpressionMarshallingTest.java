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
 * @author Alexey Smolenskiy (asmolenskiy@productengine.com)
 */

package com.comcast.redirector.api.model;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class GreaterOrEqualExpressionMarshallingTest extends SelectServerTemplate {

    private static final String TEST_JSON_EXPRESSION = "\"greaterOrEqual\":[{\"type\":\"greaterOrEqual_type\",\"param\":\"greaterOrEqual_param\",\"value\":\"greaterOrEqual_value\"}]";
    private static final String TEST_XML_EXPRESSION = "<greaterOrEqual type=\"greaterOrEqual_type\"><param>greaterOrEqual_param</param><value>greaterOrEqual_value</value></greaterOrEqual>";

    private static String TEST_SELECT_SERVER_JSON;
    private static String TEST_SELECT_SERVER_XML;
    private static SelectServer TEST_SELECT_SERVER_OBJECT;

    @BeforeClass
    public static void setUp() {
        TEST_SELECT_SERVER_JSON = createJsonSelectServer(DEFAULT_RULE_TEST_NAME, TEST_JSON_EXPRESSION, DEFAULT_JSON_RETURN_SERVER);
        TEST_SELECT_SERVER_XML = createXmlSelectServer(DEFAULT_RULE_TEST_NAME, TEST_XML_EXPRESSION, DEFAULT_XML_RETURN_SERVER);

        final GreaterOrEqualExpression testExpression = new GreaterOrEqualExpression();
        testExpression.type = "greaterOrEqual_type";
        testExpression.setParam("greaterOrEqual_param");
        testExpression.setValue("greaterOrEqual_value");
        List<IfExpression> rules = new ArrayList<IfExpression>() {{
            add(createRule(DEFAULT_RULE_TEST_NAME, new ArrayList<Expressions>(){{add(testExpression);}}));
        }};
        TEST_SELECT_SERVER_OBJECT = createSelectServer(rules, DEFAULT_RETURN_SERVER_OBJECT);
    }

    @Test
    public void testJsonToGreaterOrEqualObject() throws Exception {
        SelectServer responseObject = unmarshalJsonStringObject(TEST_SELECT_SERVER_JSON);
        // validate responseObject
        Assert.assertEquals(TEST_SELECT_SERVER_OBJECT, responseObject);
    }

    @Test
    public void testGreaterOrEqualObjectToJson() throws Exception {
        String response = marshalJsonObject(TEST_SELECT_SERVER_OBJECT);
        // validate response
        Assert.assertEquals(TEST_SELECT_SERVER_JSON, response);
    }

    @Test
    public void testXmlToGreaterOrEqualObject() throws Exception {
        SelectServer responseObject = unmarshalXmlStringObject(TEST_SELECT_SERVER_XML);
        // validate responseObject
        Assert.assertEquals(TEST_SELECT_SERVER_OBJECT, responseObject);
    }

    @Test
    public void testGreaterOrEqualObjectToXml() throws Exception {
        String response = marshalXmlObject(TEST_SELECT_SERVER_OBJECT);
        // validate response
        validateXlStringResponse(TEST_SELECT_SERVER_XML, response);
    }

    private void validateXlStringResponse(String expectedXmlString, String response) {
        Assert.assertEquals(expectedXmlString, response.substring(response.indexOf("<selectServer>"), response.length()));
    }

}
