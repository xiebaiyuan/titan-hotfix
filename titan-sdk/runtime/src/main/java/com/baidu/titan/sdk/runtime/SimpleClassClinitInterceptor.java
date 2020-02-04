/*
 * Copyright (C) Baidu Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.titan.sdk.runtime;

/**
 *
 * 通过该类实现接口所有方法，来兼容处理接口后继的新增方法。
 *
 * @author zhangdi07@baidu.com
 * @since 2018/12/29
 */
public class SimpleClassClinitInterceptor implements ClassClinitInterceptable {

    @Override
    public InterceptResult invokeClinit(int hashCode, String typeDesc) {
        return null;
    }

    @Override
    public InterceptResult invokePostClinit(int hashCode, String typeDesc) {
        return null;
    }

}
