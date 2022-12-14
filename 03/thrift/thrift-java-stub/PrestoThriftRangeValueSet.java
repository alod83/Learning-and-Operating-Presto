/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
/**
 * A set containing zero or more Ranges of the same type over a continuous space of possible values.
 * Ranges are coalesced into the most compact representation of non-overlapping Ranges.
 * This structure is used with comparable and orderable types like bigint, integer, double, varchar, etc.
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftRangeValueSet implements org.apache.thrift.TBase<PrestoThriftRangeValueSet, PrestoThriftRangeValueSet._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftRangeValueSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftRangeValueSet");

  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftRangeValueSetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftRangeValueSetTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<PrestoThriftRange> ranges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RANGES((short)1, "ranges");

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
        case 1: // RANGES
          return RANGES;
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
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftRange.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftRangeValueSet.class, metaDataMap);
  }

  public PrestoThriftRangeValueSet() {
  }

  public PrestoThriftRangeValueSet(
    java.util.List<PrestoThriftRange> ranges)
  {
    this();
    this.ranges = ranges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftRangeValueSet(PrestoThriftRangeValueSet other) {
    if (other.isSetRanges()) {
      java.util.List<PrestoThriftRange> __this__ranges = new java.util.ArrayList<PrestoThriftRange>(other.ranges.size());
      for (PrestoThriftRange other_element : other.ranges) {
        __this__ranges.add(new PrestoThriftRange(other_element));
      }
      this.ranges = __this__ranges;
    }
  }

  @Override
  public PrestoThriftRangeValueSet deepCopy() {
    return new PrestoThriftRangeValueSet(this);
  }

  @Override
  public void clear() {
    this.ranges = null;
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<PrestoThriftRange> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(PrestoThriftRange elem) {
    if (this.ranges == null) {
      this.ranges = new java.util.ArrayList<PrestoThriftRange>();
    }
    this.ranges.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<PrestoThriftRange> getRanges() {
    return this.ranges;
  }

  public PrestoThriftRangeValueSet setRanges(@org.apache.thrift.annotation.Nullable java.util.List<PrestoThriftRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((java.util.List<PrestoThriftRange>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RANGES:
      return getRanges();

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
    case RANGES:
      return isSetRanges();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftRangeValueSet)
      return this.equals((PrestoThriftRangeValueSet)that);
    return false;
  }

  public boolean equals(PrestoThriftRangeValueSet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRanges()) ? 131071 : 524287);
    if (isSetRanges())
      hashCode = hashCode * 8191 + ranges.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftRangeValueSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRanges(), other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, other.ranges);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftRangeValueSet(");
    boolean first = true;

    sb.append("ranges:");
    if (this.ranges == null) {
      sb.append("null");
    } else {
      sb.append(this.ranges);
    }
    first = false;
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

  private static class PrestoThriftRangeValueSetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftRangeValueSetStandardScheme getScheme() {
      return new PrestoThriftRangeValueSetStandardScheme();
    }
  }

  private static class PrestoThriftRangeValueSetStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftRangeValueSet> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftRangeValueSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list210 = iprot.readListBegin();
                struct.ranges = new java.util.ArrayList<PrestoThriftRange>(_list210.size);
                @org.apache.thrift.annotation.Nullable PrestoThriftRange _elem211;
                for (int _i212 = 0; _i212 < _list210.size; ++_i212)
                {
                  _elem211 = new PrestoThriftRange();
                  _elem211.read(iprot);
                  struct.ranges.add(_elem211);
                }
                iprot.readListEnd();
              }
              struct.setRangesIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftRangeValueSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ranges != null) {
        oprot.writeFieldBegin(RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ranges.size()));
          for (PrestoThriftRange _iter213 : struct.ranges)
          {
            _iter213.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrestoThriftRangeValueSetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftRangeValueSetTupleScheme getScheme() {
      return new PrestoThriftRangeValueSetTupleScheme();
    }
  }

  private static class PrestoThriftRangeValueSetTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftRangeValueSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftRangeValueSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRanges()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRanges()) {
        {
          oprot.writeI32(struct.ranges.size());
          for (PrestoThriftRange _iter214 : struct.ranges)
          {
            _iter214.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftRangeValueSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list215 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.ranges = new java.util.ArrayList<PrestoThriftRange>(_list215.size);
          @org.apache.thrift.annotation.Nullable PrestoThriftRange _elem216;
          for (int _i217 = 0; _i217 < _list215.size; ++_i217)
          {
            _elem216 = new PrestoThriftRange();
            _elem216.read(iprot);
            struct.ranges.add(_elem216);
          }
        }
        struct.setRangesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

