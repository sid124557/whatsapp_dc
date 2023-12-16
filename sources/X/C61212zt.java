package X;

import java.io.File;

/* renamed from: X.2zt  reason: invalid class name and case insensitive filesystem */
public class C61212zt {
    public final C184298rZ A00;
    public final AnonymousClass5LM A01;
    public final AnonymousClass2UD A02;
    public final C157497iO A03;
    public final AnonymousClass2UL A04;

    public C61212zt(AnonymousClass3QO r4, AnonymousClass2UD r5) {
        this(r4.A0K, r4.A0L, r5, r4.A0N.A03);
    }

    public File A01() {
        File file = this.A02.A07;
        C626936e.A06(file);
        return file;
    }

    public boolean A02() {
        AnonymousClass2UD r1 = this.A02;
        if (AnonymousClass36O.A05(r1.A06)) {
            return r1.A0D;
        }
        return r1.A0C;
    }

    public String toString() {
        StringBuilder A0A = C18330xA.A0A("[job_id=");
        A0A.append(this.A01.A0D);
        return AnonymousClass000.A0f(A0A);
    }

    public int A00() {
        return 0;
    }

    public C61212zt(C184298rZ r2, AnonymousClass5LM r3, AnonymousClass2UD r4, C157497iO r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = new AnonymousClass2UL();
    }
}
