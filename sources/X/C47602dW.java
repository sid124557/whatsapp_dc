package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2dW  reason: invalid class name and case insensitive filesystem */
public final class C47602dW {
    public AnonymousClass0O1 A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final C15540rX A04;
    public final C89654ea A05;
    public final C69263Wi A06;
    public final C29441ip A07;
    public final C64773Ex A08;
    public final C56982ss A09;
    public final C28891hw A0A;
    public final C56892sj A0B;
    public final AnonymousClass1VX A0C;
    public final C66493Lq A0D;
    public final C66503Lr A0E;
    public final C27991fJ A0F;
    public final C27991fJ A0G;
    public final List A0H;
    public final AnonymousClass4GP A0I;
    public final AnonymousClass4GQ A0J;
    public final boolean A0K;

    public C47602dW(Context context, C15540rX r4, C89654ea r5, C69263Wi r6, C29441ip r7, C64773Ex r8, C56982ss r9, C28891hw r10, C56892sj r11, AnonymousClass1VX r12, C66493Lq r13, C66503Lr r14, C27991fJ r15, C27991fJ r16, List list, AnonymousClass4GP r18, AnonymousClass4GQ r19, int i, int i2, boolean z) {
        C18270x1.A11(r5, 3, r15);
        List list2 = list;
        C162457s7.A0J(list2, 6);
        C18260x0.A0h(r11, r7, r13, r12, r10);
        AnonymousClass0x2.A1C(r6, r9);
        C162457s7.A0J(r8, 19);
        C162457s7.A0J(r14, 20);
        this.A04 = r4;
        this.A03 = context;
        this.A05 = r5;
        this.A0F = r15;
        this.A0G = r16;
        this.A0H = list2;
        this.A02 = i;
        this.A0K = z;
        this.A01 = i2;
        this.A0I = r18;
        this.A0J = r19;
        this.A0B = r11;
        this.A07 = r7;
        this.A0D = r13;
        this.A0C = r12;
        this.A0A = r10;
        this.A06 = r6;
        this.A09 = r9;
        this.A08 = r8;
        this.A0E = r14;
    }

    public final void A00(List list) {
        C64773Ex r0 = this.A08;
        C27991fJ r8 = this.A0F;
        AnonymousClass3ZH A072 = r0.A07(r8);
        if (A072 != null) {
            if (!this.A07.A0F()) {
                this.A06.A0E(C29441ip.A00(this.A03));
            } else {
                if (this.A0B.A0D(r8) || this.A0D.A03(r8) != 4 || !AnonymousClass001.A1T(A072.A04)) {
                    this.A06.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
                } else {
                    this.A06.A0G(0, R.string.f11nameremoved);
                }
                C27361dh r4 = new C27361dh(this.A0A, this, this.A0D, r8, list);
                C66503Lr r3 = this.A0E;
                r3.A08.BkV(new C70103Zx(r3, 29, r4), "GroupXmppMethods/sendAddParticipants");
            }
        }
        this.A0I.invoke();
    }
}
