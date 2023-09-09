package fs2.io.epoll

import cats.effect.IO
import munit.CatsEffectSuite

class SampleSuite extends CatsEffectSuite {

  test("tests can return IO[Unit] with assertions expressed via a map") {
    IO(42).map(it => assertEquals(it, 42))
  }
}
