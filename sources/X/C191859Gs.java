package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.9Gs  reason: invalid class name and case insensitive filesystem */
public class C191859Gs extends AnonymousClass5ZM {
    public final C95814uZ A00;
    public final UserJid A01;
    public final AnonymousClass2z0 A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final String A06;
    public final WeakReference A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return AnonymousClass0x9.A0G(Boolean.valueOf(!((C29041iB) this.A04.get()).A0D().isEmpty()), ((C55832qz) this.A05.get()).A05(this.A02));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r8 = (AnonymousClass0PJ) obj;
        boolean A1Z = AnonymousClass001.A1Z(r8.A00);
        C624134x r5 = (C624134x) r8.A01;
        AnonymousClass4FU r4 = (AnonymousClass4FU) this.A07.get();
        if (r4 != null) {
            AnonymousClass5XI r1 = new AnonymousClass5XI((AnonymousClass1VX) this.A03.get(), this.A00, this.A06, A1Z);
            r1.A05 = false;
            r1.A07 = false;
            r1.A01 = this.A01;
            r1.A03 = new C197789ds(this);
            if (r5 != null) {
                r1.A02 = r5.A1J;
            }
            r4.Boo(r1.A00());
        }
    }

    public C191859Gs(AnonymousClass4FU r2, C95814uZ r3, UserJid userJid, AnonymousClass2z0 r5, C183538qC r6, C183538qC r7, C183538qC r8, String str) {
        this.A07 = AnonymousClass0x9.A14(r2);
        this.A05 = r7;
        this.A03 = r6;
        this.A04 = r8;
        this.A00 = r3;
        this.A06 = str;
        this.A01 = userJid;
        this.A02 = r5;
    }
}
