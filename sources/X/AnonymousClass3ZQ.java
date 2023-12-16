package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3ZQ  reason: invalid class name */
public class AnonymousClass3ZQ implements Comparable {
    public int A00;
    public long A01;
    public AnonymousClass39Q A02;
    public final AnonymousClass1S4 A03;
    public final UserJid A04;
    public final UserJid A05;
    public final boolean A06;

    public AnonymousClass3ZQ(AnonymousClass39Q r3, AnonymousClass1S4 r4, UserJid userJid, long j) {
        this.A06 = true;
        this.A04 = null;
        this.A05 = userJid;
        this.A00 = 1;
        this.A02 = r3;
        this.A01 = j;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass3ZQ r5 = (AnonymousClass3ZQ) obj;
        int compare = Integer.compare(this.A00, r5.A00);
        if (compare == 0) {
            return Long.compare(this.A01, r5.A01);
        }
        return -compare;
    }

    public AnonymousClass3ZQ(UserJid userJid, UserJid userJid2, int i, long j) {
        this.A06 = false;
        this.A03 = null;
        this.A05 = userJid;
        this.A04 = userJid2;
        this.A00 = i;
        this.A01 = j;
    }
}
