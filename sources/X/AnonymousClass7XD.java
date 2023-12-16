package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.7XD  reason: invalid class name */
public final class AnonymousClass7XD {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final AnonymousClass6PS A08;
    public final AnonymousClass6PS A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass7XD.class != obj.getClass()) {
                return false;
            }
            AnonymousClass7XD r7 = (AnonymousClass7XD) obj;
            if (!(this.A04 == r7.A04 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A02 == r7.A02 && this.A05 == r7.A05 && C1447372t.A00(this.A07, r7.A07) && C1447372t.A00(this.A09, r7.A09) && C1447372t.A00(this.A06, r7.A06) && C1447372t.A00(this.A08, r7.A08))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        C18280x3.A1S(objArr, this.A04);
        objArr[1] = this.A07;
        AnonymousClass000.A1N(objArr, this.A01);
        objArr[3] = this.A09;
        objArr[4] = Long.valueOf(this.A03);
        objArr[5] = this.A06;
        C18290x4.A1U(objArr, this.A00);
        objArr[7] = this.A08;
        objArr[8] = Long.valueOf(this.A02);
        return C18310x6.A08(Long.valueOf(this.A05), objArr, 9);
    }

    public AnonymousClass7XD(Timeline timeline, Timeline timeline2, AnonymousClass6PS r3, AnonymousClass6PS r4, int i, int i2, long j, long j2, long j3, long j4) {
        this.A04 = j;
        this.A07 = timeline;
        this.A01 = i;
        this.A09 = r3;
        this.A03 = j2;
        this.A06 = timeline2;
        this.A00 = i2;
        this.A08 = r4;
        this.A02 = j3;
        this.A05 = j4;
    }
}
