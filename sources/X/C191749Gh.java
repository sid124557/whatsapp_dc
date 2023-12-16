package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Gh  reason: invalid class name and case insensitive filesystem */
public class C191749Gh extends AnonymousClass5ZM {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    public C191749Gh(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, String str, ArrayList arrayList, List list) {
        ArrayList arrayList2;
        this.A03 = indiaUpiBankPickerActivity;
        if (arrayList != null) {
            arrayList2 = AnonymousClass002.A0J(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A01 = arrayList2;
        this.A00 = str;
        this.A02 = list;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        View view;
        List list = (List) obj;
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A03;
        indiaUpiBankPickerActivity.A07 = null;
        if (list.isEmpty()) {
            TextView textView = indiaUpiBankPickerActivity.A01;
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = indiaUpiBankPickerActivity.A0A;
            AnonymousClass001.A0y(indiaUpiBankPickerActivity, textView, A0L, R.string.f11nameremoved);
            indiaUpiBankPickerActivity.A01.setVisibility(0);
            view = indiaUpiBankPickerActivity.A02;
        } else {
            indiaUpiBankPickerActivity.A02.setVisibility(0);
            view = indiaUpiBankPickerActivity.A01;
        }
        view.setVisibility(8);
        indiaUpiBankPickerActivity.A04.setVisibility(8);
        indiaUpiBankPickerActivity.A03.setVisibility(8);
        AnonymousClass95D r2 = indiaUpiBankPickerActivity.A06;
        List list2 = r2.A04;
        C18280x3.A0s(new AnonymousClass950(list2, list), r2, list, list2);
        indiaUpiBankPickerActivity.A02.A0Z(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (X.C107155an.A04(r3.A00, r6.A0C(), r8.A00) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.ArrayList r4 = r8.A01
            if (r4 == 0) goto L_0x000e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x000e:
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r0 = r8.A03
            java.util.List r0 = r0.A0C
            if (r0 == 0) goto L_0x0018
            r5.addAll(r0)
        L_0x0017:
            return r5
        L_0x0018:
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x0017
            java.util.Iterator r7 = r0.iterator()
        L_0x0020:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r6 = r7.next()
            X.99H r6 = (X.AnonymousClass99H) r6
            java.lang.String r2 = r6.A0C()
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r3 = r8.A03
            X.33j r1 = r3.A00
            r0 = 1
            boolean r0 = X.C107155an.A05(r1, r2, r4, r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r2 = r6.A0C()
            java.lang.String r1 = r8.A00
            X.33j r0 = r3.A00
            boolean r0 = X.C107155an.A04(r0, r2, r1)
            if (r0 == 0) goto L_0x0053
        L_0x0049:
            r2 = 3
            r1 = 0
            X.9SY r0 = new X.9SY
            r0.<init>(r6, r1, r2)
            r5.add(r0)
        L_0x0053:
            X.4MC r0 = r8.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0020
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191749Gh.A08(java.lang.Object[]):java.lang.Object");
    }
}
