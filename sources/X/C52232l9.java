package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2l9  reason: invalid class name and case insensitive filesystem */
public final class C52232l9 {
    public final long A00;
    public final GroupJid A01;
    public final String A02;

    public C52232l9(String str, GroupJid groupJid, long j) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = groupJid;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52232l9) {
                C52232l9 r8 = (C52232l9) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A08(this.A01, C18310x6.A09(this.A02)), this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScheduledCallReminderCommand(scheduledId=");
        A0o.append(this.A02);
        A0o.append(", groupJid=");
        A0o.append(this.A01);
        A0o.append(", scheduledTimestampSec=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
