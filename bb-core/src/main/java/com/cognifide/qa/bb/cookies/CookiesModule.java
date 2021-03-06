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
package com.cognifide.qa.bb.cookies;

import java.util.List;

import com.cognifide.qa.bb.cookies.domain.CookieData;
import com.cognifide.qa.bb.cookies.modifier.CookiesModifier;
import com.cognifide.qa.bb.provider.selenium.webdriver.modifiers.webdriver.WebDriverModifier;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.Multibinder;

/**
 * Guice module responsible for bindings related to the cookie setting mechanism.
 */
public class CookiesModule extends AbstractModule {
  @Override
  public void configure() {
    bind(new TypeLiteral<List<CookieData>>() {
    }).toProvider(DefaultCookiesProvider.class);

    Multibinder<WebDriverModifier> webDriverModifiers = Multibinder
        .newSetBinder(binder(), WebDriverModifier.class);
    webDriverModifiers.addBinding().to(CookiesModifier.class);
  }
}
