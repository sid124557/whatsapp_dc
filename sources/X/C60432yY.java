package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2yY  reason: invalid class name and case insensitive filesystem */
public final class C60432yY {
    public DeviceJid A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60432yY) && C162457s7.A0P(this.A00, ((C60432yY) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C60432yY(DeviceJid deviceJid) {
        this.A00 = deviceJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageDetailsInfo(authorDeviceJid=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C60432yY() {
        this((DeviceJid) null);
    }
}
