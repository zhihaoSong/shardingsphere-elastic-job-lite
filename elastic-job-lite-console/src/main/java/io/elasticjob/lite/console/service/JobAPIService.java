/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.elasticjob.lite.console.service;

import io.elasticjob.lite.lifecycle.api.JobOperateAPI;
import io.elasticjob.lite.lifecycle.api.JobSettingsAPI;
import io.elasticjob.lite.lifecycle.api.JobStatisticsAPI;
import io.elasticjob.lite.lifecycle.api.ServerStatisticsAPI;
import io.elasticjob.lite.lifecycle.api.ShardingOperateAPI;
import io.elasticjob.lite.lifecycle.api.ShardingStatisticsAPI;

public interface JobAPIService {

    /**
     * Job settings API.
     *
     * @return JobSettingsAPI
     */
    JobSettingsAPI getJobSettingsAPI();

    /**
     * Job operate API.
     *
     * @return JobOperateAPI
     */
    JobOperateAPI getJobOperatorAPI();

    /**
     * Sharding operate API.
     *
     * @return ShardingOperateAPI
     */
    ShardingOperateAPI getShardingOperateAPI();

    /**
     * Job statistics API.
     *
     * @return JobStatisticsAPI
     */
    JobStatisticsAPI getJobStatisticsAPI();

    /**
     * Servers statistics API.
     *
     * @return ServerStatisticsAPI
     */
    ServerStatisticsAPI getServerStatisticsAPI();

    /**
     * Sharding statistics API.
     *
     * @return ShardingStatisticsAPI
     */
    ShardingStatisticsAPI getShardingStatisticsAPI();
    
}
