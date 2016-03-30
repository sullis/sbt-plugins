package com.meetup.blt.sbt

import java.io.File

import org.scalatest.{Matchers, FunSpec}

class CommonSettingsPluginTest extends FunSpec with Matchers {

  val commonSettingsDir = new File("src/it/sbt/common-settings")

  val sbt = new Sbt(commonSettingsDir)

  it("should set organization") {
    val res = sbt.lastLine("export organization")
    res shouldBe "com.meetup"
  }

  it("should retrieve version from Makefile") {
    val res = sbt.lastLine("export version")
    res shouldBe "0.0.1"
  }

}