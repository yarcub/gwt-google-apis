/*
 * Copyright 2008 Google Inc.
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
package com.google.gwt.ajaxsearch.client;

import com.google.gwt.ajaxsearch.jsio.client.JSOpaque;

/**
 * Specifies the desired number of results to retrieve when executing a Search.
 * The requested size is a guideline and does not reflect any particular number
 * of results.
 * 
 * @see Search#setResultSetSize(ResultSetSize)
 */
public enum ResultSetSize {
  /**
   * Requests a large number of results.
   */
  LARGE("LARGE"),

  /**
   * Requests a smaller number of results.
   */
  SMALL("SMALL");

  private final JSOpaque value;

  private ResultSetSize(String size) {
    value = new JSOpaque("$wnd.GSearch." + size + "_RESULTSET");
  }

  JSOpaque getValue() {
    return value;
  }
}
