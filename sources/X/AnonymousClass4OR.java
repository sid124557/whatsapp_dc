package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4OR  reason: invalid class name */
public class AnonymousClass4OR extends ArrayAdapter {
    public Context A00;
    public C620733j A01;
    public List A02;
    public final boolean A03;

    public int A00() {
        return this.A03 ^ true ? 1 : 0;
    }

    public int A01() {
        return 0;
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0091, code lost:
        r0 = java.util.Locale.forLanguageTag(r8).getDisplayLanguage(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0099, code lost:
        r0 = X.AnonymousClass5YW.A00(r0);
        r2.setText(r0);
        r3.setContentDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ee, code lost:
        r0 = r6.getString(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            android.content.Context r6 = r10.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 2131625252(0x7f0e0524, float:1.8877707E38)
            android.view.View r5 = X.C18310x6.A0H(r1, r0)
            int r0 = X.AnonymousClass0YH.A00()
            r5.setId(r0)
            r0 = 2131430921(0x7f0b0e09, float:1.8483557E38)
            android.view.View r4 = X.C06560Yg.A02(r5, r0)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r0 = 2131430922(0x7f0b0e0a, float:1.8483559E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r5, r0)
            java.util.List r1 = r10.A02
            java.lang.Object r0 = r1.get(r11)
            X.7Hi r0 = (X.C148187Hi) r0
            java.lang.String r0 = r0.A00
            r3.setText(r0)
            r0 = 2131430923(0x7f0b0e0b, float:1.848356E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r5, r0)
            int r0 = r10.A00()
            if (r11 != r0) goto L_0x0054
            r0 = 2131890390(0x7f1210d6, float:1.941547E38)
            r2.setText(r0)
        L_0x0044:
            int r0 = r10.A01()
            boolean r0 = X.AnonymousClass000.A1U(r11, r0)
            r4.setChecked(r0)
            r0 = 2
            X.AnonymousClass0YY.A06(r2, r0)
            return r5
        L_0x0054:
            java.lang.Object r0 = r1.get(r11)
            X.7Hi r0 = (X.C148187Hi) r0
            java.lang.String r8 = r0.A01
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r8)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r7 = r1.getDisplayLanguage(r0)
            int r1 = r7.length()
            int r0 = r8.length()
            if (r1 > r0) goto L_0x0106
            boolean r0 = r8.startsWith(r7)
            if (r0 == 0) goto L_0x0106
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r7 = r0.locale
        L_0x0082:
            java.util.Locale r9 = java.util.Locale.forLanguageTag(r8)
            java.lang.String r1 = r9.getLanguage()
            int r0 = r1.hashCode()
            switch(r0) {
                case 3116: goto L_0x00a4;
                case 3588: goto L_0x00bc;
                case 3886: goto L_0x00d7;
                default: goto L_0x0091;
            }
        L_0x0091:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r8)
            java.lang.String r0 = r0.getDisplayLanguage(r7)
        L_0x0099:
            java.lang.String r0 = X.AnonymousClass5YW.A00(r0)
            r2.setText(r0)
            r3.setContentDescription(r0)
            goto L_0x0044
        L_0x00a4:
            java.lang.String r0 = "am"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0091
            java.lang.String r1 = r7.getLanguage()
            java.lang.String r0 = "om"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0091
            r1 = 2131895661(0x7f12256d, float:1.9426161E38)
            goto L_0x00ee
        L_0x00bc:
            java.lang.String r0 = "pt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0091
            X.0nO r1 = X.AnonymousClass799.A00
            java.lang.String r0 = r9.getCountry()
            boolean r0 = r1.contains(r0)
            r1 = 2131890384(0x7f1210d0, float:1.9415458E38)
            if (r0 == 0) goto L_0x00ee
            r1 = 2131890385(0x7f1210d1, float:1.941546E38)
            goto L_0x00ee
        L_0x00d7:
            java.lang.String r0 = "zh"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0091
            java.lang.String r1 = "HK"
            java.lang.String r0 = r9.getCountry()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f3
            r1 = 2131890387(0x7f1210d3, float:1.9415464E38)
        L_0x00ee:
            java.lang.String r0 = r6.getString(r1)
            goto L_0x0099
        L_0x00f3:
            java.lang.String r1 = "Hans"
            java.lang.String r0 = X.C162307rf.A02(r9)
            boolean r0 = r1.equals(r0)
            r1 = 2131890388(0x7f1210d4, float:1.9415466E38)
            if (r0 == 0) goto L_0x00ee
            r1 = 2131890386(0x7f1210d2, float:1.9415462E38)
            goto L_0x00ee
        L_0x0106:
            java.util.Locale r7 = java.util.Locale.getDefault()
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OR.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4OR(Context context, C620733j r3, List list, boolean z) {
        super(context, R.layout.f8nameremoved);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = list;
        this.A03 = z;
    }

    public void A02(int i) {
    }
}
