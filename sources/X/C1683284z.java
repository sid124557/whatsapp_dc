package X;

import java.io.File;

/* renamed from: X.84z  reason: invalid class name and case insensitive filesystem */
public class C1683284z implements C180528lD {
    public final C54372oc A00;
    public final C180598lK A01;

    public /* bridge */ /* synthetic */ void BXh(C157277i2 r8, C150297Qb r9, File file) {
        ((C180578lI) this.A01).B7T(C141406vW.CONCURRENT).execute(new C71593cM((Object) this, (Object) r8, (Object) file, (Object) r9, 4));
    }

    public C1683284z(C180598lK r2) {
        this.A01 = r2;
        this.A00 = ((C180548lF) r2).BDL("stale_removal");
    }
}
