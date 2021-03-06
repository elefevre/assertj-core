/*
 * Created on Oct 21, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assertj.core.internal.integers;

import static org.assertj.core.test.TestData.someInfo;

import org.assertj.core.api.AssertionInfo;
import org.assertj.core.internal.Integers;
import org.assertj.core.internal.IntegersBaseTest;
import org.junit.Test;


/**
 * Tests for <code>{@link Integers#assertIsNegative(AssertionInfo, Integer)}</code>.
 * 
 * @author Alex Ruiz
 * @author Joel Costigliola
 */
public class Integers_assertIsNegative_Test extends IntegersBaseTest {

  @Test
  public void should_succeed_since_actual_is_negative() {
    integers.assertIsNegative(someInfo(), -6);
  }

  @Test
  public void should_fail_since_actual_is_not_negative() {
    thrown.expectAssertionError("expected:<6> to be less than:<0>");
    integers.assertIsNegative(someInfo(), 6);
  }

  @Test
  public void should_fail_since_actual_can_not_be_negative_according_to_custom_comparison_strategy() {
    thrown.expectAssertionError("expected:<-1> to be less than:<0> according to 'AbsValueComparator' comparator");
    integersWithAbsValueComparisonStrategy.assertIsNegative(someInfo(), -1);
  }

  @Test
  public void should_fail_since_actual_is_not_negative_according_to_custom_comparison_strategy() {
    thrown.expectAssertionError("expected:<1> to be less than:<0>");
    integersWithAbsValueComparisonStrategy.assertIsNegative(someInfo(), 1);
  }

}
