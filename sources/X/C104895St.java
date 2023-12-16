package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.5St  reason: invalid class name and case insensitive filesystem */
public final class C104895St {
    public final AnonymousClass31A A00;
    public final GroupJid A01;
    public final AnonymousClass4GQ A02;
    public final AnonymousClass4GQ A03;
    public final boolean A04;
    public final boolean A05;

    public C104895St(AnonymousClass31A r2, GroupJid groupJid, AnonymousClass4GQ r4, AnonymousClass4GQ r5, boolean z, boolean z2) {
        AnonymousClass0x2.A1A(r4, 4, r5);
        this.A00 = r2;
        this.A01 = groupJid;
        this.A05 = z;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104895St) {
                C104895St r5 = (C104895St) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A05 != r5.A05 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A02, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A01, C18300x5.A04(this.A00)), this.A05))), this.A04);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParentViewItemUiState(chatInfo=");
        A0o.append(this.A00);
        A0o.append(", parentJid=");
        A0o.append(this.A01);
        A0o.append(", isSuspended=");
        A0o.append(this.A05);
        A0o.append(", onClick=");
        A0o.append(this.A02);
        A0o.append(", onLongClick=");
        A0o.append(this.A03);
        A0o.append(", isSelected=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
