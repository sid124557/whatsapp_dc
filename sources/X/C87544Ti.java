package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.4Ti  reason: invalid class name and case insensitive filesystem */
public class C87544Ti extends AnonymousClass08Y {
    public final int A00;
    public final C101495Ez A01;
    public final String A02;

    public C05550Ty A02(AnonymousClass0XV r16, Class cls, String str) {
        C101495Ez r0 = this.A01;
        int i = this.A00;
        String str2 = this.A02;
        C118055sv r2 = r0.A00;
        C64333Db r1 = r2.A04;
        AnonymousClass1VX A4B = C64333Db.A4B(r1);
        Application A002 = C69773Yi.A00(r1.AdE);
        C69263Wi A04 = C64333Db.A04(r1);
        C107695bk r12 = r1.A00;
        return new AnonymousClass4U1(A002, r16, (AnonymousClass7C5) r2.A03.A0F.get(), (AnonymousClass5MC) r12.A4Y.get(), A04, (AnonymousClass5ML) r12.A1U.get(), r12.AJc(), r2.A01.ABY(), A4B, (C104795Sj) r12.A1T.get(), str2, i);
    }

    public C87544Ti(Bundle bundle, C17310vJ r2, C101495Ez r3, String str, int i) {
        super(bundle, r2);
        this.A01 = r3;
        this.A00 = i;
        this.A02 = str;
    }
}
