/*
 * Copyright 2016 firefly1126, Inc.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.gradle_plugin_android_aspectjx
 */
package com.enation.javashop.kowa

/**
 * class description here
 * @author simon
 * @version 1.0.0
 * @since 2016-05-05
 */
class AspectjExtension {

    List<String> aspectIncludeJarFilter = new ArrayList<String>()
    List<String> aspectExcludeJarFilter = new ArrayList<String>()
    List<String> ajcArgs=new ArrayList<>();

    public AspectjExtension aspectIncludeJarFilter(String...filters) {
        if (filters != null) {
            aspectIncludeJarFilter.addAll(filters)
        }

        return this
    }

    public AspectjExtension aspectExcludeJarFilter(String...filters) {
        if (filters != null) {
            aspectExcludeJarFilter.addAll(filters)
        }
        return this
    }
    public AspectjExtension ajcArgs(String...ajcArgs) {
        if (ajcArgs != null) {
            this.ajcArgs.addAll(ajcArgs)
        }
        return this
    }
}
