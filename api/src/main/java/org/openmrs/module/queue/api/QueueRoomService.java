/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.queue.api;

import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

import org.openmrs.Location;
import org.openmrs.api.APIException;
import org.openmrs.module.queue.model.Queue;
import org.openmrs.module.queue.model.QueueRoom;

public interface QueueRoomService {
	
	Optional<QueueRoom> getQueueRoomByUuid(@NotNull String uuid);
	
	Optional<QueueRoom> getQueueRoomById(@NotNull int id);
	
	QueueRoom createQueueRoom(@NotNull QueueRoom queueRoom);
	
	List<QueueRoom> getQueueRoomsByServiceAndLocation(Queue queue, Location location);
	
	void voidQueueRoom(@NotNull String queueRoomUuid, String voidReason);
	
	void purgeQueueRoom(QueueRoom queueRoom) throws APIException;
}
