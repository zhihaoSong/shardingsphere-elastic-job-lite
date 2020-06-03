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

import io.elasticjob.lite.console.domain.EventTraceDataSourceConfiguration;
import io.elasticjob.lite.console.domain.EventTraceDataSourceConfigurations;
import com.google.common.base.Optional;

/**
 * 事件追踪数据源配置服务.
 * 
 * @author caohao
 */
public interface EventTraceDataSourceConfigurationService {
    
    /**
     * 读取全部事件追踪数据源配置.
     *
     * @return 全部事件追踪数据源配置
     */
    EventTraceDataSourceConfigurations loadAll();
    
    /**
     * 读取事件追踪数据源配置.
     * 
     * @param name 配置名称
     * @return 事件追踪数据源配置
     */
    EventTraceDataSourceConfiguration load(String name);
    
    /**
     * 查找事件追踪数据源配置.
     *
     * @param name 配置名称
     * @param configs 全部事件追踪数据源配置
     * @return 事件追踪数据源配置
     */
    EventTraceDataSourceConfiguration find(String name, EventTraceDataSourceConfigurations configs);
    
    /**
     * 读取已连接的事件追踪数据源配置.
     * 
     * @return 已连接的事件追踪数据源配置
     */
    Optional<EventTraceDataSourceConfiguration> loadActivated();
    
    /**
     * 添加事件追踪数据源配置.
     * 
     * @param config 事件追踪数据源配置
     * @return 是否添加成功
     */
    boolean add(EventTraceDataSourceConfiguration config);
    
    /**
     * 删除事件追踪数据源配置.
     *
     * @param name 配置名称
     */
    void delete(String name);
}
