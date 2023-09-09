package fs2.io.epoll.net

import fs2.io.net.SocketGroup
import cats.effect.kernel.Resource
import com.comcast.ip4s.{Host, SocketAddress}
import fs2.io.net.{Socket, SocketOption}
import com.comcast.ip4s.{Host, Port}
import fs2.io.net.{Socket, SocketOption}
import cats.effect.kernel.Resource
import com.comcast.ip4s.{Host, IpAddress, Port, SocketAddress}
import fs2.io.net.{Socket, SocketOption}

private final class UringSocketGroup[F[_]] extends SocketGroup[F] {
  def client(to: SocketAddress[Host], options: List[SocketOption]): Resource[F, Socket[F]] = ???

  def server(
      address: Option[Host],
      port: Option[Port],
      options: List[SocketOption]
  ): fs2.Stream[F, Socket[F]] = ???

  def serverResource(
      address: Option[Host],
      port: Option[Port],
      options: List[SocketOption]
  ): Resource[F, (SocketAddress[IpAddress], fs2.Stream[F, Socket[F]])] = ???

}
