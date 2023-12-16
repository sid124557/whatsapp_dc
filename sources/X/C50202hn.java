package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.2hn  reason: invalid class name and case insensitive filesystem */
public class C50202hn {
    public final C64773Ex A00;
    public final C22931Qq A01;
    public final AnonymousClass2KN A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;
    public final AnonymousClass2WM A05;
    public final AnonymousClass4FS A06;
    public final HashMap A07;

    public final C60782z9 A00(UserJid userJid) {
        HashMap hashMap = this.A07;
        C60782z9 r1 = (C60782z9) hashMap.get(userJid);
        if (r1 != null) {
            return r1;
        }
        C60782z9 r12 = new C60782z9(AnonymousClass002.A0K());
        hashMap.put(userJid, r12);
        return r12;
    }

    public final void A01(UserJid userJid, int i) {
        if (userJid != null) {
            C60782z9 A002 = A00(userJid);
            if ((this.A01.A00(userJid) instanceof C22891Qm) && this.A03.A0Y(C58422vE.A02, 1681)) {
                HashSet A0K = AnonymousClass002.A0K();
                C18270x1.A1K(A0K, 5);
                Integer A0j = AnonymousClass0x9.A0j();
                A0K.add(A0j);
                C18270x1.A1K(A0K, 14);
                A0K.add(17);
                A0K.add(17);
                C18270x1.A1K(A0K, 16);
                C18270x1.A1K(A0K, 18);
                Integer valueOf = Integer.valueOf(i);
                if (A0K.contains(valueOf)) {
                    HashSet hashSet = A002.A03;
                    if (i == 16) {
                        hashSet.add(A0j);
                    }
                    if (!hashSet.add(valueOf)) {
                        return;
                    }
                }
                this.A06.BkM(new C71433c6(this, A002, userJid, i));
            }
        }
    }

    public C50202hn(C64773Ex r2, C22931Qq r3, AnonymousClass2KN r4, AnonymousClass1VX r5, AnonymousClass4FV r6, AnonymousClass2WM r7, AnonymousClass4FS r8, HashMap hashMap) {
        C18260x0.A0V(r5, r6, r3);
        C162457s7.A0J(r2, 6);
        C162457s7.A0J(r8, 8);
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = hashMap;
        this.A00 = r2;
        this.A05 = r7;
        this.A06 = r8;
    }
}
