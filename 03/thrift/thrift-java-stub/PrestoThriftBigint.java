/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
/**
 * Elements of {@code nulls} array determine if a value for a corresponding row is null.
 * Elements of {@code longs} array are values for each row. If row is null then value is ignored.
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftBigint implements org.apache.thrift.TBase<PrestoThriftBigint, PrestoThriftBigint._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftBigint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftBigint");

  private static final org.apache.thrift.protocol.TField NULLS_FIELD_DESC = new org.apache.thrift.protocol.TField("nulls", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField LONGS_FIELD_DESC = new org.apache.thrift.protocol.TField("longs", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftBigintStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftBigintTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Boolean> nulls; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> longs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NULLS((short)1, "nulls"),
    LONGS((short)2, "longs");

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
        case 2: // LONGS
          return LONGS;
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
  private static final _Fields optionals[] = {_Fields.NULLS,_Fields.LONGS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NULLS, new org.apache.thrift.meta_data.FieldMetaData("nulls", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.LONGS, new org.apache.thrift.meta_data.FieldMetaData("longs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftBigint.class, metaDataMap);
  }

  public PrestoThriftBigint() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftBigint(PrestoThriftBigint other) {
    if (other.isSetNulls()) {
      java.util.List<java.lang.Boolean> __this__nulls = new java.util.ArrayList<java.lang.Boolean>(other.nulls);
      this.nulls = __this__nulls;
    }
    if (other.isSetLongs()) {
      java.util.List<java.lang.Long> __this__longs = new java.util.ArrayList<java.lang.Long>(other.longs);
      this.longs = __this__longs;
    }
  }

  @Override
  public PrestoThriftBigint deepCopy() {
    return new PrestoThriftBigint(this);
  }

  @Override
  public void clear() {
    this.nulls = null;
    this.longs = null;
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

  public PrestoThriftBigint setNulls(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Boolean> nulls) {
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

  public int getLongsSize() {
    return (this.longs == null) ? 0 : this.longs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getLongsIterator() {
    return (this.longs == null) ? null : this.longs.iterator();
  }

  public void addToLongs(long elem) {
    if (this.longs == null) {
      this.longs = new java.util.ArrayList<java.lang.Long>();
    }
    this.longs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getLongs() {
    return this.longs;
  }

  public PrestoThriftBigint setLongs(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> longs) {
    this.longs = longs;
    return this;
  }

  public void unsetLongs() {
    this.longs = null;
  }

  /** Returns true if field longs is set (has been assigned a value) and false otherwise */
  public boolean isSetLongs() {
    return this.longs != null;
  }

  public void setLongsIsSet(boolean value) {
    if (!value) {
      this.longs = null;
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

    case LONGS:
      if (value == null) {
        unsetLongs();
      } else {
        setLongs((java.util.List<java.lang.Long>)value);
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

    case LONGS:
      return getLongs();

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
    case LONGS:
      return isSetLongs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftBigint)
      return this.equals((PrestoThriftBigint)that);
    return false;
  }

  public boolean equals(PrestoThriftBigint that) {
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

    boolean this_present_longs = true && this.isSetLongs();
    boolean that_present_longs = true && that.isSetLongs();
    if (this_present_longs || that_present_longs) {
      if (!(this_present_longs && that_present_longs))
        return false;
      if (!this.longs.equals(that.longs))
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

    hashCode = hashCode * 8191 + ((isSetLongs()) ? 131071 : 524287);
    if (isSetLongs())
      hashCode = hashCode * 8191 + longs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftBigint other) {
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
    lastComparison = java.lang.Boolean.compare(isSetLongs(), other.isSetLongs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longs, other.longs);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftBigint(");
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
    if (isSetLongs()) {
      if (!first) sb.append(", ");
      sb.append("longs:");
      if (this.longs == null) {
        sb.append("null");
      } else {
        sb.append(this.longs);
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

  private static class PrestoThriftBigintStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftBigintStandardScheme getScheme() {
      return new PrestoThriftBigintStandardScheme();
    }
  }

  private static class PrestoThriftBigintStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftBigint> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftBigint struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list66 = iprot.readListBegin();
                struct.nulls = new java.util.ArrayList<java.lang.Boolean>(_list66.size);
                boolean _elem67;
                for (int _i68 = 0; _i68 < _list66.size; ++_i68)
                {
                  _elem67 = iprot.readBool();
                  struct.nulls.add(_elem67);
                }
                iprot.readListEnd();
              }
              struct.setNullsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LONGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list69 = iprot.readListBegin();
                struct.longs = new java.util.ArrayList<java.lang.Long>(_list69.size);
                long _elem70;
                for (int _i71 = 0; _i71 < _list69.size; ++_i71)
                {
                  _elem70 = iprot.readI64();
                  struct.longs.add(_elem70);
                }
                iprot.readListEnd();
              }
              struct.setLongsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftBigint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nulls != null) {
        if (struct.isSetNulls()) {
          oprot.writeFieldBegin(NULLS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, struct.nulls.size()));
            for (boolean _iter72 : struct.nulls)
            {
              oprot.writeBool(_iter72);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.longs != null) {
        if (struct.isSetLongs()) {
          oprot.writeFieldBegin(LONGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.longs.size()));
            for (long _iter73 : struct.longs)
            {
              oprot.writeI64(_iter73);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrestoThriftBigintTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftBigintTupleScheme getScheme() {
      return new PrestoThriftBigintTupleScheme();
    }
  }

  private static class PrestoThriftBigintTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftBigint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftBigint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNulls()) {
        optionals.set(0);
      }
      if (struct.isSetLongs()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNulls()) {
        {
          oprot.writeI32(struct.nulls.size());
          for (boolean _iter74 : struct.nulls)
          {
            oprot.writeBool(_iter74);
          }
        }
      }
      if (struct.isSetLongs()) {
        {
          oprot.writeI32(struct.longs.size());
          for (long _iter75 : struct.longs)
          {
            oprot.writeI64(_iter75);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftBigint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list76 = iprot.readListBegin(org.apache.thrift.protocol.TType.BOOL);
          struct.nulls = new java.util.ArrayList<java.lang.Boolean>(_list76.size);
          boolean _elem77;
          for (int _i78 = 0; _i78 < _list76.size; ++_i78)
          {
            _elem77 = iprot.readBool();
            struct.nulls.add(_elem77);
          }
        }
        struct.setNullsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list79 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
          struct.longs = new java.util.ArrayList<java.lang.Long>(_list79.size);
          long _elem80;
          for (int _i81 = 0; _i81 < _list79.size; ++_i81)
          {
            _elem80 = iprot.readI64();
            struct.longs.add(_elem80);
          }
        }
        struct.setLongsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

