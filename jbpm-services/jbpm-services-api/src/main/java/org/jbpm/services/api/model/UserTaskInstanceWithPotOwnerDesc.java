/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.services.api.model;

import java.util.Date;
import java.util.List;
import java.util.Map;


public interface UserTaskInstanceWithPotOwnerDesc extends UserTaskInstanceDesc{

    /**
     * Returns the uer task potential owners
     * @return potential owners
     */
    List<String> getPotentialOwners();

    /**
     * Returns the uer task correlation key
     * @return correlation key
     */
    String getCorrelationKey();

    /**
     * Returns the uer task potential modification date
     * @return modification date
     */
    Date getLastModificationDate();

    /**
     * Returns the uer task last modification user
     * @return last modification user
     */
    String getLastModificationUser();

    /**
     * Returns the uer task subject
     * @return subject
     */
    String getSubject();

    /**
     * Returns the uer task input data
     * @return input data
     */
    Map<String,Object> getInputdata();

    /**
     * Returns the uer task output data
     * @return output data
     */
    Map<String,Object> getOutputdata();

    /**
     * Returns the uer task process instance description
     * @return process instance description
     */
    String getProcessInstanceDescription();
}
