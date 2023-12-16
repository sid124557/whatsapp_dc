package X;

import com.whatsapp.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5Nk  reason: invalid class name and case insensitive filesystem */
public final class C103545Nk {
    public final C186048uf A00;
    public final C105355Up A01;
    public final List A02;
    public final AtomicInteger A03 = new AtomicInteger(0);

    public C103545Nk(C186048uf r6, C54292oU r7, C105355Up r8) {
        C18270x1.A10(r7, 1, r8);
        this.A01 = r8;
        this.A00 = r6;
        int dimensionPixelSize = C54292oU.A00(r7).getDimensionPixelSize(R.dimen.f6nameremoved);
        List A0p = AnonymousClass8UF.A0p(new C132556fZ(dimensionPixelSize, dimensionPixelSize));
        this.A02 = A0p;
        A0p.add(new C132576fb("description"));
        A0p.add(new AnonymousClass6fY(dimensionPixelSize, dimensionPixelSize));
    }

    public final void A00(String str, String str2) {
        C90654hz r2;
        C186048uf r0 = this.A00;
        List list = this.A02;
        C112275jT r02 = (C112275jT) r0;
        String str3 = str;
        C171328Gq r9 = new C171328Gq(r02, str3);
        r02.A01 = r9;
        AnonymousClass64T r3 = r02.A0I;
        C59722xN r10 = r02.A0T.A00;
        C124016Aq r32 = (C124016Aq) r3;
        int i = r32.A01;
        Object obj = r32.A00;
        String str4 = str2;
        if (i != 0) {
            C64333Db r22 = ((C118065sw) obj).A02;
            AnonymousClass1VX A4B = C64333Db.A4B(r22);
            C55682qk A012 = C64333Db.A01(r22);
            AnonymousClass4FS A8y = C64333Db.A8y(r22);
            C620733j A2t = C64333Db.A2t(r22);
            C107695bk r1 = r22.A00;
            r2 = new C90654hz(A012, r1.AIq(), C107695bk.A0d(r1), C86624Kv.A0R(r22), A2t, A4B, r9, r10, C107695bk.A2m(r1), A8y, str3, str4, list);
        } else {
            C64333Db r23 = ((C118075sx) obj).A03;
            AnonymousClass1VX A4B2 = C64333Db.A4B(r23);
            C55682qk A013 = C64333Db.A01(r23);
            AnonymousClass4FS A8y2 = C64333Db.A8y(r23);
            C620733j A2t2 = C64333Db.A2t(r23);
            C107695bk r12 = r23.A00;
            r2 = new C90654hz(A013, r12.AIq(), C107695bk.A0d(r12), C86624Kv.A0R(r23), A2t2, A4B2, r9, r10, C107695bk.A2m(r12), A8y2, str3, str4, list);
        }
        r02.A0W.add(r2);
        r2.A08();
    }
}
