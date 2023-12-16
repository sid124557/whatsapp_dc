package X;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.6aQ  reason: invalid class name and case insensitive filesystem */
public abstract class C129506aQ extends C157837iy {
    public Object[] contents;
    public boolean forceCopy;
    public int size = 0;

    private void getReadyToExpandTo(int i) {
        Object[] objArr;
        Object[] objArr2 = this.contents;
        int length = objArr2.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr2, C157837iy.expandedCapacity(length, i));
        } else if (this.forceCopy) {
            objArr = (Object[]) objArr2.clone();
        } else {
            return;
        }
        this.contents = objArr;
        this.forceCopy = false;
    }

    public C129506aQ(int i) {
        C160937oh.checkNonnegative(i, "initialCapacity");
        this.contents = new Object[i];
    }

    public C129506aQ add(Object obj) {
        obj.getClass();
        getReadyToExpandTo(this.size + 1);
        Object[] objArr = this.contents;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final void addAll(Object[] objArr, int i) {
        C161507po.checkElementsNotNull(objArr, i);
        getReadyToExpandTo(this.size + i);
        System.arraycopy(objArr, 0, this.contents, this.size, i);
        this.size += i;
    }

    public C157837iy add(Object... objArr) {
        addAll(objArr, objArr.length);
        return this;
    }

    public C157837iy addAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            getReadyToExpandTo(this.size + collection.size());
            if (collection instanceof C174098Sy) {
                this.size = ((C174098Sy) collection).copyIntoArray(this.contents, this.size);
                return this;
            }
        }
        super.addAll(iterable);
        return this;
    }
}
