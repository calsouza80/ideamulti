package com.github.calsouza80

/**
 * Hello world
 * Created by carlossouza on 1/24/15.
 */
object NewObj {

  def init: Boolean = {
    println("New Object initialized")
    true
  }

  def printName(name: String): String = {
    "Your name is " + name
  }
}
