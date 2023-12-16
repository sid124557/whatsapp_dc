package X;

import java.io.Closeable;

/* renamed from: X.6C4  reason: invalid class name */
public class AnonymousClass6C4 implements Closeable, AutoCloseable {
    public Object A00;
    public final int A01;

    public AnonymousClass6C4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void close() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C103355Mo) obj).A00();
        } else {
            AnonymousClass4Rg.setupMembersListChangeHandlers$lambda$4((AnonymousClass4Rg) obj);
        }
    }
}
