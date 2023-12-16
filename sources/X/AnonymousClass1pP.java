package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1pP  reason: invalid class name */
public class AnonymousClass1pP extends AnonymousClass315 {
    public final AnonymousClass1VX A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1pP(AnonymousClass1VX r2, AnonymousClass39W r3, C41882Ly r4) {
        super(r3, r4);
        C162457s7.A0J(r2, 3);
        this.A00 = r2;
    }

    public String A0A(Context context) {
        C162457s7.A0J(context, 0);
        AnonymousClass39W r1 = this.A02;
        if (AnonymousClass39W.A00(r1, "review_order") || AnonymousClass39W.A00(r1, "payment_status") || AnonymousClass39W.A00(r1, "payment_method")) {
            String A09 = A09(context);
            if (A09 == null) {
                return "";
            }
            return A09;
        }
        String A0A = super.A0A(context);
        C162457s7.A0H(A0A);
        return A0A;
    }

    public String A0B(Context context) {
        C162457s7.A0J(context, 0);
        AnonymousClass39W r1 = this.A02;
        if (!AnonymousClass39W.A00(r1, "review_order") && !AnonymousClass39W.A00(r1, "payment_status") && !AnonymousClass39W.A00(r1, "payment_method")) {
            return super.A0B(context);
        }
        String A09 = A09(context);
        if (A09 == null) {
            return "";
        }
        return A09;
    }

    public void A0C(C55032pg r10, C624134x r11) {
        List<AnonymousClass395> list;
        C18260x0.A0O(r10, r11);
        super.A0C(r10, r11);
        AnonymousClass39W A0Y = AnonymousClass0x9.A0Y(r11);
        String str = null;
        if (A0Y != null && A0Y.A03 != null && A0Y.A00 == 5) {
            AnonymousClass1A4 r4 = r10.A00;
            C130546c9 A01 = AnonymousClass1A4.A01(r4);
            C130546c9 A0H = ((AnonymousClass1ER) A01.A00).A0N().A0H();
            AnonymousClass39P r0 = A0Y.A03;
            if (r0 != null) {
                str = r0.A02;
            }
            AnonymousClass1C7 r1 = (AnonymousClass1C7) C18320x8.A0C(A0H);
            str.getClass();
            r1.bitField0_ |= 1;
            r1.messageParamsJson_ = str;
            AnonymousClass39P r02 = A0Y.A03;
            if (r02 == null || (list = r02.A03) == null) {
                list = C72023d3.A00;
            }
            for (AnonymousClass395 r12 : list) {
                C130546c9 A0G = AnonymousClass1BH.DEFAULT_INSTANCE.A0G();
                AnonymousClass398 r3 = r12.A01;
                String str2 = r3.A00;
                AnonymousClass1BH r13 = (AnonymousClass1BH) C18320x8.A0C(A0G);
                str2.getClass();
                r13.bitField0_ |= 1;
                r13.name_ = str2;
                String str3 = r3.A01;
                if (str3 != null) {
                    AnonymousClass1BH r14 = (AnonymousClass1BH) C18320x8.A0C(A0G);
                    r14.bitField0_ |= 2;
                    r14.buttonParamsJson_ = str3;
                }
                AnonymousClass1C7 r32 = (AnonymousClass1C7) C18320x8.A0C(A0H);
                C130786cX A06 = A0G.A06();
                A06.getClass();
                C188248ya r15 = r32.buttons_;
                if (!((AnonymousClass8T6) r15).A00) {
                    r15 = C130786cX.A07(r15);
                    r32.buttons_ = r15;
                }
                r15.add(A06);
            }
            AnonymousClass315.A01(A01, A0H).interactiveMessageCase_ = 6;
            r4.A0C((AnonymousClass1ER) A01.A06());
        }
    }
}
