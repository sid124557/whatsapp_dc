package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1ou  reason: invalid class name and case insensitive filesystem */
public final class C31821ou extends C31881p0 {
    public C31821ou(AnonymousClass2z0 r7, long j) {
        super(r7, (AnonymousClass39T) null, 107, j);
    }

    public final void A20(GroupJid groupJid, String str) {
        if (groupJid != null) {
            if (A1z(1).size() > 0) {
                C626936e.A0D(false, "FMessageSystemParentGroupNameChanged/setNewParentInfo/parent info should only be set once");
            }
            C52662lq.A01(groupJid, str, this.A00, 1);
        }
    }
}
