/**
 * Generated by Scrooge
 *   version: ?
 *   rev: ?
 *   built at: ?
 */
package com.twitter.scrooge.test.gold.thriftscala

import com.twitter.scrooge.{
  HasThriftStructCodec3,
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object Response extends ThriftStructCodec3[Response] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("Response")
  val StatusCodeField = new TField("statusCode", TType.I32, 1)
  val StatusCodeFieldManifest = implicitly[Manifest[Int]]
  val ResponseUnionField = new TField("responseUnion", TType.STRUCT, 2)
  val ResponseUnionFieldManifest = implicitly[Manifest[com.twitter.scrooge.test.gold.thriftscala.ResponseUnion]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      StatusCodeField,
      false,
      false,
      StatusCodeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      ResponseUnionField,
      false,
      false,
      ResponseUnionFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: Response): Unit = {
  }

  def withoutPassthroughFields(original: Response): Response =
    new Immutable(
      statusCode =
        {
          val field = original.statusCode
          field
        },
      responseUnion =
        {
          val field = original.responseUnion
          com.twitter.scrooge.test.gold.thriftscala.ResponseUnion.withoutPassthroughFields(field)
        }
    )

  override def encode(_item: Response, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): Response = {

    var statusCode: Int = 0
    var responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = null

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I32 =>

                statusCode = readStatusCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'statusCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>

                responseUnion = readResponseUnionValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'responseUnion' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      statusCode,
      responseUnion,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): Response =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): Response = {
    var statusCode: Int = 0
    var responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = null
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I32 =>
                statusCode = readStatusCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'statusCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRUCT =>
                responseUnion = readResponseUnionValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'responseUnion' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      statusCode,
      responseUnion,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    statusCode: Int,
    responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion
  ): Response =
    new Immutable(
      statusCode,
      responseUnion
    )

  def unapply(_item: Response): _root_.scala.Option[scala.Product2[Int, com.twitter.scrooge.test.gold.thriftscala.ResponseUnion]] = _root_.scala.Some(_item)


  @inline private def readStatusCodeValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeStatusCodeField(statusCode_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(StatusCodeField)
    writeStatusCodeValue(statusCode_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeStatusCodeValue(statusCode_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(statusCode_item)
  }

  @inline private def readResponseUnionValue(_iprot: TProtocol): com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = {
    com.twitter.scrooge.test.gold.thriftscala.ResponseUnion.decode(_iprot)
  }

  @inline private def writeResponseUnionField(responseUnion_item: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ResponseUnionField)
    writeResponseUnionValue(responseUnion_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeResponseUnionValue(responseUnion_item: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion, _oprot: TProtocol): Unit = {
    responseUnion_item.write(_oprot)
  }


  object Immutable extends ThriftStructCodec3[Response] {
    override def encode(_item: Response, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): Response = Response.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[Response] = Response.metaData
  }

  /**
   * The default read-only implementation of Response.  You typically should not need to
   * directly reference this class; instead, use the Response.apply method to construct
   * new instances.
   */
  class Immutable(
      val statusCode: Int,
      val responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Response {
    def this(
      statusCode: Int,
      responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion
    ) = this(
      statusCode,
      responseUnion,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      val statusCode: Int,
      val responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Response {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }


    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the Response trait with additional state or
   * behavior and implement the read-only methods from Response using an underlying
   * instance.
   */
  trait Proxy extends Response {
    protected def _underlying_Response: Response
    override def statusCode: Int = _underlying_Response.statusCode
    override def responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = _underlying_Response.responseUnion
    override def _passthroughFields = _underlying_Response._passthroughFields
  }
}

trait Response
  extends ThriftStruct
  with scala.Product2[Int, com.twitter.scrooge.test.gold.thriftscala.ResponseUnion]
  with HasThriftStructCodec3[Response]
  with java.io.Serializable
{
  import Response._

  def statusCode: Int
  def responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = statusCode
  def _2 = responseUnion


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (true) {
                writeStatusCodeValue(statusCode, _oprot)
                _root_.scala.Some(Response.StatusCodeField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (responseUnion ne null) {
                writeResponseUnionValue(responseUnion, _oprot)
                _root_.scala.Some(Response.ResponseUnionField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): Response = {
    var statusCode: Int = this.statusCode
    var responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = this.responseUnion
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        statusCode = readStatusCodeValue(_blob.read)
      case 2 =>
        responseUnion = readResponseUnionValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      statusCode,
      responseUnion,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): Response = {
    var statusCode: Int = this.statusCode
    var responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = this.responseUnion

    _fieldId match {
      case 1 =>
        statusCode = 0
      case 2 =>
        responseUnion = null
      case _ =>
    }
    new Immutable(
      statusCode,
      responseUnion,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetStatusCode: Response = unsetField(1)

  def unsetResponseUnion: Response = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    Response.validate(this)
    _oprot.writeStructBegin(Struct)
    writeStatusCodeField(statusCode, _oprot)
    if (responseUnion ne null) writeResponseUnionField(responseUnion, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    statusCode: Int = this.statusCode,
    responseUnion: com.twitter.scrooge.test.gold.thriftscala.ResponseUnion = this.responseUnion,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): Response =
    new Immutable(
      statusCode,
      responseUnion,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[Response]

  private def _equals(x: Response, y: Response): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator)

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[Response]) &&
      _passthroughFields == other.asInstanceOf[Response]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.statusCode
    case 1 => this.responseUnion
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "Response"

  def _codec: ThriftStructCodec3[Response] = Response
}