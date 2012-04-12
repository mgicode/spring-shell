/*
 * Copyright 2011-2012 the original author or authors.
 * 
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
 */
package org.springframework.shell.samples.helloworld.commands;

import org.springframework.roo.shell.CliCommand;
import org.springframework.roo.shell.CommandMarker;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.stereotype.Component;

/**
 * @author Jarred Li
 *
 */
@Component
public class MyBannerProvider implements BannerProvider, CommandMarker {

	/* (non-Javadoc)
	 * @see org.springframework.core.Ordered#getOrder()
	 */
	public int getOrder() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.springframework.shell.plugin.BannerProvider#getBanner()
	 */
	@CliCommand(value = { "version" }, help = "Displays shell version")
	public String getBanner() {
		return "vHelper. Version: " + this.getVersion();
	}

	/* (non-Javadoc)
	 * @see org.springframework.shell.plugin.BannerProvider#getVersion()
	 */
	public String getVersion() {
		return "1.0.1";
	}

}
