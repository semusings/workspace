#!/bin/bash
set -ex
javac "$1.java"
# HPROF: A Heap/CPU Profiling Tool
rm -rf "$1.hprof"
# shellcheck disable=SC2068
java ${@:2} \
  -verbose:gc -XX:+UseParallelGC -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath="$1.hprof" \
 "$1"