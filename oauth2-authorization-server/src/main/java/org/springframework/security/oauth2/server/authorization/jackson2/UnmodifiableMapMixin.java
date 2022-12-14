/*
 * Copyright 2020-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.oauth2.server.authorization.jackson2;

import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This mixin class is used to serialize/deserialize
 * {@link Collections#unmodifiableMap(Map)}. It also registers a custom deserializer
 * {@link UnmodifiableMapDeserializer}.
 *
 * @author Joe Grandja
 * @since 0.1.2
 * @see Collections#unmodifiableMap(Map)
 * @see UnmodifiableMapDeserializer
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@JsonDeserialize(using = UnmodifiableMapDeserializer.class)
abstract class UnmodifiableMapMixin {

	@JsonCreator
	UnmodifiableMapMixin(Map<?, ?> map) {
	}

}
