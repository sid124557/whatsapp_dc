package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.315  reason: invalid class name */
public class AnonymousClass315 {
    public final C620733j A00;
    public final C59542x5 A01;
    public final AnonymousClass39W A02;

    public Drawable A03(Context context) {
        if (this instanceof AnonymousClass1pO) {
            C162457s7.A0J(context, 0);
            boolean z = C1001059l.A04;
            int i = R.drawable.msg_status_shop;
            if (z) {
                i = R.drawable.msg_status_shop_filled_wds;
            }
            Drawable A04 = C107335b8.A04(context, i, R.color.f5nameremoved);
            C162457s7.A0D(A04);
            return A04;
        } else if (!(this instanceof C32021pQ)) {
            return null;
        } else {
            C162457s7.A0J(context, 0);
            boolean z2 = C1001059l.A04;
            int i2 = R.drawable.vec_ic_receipt_16dp;
            if (z2) {
                i2 = R.drawable.vec_ic_receipt_16dp_filled_wds;
            }
            return C107335b8.A04(context, i2, R.color.f5nameremoved);
        }
    }

    public String A06() {
        String str;
        if (this instanceof C32021pQ) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass39W r2 = this.A02;
            C32021pQ.A00(r2, r2.A08, "\n", A0o);
            return C18290x4.A0o(A0o);
        } else if (this instanceof C32011pN) {
            return A07();
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A02(A08(), "\n", A0o2);
            AnonymousClass39W r1 = this.A02;
            AnonymousClass39A r0 = r1.A02;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = null;
            }
            A02(str, "\n", A0o2);
            C32021pQ.A00(r1, r1.A08, "\n", A0o2);
            return A0o2.toString();
        }
    }

    public String A08() {
        AnonymousClass39A r0 = this.A02.A02;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public String A09(Context context) {
        AnonymousClass39W r2;
        String str;
        AnonymousClass1VX r5;
        Number number;
        Map map;
        Map map2;
        if (this instanceof AnonymousClass1pP) {
            AnonymousClass1pP r1 = (AnonymousClass1pP) this;
            C162457s7.A0J(context, 0);
            r2 = r1.A02;
            str = r2.A08;
            r5 = r1.A00;
        } else if (!(this instanceof C32021pQ)) {
            return this.A02.A08;
        } else {
            C32021pQ r12 = (C32021pQ) this;
            C162457s7.A0J(context, 0);
            r2 = r12.A02;
            str = r2.A08;
            r5 = r12.A00;
        }
        if (!TextUtils.isEmpty(r2.A02())) {
            String A022 = r2.A02();
            if (AnonymousClass39W.A00(r2, "review_order")) {
                if (A022 != null) {
                    String A023 = C624935g.A02(A022);
                    if (AnonymousClass2BO.A00.A01(r5)) {
                        map2 = C624935g.A04;
                    } else {
                        map2 = C624935g.A03;
                    }
                    number = AnonymousClass0x9.A0q(A023, map2);
                }
                number = null;
            } else if (AnonymousClass39W.A00(r2, "payment_method")) {
                number = C624935g.A00(r5, A022);
            } else {
                if (AnonymousClass39W.A00(r2, "payment_status") && !TextUtils.isEmpty(A022)) {
                    String str2 = null;
                    if (!TextUtils.isEmpty(A022)) {
                        try {
                            str2 = AnonymousClass0x9.A1H(A022).optString("payment_status", "pending");
                        } catch (JSONException e) {
                            Log.e("CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json", e);
                        }
                    }
                    if (C624935g.A03(r5)) {
                        map = C624935g.A01;
                    } else {
                        map = C624935g.A00;
                    }
                    number = AnonymousClass0x9.A0q(str2, map);
                }
                number = null;
            }
            if (number != null) {
                String string = context.getResources().getString(number.intValue());
                if (TextUtils.isEmpty(str)) {
                    return string;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                AnonymousClass000.A16(string, str, charSequenceArr);
                return C107575bX.A09("\n", charSequenceArr);
            }
        }
        return str;
    }

    public AnonymousClass315(AnonymousClass39W r2, C41882Ly r3) {
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r2;
    }

    public static AnonymousClass1ER A01(C130546c9 r1, C130546c9 r2) {
        r1.A07();
        AnonymousClass1ER r12 = (AnonymousClass1ER) r1.A00;
        C130786cX A06 = r2.A06();
        A06.getClass();
        r12.interactiveMessage_ = A06;
        return r12;
    }

    public static void A02(CharSequence charSequence, String str, StringBuilder sb) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(charSequence);
        }
    }

    public CharSequence A04(Context context, Paint paint) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass39W r2 = this.A02;
        C32021pQ.A00(r2, r2.A08, "\n", A0o);
        return A0o.toString();
    }

    public CharSequence A05(Context context, Paint paint) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        String A08 = A08();
        if (!TextUtils.isEmpty(A08)) {
            A0o.append(A08.trim());
        }
        AnonymousClass39A r0 = this.A02.A02;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        A02(str, "\n", A0o);
        A02(A04(context, paint), "\n", A0o);
        Drawable A03 = A03(context);
        if (A03 != null) {
            return C87044Mw.A01(paint, A03, A0o);
        }
        return A0o;
    }

    public String A07() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A02(A08(), " ", A0o);
        AnonymousClass39W r1 = this.A02;
        AnonymousClass39A r0 = r1.A02;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        A02(str, " ", A0o);
        C32021pQ.A00(r1, r1.A08, " ", A0o);
        return A0o.toString();
    }

    public String A0A(Context context) {
        StringBuilder A0o = AnonymousClass001.A0o();
        String A08 = A08();
        if (!TextUtils.isEmpty(A08)) {
            A0o.append("*");
            A0o.append(A08.trim());
            A0o.append("*\n");
        }
        AnonymousClass39W r2 = this.A02;
        C32021pQ.A00(r2, r2.A08, "\n", A0o);
        return A0o.toString();
    }

    public String A0B(Context context) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A02(A08(), " ", A0o);
        AnonymousClass39W r1 = this.A02;
        C32021pQ.A00(r1, r1.A08, " ", A0o);
        return A0o.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0130, code lost:
        if (r1 == false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C55032pg r11, X.C624134x r12) {
        /*
            r10 = this;
            X.39W r0 = X.AnonymousClass0x9.A0Y(r12)
            if (r0 == 0) goto L_0x012f
            X.1A4 r3 = r11.A00
            X.6c9 r4 = X.AnonymousClass1A4.A01(r3)
            X.6cX r0 = r4.A00
            X.1ER r0 = (X.AnonymousClass1ER) r0
            X.1DR r0 = r0.header_
            if (r0 != 0) goto L_0x0016
            X.1DR r0 = X.AnonymousClass1DR.DEFAULT_INSTANCE
        L_0x0016:
            X.6c9 r6 = r0.A0H()
            X.19w r6 = (X.C209319w) r6
            X.6cX r0 = r4.A00
            X.1ER r0 = (X.AnonymousClass1ER) r0
            X.1AN r0 = r0.body_
            if (r0 != 0) goto L_0x0026
            X.1AN r0 = X.AnonymousClass1AN.DEFAULT_INSTANCE
        L_0x0026:
            X.6c9 r9 = r0.A0H()
            X.6cX r0 = r4.A00
            X.1ER r0 = (X.AnonymousClass1ER) r0
            X.1AO r0 = r0.footer_
            if (r0 != 0) goto L_0x0034
            X.1AO r0 = X.AnonymousClass1AO.DEFAULT_INSTANCE
        L_0x0034:
            X.6c9 r8 = r0.A0H()
            java.lang.String r2 = r10.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0137
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1DR r1 = (X.AnonymousClass1DR) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.title_ = r2
            r1 = 0
        L_0x0054:
            X.39W r5 = r10.A02
            X.39A r7 = r5.A02
            if (r7 == 0) goto L_0x0134
            java.lang.String r2 = r7.A00
        L_0x005c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0074
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1DR r1 = (X.AnonymousClass1DR) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.subtitle_ = r2
            r1 = 0
        L_0x0074:
            if (r7 == 0) goto L_0x0130
            byte[] r0 = r7.A02
            if (r0 == 0) goto L_0x0130
            X.8Lq r2 = X.C18270x1.A09(r6, r0)
            X.6cX r1 = r6.A00
            X.1DR r1 = (X.AnonymousClass1DR) r1
            r0 = 6
            r1.mediaCase_ = r0
            r1.media_ = r2
            r6.A09()
        L_0x008a:
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1ER r1 = (X.AnonymousClass1ER) r1
            X.6cX r0 = r6.A06()
            X.1DR r0 = (X.AnonymousClass1DR) r0
            r0.getClass()
            r1.header_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x00a1:
            java.lang.String r0 = r5.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r2 = r5.A08
            X.6cX r1 = X.C18320x8.A0C(r9)
            X.1AN r1 = (X.AnonymousClass1AN) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r2
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1ER r1 = (X.AnonymousClass1ER) r1
            X.6cX r0 = r9.A06()
            X.1AN r0 = (X.AnonymousClass1AN) r0
            r0.getClass()
            r1.body_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
        L_0x00d3:
            java.lang.String r0 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0105
            java.lang.String r2 = r5.A09
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1AO r1 = (X.AnonymousClass1AO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r2
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1ER r1 = (X.AnonymousClass1ER) r1
            X.6cX r0 = r8.A06()
            X.1AO r0 = (X.AnonymousClass1AO) r0
            r0.getClass()
            r1.footer_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x0105:
            X.3Z2 r2 = r11.A01
            byte[] r1 = r11.A09
            boolean r0 = X.C59542x5.A01(r2, r12, r1)
            if (r0 == 0) goto L_0x0126
            X.2x5 r0 = r10.A01
            X.1EF r0 = X.C55032pg.A00(r0, r11, r2, r12, r1)
            X.6cX r1 = X.C18320x8.A0C(r4)
            X.1ER r1 = (X.AnonymousClass1ER) r1
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
        L_0x0126:
            X.6cX r0 = r4.A06()
            X.1ER r0 = (X.AnonymousClass1ER) r0
            r3.A0C(r0)
        L_0x012f:
            return
        L_0x0130:
            if (r1 != 0) goto L_0x00a1
            goto L_0x008a
        L_0x0134:
            r2 = 0
            goto L_0x005c
        L_0x0137:
            r1 = 1
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass315.A0C(X.2pg, X.34x):void");
    }
}
