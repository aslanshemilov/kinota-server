/**
 * Kinota (TM) Copyright (C) 2017 CGI Group Inc.
 *
 * Licensed under GNU Lesser General Public License v3.0 (LGPLv3);
 * you may not use this file except in compliance with the License.
 *
 * This software is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * v3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License v3.0 for more details.
 *
 * You can receive a copy of the GNU Lesser General Public License
 * from:
 *
 * https://www.gnu.org/licenses/lgpl-3.0.en.html
 *
 */

package com.cgi.kinota.server.security.jwt.application;

import com.cgi.kinota.server.exception.ApplicationException;
import com.cgi.kinota.server.security.jwt.domain.Agent;

import java.util.List;

/**
 * Created by dfladung on 3/27/17.
 */
public interface AgentService {

    Agent retrieveAgent(String id) throws ApplicationException;

    List<Agent> retrieveAgents() throws ApplicationException;
}
