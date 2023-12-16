package X;

import java.io.Serializable;

/* renamed from: X.3Z2  reason: invalid class name */
public class AnonymousClass3Z2 implements Serializable {
    public static final long serialVersionUID = 1;
    public final int disappearingMessagesInitiator;
    public final long ephemeralSettingTimestamp;
    public final int expiration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass3Z2 r7 = (AnonymousClass3Z2) obj;
            return this.expiration == r7.expiration && this.disappearingMessagesInitiator == r7.disappearingMessagesInitiator && this.ephemeralSettingTimestamp == r7.ephemeralSettingTimestamp;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A00(this.expiration * 31, this.ephemeralSettingTimestamp) + this.disappearingMessagesInitiator;
    }

    public AnonymousClass3Z2(int i, long j, int i2) {
        this.expiration = i;
        this.ephemeralSettingTimestamp = j;
        this.disappearingMessagesInitiator = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralInfo{expiration=");
        A0o.append(this.expiration);
        A0o.append(", ephemeralSettingTimestamp=");
        A0o.append(this.ephemeralSettingTimestamp);
        A0o.append(", disappearingMessagesInitiator=");
        A0o.append(this.disappearingMessagesInitiator);
        return AnonymousClass000.A0d(A0o);
    }
}
