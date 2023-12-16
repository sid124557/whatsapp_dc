package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.location.WaMapView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4o7  reason: invalid class name and case insensitive filesystem */
public class C93194o7 extends C92414me {
    public static final Set A0I;
    public C116985rC A00;
    public C106055Xl A01;
    public AnonymousClass5PP A02;
    public C56072rN A03;
    public boolean A04;
    public final View A05 = findViewById(R.id.control_frame);
    public final View A06;
    public final View A07 = findViewById(R.id.progress_bar);
    public final View A08 = findViewById(R.id.thumb_button);
    public final FrameLayout A09;
    public final ImageView A0A = AnonymousClass0x9.A0F(this, R.id.thumb);
    public final LinearLayout A0B;
    public final TextView A0C = AnonymousClass002.A09(this, R.id.control_btn);
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final WaMapView A0G = ((WaMapView) findViewById(R.id.map_holder));
    public final AnonymousClass66v A0H;

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fb, code lost:
        if (r3.A04 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (r3 == 2) goto L_0x0145;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A22() {
        /*
            r22 = this;
            r14 = r22
            X.34x r1 = r14.A0S
            X.1n9 r1 = (X.AnonymousClass1n9) r1
            double r2 = r1.A01
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            double r2 = r1.A00
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x0014:
            android.view.View r2 = r14.A08
            r0 = 46
            X.C18320x8.A16(r2, r1, r14, r0)
            X.C93314oJ.A0q(r2, r14)
        L_0x001e:
            com.whatsapp.location.WaMapView r10 = r14.A0G
            X.1fd r0 = r14.A0Q
            X.C626936e.A06(r0)
            r10.A03(r0, r1)
            android.view.View r9 = r14.A05
            int r8 = X.C86664Kz.A0A(r9)
            android.view.View r7 = r14.A06
            r6 = 0
            if (r7 == 0) goto L_0x0062
            com.whatsapp.TextEmojiLabel r5 = r14.A0F
            if (r5 == 0) goto L_0x0062
            android.widget.TextView r4 = r14.A0E
            if (r4 == 0) goto L_0x0062
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0174
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0174
            r5.setVisibility(r8)
            r4.setVisibility(r8)
            android.widget.LinearLayout r0 = r14.A0B
            if (r0 == 0) goto L_0x0058
            r0.setBackgroundResource(r6)
        L_0x0058:
            android.widget.TextView r0 = r14.A0D
            if (r0 == 0) goto L_0x005f
            r0.setVisibility(r8)
        L_0x005f:
            r7.setVisibility(r6)
        L_0x0062:
            android.widget.TextView r4 = r14.A0C
            if (r4 == 0) goto L_0x0069
            r4.setVisibility(r8)
        L_0x0069:
            int r3 = r1.A02
            r0 = 1
            r2 = 0
            if (r3 != r0) goto L_0x0135
            android.view.View r0 = r14.A07
            if (r0 == 0) goto L_0x0076
            r0.setVisibility(r6)
        L_0x0076:
            X.2z0 r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0081
            r9.setVisibility(r6)
        L_0x0081:
            android.view.View r0 = r14.A08
            r0.setOnClickListener(r2)
        L_0x0086:
            r0 = 7
            X.5Ba r4 = new X.5Ba
            r4.<init>(r14, r0)
            int r3 = r10.getVisibility()
            X.1sV r2 = r14.A22
            X.C626936e.A06(r2)
            android.widget.ImageView r0 = r14.A0A
            if (r3 != 0) goto L_0x0130
            r2.A09(r0, r1, r4)
        L_0x009c:
            X.2U8 r2 = r1.A0c
            r0 = 2131434886(0x7f0b1d86, float:1.8491599E38)
            if (r2 == 0) goto L_0x011a
            android.view.ViewGroup r7 = X.C86644Kx.A0J(r14, r0)
            if (r7 == 0) goto L_0x0116
            X.1VX r2 = r14.A0O
            X.5Zz r0 = r14.A1Z
            X.32K r3 = X.AnonymousClass32K.A00(r2, r0, r1)
            r7.setVisibility(r6)
            X.5Xl r0 = r14.A01
            if (r0 != 0) goto L_0x00f2
            android.content.Context r11 = r14.getContext()
            X.679 r15 = r14.A0n
            X.4Fm r12 = r14.A0Y
            X.2rN r6 = r14.A03
            X.5nM r5 = r14.A1M
            X.1sV r4 = r14.A22
            X.5KC r13 = r14.A1B()
            X.5rC r2 = r14.A00
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x00d5
            r2.A04()
        L_0x00d5:
            X.1VX r0 = r14.A0O
            X.5Xl r10 = new X.5Xl
            r18 = r6
            r19 = r4
            r16 = r5
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r14.A01 = r10
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0D
            X.C86624Kv.A15(r0, r7)
            X.5Xl r0 = r14.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0D
            X.C93314oJ.A0q(r0, r14)
        L_0x00f2:
            X.66v r4 = r14.A0H
            boolean r0 = r4 instanceof X.C116505qO
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r3.A04
            r2 = 1
            if (r0 != 0) goto L_0x00fe
        L_0x00fd:
            r2 = 0
        L_0x00fe:
            r14.A04 = r2
            X.5Xl r5 = r14.A01
            X.5PP r0 = r14.A02
            boolean r10 = r0.A00(r1)
            X.5PP r0 = r14.A02
            boolean r11 = r0.A01(r1)
            r12 = 0
            r6 = r1
            r7 = r4
            r8 = r3
            r9 = r2
            r5.A04(r6, r7, r8, r9, r10, r11, r12)
        L_0x0116:
            r14.A1l(r1)
            return
        L_0x011a:
            android.view.ViewGroup r2 = X.C86644Kx.A0J(r14, r0)
            if (r2 == 0) goto L_0x0116
            X.5Xl r0 = r14.A01
            if (r0 == 0) goto L_0x012c
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0D
            r2.removeView(r0)
            r0 = 0
            r14.A01 = r0
        L_0x012c:
            r2.setVisibility(r8)
            goto L_0x0116
        L_0x0130:
            r2.A0A(r0, r1, r4)
            goto L_0x009c
        L_0x0135:
            X.34x r2 = r14.A0S
            X.1mK r2 = (X.C30361mK) r2
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0145
            int r3 = r2.A02
            r0 = 2
            r2 = 1
            if (r3 != r0) goto L_0x0146
        L_0x0145:
            r2 = 0
        L_0x0146:
            android.view.View r0 = r14.A07
            if (r2 != 0) goto L_0x0151
            if (r0 == 0) goto L_0x0086
            r0.setVisibility(r8)
            goto L_0x0086
        L_0x0151:
            if (r0 == 0) goto L_0x0156
            r0.setVisibility(r8)
        L_0x0156:
            if (r4 == 0) goto L_0x0166
            r4.setVisibility(r6)
            r0 = 2131893203(0x7f121bd3, float:1.9421176E38)
            r4.setText(r0)
            r0 = 36
            X.AnonymousClass54F.A00(r4, r14, r0)
        L_0x0166:
            if (r9 == 0) goto L_0x016b
            r9.setVisibility(r6)
        L_0x016b:
            android.view.View r2 = r14.A08
            r0 = 36
            X.AnonymousClass54F.A00(r2, r14, r0)
            goto L_0x0086
        L_0x0174:
            java.lang.String r0 = r1.A1x()
            boolean r11 = android.text.TextUtils.isEmpty(r3)
            if (r11 != 0) goto L_0x022d
            r5.setVisibility(r6)
            r12 = 150(0x96, float:2.1E-43)
            int r11 = r3.length()
            if (r11 <= r12) goto L_0x018d
            java.lang.String r3 = r3.substring(r6, r12)
        L_0x018d:
            android.content.Context r16 = r14.getContext()
            X.3Wi r13 = r14.A0X
            X.33i r12 = r14.A0L
            X.4Fm r11 = r14.A0Y
            X.4b3 r15 = new X.4b3
            r18 = r13
            r19 = r12
            r20 = r0
            r17 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            android.widget.LinearLayout r11 = r14.A0B
            if (r11 == 0) goto L_0x01cb
            android.content.Context r16 = r14.getContext()
            android.content.Context r13 = r14.getContext()
            r12 = 2130969112(0x7f040218, float:1.7546897E38)
            r11 = 2131100227(0x7f060243, float:1.781283E38)
            int r21 = X.AnonymousClass5Yj.A02(r13, r12, r11)
            X.3Wi r13 = r14.A0X
            X.33i r12 = r14.A0L
            X.4Fm r11 = r14.A0Y
            X.4b3 r15 = new X.4b3
            r18 = r13
            r19 = r12
            r17 = r11
            r15.<init>((android.content.Context) r16, (X.C184988ss) r17, (X.C69263Wi) r18, (X.C620633i) r19, (java.lang.String) r20, (int) r21)
        L_0x01cb:
            android.text.SpannableStringBuilder r12 = X.C18330xA.A00(r3)
            X.C626936e.A06(r3)
            int r11 = r3.length()
            r3 = 18
            r12.setSpan(r15, r6, r11, r3)
            java.lang.CharSequence r3 = r14.A1E(r12)
            X.C86664Kz.A1T(r5, r3)
        L_0x01e2:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0229
            r5 = 300(0x12c, float:4.2E-43)
            int r3 = r2.length()
            if (r3 <= r5) goto L_0x01f4
            java.lang.String r2 = r2.substring(r6, r5)
        L_0x01f4:
            java.lang.CharSequence r2 = r14.A1E(r2)
            r4.setText(r2)
            r4.setVisibility(r6)
        L_0x01fe:
            r3 = 3
            X.54G r2 = new X.54G
            r2.<init>(r3, r0, r14)
            r4.setOnClickListener(r2)
            android.widget.TextView r3 = r14.A0D
            if (r3 == 0) goto L_0x005f
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = r0.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0231
            java.util.Set r0 = A0I
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0231
            r3.setText(r2)
            r3.setVisibility(r6)
            goto L_0x005f
        L_0x0229:
            r4.setVisibility(r8)
            goto L_0x01fe
        L_0x022d:
            r5.setVisibility(r8)
            goto L_0x01e2
        L_0x0231:
            r3.setVisibility(r8)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93194o7.A22():void");
    }

    public AnonymousClass1n9 getFMessage() {
        return (AnonymousClass1n9) this.A0S;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30361mK);
        this.A0S = r2;
    }

    static {
        HashSet A0K = AnonymousClass002.A0K();
        A0K.add("www.facebook.com");
        A0K.add("maps.google.com");
        A0K.add("foursquare.com");
        A0I = Collections.unmodifiableSet(A0K);
    }

    public C93194o7(Context context, AnonymousClass677 r4, AnonymousClass1n9 r5) {
        super(context, r4, r5);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.place_name);
        this.A0F = A0M;
        this.A0E = AnonymousClass002.A09(this, R.id.place_address);
        this.A0D = AnonymousClass002.A09(this, R.id.host_view);
        this.A06 = findViewById(R.id.message_info_holder);
        this.A0B = C86664Kz.A0v(this, R.id.location_template_message_link_frame);
        if (A0M != null) {
            C86964Mo.A00(this.A0O, A0M);
        }
        FrameLayout A0s = C86664Kz.A0s(this, R.id.location_bubble_frame);
        this.A09 = A0s;
        if (A0s != null) {
            A0s.setForeground(getInnerFrameForegroundDrawable());
        }
        this.A0H = C107315b6.A01(context);
        A22();
    }

    public void A1H() {
        A22();
        A1t(false);
    }

    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A09;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        int A052 = C87094Nz.A05(this);
        if (this.A04) {
            return Math.min(A052, AnonymousClass5YO.A02(this));
        }
        return A052;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
