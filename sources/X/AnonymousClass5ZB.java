package X;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.biz.BusinessHoursView;
import com.whatsapp.biz.BusinessProfileFieldView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ZB  reason: invalid class name */
public class AnonymousClass5ZB {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final C111095hX A03;
    public final C89654ea A04;
    public final InfoCard A05;
    public final C56972sr A06;
    public final BusinessHoursView A07;
    public final BusinessProfileFieldView A08;
    public final BusinessProfileFieldView A09;
    public final C48372en A0A;
    public final C106185Xy A0B;
    public final C108915dl A0C;
    public final AnonymousClass5ZU A0D;
    public final C620733j A0E;
    public final AnonymousClass3ZH A0F;
    public final C28071fd A0G;
    public final C105355Up A0H;
    public final Integer A0I;
    public final List A0J;
    public final List A0K;
    public final boolean A0L;

    /* JADX WARNING: type inference failed for: r15v3, types: [X.5ev] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C111095hX r15, com.whatsapp.biz.BusinessProfileFieldView r16, X.C106185Xy r17, X.C108915dl r18, X.C28071fd r19, java.lang.Integer r20, java.lang.String r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r6 = r16
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            if (r0 == 0) goto L_0x004d
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130968826(0x7f0400fa, float:1.7546317E38)
            r0 = 2131099946(0x7f06012a, float:1.781226E38)
            int r1 = X.AnonymousClass5Yj.A03(r2, r3, r1, r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            r0.setTextColor(r1)
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r20
            r10 = r21
            r2 = r22
            r14 = r23
            r12 = r24
            r13 = r25
            if (r22 == 0) goto L_0x0070
            r1 = 1
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            if (r2 == r1) goto L_0x004e
            java.lang.String r22 = X.C86614Ku.A0u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x004d
            X.5ev r15 = new X.5ev
            r23 = r12
            r24 = r13
            r25 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x004a:
            r6.setOnClickListener(r15)
        L_0x004d:
            return
        L_0x004e:
            java.lang.String r2 = X.C86614Ku.A0u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mailto:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            android.net.Uri r4 = android.net.Uri.parse(r0)
            X.5eu r15 = new X.5eu
            r3 = r15
            r11 = r12
            r12 = r13
            r13 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x004a
        L_0x0070:
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            java.lang.String r1 = X.C86614Ku.A0u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r4 = X.C1448073a.A00(r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            java.lang.String r0 = X.C86614Ku.A0u(r0)
            if (r0 == 0) goto L_0x011c
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r6.A04
            if (r1 == 0) goto L_0x011c
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A03
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = X.C86614Ku.A0u(r1)
            boolean r0 = A01(r0)
            boolean r1 = X.AnonymousClass000.A1S(r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            java.lang.String r0 = X.C86614Ku.A0u(r0)
            java.lang.String r0 = X.C1448073a.A00(r0)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x011c
            if (r2 == 0) goto L_0x011c
            java.util.List r0 = r2.getPathSegments()
            int r0 = r0.size()
            if (r0 == 0) goto L_0x011c
            r0 = 2131232017(0x7f080511, float:1.8080131E38)
            r6.setIcon((int) r0)
            r0 = 2131887134(0x7f12041e, float:1.9408867E38)
            java.lang.String r1 = X.C86624Kv.A0b(r6, r0)
            r0 = 0
            r6.setText(r1, r0)
            java.util.List r0 = r2.getPathSegments()
            java.lang.Object r0 = X.C18290x4.A0k(r0)
            java.lang.String r0 = (java.lang.String) r0
            r6.setSubText(r0)
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130968765(0x7f0400bd, float:1.7546193E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r2 = X.AnonymousClass5Yj.A03(r2, r3, r1, r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131101328(0x7f060690, float:1.7815063E38)
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A04
            r0.setTextColor(r2)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A03
            r0.setTextColor(r1)
            r11 = 1
        L_0x00fe:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://l.wl.co/l?u="
            r1.append(r0)
            java.lang.String r0 = android.net.Uri.encode(r4)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.net.Uri r4 = android.net.Uri.parse(r0)
            X.5ey r3 = new X.5ey
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r6.setOnClickListener(r3)
            return
        L_0x011c:
            r11 = 0
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZB.A00(X.5hX, com.whatsapp.biz.BusinessProfileFieldView, X.5Xy, X.5dl, X.1fd, java.lang.Integer, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public final void A02(View view) {
        int A012;
        int i;
        BusinessProfileFieldView businessProfileFieldView = this.A08;
        View A022 = C06560Yg.A02(businessProfileFieldView, R.id.field_textview);
        if (TextUtils.isEmpty(C86614Ku.A0u(businessProfileFieldView.A04))) {
            A022.setVisibility(8);
        } else {
            A022.setVisibility(0);
        }
        boolean isEmpty = TextUtils.isEmpty(C86614Ku.A0u(businessProfileFieldView.A04));
        Resources resources = A022.getResources();
        int i2 = R.dimen.f6nameremoved;
        if (isEmpty) {
            i2 = R.dimen.f6nameremoved;
        }
        int A013 = AnonymousClass4L0.A01(resources, i2);
        C620733j r2 = this.A0E;
        if (C620733j.A04(r2)) {
            A012 = 0;
        } else {
            A012 = AnonymousClass4L0.A01(A022.getResources(), R.dimen.f6nameremoved);
        }
        if (C620733j.A04(r2)) {
            i = AnonymousClass4L0.A01(A022.getResources(), R.dimen.f6nameremoved);
        } else {
            i = 0;
        }
        view.setPadding(A012, A013, i, AnonymousClass4L0.A01(A022.getResources(), R.dimen.f6nameremoved));
        view.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0345  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C108985dt r28) {
        /*
            r27 = this;
            r1 = r28
            X.5da r6 = r1.A07
            java.lang.String r8 = r6.A03
            r0 = r27
            X.2en r2 = r0.A0A
            int r2 = r2.A00()
            r2 = r2 & 8
            if (r2 <= 0) goto L_0x004b
            X.4ea r12 = r0.A04
            X.5dH r2 = r6.A00
            java.lang.String r13 = r2.A01
            java.lang.String r11 = r6.A02
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r10 = 1
            r9 = 0
            r7 = 2
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x0270
            r4 = 2131888782(0x7f120a8e, float:1.941221E38)
            java.lang.Object[] r3 = X.AnonymousClass0x9.A1X()
            r3[r9] = r8
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L_0x0035
            r13 = r5
        L_0x0035:
            r3[r10] = r13
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L_0x003e
            r11 = r5
        L_0x003e:
            r3[r7] = r11
        L_0x0040:
            java.lang.String r2 = r12.getString(r4, r3)
            if (r2 == 0) goto L_0x004a
            java.lang.String r5 = r2.trim()
        L_0x004a:
            r8 = r5
        L_0x004b:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r7 = 0
            if (r2 == 0) goto L_0x0182
            X.5Up r2 = r0.A0H
            X.1VX r3 = r2.A03
            boolean r2 = X.C86634Kw.A1a(r3)
            if (r2 == 0) goto L_0x0182
            r2 = 1810(0x712, float:2.536E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x0182
            java.util.List r5 = r1.A0T
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0182
            com.whatsapp.biz.BusinessProfileFieldView r10 = r0.A08
            X.33j r2 = r0.A0E
            java.util.Locale r6 = X.C620733j.A02(r2)
            android.content.Context r3 = r10.getContext()
            r2 = 2131886717(0x7f12027d, float:1.940802E38)
            java.lang.String r4 = r3.getString(r2)
            java.lang.Object[] r3 = X.AnonymousClass002.A0L()
            r9 = 0
            java.lang.Object r2 = r5.get(r9)
            X.5dW r2 = (X.C108765dW) r2
            java.lang.String r2 = r2.A03
            r3[r9] = r2
            java.lang.String r2 = java.lang.String.format(r6, r4, r3)
            r10.setText(r2, r7)
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x011c
            X.1fd r11 = r0.A0G
            android.content.Context r2 = r10.getContext()
            boolean r2 = r11.A05(r2)
            if (r2 == 0) goto L_0x011c
            java.lang.Object r12 = r5.get(r9)
            X.5dW r12 = (X.C108765dW) r12
            android.view.View r4 = r0.A02
            r2 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            android.view.ViewGroup r3 = X.C86644Kx.A0J(r4, r2)
            X.4ea r5 = r0.A04
            r2 = 2131624248(0x7f0e0138, float:1.887567E38)
            android.view.View.inflate(r5, r2, r3)
            r2 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r8 = r4.findViewById(r2)
            r2 = 2131431168(0x7f0b0f00, float:1.8484058E38)
            android.view.View r6 = r4.findViewById(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "geo:0,0?q="
            r3.append(r2)
            java.lang.String r2 = r12.A03
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r3)
            android.content.Intent r4 = X.C18300x5.A08(r2)
            r3 = 17
            X.5f3 r2 = new X.5f3
            r2.<init>((java.lang.Object) r0, (int) r3, (java.lang.Object) r4)
            if (r6 == 0) goto L_0x00eb
            r6.setOnClickListener(r2)
        L_0x00eb:
            r10.setOnClickListener(r2)
            r2 = 2131431179(0x7f0b0f0b, float:1.848408E38)
            android.view.ViewGroup r7 = X.C86664Kz.A0m(r5, r2)
            android.content.Context r2 = r7.getContext()
            X.4un r6 = new X.4un
            r6.<init>(r2)
            double r4 = r12.A00
            double r2 = r12.A01
            com.google.android.gms.maps.model.LatLng r3 = X.AnonymousClass4L0.A0H(r4, r2)
            int r2 = r12.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.A04(r3, r11, r2)
            r2 = -1
            r7.addView(r6, r2, r2)
            r6.setVisibility(r9)
            r0.A02(r8)
            r10.setVisibility(r9)
        L_0x011c:
            java.util.List r2 = r0.A0K
            java.util.Iterator r6 = r2.iterator()
            r4 = 0
        L_0x0123:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0289
            java.lang.Object r8 = r6.next()
            com.whatsapp.biz.BusinessProfileFieldView r8 = (com.whatsapp.biz.BusinessProfileFieldView) r8
            int r5 = r4 + 1
            java.util.List r3 = r1.A0U
            int r2 = r3.size()
            if (r4 >= r2) goto L_0x0180
            java.lang.String r4 = X.AnonymousClass001.A0n(r3, r4)
        L_0x013d:
            boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x0147
            boolean r2 = A01(r4)
            if (r2 != 0) goto L_0x017e
        L_0x0147:
            r2 = 0
            r8.setText(r2, r2)
            r8.setSubText(r2)
            r2 = 2131232020(0x7f080514, float:1.8080137E38)
            r8.setIcon((int) r2)
            r3 = 0
            r8.setText(r4, r3)
            X.5hX r7 = r0.A03
            X.1fd r11 = r0.A0G
            X.5Xy r9 = r0.A0B
            r14 = 0
            X.3ZH r2 = r0.A0F
            if (r2 == 0) goto L_0x0167
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3ZH.A07(r2)
        L_0x0167:
            java.lang.String r13 = X.C627336j.A07(r3)
            boolean r15 = r2.A0R()
            X.5dl r10 = r0.A0C
            java.lang.Integer r12 = r0.A0I
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r17 = r2
            r16 = r3
            A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x017e:
            r4 = r5
            goto L_0x0123
        L_0x0180:
            r4 = 0
            goto L_0x013d
        L_0x0182:
            com.whatsapp.biz.BusinessProfileFieldView r14 = r0.A08
            r14.setText(r8, r7)
            X.5hX r13 = r0.A03
            X.1fd r5 = r0.A0G
            X.5Xy r15 = r0.A0B
            r20 = 2
            X.3ZH r4 = r0.A0F
            if (r4 != 0) goto L_0x024d
            r2 = 0
        L_0x0194:
            java.lang.String r19 = X.C627336j.A07(r2)
            boolean r21 = r4.A0R()
            X.5dl r8 = r0.A0C
            java.lang.Integer r7 = r0.A0I
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r18 = r7
            r22 = r3
            r23 = r2
            r17 = r5
            r16 = r8
            A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            android.view.View r8 = r0.A02
            r2 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            android.view.ViewGroup r3 = X.C86644Kx.A0J(r8, r2)
            X.5dH r2 = r6.A00
            java.lang.Double r13 = r2.A02
            r6 = 0
            if (r13 == 0) goto L_0x0253
            java.lang.Double r12 = r2.A03
            if (r12 == 0) goto L_0x0253
            X.4ea r9 = r0.A04
            r2 = 2131624248(0x7f0e0138, float:1.887567E38)
            android.view.View.inflate(r9, r2, r3)
            r2 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r7 = r8.findViewById(r2)
            r2 = 2131431168(0x7f0b0f00, float:1.8484058E38)
            android.view.View r10 = r8.findViewById(r2)
            double r2 = r13.doubleValue()
            com.google.android.gms.maps.model.LatLng r8 = X.C86624Kv.A0H(r12, r2)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r2 = r14.A04
            java.lang.String r11 = X.C86614Ku.A0u(r2)
            X.5ZU r2 = r0.A0D
            java.lang.String r4 = r2.A0H(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "geo:0,0?q="
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = ","
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = "("
            r3.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L_0x020f
            r11 = r4
        L_0x020f:
            r3.append(r11)
            java.lang.String r2 = X.AnonymousClass000.A0e(r3)
            android.content.Intent r4 = X.C18300x5.A08(r2)
            r3 = 16
            X.5f3 r2 = new X.5f3
            r2.<init>((java.lang.Object) r0, (int) r3, (java.lang.Object) r4)
            r10.setOnClickListener(r2)
            r14.setOnClickListener(r2)
            r2 = 2131431179(0x7f0b0f0b, float:1.848408E38)
            android.view.ViewGroup r4 = X.C86664Kz.A0m(r9, r2)
            android.content.Context r2 = r4.getContext()
            com.whatsapp.location.WaMapView r3 = new com.whatsapp.location.WaMapView
            r3.<init>(r2)
            r2 = 0
            r3.A01(r8, r2, r5)
            r3.A00(r8)
            r2 = -1
            r4.addView(r3, r2, r2)
            r3.setVisibility(r6)
            r0.A02(r7)
            r14.setVisibility(r6)
            goto L_0x011c
        L_0x024d:
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass3ZH.A07(r4)
            goto L_0x0194
        L_0x0253:
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r2 = r14.A04
            java.lang.String r2 = X.C86614Ku.A0u(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0262
            r14.setVisibility(r6)
        L_0x0262:
            r2 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r2 = r3.findViewById(r2)
            if (r2 == 0) goto L_0x011c
            r3.removeView(r2)
            goto L_0x011c
        L_0x0270:
            r4 = 2131888783(0x7f120a8f, float:1.9412211E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L_0x027c
            r13 = r5
        L_0x027c:
            r3[r9] = r13
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L_0x0285
            r11 = r5
        L_0x0285:
            r3[r10] = r11
            goto L_0x0040
        L_0x0289:
            boolean r2 = r0.A0L
            if (r2 == 0) goto L_0x02f6
            java.util.List r2 = r0.A0J
            java.util.Iterator r6 = r2.iterator()
            r14 = 0
            r4 = 0
        L_0x0295:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x02f6
            java.lang.Object r8 = r6.next()
            com.whatsapp.biz.BusinessProfileFieldView r8 = (com.whatsapp.biz.BusinessProfileFieldView) r8
            int r5 = r4 + 1
            java.util.List r3 = r1.A0U
            int r2 = r3.size()
            if (r4 >= r2) goto L_0x02f4
            java.lang.String r4 = X.AnonymousClass001.A0n(r3, r4)
        L_0x02af:
            boolean r2 = A01(r4)
            if (r2 == 0) goto L_0x02f2
            com.whatsapp.InfoCard r3 = r0.A05
            if (r3 == 0) goto L_0x02f2
            r2 = 0
            r8.setText(r2, r2)
            r8.setSubText(r2)
            r2 = 2131232020(0x7f080514, float:1.8080137E38)
            r8.setIcon((int) r2)
            r3.setVisibility(r14)
            r3 = 0
            r8.setText(r4, r3)
            X.5hX r7 = r0.A03
            X.1fd r11 = r0.A0G
            X.5Xy r9 = r0.A0B
            X.3ZH r2 = r0.A0F
            if (r2 == 0) goto L_0x02db
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3ZH.A07(r2)
        L_0x02db:
            java.lang.String r13 = X.C627336j.A07(r3)
            boolean r15 = r2.A0R()
            X.5dl r10 = r0.A0C
            java.lang.Integer r12 = r0.A0I
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r17 = r2
            r16 = r3
            A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x02f2:
            r4 = r5
            goto L_0x0295
        L_0x02f4:
            r4 = 0
            goto L_0x02af
        L_0x02f6:
            java.lang.String r2 = r1.A0H
            com.whatsapp.biz.BusinessProfileFieldView r7 = r0.A09
            r3 = 0
            r7.setText(r2, r3)
            X.5hX r8 = r0.A03
            X.1fd r6 = r0.A0G
            X.5Xy r5 = r0.A0B
            r22 = 1
            X.3ZH r2 = r0.A0F
            if (r2 == 0) goto L_0x030e
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3ZH.A07(r2)
        L_0x030e:
            java.lang.String r14 = X.C627336j.A07(r3)
            boolean r16 = r2.A0R()
            X.5dl r4 = r0.A0C
            java.lang.Integer r2 = r0.A0I
            r26 = r2
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r9 = r7
            r10 = r5
            r11 = r4
            r12 = r6
            r13 = r26
            r15 = r22
            r17 = r3
            r18 = r2
            A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.whatsapp.biz.BusinessHoursView r12 = r0.A07
            X.5dQ r11 = r1.A03
            com.whatsapp.jid.UserJid r2 = r1.A08
            java.lang.String r23 = r2.getRawString()
            boolean r2 = r0.A01
            r24 = r2
            boolean r2 = r0.A00
            r25 = r2
            r2 = 8
            if (r11 == 0) goto L_0x0496
            r2 = 2131428285(0x7f0b03bd, float:1.847821E38)
            android.view.View r21 = X.C06560Yg.A02(r12, r2)
            X.33j r14 = r12.A04
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r2 = 7
            int r3 = r3.get(r2)
            r13 = 0
        L_0x0358:
            int[] r10 = X.AnonymousClass77S.A00
            int r9 = r10.length
            if (r13 >= r9) goto L_0x0364
            r2 = r10[r13]
            if (r2 == r3) goto L_0x0366
            int r13 = r13 + 1
            goto L_0x0358
        L_0x0364:
            int r13 = r9 + -1
        L_0x0366:
            r2 = 7
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>(r2)
            java.util.List r2 = r11.A02
            java.util.Iterator r5 = r2.iterator()
        L_0x0372:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0397
            java.lang.Object r4 = r5.next()
            X.7yB r4 = (X.C166127yB) r4
            int r2 = r4.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r2 = r8.containsKey(r3)
            if (r2 != 0) goto L_0x038d
            X.C86624Kv.A1R(r3, r8)
        L_0x038d:
            java.lang.Object r2 = r8.get(r3)
            java.util.List r2 = (java.util.List) r2
            r2.add(r4)
            goto L_0x0372
        L_0x0397:
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()
            r7 = r13
        L_0x039c:
            int r2 = r9 + r13
            if (r7 >= r2) goto L_0x0452
            int r2 = r7 % r9
            r2 = r10[r2]
            java.lang.Object r3 = X.C18290x4.A0j(r8, r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.String r20 = X.C107505bQ.A01(r14, r2)
            if (r3 != 0) goto L_0x03bf
            r2 = 2131887138(0x7f120422, float:1.9408875E38)
            java.lang.String r3 = r14.A0B(r2)
        L_0x03b7:
            r2 = r20
            X.AnonymousClass0x2.A1F(r2, r3, r15)
            int r7 = r7 + 1
            goto L_0x039c
        L_0x03bf:
            int r4 = r3.size()
            r2 = r22
            if (r4 <= r2) goto L_0x03cc
            r2 = 19
            X.C86614Ku.A1U(r3, r2)
        L_0x03cc:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r19 = r3.iterator()
        L_0x03d4:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x044a
            java.lang.Object r3 = r19.next()
            X.7yB r3 = (X.C166127yB) r3
            int r4 = r3.A01
            if (r4 == 0) goto L_0x03f3
            r2 = r22
            if (r4 == r2) goto L_0x0439
            r2 = 2
            if (r4 != r2) goto L_0x03d4
            r2 = 2131887139(0x7f120423, float:1.9408877E38)
            java.lang.String r3 = r14.A0B(r2)
            goto L_0x03b7
        L_0x03f3:
            java.lang.Integer r2 = r3.A03
            int r18 = X.C86664Kz.A0K(r2)
            java.lang.Integer r2 = r3.A02
            int r17 = X.C86664Kz.A0K(r2)
            java.util.Locale r16 = X.C620733j.A02(r14)
            java.util.Calendar r5 = java.util.Calendar.getInstance(r16)
            int r2 = r18 / 60
            r3 = 11
            r5.set(r3, r2)
            r4 = 12
            int r2 = r18 % 60
            r5.set(r4, r2)
            r4 = 13
            r2 = 0
            r5.set(r4, r2)
            java.util.Calendar r4 = java.util.Calendar.getInstance(r16)
            int r2 = r17 / 60
            r4.set(r3, r2)
            r3 = 12
            int r2 = r17 % 60
            r4.set(r3, r2)
            r3 = 13
            r2 = 0
            r4.set(r3, r2)
            java.lang.String r2 = X.C107145am.A04(r14, r5, r4)
            r6.add(r2)
            goto L_0x03d4
        L_0x0439:
            r2 = 2131887140(0x7f120424, float:1.9408879E38)
            java.util.Locale r3 = X.C620733j.A02(r14)
            java.lang.String r2 = r14.A0B(r2)
            java.lang.String r3 = X.C162307rf.A06(r3, r2)
            goto L_0x03b7
        L_0x044a:
            java.lang.String r2 = "\n"
            java.lang.String r3 = android.text.TextUtils.join(r2, r6)
            goto L_0x03b7
        L_0x0452:
            int r2 = r15.size()
            if (r2 == 0) goto L_0x0499
            r3 = 8
            r2 = r21
            r2.setVisibility(r3)
            android.content.res.Resources r2 = X.C18290x4.A0G(r12)
            r5 = 2131166750(0x7f07061e, float:1.7947754E38)
            int r4 = r2.getDimensionPixelSize(r5)
            int r3 = r12.getPaddingTop()
            android.content.res.Resources r2 = X.C18290x4.A0G(r12)
            int r2 = r2.getDimensionPixelSize(r5)
            X.C86654Ky.A15(r12, r4, r3, r2)
            com.whatsapp.biz.BusinessHoursContentView r4 = r12.A01
            X.2sH r2 = r12.A03
            long r2 = r2.A0H()
            r4.setupWithOpenNow(r15, r2, r11)
            X.7zH r2 = new X.7zH
            r20 = r2
            r21 = r12
            r22 = r26
            r20.<init>(r21, r22, r23, r24, r25)
            r12.setOnClickListener(r2)
            r12.A02()
            r2 = 0
        L_0x0496:
            r12.setVisibility(r2)
        L_0x0499:
            X.7xy r4 = r1.A05
            r3 = 1
            if (r4 == 0) goto L_0x04a6
            X.5dX r2 = r4.A00
            if (r2 != 0) goto L_0x04ba
            X.5dX r2 = r4.A01
            if (r2 != 0) goto L_0x04ba
        L_0x04a6:
            r2 = 0
        L_0x04a7:
            r0.A01 = r2
            X.7yC r1 = r1.A04
            if (r1 == 0) goto L_0x04b8
            java.lang.String r1 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04b8
        L_0x04b5:
            r0.A00 = r3
            return
        L_0x04b8:
            r3 = 0
            goto L_0x04b5
        L_0x04ba:
            r2 = 1
            goto L_0x04a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZB.A03(X.5dt):void");
    }

    public AnonymousClass5ZB(View view, C111095hX r5, C89654ea r6, C56972sr r7, C48372en r8, C106185Xy r9, C108915dl r10, AnonymousClass5ZU r11, C620733j r12, AnonymousClass3ZH r13, C28071fd r14, C105355Up r15, Integer num, boolean z, boolean z2) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0K = A0s;
        ArrayList A0s2 = AnonymousClass001.A0s();
        this.A0J = A0s2;
        this.A06 = r7;
        this.A03 = r5;
        this.A0G = r14;
        this.A0D = r11;
        this.A0E = r12;
        this.A0A = r8;
        this.A0H = r15;
        this.A0B = r9;
        this.A02 = view;
        this.A0C = r10;
        this.A0I = num;
        this.A08 = (BusinessProfileFieldView) view.findViewById(R.id.business_location);
        this.A09 = (BusinessProfileFieldView) view.findViewById(R.id.business_email);
        A0s.add(view.findViewById(R.id.business_link));
        A0s.add(view.findViewById(R.id.business_link_2));
        InfoCard infoCard = null;
        boolean z3 = z;
        if (z) {
            A0s2.add(view.findViewById(R.id.brand_link));
            A0s2.add(view.findViewById(R.id.brand_link_2));
            infoCard = (InfoCard) view.findViewById(R.id.brand_link_card);
        }
        this.A05 = infoCard;
        this.A07 = (BusinessHoursView) view.findViewById(R.id.business_hours);
        this.A04 = r6;
        this.A0F = r13;
        this.A0L = z3;
        this.A01 = z2;
    }

    public static boolean A01(String str) {
        Uri parse = Uri.parse(C1448073a.A00(str));
        if (parse.getHost().equalsIgnoreCase("www.instagram.com") || parse.getHost().equalsIgnoreCase("instagram.com") || parse.getHost().equalsIgnoreCase("instagr.am") || parse.getHost().equalsIgnoreCase("www.instagr.am")) {
            return true;
        }
        return false;
    }
}
