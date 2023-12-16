package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.AbstractCollection;

/* renamed from: X.9VC  reason: invalid class name */
public class AnonymousClass9VC {
    public static final AnonymousClass8OQ A0D;
    public static final C129526aS A0E;
    public static final C129526aS A0F;
    public static final C129526aS A0G;
    public final AnonymousClass5ZU A00;
    public final C620733j A01;
    public final C66473Lo A02;
    public final AnonymousClass36F A03;
    public final C85204Fi A04;
    public final AnonymousClass9U5 A05;
    public final C153087ae A06;
    public final C194389Sr A07;
    public final AnonymousClass9TZ A08;
    public final C160757oG A09;
    public final AnonymousClass9DA A0A;
    public final AnonymousClass9NT A0B;
    public final AnonymousClass4FS A0C;

    static {
        C129496aP r1 = new C129496aP();
        A00(r1, 404);
        A00(r1, 440);
        A00(r1, 442);
        A00(r1, 443);
        C129526aS build = r1.build();
        A0F = build;
        C129496aP r12 = new C129496aP();
        r12.addAll(build);
        r12.add((Object) 11502);
        r12.add((Object) 17010);
        A00(r12, 11455);
        A00(r12, 11466);
        A00(r12, 4002);
        A00(r12, 11481);
        A00(r12, 11478);
        A00(r12, 11480);
        A00(r12, 11465);
        A00(r12, 11479);
        A00(r12, 12750);
        A00(r12, 20951);
        C129526aS build2 = r12.build();
        A0G = build2;
        C129496aP r13 = new C129496aP();
        r13.addAll(build);
        r13.add((Object) 11502);
        r13.add((Object) 17010);
        A00(r13, 11503);
        A00(r13, 11495);
        C129526aS build3 = r13.build();
        A0E = build3;
        C160667o6 r14 = new C160667o6();
        r14.put("pay-precheck", build2);
        r14.put("upi-accept-collect", build3);
        A0D = r14.build();
    }

    public AnonymousClass9VC(AnonymousClass5ZU r2, C620733j r3, C66473Lo r4, AnonymousClass36F r5, AnonymousClass9U5 r6, C153087ae r7, C194389Sr r8, AnonymousClass9TZ r9, C160757oG r10, AnonymousClass9DA r11, AnonymousClass9NT r12, AnonymousClass4FS r13) {
        C85204Fi r0 = AnonymousClass1S3.A05;
        this.A0A = r11;
        this.A0C = r13;
        this.A00 = r2;
        this.A01 = r3;
        this.A09 = r10;
        this.A04 = r0;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        this.A03 = r5;
        this.A02 = r4;
        this.A0B = r12;
    }

    public void A01(Context context, AnonymousClass34V r14, C193579Pe r15, String str) {
        C160757oG r2;
        StringBuilder sb;
        String str2;
        int i;
        Object[] objArr;
        AnonymousClass9NT r1;
        String str3;
        int i2;
        AnonymousClass39Q r22;
        String str4 = str;
        Object obj = A0D.get(str4);
        C626936e.A06(obj);
        if (C86624Kv.A1a((AbstractCollection) obj, r14.A00)) {
            AnonymousClass9DA r6 = this.A0A;
            if (!C196719bd.A02(r6, str4, r14.A00, false)) {
                int i3 = r14.A00;
                if (i3 != 4002) {
                    if (i3 != 11455) {
                        if (i3 == 11495) {
                            C160757oG r23 = this.A09;
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("collect request expired; showErrorAndFinish; error code: ");
                            C1899593h.A1K(r23, A0o, i3);
                            this.A0C.BkM(new C200199hw(this, r15));
                            C153087ae r12 = this.A06;
                            if (r12.A01() == null || (r22 = r15.A00) == null) {
                                str3 = r6.getString(R.string.f11nameremoved);
                            } else {
                                str3 = r12.A01().B3V(this.A01, r22);
                            }
                            r1 = this.A0B;
                            i = R.string.f11nameremoved;
                            objArr = new Object[2];
                            i2 = r15.A04;
                            objArr[0] = i2;
                            objArr[1] = str3;
                            r1.A00.A8A(new AnonymousClass9VW(i), String.valueOf(r14.A00), objArr);
                            return;
                        } else if (i3 == 12750) {
                            C160757oG r24 = this.A09;
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("request has been cancelled; showErrorAndFinish; error code: ");
                            C1899593h.A1K(r24, A0o2, i3);
                            String str5 = r15.A02;
                            UserJid userJid = r15.A01;
                            if (userJid != null) {
                                str5 = this.A00.A0H(this.A02.A01(userJid));
                            }
                            r1 = this.A0B;
                            i = R.string.f11nameremoved;
                            objArr = new Object[]{str5};
                            r1.A00.A8A(new AnonymousClass9VW(i), String.valueOf(r14.A00), objArr);
                            return;
                        } else if (i3 == 17010) {
                            C621433s.A01(r6, 26);
                            return;
                        } else if (i3 != 20951) {
                            if (i3 != 11465) {
                                if (i3 != 11466) {
                                    if (i3 != 11502) {
                                        if (i3 != 11503) {
                                            switch (i3) {
                                                case 11478:
                                                case 11480:
                                                case 11481:
                                                    break;
                                                case 11479:
                                                    break;
                                                default:
                                                    return;
                                            }
                                        } else {
                                            String A002 = this.A08.A00(i3);
                                            AnonymousClass9NT r5 = this.A0B;
                                            String valueOf = String.valueOf(r14.A00);
                                            r5.A00.A8A(new AnonymousClass9VW(R.string.f11nameremoved, A002), valueOf, new Object[0]);
                                            return;
                                        }
                                    }
                                }
                            }
                            this.A07.A00(context, r15.A01, (C153607bd) null, (C203339nX) null, (Boolean) null);
                            r2 = this.A09;
                            sb = AnonymousClass001.A0o();
                            str2 = "invalid receiver vpa; showErrorAndFinish; error code: ";
                            sb.append(str2);
                            sb.append(i3);
                        } else {
                            Bundle A082 = AnonymousClass002.A08();
                            A082.putInt("error_code", i3);
                            C621433s.A02(r6, A082, 33);
                            return;
                        }
                    }
                    this.A09.A06("sender max transactions or max amount per day limit; showErrorAndFinish");
                    str3 = this.A04.B3W(this.A01, new BigDecimal(100000));
                    r1 = this.A0B;
                    i = R.string.f11nameremoved;
                    objArr = new Object[2];
                    i2 = 10;
                    objArr[0] = i2;
                    objArr[1] = str3;
                    r1.A00.A8A(new AnonymousClass9VW(i), String.valueOf(r14.A00), objArr);
                    return;
                }
                this.A05.A08((AnonymousClass4EY) null);
                r2 = this.A09;
                sb = AnonymousClass001.A0o();
                str2 = "invalid sender vpa; showErrorAndFinish; get-methods; error code: ";
                sb.append(str2);
                sb.append(i3);
            } else {
                return;
            }
        } else {
            r2 = this.A09;
            sb = AnonymousClass000.A0l(str4);
            sb.append(" error; showErrorAndFinish; error code: ");
            sb.append(r14);
        }
        C1899593h.A1F(r2, sb);
        this.A0B.A00.A85(r14);
    }

    public static void A00(C129496aP r1, int i) {
        r1.add((Object) Integer.valueOf(i));
    }
}
