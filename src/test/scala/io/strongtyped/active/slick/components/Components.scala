/*
 * Copyright 2014 Renato Guerra Cavalcanti (@renatocaval)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.strongtyped.active.slick.components

import scala.slick.driver.{JdbcDriver, H2Driver, JdbcProfile}
import io.strongtyped.active.slick.ActiveSlick

class Components(override val jdbcDriver: JdbcDriver)
  extends ActiveSlick with ModelExtensions

object Components {
  val instance = new Components(H2Driver)
}
