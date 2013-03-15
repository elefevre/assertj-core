/*
 * Created on Sep 26, 2010
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
package org.assert4j.core.assertions.error;

import static junit.framework.Assert.assertEquals;

import static org.assert4j.core.assertions.error.ShouldBeAfter.shouldBeAfter;
import static org.assert4j.core.util.Dates.parse;

import org.assert4j.core.assertions.description.Description;
import org.assert4j.core.assertions.description.TextDescription;
import org.assert4j.core.assertions.error.ErrorMessageFactory;
import org.assert4j.core.assertions.error.ShouldBeAfter;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests for <code>{@link ShouldBeAfter#create(Description)}</code>.
 * 
 * @author Joel Costigliola
 */
public class ShouldBeAfter_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldBeAfter(parse("2011-01-01"), parse("2012-01-01"));
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TextDescription("Test"));
    assertEquals("[Test] expected:<2011-01-01T00:00:00> to be strictly after:<2012-01-01T00:00:00>", message);
  }
}