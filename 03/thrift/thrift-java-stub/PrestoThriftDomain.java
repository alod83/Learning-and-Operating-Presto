/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftDomain implements org.apache.thrift.TBase<PrestoThriftDomain, PrestoThriftDomain._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftDomain> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftDomain");

  private static final org.apache.thrift.protocol.TField VALUE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("valueSet", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NULL_ALLOWED_FIELD_DESC = new org.apache.thrift.protocol.TField("nullAllowed", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftDomainStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftDomainTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable PrestoThriftValueSet valueSet; // required
  public boolean nullAllowed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUE_SET((short)1, "valueSet"),
    NULL_ALLOWED((short)2, "nullAllowed");

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
        case 1: // VALUE_SET
          return VALUE_SET;
        case 2: // NULL_ALLOWED
          return NULL_ALLOWED;
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
  private static final int __NULLALLOWED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUE_SET, new org.apache.thrift.meta_data.FieldMetaData("valueSet", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftValueSet.class)));
    tmpMap.put(_Fields.NULL_ALLOWED, new org.apache.thrift.meta_data.FieldMetaData("nullAllowed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftDomain.class, metaDataMap);
  }

  public PrestoThriftDomain() {
  }

  public PrestoThriftDomain(
    PrestoThriftValueSet valueSet,
    boolean nullAllowed)
  {
    this();
    this.valueSet = valueSet;
    this.nullAllowed = nullAllowed;
    setNullAllowedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftDomain(PrestoThriftDomain other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetValueSet()) {
      this.valueSet = new PrestoThriftValueSet(other.valueSet);
    }
    this.nullAllowed = other.nullAllowed;
  }

  @Override
  public PrestoThriftDomain deepCopy() {
    return new PrestoThriftDomain(this);
  }

  @Override
  public void clear() {
    this.valueSet = null;
    setNullAllowedIsSet(false);
    this.nullAllowed = false;
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftValueSet getValueSet() {
    return this.valueSet;
  }

  public PrestoThriftDomain setValueSet(@org.apache.thrift.annotation.Nullable PrestoThriftValueSet valueSet) {
    this.valueSet = valueSet;
    return this;
  }

  public void unsetValueSet() {
    this.valueSet = null;
  }

  /** Returns true if field valueSet is set (has been assigned a value) and false otherwise */
  public boolean isSetValueSet() {
    return this.valueSet != null;
  }

  public void setValueSetIsSet(boolean value) {
    if (!value) {
      this.valueSet = null;
    }
  }

  public boolean isNullAllowed() {
    return this.nullAllowed;
  }

  public PrestoThriftDomain setNullAllowed(boolean nullAllowed) {
    this.nullAllowed = nullAllowed;
    setNullAllowedIsSet(true);
    return this;
  }

  public void unsetNullAllowed() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NULLALLOWED_ISSET_ID);
  }

  /** Returns true if field nullAllowed is set (has been assigned a value) and false otherwise */
  public boolean isSetNullAllowed() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NULLALLOWED_ISSET_ID);
  }

  public void setNullAllowedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NULLALLOWED_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VALUE_SET:
      if (value == null) {
        unsetValueSet();
      } else {
        setValueSet((PrestoThriftValueSet)value);
      }
      break;

    case NULL_ALLOWED:
      if (value == null) {
        unsetNullAllowed();
      } else {
        setNullAllowed((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUE_SET:
      return getValueSet();

    case NULL_ALLOWED:
      return isNullAllowed();

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
    case VALUE_SET:
      return isSetValueSet();
    case NULL_ALLOWED:
      return isSetNullAllowed();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftDomain)
      return this.equals((PrestoThriftDomain)that);
    return false;
  }

  public boolean equals(PrestoThriftDomain that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_valueSet = true && this.isSetValueSet();
    boolean that_present_valueSet = true && that.isSetValueSet();
    if (this_present_valueSet || that_present_valueSet) {
      if (!(this_present_valueSet && that_present_valueSet))
        return false;
      if (!this.valueSet.equals(that.valueSet))
        return false;
    }

    boolean this_present_nullAllowed = true;
    boolean that_present_nullAllowed = true;
    if (this_present_nullAllowed || that_present_nullAllowed) {
      if (!(this_present_nullAllowed && that_present_nullAllowed))
        return false;
      if (this.nullAllowed != that.nullAllowed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetValueSet()) ? 131071 : 524287);
    if (isSetValueSet())
      hashCode = hashCode * 8191 + valueSet.hashCode();

    hashCode = hashCode * 8191 + ((nullAllowed) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftDomain other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetValueSet(), other.isSetValueSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueSet, other.valueSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNullAllowed(), other.isSetNullAllowed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNullAllowed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nullAllowed, other.nullAllowed);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftDomain(");
    boolean first = true;

    sb.append("valueSet:");
    if (this.valueSet == null) {
      sb.append("null");
    } else {
      sb.append(this.valueSet);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nullAllowed:");
    sb.append(this.nullAllowed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (valueSet != null) {
      valueSet.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrestoThriftDomainStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftDomainStandardScheme getScheme() {
      return new PrestoThriftDomainStandardScheme();
    }
  }

  private static class PrestoThriftDomainStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftDomain> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftDomain struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUE_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.valueSet = new PrestoThriftValueSet();
              struct.valueSet.read(iprot);
              struct.setValueSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NULL_ALLOWED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.nullAllowed = iprot.readBool();
              struct.setNullAllowedIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftDomain struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.valueSet != null) {
        oprot.writeFieldBegin(VALUE_SET_FIELD_DESC);
        struct.valueSet.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NULL_ALLOWED_FIELD_DESC);
      oprot.writeBool(struct.nullAllowed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrestoThriftDomainTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftDomainTupleScheme getScheme() {
      return new PrestoThriftDomainTupleScheme();
    }
  }

  private static class PrestoThriftDomainTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftDomain> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftDomain struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetValueSet()) {
        optionals.set(0);
      }
      if (struct.isSetNullAllowed()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetValueSet()) {
        struct.valueSet.write(oprot);
      }
      if (struct.isSetNullAllowed()) {
        oprot.writeBool(struct.nullAllowed);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftDomain struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.valueSet = new PrestoThriftValueSet();
        struct.valueSet.read(iprot);
        struct.setValueSetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nullAllowed = iprot.readBool();
        struct.setNullAllowedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
