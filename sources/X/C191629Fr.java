package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Fr  reason: invalid class name and case insensitive filesystem */
public class C191629Fr extends AnonymousClass9H3 {
    public final /* synthetic */ AnonymousClass94y A00;

    public C193629Pj A0G() {
        C624034w r3;
        C30791n7 r5;
        int i;
        UserJid userJid;
        int i2;
        Context context;
        int i3;
        AnonymousClass94y r8 = this.A00;
        AnonymousClass2z0 r4 = r8.A07;
        C626936e.A06(r4);
        C95814uZ r32 = r4.A00;
        C133726hq r2 = null;
        if (r32 != null) {
            r5 = r8.A0R.A00(r4.A01);
            if (r5 != null) {
                AnonymousClass39W r0 = r5.A00;
                C626936e.A06(r0);
                AnonymousClass39S r7 = r0.A01;
                C626936e.A06(r7);
                AnonymousClass39G r1 = r7.A09;
                C60042xu r22 = new C60042xu();
                C626936e.A06(r7);
                C85204Fi r10 = r7.A06;
                r22.A02 = r10;
                C626936e.A06(r1);
                r22.A00 = r1.A00;
                C626936e.A06(r1);
                r22.A01 = r1.A01;
                AnonymousClass39L A01 = r22.A01();
                UserJid A0o = r5.A0o();
                C626936e.A06(A0o);
                boolean z = r4.A02;
                if (z) {
                    i = 200;
                    userJid = (UserJid) r32;
                } else {
                    i = 100;
                    userJid = A0o;
                    A0o = (UserJid) r32;
                }
                C626936e.A06(r10);
                AnonymousClass3H6 r12 = (AnonymousClass3H6) r10;
                String str = r12.A04;
                BigDecimal bigDecimal = A01.A02.A00;
                C626936e.A06(r7);
                long j = r7.A00 * 1000;
                String str2 = r7.A02;
                String str3 = "confirm";
                if (str3.equals(str2)) {
                    boolean equals = "captured".equals(r7.A03);
                    if (z) {
                        i2 = 903;
                        if (equals) {
                            i2 = 904;
                        }
                    } else {
                        i2 = 803;
                        if (equals) {
                            i2 = 804;
                        }
                    }
                } else if ("payment_instruction".equals(str2)) {
                    boolean equals2 = "captured".equals(r7.A03);
                    if (z) {
                        i2 = 901;
                        if (equals2) {
                            i2 = 902;
                        }
                    } else {
                        i2 = 801;
                        if (equals2) {
                            i2 = 802;
                        }
                    }
                } else if ("pix".equals(str2)) {
                    boolean equals3 = "captured".equals(r7.A03);
                    if (z) {
                        i2 = 905;
                        if (equals3) {
                            i2 = 906;
                        }
                    } else {
                        i2 = 907;
                        if (equals3) {
                            i2 = 908;
                        }
                    }
                } else {
                    i2 = 401;
                    if (z) {
                        i2 = 101;
                    }
                }
                String str4 = str;
                C85204Fi r14 = r10;
                AnonymousClass39Q r15 = new AnonymousClass39Q(bigDecimal, r12.A01);
                r3 = new C624034w(r14, r15, userJid, A0o, str4, (String) null, (String) null, (String) null, (String) null, (String) null, "BR", i, i2, 1, 0, 0, j, j);
                r3.A0R = null;
                r3.A0F(false);
                r3.A07 = r10;
                AnonymousClass1S4 BG4 = r8.A0D().BG4();
                if (BG4 != null) {
                    r3.A08(new AnonymousClass39U(0, r7.A0E, r5.A1J.A01), BG4);
                }
                C54292oU r23 = r8.A0O;
                String str5 = r7.A02;
                if (str3.equals(str5)) {
                    context = r23.A00;
                    i3 = R.string.f11nameremoved;
                } else {
                    List list = r7.A0I;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str6 = ((AnonymousClass399) it.next()).A00;
                            if (!TextUtils.isEmpty(str6)) {
                                r2 = new C133726hq("payment_instruction", str6);
                                break;
                            }
                        }
                    } else {
                        str3 = "pix";
                        if (str3.equals(str5)) {
                            context = r23.A00;
                            i3 = R.string.f11nameremoved;
                        }
                    }
                    r2 = null;
                }
                r2 = new C133726hq(str3, context.getString(i3));
            } else {
                r3 = null;
            }
        } else {
            r3 = null;
            r5 = null;
        }
        return new C193629Pj(r2, r3, (C624134x) null, r5, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C191629Fr(AnonymousClass94y r1, AnonymousClass2z0 r2, String str, boolean z) {
        super(r1, r2, str, z);
        this.A00 = r1;
    }
}
