package X;

import java.util.Iterator;

/* renamed from: X.6WT  reason: invalid class name */
public final class AnonymousClass6WT extends AnonymousClass6WV {
    public final transient Object A00;

    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new AnonymousClass6WW(this.A00);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return AnonymousClass000.A0W(this.A00.toString(), AnonymousClass001.A0p());
    }

    public AnonymousClass6WT(Object obj) {
        this.A00 = obj;
    }
}
