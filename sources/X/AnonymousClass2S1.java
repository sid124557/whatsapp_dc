package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2S1  reason: invalid class name */
public class AnonymousClass2S1 {
    public int A00;
    public long A01;
    public long A02;
    public C370020o A03;
    public Collection A04;
    public List A05;

    public /* synthetic */ AnonymousClass2S1(C370020o r4, List list, int i, long j, long j2) {
        AnonymousClass21M[] r2 = new AnonymousClass21M[2];
        r2[0] = AnonymousClass21M.LGC;
        List A19 = AnonymousClass0x9.A19(AnonymousClass21M.GROUP_CHATS, r2, 1);
        C162457s7.A0J(r4, 1);
        this.A03 = r4;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = list;
        this.A04 = A19;
    }

    public static long A00() {
        return System.currentTimeMillis() - TimeUnit.DAYS.toMillis(60);
    }
}
