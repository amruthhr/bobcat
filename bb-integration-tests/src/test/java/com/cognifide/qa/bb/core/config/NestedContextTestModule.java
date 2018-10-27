/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
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
package com.cognifide.qa.bb.core.config;

import com.cognifide.qa.bb.constants.ConfigKeys;
import com.cognifide.qa.bb.core.pageobjects.qualifier.findpageobject.Food;
import com.cognifide.qa.bb.core.pageobjects.qualifier.findpageobject.Item;
import com.cognifide.qa.bb.core.pageobjects.qualifier.findpageobject.ListItem;
import com.cognifide.qa.bb.core.pageobjects.qualifier.findpageobject.ListItemImpl;
import com.cognifide.qa.bb.modules.CoreModule;
import com.google.inject.AbstractModule;

public class NestedContextTestModule extends AbstractModule {

  @Override
  protected void configure() {
    System.setProperty(ConfigKeys.COOKIES_LOAD_AUTOMATICALLY, "false");
    System.setProperty("bobcat.config.contexts", "additional-context2,nested-context");
    install(new CoreModule());
    bind(Item.class).to(Food.class);
    bind(ListItem.class).to(ListItemImpl.class);
  }

}
