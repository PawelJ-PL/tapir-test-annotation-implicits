import io.circe.{Decoder, Encoder}
import io.circe.generic.semiauto.deriveDecoder
import io.circe.generic.semiauto.deriveEncoder
import io.swagger.annotations.ApiModel
import org.scalatest.WordSpec
import tapir._

class SwaggerAnnotationsSpec extends WordSpec {
  "Ordinary case class" should {
    "Compile with encoder" in {
      implicitly[Encoder[MyDto1]]
    }
    "Compile with schemaFor" in {
      implicitly[SchemaFor[MyDto1]]
    }
  }

  "Annotated case class" should {
    "Compile with encoder" in {
      implicitly[Encoder[MyDto2]]
    }
    "Compile with schemaFor" in {
      implicitly[SchemaFor[MyDto2]]
    }
  }
}

case class MyDto1(foo: String, bar: Int)
object MyDto1 {
  implicit val decoder: Decoder[MyDto1] = deriveDecoder[MyDto1]
  implicit val encoder: Encoder[MyDto1] = deriveEncoder[MyDto1]
}

@ApiModel(description = "Some model")
case class MyDto2(foo: String, bar: Int)
object MyDto2 {
  implicit val decoder: Decoder[MyDto2] = deriveDecoder[MyDto2]
  implicit val encoder: Encoder[MyDto2] = deriveEncoder[MyDto2]
}

