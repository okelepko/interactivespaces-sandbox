/*
 * Copyright (C) 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package interactivespaces.sandbox.service.control.remotecontrol.internal.lirc;

import interactivespaces.sandbox.service.control.remotecontrol.RemoteControlKeyPressEvent;

/**
 * Translate LIRC messages.
 *
 * @author Keith M. Hughes
 */
public interface LircMessageTranslator {

  /**
   * Get the delimiters for LIRC messages.
   *
   * @return the delimiters
   */
  byte[][] getMessageDelimiters();


  /**
   * Translate a LIRC event string.
   *
   * @param eventString
   *          the event string
   *
   * @return the event represented by the string
   */
  RemoteControlKeyPressEvent parseEvent(String eventString);
}
