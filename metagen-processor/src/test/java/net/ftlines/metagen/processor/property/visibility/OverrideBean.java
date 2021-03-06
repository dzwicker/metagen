/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.ftlines.metagen.processor.property.visibility;

import net.ftlines.metagen.annot.Bean;
import net.ftlines.metagen.annot.Property;

@Bean
public class OverrideBean
{
	int p1;
	@Property
	protected int p2;

	public int getP1()
	{
		return p1;
	}

	public void setP1(int p1)
	{
		this.p1 = p1;
	}

	public int getP2()
	{
		return p2;
	}

	public void setP2(int p2)
	{
		this.p2 = p2;
	}

}
