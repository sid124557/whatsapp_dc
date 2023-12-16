package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import org.json.JSONException;

/* renamed from: X.1pQ  reason: invalid class name and case insensitive filesystem */
public final class C32021pQ extends AnonymousClass315 {
    public final AnonymousClass1VX A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32021pQ(AnonymousClass1VX r2, AnonymousClass39W r3, C41882Ly r4) {
        super(r3, r4);
        C162457s7.A0J(r2, 3);
        this.A00 = r2;
    }

    public String A0A(Context context) {
        String str;
        C162457s7.A0J(context, 0);
        AnonymousClass39S r0 = this.A02.A01;
        if (r0 == null || (str = r0.A0F) == null || str.length() == 0) {
            String A0A = super.A0A(context);
            C162457s7.A0D(A0A);
            return A0A;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('*');
        A0o.append(str);
        return AnonymousClass001.A0j(A0o, '*');
    }

    public static void A00(AnonymousClass39W r0, CharSequence charSequence, String str, StringBuilder sb) {
        AnonymousClass315.A02(charSequence, str, sb);
        AnonymousClass315.A02(r0.A09, str, sb);
    }

    public CharSequence A05(Context context, Paint paint) {
        CharSequence A05;
        String str;
        boolean A1Y = AnonymousClass0x2.A1Y(context, paint);
        AnonymousClass39S r0 = this.A02.A01;
        if (r0 == null || (str = r0.A0F) == null || str.length() == 0) {
            A05 = super.A05(context, paint);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass0x2.A0X(context, str, A1Y ? 1 : 0, R.string.f11nameremoved));
            Drawable A03 = A03(context);
            if (A03 != null) {
                A05 = C87044Mw.A01(paint, A03, A0o);
            } else {
                A05 = A0o.toString();
            }
        }
        C162457s7.A0D(A05);
        return A05;
    }

