#!/usr/bin/env bash

function main {
    case "$1" in
        "run" )
            run;;
        "test" )
            ./gradlew test ;;
        "clean" )
            ./gradlew clean ;;
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

main $@
exit 0
