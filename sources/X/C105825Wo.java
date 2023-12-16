package X;

import com.whatsapp.jid.GroupJid;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.5Wo  reason: invalid class name and case insensitive filesystem */
public class C105825Wo {
    public int A00;
    public long A01 = -1;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final GroupJid A06;
    public final AnonymousClass3ZF A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final LinkedHashMap A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C105825Wo(GroupJid groupJid, Integer num, String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = str;
        this.A0B = linkedHashMap;
        this.A0D = z;
        this.A06 = groupJid;
        this.A05 = i;
        this.A0E = z2;
        this.A0A = str2;
        this.A0C = z3;
        this.A08 = num;
        this.A02 = str3;
        this.A00 = i2;
        this.A07 = null;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("callId=");
        A0o.append(this.A09);
        A0o.append(" isVideoCall=");
        A0o.append(this.A0D);
        A0o.append(" groupJid=");
        A0o.append(this.A06);
        A0o.append(" jids=[ ");
        Iterator A11 = C18290x4.A11(this.A0B);
        while (A11.hasNext()) {
            A0o.append(A11.next());
            A0o.append(" ");
        }
        A0o.append("]");
        A0o.append(" callLog=");
        A0o.append(this.A07);
        A0o.append(" entryPoint=");
        A0o.append(this.A08);
        A0o.append(" groupPhash=");
        A0o.append(this.A02);
        A0o.append(" offerDelayMs=");
        A0o.append(this.A00);
        A0o.append(" shouldJoinAndAccept=");
        A0o.append(this.A04);
        A0o.append(" mute");
        return C18300x5.A0m(A0o, this.A03);
    }

    public C105825Wo(AnonymousClass3ZF r3, int i, boolean z, boolean z2) {
        this.A09 = C627436k.A07(r3.A0E.A02);
        this.A0B = C18320x8.A0r();
        this.A0D = r3.A0L;
        this.A06 = r3.A05;
        this.A05 = 0;
        this.A0E = false;
        this.A0A = null;
        this.A0C = z2;
        this.A07 = r3;
        this.A08 = Integer.valueOf(i);
        this.A02 = null;
        this.A04 = z;
    }
}
