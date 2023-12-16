package X;

import java.util.ArrayDeque;

/* renamed from: X.0at  reason: invalid class name and case insensitive filesystem */
public class C07450at implements C15510rU {
    public final AnonymousClass0N7 A00;
    public final /* synthetic */ AnonymousClass0Ts A01;

    public C07450at(AnonymousClass0N7 r1, AnonymousClass0Ts r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void cancel() {
        ArrayDeque arrayDeque = this.A01.A01;
        AnonymousClass0N7 r0 = this.A00;
        arrayDeque.remove(r0);
        r0.A00.remove(this);
    }
}
