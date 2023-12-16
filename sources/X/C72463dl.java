package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3dl  reason: invalid class name and case insensitive filesystem */
public final class C72463dl implements C84814Du, AnonymousClass4C3 {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C72463dl.class, Object.class, "result");
    public final C84814Du A00;
    public volatile Object result;

    public C72463dl(C84814Du r2) {
        AnonymousClass218 r0 = AnonymousClass218.UNDECIDED;
        this.A00 = r2;
        this.result = r0;
    }

    public final Object A00() {
        Object obj = this.result;
        AnonymousClass218 r2 = AnonymousClass218.UNDECIDED;
        if (obj == r2) {
            if (!AnonymousClass0H6.A00(this, r2, AnonymousClass218.COROUTINE_SUSPENDED, A01)) {
                obj = this.result;
            }
            return AnonymousClass218.COROUTINE_SUSPENDED;
        }
        if (obj != AnonymousClass218.RESUMED) {
            if (!(obj instanceof AnonymousClass3Z0)) {
                return obj;
            }
            throw ((AnonymousClass3Z0) obj).exception;
        }
        return AnonymousClass218.COROUTINE_SUSPENDED;
    }

    public AnonymousClass4C3 B5B() {
        C84814Du r1 = this.A00;
        if (r1 instanceof AnonymousClass4C3) {
            return (AnonymousClass4C3) r1;
        }
        return null;
    }

    public C85494Gl B5w() {
        return this.A00.B5w();
    }

    public void BkD(Object obj) {
        while (true) {
            Object obj2 = this.result;
            AnonymousClass218 r1 = AnonymousClass218.UNDECIDED;
            if (obj2 != r1) {
                AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
                if (obj2 == r2) {
                    if (AnonymousClass0H6.A00(this, r2, AnonymousClass218.RESUMED, A01)) {
                        this.A00.BkD(obj);
                        return;
                    }
                } else {
                    throw AnonymousClass001.A0e("Already resumed");
                }
            } else if (AnonymousClass0H6.A00(this, r1, obj, A01)) {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SafeContinuation for ");
        return AnonymousClass000.A0R(this.A00, A0o);
    }
}
