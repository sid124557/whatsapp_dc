package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2dK  reason: invalid class name and case insensitive filesystem */
public class C47482dK {
    public final C56972sr A00;
    public final AnonymousClass36E A01;
    public final C42712Pf A02;
    public final AnonymousClass314 A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;
    public final C621133n A06;
    public final C48972fm A07;
    public final C614730x A08;
    public final C66543Lv A09;
    public final C56892sj A0A;
    public final C56832sd A0B;
    public final AnonymousClass4FS A0C;

    public C47482dK(C56972sr r1, AnonymousClass36E r2, C42712Pf r3, AnonymousClass314 r4, C56612sH r5, AnonymousClass33p r6, C621133n r7, C48972fm r8, C614730x r9, C66543Lv r10, C56892sj r11, C56832sd r12, AnonymousClass4FS r13) {
        this.A04 = r5;
        this.A00 = r1;
        this.A0C = r13;
        this.A08 = r9;
        this.A01 = r2;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A0B = r12;
        this.A0A = r11;
        this.A02 = r3;
    }

    public final Set A00(UserJid userJid) {
        Set A0B2;
        Set<C28011fL> A0B3;
        HashSet A0K = AnonymousClass002.A0K();
        C56972sr r2 = this.A00;
        PhoneUserJid A052 = C56972sr.A05(r2);
        if (r2.A0a(A052)) {
            A0B2 = AnonymousClass0x9.A15(this.A03.A07());
        } else {
            A0B2 = this.A0A.A09.A0B(A052);
        }
        if (r2.A0a(userJid)) {
            A0B3 = AnonymousClass0x9.A15(this.A03.A07());
        } else {
            A0B3 = this.A0A.A09.A0B(userJid);
        }
        for (C28011fL r5 : A0B3) {
            if (A0B2.contains(r5)) {
                C129526aS A022 = C56892sj.A01(this.A0A, r5).A02();
                if (A022.contains(userJid) && (A022.contains(C56972sr.A04(r2)) || A022.contains(r2.A0H()) || (r5 instanceof AnonymousClass1fS))) {
                    A0K.add(r5);
                }
            }
        }
        return A0K;
    }
}
