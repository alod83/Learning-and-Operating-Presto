#!/bin/bash

keytool -genkeypair -alias presto-coordinator  -dname CN=presto-coordinator -keyalg RSA -keystore presto-coordinator-keystore.jks -ext "SAN=dns:presto-coordinator,dns:localhost" -keypass password -storepass password
keytool -genkeypair -alias presto-worker  -dname CN=presto-worker -keyalg RSA -keystore presto-worker-keystore.jks -keypass password -storepass password
keytool -exportcert -alias presto-coordinator -keystore presto-coordinator-keystore.jks -rfc -file presto-coordinator.pem -keypass password -storepass password
keytool -exportcert -alias presto-worker -keystore presto-worker-keystore.jks -rfc -file presto-worker.pem -keypass password -storepass password
keytool -importcert -alias presto-coordinator -keystore presto-worker-keystore.jks -file presto-coordinator.pem -keypass password -storepass password
keytool -importcert -alias presto-worker -keystore presto-coordinator-keystore.jks -file presto-worker.pem -keypass password -storepass password

