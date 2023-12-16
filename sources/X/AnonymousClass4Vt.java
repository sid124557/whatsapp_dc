package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4Vt  reason: invalid class name */
public final class AnonymousClass4Vt extends AnonymousClass0QO {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C986652t r2 = (C986652t) this.A01.get(i);
        C986652t r1 = (C986652t) this.A00.get(i2);
        if (!(r2 instanceof C986552s) || !(r1 instanceof C986552s)) {
            return false;
        }
        return C106615Zr.A00.A01((C986552s) r2, (C986552s) r1);
    }

    public boolean A04(int i, int i2) {
        UserJid userJid;
        C986652t r1 = (C986652t) this.A01.get(i);
        C986652t r3 = (C986652t) this.A00.get(i2);
        if (!(r1 instanceof C986552s) || !(r3 instanceof C986552s)) {
            return C162457s7.A0P(r1, r3);
        }
        C986552s r12 = (C986552s) r1;
        C986552s r32 = (C986552s) r3;
        C18260x0.A0O(r12, r32);
        C623534r A002 = r12.A00();
        UserJid userJid2 = null;
        if (A002 != null) {
            userJid = A002.A0A;
        } else {
            userJid = null;
        }
        C623534r A003 = r32.A00();
        if (A003 != null) {
            userJid2 = A003.A0A;
        }
        return C162457s7.A0P(userJid, userJid2);
    }

    public AnonymousClass4Vt(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
