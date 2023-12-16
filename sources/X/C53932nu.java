package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.2nu  reason: invalid class name and case insensitive filesystem */
public final class C53932nu {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final UserJid A04;
    public final C624134x A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53932nu) {
                C53932nu r8 = (C53932nu) obj;
                if (!(C162457s7.A0P(this.A05, r8.A05) && C162457s7.A0P(this.A03, r8.A03) && C162457s7.A0P(this.A04, r8.A04) && C162457s7.A0P(this.A06, r8.A06) && this.A08 == r8.A08 && this.A07 == r8.A07 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53932nu(C43772Tk r17) {
        C43772Tk r13 = r17;
        C624134x r12 = r13.A09;
        DeviceJid deviceJid = r13.A03;
        UserJid userJid = r13.A04;
        Set set = r13.A05;
        boolean z = r13.A07;
        boolean z2 = r13.A06;
        long j = r13.A01;
        long j2 = r13.A02;
        long j3 = r13.A00;
        if (j3 == 0) {
            if (r12 instanceof C30441mS) {
                j3 = r13.A08.A0H();
            } else {
                j3 = r12.A0K;
            }
        }
        this.A05 = r12;
        this.A03 = deviceJid;
        this.A04 = userJid;
        this.A06 = set;
        this.A08 = z;
        this.A07 = z2;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A06, (((C18300x5.A04(this.A05) + AnonymousClass000.A07(this.A03)) * 31) + C18310x6.A07(this.A04)) * 31), this.A08), this.A07), this.A01), this.A02), this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SendMessageParams(message=");
        A0o.append(this.A05);
        A0o.append(", remoteJidForRetry=");
        A0o.append(this.A03);
        A0o.append(", recipientJid=");
        A0o.append(this.A04);
        A0o.append(", targetDevices=");
        A0o.append(this.A06);
        A0o.append(", isResend=");
        A0o.append(this.A08);
        A0o.append(", isOffline=");
        A0o.append(this.A07);
        A0o.append(", originalTimestamp=");
        A0o.append(this.A01);
        A0o.append(", sendExpirationMs=");
        A0o.append(this.A02);
        A0o.append(", messageSendStartTime=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
