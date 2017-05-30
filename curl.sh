#!/bin/bash

#curl -H "Content-Type: application/x-yaml" -d @vikas.yml http://localhost:8080/greeting -v
curl -H "Content-Type: application/x-yaml" --data-binary "@vikas.yml" http://localhost:8080/greeting -v
