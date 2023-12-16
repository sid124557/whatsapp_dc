package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2lo  reason: invalid class name and case insensitive filesystem */
public final class C52642lo {
    public final long A00;
    public final DeviceJid A01;
    public final DeviceJid A02;

    public C52642lo(DeviceJid deviceJid, DeviceJid deviceJid2, long j) {
        C162457s7.A0J(deviceJid, 1);
        this.A01 = deviceJid;
        this.A00 = j;
        this.A02 = deviceJid2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52642lo) {
                C52642lo r8 = (C52642lo) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00 || !C162457s7.A0P(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A00(C18300x5.A04(this.A01), this.A00) + AnonymousClass000.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceProtocolModel(deviceJid=");
        A0o.append(this.A01);
        A0o.append(", keyIndex=");
        A0o.append(this.A00);
        A0o.append(", deviceLid=");
        return C18260x0.A04(this.A02, A0o);
    }
}
