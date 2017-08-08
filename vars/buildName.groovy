#!/usr/bin/groovy

def call(Object ctx) {
  return "build-${ctx.params.buildId}"
}
