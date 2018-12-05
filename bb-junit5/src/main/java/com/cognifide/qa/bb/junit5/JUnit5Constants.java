/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2018 Cognifide Ltd.
 * %%
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
 * #L%
 */
package com.cognifide.qa.bb.junit5;

import org.junit.jupiter.api.extension.ExtensionContext.Namespace;

/**
 * Contains common constants for the whole JUnit 5 module.
 */
public final class JUnit5Constants {

  public static final Namespace NAMESPACE =
      Namespace.create("com", "cognifide", "qa", "bb", "junit", "guice");

  private JUnit5Constants() {
    //util
  }
}
