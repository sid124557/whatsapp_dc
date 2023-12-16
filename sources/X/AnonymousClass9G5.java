package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9G5  reason: invalid class name */
public class AnonymousClass9G5 extends AnonymousClass9U0 {
    public final Resources A00;
    public final C620733j A01;
    public final C1907099n A02;
    public final C66433Lk A03;
    public final C106715a2 A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9G5(android.content.res.Resources r13, X.C56422rx r14, X.C56612sH r15, X.C620733j r16, X.C66473Lo r17, X.AnonymousClass1VX r18, X.C1907099n r19, X.AnonymousClass9U4 r20, X.C195219Wq r21, X.C66433Lk r22, X.C106715a2 r23) {
        /*
            r12 = this;
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A04 = r11
            r12.A00 = r13
            r0 = r22
            r12.A03 = r0
            r12.A01 = r5
            r12.A02 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9G5.<init>(android.content.res.Resources, X.2rx, X.2sH, X.33j, X.3Lo, X.1VX, X.99n, X.9U4, X.9Wq, X.3Lk, X.5a2):void");
    }

    public HashMap A03(Context context, C624034w r13, AnonymousClass39S r14) {
        Context context2 = context;
        C624034w r6 = r13;
        HashMap A032 = super.A03(context, r13, r14);
        List<AnonymousClass394> list = r14.A0K;
        if (list != null && list.size() > 0) {
            for (AnonymousClass394 r8 : list) {
                String str = r8.A01;
                if (("pix_static_code".equals(str) || "pix_dynamic_code".equals(str)) && this.A06.A0X(4780)) {
                    A032.put(6, A00(context2, r6, (AnonymousClass399) null, r8, context.getString(R.string.f11nameremoved), 6));
                }
            }
        }
        return A032;
    }

    public final SpannableString A09(Context context) {
        String[] strArr = {this.A06.A0Q(3014)};
        return this.A04.A04(context, this.A00.getString(R.string.f11nameremoved), new Runnable[]{new C198249ec(), new C198259ed(), new C198269ee()}, new String[]{"payment-protection-link"}, strArr);
    }

    public HashMap A02(Context context) {
        HashMap A022 = super.A02(context);
        A022.put(C18290x4.A0Z(), context.getString(R.string.f11nameremoved));
        return A022;
    }
}
