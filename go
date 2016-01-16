#!/usr/bin/env bash

function main {
    if [ "$1" == "run" ]; then
        run
    else
        echo "Unknown command!"
    fi
}

function run {
    if [ ! -e ./build/libs/alphabet-diamond.jar ]; then
        ./gradlew build
    fi

    java -jar ./build/libs/alphabet-diamond.jar
}

main $@
exit 0
