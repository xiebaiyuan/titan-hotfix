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

package com.baidu.titan.plugin.build.extensions

import org.gradle.api.Project;

/**
 * 配置Patch校验相关逻辑
 *
 * @author zhangdi07@baidu.com
 * @since 2017/5/5
 */

public class PatchVerifyConfigExtension {

    SignaturePolicy signaturePolicy = SignaturePolicy.V2_ONLY

    Iterable<String> sigs;

    Project mProject;

    PatchVerifyConfigExtension(Project project) {
        mProject = project
    }

}
