/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Delete Notification Configuration Request Marshaller
 */
public class DeleteNotificationConfigurationRequestMarshaller implements Marshaller<Request<DeleteNotificationConfigurationRequest>, DeleteNotificationConfigurationRequest> {

    public Request<DeleteNotificationConfigurationRequest> marshall(DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest) {

        if (deleteNotificationConfigurationRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteNotificationConfigurationRequest> request = new DefaultRequest<DeleteNotificationConfigurationRequest>(deleteNotificationConfigurationRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DeleteNotificationConfiguration");
        request.addParameter("Version", "2011-01-01");

        if (deleteNotificationConfigurationRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(deleteNotificationConfigurationRequest.getAutoScalingGroupName()));
        }
        if (deleteNotificationConfigurationRequest.getTopicARN() != null) {
            request.addParameter("TopicARN", StringUtils.fromString(deleteNotificationConfigurationRequest.getTopicARN()));
        }


        return request;
    }
}
