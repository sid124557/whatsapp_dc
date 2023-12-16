package X;

import android.content.Context;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.47V  reason: invalid class name */
public final class AnonymousClass47V extends Job implements C1228065u {
    public transient C55682qk A00;
    public transient C49712gy A01;
    public transient C66493Lq A02;
    public transient C49052fu A03;
    public transient AnonymousClass2GZ A04;
    public transient AnonymousClass2L2 A05;
    public final Set fetchedGroups;
    public final List groupsToFetch;
    public final int params;
    public final int round;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass47V(java.util.List r3, java.util.Set r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = 4
            X.C162457s7.A0J(r4, r0)
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "fetch_truncated_groups_job"
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            r2.round = r5
            r2.params = r6
            r2.groupsToFetch = r3
            r2.fetchedGroups = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47V.<init>(java.util.List, java.util.Set, int, int):void");
    }

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        C64333Db A012 = C389229y.A01(applicationContext);
        C55682qk Azq = A012.Azq();
        C162457s7.A0J(Azq, 0);
        this.A00 = Azq;
        C49712gy r0 = (C49712gy) C18300x5.A0b(C72343dZ.A00(A012.AaZ));
        C162457s7.A0J(r0, 0);
        this.A01 = r0;
        C66493Lq AnO = A012.AnO();
        C162457s7.A0J(AnO, 0);
        this.A02 = AnO;
        C49052fu r02 = (C49052fu) A012.AGR.get();
        C162457s7.A0J(r02, 0);
        this.A03 = r02;
        AnonymousClass2L2 r03 = (AnonymousClass2L2) A012.AcK.A00.A0r.get();
        C162457s7.A0J(r03, 0);
        this.A05 = r03;
        AnonymousClass2GZ r04 = (AnonymousClass2GZ) A012.AGT.get();
        C162457s7.A0J(r04, 0);
        this.A04 = r04;
    }

    public static final String A00(String str) {
        return C175738Zn.A0U(C830345w.A09(str), "\n", "", false);
    }
}
