package X;

import java.util.ListIterator;

/* renamed from: X.6a2  reason: invalid class name and case insensitive filesystem */
public class C129266a2 extends AnonymousClass8O5 implements ListIterator {
    public final /* synthetic */ C129286a4 this$1;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.8Sv, X.6a4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C129266a2(X.C129286a4 r2, int r3) {
        /*
            r1 = this;
            r1.this$1 = r2
            java.util.List r0 = r2.getListDelegate()
            java.util.ListIterator r0 = r0.listIterator(r3)
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129266a2.<init>(X.6a4, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, X.6a4] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    public void add(Object obj) {
        boolean isEmpty = this.this$1.isEmpty();
        getDelegateListIterator().add(obj);
        ? r1 = this.this$1;
        C129366aC.access$208(r1.this$0);
        if (isEmpty) {
            r1.addToMap();
        }
    }

    private ListIterator getDelegateListIterator() {
        return (ListIterator) getDelegateIterator();
    }

    public boolean hasPrevious() {
        return getDelegateListIterator().hasPrevious();
    }

    public int nextIndex() {
        return getDelegateListIterator().nextIndex();
    }

    public Object previous() {
        return getDelegateListIterator().previous();
    }

    public int previousIndex() {
        return getDelegateListIterator().previousIndex();
    }

    public void set(Object obj) {
        getDelegateListIterator().set(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8Sv, X.6a4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C129266a2(X.C129286a4 r1) {
        /*
            r0 = this;
            r0.this$1 = r1
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129266a2.<init>(X.6a4):void");
    }
}
