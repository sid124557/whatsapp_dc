package X;

/* renamed from: X.8Ax  reason: invalid class name and case insensitive filesystem */
public final class C169858Ax implements C186268v1 {
    public final C1445572a A00;
    public final C187848xu A01;
    public final C1445772c A02;

    public final int BtE(Object obj) {
        return ((C128766Xj) obj).zzb.hashCode();
    }

    public final Object BtG() {
        return ((C169838Av) ((C128766Xj) this.A01).A09(5)).Bu1();
    }

    public final boolean BtO(Object obj, Object obj2) {
        return AnonymousClass6C9.A1L(((C128766Xj) obj).zzb.equals(((C128766Xj) obj2).zzb) ? 1 : 0);
    }

    public final void BtS(C186138uo r2, Object obj) {
        throw AnonymousClass001.A0g("zzc");
    }

    public final void BtT(C156607gu r3, Object obj, byte[] bArr, int i, int i2) {
        C128766Xj r4 = (C128766Xj) obj;
        if (r4.zzb == C160657o4.A05) {
            r4.zzb = new C160657o4();
        }
        throw AnonymousClass001.A0g("zza");
    }

    public final int BtX(Object obj) {
        C160657o4 r7 = ((C128766Xj) obj).zzb;
        int i = r7.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r7.A00; i2++) {
                i += 2 + 1 + AnonymousClass6C7.A00(r7.A03[i2] >>> 3) + C128856Xs.A03((C172538Lp) r7.A04[i2], 3);
            }
            r7.A01 = i;
        }
        return i;
    }

    public final void Btp(Object obj) {
        ((C128766Xj) obj).zzb.A02 = false;
        throw AnonymousClass001.A0g("zzc");
    }

    public final boolean Bty(Object obj) {
        throw AnonymousClass001.A0g("zzc");
    }

    public C169858Ax(C1445572a r1, C187848xu r2, C1445772c r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Btg(Object obj, Object obj2) {
        C162497sE.A0T(obj, obj2);
    }
}
