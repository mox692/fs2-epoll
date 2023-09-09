package fs2.io.epoll.net

import fs2.io.net.Socket
import fs2.Chunk
import com.comcast.ip4s.{IpAddress, SocketAddress}
import fs2.Pipe

private[net] final class UringSocket[F[_]](
) extends Socket[F] {
  def read(maxBytes: Int): F[Option[Chunk[Byte]]] = ???

  def readN(numBytes: Int): F[Chunk[Byte]] = ???

  def reads: fs2.Stream[F, Byte] = ???

  def endOfInput: F[Unit] = ???

  def endOfOutput: F[Unit] = ???

  def isOpen: F[Boolean] = ???

  def remoteAddress: F[SocketAddress[IpAddress]] = ???

  def localAddress: F[SocketAddress[IpAddress]] = ???

  def write(bytes: Chunk[Byte]): F[Unit] = ???

  def writes: Pipe[F, Byte, Nothing] = ???

}
