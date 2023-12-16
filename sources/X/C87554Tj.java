package X;

import android.app.Application;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.Collection;

/* renamed from: X.4Tj  reason: invalid class name and case insensitive filesystem */
public class C87554Tj extends AnonymousClass08Y {
    public final AnonymousClass5F0 A00;
    public final C166447yh A01;
    public final Jid A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C05550Ty A02(AnonymousClass0XV r40, Class cls, String str) {
        AnonymousClass5F0 r0 = this.A00;
        boolean z = this.A04;
        String str2 = this.A03;
        C166447yh r12 = this.A01;
        boolean z2 = this.A05;
        Jid jid = this.A02;
        C118055sv r3 = r0.A00;
        C64333Db r2 = r3.A04;
        Application A002 = C69773Yi.A00(r2.AdE);
        C107695bk r1 = r2.A00;
        C105355Up A2l = C107695bk.A2l(r1);
        C620433g A0K = C86624Kv.A0K(r2);
        C88834as r22 = r3.A01;
        C112275jT ABZ = r22.ABZ();
        C88854au r02 = r3.A03;
        C157167hq r9 = new C157167hq(C107695bk.A2k(r02.A1B));
        C111525iE A0d = C107695bk.A0d(r1);
        AnonymousClass7HD r29 = new AnonymousClass7HD();
        C129526aS copyOf = C129526aS.copyOf((Collection) AnonymousClass002.A0K());
        C111545iG r21 = (C111545iG) r1.A3e.get();
        AnonymousClass4w0 r23 = (AnonymousClass4w0) r1.A1g.get();
        C105085Tn r24 = (C105085Tn) r1.AAO.get();
        C150977Sy r25 = (C150977Sy) r1.A3X.get();
        C157167hq r26 = r9;
        C1223764d r27 = (C1223764d) r22.A2z.get();
        return new AnonymousClass4U5(A002, r40, (AnonymousClass7C6) r02.A0L.get(), A0K, A0d, r21, ABZ, r23, r24, r25, r26, r27, (C182038nl) r22.A2y.get(), r29, (C1224064g) r02.A0K.get(), r12, jid, A2l, (AnonymousClass5PS) r1.A3Y.get(), str2, copyOf, z, z2);
    }

    public C87554Tj(Bundle bundle, C17310vJ r2, AnonymousClass5F0 r3, C166447yh r4, Jid jid, String str, boolean z, boolean z2) {
        super(bundle, r2);
        this.A01 = r4;
        this.A02 = jid;
        this.A04 = z;
        this.A00 = r3;
        this.A03 = str;
        this.A05 = z2;
    }
}
