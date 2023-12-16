package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.5UU  reason: invalid class name */
public class AnonymousClass5UU {
    public AnonymousClass3ZH A00;
    public boolean A01;
    public final C009707r A02;
    public final C57012sv A03;
    public final AnonymousClass4FU A04;
    public final C56972sr A05;
    public final C56962sq A06;
    public final AnonymousClass64Q A07;
    public final C56942so A08;
    public final C56422rx A09;
    public final AnonymousClass33p A0A;
    public final C56982ss A0B;
    public final C56892sj A0C;
    public final C55562qY A0D;
    public final C29041iB A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass3LP A0G;
    public final C56572sD A0H;
    public final AnonymousClass4FS A0I;
    public final Runnable A0J;
    public final Runnable A0K;

    public SpannableStringBuilder A00(String str) {
        Spanned A0B2 = AnonymousClass0x9.A0B(str);
        SpannableStringBuilder A002 = C18330xA.A00(A0B2);
        URLSpan[] A1b = C86624Kv.A1b(A0B2);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = A002.getSpanStart(uRLSpan);
                    int spanEnd = A002.getSpanEnd(uRLSpan);
                    int spanFlags = A002.getSpanFlags(uRLSpan);
                    A002.removeSpan(uRLSpan);
                    A002.setSpan(new C88904az(this.A02, this), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A002;
    }

    public final String A01(int i) {
        AnonymousClass3ZH r0 = this.A00;
        if (r0 != null) {
            Class<C27991fJ> cls = C27991fJ.class;
            if (r0.A0I(cls) != null) {
                if (i == 0) {
                    return "group_spam_banner_report";
                }
                AnonymousClass3ZH r02 = this.A00;
                if (r02 == null) {
                    Log.e("Contact is unexpected null");
                    return "left_group_spam_banner_report";
                }
                GroupJid groupJid = (GroupJid) r02.A0I(cls);
                if (groupJid == null || !this.A0C.A0C(groupJid)) {
                    return "left_group_spam_banner_report";
                }
            }
        }
        return null;
    }

    public void A02() {
        C95814uZ A0a = C86604Kt.A0a(this.A00);
        if (C57362tW.A00(this.A0G, A0a)) {
            C18270x1.A0l(C18270x1.A03(this.A0A), "wac_consent_shown", true);
        } else {
            C56572sD r2 = this.A0H;
            r2.A02(A0a, C18290x4.A0b(), this.A01);
            r2.A07(A0a, 1);
        }
        this.A0K.run();
    }

    public void A03(int i) {
        String str;
        boolean z;
        boolean z2;
        boolean A1U;
        C009707r r4;
        UserJid A0d = C86604Kt.A0d(this.A00);
        AnonymousClass3LP r1 = this.A0G;
        AnonymousClass3ZH r0 = this.A00;
        if (r0 == null || !C86624Kv.A1X(r0, r1)) {
            C56962sq r3 = this.A06;
            String str2 = "1_1_spam_banner_block";
            str = "biz_spam_banner_block";
            z = false;
            z2 = true;
            if (!r3.A0P(A0d)) {
                this.A0H.A02(A0d, C18290x4.A0a(), this.A01);
                if (this.A00.A0R()) {
                    A1U = AnonymousClass000.A1U(i, 1);
                    r4 = this.A02;
                    if (this.A01) {
                        str = "triggered_block";
                    }
                } else {
                    if (i != 1) {
                        str2 = "1_1_old_spam_banner_block";
                    }
                    AnonymousClass64Q r12 = this.A07;
                    if (this.A01) {
                        str2 = "triggered_block";
                    }
                    C103835Op Azw = r12.Azw(A0d, str2);
                    AnonymousClass1VX r13 = Azw.A06;
                    if (!r13.A0X(6187)) {
                        Azw.A02 = true;
                    }
                    Azw.A04 = true;
                    Azw.A05 = false;
                    Azw.A01(1, 1);
                    if (i == 1 && !r13.A0X(6185)) {
                        Azw.A03 = true;
                    }
                    this.A04.Boo(C103835Op.A00(Azw));
                    return;
                }
            } else {
                if (this.A00.A0R()) {
                    str2 = str;
                } else if (i != 1) {
                    str2 = "1_1_old_spam_banner_block";
                }
                r3.A0F(this.A02, this.A00, str2, false);
                return;
            }
        } else {
            r4 = this.A02;
            str = "psa_banner_block";
            if (this.A01) {
                str = "triggered_block";
            }
            z = false;
            z2 = false;
            A1U = false;
        }
        r4.startActivityForResult(C627736r.A0m(r4, A0d, str, z, z2, A1U, z, z), 902);
    }

    public void A04(int i) {
        C27991fJ A022 = AnonymousClass34R.A02(AnonymousClass3ZH.A05(this.A00, C95814uZ.class));
        this.A04.BpA(0, R.string.f11nameremoved);
        AnonymousClass4FS r1 = this.A0I;
        C009707r r5 = this.A02;
        C55562qY r7 = this.A0D;
        r1.BkL(new C991754s(new C110405gB(this, A022, i), r5, this.A08, r7, Collections.singleton(A022)), new Object[0]);
    }

    public void A05(int i) {
        String str;
        C95814uZ A0a = C86604Kt.A0a(this.A00);
        if (A0a instanceof C27991fJ) {
            str = A01(i);
            C626936e.A06(str);
        } else {
            str = "1_1_spam_banner_report";
        }
        C56572sD r2 = this.A0H;
        r2.A02(A0a, C18280x3.A0S(), this.A01);
        r2.A07(A0a, -2);
        this.A0E.A08().A03(new C116435qH(this, A0a, str));
    }

    public AnonymousClass5UU(C009707r r2, C57012sv r3, AnonymousClass4FU r4, C56972sr r5, C56962sq r6, AnonymousClass64Q r7, C56942so r8, C56422rx r9, AnonymousClass33p r10, C56982ss r11, C56892sj r12, C55562qY r13, C29041iB r14, AnonymousClass1VX r15, AnonymousClass3LP r16, C56572sD r17, AnonymousClass4FS r18, Runnable runnable, Runnable runnable2) {
        this.A0F = r15;
        this.A05 = r5;
        this.A0I = r18;
        this.A03 = r3;
        this.A0B = r11;
        this.A02 = r2;
        this.A0H = r17;
        this.A0G = r16;
        this.A06 = r6;
        this.A0D = r13;
        this.A09 = r9;
        this.A0A = r10;
        this.A08 = r8;
        this.A0E = r14;
        this.A0C = r12;
        this.A07 = r7;
        this.A04 = r4;
        this.A0J = runnable;
        this.A0K = runnable2;
    }
}
