package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1ts  reason: invalid class name and case insensitive filesystem */
public final class C33901ts extends AnonymousClass5ZM {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C621033m A01;
    public final AnonymousClass49C A02;
    public final AnonymousClass20K A03;
    public final AnonymousClass30W A04;
    public final AnonymousClass3ZH A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final WeakReference A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Activity activity = (Activity) this.A0A.get();
        if (activity != null) {
            if (this.A0E) {
                this.A04.A04(this.A05, this.A07, (List) null);
            }
            AnonymousClass3ZH r7 = this.A05;
            boolean A0U = r7.A0U();
            AnonymousClass30W r3 = this.A04;
            if (A0U) {
                r3.A03((AnonymousClass4E6) null, r7, true, false);
            } else {
                String str = this.A08;
                Integer num = this.A06;
                String str2 = this.A09;
                AnonymousClass20K r6 = this.A03;
                String str3 = this.A07;
                UserJid userJid = (UserJid) AnonymousClass3ZH.A05(r7, UserJid.class);
                r3.A02.A0E(activity, r6, r7, userJid, num, str, str2, str3);
                r3.A01.A0K(userJid, true);
            }
            this.A01.A0K(AnonymousClass3ZH.A02(r7, C95814uZ.class), this.A0C);
            C89654ea.A4P(this.A00, 300);
        }
        return null;
    }

    public void A0A() {
        WeakReference weakReference = this.A0B;
        if (weakReference.get() != null) {
            ((AnonymousClass4FU) weakReference.get()).BpA(0, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass4FU r0 = (AnonymousClass4FU) this.A0B.get();
        if (r0 != null) {
            r0.BjL();
        }
        AnonymousClass49C r1 = this.A02;
        if (r1 != null) {
            r1.BaR(true);
        }
        Activity activity = (Activity) this.A0A.get();
        if (activity != null && this.A0D) {
            activity.finish();
        }
    }

    public C33901ts(C009707r r3, AnonymousClass4FU r4, C621033m r5, AnonymousClass49C r6, AnonymousClass20K r7, AnonymousClass30W r8, AnonymousClass3ZH r9, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A0D = z;
        this.A0E = z2;
        this.A0A = AnonymousClass0x9.A14(r3);
        this.A0B = AnonymousClass0x9.A14(r4);
        this.A01 = r5;
        this.A04 = r8;
        this.A0C = z3;
        this.A05 = r9;
        this.A08 = str;
        this.A06 = num;
        this.A09 = str2;
        this.A03 = r7;
        this.A07 = str3;
        this.A02 = r6;
    }
}
