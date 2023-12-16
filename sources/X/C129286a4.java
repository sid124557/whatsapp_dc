package X;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.6a4  reason: invalid class name and case insensitive filesystem */
public class C129286a4 extends C129366aC<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ C129366aC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129286a4(C129366aC r1, Object obj, List list, C174068Sv r4) {
        super(r1, obj, list, r4);
        this.this$0 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.8Sv, X.6a4] */
    public void add(int i, Object obj) {
        refreshIfEmpty();
        boolean isEmpty = getDelegate().isEmpty();
        getListDelegate().add(i, obj);
        C129366aC.access$208(this.this$0);
        if (isEmpty) {
            addToMap();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractCollection, X.8Sv, X.6a4] */
    public boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = getListDelegate().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        C129366aC.access$212(this.this$0, getDelegate().size() - size);
        if (size != 0) {
            return addAll;
        }
        addToMap();
        return addAll;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public Object get(int i) {
        refreshIfEmpty();
        return getListDelegate().get(i);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public List getListDelegate() {
        return (List) getDelegate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public int indexOf(Object obj) {
        refreshIfEmpty();
        return getListDelegate().indexOf(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public int lastIndexOf(Object obj) {
        refreshIfEmpty();
        return getListDelegate().lastIndexOf(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public ListIterator listIterator(int i) {
        refreshIfEmpty();
        return new C129266a2(this, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.8Sv, X.6a4] */
    public Object remove(int i) {
        refreshIfEmpty();
        Object remove = getListDelegate().remove(i);
        C129366aC.access$210(this.this$0);
        removeIfEmpty();
        return remove;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public Object set(int i, Object obj) {
        refreshIfEmpty();
        return getListDelegate().set(i, obj);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.8Sv, X.6a4] */
    public List subList(int i, int i2) {
        refreshIfEmpty();
        C129366aC r3 = this.this$0;
        Object key = getKey();
        List subList = getListDelegate().subList(i, i2);
        C174068Sv ancestor = getAncestor();
        if (ancestor == null) {
            ancestor = this;
        }
        return r3.wrapList(key, subList, ancestor);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public ListIterator listIterator() {
        refreshIfEmpty();
        return new C129266a2(this);
    }
}
