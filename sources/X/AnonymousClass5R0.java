package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;

/* renamed from: X.5R0  reason: invalid class name */
public class AnonymousClass5R0 {
    public final C69263Wi A00;
    public final C66663Mh A01;
    public final C29441ip A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final C620733j A05;
    public final C56982ss A06;
    public final C28891hw A07;
    public final C56892sj A08;
    public final AnonymousClass1VX A09;
    public final C66493Lq A0A;
    public final C66503Lr A0B;
    public final AnonymousClass33S A0C;

    public void A00(C89654ea r4, C95814uZ r5) {
        C48742fO r0;
        C56982ss r2 = this.A06;
        C626936e.A06(r5);
        AnonymousClass31A A002 = C56982ss.A00(r2, r5);
        if (A002 == null || (r0 = A002.A0e) == null || r0.A00 != 1) {
            C626936e.A06(r5);
            AnonymousClass31A A003 = C56982ss.A00(r2, r5);
            if (A003 == null || !TextUtils.isEmpty(A003.A07()) || !this.A09.A0X(3011)) {
                r4.startActivity(C627736r.A0P(r4, r5));
            } else {
                AnonymousClass5B6.A00(r4, 2, R.string.f11nameremoved);
            }
        } else {
            r4.Boo(InviteLinkUnavailableDialogFragment.A00(false, true));
        }
    }

    public void A01(C89654ea r32, C95814uZ r33, String str) {
        AnonymousClass1VX r15 = this.A09;
        C95814uZ r14 = r33;
        C69263Wi r11 = this.A00;
        AnonymousClass33S r10 = this.A0C;
        C66663Mh r9 = this.A01;
        C620733j r8 = this.A05;
        AnonymousClass5ZU r7 = this.A04;
        C64773Ex r6 = this.A03;
        C66493Lq r5 = this.A0A;
        C66503Lr r4 = this.A0B;
        C29441ip r3 = this.A02;
        C28891hw r2 = this.A07;
        C89654ea r17 = r32;
        C56892sj r25 = this.A08;
        AnonymousClass1VX r26 = r15;
        C620733j r23 = r8;
        C28891hw r24 = r2;
        C64773Ex r21 = r6;
        AnonymousClass5ZU r22 = r7;
        C66663Mh r19 = r9;
        C29441ip r20 = r3;
        C69263Wi r18 = r11;
        AnonymousClass5TS r152 = new AnonymousClass5TS((View) null, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r5, r4, (C27991fJ) r14, r10);
        r152.A00 = new C114565nF(r17, this, r14);
        r152.A00(str);
    }

    public AnonymousClass5R0(C69263Wi r1, C66663Mh r2, C29441ip r3, C64773Ex r4, AnonymousClass5ZU r5, C620733j r6, C56982ss r7, C28891hw r8, C56892sj r9, AnonymousClass1VX r10, C66493Lq r11, C66503Lr r12, AnonymousClass33S r13) {
        this.A09 = r10;
        this.A00 = r1;
        this.A06 = r7;
        this.A0C = r13;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A0A = r11;
        this.A0B = r12;
        this.A07 = r8;
        this.A08 = r9;
        this.A02 = r3;
    }
}
