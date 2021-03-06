/*
 * Created on Oct 26, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2010-2012 the original author or authors.
 */
package org.assertj.core.api;

import static java.util.Collections.*;
import static org.junit.Assert.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ListAssert;
import org.junit.Test;

/**
 * Tests for <code>{@link Assertions#assertThat(List)}</code>.
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 * @author Mikhail Mazursky
 */
public class Assertions_assertThat_with_List_Test {
  @Test
  public void should_create_Assert() {
    ListAssert<Object> assertions = Assertions.assertThat(emptyList());
    assertNotNull(assertions);
  }

  @Test
  public void should_pass_actual() {
    List<String> names = singletonList("Luke");
    ListAssert<String> assertions = Assertions.assertThat(names);
    assertSame(names, assertions.actual);
  }
}
