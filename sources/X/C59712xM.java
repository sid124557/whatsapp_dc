package X;

import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.2xM  reason: invalid class name and case insensitive filesystem */
public final class C59712xM {
    public C51422jn A00;
    public Set A01 = AnonymousClass002.A0K();
    public final AnonymousClass4FI A02 = new AnonymousClass4IC(this, 4);
    public final C28891hw A03;
    public final AnonymousClass107 A04;
    public final AnonymousClass107 A05;
    public final AnonymousClass4GQ A06;

    public C59712xM(C28891hw r4, AnonymousClass4GQ r5) {
        C162457s7.A0J(r4, 1);
        this.A03 = r4;
        this.A06 = r5;
        C51422jn r1 = new C51422jn(AnonymousClass002.A0K(), new AnonymousClass27G(this, 1));
        this.A00 = r1;
        AnonymousClass107 r0 = new AnonymousClass107(r1);
        this.A05 = r0;
        this.A04 = r0;
    }

    public static final /* synthetic */ void A00(C59712xM r3) {
        if (!r3.A00.A00.isEmpty()) {
            C51422jn r1 = new C51422jn(AnonymousClass0x9.A17(), r3.A00.A01);
            r3.A00 = r1;
            r3.A05.A0G(r1);
        }
    }

    public final void A01(GroupJid groupJid) {
        Set set = this.A00.A00;
        if (set.contains(groupJid)) {
            set.remove(groupJid);
        } else {
            set.add(groupJid);
        }
        C51422jn r1 = new C51422jn(set, this.A00.A01);
        this.A00 = r1;
        this.A05.A0G(r1);
    }
}
