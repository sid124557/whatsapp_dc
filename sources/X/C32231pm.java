package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1pm  reason: invalid class name and case insensitive filesystem */
public final class C32231pm extends C47742dk {
    public final long A00;
    public final long A01;
    public final DeviceJid A02;
    public final DeviceJid A03;
    public final GroupJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C32231pm(DeviceJid deviceJid, DeviceJid deviceJid2, GroupJid groupJid, String str, String str2, String str3, long j, long j2, boolean z) {
        C162457s7.A0J(str3, 3);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A02 = deviceJid;
        this.A03 = deviceJid2;
        this.A08 = z;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = groupJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32231pm) {
                C32231pm r8 = (C32231pm) obj;
                if (!C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A07, r8.A07) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03) || this.A08 != r8.A08 || this.A00 != r8.A00 || this.A01 != r8.A01 || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass0x2.A01((((AnonymousClass0x2.A07(this.A05, (C18310x6.A09(this.A06) + C18270x1.A00(this.A07)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A03)) * 31, this.A08), this.A00), this.A01) + C18310x6.A07(this.A04);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallPushPayload(dataNotificationType=");
        A0o.append(this.A06);
        A0o.append(", dataToLid=");
        A0o.append(this.A07);
        A0o.append(", callId=");
        A0o.append(this.A05);
        A0o.append(", fromDeviceJid=");
        A0o.append(this.A02);
        A0o.append(", fromPhoneDeviceJid=");
        A0o.append(this.A03);
        A0o.append(", videoCall=");
        A0o.append(this.A08);
        A0o.append(", offerTimeSec=");
        A0o.append(this.A00);
        A0o.append(", pushTimeoutSec=");
        A0o.append(this.A01);
        A0o.append(", groupJid=");
        return C18260x0.A04(this.A04, A0o);
    }
}
