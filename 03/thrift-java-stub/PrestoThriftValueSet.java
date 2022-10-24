/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftValueSet implements org.apache.thrift.TBase<PrestoThriftValueSet, PrestoThriftValueSet._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftValueSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftValueSet");

  private static final org.apache.thrift.protocol.TField ALL_OR_NONE_VALUE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("allOrNoneValueSet", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField EQUATABLE_VALUE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("equatableValueSet", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField RANGE_VALUE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("rangeValueSet", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftValueSetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftValueSetTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable PrestoThriftAllOrNoneValueSet allOrNoneValueSet; // optional
  public @org.apache.thrift.annotation.Nullable PrestoThriftEquatableValueSet equatableValueSet; // optional
  public @org.apache.thrift.annotation.Nullable PrestoThriftRangeValueSet rangeValueSet; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALL_OR_NONE_VALUE_SET((short)1, "allOrNoneValueSet"),
    EQUATABLE_VALUE_SET((short)2, "equatableValueSet"),
    RANGE_VALUE_SET((short)3, "rangeValueSet");

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
        case 1: // ALL_OR_NONE_VALUE_SET
          return ALL_OR_NONE_VALUE_SET;
        case 2: // EQUATABLE_VALUE_SET
          return EQUATABLE_VALUE_SET;
        case 3: // RANGE_VALUE_SET
          return RANGE_VALUE_SET;
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
  private static final _Fields optionals[] = {_Fields.ALL_OR_NONE_VALUE_SET,_Fields.EQUATABLE_VALUE_SET,_Fields.RANGE_VALUE_SET};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALL_OR_NONE_VALUE_SET, new org.apache.thrift.meta_data.FieldMetaData("allOrNoneValueSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftAllOrNoneValueSet.class)));
    tmpMap.put(_Fields.EQUATABLE_VALUE_SET, new org.apache.thrift.meta_data.FieldMetaData("equatableValueSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftEquatableValueSet.class)));
    tmpMap.put(_Fields.RANGE_VALUE_SET, new org.apache.thrift.meta_data.FieldMetaData("rangeValueSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftRangeValueSet.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftValueSet.class, metaDataMap);
  }

  public PrestoThriftValueSet() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftValueSet(PrestoThriftValueSet other) {
    if (other.isSetAllOrNoneValueSet()) {
      this.allOrNoneValueSet = new PrestoThriftAllOrNoneValueSet(other.allOrNoneValueSet);
    }
    if (other.isSetEquatableValueSet()) {
      this.equatableValueSet = new PrestoThriftEquatableValueSet(other.equatableValueSet);
    }
    if (other.isSetRangeValueSet()) {
      this.rangeValueSet = new PrestoThriftRangeValueSet(other.rangeValueSet);
    }
  }

  @Override
  public PrestoThriftValueSet deepCopy() {
    return new PrestoThriftValueSet(this);
  }

  @Override
  public void clear() {
    this.allOrNoneValueSet = null;
    this.equatableValueSet = null;
    this.rangeValueSet = null;
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftAllOrNoneValueSet getAllOrNoneValueSet() {
    return this.allOrNoneValueSet;
  }

  public PrestoThriftValueSet setAllOrNoneValueSet(@org.apache.thrift.annotation.Nullable PrestoThriftAllOrNoneValueSet allOrNoneValueSet) {
    this.allOrNoneValueSet = allOrNoneValueSet;
    return this;
  }

  public void unsetAllOrNoneValueSet() {
    this.allOrNoneValueSet = null;
  }

  /** Returns true if field allOrNoneValueSet is set (has been assigned a value) and false otherwise */
  public boolean isSetAllOrNoneValueSet() {
    return this.allOrNoneValueSet != null;
  }

  public void setAllOrNoneValueSetIsSet(boolean value) {
    if (!value) {
      this.allOrNoneValueSet = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftEquatableValueSet getEquatableValueSet() {
    return this.equatableValueSet;
  }

  public PrestoThriftValueSet setEquatableValueSet(@org.apache.thrift.annotation.Nullable PrestoThriftEquatableValueSet equatableValueSet) {
    this.equatableValueSet = equatableValueSet;
    return this;
  }

  public void unsetEquatableValueSet() {
    this.equatableValueSet = null;
  }

  /** Returns true if field equatableValueSet is set (has been assigned a value) and false otherwise */
  public boolean isSetEquatableValueSet() {
    return this.equatableValueSet != null;
  }

  public void setEquatableValueSetIsSet(boolean value) {
    if (!value) {
      this.equatableValueSet = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftRangeValueSet getRangeValueSet() {
    return this.rangeValueSet;
  }

  public PrestoThriftValueSet setRangeValueSet(@org.apache.thrift.annotation.Nullable PrestoThriftRangeValueSet rangeValueSet) {
    this.rangeValueSet = rangeValueSet;
    return this;
  }

  public void unsetRangeValueSet() {
    this.rangeValueSet = null;
  }

  /** Returns true if field rangeValueSet is set (has been assigned a value) and false otherwise */
  public boolean isSetRangeValueSet() {
    return this.rangeValueSet != null;
  }

  public void setRangeValueSetIsSet(boolean value) {
    if (!value) {
      this.rangeValueSet = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ALL_OR_NONE_VALUE_SET:
      if (value == null) {
        unsetAllOrNoneValueSet();
      } else {
        setAllOrNoneValueSet((PrestoThriftAllOrNoneValueSet)value);
      }
      break;

    case EQUATABLE_VALUE_SET:
      if (value == null) {
        unsetEquatableValueSet();
      } else {
        setEquatableValueSet((PrestoThriftEquatableValueSet)value);
      }
      break;

    case RANGE_VALUE_SET:
      if (value == null) {
        unsetRangeValueSet();
      } else {
        setRangeValueSet((PrestoThriftRangeValueSet)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ALL_OR_NONE_VALUE_SET:
      return getAllOrNoneValueSet();

    case EQUATABLE_VALUE_SET:
      return getEquatableValueSet();

    case RANGE_VALUE_SET:
      return getRangeValueSet();

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
    case ALL_OR_NONE_VALUE_SET:
      return isSetAllOrNoneValueSet();
    case EQUATABLE_VALUE_SET:
      return isSetEquatableValueSet();
    case RANGE_VALUE_SET:
      return isSetRangeValueSet();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftValueSet)
      return this.equals((PrestoThriftValueSet)that);
    return false;
  }

  public boolean equals(PrestoThriftValueSet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_allOrNoneValueSet = true && this.isSetAllOrNoneValueSet();
    boolean that_present_allOrNoneValueSet = true && that.isSetAllOrNoneValueSet();
    if (this_present_allOrNoneValueSet || that_present_allOrNoneValueSet) {
      if (!(this_present_allOrNoneValueSet && that_present_allOrNoneValueSet))
        return false;
      if (!this.allOrNoneValueSet.equals(that.allOrNoneValueSet))
        return false;
    }

    boolean this_present_equatableValueSet = true && this.isSetEquatableValueSet();
    boolean that_present_equatableValueSet = true && that.isSetEquatableValueSet();
    if (this_present_equatableValueSet || that_present_equatableValueSet) {
      if (!(this_present_equatableValueSet && that_present_equatableValueSet))
        return false;
      if (!this.equatableValueSet.equals(that.equatableValueSet))
        return false;
    }

    boolean this_present_rangeValueSet = true && this.isSetRangeValueSet();
    boolean that_present_rangeValueSet = true && that.isSetRangeValueSet();
    if (this_present_rangeValueSet || that_present_rangeValueSet) {
      if (!(this_present_rangeValueSet && that_present_rangeValueSet))
        return false;
      if (!this.rangeValueSet.equals(that.rangeValueSet))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAllOrNoneValueSet()) ? 131071 : 524287);
    if (isSetAllOrNoneValueSet())
      hashCode = hashCode * 8191 + allOrNoneValueSet.hashCode();

    hashCode = hashCode * 8191 + ((isSetEquatableValueSet()) ? 131071 : 524287);
    if (isSetEquatableValueSet())
      hashCode = hashCode * 8191 + equatableValueSet.hashCode();

    hashCode = hashCode * 8191 + ((isSetRangeValueSet()) ? 131071 : 524287);
    if (isSetRangeValueSet())
      hashCode = hashCode * 8191 + rangeValueSet.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftValueSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAllOrNoneValueSet(), other.isSetAllOrNoneValueSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllOrNoneValueSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allOrNoneValueSet, other.allOrNoneValueSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEquatableValueSet(), other.isSetEquatableValueSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEquatableValueSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.equatableValueSet, other.equatableValueSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRangeValueSet(), other.isSetRangeValueSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRangeValueSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rangeValueSet, other.rangeValueSet);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftValueSet(");
    boolean first = true;

    if (isSetAllOrNoneValueSet()) {
      sb.append("allOrNoneValueSet:");
      if (this.allOrNoneValueSet == null) {
        sb.append("null");
      } else {
        sb.append(this.allOrNoneValueSet);
      }
      first = false;
    }
    if (isSetEquatableValueSet()) {
      if (!first) sb.append(", ");
      sb.append("equatableValueSet:");
      if (this.equatableValueSet == null) {
        sb.append("null");
      } else {
        sb.append(this.equatableValueSet);
      }
      first = false;
    }
    if (isSetRangeValueSet()) {
      if (!first) sb.append(", ");
      sb.append("rangeValueSet:");
      if (this.rangeValueSet == null) {
        sb.append("null");
      } else {
        sb.append(this.rangeValueSet);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (allOrNoneValueSet != null) {
      allOrNoneValueSet.validate();
    }
    if (equatableValueSet != null) {
      equatableValueSet.validate();
    }
    if (rangeValueSet != null) {
      rangeValueSet.validate();
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

  private static class PrestoThriftValueSetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftValueSetStandardScheme getScheme() {
      return new PrestoThriftValueSetStandardScheme();
    }
  }

  private static class PrestoThriftValueSetStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftValueSet> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftValueSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALL_OR_NONE_VALUE_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.allOrNoneValueSet = new PrestoThriftAllOrNoneValueSet();
              struct.allOrNoneValueSet.read(iprot);
              struct.setAllOrNoneValueSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EQUATABLE_VALUE_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.equatableValueSet = new PrestoThriftEquatableValueSet();
              struct.equatableValueSet.read(iprot);
              struct.setEquatableValueSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RANGE_VALUE_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.rangeValueSet = new PrestoThriftRangeValueSet();
              struct.rangeValueSet.read(iprot);
              struct.setRangeValueSetIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftValueSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.allOrNoneValueSet != null) {
        if (struct.isSetAllOrNoneValueSet()) {
          oprot.writeFieldBegin(ALL_OR_NONE_VALUE_SET_FIELD_DESC);
          struct.allOrNoneValueSet.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.equatableValueSet != null) {
        if (struct.isSetEquatableValueSet()) {
          oprot.writeFieldBegin(EQUATABLE_VALUE_SET_FIELD_DESC);
          struct.equatableValueSet.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rangeValueSet != null) {
        if (struct.isSetRangeValueSet()) {
          oprot.writeFieldBegin(RANGE_VALUE_SET_FIELD_DESC);
          struct.rangeValueSet.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrestoThriftValueSetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftValueSetTupleScheme getScheme() {
      return new PrestoThriftValueSetTupleScheme();
    }
  }

  private static class PrestoThriftValueSetTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftValueSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftValueSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAllOrNoneValueSet()) {
        optionals.set(0);
      }
      if (struct.isSetEquatableValueSet()) {
        optionals.set(1);
      }
      if (struct.isSetRangeValueSet()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAllOrNoneValueSet()) {
        struct.allOrNoneValueSet.write(oprot);
      }
      if (struct.isSetEquatableValueSet()) {
        struct.equatableValueSet.write(oprot);
      }
      if (struct.isSetRangeValueSet()) {
        struct.rangeValueSet.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftValueSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.allOrNoneValueSet = new PrestoThriftAllOrNoneValueSet();
        struct.allOrNoneValueSet.read(iprot);
        struct.setAllOrNoneValueSetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.equatableValueSet = new PrestoThriftEquatableValueSet();
        struct.equatableValueSet.read(iprot);
        struct.setEquatableValueSetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rangeValueSet = new PrestoThriftRangeValueSet();
        struct.rangeValueSet.read(iprot);
        struct.setRangeValueSetIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
