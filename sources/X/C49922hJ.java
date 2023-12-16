package X;

/* renamed from: X.2hJ  reason: invalid class name and case insensitive filesystem */
public class C49922hJ {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public final AnonymousClass39M A04;

    public void A00(AnonymousClass39M r3) {
        AnonymousClass39M r1 = this.A04;
        r1.A0D = r3.A0D;
        r1.A0A = r3.A0A;
        r1.A0G = r3.A0G;
        String str = r3.A08;
        if (str != null) {
            r1.A08 = str;
        }
        r1.A06 = r3.A06;
        String str2 = r3.A0C;
        if (str2 != null) {
            r1.A0C = str2;
        }
        String str3 = r3.A0B;
        if (str3 != null) {
            r1.A0B = str3;
        }
        r1.A00 = r3.A00;
        r1.A03 = r3.A03;
        r1.A02 = r3.A02;
        r1.A0A = r3.A0A;
        r1.A0L = r3.A0L;
    }

    public C49922hJ(AnonymousClass39M r1, String str, String str2, String str3, long j) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = r1;
        this.A00 = j;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RecentStickerIdentifier{fileHash='");
        char A012 = C18300x5.A01(this.A02, A0o);
        A0o.append(", imageHash='");
        A0o.append(this.A03);
        A0o.append(A012);
        A0o.append(", sticker=");
        A0o.append(this.A04);
        A0o.append(", lastStickerSentTs=");
        A0o.append(this.A00);
        A0o.append(", avatarTemplateId='");
        A0o.append(this.A01);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
