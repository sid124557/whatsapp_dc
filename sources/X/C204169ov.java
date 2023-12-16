package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9ov  reason: invalid class name and case insensitive filesystem */
public class C204169ov implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C204169ov(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj3;
        this.A02 = obj;
        this.A00 = i;
        this.A03 = obj2;
    }

    public final void onClick(View view) {
        Intent intent;
        AnonymousClass1S4 r0;
        C195319Xg A0D;
        switch (this.A04) {
            case 0:
                AnonymousClass95D r3 = (AnonymousClass95D) this.A01;
                int i = this.A00;
                AnonymousClass99H r7 = (AnonymousClass99H) this.A03;
                r3.A03.A02(((C05570Ua) this.A02).A0H);
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (r3.getItemViewType(i3) == 0) {
                        i2++;
                    }
                }
                int i4 = i - i2;
                IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r3.A01;
                indiaUpiBankPickerActivity.A0K = r7;
                if (indiaUpiBankPickerActivity.A0M.A0R(r7, indiaUpiBankPickerActivity.A0S, indiaUpiBankPickerActivity.A0L.A04(r7))) {
                    try {
                        JSONObject A1G = AnonymousClass0x9.A1G();
                        AnonymousClass97T.A0x(indiaUpiBankPickerActivity, "SelectBankStep", A1G);
                        AnonymousClass97T.A0v(r7, indiaUpiBankPickerActivity, A1G);
                    } catch (Exception unused) {
                    }
                    intent = AnonymousClass0x9.A08(indiaUpiBankPickerActivity, IndiaUpiBankAccountPickerActivity.class);
                } else {
                    intent = AnonymousClass0x9.A08(indiaUpiBankPickerActivity, IndiaUpiSimVerificationActivity.class);
                }
                indiaUpiBankPickerActivity.A05.A00.A0B("bankSelected");
                indiaUpiBankPickerActivity.A7O(intent);
                intent.putExtra("extra_previous_screen", "nav_bank_select");
                AnonymousClass5VI.A00(intent, "bankPicker");
                indiaUpiBankPickerActivity.A6T(intent, true);
                C134246ig r2 = indiaUpiBankPickerActivity.A0F;
                r2.A02 = Boolean.valueOf(indiaUpiBankPickerActivity.A0E);
                String str = indiaUpiBankPickerActivity.A0A;
                r2.A0P = str;
                r2.A04 = Boolean.valueOf(C18320x8.A1U(str));
                r2.A0Q = r7.A0C();
                r2.A0J = Long.valueOf((long) i4);
                AnonymousClass97T.A0u(r2, indiaUpiBankPickerActivity, "nav_bank_select");
                r2.A0a = indiaUpiBankPickerActivity.A0e;
                C1899593h.A1B(r2, 1);
                r2.A0P = indiaUpiBankPickerActivity.A0A;
                r2.A07 = C18290x4.A0c();
                AnonymousClass97T.A0t(r2, indiaUpiBankPickerActivity);
                return;
            case 1:
                AnonymousClass959 r4 = (AnonymousClass959) this.A01;
                int i5 = this.A00;
                AnonymousClass95W r72 = (AnonymousClass95W) this.A02;
                C193959Ra r6 = (C193959Ra) this.A03;
                List list = r4.A05;
                if (((C193959Ra) list.get(i5)).A01) {
                    C193959Ra r5 = (C193959Ra) list.get(i5);
                    AnonymousClass39R r42 = r5.A03;
                    if (r42 != null) {
                        r72.A02.setVisibility(8);
                        r72.A03.setVisibility(0);
                        C194589Tn r32 = r72.A05;
                        C197069cT r22 = new C197069cT(r5, r72);
                        boolean isEmpty = TextUtils.isEmpty(r42.A05);
                        AnonymousClass4FS r1 = r32.A0D;
                        if (isEmpty) {
                            C18270x1.A0w(new C191709Ga(r42, r32, r22), r1);
                            return;
                        } else {
                            r1.BkM(new C200899jC(r42, r32, r22));
                            return;
                        }
                    } else {
                        throw AnonymousClass001.A0e("Default theme should not have download failed state");
                    }
                } else if (r4.A00 != i5) {
                    ArrayList A0J = AnonymousClass002.A0J(list);
                    C193959Ra r12 = new C193959Ra(((C193959Ra) list.get(r4.A00)).A03);
                    r12.A02 = false;
                    r12.A00 = ((C193959Ra) list.get(r4.A00)).A00;
                    r12.A01 = ((C193959Ra) list.get(r4.A00)).A01;
                    A0J.set(r4.A00, r12);
                    AnonymousClass39R r23 = r6.A03;
                    C193959Ra r13 = new C193959Ra(r23);
                    r13.A02 = true;
                    r13.A00 = r6.A00;
                    r13.A01 = r6.A01;
                    A0J.set(i5, r13);
                    r4.A01 = r23;
                    r4.A00 = i5;
                    r4.A04.Be0(r23);
                    A0J.size();
                    List list2 = r4.A05;
                    C18280x3.A0s(new AnonymousClass951(list2, A0J), r4, A0J, list2);
                    return;
                } else {
                    return;
                }
            default:
                AnonymousClass94y r62 = (AnonymousClass94y) this.A01;
                int i6 = this.A00;
                C166587yw r43 = (C166587yw) this.A02;
                C624034w r33 = (C624034w) this.A03;
                C193629Pj r02 = r62.A06;
                if (!(r02 == null || (r0 = r02.A01.A0A) == null || (A0D = r0.A0D()) == null)) {
                    r62.A0N(A0D, AnonymousClass001.A0f(), 39);
                }
                AnonymousClass9QJ A002 = AnonymousClass9QJ.A00(i6);
                A002.A04 = r43;
                A002.A05 = r33;
                AnonymousClass94y.A00(r62, A002);
                return;
        }
    }
}
