package X;

import java.util.Collection;

/* renamed from: X.1tE  reason: invalid class name and case insensitive filesystem */
public final class C33501tE extends AnonymousClass5ZM {
    public final int A00 = 200;
    public final AnonymousClass4AY A01;
    public final AnonymousClass4F7 A02;
    public final boolean A03;
    public final /* synthetic */ C50432iA A04;

    public C33501tE(C50432iA r2, AnonymousClass4AY r3, AnonymousClass4F7 r4, boolean z) {
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Collection B3D;
        String[] strArr = (String[]) objArr;
        C162457s7.A0J(strArr, 0);
        int length = strArr.length;
        AnonymousClass4F7 r3 = this.A02;
        if (length == 1) {
            B3D = r3.B3C(strArr[0], this.A00, this.A03, false);
        } else {
            B3D = r3.B3D(strArr, this.A00, this.A03, false);
        }
        C162457s7.A0H(B3D);
        return B3D;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        C162457s7.A0J(collection, 0);
        C73743g0.A0X(this.A04.A0A, new C820542c(this));
        if (!C18320x8.A1T(this)) {
            C48652fF r1 = (C48652fF) ((AnonymousClass4KS) this.A01).A00;
            C626936e.A01();
            r1.A01.addAll(collection);
            AnonymousClass4AX r0 = r1.A00;
            if (r0 != null) {
                r0.BaW(r1);
            }
        }
    }
}
