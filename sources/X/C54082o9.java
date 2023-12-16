package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2o9  reason: invalid class name and case insensitive filesystem */
public class C54082o9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final C51442jp A0C;
    public final DeviceJid A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54082o9 r7 = (C54082o9) obj;
            if (!(this.A02 == r7.A02 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A0B == r7.A0B && this.A08 == r7.A08 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A03 == r7.A03 && this.A0D.equals(r7.A0D) && this.A01 == r7.A01 && this.A05 == r7.A05 && this.A09 == r7.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[12];
        objArr[0] = this.A0D;
        AnonymousClass000.A1M(objArr, this.A02);
        AnonymousClass0x2.A1U(objArr, this.A04);
        AnonymousClass0x2.A1V(objArr, this.A0A);
        C18300x5.A1R(objArr, this.A0B);
        C18320x8.A1R(objArr, this.A08);
        C18290x4.A1U(objArr, this.A00);
        objArr[7] = Long.valueOf(this.A07);
        objArr[8] = Long.valueOf(this.A03);
        objArr[9] = Integer.valueOf(this.A01);
        objArr[10] = Long.valueOf(this.A05);
        return C18310x6.A08(Long.valueOf(this.A09), objArr, 11);
    }

    public C54082o9(C51442jp r3, DeviceJid deviceJid, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.A06 = j;
        this.A0D = deviceJid;
        this.A02 = i;
        this.A04 = j2;
        this.A0A = j3;
        this.A0B = j4;
        this.A08 = j5;
        this.A00 = i2;
        this.A07 = j6;
        this.A03 = j7;
        this.A01 = i3;
        this.A05 = j8;
        this.A0C = r3;
        this.A09 = j9;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncDatum{deviceJid=");
        A0o.append(this.A0D);
        A0o.append(", syncType=");
        A0o.append(this.A02);
        A0o.append(", latestMsgId=");
        A0o.append(this.A04);
        A0o.append(", stageOldestMsgId=");
        A0o.append(this.A0A);
        A0o.append(", syncOldestMsgId=");
        A0o.append(this.A0B);
        A0o.append(", sendMsgsCount=");
        A0o.append(this.A08);
        A0o.append(", chunkOrder=");
        A0o.append(this.A00);
        A0o.append(", sentBytes=");
        A0o.append(this.A07);
        A0o.append(", lastChunkTimestamp=");
        A0o.append(this.A03);
        A0o.append(", status=");
        A0o.append(this.A01);
        A0o.append(", peerMsgRowId=");
        A0o.append(this.A05);
        A0o.append(", bootstrapId=");
        A0o.append(this.A0C);
        A0o.append(", sizeLimitBytes=");
        A0o.append(this.A09);
        return AnonymousClass000.A0d(A0o);
    }
}
