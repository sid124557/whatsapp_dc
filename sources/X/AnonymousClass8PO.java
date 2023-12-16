package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.8PO  reason: invalid class name */
public final class AnonymousClass8PO implements AnonymousClass4GW, C183558qE {
    public final AnonymousClass46G A00;
    public final /* synthetic */ C175788Zs A01;

    public /* bridge */ /* synthetic */ Object BrC(Object obj, Object obj2, AnonymousClass4GQ r7) {
        C175788Zs r2 = this.A01;
        Object BrC = this.A00.BrC(obj, (Object) null, new C175488Yo(this, r2));
        if (BrC != null) {
            C175788Zs.A01.set(r2, (Object) null);
        }
        return BrC;
    }

    public AnonymousClass8PO(AnonymousClass46G r1, C175788Zs r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AzI(Object obj) {
        this.A00.AzI(obj);
    }

    public C85494Gl B5w() {
        return this.A00.A01;
    }

    public void BGs(AnonymousClass4GQ r2) {
        this.A00.BGs(r2);
    }

    public void BGt(C175778Zr r2, int i) {
        this.A00.BGt(r2, i);
    }

    public /* bridge */ /* synthetic */ void BkA(AnonymousClass4GQ r4, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C175788Zs.A01;
        C175788Zs r2 = this.A01;
        atomicReferenceFieldUpdater.set(r2, (Object) null);
        this.A00.BkA(new C175478Yn(this, r2), obj);
    }

    public /* bridge */ /* synthetic */ void BkC(Object obj, C73853gB r3) {
        this.A00.BkC(obj, r3);
    }

    public void BkD(Object obj) {
        this.A00.BkD(obj);
    }
}
