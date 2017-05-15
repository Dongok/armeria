/*
 * Copyright 2017 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.armeria.internal.grpc;

import io.grpc.Status;

/**
 * A listener of GRPC {@link Status}s. Any errors occuring within the armeria will be returned to GRPC business
 * logic through this listener, and for clients the final response {@link Status} is also returned.
 */
public interface StatusListener {
    void onError(Status status);
}