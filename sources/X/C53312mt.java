package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2mt  reason: invalid class name and case insensitive filesystem */
public class C53312mt {
    public long A00;
    public GroupJid A01;
    public boolean A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C53312mt r7 = (C53312mt) obj;
            if (!(r7.A03.equals(this.A03) && r7.A00 == this.A00 && r7.A04 == this.A04 && AnonymousClass75J.A00(r7.A01, this.A01) && r7.A02 == this.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A03;
        AnonymousClass001.A1Q(objArr, this.A00);
        AnonymousClass001.A1S(objArr, this.A04);
        objArr[3] = this.A01;
        return C18310x6.A08(Boolean.valueOf(this.A02), objArr, 4);
    }

    public C53312mt(GroupJid groupJid, String str, long j, boolean z) {
        this.A03 = str;
        this.A00 = j;
        this.A04 = z;
        this.A01 = groupJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("JoinableCallLog[callId=");
        A0o.append(this.A03);
        A0o.append(", callLogRowId=");
        A0o.append(this.A00);
        A0o.append(", videoCall=");
        A0o.append(this.A04);
        A0o.append(", groupJid=");
        A0o.append(this.A01);
        A0o.append(", needsCommit=");
        A0o.append(this.A02);
        return AnonymousClass000.A0f(A0o);
    }
}
