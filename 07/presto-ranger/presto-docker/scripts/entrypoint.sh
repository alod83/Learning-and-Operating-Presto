#!/usr/bin/env bash
set -e

# config
: "${PRESTO_CONF_COORDINATOR:=true}"
: "${PRESTO_CONF_DISCOVERY_URI:=http://localhost:8080}"

#############################
# config.properties
#############################
presto_settings_config()
{
    echo "discovery.uri=${PRESTO_CONF_DISCOVERY_URI}"
    
    # Only write out coordinator specific configs if this is a coordinator
    if [ $PRESTO_CONF_COORDINATOR == "true" ]; then
        echo "discovery-server.enabled=true"
        echo "node-scheduler.include-coordinator=true"
    fi

} >> config.properties

presto_settings_config
