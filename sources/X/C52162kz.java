package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2kz  reason: invalid class name and case insensitive filesystem */
public class C52162kz {
    public boolean A00;
    public boolean A01;
    public final DeviceJid A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C52162kz r4 = (C52162kz) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A02) + (this.A01 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0);
    }

    public C52162kz(DeviceJid deviceJid, boolean z, boolean z2) {
        this.A02 = deviceJid;
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParticipantDevice{deviceJid=");
        A0o.append(this.A02);
        A0o.append(", sentSenderKey=");
        A0o.append(this.A01);
        A0o.append(", sentAddOnSenderKey=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
