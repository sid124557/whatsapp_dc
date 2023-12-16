package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2aU  reason: invalid class name and case insensitive filesystem */
public final class C45732aU {
    public final /* synthetic */ AnonymousClass2ZA A00;
    public final /* synthetic */ C52732lx A01;
    public final /* synthetic */ AnonymousClass32Q A02;

    public C45732aU(AnonymousClass2ZA r1, C52732lx r2, AnonymousClass32Q r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00(int i, Integer num) {
        C106245Ye.A02(AnonymousClass000.A0Y("XFamilyCrosspostRequestManager/generateCrosspostGraphqlCallback unknown error with code: ", AnonymousClass001.A0o(), i), (Throwable) null);
        C129586aY r0 = this.A01.A00;
        ArrayList A0c = C73783g4.A0c(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        AnonymousClass32Q r02 = this.A02;
        AnonymousClass36X.A06(r02.A00, r02.A03, r02.A05, A0c, 4);
        this.A00.A00(i, num);
    }
}
