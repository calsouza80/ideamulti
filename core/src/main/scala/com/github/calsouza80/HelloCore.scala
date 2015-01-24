package com.github.calsouza80

/**
 * Created by carlossouza on 1/24/15.
 */
object HelloCore {
  def greet(name: String): String = {
    "Hello from core, " + HelloUtils.transformName(name)
  }
}
