package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.46x  reason: invalid class name and case insensitive filesystem */
public final class C833046x extends C72933eX {
    public static final AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C833046x.class, "consumed");
    public final AnonymousClass4FH A00;
    public final boolean A01;
    public volatile int consumed = 0;

    public Object A00(C84814Du r4, AnonymousClass4Gm r5) {
        Object A002 = C154567dN.A00(r4, this.A00, new C72813eK(r5), this.A01);
        if (A002 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return C59022wD.A00;
        }
        return A002;
    }

    public AnonymousClass4FH A01(AnonymousClass4C6 r3) {
        if (this.A01 && A02.getAndSet(this, 1) != 0) {
            throw AnonymousClass001.A0e("ReceiveChannel.consumeAsFlow can be collected just once");
        } else if (this.A00 == -3) {
            return this.A00;
        } else {
            return super.A01(r3);
        }
    }

    public Object Az8(C84814Du r4, AnonymousClass4C9 r5) {
        Object obj;
        if (this.A00 == -3) {
            boolean z = this.A01;
            if (!z || A02.getAndSet(this, 1) == 0) {
                obj = C154567dN.A00(r4, this.A00, r5, z);
            } else {
                throw AnonymousClass001.A0e("ReceiveChannel.consumeAsFlow can be collected just once");
            }
        } else {
            obj = super.Az8(r4, r5);
        }
        return AnonymousClass218.A00(obj);
    }

    public C833046x(C85494Gl r2, C369720l r3, AnonymousClass4FH r4, int i, boolean z) {
        super(r2, r3, i);
        this.A00 = r4;
        this.A01 = z;
    }
}
