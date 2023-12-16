package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8Cj  reason: invalid class name and case insensitive filesystem */
public final class C170228Cj implements C186358vA {
    public final AnonymousClass731 A00;
    public final C187928y2 A01;
    public final C151437Ut A02;

    public boolean B2c(Object obj, Object obj2) {
        return AnonymousClass6C9.A1L(((C130786cX) obj).unknownFields.equals(((C130786cX) obj2).unknownFields) ? 1 : 0);
    }

    public int BCq(Object obj) {
        C160677o7 r7 = ((C130786cX) obj).unknownFields;
        int i = r7.A00;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r7.count; i2++) {
                int A002 = 2 + 1 + AnonymousClass6C7.A00(r7.A02[i2] >>> 3);
                int A04 = AnonymousClass730.A04(3);
                int A03 = ((C172548Lq) r7.A03[i2]).A03();
                i += A002 + A04 + AnonymousClass6C7.A00(A03) + A03;
            }
            r7.A00 = i;
        }
        return i;
    }

    public int BFY(Object obj) {
        return ((C130786cX) obj).unknownFields.hashCode();
    }

    public final boolean BHl(Object obj) {
        throw AnonymousClass001.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public void BKT(Object obj) {
        ((C130786cX) obj).unknownFields.A01 = false;
        throw AnonymousClass001.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public void BLA(C160837oO r2, C161277pL r3, Object obj) {
        this.A02.A00(obj);
        throw AnonymousClass001.A0g("ensureExtensionsAreMutable");
    }

    public void BLB(C156627gw r3, Object obj, byte[] bArr, int i, int i2) {
        C130786cX r4 = (C130786cX) obj;
        if (r4.unknownFields == C160677o7.A04) {
            r4.unknownFields = new C160677o7();
        }
        throw AnonymousClass001.A0g("ensureExtensionsAreMutable");
    }

    public Object BLT() {
        C187928y2 r2 = this.A01;
        boolean z = r2 instanceof C130786cX;
        C130786cX r22 = (C130786cX) r2;
        if (z) {
            return r22.A0I();
        }
        C130546c9 r23 = (C130546c9) r22.A0J(C141056ux.NEW_BUILDER, (Object) null, (Object) null);
        C130786cX r1 = r23.A00;
        if (r1.A0L()) {
            r1.A0K();
        }
        return r23.A00;
    }

    public void Bsk(AnonymousClass7VF r2, Object obj) {
        throw AnonymousClass001.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public C170228Cj(AnonymousClass731 r1, C187928y2 r2, C151437Ut r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BL9(Object obj, Object obj2) {
        C162507sF.A0S(obj, obj2);
    }
}
