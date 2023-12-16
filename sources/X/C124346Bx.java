package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6Bx  reason: invalid class name and case insensitive filesystem */
public class C124346Bx implements C834048g, AnonymousClass4GQ {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C124346Bx(AnonymousClass5Y9 r1, UserJid userJid, int i, int i2, int i3, boolean z) {
        this.A05 = i3;
        this.A02 = r1;
        this.A03 = userJid;
        if (i3 != 0) {
            this.A00 = i;
            this.A01 = i2;
            this.A04 = z;
            return;
        }
        this.A04 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        if (this.A05 != 0) {
            AnonymousClass5Y9 r9 = (AnonymousClass5Y9) this.A02;
            UserJid userJid = (UserJid) this.A03;
            int i = this.A00;
            int i2 = this.A01;
            boolean z = this.A04;
            C52332lJ r3 = (C52332lJ) obj2;
            C105405Uu r4 = r9.A0C;
            C148047Gs A032 = r4.A03(userJid);
            if (A032 == null) {
                str2 = null;
            } else {
                str2 = A032.A00;
            }
            C148047Gs A033 = r4.A03(userJid);
            if ((A033 == null || A033.A01) && !r9.A01) {
                r9.A01 = true;
                C52332lJ r11 = r3;
                UserJid userJid2 = userJid;
                String str3 = r9.A0D.A02;
                String str4 = str2;
                AnonymousClass7PS r10 = new AnonymousClass7PS(r11, C135206kI.A00, userJid2, str3, str4, i, i, i2);
                AnonymousClass5PW r12 = new AnonymousClass5PW(new AnonymousClass7MX(r9, userJid, str2, z), r9);
                AnonymousClass5UJ r7 = r9.A0F;
                if (r7.A00.A0a(r10.A05) || !r9.A0K.A0X(1327)) {
                    C105255Ue r8 = r9.A0N;
                    AnonymousClass31C r72 = r9.A0M;
                    C59082wK r6 = new C59082wK(new C106665Zw(0));
                    C40082El r5 = r9.A0H;
                    C29441ip r32 = r9.A0J;
                    C90234gw r92 = new C90234gw(r9.A0A, r12, r10, r6, r5, r32, r9.A0K, r9.A0L, r72, r8, r9.A0O);
                    if (!r92.A04.A0F()) {
                        r92.A00.A01(r92.A01, -1);
                    } else {
                        C90244gx.A00(r92.A01, r92);
                    }
                } else {
                    AnonymousClass5P8 r82 = r7.A01;
                    C105255Ue r62 = r82.A0D;
                    AnonymousClass31C r112 = r82.A0C;
                    C59082wK r102 = new C59082wK(new C106665Zw(0));
                    C40082El r93 = r82.A08;
                    C29441ip r52 = r82.A09;
                    C620433g r2 = r82.A01;
                    C105915Wx r1 = r82.A0B;
                    C104705Sa r0 = r82.A0H;
                    AnonymousClass1VX r33 = r82.A0A;
                    C90234gw r19 = new C90234gw(r2, r12, r10, r102, r93, r52, r33, r1, r112, r62, r0);
                    C59012wB r14 = r82.A04;
                    AnonymousClass4FS r22 = r82.A0I;
                    AnonymousClass7RW r13 = r82.A03;
                    AnonymousClass7MY r15 = new AnonymousClass7MY(r13, r14);
                    AnonymousClass2PW r16 = r82.A06;
                    AnonymousClass7IB A002 = r82.A00();
                    AnonymousClass2U6 r17 = r82.A07;
                    AnonymousClass7PS r18 = r10;
                    AnonymousClass2PW r162 = r16;
                    r7.A03(new C90444hK(r12, r13, r14, r15, r162, r17, r18, r19, r52, r33, r62, A002, r22));
                }
            }
        } else {
            AnonymousClass5Y9 r23 = (AnonymousClass5Y9) this.A02;
            UserJid userJid3 = (UserJid) this.A03;
            boolean z2 = this.A04;
            int i3 = this.A00;
            int i4 = this.A01;
            C52332lJ r34 = (C52332lJ) obj2;
            C105405Uu r42 = r23.A0C;
            C148047Gs A042 = r42.A04(userJid3);
            if (A042 == null) {
                str = null;
            } else {
                str = A042.A00;
            }
            C148047Gs A043 = r42.A04(userJid3);
            if ((A043 == null || A043.A01) && !r23.A02) {
                r23.A02 = true;
                if (z2) {
                    C86654Ky.A1H(r23.A05);
                }
                C160157n8 r43 = new C160157n8(userJid3, str, r23.A0D.A02, i3, i4, i4);
                r43.A01 = r34;
                r23.A03(new C111815ij(r23, userJid3, str, z2), r43);
            }
        }
        return C59022wD.A00;
    }
}
