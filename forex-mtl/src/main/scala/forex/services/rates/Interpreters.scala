package forex.services.rates

import cats.effect.Async
import forex.services.rates.interpreters._
import org.http4s.client.Client

object Interpreters {
  def dummy[F[_]: Async](client: Client[F]): Algebra[F] = new OneFrame[F](client)
}