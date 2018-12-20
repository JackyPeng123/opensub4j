/**
 * Copyright (c) 2018 Wojciech Tekiela
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.wtekiela.opensub4j.impl;

class NoopOperation extends AbstractOperation {

    private String loginToken;

    public NoopOperation(String loginToken) {
        this.loginToken = loginToken;
    }

    @Override
    String getMethodName() {
        return "NoOperation";
    }

    @Override
    Object[] getParams() {
        Object[] params = {loginToken};
        return params;
    }

    @Override
    Object getResponseObject() {
        return null;
    }

}
