/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.warp.lifecycle;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.jboss.arquillian.core.api.Instance;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.core.test.AbstractManagerTestBase;
import org.jboss.arquillian.warp.lifecycle.LifecycleManagerService;
import org.jboss.arquillian.warp.lifecycle.LifecycleManagerStore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author Lukas Fryc
 */
@RunWith(MockitoJUnitRunner.class)
public class LifecycleManagerStoreTest extends AbstractManagerTestBase {

    @Inject
    Instance<LifecycleManagerStore> store;

    @Override
    protected void addExtensions(List<Class<?>> extensions) {
        extensions.add(LifecycleManagerService.class);
    }

    @Test
    public void test() {
        assertNotNull("store should be initialized on manager start", store.get());
    }
}
