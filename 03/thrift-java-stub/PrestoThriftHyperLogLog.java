/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
/**
 * Elements of {@code nulls} array determine if a value for a corresponding row is null.
 * Each elements of {@code sizes} array contains the length in bytes for the corresponding element.
 * If row is null then the corresponding element in {@code sizes} is ignored.
 * {@code bytes} array contains encoded byte values for HyperLogLog representation as defined in
 * Airlift specification: href="https://github.com/airlift/airlift/blob/master/stats/docs/hll.md
 * Values for all rows are written to {@code bytes} array one after another.
 * The total number of bytes must be equal to the sum of all sizes.
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftHyperLogLog implements org.apache.thrift.TBase<PrestoThriftHyperLogLog, PrestoThriftHyperLogLog._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftHyperLogLog> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftHyperLogLog");

  private static final org.apache.thrift.protocol.TField NULLS_FIELD_DESC = new org.apache.thrift.protocol.TField("nulls", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SIZES_FIELD_DESC = new org.apache.thrift.protocol.TField("sizes", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("bytes", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftHyperLogLogStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftHyperLogLogTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Boolean> nulls; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> sizes; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer bytes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NULLS((short)1, "nulls"),
    SIZES((short)2, "sizes"),
    BYTES((short)3, "bytes");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NULLS
          return NULLS;
        case 2: // SIZES
          return SIZES;
        case 3: // BYTES
          return BYTES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.NULLS,_Fields.SIZES,_Fields.BYTES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NULLS, new org.apache.thrift.meta_data.FieldMetaData("nulls", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.SIZES, new org.apache.thrift.meta_data.FieldMetaData("sizes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.BYTES, new org.apache.thrift.meta_data.FieldMetaData("bytes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftHyperLogLog.class, metaDataMap);
  }

  public PrestoThriftHyperLogLog() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftHyperLogLog(PrestoThriftHyperLogLog other) {
    if (other.isSetNulls()) {
      java.util.List<java.lang.Boolean> __this__nulls = new java.util.ArrayList<java.lang.Boolean>(other.nulls);
      this.nulls = __this__nulls;
    }
    if (other.isSetSizes()) {
      java.util.List<java.lang.Integer> __this__sizes = new java.util.ArrayList<java.lang.Integer>(other.sizes);
      this.sizes = __this__sizes;
    }
    if (other.isSetBytes()) {
      this.bytes = org.apache.thrift.TBaseHelper.copyBinary(other.bytes);
    }
  }

  @Override
  public PrestoThriftHyperLogLog deepCopy() {
    return new PrestoThriftHyperLogLog(this);
  }

  @Override
  public void clear() {
    this.nulls = null;
    this.sizes = null;
    this.bytes = null;
  }

  public int getNullsSize() {
    return (this.nulls == null) ? 0 : this.nulls.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Boolean> getNullsIterator() {
    return (this.nulls == null) ? null : this.nulls.iterator();
  }

  public void addToNulls(boolean elem) {
    if (this.nulls == null) {
      this.nulls = new java.util.ArrayList<java.lang.Boolean>();
    }
    this.nulls.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Boolean> getNulls() {
    return this.nulls;
  }

  public PrestoThriftHyperLogLog setNulls(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Boolean> nulls) {
    this.nulls = nulls;
    return this;
  }

  public void unsetNulls() {
    this.nulls = null;
  }

  /** Returns true if field nulls is set (has been assigned a value) and false otherwise */
  public boolean isSetNulls() {
    return this.nulls != null;
  }

  public void setNullsIsSet(boolean value) {
    if (!value) {
      this.nulls = null;
    }
  }

  public int getSizesSize() {
    return (this.sizes == null) ? 0 : this.sizes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getSizesIterator() {
    return (this.sizes == null) ? null : this.sizes.iterator();
  }

  public void addToSizes(int elem) {
    if (this.sizes == null) {
      this.sizes = new java.util.ArrayList<java.lang.Integer>();
    }
    this.sizes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getSizes() {
    return this.sizes;
  }

  public PrestoThriftHyperLogLog setSizes(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> sizes) {
    this.sizes = sizes;
    return this;
  }

  public void unsetSizes() {
    this.sizes = null;
  }

  /** Returns true if field sizes is set (has been assigned a value) and false otherwise */
  public boolean isSetSizes() {
    return this.sizes != null;
  }

  public void setSizesIsSet(boolean value) {
    if (!value) {
      this.sizes = null;
    }
  }

  public byte[] getBytes() {
    setBytes(org.apache.thrift.TBaseHelper.rightSize(bytes));
    return bytes == null ? null : bytes.array();
  }

  public java.nio.ByteBuffer bufferForBytes() {
    return org.apache.thrift.TBaseHelper.copyBinary(bytes);
  }

  public PrestoThriftHyperLogLog setBytes(byte[] bytes) {
    this.bytes = bytes == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(bytes.clone());
    return this;
  }

  public PrestoThriftHyperLogLog setBytes(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer bytes) {
    this.bytes = org.apache.thrift.TBaseHelper.copyBinary(bytes);
    return this;
  }

  public void unsetBytes() {
    this.bytes = null;
  }

  /** Returns true if field bytes is set (has been assigned a value) and false otherwise */
  public boolean isSetBytes() {
    return this.bytes != null;
  }

  public void setBytesIsSet(boolean value) {
    if (!value) {
      this.bytes = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NULLS:
      if (value == null) {
        unsetNulls();
      } else {
        setNulls((java.util.List<java.lang.Boolean>)value);
      }
      break;

    case SIZES:
      if (value == null) {
        unsetSizes();
      } else {
        setSizes((java.util.List<java.lang.Integer>)value);
      }
      break;

    case BYTES:
      if (value == null) {
        unsetBytes();
      } else {
        if (value instanceof byte[]) {
          setBytes((byte[])value);
        } else {
          setBytes((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NULLS:
      return getNulls();

    case SIZES:
      return getSizes();

    case BYTES:
      return getBytes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NULLS:
      return isSetNulls();
    case SIZES:
      return isSetSizes();
    case BYTES:
      return isSetBytes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftHyperLogLog)
      return this.equals((PrestoThriftHyperLogLog)that);
    return false;
  }

  public boolean equals(PrestoThriftHyperLogLog that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nulls = true && this.isSetNulls();
    boolean that_present_nulls = true && that.isSetNulls();
    if (this_present_nulls || that_present_nulls) {
      if (!(this_present_nulls && that_present_nulls))
        return false;
      if (!this.nulls.equals(that.nulls))
        return false;
    }

    boolean this_present_sizes = true && this.isSetSizes();
    boolean that_present_sizes = true && that.isSetSizes();
    if (this_present_sizes || that_present_sizes) {
      if (!(this_present_sizes && that_present_sizes))
        return false;
      if (!this.sizes.equals(that.sizes))
        return false;
    }

    boolean this_present_bytes = true && this.isSetBytes();
    boolean that_present_bytes = true && that.isSetBytes();
    if (this_present_bytes || that_present_bytes) {
      if (!(this_present_bytes && that_present_bytes))
        return false;
      if (!this.bytes.equals(that.bytes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNulls()) ? 131071 : 524287);
    if (isSetNulls())
      hashCode = hashCode * 8191 + nulls.hashCode();

    hashCode = hashCode * 8191 + ((isSetSizes()) ? 131071 : 524287);
    if (isSetSizes())
      hashCode = hashCode * 8191 + sizes.hashCode();

    hashCode = hashCode * 8191 + ((isSetBytes()) ? 131071 : 524287);
    if (isSetBytes())
      hashCode = hashCode * 8191 + bytes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftHyperLogLog other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNulls(), other.isSetNulls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNulls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nulls, other.nulls);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSizes(), other.isSetSizes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSizes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sizes, other.sizes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBytes(), other.isSetBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bytes, other.bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftHyperLogLog(");
    boolean first = true;

    if (isSetNulls()) {
      sb.append("nulls:");
      if (this.nulls == null) {
        sb.append("null");
      } else {
        sb.append(this.nulls);
      }
      first = false;
    }
    if (isSetSizes()) {
      if (!first) sb.append(", ");
      sb.append("sizes:");
      if (this.sizes == null) {
        sb.append("null");
      } else {
        sb.append(this.sizes);
      }
      first = false;
    }
    if (isSetBytes()) {
      if (!first) sb.append(", ");
      sb.append("bytes:");
      if (this.bytes == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.bytes, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrestoThriftHyperLogLogStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftHyperLogLogStandardScheme getScheme() {
      return new PrestoThriftHyperLogLogStandardScheme();
    }
  }

  private static class PrestoThriftHyperLogLogStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftHyperLogLog> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftHyperLogLog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NULLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list178 = iprot.readListBegin();
                struct.nulls = new java.util.ArrayList<java.lang.Boolean>(_list178.size);
                boolean _elem179;
                for (int _i180 = 0; _i180 < _list178.size; ++_i180)
                {
                  _elem179 = iprot.readBool();
                  struct.nulls.add(_elem179);
                }
                iprot.readListEnd();
              }
              struct.setNullsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SIZES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list181 = iprot.readListBegin();
                struct.sizes = new java.util.ArrayList<java.lang.Integer>(_list181.size);
                int _elem182;
                for (int _i183 = 0; _i183 < _list181.size; ++_i183)
                {
                  _elem182 = iprot.readI32();
                  struct.sizes.add(_elem182);
                }
                iprot.readListEnd();
              }
              struct.setSizesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BYTES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bytes = iprot.readBinary();
              struct.setBytesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftHyperLogLog struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nulls != null) {
        if (struct.isSetNulls()) {
          oprot.writeFieldBegin(NULLS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, struct.nulls.size()));
            for (boolean _iter184 : struct.nulls)
            {
              oprot.writeBool(_iter184);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.sizes != null) {
        if (struct.isSetSizes()) {
          oprot.writeFieldBegin(SIZES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.sizes.size()));
            for (int _iter185 : struct.sizes)
            {
              oprot.writeI32(_iter185);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.bytes != null) {
        if (struct.isSetBytes()) {
          oprot.writeFieldBegin(BYTES_FIELD_DESC);
          oprot.writeBinary(struct.bytes);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrestoThriftHyperLogLogTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftHyperLogLogTupleScheme getScheme() {
      return new PrestoThriftHyperLogLogTupleScheme();
    }
  }

  private static class PrestoThriftHyperLogLogTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftHyperLogLog> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftHyperLogLog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNulls()) {
        optionals.set(0);
      }
      if (struct.isSetSizes()) {
        optionals.set(1);
      }
      if (struct.isSetBytes()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNulls()) {
        {
          oprot.writeI32(struct.nulls.size());
          for (boolean _iter186 : struct.nulls)
          {
            oprot.writeBool(_iter186);
          }
        }
      }
      if (struct.isSetSizes()) {
        {
          oprot.writeI32(struct.sizes.size());
          for (int _iter187 : struct.sizes)
          {
            oprot.writeI32(_iter187);
          }
        }
      }
      if (struct.isSetBytes()) {
        oprot.writeBinary(struct.bytes);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftHyperLogLog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list188 = iprot.readListBegin(org.apache.thrift.protocol.TType.BOOL);
          struct.nulls = new java.util.ArrayList<java.lang.Boolean>(_list188.size);
          boolean _elem189;
          for (int _i190 = 0; _i190 < _list188.size; ++_i190)
          {
            _elem189 = iprot.readBool();
            struct.nulls.add(_elem189);
          }
        }
        struct.setNullsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list191 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.sizes = new java.util.ArrayList<java.lang.Integer>(_list191.size);
          int _elem192;
          for (int _i193 = 0; _i193 < _list191.size; ++_i193)
          {
            _elem192 = iprot.readI32();
            struct.sizes.add(_elem192);
          }
        }
        struct.setSizesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bytes = iprot.readBinary();
        struct.setBytesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
