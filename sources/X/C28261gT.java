package X;

import java.util.Set;

/* renamed from: X.1gT  reason: invalid class name and case insensitive filesystem */
public class C28261gT extends C56202rb {
    public long A00;
    public long A01;
    public String A02;
    public Set A03;
    public boolean A04;
    public final int A05;
    public final String A06;
    public final String A07;

    public C28261gT(C55682qk r15, C56612sH r16, AnonymousClass4FV r17, C55892r5 r18, Integer num, Integer num2, String str, String str2, String str3, Set set, int i, long j, long j2) {
        super(r15, r16, r17, r18, num, num2, str, 1, j, j2);
        this.A07 = str2;
        this.A03 = set;
        this.A05 = i;
        this.A06 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18310x6.A1O(A0o, "LoggableReceiptStanza");
        A0o.append(super.toString());
        A0o.append("; type=");
        A0o.append(this.A07);
        A0o.append("; messageType=");
        A0o.append(this.A05);
        A0o.append("; retryVersion=");
        A0o.append(this.A06);
        A0o.append("; hasOrphaned=");
        A0o.append(this.A04);
        A0o.append("; totalCount=");
        A0o.append(this.A01);
        A0o.append("; processedCount=");
        A0o.append(this.A00);
        return AnonymousClass000.A0e(A0o);
    }
}
