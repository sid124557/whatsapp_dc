package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5U9  reason: invalid class name */
public class AnonymousClass5U9 {
    public int A00;
    public AnonymousClass043 A01;
    public C55682qk A02;
    public AnonymousClass5EE A03;
    public C111525iE A04;
    public C113285lB A05;
    public C64773Ex A06;
    public C56612sH A07;
    public C53412n3 A08;
    public String A09;

    public void A02(View view, C182048nm r16, C186368vB r17, String str) {
        View view2 = view;
        C182048nm r11 = r16;
        C186368vB r12 = r17;
        String str2 = str;
        try {
            C64773Ex r1 = this.A06;
            C95814uZ A042 = C106405Yw.A04(str2);
            C626936e.A06(A042);
            AnonymousClass3ZH A072 = r1.A07(A042);
            if (A072 == null || !A072.A0u) {
                A01();
                View A0H = C18310x6.A0H(C111095hX.A04(view).getLayoutInflater(), R.layout.f8nameremoved);
                C19340zH A002 = AnonymousClass5V0.A00(view.getContext());
                A002.A0V(new C1891590f(this, 1));
                A002.A0a(A0H);
                AnonymousClass043 create = A002.create();
                this.A01 = create;
                create.show();
                AnonymousClass5EE r0 = this.A03;
                UserJid A0U = C86624Kv.A0U(str2);
                C149697Nn r8 = new C149697Nn(view2, this, r11, r12, str2);
                C64333Db r13 = r0.A00.A03;
                AnonymousClass4FS A8y = C64333Db.A8y(r13);
                AnonymousClass31C A5u = C64333Db.A5u(r13);
                C113285lB r2 = new C113285lB(r8, C64333Db.A24(r13), (C66413Li) r13.A6U.get(), A0U, A5u, A8y);
                this.A05 = r2;
                if (!r2.A01.A0F()) {
                    r2.A00(AnonymousClass304.A04);
                }
                C18270x1.A0w(r2.A02, r2.A03);
                return;
            }
            A04(view, r12, str2);
        } catch (AnonymousClass24P unused) {
            AnonymousClass304 r02 = AnonymousClass304.A02;
            A03(view, r12, r02, str2);
            if (r16 != null) {
                r11.BNu(r02);
            }
        }
    }

    public final void A01() {
        AnonymousClass043 r0 = this.A01;
        if (r0 != null && !C111095hX.A02(r0.getContext()).isFinishing()) {
            this.A01.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r0 != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View r6, X.C186368vB r7, X.AnonymousClass304 r8, java.lang.String r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x0009
            int r0 = r8.A00
            r4 = 2131886697(0x7f120269, float:1.940798E38)
            if (r0 == 0) goto L_0x000c
        L_0x0009:
            r4 = 2131886687(0x7f12025f, float:1.940796E38)
        L_0x000c:
            r5.A01()
            android.app.Activity r3 = X.C111095hX.A04(r6)
            android.content.Context r0 = r6.getContext()
            X.0zH r2 = X.AnonymousClass5V0.A00(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            java.lang.String r1 = r3.getString(r0)
            X.00M r3 = (X.AnonymousClass00M) r3
            X.80K r0 = new X.80K
            r0.<init>(r6, r5, r7, r9)
            r2.A0f(r3, r0, r1)
            r0 = 2131886780(0x7f1202bc, float:1.9408149E38)
            r2.A0U(r0)
            r2.A0T(r4)
            X.043 r0 = r2.create()
            r5.A01 = r0
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5U9.A03(android.view.View, X.8vB, X.304, java.lang.String):void");
    }

    public final void A04(View view, C186368vB r22, String str) {
        int i;
        double d;
        Double d2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        C111525iE r1 = this.A04;
        String str7 = null;
        if (r1.A01 == null) {
            this.A02.A0A("directorySessionIdIsNull", false, (String) null);
        }
        if (r22 != null) {
            i = r22.BiA();
            d = r22.Bhj();
            d2 = r22.Bh8();
            str2 = r22.Bi2();
            str3 = r22.Bku();
            str4 = r22.Bkw();
            str5 = r22.BiB();
            str6 = r22.BhS();
            str7 = r22.BLV();
            i2 = r22.B2X();
        } else {
            i = 0;
            d = 0.0d;
            d2 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            i2 = 0;
        }
        C108915dl r5 = new C108915dl(d2, 0, str2, str3, str4, str5, str6, str7, this.A09, r1.A01, d, i, i2);
        C95814uZ A0S = C18310x6.A0S(str);
        C626936e.A06(A0S);
        AnonymousClass3ZH r3 = new AnonymousClass3ZH(A0S);
        Activity A042 = C111095hX.A04(view);
        A042.startActivity(C86664Kz.A1B().A1K(A042, r3).putExtra("user_actions_on_business_profile_common_fields", r5));
        C53412n3.A00(this.A08, C86624Kv.A0U(str), "directory");
        Integer valueOf = Integer.valueOf(this.A00);
        C95224sp A002 = C95224sp.A00(51);
        A002.A09 = valueOf;
        r1.A04(A002);
    }

    public AnonymousClass5U9(C55682qk r1, AnonymousClass5EE r2, C111525iE r3, C64773Ex r4, C56612sH r5, C53412n3 r6) {
        this.A07 = r5;
        this.A02 = r1;
        this.A06 = r4;
        this.A03 = r2;
        this.A08 = r6;
        this.A04 = r3;
    }

    public void A00() {
        A01();
        C113285lB r0 = this.A05;
        if (r0 != null) {
            r0.A02.A0D(true);
            this.A05.A00 = null;
        }
    }
}
