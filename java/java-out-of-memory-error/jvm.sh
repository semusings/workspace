#!/bin/bash
set -ex
javac "$1.java"
# shellcheck disable=SC2068
java ${@:2} "$1"