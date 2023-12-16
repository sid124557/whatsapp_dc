package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.8TF  reason: invalid class name */
public class AnonymousClass8TF<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object NOT_FOUND = AnonymousClass002.A0D();
    public transient int[] entries;
    public transient Set entrySetView;
    public transient Set keySetView;
    public transient Object[] keys;
    public transient int metadata;
    public transient int size;
    public transient Object table;
    public transient Object[] values;
    public transient Collection valuesView;

    public void init(int i) {
        this.metadata = AnonymousClass6C9.A0B(i, 1, 1073741823);
    }

    public void insertEntry(int i, Object obj, Object obj2, int i2, int i3) {
        setEntry(i, C162237rV.maskCombine(i2, 0, i3));
        setKey(i, obj);
        setValue(i, obj2);
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map delegateOrNull = delegateOrNull();
        Object obj3 = obj;
        Object obj4 = obj2;
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireKeys = requireKeys();
            Object[] requireValues = requireValues();
            int i3 = this.size;
            int i4 = i3 + 1;
            int smearedHash = C159347lg.smearedHash(obj3);
            int hashTableMask = hashTableMask();
            int i5 = smearedHash & hashTableMask;
            int tableGet = C162237rV.tableGet(requireTable(), i5);
            if (tableGet == 0) {
                if (i4 <= hashTableMask) {
                    C162237rV.tableSet(requireTable(), i5, i4);
                }
                hashTableMask = resizeTable(hashTableMask, C162237rV.newCapacity(hashTableMask), smearedHash, i3);
            } else {
                int hashPrefix = C162237rV.getHashPrefix(smearedHash, hashTableMask);
                int i6 = 0;
                do {
                    i = tableGet - 1;
                    i2 = requireEntries[i];
                    if (C162237rV.getHashPrefix(i2, hashTableMask) != hashPrefix || !C1447372t.A00(obj3, requireKeys[i])) {
                        tableGet = C162237rV.getNext(i2, hashTableMask);
                        i6++;
                    } else {
                        Object obj5 = requireValues[i];
                        requireValues[i] = obj2;
                        return obj5;
                    }
                } while (tableGet != 0);
                if (i6 >= 9) {
                    delegateOrNull = convertToHashFloodingResistantImplementation();
                } else {
                    if (i4 <= hashTableMask) {
                        requireEntries[i] = C162237rV.maskCombine(i2, i4, hashTableMask);
                    }
                    hashTableMask = resizeTable(hashTableMask, C162237rV.newCapacity(hashTableMask), smearedHash, i3);
                }
            }
            resizeMeMaybe(i4);
            insertEntry(i3, obj3, obj4, smearedHash, hashTableMask);
            this.size = i4;
            incrementModCount();
            return null;
        }
        return delegateOrNull.put(obj3, obj4);
    }

    public static /* synthetic */ int access$1210(AnonymousClass8TF r2) {
        int i = r2.size;
        r2.size = i - 1;
        return i;
    }

    public static AnonymousClass8TF create() {
        return new AnonymousClass8TF();
    }

    public static AnonymousClass8TF createWithExpectedSize(int i) {
        return new AnonymousClass8TF(i);
    }

    /* access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Set createEntrySet() {
        return new AnonymousClass8TI(this);
    }

    public Map createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set createKeySet() {
        return new AnonymousClass8TJ(this);
    }

    public Collection createValues() {
        return new C174018Sq(this);
    }

    public Map delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Set entrySet() {
        Set set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set createEntrySet = createEntrySet();
        this.entrySetView = createEntrySet;
        return createEntrySet;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 >= this.size) {
            return -1;
        }
        return i2;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public Set keySet() {
        Set set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set createKeySet = createKeySet();
        this.keySetView = createKeySet;
        return createKeySet;
    }

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1X(this.table);
    }

    public Collection values() {
        Collection collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection createValues = createValues();
        this.valuesView = createValues;
        return createValues;
    }

    public AnonymousClass8TF(int i) {
        init(i);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* access modifiers changed from: private */
    public int indexOf(Object obj) {
        if (!needsAllocArrays()) {
            int smearedHash = C159347lg.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C162237rV.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C162237rV.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i = tableGet - 1;
                    int entry = entry(i);
                    if (C162237rV.getHashPrefix(entry, hashTableMask) == hashPrefix && C1447372t.A00(obj, key(i))) {
                        return i;
                    }
                    tableGet = C162237rV.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public Object key(int i) {
        return requireKeys()[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass000.A0Y("Invalid size: ", AnonymousClass6CA.A0Y(25), readInt));
    }

    /* access modifiers changed from: private */
    public Object removeHelper(Object obj) {
        int hashTableMask;
        int remove;
        if (needsAllocArrays() || (remove = C162237rV.remove(obj, (Object) null, hashTableMask, requireTable(), requireEntries(), requireKeys(), (Object[]) null)) == -1) {
            return NOT_FOUND;
        }
        Object value = value(remove);
        moveLastEntry(remove, (hashTableMask = hashTableMask()));
        this.size--;
        incrementModCount();
        return value;
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        Object createTable = C162237rV.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C162237rV.tableSet(createTable, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int tableGet = C162237rV.tableGet(requireTable, i6);
            while (tableGet != 0) {
                int i7 = tableGet - 1;
                int i8 = requireEntries[i7];
                int hashPrefix = C162237rV.getHashPrefix(i8, i) | i6;
                int i9 = hashPrefix & i5;
                int tableGet2 = C162237rV.tableGet(createTable, i9);
                C162237rV.tableSet(createTable, i9, tableGet);
                requireEntries[i7] = C162237rV.maskCombine(hashPrefix, tableGet2, i5);
                tableGet = C162237rV.getNext(i8, i);
            }
        }
        this.table = createTable;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = C162237rV.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, Object obj) {
        requireKeys()[i] = obj;
    }

    /* access modifiers changed from: private */
    public void setValue(int i, Object obj) {
        requireValues()[i] = obj;
    }

    /* access modifiers changed from: private */
    public Object value(int i) {
        return requireValues()[i];
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(entrySetIterator);
            objectOutputStream.writeObject(A0w.getKey());
            objectOutputStream.writeObject(A0w.getValue());
        }
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public int allocArrays() {
        C162187rP.A05("Arrays already allocated", needsAllocArrays());
        int i = this.metadata;
        int tableSize = C162237rV.tableSize(i);
        this.table = C162237rV.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Map delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = AnonymousClass6C9.A0B(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireKeys(), 0, this.size, (Object) null);
                Arrays.fill(requireValues(), 0, this.size, (Object) null);
                C162237rV.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(obj);
        }
        return AnonymousClass001.A1X(indexOf(obj), -1);
    }

    public boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (C1447372t.A00(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    public Map convertToHashFloodingResistantImplementation() {
        Map createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.put(key(firstEntryIndex), value(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public Iterator entrySetIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return AnonymousClass000.A0q(delegateOrNull);
        }
        return new C188938zj(this, 1);
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public Object get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return value(indexOf);
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(size());
    }

    public Iterator keySetIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return C18280x3.A0i(delegateOrNull);
        }
        return new C188938zj(this, 0);
    }

    public void moveLastEntry(int i, int i2) {
        int i3;
        int i4;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int size2 = size() - 1;
        if (i < size2) {
            Object obj = requireKeys[size2];
            requireKeys[i] = obj;
            requireValues[i] = requireValues[size2];
            requireKeys[size2] = null;
            requireValues[size2] = null;
            requireEntries[i] = requireEntries[size2];
            requireEntries[size2] = 0;
            int smearedHash = C159347lg.smearedHash(obj) & i2;
            int tableGet = C162237rV.tableGet(requireTable, smearedHash);
            int i5 = size2 + 1;
            if (tableGet == i5) {
                C162237rV.tableSet(requireTable, smearedHash, i + 1);
                return;
            }
            do {
                i3 = tableGet - 1;
                i4 = requireEntries[i3];
                tableGet = C162237rV.getNext(i4, i2);
            } while (tableGet != i5);
            requireEntries[i3] = C162237rV.maskCombine(i4, i + 1, i2);
            return;
        }
        requireKeys[i] = null;
        requireValues[i] = null;
        requireEntries[i] = 0;
    }

    public Object remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        Object removeHelper = removeHelper(obj);
        if (removeHelper == NOT_FOUND) {
            return null;
        }
        return removeHelper;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    public int size() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    public Iterator valuesIterator() {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return AnonymousClass001.A0v(delegateOrNull);
        }
        return new C188938zj(this, 2);
    }

    public AnonymousClass8TF() {
        init(3);
    }
}
