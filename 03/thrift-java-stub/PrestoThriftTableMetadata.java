/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2022-10-24")
public class PrestoThriftTableMetadata implements org.apache.thrift.TBase<PrestoThriftTableMetadata, PrestoThriftTableMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<PrestoThriftTableMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrestoThriftTableMetadata");

  private static final org.apache.thrift.protocol.TField SCHEMA_TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("schemaTableName", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField INDEXABLE_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("indexableKeys", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrestoThriftTableMetadataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrestoThriftTableMetadataTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable PrestoThriftSchemaTableName schemaTableName; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<PrestoThriftColumnMetadata> columns; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String comment; // optional
  /**
   * Returns a list of key sets which can be used for index lookups.
   * The list is expected to have only unique key sets.
   * {@code set<set<string>>} is not used here because some languages (like php) don't support it.
   */
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.Set<java.lang.String>> indexableKeys; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEMA_TABLE_NAME((short)1, "schemaTableName"),
    COLUMNS((short)2, "columns"),
    COMMENT((short)3, "comment"),
    /**
     * Returns a list of key sets which can be used for index lookups.
     * The list is expected to have only unique key sets.
     * {@code set<set<string>>} is not used here because some languages (like php) don't support it.
     */
    INDEXABLE_KEYS((short)4, "indexableKeys");

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
        case 1: // SCHEMA_TABLE_NAME
          return SCHEMA_TABLE_NAME;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // COMMENT
          return COMMENT;
        case 4: // INDEXABLE_KEYS
          return INDEXABLE_KEYS;
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
  private static final _Fields optionals[] = {_Fields.COMMENT,_Fields.INDEXABLE_KEYS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEMA_TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("schemaTableName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftSchemaTableName.class)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrestoThriftColumnMetadata.class))));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEXABLE_KEYS, new org.apache.thrift.meta_data.FieldMetaData("indexableKeys", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrestoThriftTableMetadata.class, metaDataMap);
  }

  public PrestoThriftTableMetadata() {
  }

  public PrestoThriftTableMetadata(
    PrestoThriftSchemaTableName schemaTableName,
    java.util.List<PrestoThriftColumnMetadata> columns)
  {
    this();
    this.schemaTableName = schemaTableName;
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrestoThriftTableMetadata(PrestoThriftTableMetadata other) {
    if (other.isSetSchemaTableName()) {
      this.schemaTableName = new PrestoThriftSchemaTableName(other.schemaTableName);
    }
    if (other.isSetColumns()) {
      java.util.List<PrestoThriftColumnMetadata> __this__columns = new java.util.ArrayList<PrestoThriftColumnMetadata>(other.columns.size());
      for (PrestoThriftColumnMetadata other_element : other.columns) {
        __this__columns.add(new PrestoThriftColumnMetadata(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
    if (other.isSetIndexableKeys()) {
      java.util.List<java.util.Set<java.lang.String>> __this__indexableKeys = new java.util.ArrayList<java.util.Set<java.lang.String>>(other.indexableKeys.size());
      for (java.util.Set<java.lang.String> other_element : other.indexableKeys) {
        java.util.Set<java.lang.String> __this__indexableKeys_copy = new java.util.HashSet<java.lang.String>(other_element);
        __this__indexableKeys.add(__this__indexableKeys_copy);
      }
      this.indexableKeys = __this__indexableKeys;
    }
  }

  @Override
  public PrestoThriftTableMetadata deepCopy() {
    return new PrestoThriftTableMetadata(this);
  }

  @Override
  public void clear() {
    this.schemaTableName = null;
    this.columns = null;
    this.comment = null;
    this.indexableKeys = null;
  }

  @org.apache.thrift.annotation.Nullable
  public PrestoThriftSchemaTableName getSchemaTableName() {
    return this.schemaTableName;
  }

  public PrestoThriftTableMetadata setSchemaTableName(@org.apache.thrift.annotation.Nullable PrestoThriftSchemaTableName schemaTableName) {
    this.schemaTableName = schemaTableName;
    return this;
  }

  public void unsetSchemaTableName() {
    this.schemaTableName = null;
  }

  /** Returns true if field schemaTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaTableName() {
    return this.schemaTableName != null;
  }

  public void setSchemaTableNameIsSet(boolean value) {
    if (!value) {
      this.schemaTableName = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<PrestoThriftColumnMetadata> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(PrestoThriftColumnMetadata elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<PrestoThriftColumnMetadata>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<PrestoThriftColumnMetadata> getColumns() {
    return this.columns;
  }

  public PrestoThriftTableMetadata setColumns(@org.apache.thrift.annotation.Nullable java.util.List<PrestoThriftColumnMetadata> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getComment() {
    return this.comment;
  }

  public PrestoThriftTableMetadata setComment(@org.apache.thrift.annotation.Nullable java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  public int getIndexableKeysSize() {
    return (this.indexableKeys == null) ? 0 : this.indexableKeys.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.Set<java.lang.String>> getIndexableKeysIterator() {
    return (this.indexableKeys == null) ? null : this.indexableKeys.iterator();
  }

  public void addToIndexableKeys(java.util.Set<java.lang.String> elem) {
    if (this.indexableKeys == null) {
      this.indexableKeys = new java.util.ArrayList<java.util.Set<java.lang.String>>();
    }
    this.indexableKeys.add(elem);
  }

  /**
   * Returns a list of key sets which can be used for index lookups.
   * The list is expected to have only unique key sets.
   * {@code set<set<string>>} is not used here because some languages (like php) don't support it.
   */
  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.Set<java.lang.String>> getIndexableKeys() {
    return this.indexableKeys;
  }

  /**
   * Returns a list of key sets which can be used for index lookups.
   * The list is expected to have only unique key sets.
   * {@code set<set<string>>} is not used here because some languages (like php) don't support it.
   */
  public PrestoThriftTableMetadata setIndexableKeys(@org.apache.thrift.annotation.Nullable java.util.List<java.util.Set<java.lang.String>> indexableKeys) {
    this.indexableKeys = indexableKeys;
    return this;
  }

  public void unsetIndexableKeys() {
    this.indexableKeys = null;
  }

  /** Returns true if field indexableKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexableKeys() {
    return this.indexableKeys != null;
  }

  public void setIndexableKeysIsSet(boolean value) {
    if (!value) {
      this.indexableKeys = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCHEMA_TABLE_NAME:
      if (value == null) {
        unsetSchemaTableName();
      } else {
        setSchemaTableName((PrestoThriftSchemaTableName)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<PrestoThriftColumnMetadata>)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((java.lang.String)value);
      }
      break;

    case INDEXABLE_KEYS:
      if (value == null) {
        unsetIndexableKeys();
      } else {
        setIndexableKeys((java.util.List<java.util.Set<java.lang.String>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEMA_TABLE_NAME:
      return getSchemaTableName();

    case COLUMNS:
      return getColumns();

    case COMMENT:
      return getComment();

    case INDEXABLE_KEYS:
      return getIndexableKeys();

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
    case SCHEMA_TABLE_NAME:
      return isSetSchemaTableName();
    case COLUMNS:
      return isSetColumns();
    case COMMENT:
      return isSetComment();
    case INDEXABLE_KEYS:
      return isSetIndexableKeys();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PrestoThriftTableMetadata)
      return this.equals((PrestoThriftTableMetadata)that);
    return false;
  }

  public boolean equals(PrestoThriftTableMetadata that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_schemaTableName = true && this.isSetSchemaTableName();
    boolean that_present_schemaTableName = true && that.isSetSchemaTableName();
    if (this_present_schemaTableName || that_present_schemaTableName) {
      if (!(this_present_schemaTableName && that_present_schemaTableName))
        return false;
      if (!this.schemaTableName.equals(that.schemaTableName))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    boolean this_present_indexableKeys = true && this.isSetIndexableKeys();
    boolean that_present_indexableKeys = true && that.isSetIndexableKeys();
    if (this_present_indexableKeys || that_present_indexableKeys) {
      if (!(this_present_indexableKeys && that_present_indexableKeys))
        return false;
      if (!this.indexableKeys.equals(that.indexableKeys))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSchemaTableName()) ? 131071 : 524287);
    if (isSetSchemaTableName())
      hashCode = hashCode * 8191 + schemaTableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
    if (isSetComment())
      hashCode = hashCode * 8191 + comment.hashCode();

    hashCode = hashCode * 8191 + ((isSetIndexableKeys()) ? 131071 : 524287);
    if (isSetIndexableKeys())
      hashCode = hashCode * 8191 + indexableKeys.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PrestoThriftTableMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSchemaTableName(), other.isSetSchemaTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schemaTableName, other.schemaTableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumns(), other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetComment(), other.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, other.comment);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIndexableKeys(), other.isSetIndexableKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexableKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.indexableKeys, other.indexableKeys);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrestoThriftTableMetadata(");
    boolean first = true;

    sb.append("schemaTableName:");
    if (this.schemaTableName == null) {
      sb.append("null");
    } else {
      sb.append(this.schemaTableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (isSetComment()) {
      if (!first) sb.append(", ");
      sb.append("comment:");
      if (this.comment == null) {
        sb.append("null");
      } else {
        sb.append(this.comment);
      }
      first = false;
    }
    if (isSetIndexableKeys()) {
      if (!first) sb.append(", ");
      sb.append("indexableKeys:");
      if (this.indexableKeys == null) {
        sb.append("null");
      } else {
        sb.append(this.indexableKeys);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (schemaTableName != null) {
      schemaTableName.validate();
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

  private static class PrestoThriftTableMetadataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftTableMetadataStandardScheme getScheme() {
      return new PrestoThriftTableMetadataStandardScheme();
    }
  }

  private static class PrestoThriftTableMetadataStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrestoThriftTableMetadata> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PrestoThriftTableMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEMA_TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.schemaTableName = new PrestoThriftSchemaTableName();
              struct.schemaTableName.read(iprot);
              struct.setSchemaTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<PrestoThriftColumnMetadata>(_list0.size);
                @org.apache.thrift.annotation.Nullable PrestoThriftColumnMetadata _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new PrestoThriftColumnMetadata();
                  _elem1.read(iprot);
                  struct.columns.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comment = iprot.readString();
              struct.setCommentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INDEXABLE_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.indexableKeys = new java.util.ArrayList<java.util.Set<java.lang.String>>(_list3.size);
                @org.apache.thrift.annotation.Nullable java.util.Set<java.lang.String> _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  {
                    org.apache.thrift.protocol.TSet _set6 = iprot.readSetBegin();
                    _elem4 = new java.util.HashSet<java.lang.String>(2*_set6.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _elem7;
                    for (int _i8 = 0; _i8 < _set6.size; ++_i8)
                    {
                      _elem7 = iprot.readString();
                      _elem4.add(_elem7);
                    }
                    iprot.readSetEnd();
                  }
                  struct.indexableKeys.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setIndexableKeysIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PrestoThriftTableMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schemaTableName != null) {
        oprot.writeFieldBegin(SCHEMA_TABLE_NAME_FIELD_DESC);
        struct.schemaTableName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
          for (PrestoThriftColumnMetadata _iter9 : struct.columns)
          {
            _iter9.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.comment != null) {
        if (struct.isSetComment()) {
          oprot.writeFieldBegin(COMMENT_FIELD_DESC);
          oprot.writeString(struct.comment);
          oprot.writeFieldEnd();
        }
      }
      if (struct.indexableKeys != null) {
        if (struct.isSetIndexableKeys()) {
          oprot.writeFieldBegin(INDEXABLE_KEYS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.SET, struct.indexableKeys.size()));
            for (java.util.Set<java.lang.String> _iter10 : struct.indexableKeys)
            {
              {
                oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, _iter10.size()));
                for (java.lang.String _iter11 : _iter10)
                {
                  oprot.writeString(_iter11);
                }
                oprot.writeSetEnd();
              }
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

  private static class PrestoThriftTableMetadataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PrestoThriftTableMetadataTupleScheme getScheme() {
      return new PrestoThriftTableMetadataTupleScheme();
    }
  }

  private static class PrestoThriftTableMetadataTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrestoThriftTableMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrestoThriftTableMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSchemaTableName()) {
        optionals.set(0);
      }
      if (struct.isSetColumns()) {
        optionals.set(1);
      }
      if (struct.isSetComment()) {
        optionals.set(2);
      }
      if (struct.isSetIndexableKeys()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSchemaTableName()) {
        struct.schemaTableName.write(oprot);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (PrestoThriftColumnMetadata _iter12 : struct.columns)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetComment()) {
        oprot.writeString(struct.comment);
      }
      if (struct.isSetIndexableKeys()) {
        {
          oprot.writeI32(struct.indexableKeys.size());
          for (java.util.Set<java.lang.String> _iter13 : struct.indexableKeys)
          {
            {
              oprot.writeI32(_iter13.size());
              for (java.lang.String _iter14 : _iter13)
              {
                oprot.writeString(_iter14);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrestoThriftTableMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.schemaTableName = new PrestoThriftSchemaTableName();
        struct.schemaTableName.read(iprot);
        struct.setSchemaTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list15 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.columns = new java.util.ArrayList<PrestoThriftColumnMetadata>(_list15.size);
          @org.apache.thrift.annotation.Nullable PrestoThriftColumnMetadata _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = new PrestoThriftColumnMetadata();
            _elem16.read(iprot);
            struct.columns.add(_elem16);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.comment = iprot.readString();
        struct.setCommentIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list18 = iprot.readListBegin(org.apache.thrift.protocol.TType.SET);
          struct.indexableKeys = new java.util.ArrayList<java.util.Set<java.lang.String>>(_list18.size);
          @org.apache.thrift.annotation.Nullable java.util.Set<java.lang.String> _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            {
              org.apache.thrift.protocol.TSet _set21 = iprot.readSetBegin(org.apache.thrift.protocol.TType.STRING);
              _elem19 = new java.util.HashSet<java.lang.String>(2*_set21.size);
              @org.apache.thrift.annotation.Nullable java.lang.String _elem22;
              for (int _i23 = 0; _i23 < _set21.size; ++_i23)
              {
                _elem22 = iprot.readString();
                _elem19.add(_elem22);
              }
            }
            struct.indexableKeys.add(_elem19);
          }
        }
        struct.setIndexableKeysIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

