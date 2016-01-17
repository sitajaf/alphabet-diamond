#!/usr/bin/env bash

function main {
    case "$1" in
        "run" )
            run;;
        "test" )
            test;;
        * )
            echo "Unknown command!"
    esac
}

function run {
    if [ ! -e ./build/libs/alphabet-diamond.jar ]; then
        ./gradlew assemble
    fi

    java -jar ./build/libs/alphabet-diamond.jar
}

function test {
    ./gradlew test
}

main $@
exit 0
