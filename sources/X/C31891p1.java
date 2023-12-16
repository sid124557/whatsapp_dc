package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1p1  reason: invalid class name and case insensitive filesystem */
public class C31891p1 extends C30341mI {
    public int A00;
    public List A01 = AnonymousClass001.A0s();
    public final C620833k A02;
    public transient long A03;
    public transient AnonymousClass39T A04;

    public static C31891p1 A02(AnonymousClass2z0 r4, int i, long j) {
        return new C31891p1(r4, (AnonymousClass39T) null, i, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31891p1(X.C620833k r3, X.AnonymousClass39T r4, int r5, long r6) {
        /*
            r2 = this;
            com.whatsapp.jid.Jid r0 = r4.A02
            X.4uZ r1 = X.C627336j.A02(r0)
            java.lang.String r0 = r4.A07
            X.C626936e.A06(r0)
            X.2z0 r0 = X.AnonymousClass2z0.A04(r1, r0)
            r2.<init>(r0, r5, r6)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r2.A01 = r0
            r2.A02 = r3
            r0 = 6
            r2.A1G(r0)
            r2.A04 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31891p1.<init>(X.33k, X.39T, int, long):void");
    }

    public void A1w(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 0 && (C18290x4.A0k(list) instanceof String)) {
                this.A01 = C627336j.A0B(UserJid.class, list);
            }
        }
    }

    public C31891p1(AnonymousClass2z0 r2, AnonymousClass39T r3, int i, long j) {
        super(r2, i, j);
        this.A04 = r3;
        this.A02 = null;
    }
}
