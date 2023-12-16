package X;

/* renamed from: X.33F  reason: invalid class name */
public class AnonymousClass33F {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public final C624134x A05;

    public AnonymousClass33F(C624134x r4, String str, long j) {
        this.A05 = r4;
        this.A04 = str;
        this.A00 = j;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass33F)) {
            return false;
        }
        AnonymousClass33F r7 = (AnonymousClass33F) obj;
        return AnonymousClass75J.A00(this.A05, r7.A05) && AnonymousClass75J.A00(this.A04, r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && AnonymousClass75J.A00(this.A03, r7.A03) && AnonymousClass75J.A00(this.A02, r7.A02);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A04;
        AnonymousClass0x2.A1U(objArr, this.A00);
        AnonymousClass0x2.A1V(objArr, this.A01);
        objArr[4] = this.A03;
        return C18310x6.A08(this.A02, objArr, 5);
    }

    public boolean A00() {
        String str;
        C624134x r1 = this.A05;
        if ((!(r1 instanceof C30471mV) || (str = ((C30471mV) r1).A07) == null || !str.contains("static.whatsapp.net/downloadable?category=PSA")) && this.A04 == null) {
            return true;
        }
        return false;
    }

    public boolean A01(long j) {
        long j2 = this.A01;
        if (j2 == Long.MAX_VALUE) {
            if (j > this.A00) {
                return true;
            }
            return false;
        } else if (j2 + 86400000 < j) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass33F(C624134x r3, String str, String str2, String str3, long j) {
        this.A05 = r3;
        this.A04 = str;
        this.A00 = j;
        this.A01 = Long.MAX_VALUE;
        this.A03 = str2;
        this.A02 = str3;
    }

    public AnonymousClass33F(C624134x r6) {
        this.A05 = r6;
        this.A04 = null;
        this.A00 = 0;
        this.A01 = Long.MAX_VALUE;
        this.A03 = null;
        this.A02 = null;
    }
}
