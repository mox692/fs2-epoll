実装するもの

* EpollApp
  * EpollSystem (ref: https://github.com/typelevel/cats-effect/blob/fdb2a3e468a67c51a513aec758fed11caa44a405/core/native/src/main/scala/cats/effect/unsafe/EpollSystem.scala)
* EpollNetwork
  * EpollSocket
  * EpollSocketGroup
    * io/jvm-native/src/main/scala/fs2/io/net/SocketGroupPlatform.scala この辺の実装を置き換える
  * SocketChannel (?)
* Epoll.scala
  * Uring.scalaに相当しそうなもの
