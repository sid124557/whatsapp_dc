package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.221  reason: invalid class name */
public enum AnonymousClass221 {
    A03("EIGHT_HOURS", TimeUnit.HOURS.toMillis(8)),
    A04("ONE_WEEK", AnonymousClass0x7.A0C()),
    A02("ALWAYS", -1);
    
    public final long durationInMillis;
    public final int id;

    /* access modifiers changed from: public */
    static {
        AnonymousClass221[] r1;
        A00 = C73653fr.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass221(String str, long j) {
        this.id = r2;
        this.durationInMillis = j;
    }
}
