package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.461  reason: invalid class name */
public final class AnonymousClass461 extends C831046d implements C85504Gn, AnonymousClass4Gm {
    public final C85504Gn A00;

    public AnonymousClass461(C85494Gl r2, C85504Gn r3) {
        this(r2, r3, true, true);
    }

    public boolean Az4(Throwable th) {
        return this.A00.Az4(th);
    }

    public AnonymousClass2PR BAA() {
        return this.A00.BAA();
    }

    public AnonymousClass2PR BAB() {
        return this.A00.BAB();
    }

    public void BGu(AnonymousClass4GQ r2) {
        this.A00.BGu(r2);
    }

    public boolean BHE() {
        return this.A00.BHE();
    }

    public AnonymousClass8PQ BJP() {
        return this.A00.BJP();
    }

    public Object BiR(C84814Du r2) {
        return this.A00.BiR(r2);
    }

    public Object BlD(Object obj, C84814Du r3) {
        return this.A00.BlD(obj, r3);
    }

    public Object BrB() {
        return this.A00.BrB();
    }

    public Object BrD(Object obj) {
        return this.A00.BrD(obj);
    }

    public void A0Z(Throwable th) {
        CancellationException A03 = A0Q((String) null, th);
        this.A00.AyX(A03);
        A0b(A03);
    }

    public void A11(Throwable th, boolean z) {
        if (!A12().Az4(th) && !z) {
            C1453575e.A00(B5w(), th);
        }
    }

    public final C85504Gn A12() {
        return this.A00;
    }

    public void A13() {
        A12().Az4((Throwable) null);
    }

    public final void AyX(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C73483fZ(A0K(), (Throwable) null, this);
            }
            A0Z(cancellationException);
        }
    }

    public /* bridge */ /* synthetic */ void A0z(Object obj) {
        A13();
    }

    public AnonymousClass461(C85494Gl r2, C85504Gn r3, boolean z, boolean z2) {
        super(r2, true);
        this.A00 = r3;
    }
}
