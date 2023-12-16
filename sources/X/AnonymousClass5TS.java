package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5TS  reason: invalid class name */
public final class AnonymousClass5TS {
    public AnonymousClass65G A00;
    public final View A01;
    public final C89654ea A02;
    public final C69263Wi A03;
    public final C66663Mh A04;
    public final C29441ip A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C620733j A08;
    public final C28891hw A09;
    public final C56892sj A0A;
    public final AnonymousClass1VX A0B;
    public final C66493Lq A0C;
    public final C66503Lr A0D;
    public final C27991fJ A0E;
    public final AnonymousClass33S A0F;

    public void A00(String str) {
        C64773Ex r0 = this.A06;
        C27991fJ r5 = this.A0E;
        AnonymousClass3ZH A0A2 = r0.A0A(r5);
        if (A02(false)) {
            String str2 = str;
            if (!TextUtils.equals(this.A07.A0H(A0A2), str) && A01(str)) {
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                }
                this.A0D.A0A(new C95674u8(this.A09, this, this.A0C, r5, str2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1.A14 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(boolean r6) {
        /*
            r5 = this;
            X.3Ex r0 = r5.A06
            X.1fJ r2 = r5.A0E
            X.3ZH r1 = r0.A0A(r2)
            X.2sj r0 = r5.A0A
            boolean r4 = r0.A0C(r2)
            boolean r0 = r0.A0D(r2)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001b
            boolean r1 = r1.A14
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x002c
            X.4ea r1 = r5.A02
            r0 = 2131889327(0x7f120caf, float:1.9413314E38)
            if (r6 == 0) goto L_0x0028
            r0 = 2131889323(0x7f120cab, float:1.9413306E38)
        L_0x0028:
            r1.Bot(r0)
            return r3
        L_0x002c:
            if (r0 == 0) goto L_0x0039
            X.4ea r1 = r5.A02
            r0 = 2131889326(0x7f120cae, float:1.9413312E38)
            if (r6 == 0) goto L_0x0028
            r0 = 2131889324(0x7f120cac, float:1.9413308E38)
            goto L_0x0028
        L_0x0039:
            X.1ip r0 = r5.A05
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x005d
            X.3Wi r2 = r5.A03
            if (r6 == 0) goto L_0x004c
            r1 = 2131888788(0x7f120a94, float:1.9412221E38)
        L_0x0048:
            r2.A0H(r1, r3)
            return r3
        L_0x004c:
            X.1VX r1 = r5.A0B
            r0 = 3088(0xc10, float:4.327E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 2131891215(0x7f12140f, float:1.9417144E38)
            if (r0 == 0) goto L_0x0048
            r1 = 2131891214(0x7f12140e, float:1.9417142E38)
            goto L_0x0048
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TS.A02(boolean):boolean");
    }

    public AnonymousClass5TS(View view, C89654ea r2, C69263Wi r3, C66663Mh r4, C29441ip r5, C64773Ex r6, AnonymousClass5ZU r7, C620733j r8, C28891hw r9, C56892sj r10, AnonymousClass1VX r11, C66493Lq r12, C66503Lr r13, C27991fJ r14, AnonymousClass33S r15) {
        this.A0B = r11;
        this.A01 = view;
        this.A0E = r14;
        this.A02 = r2;
        this.A03 = r3;
        this.A0F = r15;
        this.A04 = r4;
        this.A08 = r8;
        this.A07 = r7;
        this.A06 = r6;
        this.A0C = r12;
        this.A0D = r13;
        this.A05 = r5;
        this.A09 = r9;
        this.A0A = r10;
    }

    public boolean A01(String str) {
        int A002 = AnonymousClass5VB.A00(str);
        int A032 = this.A04.A03(C66663Mh.A1v);
        if (A002 <= A032) {
            return true;
        }
        C69263Wi r6 = this.A03;
        C620733j r5 = this.A08;
        long j = (long) A032;
        Object[] objArr = new Object[1];
        boolean A1Y = C18300x5.A1Y(objArr, A032);
        r6.A0P(r5.A0L(objArr, R.plurals.f9nameremoved, j), A1Y ? 1 : 0);
        return A1Y;
    }
}
