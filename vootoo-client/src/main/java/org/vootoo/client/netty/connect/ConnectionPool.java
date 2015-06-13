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

package org.vootoo.client.netty.connect;

import io.netty.channel.Channel;
import org.vootoo.client.netty.ResponsePromise;
import org.vootoo.client.netty.ResponsePromiseContainer;

import java.io.Closeable;

/**
 * @author chenlb on 2015-06-12 11:44.
 */
public interface ConnectionPool extends Closeable {

  String channelHost();

  int channelPort();

  void setConnectTimeout(int connectTimeout);

  Channel acquireConnect() throws NettyConnectLessException;

  void releaseConnect(Channel channel);

  ConnectionPoolContext poolContext();

  @Override
  void close();

}