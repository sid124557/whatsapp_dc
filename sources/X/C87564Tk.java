package X;

import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.4Tk  reason: invalid class name and case insensitive filesystem */
public final class C87564Tk extends AnonymousClass08Y {
    public C108965dr A00;
    public String A01;
    public final Bundle A02;
    public final C101345Ek A03;
    public final AnonymousClass5ZO A04;
    public final AnonymousClass5UT A05;
    public final C166447yh A06;
    public final ArrayList A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87564Tk(Bundle bundle, Bundle bundle2, C17310vJ r4, C101345Ek r5, C108965dr r6, AnonymousClass5ZO r7, AnonymousClass5UT r8, C166447yh r9, String str, ArrayList arrayList) {
        super(bundle, r4);
        AnonymousClass0x2.A1A(bundle2, 4, r6);
        C162457s7.A0J(r9, 7);
        this.A01 = str;
        this.A02 = bundle2;
        this.A00 = r6;
        this.A04 = r7;
        this.A06 = r9;
        this.A05 = r8;
        this.A07 = arrayList;
        this.A03 = r5;
    }

    public C05550Ty A02(AnonymousClass0XV r38, Class cls, String str) {
        AnonymousClass0XV r15 = r38;
        C162457s7.A0J(r15, 2);
        C101345Ek r0 = this.A03;
        String str2 = this.A01;
        Bundle bundle = this.A02;
        C108965dr r10 = this.A00;
        AnonymousClass5ZO r9 = this.A04;
        C166447yh r8 = this.A06;
        AnonymousClass5UT r7 = this.A05;
        ArrayList arrayList = this.A07;
        C118075sx r1 = r0.A00;
        C64333Db r2 = r1.A03;
        C69263Wi A042 = C64333Db.A04(r2);
        AnonymousClass4FS A8y = C64333Db.A8y(r2);
        C54292oU A2q = C64333Db.A2q(r2);
        Application A002 = C69773Yi.A00(r2.AdE);
        C620733j A2t = C64333Db.A2t(r2);
        C88834as r12 = r1.A01;
        C112275jT ABZ = r12.ABZ();
        C107695bk r02 = r2.A00;
        C105355Up A2l = C107695bk.A2l(r02);
        AnonymousClass5ZR A2r = C64333Db.A2r(r2);
        C111525iE A0d = C107695bk.A0d(r02);
        AnonymousClass8E9 A2m = C107695bk.A2m(r02);
        C108965dr r20 = r10;
        AnonymousClass5ZO r21 = r9;
        C105085Tn r23 = (C105085Tn) r02.AAO.get();
        C105705Wb r24 = (C105705Wb) r02.A3W.get();
        C1223764d r25 = (C1223764d) r12.A2z.get();
        C111545iG r19 = (C111545iG) r02.A3e.get();
        return new AnonymousClass4U8(A002, bundle, r15, (AnonymousClass5MD) r02.A4a.get(), A042, A0d, r19, r20, r21, ABZ, r23, r24, r25, (C182038nl) r12.A2y.get(), r7, r8, A2q, A2r, A2t, A2l, A2m, A8y, str2, arrayList);
    }
}
