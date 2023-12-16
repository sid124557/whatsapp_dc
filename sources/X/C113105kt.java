package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.5kt  reason: invalid class name and case insensitive filesystem */
public class C113105kt implements C182278o9 {
    public final View A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final C105365Uq A05;
    public final AnonymousClass5RC A06;
    public final C113895mA A07;
    public final AnonymousClass33p A08;
    public final C620733j A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FS A0B;
    public final C183538qC A0C;
    public final WeakReference A0D;

    public void BYC(int i) {
        C113895mA r0 = this.A07;
        C30721mu A012 = r0.A01();
        C116095pj A002 = r0.A00();
        if (A002 != null && A012 != null) {
            this.A0B.BkM(new C117335rl(this, A012, 0, i, A002.A0U));
        }
    }

    public C113105kt(Activity activity, View view, C69263Wi r4, C56972sr r5, C64773Ex r6, AnonymousClass5ZU r7, C105365Uq r8, AnonymousClass5RC r9, C113895mA r10, AnonymousClass33p r11, C620733j r12, AnonymousClass1VX r13, AnonymousClass4FS r14, C183538qC r15) {
        this.A0A = r13;
        this.A00 = view;
        this.A06 = r9;
        this.A07 = r10;
        this.A0C = r15;
        this.A01 = r4;
        this.A0D = AnonymousClass0x9.A14(activity);
        this.A09 = r12;
        this.A05 = r8;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A0B = r14;
        this.A08 = r11;
    }
}
