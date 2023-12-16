package X;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9Fm  reason: invalid class name and case insensitive filesystem */
public class C191589Fm extends C191669Fv {
    public static final C85204Fi A0K = AnonymousClass1S3.A05;
    public final C56612sH A00;
    public final AnonymousClass9U5 A01;
    public final AnonymousClass9WN A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public void A0S(List list) {
        C195109Vz r4;
        C626936e.A06(this.A06);
        C624034w r9 = this.A06.A01;
        AnonymousClass99L A0K2 = C1899693i.A0K(r9);
        boolean A1W = AnonymousClass000.A1W(this.A0G);
        C166587yw r8 = this.A06.A00;
        AnonymousClass9W2 r0 = A0K2.A0G;
        List list2 = list;
        if (r0 != null && (r4 = r0.A0C) != null && "UNKNOWN".equals(r4.A08) && "INIT".equals(r4.A09) && A1W) {
            long A032 = this.A02.A03(this.A0H, false);
            AnonymousClass9W2 r42 = A0K2.A0G;
            boolean A1T = AnonymousClass000.A1T((A032 > r42.A01 ? 1 : (A032 == r42.A01 ? 0 : -1)));
            boolean equals = C161527pr.A00(this.A0A, "moneyStringValue").equals(r42.A09);
            if (A1T && equals) {
                AnonymousClass94y.A00(this, new C191619Fq(114));
                A0i(r9, A0K2, list);
                A0m(r9, list);
                A0j(r9, A0K2, list);
                AnonymousClass9FV r1 = new AnonymousClass9FV();
                r1.A02 = this.A06;
                r1.A01 = this;
                r1.A00 = AnonymousClass9U4.A07(this.A0b).B6f();
                list.add(r1);
                A0k(r9, A0K2, list);
                A0U(list);
                AnonymousClass94y.A01(list);
                A0h(r8, r9, A0K2, list2, A1W);
                AnonymousClass94y.A01(list);
                A0b(list);
                AnonymousClass94y.A01(list);
                list.add(new AnonymousClass9FE(1007));
            }
        }
        A0l(r9, A0K2, list, true);
        A0i(r9, A0K2, list);
        A0m(r9, list);
        A0j(r9, A0K2, list);
        AnonymousClass9FV r12 = new AnonymousClass9FV();
        r12.A02 = this.A06;
        r12.A01 = this;
        r12.A00 = AnonymousClass9U4.A07(this.A0b).B6f();
        list.add(r12);
        A0k(r9, A0K2, list);
        A0U(list);
        AnonymousClass94y.A01(list);
        A0h(r8, r9, A0K2, list2, A1W);
        AnonymousClass94y.A01(list);
        A0b(list);
        AnonymousClass94y.A01(list);
        list.add(new AnonymousClass9FE(1007));
    }

    public boolean A0e() {
        return false;
    }

    public C191589Fm(Bundle bundle, C69263Wi r4, C56972sr r5, C66663Mh r6, C620433g r7, C56962sq r8, C64773Ex r9, C620633i r10, C56612sH r11, C54292oU r12, C620733j r13, C66543Lv r14, C194909Va r15, AnonymousClass36F r16, C617332a r17, AnonymousClass8EA r18, AnonymousClass1VX r19, AnonymousClass31C r20, C194619Tt r21, C196719bd r22, AnonymousClass9U1 r23, C196629bS r24, C194539Ti r25, C1906899l r26, C40602Ha r27, C620933l r28, C29271iY r29, AnonymousClass9U5 r30, C1907099n r31, AnonymousClass9U4 r32, AnonymousClass9b0 r33, AnonymousClass9TZ r34, C203499no r35, C196419ao r36, C194969Vi r37, AnonymousClass9Tp r38, C158777kX r39, AnonymousClass9B3 r40, AnonymousClass9V7 r41, AnonymousClass9WN r42, C194259Se r43, C195219Wq r44, C194639Tx r45, AnonymousClass4FS r46) {
        super(bundle, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46);
        String A1L;
        String A1L2;
        String A1L3;
        this.A00 = r11;
        this.A02 = r42;
        this.A01 = r30;
        this.A0D = bundle.getString("extra_new_mandate_transaction_ref");
        String string = bundle.getString("extra_new_mandate_payee_name");
        Objects.requireNonNull(string);
        this.A09 = string;
        String string2 = bundle.getString("extra_new_mandate_preset_amount");
        Objects.requireNonNull(string2);
        this.A0A = string2;
        this.A08 = bundle.getString("extra_new_mandate_merchant_code");
        String string3 = bundle.getString("extra_new_mandate_purpose_code");
        Objects.requireNonNull(string3);
        this.A0B = string3;
        String string4 = bundle.getString("extra_new_mandate_vpa");
        Objects.requireNonNull(string4);
        this.A0J = string4;
        String string5 = bundle.getString("extra_new_mandate_amount_rule");
        if (string5 == null) {
            A1L = null;
        } else {
            A1L = C86664Kz.A1L(string5);
        }
        this.A03 = A1L;
        this.A07 = bundle.getString("extra_new_mandate_mandate_name");
        String string6 = bundle.getString("extra_new_mandate_validity_start");
        Objects.requireNonNull(string6);
        this.A0I = string6;
        String string7 = bundle.getString("extra_new_mandate_validity_end");
        Objects.requireNonNull(string7);
        this.A0H = string7;
        String string8 = bundle.getString("extra_new_mandate_frequency");
        if (string8 == null) {
            A1L2 = null;
        } else {
            A1L2 = C86664Kz.A1L(string8);
        }
        Objects.requireNonNull(A1L2);
        this.A05 = A1L2;
        this.A0C = bundle.getString("extra_new_mandate_recurrence_day");
        String string9 = bundle.getString("extra_new_mandate_recurrence_rule");
        if (string9 == null) {
            A1L3 = null;
        } else {
            A1L3 = C86664Kz.A1L(string9);
        }
        this.A0D = A1L3;
        this.A0E = bundle.getString("extra_new_mandate_rev");
        this.A0F = bundle.getString("extra_new_mandate_share");
        this.A0G = bundle.getString("extra_new_mandate_unique_mandate_number");
        this.A04 = bundle.getString("extra_update_mandate_transaction_id");
        this.A06 = bundle.getString("extra_new_mandate_initiation_mode");
    }
}
