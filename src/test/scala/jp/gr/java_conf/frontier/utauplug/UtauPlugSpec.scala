package jp.gr.java_conf.frontier.utauplug

import org.specs2.mutable._
import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class UtauPlagSpec extends Specification {

  "fromFile" should {
    "一つ目の要素が取得できていること" in {
      val a = "src/test/scala/jp/gr/java_conf/frontier/utauplug/UtauPlug_test.ust"
      val plug = UtauPlug.fromFile(a)
      plug.list.size must_== 22
      plug.list(0).lyric must_== "か"
      plug.list(0).blockName must_== "#0004"
    }
    "要素が順番に取得できていること" in {
      val a = "src/test/scala/jp/gr/java_conf/frontier/utauplug/UtauPlug_test.ust"
      val plug = UtauPlug.fromFile(a)
      plug.list(0).lyric must_== "か"
      plug.list(1).lyric must_== "る"
      plug.list(2).lyric must_== "い"
      plug.list(3).lyric must_== "R"

    }

  }

  //output
}