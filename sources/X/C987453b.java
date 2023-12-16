package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.WrapIconTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.53b  reason: invalid class name and case insensitive filesystem */
public final class C987453b extends C88504Yz {
    public ImageView A00;
    public WaTextView A01;
    public final View A02;
    public final ViewStub A03;
    public final ViewStub A04;
    public final AnonymousClass5YB A05;
    public final WaTextView A06;
    public final WrapIconTextView A07;
    public final ThumbnailButton A08;
    public final C105365Uq A09;
    public final AnonymousClass5UP A0A;
    public final C104055Pl A0B;
    public final UpdatesAdapter A0C;
    public final AnonymousClass5L0 A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C987453b(View view, AnonymousClass64J r3, C105365Uq r4, AnonymousClass5UP r5, C104055Pl r6, UpdatesAdapter updatesAdapter, AnonymousClass5L0 r8) {
        super(view);
        C18270x1.A11(r4, 3, r3);
        C162457s7.A0J(r5, 7);
        this.A0C = updatesAdapter;
        this.A09 = r4;
        this.A0B = r6;
        this.A0D = r8;
        this.A0A = r5;
        this.A07 = (WrapIconTextView) C18290x4.A0M(view, R.id.newsletter_message);
        this.A08 = (ThumbnailButton) C18290x4.A0M(view, R.id.contact_thumbnail);
        this.A05 = AnonymousClass5YB.A00(view, r3, R.id.newsletter_contact_name);
        this.A04 = (ViewStub) C18290x4.A0M(view, R.id.unread_indicator_view_stub);
        this.A03 = (ViewStub) C18290x4.A0M(view, R.id.media_preview_view_stub);
        this.A06 = (WaTextView) C18290x4.A0M(view, R.id.post_time_text);
        this.A02 = C18290x4.A0M(view, R.id.metadata_container);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d7, code lost:
        if (r0 != false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        if (r2.A0M(r1) != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (r3.A04.A03(r5.A1w()) != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0184, code lost:
        if (r2.A0B != X.C372321l.GEOSUSPENDED) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A07(X.AnonymousClass5C8 r14, java.util.List r15) {
        /*
            r13 = this;
            r6 = 0
            X.536 r14 = (X.AnonymousClass536) r14
            r0 = 0
            X.C162457s7.A0J(r14, r0)
            X.5Uq r2 = r13.A09
            X.3ZH r1 = r14.A00
            com.whatsapp.components.button.ThumbnailButton r0 = r13.A08
            r2.A08(r0, r1)
            X.3ZH r5 = r14.A00
            X.5YB r3 = r13.A05
            X.5ZU r0 = r3.A03
            r7 = -1
            X.7HU r4 = r0.A0B(r5, r7)
            r8 = 0
            r3.A07(r4, r5, r6, r7, r8)
            com.whatsapp.TextEmojiLabel r0 = r3.A02
            X.C106905aM.A04(r0)
            X.C107295b4.A02(r0)
            X.5L0 r3 = r13.A0D
            X.1RL r2 = r14.A03
            X.34x r9 = r14.A04
            X.5UP r5 = r3.A05
            boolean r0 = r2.A0M(r5)
            if (r0 == 0) goto L_0x016f
            android.content.Context r1 = r3.A00
            r0 = 2131894181(0x7f121fa5, float:1.942316E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x003e:
            boolean r0 = r2.A0M(r5)
            if (r0 != 0) goto L_0x005a
            boolean r0 = X.C18300x5.A1S(r5)
            if (r0 == 0) goto L_0x0102
            X.1VX r1 = r5.A01
            r0 = 5161(0x1429, float:7.232E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0102
            X.21l r1 = r2.A0B
            X.21l r0 = X.C372321l.GEOSUSPENDED
            if (r1 != r0) goto L_0x0102
        L_0x005a:
            r1 = 2131233159(0x7f080987, float:1.8082448E38)
        L_0x005d:
            android.content.Context r0 = r3.A00
            android.graphics.drawable.Drawable r5 = X.C107335b8.A01(r0, r1)
            X.C162457s7.A0D(r5)
        L_0x0066:
            com.whatsapp.WrapIconTextView r6 = r13.A07
            X.C162457s7.A0J(r6, r8)
            r6.getContext()
            android.graphics.Typeface r7 = X.C106905aM.A01()
            boolean r0 = r9 instanceof X.C30441mS
            if (r0 != 0) goto L_0x0083
            X.5UP r1 = r13.A0A
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x0083
            boolean r1 = r2.A0M(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0084
        L_0x0083:
            r0 = 2
        L_0x0084:
            r6.setTypeface(r7, r0)
            if (r4 == 0) goto L_0x00b4
            java.lang.String r0 = "[\\s\\t\\r\\n]+"
            X.5rB r1 = new X.5rB
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = " "
            java.lang.String r7 = r1.A00(r4, r0)
            boolean r0 = r2.A0K()
            r4 = 0
            if (r0 == 0) goto L_0x00b1
            X.1VX r1 = r3.A03
            r0 = 6756(0x1a64, float:9.467E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00b1
            if (r9 == 0) goto L_0x00b1
            android.content.Context r1 = r3.A00
            X.2sH r0 = r3.A01
            android.graphics.drawable.Drawable r4 = X.C106485Ze.A00(r1, r0, r9)
        L_0x00b1:
            r6.A0L(r5, r4, r7)
        L_0x00b4:
            X.5UP r4 = r13.A0A
            boolean r0 = r2.A0M(r4)
            if (r0 != 0) goto L_0x02c7
            if (r9 == 0) goto L_0x02c7
            boolean r6 = r9 instanceof X.AnonymousClass1n2
            if (r6 != 0) goto L_0x00e3
            boolean r0 = r9 instanceof X.C31971pB
            if (r0 != 0) goto L_0x00e3
            boolean r0 = r9 instanceof X.C31961pA
            if (r0 != 0) goto L_0x00e3
            boolean r0 = r9 instanceof X.C30481mW
            if (r0 == 0) goto L_0x02c7
            r5 = r9
            X.1mW r5 = (X.C30481mW) r5
            byte[] r0 = r5.A1z()
            if (r0 == 0) goto L_0x02c7
            X.5Zz r1 = r3.A04
            java.lang.String r0 = r5.A1w()
            java.lang.String r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x02c7
        L_0x00e3:
            android.view.ViewStub r0 = r13.A03
            r0.setVisibility(r8)
            android.widget.ImageView r8 = r13.A00
            if (r8 != 0) goto L_0x029c
            android.view.View r1 = r13.A0H
            r0 = 2131431301(0x7f0b0f85, float:1.8484327E38)
            android.view.View r8 = X.C18290x4.A0M(r1, r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r13.A00 = r8
            if (r8 != 0) goto L_0x029c
            java.lang.String r0 = "mediaPreviewImage"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0102:
            if (r9 == 0) goto L_0x016c
            boolean r0 = r9 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x010d
            r1 = 2131233179(0x7f08099b, float:1.8082488E38)
            goto L_0x005d
        L_0x010d:
            boolean r0 = r9 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0116
            r1 = 2131233217(0x7f0809c1, float:1.8082565E38)
            goto L_0x005d
        L_0x0116:
            boolean r0 = r9 instanceof X.C31961pA
            if (r0 == 0) goto L_0x011f
            r1 = 2131233173(0x7f080995, float:1.8082476E38)
            goto L_0x005d
        L_0x011f:
            boolean r0 = r9 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0128
            r1 = 2131233211(0x7f0809bb, float:1.8082553E38)
            goto L_0x005d
        L_0x0128:
            boolean r0 = r9 instanceof X.C30481mW
            r5 = 0
            if (r0 == 0) goto L_0x0147
            r6 = r9
            X.1mW r6 = (X.C30481mW) r6
            byte[] r0 = r6.A1z()
            if (r0 == 0) goto L_0x0066
            X.5Zz r1 = r3.A04
            java.lang.String r0 = r6.A1w()
            java.lang.String r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0066
            r1 = 2131234190(0x7f080d8e, float:1.8084539E38)
            goto L_0x005d
        L_0x0147:
            boolean r0 = r9 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0156
            r1 = r9
            X.1mu r1 = (X.C30721mu) r1
            android.content.Context r0 = r3.A00
            android.graphics.drawable.Drawable r5 = X.AnonymousClass5YN.A00(r0, r1)
            goto L_0x0066
        L_0x0156:
            boolean r0 = r9 instanceof X.C30441mS
            if (r0 != 0) goto L_0x005a
            boolean r0 = r9 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0163
            r1 = 2131233215(0x7f0809bf, float:1.8082561E38)
            goto L_0x005d
        L_0x0163:
            boolean r0 = r9 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0066
            r1 = 2131233200(0x7f0809b0, float:1.808253E38)
            goto L_0x005d
        L_0x016c:
            r5 = 0
            goto L_0x0066
        L_0x016f:
            boolean r0 = X.C18300x5.A1S(r5)
            if (r0 == 0) goto L_0x0186
            X.1VX r1 = r5.A01
            r0 = 5161(0x1429, float:7.232E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0186
            X.21l r4 = r2.A0B
            X.21l r1 = X.C372321l.GEOSUSPENDED
            r0 = 1
            if (r4 == r1) goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            r6 = 1
            if (r0 == 0) goto L_0x01aa
            X.2g1 r1 = r3.A06
            java.lang.String r0 = r1.A00()
            java.lang.String r4 = r1.A01(r0)
            android.content.Context r1 = r3.A00
            if (r4 != 0) goto L_0x01a1
            r0 = 2131891136(0x7f1213c0, float:1.9416984E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x003e
        L_0x01a1:
            r0 = 2131889660(0x7f120dfc, float:1.941399E38)
            java.lang.String r4 = X.AnonymousClass0x2.A0X(r1, r4, r6, r0)
            goto L_0x003e
        L_0x01aa:
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x01bd
            android.content.Context r7 = r3.A00
            r4 = 2131887617(0x7f120601, float:1.9409846E38)
        L_0x01b3:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r2.A0H
            java.lang.String r4 = X.AnonymousClass002.A0F(r7, r0, r1, r8, r4)
            goto L_0x003e
        L_0x01bd:
            if (r9 == 0) goto L_0x01cc
            boolean r0 = r9 instanceof X.C30481mW
            if (r0 == 0) goto L_0x01e8
            r0 = r9
            X.1mW r0 = (X.C30481mW) r0
            java.lang.String r4 = r0.A1w()
            goto L_0x003e
        L_0x01cc:
            boolean r0 = r2.A0K()
            if (r0 == 0) goto L_0x01d8
            android.content.Context r7 = r3.A00
            r4 = 2131891220(0x7f121414, float:1.9417154E38)
            goto L_0x01b3
        L_0x01d8:
            X.21q r1 = r2.A07
            X.21q r0 = X.C372821q.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0299
            android.content.Context r7 = r3.A00
            r4 = 2131891221(0x7f121415, float:1.9417156E38)
            goto L_0x01b3
        L_0x01e8:
            boolean r0 = r9 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x01f7
            android.content.Context r1 = r3.A00
            r0 = r9
            X.1n2 r0 = (X.AnonymousClass1n2) r0
            java.lang.String r4 = X.C106485Ze.A01(r1, r0)
            goto L_0x003e
        L_0x01f7:
            boolean r0 = r9 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0206
            android.content.Context r1 = r3.A00
            r0 = r9
            X.1pB r0 = (X.C31971pB) r0
            java.lang.String r4 = X.C106485Ze.A02(r1, r0)
            goto L_0x003e
        L_0x0206:
            boolean r0 = r9 instanceof X.C31961pA
            if (r0 == 0) goto L_0x0224
            android.content.Context r4 = r3.A00
            r1 = r9
            X.1mV r1 = (X.C30471mV) r1
            boolean r0 = X.C86614Ku.A1Z(r1)
            if (r0 == 0) goto L_0x021e
            r0 = 2131888301(0x7f1208ad, float:1.9411233E38)
            java.lang.String r4 = r4.getString(r0)
            goto L_0x003e
        L_0x021e:
            java.lang.String r4 = r1.A1w()
            goto L_0x003e
        L_0x0224:
            boolean r0 = r9 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0233
            android.content.Context r4 = r3.A00
            r1 = 2131888312(0x7f1208b8, float:1.9411256E38)
        L_0x022d:
            java.lang.String r4 = r4.getString(r1)
            goto L_0x003e
        L_0x0233:
            boolean r0 = r9 instanceof X.C30721mu
            if (r0 == 0) goto L_0x025b
            r4 = r9
            X.1mV r4 = (X.C30471mV) r4
            android.content.Context r1 = r3.A00
            int r0 = r4.A09
            if (r0 != r6) goto L_0x0253
            int r0 = r4.A0B
            if (r0 == 0) goto L_0x024f
            X.33j r0 = r3.A02
            java.lang.String r4 = X.C107565bW.A0G(r0, r4)
        L_0x024a:
            X.C162457s7.A0H(r4)
            goto L_0x003e
        L_0x024f:
            r0 = 2131888317(0x7f1208bd, float:1.9411266E38)
            goto L_0x0256
        L_0x0253:
            r0 = 2131888295(0x7f1208a7, float:1.9411221E38)
        L_0x0256:
            java.lang.String r4 = r1.getString(r0)
            goto L_0x024a
        L_0x025b:
            boolean r0 = r9 instanceof X.C30441mS
            if (r0 == 0) goto L_0x027d
            X.2z0 r4 = r9.A1J
            X.4uZ r0 = r4.A00
            boolean r1 = r0 instanceof X.C95804uY
            boolean r0 = r4.A02
            android.content.Context r4 = r3.A00
            if (r1 == 0) goto L_0x0274
            r1 = 2131893219(0x7f121be3, float:1.9421208E38)
            if (r0 == 0) goto L_0x022d
            r1 = 2131893221(0x7f121be5, float:1.9421212E38)
            goto L_0x022d
        L_0x0274:
            r1 = 2131893218(0x7f121be2, float:1.9421206E38)
            if (r0 == 0) goto L_0x022d
            r1 = 2131893220(0x7f121be4, float:1.942121E38)
            goto L_0x022d
        L_0x027d:
            boolean r0 = r9 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0288
            r0 = r9
            X.1mT r0 = (X.C30451mT) r0
            java.lang.String r4 = r0.A03
            goto L_0x003e
        L_0x0288:
            boolean r0 = r9 instanceof X.C30351mJ
            r4 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = X.AnonymousClass2z0.A0C(r9)
            if (r0 == 0) goto L_0x003e
            android.content.Context r4 = r3.A00
            r1 = 2131891182(0x7f1213ee, float:1.9417077E38)
            goto L_0x022d
        L_0x0299:
            r4 = 0
            goto L_0x003e
        L_0x029c:
            r12 = 0
            r1 = 1
            if (r6 != 0) goto L_0x02a8
            boolean r0 = r9 instanceof X.C31971pB
            if (r0 != 0) goto L_0x02a8
            boolean r0 = r9 instanceof X.C31961pA
            if (r0 == 0) goto L_0x02bf
        L_0x02a8:
            r0 = r9
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r0.A03()
            if (r0 != r1) goto L_0x02bf
            X.1sV r7 = r3.A08
            X.8tp r10 = r3.A07
            X.2z0 r11 = r9.A1J
            r7.A0D(r8, r9, r10, r11, r12)
            goto L_0x02ce
        L_0x02bf:
            X.1sV r1 = r3.A08
            X.8tp r0 = r3.A07
            r1.A09(r8, r9, r0)
            goto L_0x02ce
        L_0x02c7:
            android.view.ViewStub r1 = r13.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x02ce:
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x02d9
            boolean r0 = r2.A0M(r4)
            r2 = 1
            if (r0 == 0) goto L_0x02da
        L_0x02d9:
            r2 = 0
        L_0x02da:
            android.view.View r1 = r13.A02
            int r0 = X.C86614Ku.A09(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x0301
            long r2 = r14.A02
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            android.view.ViewStub r1 = r13.A04
            if (r0 != 0) goto L_0x031f
            r0 = 8
            r1.setVisibility(r0)
        L_0x02f4:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            com.whatsapp.WaTextView r2 = r13.A06
            if (r0 != 0) goto L_0x030f
            java.lang.CharSequence r0 = r14.A05
        L_0x02fe:
            r2.setText(r0)
        L_0x0301:
            android.view.View r1 = r13.A0H
            r0 = 2131891128(0x7f1213b8, float:1.9416967E38)
            X.C107295b4.A03(r1, r0)
            r0 = 20
            X.C109495ei.A00(r1, r13, r14, r0)
            return
        L_0x030f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = " • "
            r1.append(r0)
            java.lang.CharSequence r0 = r14.A05
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            goto L_0x02fe
        L_0x031f:
            r7 = 0
            r1.setVisibility(r7)
            com.whatsapp.WaTextView r0 = r13.A01
            java.lang.String r4 = "unreadText"
            if (r0 != 0) goto L_0x0340
            android.view.View r1 = r13.A0H
            r0 = 2131434488(0x7f0b1bf8, float:1.8490791E38)
            android.view.View r0 = X.C18290x4.A0M(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r13.A01 = r0
            if (r0 != 0) goto L_0x033d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x033d:
            X.C106905aM.A04(r0)
        L_0x0340:
            com.whatsapp.WaTextView r6 = r13.A01
            if (r6 != 0) goto L_0x0349
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0349:
            r4 = 999(0x3e7, double:4.936E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x035e
            android.content.Context r1 = X.C86664Kz.A0T(r13)
            r0 = 2131891137(0x7f1213c1, float:1.9416986E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x035a:
            r6.setText(r0)
            goto L_0x02f4
        L_0x035e:
            X.5Pl r1 = r13.A0B
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.AnonymousClass000.A1Q(r0, r7, r2)
            r4 = 2131755228(0x7f1000dc, float:1.914133E38)
            X.33j r1 = r1.A01
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            java.lang.String r0 = r1.A0L(r0, r4, r2)
            X.C162457s7.A0D(r0)
            goto L_0x035a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C987453b.A07(X.5C8, java.util.List):void");
    }
}
