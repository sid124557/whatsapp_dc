package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.phonematching.CountryPicker;
import java.util.List;

/* renamed from: X.4OM  reason: invalid class name */
public final class AnonymousClass4OM extends ArrayAdapter {
    public final String A00;
    public final String A01;
    public final /* synthetic */ CountryPicker A02;

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4OM(Context context, CountryPicker countryPicker, String str, String str2, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A02 = countryPicker;
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            int r0 = super.getCount()
            r2 = 1
            if (r0 != 0) goto L_0x0032
            if (r10 == 0) goto L_0x0012
            r0 = 2131434456(0x7f0b1bd8, float:1.8490726E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0012:
            android.content.Context r0 = r8.getContext()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            com.whatsapp.phonematching.CountryPicker r0 = r8.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625492(0x7f0e0614, float:1.8878193E38)
            r1.inflate(r0, r10, r2)
            r0 = 2131429760(0x7f0b0980, float:1.8481202E38)
            android.view.View r0 = r10.findViewById(r0)
            r0.setClickable(r2)
        L_0x0031:
            return r10
        L_0x0032:
            java.lang.Object r7 = r8.getItem(r9)
            X.C626936e.A06(r7)
            X.5OC r7 = (X.AnonymousClass5OC) r7
            if (r10 == 0) goto L_0x0046
            r0 = 2131429193(0x7f0b0749, float:1.8480052E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 != 0) goto L_0x005b
        L_0x0046:
            android.content.Context r0 = r8.getContext()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            com.whatsapp.phonematching.CountryPicker r0 = r8.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131624700(0x7f0e02fc, float:1.8876587E38)
            r1.inflate(r0, r10, r2)
        L_0x005b:
            r0 = 2131429194(0x7f0b074a, float:1.8480054E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass0x7.A0K(r10, r0)
            java.lang.String r0 = r7.A02
            r6 = 0
            r1.A0K(r6, r0)
            r0 = 2
            X.AnonymousClass0YY.A06(r1, r0)
            r0 = 2131429193(0x7f0b0749, float:1.8480052E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r10, r0)
            java.lang.String r2 = r7.A01
            r5.setText(r2)
            r0 = 2131429199(0x7f0b074f, float:1.8480064E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r10, r0)
            java.lang.String r0 = r7.A04
            if (r0 == 0) goto L_0x00dc
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x008a:
            X.C106905aM.A04(r5)
            r0 = 2131429190(0x7f0b0746, float:1.8480046E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "+"
            r1.append(r0)
            java.lang.String r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r3.setText(r0)
            r0 = 2131429201(0x7f0b0751, float:1.8480068E38)
            android.widget.ImageView r4 = X.AnonymousClass0x9.A0F(r10, r0)
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = r8.A01
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x00e5
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r3 = r0.getResources()
            android.content.Context r2 = r8.getContext()
            r1 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            X.C18320x8.A11(r3, r5, r0)
            r4.setImageDrawable(r6)
            return r10
        L_0x00dc:
            r0 = 8
            r1.setVisibility(r0)
            r1.setText(r6)
            goto L_0x008a
        L_0x00e5:
            android.content.Context r2 = r8.getContext()
            android.content.Context r1 = r8.getContext()
            r0 = 2130970519(0x7f040797, float:1.754975E38)
            int r0 = X.AnonymousClass34K.A01(r1, r0)
            X.AnonymousClass0x2.A0q(r2, r5, r0)
            r0 = 2131231345(0x7f080271, float:1.8078768E38)
            r4.setImageResource(r0)
            android.content.Context r3 = r8.getContext()
            android.content.Context r2 = r8.getContext()
            r1 = 2130969788(0x7f0404bc, float:1.7548268E38)
            r0 = 2131101262(0x7f06064e, float:1.7814929E38)
            int r0 = X.AnonymousClass5Yj.A03(r2, r3, r1, r0)
            X.C107335b8.A0E(r4, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OM.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
