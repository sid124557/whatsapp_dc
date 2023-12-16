package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.47H  reason: invalid class name */
public final class AnonymousClass47H extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C55682qk A00;
    public transient C54442oj A01;
    public transient AnonymousClass31C A02;
    public final String groupJidRawString;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass47H(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 1
            X.C162457s7.A0J(r4, r2)
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "group-fetch-all-membership-approval-requests"
            r1.A00 = r0
            r1.A02 = r2
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r3.<init>(r0)
            r3.groupJidRawString = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47H.<init>(java.lang.String):void");
    }

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        C64333Db A012 = C389229y.A01(applicationContext);
        this.A02 = A012.BLC();
        this.A00 = A012.Azq();
        this.A01 = (C54442oj) A012.AGZ.get();
    }
}
