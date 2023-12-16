package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.8TM  reason: invalid class name */
public class AnonymousClass8TM<E> extends AbstractSet<E> implements Serializable {
    public transient Object[] elements;
    public transient int[] entries;
    public transient int metadata;
    public transient int size;
    public transient Object table;

    public void init(int i) {
        this.metadata = AnonymousClass6C9.A0B(i, 1, 1073741823);
    }

    public void insertEntry(int i, Object obj, int i2, int i3) {
        setEntry(i, C162237rV.maskCombine(i2, 0, i3));
        setElement(i, obj);
    }

    public static AnonymousClass8TM create() {
        return new AnonymousClass8TM();
    }

    private Set createHashFloodingResistantDelegate(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    public Set delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
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

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1X(this.table);
    }

    public AnonymousClass8TM() {
        init(3);
    }

    /* access modifiers changed from: private */
    public Object element(int i) {
        return requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass000.A0Y("Invalid size: ", AnonymousClass6CA.A0Y(25), readInt));
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

    private void setElement(int i, Object obj) {
        requireElements()[i] = obj;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = C162237rV.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(Object obj) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireElements = requireElements();
            int i = this.size;
            int i2 = i + 1;
            int smearedHash = C159347lg.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int i3 = smearedHash & hashTableMask;
            int tableGet = C162237rV.tableGet(requireTable(), i3);
            if (tableGet == 0) {
                if (i2 <= hashTableMask) {
                    C162237rV.tableSet(requireTable(), i3, i2);
                }
                hashTableMask = resizeTable(hashTableMask, C162237rV.newCapacity(hashTableMask), smearedHash, i);
            } else {
                int hashPrefix = C162237rV.getHashPrefix(smearedHash, hashTableMask);
                int i4 = 0;
                while (true) {
                    int i5 = tableGet - 1;
                    int i6 = requireEntries[i5];
                    if (C162237rV.getHashPrefix(i6, hashTableMask) == hashPrefix && C1447372t.A00(obj, requireElements[i5])) {
                        return false;
                    }
                    int next = C162237rV.getNext(i6, hashTableMask);
                    i4++;
                    if (next != 0) {
                        tableGet = next;
                    } else if (i4 >= 9) {
                        delegateOrNull = convertToHashFloodingResistantImplementation();
                    } else if (i2 <= hashTableMask) {
                        requireEntries[i5] = C162237rV.maskCombine(i6, i2, hashTableMask);
                    }
                }
                hashTableMask = resizeTable(hashTableMask, C162237rV.newCapacity(hashTableMask), smearedHash, i);
            }
            resizeMeMaybe(i2);
            insertEntry(i, obj, smearedHash, hashTableMask);
            this.size = i2;
            incrementModCount();
            return true;
        }
        return delegateOrNull.add(obj);
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
        this.elements = new Object[i];
        return i;
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = AnonymousClass6C9.A0B(size(), 3, 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireElements(), 0, this.size, (Object) null);
                C162237rV.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean contains(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.contains(obj);
            }
            int smearedHash = C159347lg.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C162237rV.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C162237rV.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i = tableGet - 1;
                    int entry = entry(i);
                    if (C162237rV.getHashPrefix(entry, hashTableMask) == hashPrefix && C1447372t.A00(obj, element(i))) {
                        return true;
                    }
                    tableGet = C162237rV.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return false;
    }

    public Set convertToHashFloodingResistantImplementation() {
        Set createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1T(size());
    }

    public Iterator iterator() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new AnonymousClass8O4(this);
    }

    public void moveLastEntry(int i, int i2) {
        int i3;
        int i4;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int A0M = C86664Kz.A0M(this);
        if (i < A0M) {
            Object obj = requireElements[A0M];
            requireElements[i] = obj;
            requireElements[A0M] = null;
            requireEntries[i] = requireEntries[A0M];
            requireEntries[A0M] = 0;
            int smearedHash = C159347lg.smearedHash(obj) & i2;
            int tableGet = C162237rV.tableGet(requireTable, smearedHash);
            int i5 = A0M + 1;
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
        requireElements[i] = null;
        requireEntries[i] = 0;
    }

    public boolean remove(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            Object obj2 = obj;
            if (delegateOrNull != null) {
                return delegateOrNull.remove(obj);
            }
            int hashTableMask = hashTableMask();
            int remove = C162237rV.remove(obj2, (Object) null, hashTableMask, requireTable(), requireEntries(), requireElements(), (Object[]) null);
            if (remove != -1) {
                moveLastEntry(remove, hashTableMask);
                this.size--;
                incrementModCount();
                return true;
            }
        }
        return false;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.elements = Arrays.copyOf(requireElements(), i);
    }

    public int size() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    public Object[] toArray(Object[] objArr) {
        if (needsAllocArrays()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray(objArr);
        }
        return C161507po.toArrayImpl(requireElements(), 0, this.size, objArr);
    }

    public Object[] toArray() {
        if (needsAllocArrays()) {
            return AnonymousClass4L0.A0U();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray();
        }
        return Arrays.copyOf(requireElements(), this.size);
    }
}
