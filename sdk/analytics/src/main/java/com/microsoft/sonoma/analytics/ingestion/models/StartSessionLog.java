package com.microsoft.sonoma.analytics.ingestion.models;

import com.microsoft.sonoma.core.ingestion.models.AbstractLog;

/**
 * Start session log.
 */
public class StartSessionLog extends AbstractLog {

    public static final String TYPE = "start_session";

    @Override
    public String getType() {
        return TYPE;
    }
}
