package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3eD  reason: invalid class name and case insensitive filesystem */
public final class C72743eD implements C84834Dw {
    public static final AtomicIntegerFieldUpdater A01;
    public static final AtomicReferenceFieldUpdater A02;
    public static final AtomicReferenceFieldUpdater A03;
    public final C833246z A00;
    public volatile Object _exceptionsHolder;
    public volatile int _isCompleting = 0;
    public volatile Object _rootCause;

    public C72743eD(Throwable th, C833246z r3) {
        this.A00 = r3;
        this._rootCause = th;
    }

    public static final ArrayList A00() {
        return AnonymousClass002.A0I(4);
    }

    public final void A04() {
        A01.set(this, 1);
    }

    static {
        Class<C72743eD> cls = C72743eD.class;
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
        Class<Object> cls2 = Object.class;
        A03 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
    }

    public final Object A01() {
        return A02.get(this);
    }

    public final Throwable A02() {
        return (Throwable) A03.get(this);
    }

    public final void A05(Object obj) {
        A02.set(this, obj);
    }

    public final void A07(Throwable th) {
        A03.set(this, th);
    }

    public final boolean A09() {
        return AnonymousClass000.A1S(A01.get(this));
    }

    public final List A03(Throwable th) {
        AbstractList abstractList;
        Object A012 = A01();
        if (A012 == null) {
            abstractList = A00();
        } else if (A012 instanceof Throwable) {
            abstractList = A00();
            abstractList.add(A012);
        } else if (A012 instanceof ArrayList) {
            abstractList = (AbstractList) A012;
        } else {
            throw AnonymousClass000.A0H(A012, "State is ", AnonymousClass001.A0o());
        }
        Throwable A022 = A02();
        if (A022 != null) {
            abstractList.add(0, A022);
        }
        if (th != null && !th.equals(A022)) {
            abstractList.add(th);
        }
        A05(AnonymousClass36I.A05);
        return abstractList;
    }

    public final void A06(Throwable th) {
        Throwable A022 = A02();
        if (A022 == null) {
            A07(th);
        } else if (th != A022) {
            Object A012 = A01();
            if (A012 == null) {
                A05(th);
            } else if (A012 instanceof Throwable) {
                if (th != A012) {
                    ArrayList A002 = A00();
                    A002.add(A012);
                    A002.add(th);
                    A05(A002);
                }
            } else if (A012 instanceof ArrayList) {
                ((AbstractCollection) A012).add(th);
            } else {
                throw AnonymousClass000.A0H(A012, "State is ", AnonymousClass001.A0o());
            }
        }
    }

    public final boolean A08() {
        return AnonymousClass000.A1W(A02());
    }

    public final boolean A0A() {
        return AnonymousClass000.A1Y(A01(), AnonymousClass36I.A05);
    }

    public C833246z B98() {
        return this.A00;
    }

    public boolean BGz() {
        return AnonymousClass000.A1X(A02());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Finishing[cancelling=");
        A0o.append(A08());
        A0o.append(", completing=");
        A0o.append(A09());
        A0o.append(", rootCause=");
        A0o.append(A02());
        A0o.append(", exceptions=");
        A0o.append(A01());
        A0o.append(", list=");
        A0o.append(B98());
        return AnonymousClass0x2.A0f(A0o);
    }
}
