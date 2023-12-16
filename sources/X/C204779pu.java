package X;

import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9pu  reason: invalid class name and case insensitive filesystem */
public class C204779pu implements C202499m7 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C204779pu(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void BaS(UserJid userJid, C166557yt r8, C166557yt r9, C166557yt r10, AnonymousClass34V r11, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass94y r2;
        C191619Fq r1;
        AnonymousClass9QJ A002;
        String str4;
        AnonymousClass94y r22;
        AnonymousClass9QJ r12;
        AnonymousClass4UC r13;
        AnonymousClass9QJ A003;
        String A004;
        int i = this.A03;
        Object obj = this.A00;
        boolean z6 = z3;
        if (i != 0) {
            AnonymousClass94y r23 = (AnonymousClass94y) obj;
            C191509Fe r14 = (C191509Fe) this.A01;
            String str5 = this.A02;
            r14.A01 = 0;
            r14.A02 = 8;
            AnonymousClass08M r15 = r23.A02;
            r15.A0H(r15.A07());
            if (r11 != null || !z) {
                C1899593h.A1G(r23.A0f, r11, "viewContactInfo error: ", AnonymousClass001.A0o());
                if (r11 == null || (A004 = r23.A0d.A00(r11.A00)) == null) {
                    r13 = r23.A08;
                    A003 = AnonymousClass9QJ.A00(6);
                } else {
                    A003 = AnonymousClass9QJ.A00(8);
                    A003.A0C = A004;
                    r13 = r23.A08;
                }
                r13.A0H(A003);
                return;
            } else if (userJid != null) {
                C160757oG r3 = r23.A0f;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("viewContactInfo jid: ");
                A0o.append(userJid);
                A0o.append(" blocked: ");
                C1899593h.A1L(r3, A0o, z6);
                C56962sq r16 = r23.A0K;
                UserJid A032 = AnonymousClass32Y.A03(userJid);
                C626936e.A06(A032);
                if (z6 != r16.A0P(A032)) {
                    r16.A0K((C46112b6) null);
                }
                AnonymousClass9QJ A005 = AnonymousClass9QJ.A00(4);
                A005.A03 = r23.A0L.A0A(userJid);
                r22 = r23;
                r12 = A005;
            } else {
                AnonymousClass9QJ A006 = AnonymousClass9QJ.A00(5);
                A006.A0F = str5;
                A006.A0E = str;
                r2 = r23;
                r1 = A006;
                r1.A07 = r8;
                r1.A0B = str3;
                r22 = r2;
                r12 = r1;
            }
        } else {
            C191669Fv r24 = (C191669Fv) obj;
            C166557yt r32 = (C166557yt) this.A01;
            String str6 = this.A02;
            C160757oG r4 = r24.A0f;
            r4.A06("IN- HANDLE_SEND_AGAIN vpa valid check response");
            r24.A0c(false);
            if (!z || r11 != null) {
                if (!z3) {
                    if (r11 != null) {
                        r4.A06("IN- HANDLE_SEND_AGAIN error from server");
                        A002 = AnonymousClass9QJ.A00(8);
                        AnonymousClass9VW A04 = r24.A06.A04(r24.A07.A04, r11.A00);
                        if (A04.A00 != 0) {
                            str4 = A04.A02(r24.A0O.A00);
                        } else {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("Unhandled error code : ");
                            r4.A05(AnonymousClass000.A0h(A0o2, r11.A00));
                            str4 = null;
                        }
                        if (TextUtils.isEmpty(str4)) {
                            str4 = r24.A0O.A00.getString(R.string.f11nameremoved);
                        }
                        A002.A0C = str4;
                    } else {
                        r4.A05("Unable to validate the receiver to send payment again");
                        return;
                    }
                }
                r4.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                A002 = AnonymousClass9QJ.A00(13);
                A002.A06 = userJid;
                A002.A0F = str6;
            } else {
                if (!z3) {
                    r4.A06("IN- HANDLE_SEND_AGAIN starting payment");
                    C191619Fq r17 = new C191619Fq(105);
                    r17.A00 = r32;
                    r17.A0E = str;
                    r17.A02 = str2;
                    r2 = r24;
                    r1 = r17;
                    r1.A07 = r8;
                    r1.A0B = str3;
                    r22 = r2;
                    r12 = r1;
                }
                r4.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                A002 = AnonymousClass9QJ.A00(13);
                A002.A06 = userJid;
                A002.A0F = str6;
            }
            AnonymousClass94y.A00(r24, A002);
            return;
        }
        AnonymousClass94y.A00(r22, r12);
    }
}
