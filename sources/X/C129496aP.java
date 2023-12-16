package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.6aP  reason: invalid class name and case insensitive filesystem */
public class C129496aP extends C129506aQ {
    public int hashCode;
    public Object[] hashTable;

    private void addDeduping(Object obj) {
        Objects.requireNonNull(this.hashTable);
        int length = this.hashTable.length - 1;
        int hashCode2 = obj.hashCode();
        int smear = C159347lg.smear(hashCode2);
        while (true) {
            int i = smear & length;
            Object[] objArr = this.hashTable;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                objArr[i] = obj;
                this.hashCode += hashCode2;
                super.add(obj);
                return;
            } else if (!obj2.equals(obj)) {
                smear = i + 1;
            } else {
                return;
            }
        }
    }

    public C129526aS build() {
        C129526aS access$100;
        int i = this.size;
        if (i == 0) {
            return C129526aS.of();
        }
        if (i != 1) {
            if (this.hashTable == null || C129526aS.chooseTableSize(i) != this.hashTable.length) {
                access$100 = C129526aS.construct(this.size, this.contents);
                this.size = access$100.size();
            } else {
                int i2 = this.size;
                Object[] objArr = this.contents;
                if (C129526aS.shouldTrim(i2, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.hashCode;
                Object[] objArr2 = this.hashTable;
                access$100 = new C129706ak(objArr, i3, objArr2, objArr2.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return access$100;
        }
        Object obj = this.contents[0];
        Objects.requireNonNull(obj);
        return C129526aS.of(obj);
    }

    public C129496aP(int i) {
        super(i);
        this.hashTable = new Object[C129526aS.chooseTableSize(i)];
    }

    public C129496aP add(Object obj) {
        obj.getClass();
        if (this.hashTable == null || C129526aS.chooseTableSize(this.size) > this.hashTable.length) {
            this.hashTable = null;
            super.add(obj);
            return this;
        }
        addDeduping(obj);
        return this;
    }

    public C129496aP addAll(Iterable iterable) {
        iterable.getClass();
        if (this.hashTable != null) {
            for (Object add : iterable) {
                add(add);
            }
        } else {
            super.addAll(iterable);
        }
        return this;
    }

    public C129496aP() {
        super(4);
    }

    public C129496aP add(Object... objArr) {
        if (this.hashTable != null) {
            for (Object add : objArr) {
                add(add);
            }
        } else {
            super.add(objArr);
        }
        return this;
    }
}