    public String A07() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass39W r4 = this.A02;
        String str2 = null;
        AnonymousClass39S r0 = r4.A01;
        if (r0 != null) {
            AnonymousClass39H r02 = r0.A07;
            if (r02 != null) {
                str = r02.A01();
            } else {
                str = null;
            }
            AnonymousClass315.A02(str, "\n", A0o);
            AnonymousClass39S r1 = r4.A01;
            if (r1 != null) {
                str2 = r1.A05(this.A00);
            }
            AnonymousClass315.A02(str2, "\n", A0o);
        }
        A00(r4, r4.A08, "\n", A0o);
        AnonymousClass315.A02(this.A00.A0B(R.string.f11nameremoved), "\n", A0o);
        return C18290x4.A0o(A0o);
    }

    public void A0C(C55032pg r9, C624134x r10) {
        String str;
        boolean A1U = C18270x1.A1U(r9, r10);
        AnonymousClass39W r2 = this.A02;
        AnonymousClass39S r0 = r2.A01;
        if (r0 == null || r0.A0L != A1U) {
            AnonymousClass1A4 r4 = r9.A00;
            C21801Df r02 = ((AnonymousClass1EU) r4.A00).buttonsMessage_;
            if (r02 == null) {
                r02 = C21801Df.DEFAULT_INSTANCE;
            }
            C208319m r3 = (C208319m) r02.A0H();
            byte[] bArr = null;
            AnonymousClass39S r03 = r2.A01;
            if (r03 == null || r03.A0M == null) {
                r3.A09(AnonymousClass23H.EMPTY);
            } else {
                C130546c9 A0G = AnonymousClass1EE.DEFAULT_INSTANCE.A0G();
                AnonymousClass39S r04 = r2.A01;
                if (r04 != null) {
                    bArr = r04.A0M;
                }
                C172548Lq A09 = C18270x1.A09(A0G, bArr);
                AnonymousClass1EE r1 = (AnonymousClass1EE) A0G.A00;
                r1.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r1.jpegThumbnail_ = A09;
                r3.A09(AnonymousClass23H.IMAGE);
                C21801Df r12 = (C21801Df) C18320x8.A0C(r3);
                C130786cX A06 = A0G.A06();
                A06.getClass();
                r12.header_ = A06;
                r12.headerCase_ = 3;
            }
            String str2 = r2.A08;
            if (str2 != null) {
                C21801Df A0T = AnonymousClass0x7.A0T(r3);
                A0T.bitField0_ |= 32;
                A0T.contentText_ = str2;
            }
            String str3 = r2.A09;
            if (str3 != null) {
                C21801Df A0T2 = AnonymousClass0x7.A0T(r3);
                A0T2.bitField0_ |= 64;
                A0T2.footerText_ = str3;
            }
            C130546c9 A0G2 = AnonymousClass1BB.DEFAULT_INSTANCE.A0G();
            AnonymousClass1BB r13 = (AnonymousClass1BB) C18320x8.A0C(A0G2);
            r13.bitField0_ |= 1;
            r13.name_ = "review_and_pay";
            AnonymousClass39S r14 = r2.A01;
            if (r14 != null) {
                try {
                    String obj = AnonymousClass35U.A05(r14, r9.A07).toString();
                    AnonymousClass1BB r15 = (AnonymousClass1BB) C18320x8.A0C(A0G2);
                    obj.getClass();
                    r15.bitField0_ |= 2;
                    r15.paramsJson_ = obj;
                } catch (JSONException e) {
                    C18260x0.A16("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass001.A0o(), e);
                }
            }
            C130546c9 A0K = C18300x5.A0K(C21591Ck.DEFAULT_INSTANCE);
            C21591Ck r16 = (C21591Ck) A0K.A00;
            AnonymousClass1BB r05 = (AnonymousClass1BB) A0G2.A06();
            r05.getClass();
            r16.nativeFlowInfo_ = r05;
            r16.bitField0_ |= 8;
            AnonymousClass22g r06 = AnonymousClass22g.NATIVE_FLOW;
            C21591Ck r17 = (C21591Ck) C18320x8.A0C(A0K);
            r17.type_ = r06.value;
            r17.bitField0_ |= 4;
            C130546c9 A0K2 = C18300x5.A0K(AnonymousClass1AI.DEFAULT_INSTANCE);
            AnonymousClass1AI r18 = (AnonymousClass1AI) A0K2.A00;
            r18.bitField0_ |= 1;
            r18.displayText_ = "review_and_pay";
            C21591Ck r19 = (C21591Ck) C18320x8.A0C(A0K);
            AnonymousClass1AI r07 = (AnonymousClass1AI) A0K2.A06();
            r07.getClass();
            r19.buttonText_ = r07;
            r19.bitField0_ |= 2;
            C21801Df r5 = (C21801Df) C18320x8.A0C(r3);
            C130786cX A062 = A0K.A06();
            A062.getClass();
            C188248ya r110 = r5.buttons_;
            if (!((AnonymousClass8T6) r110).A00) {
                r110 = C130786cX.A07(r110);
                r5.buttons_ = r110;
            }
            r110.add(A062);
            AnonymousClass3Z2 r22 = r9.A01;
            byte[] bArr2 = r9.A09;
            if (C59542x5.A01(r22, r10, bArr2)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A01, r9, r22, r10, bArr2);
                C21801Df r111 = (C21801Df) C18320x8.A0C(r3);
                A002.getClass();
                r111.contextInfo_ = A002;
                r111.bitField0_ |= 128;
            }
            AnonymousClass1EU A0T3 = C18290x4.A0T(r4);
            C21801Df r08 = (C21801Df) r3.A06();
            r08.getClass();
            A0T3.buttonsMessage_ = r08;
            A0T3.bitField1_ |= 1;
            return;
        }
        super.A0C(r9, r10);
        AnonymousClass1A4 r42 = r9.A00;
        C130546c9 A01 = AnonymousClass1A4.A01(r42);
        C130546c9 A0H = ((AnonymousClass1ER) A01.A00).A0N().A0H();
        if (r2.A01() != null) {
            str = r2.A01();
        } else {
            str = "review_and_pay";
        }
        C130546c9 A0K3 = C18300x5.A0K(AnonymousClass1BH.DEFAULT_INSTANCE);
        AnonymousClass1BH r112 = (AnonymousClass1BH) A0K3.A00;
        str.getClass();
        r112.bitField0_ |= 1;
        r112.name_ = str;
        AnonymousClass39S r113 = r2.A01;
        if (r113 != null) {
            try {
                String obj2 = AnonymousClass35U.A05(r113, r9.A07).toString();
                AnonymousClass1BH r114 = (AnonymousClass1BH) C18320x8.A0C(A0K3);
                obj2.getClass();
                r114.bitField0_ |= 2;
                r114.buttonParamsJson_ = obj2;
            } catch (JSONException e2) {
                C18260x0.A16("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass001.A0o(), e2);
            }
        }
        C130786cX A063 = A0K3.A06();
        AnonymousClass1C7 r23 = (AnonymousClass1C7) C18320x8.A0C(A0H);
        A063.getClass();
        C188248ya r115 = r23.buttons_;
        if (!((AnonymousClass8T6) r115).A00) {
            r115 = C130786cX.A07(r115);
            r23.buttons_ = r115;
        }
        r115.add(A063);
        AnonymousClass315.A01(A01, A0H).interactiveMessageCase_ = 6;
        r42.A0C((AnonymousClass1ER) A01.A06());
    }
}
