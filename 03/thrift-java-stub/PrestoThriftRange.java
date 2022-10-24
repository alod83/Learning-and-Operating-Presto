/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftRange implements org.apache.thrift.TBase<PrestoThriftRange, PrestoThriftRange._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftRange");

  private static final org.apache.thrift.protocol.TField LOW_FIELD_DESC = new org.apache.thrift.protocol.TField("low", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HIGH_FIELD_DESC = new org.apache.thrift.protocol.TField("high", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftRangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable PrestoThriftMarker low; // required
  public @org.apache.thrift.annotation.Nullable PrestoThriftMarker high; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOW((short)1, "low"),
    HIGH((short)2, "high");

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
        case 1: // LOW
          return LOW;
        case 2: // HIGH
          return HIGH;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOW, new org.apache.thrift.meta_data.FieldMetaData("low", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftMarker.class)));
    tmpMap.put(_Fields.HIGH, new org.apache.thrift.meta_data.FieldMetaData("high", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftMarker.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftRange.class, metaDataMap);
  }

  public PrestoThriftRange() {
  }

  public PrestoThriftRange(
    PrestoThriftMarker low,
    PrestoThriftMarker high)
  {
    this();
    this.low = low;
    this.high = high;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftRange(PrestoThriftRange other) {
    if (other.isSetLow()) {
      this.low = new PrestoThriftMarker(other.low);
    }
    if (other.isSetHigh()) {
      this.high = new PrestoThriftMarker(other.high);
    }
  }

  @Override
  public PrestoThriftRange deepCopy() {
    return new PrestoThriftRange(this);
  }

  @Override
  public void clear() {
    this.low = null;
    this.high = null;
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftMarker getLow() {
    return this.low;
  }

  public PrestoThriftRange setLow(@org.apache.thrift.annotation.Nullable PrestoThriftMarker low) {
    this.low = low;
    return this;
  }

  public void unsetLow() {
    this.low = null;
  }

  /** Returns true if field low is set (has been assigned a value) and false otherwise */
  public boolean isSetLow() {
    return this.low != null;
  }

  public void setLowIsSet(boolean value) {
    if (!value) {
      this.low = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftMarker getHigh() {
    return this.high;
  }

  public PrestoThriftRange setHigh(@org.apache.thrift.annotation.Nullable PrestoThriftMarker high) {
    this.high = high;
    return this;
  }

  public void unsetHigh() {
    this.high = null;
  }

  /** Returns true if field high is set (has been assigned a value) and false otherwise */
  public boolean isSetHigh() {
    return this.high != null;
  }

  public void setHighIsSet(boolean value) {
    if (!value) {
      this.high = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LOW:
      if (value == null) {
        unsetLow();
      } else {
        setLow((PrestoThriftMarker)value);
      }
      break;

    case HIGH:
      if (value == null) {
        unsetHigh();
      } else {
        setHigh((PrestoThriftMarker)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOW:
      return getLow();

    case HIGH:
      return getHigh();

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
    case LOW:
      return isSetLow();
    case HIGH:
      return isSetHigh();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftRange)
      return this.equals((PrestoThriftRange)that);
    return false;
  }

  public boolean equals(PrestoThriftRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_low = true && this.isSetLow();
    boolean that_present_low = true && that.isSetLow();
    if (this_present_low || that_present_low) {
      if (!(this_present_low && that_present_low))
        return false;
      if (!this.low.equals(that.low))
        return false;
    }

    boolean this_present_high = true && this.isSetHigh();
    boolean that_present_high = true && that.isSetHigh();
    if (this_present_high || that_present_high) {
      if (!(this_present_high && that_present_high))
        return false;
      if (!this.high.equals(that.high))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLow()) ? 131071 : 524287);
    if (isSetLow())
      hashCode = hashCode * 8191 + low.hashCode();

    hashCode = hashCode * 8191 + ((isSetHigh()) ? 131071 : 524287);
    if (isSetHigh())
      hashCode = hashCode * 8191 + high.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLow(), other.isSetLow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.low, other.low);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHigh(), other.isSetHigh());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHigh()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.high, other.high);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftRange(");
    boolean first = true;

    sb.append("low:");
    if (this.low == null) {
      sb.append("null");
    } else {
      sb.append(this.low);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("high:");
    if (this.high == null) {
      sb.append("null");
    } else {
      sb.append(this.high);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (low != null) {
      low.validate();
    }
    if (high != null) {
      high.validate();
    }
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

  private static class PrestoThriftRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftRangeStandardScheme getScheme() {
      return new PrestoThriftRangeStandardScheme();
    }
  }

  private static class PrestoThriftRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftRange> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.low = new PrestoThriftMarker();
              struct.low.read(iprot);
              struct.setLowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HIGH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.high = new PrestoThriftMarker();
              struct.high.read(iprot);
              struct.setHighIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.low != null) {
        oprot.writeFieldBegin(LOW_FIELD_DESC);
        struct.low.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.high != null) {
        oprot.writeFieldBegin(HIGH_FIELD_DESC);
        struct.high.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrestoThriftRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftRangeTupleScheme getScheme() {
      return new PrestoThriftRangeTupleScheme();
    }
  }

  private static class PrestoThriftRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLow()) {
        optionals.set(0);
      }
      if (struct.isSetHigh()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLow()) {
        struct.low.write(oprot);
      }
      if (struct.isSetHigh()) {
        struct.high.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.low = new PrestoThriftMarker();
        struct.low.read(iprot);
        struct.setLowIsSet(true);
      }
      if (incoming.get(1)) {
        struct.high = new PrestoThriftMarker();
        struct.high.read(iprot);
        struct.setHighIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
