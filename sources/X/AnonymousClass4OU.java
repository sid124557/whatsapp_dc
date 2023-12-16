package X;

import android.widget.BaseAdapter;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.List;

/* renamed from: X.4OU  reason: invalid class name */
public class AnonymousClass4OU extends BaseAdapter {
    public List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ MyStatusesActivity A01;

    public AnonymousClass4OU(MyStatusesActivity myStatusesActivity) {
        this.A01 = myStatusesActivity;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r5 = r20
            r3 = r18
            if (r20 != 0) goto L_0x02d0
            com.whatsapp.status.playback.MyStatusesActivity r2 = r3.A01
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131625500(0x7f0e061c, float:1.887821E38)
            r4 = r21
            android.view.View r5 = X.AnonymousClass001.A0R(r1, r4, r0)
            X.5LA r0 = new X.5LA
            r0.<init>(r5, r2)
            r5.setTag(r0)
        L_0x001d:
            java.util.List r1 = r3.A00
            r2 = r19
            X.34x r4 = X.C18320x8.A0R(r1, r2)
            boolean r1 = r4 instanceof X.C30721mu
            r3 = 0
            if (r1 == 0) goto L_0x0253
            com.whatsapp.status.playback.MyStatusesActivity r2 = r0.A0A
            boolean r1 = r2.A0o
            if (r1 == 0) goto L_0x0253
            r1 = r4
            X.1mu r1 = (X.C30721mu) r1
            int r1 = X.AnonymousClass75C.A00(r2, r1)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass5C2.A00(r2, r1)
            com.whatsapp.status.ContactStatusThumbnail r1 = r0.A09
            r1.setImageDrawable(r2)
        L_0x0040:
            java.lang.String r1 = ""
            android.text.SpannableStringBuilder r9 = X.C18330xA.A00(r1)
            com.whatsapp.status.playback.MyStatusesActivity r8 = r0.A0A
            X.33p r1 = r8.A09
            boolean r17 = r1.A2G()
            android.widget.TextView r11 = r0.A06
            android.view.View r10 = r0.A00
            android.content.Context r1 = r10.getContext()
            r12 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r1, r11, r12)
            boolean r16 = X.C627636p.A0l(r4)
            r7 = 0
            r6 = 8
            if (r16 == 0) goto L_0x0188
            r11.setVisibility(r3)
            boolean r1 = X.C627636p.A0m(r4)
            if (r1 == 0) goto L_0x0073
            X.8qC r1 = r8.A0k
            r1.get()
        L_0x0073:
            r1 = 2131888573(0x7f1209bd, float:1.9411785E38)
        L_0x0076:
            r11.setText(r1)
        L_0x0079:
            java.util.Map r11 = r8.A11
            X.2z0 r2 = r4.A1J
            boolean r12 = r11.containsKey(r2)
            if (r12 == 0) goto L_0x0185
            int r1 = X.AnonymousClass5Yj.A05(r10)
        L_0x0087:
            r10.setBackgroundResource(r1)
            java.util.Set r1 = r8.A12
            boolean r10 = r1.remove(r2)
            com.whatsapp.components.SelectionCheckView r1 = r0.A08
            if (r10 == 0) goto L_0x0180
            android.view.ViewTreeObserver r10 = r1.getViewTreeObserver()
            X.5ff r1 = new X.5ff
            r1.<init>(r0, r12)
            r10.addOnPreDrawListener(r1)
        L_0x00a0:
            boolean r1 = r4 instanceof X.C30471mV
            if (r1 == 0) goto L_0x00a9
            r1 = r4
            X.1mV r1 = (X.C30471mV) r1
            X.33C r7 = r1.A01
        L_0x00a9:
            if (r16 == 0) goto L_0x00da
            android.widget.ProgressBar r1 = r0.A05
            r1.setVisibility(r3)
            android.widget.ImageView r10 = r0.A03
            r10.setVisibility(r6)
            android.view.View r2 = r0.A02
            r2.setVisibility(r6)
            boolean r1 = X.C627636p.A0m(r4)
            if (r1 == 0) goto L_0x00c5
            X.8qC r1 = r8.A0k
            r1.get()
        L_0x00c5:
            com.whatsapp.WaTextView r0 = r0.A07
            r11 = r0
        L_0x00c8:
            r0.setVisibility(r6)
        L_0x00cb:
            r10.setTag(r4)
            r11.setTag(r4)
            r2.setTag(r4)
            X.8qC r0 = r8.A0k
            r0.get()
            return r5
        L_0x00da:
            if (r7 == 0) goto L_0x00ed
            boolean r1 = r7.A0R
            if (r1 != 0) goto L_0x00ed
            boolean r1 = r4 instanceof X.C31971pB
            if (r1 == 0) goto L_0x0153
            r1 = r4
            X.1nB r1 = (X.AnonymousClass1nB) r1
            boolean r1 = X.AnonymousClass35Z.A04(r1)
            if (r1 == 0) goto L_0x0153
        L_0x00ed:
            boolean r1 = r11.isEmpty()
            r13 = 1
            r1 = r1 ^ 1
            android.widget.ImageView r10 = r0.A03
            if (r1 == 0) goto L_0x0149
            r10.setVisibility(r6)
        L_0x00fb:
            java.util.HashMap r1 = r8.A0y
            java.lang.Number r15 = X.AnonymousClass0x9.A0p(r2, r1)
            com.whatsapp.WaTextView r11 = r0.A07
            if (r15 != 0) goto L_0x0114
            r11.setVisibility(r6)
            com.whatsapp.status.playback.MyStatusesActivity.A0C(r4, r8, r3)
        L_0x010b:
            android.widget.ProgressBar r1 = r0.A05
            r1.setVisibility(r6)
        L_0x0110:
            android.view.View r0 = r0.A02
            r2 = r0
            goto L_0x00c8
        L_0x0114:
            r11.setVisibility(r3)
            X.33j r14 = r8.A0G
            r12 = 2131755398(0x7f100186, float:1.9141674E38)
            int r1 = r15.intValue()
            long r1 = (long) r1
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r3] = r15
            java.lang.String r7 = r14.A0L(r7, r12, r1)
            r11.setContentDescription(r7)
            if (r17 == 0) goto L_0x013f
            X.33j r12 = r8.A0G
            r9 = 2131755245(0x7f1000ed, float:1.9141364E38)
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r3] = r15
            java.lang.String r1 = r12.A0L(r7, r9, r1)
            r11.setText(r1)
            goto L_0x010b
        L_0x013f:
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x010b
            r11.setText(r9)
            goto L_0x010b
        L_0x0149:
            r10.setVisibility(r3)
            r1 = 2131890908(0x7f1212dc, float:1.9416521E38)
            X.C18300x5.A13(r8, r10, r1)
            goto L_0x00fb
        L_0x0153:
            android.widget.ImageView r10 = r0.A03
            r10.setVisibility(r6)
            com.whatsapp.WaTextView r11 = r0.A07
            r11.setVisibility(r6)
            boolean r1 = X.AnonymousClass4SG.A45(r8)
            if (r1 == 0) goto L_0x016c
            android.view.View r2 = r0.A02
            r2.setVisibility(r6)
            android.widget.ProgressBar r0 = r0.A05
            goto L_0x00c8
        L_0x016c:
            boolean r2 = r7.A0c
            android.widget.ProgressBar r1 = r0.A05
            if (r2 == 0) goto L_0x0176
            r1.setVisibility(r3)
            goto L_0x0110
        L_0x0176:
            r1.setVisibility(r6)
            android.view.View r2 = r0.A02
            r2.setVisibility(r3)
            goto L_0x00cb
        L_0x0180:
            r1.A06(r12, r3)
            goto L_0x00a0
        L_0x0185:
            r1 = 0
            goto L_0x0087
        L_0x0188:
            int r2 = r4.A0D
            r1 = 4
            int r1 = X.AnonymousClass358.A00(r2, r1)
            boolean r1 = X.AnonymousClass001.A1U(r1)
            if (r1 == 0) goto L_0x0229
            int r1 = X.AnonymousClass001.A08(r17)
            r11.setVisibility(r1)
            long r1 = r4.A0J
            r14 = 0
            int r13 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x01a6
            long r1 = r4.A0K
        L_0x01a6:
            X.2sH r14 = r8.A06
            X.33j r13 = r8.A0G
            java.lang.CharSequence r1 = X.C107565bW.A00(r14, r13, r1)
            android.text.SpannableStringBuilder r13 = X.C18330xA.A00(r1)
            com.whatsapp.bridge.wfal.WfalManager r1 = r8.A0A
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x01da
            X.30E r15 = r8.A0g
            android.content.Context r14 = r10.getContext()
            int r2 = r11.getLineHeight()
            android.content.res.Resources r1 = r8.getResources()
            int r1 = r1.getColor(r12)
            android.text.SpannableStringBuilder r1 = r15.A01(r14, r4, r2, r1)
        L_0x01d0:
            r13.append(r1)
        L_0x01d3:
            if (r17 == 0) goto L_0x0224
            r11.setText(r13)
            goto L_0x0079
        L_0x01da:
            X.5Se r1 = r8.A0j
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x01d3
            X.5YA r1 = r8.A0h
            boolean r2 = r1.A09(r4)
            X.5YA r1 = r8.A0h
            if (r2 == 0) goto L_0x0207
            android.content.Context r14 = r10.getContext()
            int r2 = r11.getLineHeight()
            android.content.res.Resources r1 = r8.getResources()
            int r12 = r1.getColor(r12)
            X.C162457s7.A0J(r14, r3)
            r1 = 2131232659(0x7f080793, float:1.8081434E38)
        L_0x0202:
            android.text.SpannableStringBuilder r1 = X.AnonymousClass5CR.A00(r14, r2, r1, r12)
            goto L_0x01d0
        L_0x0207:
            boolean r1 = r1.A08(r4)
            if (r1 == 0) goto L_0x01d3
            android.content.Context r14 = r10.getContext()
            int r2 = r11.getLineHeight()
            android.content.res.Resources r1 = r8.getResources()
            int r12 = r1.getColor(r12)
            X.C162457s7.A0J(r14, r3)
            r1 = 2131232660(0x7f080794, float:1.8081436E38)
            goto L_0x0202
        L_0x0224:
            r9.append(r13)
            goto L_0x0079
        L_0x0229:
            r11.setVisibility(r3)
            boolean r1 = r4 instanceof X.C30471mV
            if (r1 == 0) goto L_0x024e
            r1 = r4
            X.1mV r1 = (X.C30471mV) r1
            X.33C r2 = r1.A01
            if (r2 == 0) goto L_0x024e
            boolean r1 = r2.A0R
            if (r1 != 0) goto L_0x024e
            boolean r1 = r2.A0c
            if (r1 != 0) goto L_0x024e
            r1 = 2131893549(0x7f121d2d, float:1.9421878E38)
            android.content.Context r2 = X.C86654Ky.A0B(r10, r11, r1)
            r1 = 2131102498(0x7f060b22, float:1.7817436E38)
            X.AnonymousClass0x2.A0q(r2, r11, r1)
            goto L_0x0079
        L_0x024e:
            r1 = 2131893550(0x7f121d2e, float:1.942188E38)
            goto L_0x0076
        L_0x0253:
            boolean r1 = r4 instanceof X.C30471mV
            if (r1 == 0) goto L_0x0276
            r1 = r4
            X.1mV r1 = (X.C30471mV) r1
            X.33C r1 = X.C30471mV.A00(r1)
            boolean r7 = r1.A03()
            com.whatsapp.status.playback.MyStatusesActivity r1 = r0.A0A
            X.1sV r6 = r1.A0e
            com.whatsapp.status.ContactStatusThumbnail r2 = r0.A09
            X.3Wj r1 = r1.A0b
            if (r7 != 0) goto L_0x0271
            r6.A0A(r2, r4, r1)
            goto L_0x0040
        L_0x0271:
            r6.A09(r2, r4, r1)
            goto L_0x0040
        L_0x0276:
            byte r1 = r4.A1I
            if (r1 != 0) goto L_0x02c5
            com.whatsapp.status.playback.MyStatusesActivity r8 = r0.A0A
            X.5Zz r1 = r8.A0N
            java.lang.String r14 = X.C107415bH.A06(r1, r4)
            r1 = r4
            X.1mW r1 = (X.C30481mW) r1
            com.whatsapp.TextData r10 = r1.A02
            X.5Y0 r12 = r8.A0C
            X.33i r11 = r8.A08
            X.2y5 r13 = r8.A0O
            if (r14 == 0) goto L_0x029b
            int r2 = r14.length()
            r1 = 700(0x2bc, float:9.81E-43)
            if (r2 <= r1) goto L_0x029b
            java.lang.String r14 = r14.substring(r3, r1)
        L_0x029b:
            android.view.View r1 = r0.A00
            android.content.Context r2 = r1.getContext()
            X.C162457s7.A0J(r2, r3)
            if (r10 == 0) goto L_0x02bf
            int r1 = r10.fontStyle
            android.graphics.Typeface r9 = X.C107415bH.A04(r2, r1)
        L_0x02ac:
            X.4Ly r7 = new X.4Ly
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.status.ContactStatusThumbnail r6 = r0.A09
            float r2 = r6.A01
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            r7.A00 = r2
            r6.setImageDrawable(r7)
            goto L_0x0040
        L_0x02bf:
            android.graphics.Typeface r9 = android.graphics.Typeface.SANS_SERIF
            X.C162457s7.A0F(r9)
            goto L_0x02ac
        L_0x02c5:
            com.whatsapp.status.ContactStatusThumbnail r2 = r0.A09
            int r1 = X.AnonymousClass5C1.A00(r4)
            r2.setImageResource(r1)
            goto L_0x0040
        L_0x02d0:
            java.lang.Object r0 = r5.getTag()
            X.5LA r0 = (X.AnonymousClass5LA) r0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OU.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
