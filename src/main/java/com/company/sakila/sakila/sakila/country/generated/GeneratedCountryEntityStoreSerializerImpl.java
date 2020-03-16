package com.company.sakila.sakila.sakila.country.generated;

import com.company.sakila.sakila.sakila.country.Country;
import com.company.sakila.sakila.sakila.country.CountryImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.BiLongToIntFunction;
import com.speedment.common.function.LongToBooleanFunction;
import com.speedment.common.function.LongToByteFunction;
import com.speedment.common.function.LongToCharFunction;
import com.speedment.common.function.LongToFloatFunction;
import com.speedment.common.function.LongToShortFunction;
import com.speedment.enterprise.common.bytebuffercommon.ByteBufferUtil;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreComparator;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreCompareTo;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStorePredicate;
import com.speedment.enterprise.datastore.runtime.throwable.DeserializationException;
import com.speedment.enterprise.datastore.runtime.throwable.Utf8Exception;
import com.speedment.enterprise.datastore.runtime.util.SerializerUtil;
import com.speedment.enterprise.datastore.runtime.util.Utf8Util;
import com.speedment.runtime.config.identifier.ColumnIdentifier;

import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;

/**
 * Serializes and deserializes instances of Country.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCountryEntityStoreSerializerImpl implements EntityStoreSerializer<Country> {
    
    private final LongFunction<ByteBuffer> bufferFinder;
    private final LongToIntFunction offsetFinder;
    private static final int FIELD_COUNTRY_ID = 0;
    private static final int FIELD_LAST_UPDATE = 4;
    private static final int ENDPOS_COUNTRY = 12;
    private static final int VARSIZE_BEGINS = 16;
    
    protected GeneratedCountryEntityStoreSerializerImpl(final LongFunction<ByteBuffer> bufferFinder, final LongToIntFunction offsetFinder) {
        this.bufferFinder = requireNonNull(bufferFinder);
        this.offsetFinder = requireNonNull(offsetFinder);
    }
    
    @Override
    public BiConsumer<ByteBuffer, Country> serializer() {
        return (buffer, entity) -> {
            int varSizePos = 0;
            buffer.putInt(FIELD_COUNTRY_ID, entity.getCountryId());
            buffer.putLong(FIELD_LAST_UPDATE, entity.getLastUpdate().getTime());
            varSizePos += ByteBufferUtil.putArrayAbsolute(buffer, VARSIZE_BEGINS + varSizePos, entity.getCountry().getBytes());
            buffer.putInt(ENDPOS_COUNTRY, varSizePos);
            buffer.position(0);
            buffer.limit(VARSIZE_BEGINS + varSizePos);
        };
    }
    
    @Override
    public LongConsumer decorator(DataStoreHolder holder) {
        return DO_NOTHING;
    }
    
    @Override
    public LongFunction<Country> deserializer() {
        return ref -> {
            final ByteBuffer buffer = bufferFinder.apply(ref);
            final int offset = offsetFinder.applyAsInt(ref);
            final Country entity = new CountryImpl();
            entity.setCountryId(buffer.getInt(offset + FIELD_COUNTRY_ID));
            try {
                entity.setCountry(Utf8Util.deserialize(buffer,
                    offset + VARSIZE_BEGINS + 0,
                    offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_COUNTRY)
                ));
            } catch (final Utf8Exception ex) {
                final LongToIntFunction sizeOf = sizeOf();
                throw new DeserializationException(buffer, offset, sizeOf.applyAsInt(ref), ex);
            }
            entity.setLastUpdate(new Timestamp(buffer.getLong(offset + FIELD_LAST_UPDATE)));
            return entity;
        };
    }
    
    @Override
    public Class<?> deserializedType(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : return int.class;
                case LAST_UPDATE : return Timestamp.class;
                case COUNTRY     : return String.class;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : return int.class;
                case "last_update" : return Timestamp.class;
                case "country"     : return String.class;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final ColumnIdentifier<Country> colId, final ColumnIdentifier<FK_ENTITY> fkColId) {
        return finder(singletonList(colId), singletonList(fkColId));
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final List<ColumnIdentifier<Country>> cols, final List<ColumnIdentifier<FK_ENTITY>> fkCols) {
        throw new UnsupportedOperationException("Country has no foreign references.");
    }
    
    @Override
    public LongUnaryOperator finder(final String fkName) {
        throw new UnsupportedOperationException("Country has no foreign references.");
    }
    
    @Override
    public LongPredicate isNull(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : 
                case LAST_UPDATE : 
                case COUNTRY     : return ALWAYS_FALSE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : 
                case "last_update" : 
                case "country"     : return ALWAYS_FALSE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongPredicate isPresent(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : 
                case LAST_UPDATE : 
                case COUNTRY     : return ALWAYS_TRUE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : 
                case "last_update" : 
                case "country"     : return ALWAYS_TRUE;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToByteFunction byteDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToShortFunction shortDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction intDeserializer(final ColumnIdentifier<Country> colId) {
        if ("country_id".equals(colId.getColumnId())) {
            return ref -> bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + FIELD_COUNTRY_ID);
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongUnaryOperator longDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToFloatFunction floatDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToDoubleFunction doubleDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToCharFunction charDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToBooleanFunction booleanDeserializer(final ColumnIdentifier<Country> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongFunction<?> objectDeserializer(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case LAST_UPDATE : return ref -> new Timestamp(bufferFinder.apply(ref).getLong(offsetFinder.applyAsInt(ref) + FIELD_LAST_UPDATE));
                case COUNTRY     : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int offset = offsetFinder.applyAsInt(ref);
                    try {
                        return Utf8Util.deserialize(buffer,
                            offset + VARSIZE_BEGINS + 0,
                            offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_COUNTRY)
                        );
                    } catch (final Utf8Exception ex) {
                        final LongToIntFunction sizeOf = sizeOf();
                        throw new DeserializationException(buffer, offset, sizeOf.applyAsInt(ref), ex);
                    }
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "last_update" : return ref -> new Timestamp(bufferFinder.apply(ref).getLong(offsetFinder.applyAsInt(ref) + FIELD_LAST_UPDATE));
                case "country"     : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int offset = offsetFinder.applyAsInt(ref);
                    try {
                        return Utf8Util.deserialize(buffer,
                            offset + VARSIZE_BEGINS + 0,
                            offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_COUNTRY)
                        );
                    } catch (final Utf8Exception ex) {
                        final LongToIntFunction sizeOf = sizeOf();
                        throw new DeserializationException(buffer, offset, sizeOf.applyAsInt(ref), ex);
                    }
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public BiLongToIntFunction comparator(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_COUNTRY_ID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_COUNTRY_ID)
                );
                case LAST_UPDATE : return (aRef, bRef) -> Long.compare(
                    bufferFinder.apply(aRef).getLong(offsetFinder.applyAsInt(aRef) + FIELD_LAST_UPDATE),
                    bufferFinder.apply(bRef).getLong(offsetFinder.applyAsInt(bRef) + FIELD_LAST_UPDATE)
                );
                case COUNTRY     : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_COUNTRY);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_COUNTRY);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_COUNTRY_ID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_COUNTRY_ID)
                );
                case "last_update" : return (aRef, bRef) -> Long.compare(
                    bufferFinder.apply(aRef).getLong(offsetFinder.applyAsInt(aRef) + FIELD_LAST_UPDATE),
                    bufferFinder.apply(bRef).getLong(offsetFinder.applyAsInt(bRef) + FIELD_LAST_UPDATE)
                );
                case "country"     : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_COUNTRY);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_COUNTRY);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public BiLongToIntFunction comparatorNullsLast(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_COUNTRY_ID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_COUNTRY_ID)
                );
                case LAST_UPDATE : return (aRef, bRef) -> Long.compare(
                    bufferFinder.apply(aRef).getLong(offsetFinder.applyAsInt(aRef) + FIELD_LAST_UPDATE),
                    bufferFinder.apply(bRef).getLong(offsetFinder.applyAsInt(bRef) + FIELD_LAST_UPDATE)
                );
                case COUNTRY     : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_COUNTRY);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_COUNTRY);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : return (aRef, bRef) -> Integer.compare(
                    bufferFinder.apply(aRef).getInt(offsetFinder.applyAsInt(aRef) + FIELD_COUNTRY_ID),
                    bufferFinder.apply(bRef).getInt(offsetFinder.applyAsInt(bRef) + FIELD_COUNTRY_ID)
                );
                case "last_update" : return (aRef, bRef) -> Long.compare(
                    bufferFinder.apply(aRef).getLong(offsetFinder.applyAsInt(aRef) + FIELD_LAST_UPDATE),
                    bufferFinder.apply(bRef).getLong(offsetFinder.applyAsInt(bRef) + FIELD_LAST_UPDATE)
                );
                case "country"     : return (aRef, bRef) -> {
                    final ByteBuffer aBuf = bufferFinder.apply(aRef);
                    final ByteBuffer bBuf = bufferFinder.apply(bRef);
                    final int aOffset = offsetFinder.applyAsInt(aRef);
                    final int bOffset = offsetFinder.applyAsInt(bRef);
                    final int aStarts = aOffset + VARSIZE_BEGINS + 0;
                    final int bStarts = bOffset + VARSIZE_BEGINS + 0;
                    final int aEnds   = aOffset + VARSIZE_BEGINS + aBuf.getInt(aOffset + ENDPOS_COUNTRY);
                    final int bEnds   = bOffset + VARSIZE_BEGINS + bBuf.getInt(bOffset + ENDPOS_COUNTRY);
                    return ByteBufferUtil.compare(
                        aBuf, aStarts, aEnds,
                        bBuf, bStarts, bEnds
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction compareToByte(final ColumnIdentifier<Country> colId, final byte value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToShort(final ColumnIdentifier<Country> colId, final short value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToInt(final ColumnIdentifier<Country> colId, final int value) {
        if ("country_id".equals(colId.getColumnId())) {
            {
                final int operand = value;
                return ref -> Integer.compare(
                    bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + FIELD_COUNTRY_ID),
                    operand
                );
            }
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToLong(final ColumnIdentifier<Country> colId, final long value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToFloat(final ColumnIdentifier<Country> colId, final float value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToDouble(final ColumnIdentifier<Country> colId, final double value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToBoolean(final ColumnIdentifier<Country> colId, final boolean value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToChar(final ColumnIdentifier<Country> colId, final char value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToObject(final ColumnIdentifier<Country> colId, final Object value) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case LAST_UPDATE : {
                    final long operand = ((Timestamp) value).getTime();
                    return ref -> Long.compare(
                        bufferFinder.apply(ref).getLong(offsetFinder.applyAsInt(ref) + FIELD_LAST_UPDATE),
                        operand
                    );
                }
                case COUNTRY     : {
                    final ByteBuffer tempBuffer = ByteBuffer.wrap(((String) value).getBytes());
                    final int tempSize = tempBuffer.capacity();
                    return ref -> {
                        final ByteBuffer buffer = bufferFinder.apply(ref);
                        final int offset = offsetFinder.applyAsInt(ref);
                        return ByteBufferUtil.compare(buffer,
                            offset + VARSIZE_BEGINS + 0,
                            offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_COUNTRY),
                            tempBuffer, 0, tempSize
                        );
                    };
                }
                default : {
                    throw new UnsupportedOperationException(
                        String.format("The column '%s' is either unknown or not of type object.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "last_update" : {
                    final long operand = ((Timestamp) value).getTime();
                    return ref -> Long.compare(
                        bufferFinder.apply(ref).getLong(offsetFinder.applyAsInt(ref) + FIELD_LAST_UPDATE),
                        operand
                    );
                }
                case "country"     : {
                    final ByteBuffer tempBuffer = ByteBuffer.wrap(((String) value).getBytes());
                    final int tempSize = tempBuffer.capacity();
                    return ref -> {
                        final ByteBuffer buffer = bufferFinder.apply(ref);
                        final int offset = offsetFinder.applyAsInt(ref);
                        return ByteBufferUtil.compare(buffer,
                            offset + VARSIZE_BEGINS + 0,
                            offset + VARSIZE_BEGINS + buffer.getInt(offset + ENDPOS_COUNTRY),
                            tempBuffer, 0, tempSize
                        );
                    };
                }
                default : {
                    throw new UnsupportedOperationException(
                        String.format("The column '%s' is either unknown or not of type object.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction compareToNull(final ColumnIdentifier<Country> colId) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : 
                case LAST_UPDATE : return ALWAYS_LESS;
                case COUNTRY     : return ref -> bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + ENDPOS_COUNTRY) < 0 ? 0 : -1;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : 
                case "last_update" : return ALWAYS_LESS;
                case "country"     : return ref -> bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + ENDPOS_COUNTRY) < 0 ? 0 : -1;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongPredicate newPredicate(final ColumnIdentifier<Country> colId, final EntityStorePredicate predicate) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_COUNTRY_ID;
                    return predicate.test(buffer, begins, begins + Integer.BYTES);
                };
                case LAST_UPDATE : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_LAST_UPDATE;
                    return predicate.test(buffer, begins, begins + 8);
                };
                case COUNTRY     : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return predicate.test(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_COUNTRY)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_COUNTRY_ID;
                    return predicate.test(buffer, begins, begins + Integer.BYTES);
                };
                case "last_update" : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_LAST_UPDATE;
                    return predicate.test(buffer, begins, begins + 8);
                };
                case "country"     : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return predicate.test(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_COUNTRY)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction newCompareTo(final ColumnIdentifier<Country> colId, final EntityStoreCompareTo compareTo) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_COUNTRY_ID;
                    return compareTo.compare(buffer, begins, begins + Integer.BYTES);
                };
                case LAST_UPDATE : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_LAST_UPDATE;
                    return compareTo.compare(buffer, begins, begins + 8);
                };
                case COUNTRY     : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return compareTo.compare(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_COUNTRY)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_COUNTRY_ID;
                    return compareTo.compare(buffer, begins, begins + Integer.BYTES);
                };
                case "last_update" : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    final int begins = rowOffset + FIELD_LAST_UPDATE;
                    return compareTo.compare(buffer, begins, begins + 8);
                };
                case "country"     : return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int rowOffset = offsetFinder.applyAsInt(ref);
                    return compareTo.compare(buffer,
                        rowOffset + VARSIZE_BEGINS,
                        rowOffset + VARSIZE_BEGINS + buffer.getInt(rowOffset + ENDPOS_COUNTRY)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public BiLongToIntFunction newComparator(final ColumnIdentifier<Country> colId, final EntityStoreComparator comparator) {
        if (colId instanceof Country.Identifier) {
            final Country.Identifier _id = (Country.Identifier) colId;
            switch (_id) {
                case COUNTRY_ID  : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    final int aBegins = aRowOffset + FIELD_COUNTRY_ID;
                    final int bBegins = bRowOffset + FIELD_COUNTRY_ID;
                    return comparator.compare(
                        aBuffer, aBegins, aBegins + Integer.BYTES,
                        bBuffer, bBegins, bBegins + Integer.BYTES
                    );
                };
                case LAST_UPDATE : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    final int aBegins = aRowOffset + FIELD_LAST_UPDATE;
                    final int bBegins = bRowOffset + FIELD_LAST_UPDATE;
                    return comparator.compare(
                        aBuffer, aBegins, aBegins + 8,
                        bBuffer, bBegins, bBegins + 8
                    );
                };
                case COUNTRY     : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    return comparator.compare(
                        aBuffer, aRowOffset + VARSIZE_BEGINS, aRowOffset + VARSIZE_BEGINS + aBuffer.getInt(aRowOffset + ENDPOS_COUNTRY), 
                        bBuffer, bRowOffset + VARSIZE_BEGINS, bRowOffset + VARSIZE_BEGINS + bBuffer.getInt(bRowOffset + ENDPOS_COUNTRY)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = colId.getColumnId();
            switch (_colName) {
                case "country_id"  : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    final int aBegins = aRowOffset + FIELD_COUNTRY_ID;
                    final int bBegins = bRowOffset + FIELD_COUNTRY_ID;
                    return comparator.compare(
                        aBuffer, aBegins, aBegins + Integer.BYTES,
                        bBuffer, bBegins, bBegins + Integer.BYTES
                    );
                };
                case "last_update" : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    final int aBegins = aRowOffset + FIELD_LAST_UPDATE;
                    final int bBegins = bRowOffset + FIELD_LAST_UPDATE;
                    return comparator.compare(
                        aBuffer, aBegins, aBegins + 8,
                        bBuffer, bBegins, bBegins + 8
                    );
                };
                case "country"     : return (aRef, bRef) -> {
                    final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                    final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                    final int aRowOffset = offsetFinder.applyAsInt(aRef);
                    final int bRowOffset = offsetFinder.applyAsInt(bRef);
                    return comparator.compare(
                        aBuffer, aRowOffset + VARSIZE_BEGINS, aRowOffset + VARSIZE_BEGINS + aBuffer.getInt(aRowOffset + ENDPOS_COUNTRY), 
                        bBuffer, bRowOffset + VARSIZE_BEGINS, bRowOffset + VARSIZE_BEGINS + bBuffer.getInt(bRowOffset + ENDPOS_COUNTRY)
                    );
                };
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public LongToIntFunction sizeOf() {
        return ref -> VARSIZE_BEGINS + Math.abs(bufferFinder.apply(ref).getInt(offsetFinder.applyAsInt(ref) + ENDPOS_COUNTRY));
    }
}