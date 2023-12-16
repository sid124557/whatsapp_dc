package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import java.util.Set;

/* renamed from: X.4nv  reason: invalid class name and case insensitive filesystem */
public class C93114nv extends AnonymousClass4nR {
    public C148887Kc A00;
    public C48042eF A01;
    public final View A02;
    public final View A03;
    public final View A04 = findViewById(R.id.control_btn_holder);
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final FrameLayout A08;
    public final ImageView A09 = AnonymousClass0x9.A0F(this, R.id.icon);
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final TextEmojiLabel A0G;
    public final WaImageView A0H = C86664Kz.A11(this, R.id.control_btn);
    public final C185528tp A0I = new C100465Ba(this, 1);
    public final AnonymousClass5UY A0J;
    public final AnonymousClass5UY A0K = C18290x4.A0X(this, R.id.thumb);

    public void A1q(C624134x r2, boolean z) {
        if (!(r2 instanceof AnonymousClass48R)) {
            boolean A1W = C18300x5.A1W(r2, this.A0S);
            super.A1q(r2, z);
            if (z || A1W) {
                A28();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r15.A0O.A0X(6786) == false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A28() {
        /*
            r15 = this;
            X.34x r8 = r15.A0S
            X.1mV r8 = (X.C30471mV) r8
            X.1nF r8 = (X.AnonymousClass1nF) r8
            android.widget.ImageView r5 = r15.A09
            android.content.Context r0 = r15.getContext()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass5VP.A00(r0, r8)
            r5.setImageDrawable(r0)
            java.lang.String r1 = r8.A1x()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01a5
            android.content.Context r1 = r15.getContext()
            r0 = 2131894643(0x7f122173, float:1.9424097E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0028:
            com.whatsapp.TextEmojiLabel r0 = r15.A0G
            r0.setText(r1)
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131166046(0x7f07035e, float:1.7946326E38)
            int r7 = r1.getDimensionPixelSize(r0)
            r0 = 2131429538(0x7f0b08a2, float:1.8480752E38)
            android.view.View r6 = r15.findViewById(r0)
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x0054
            boolean r0 = X.C989053r.A07(r0)
            if (r0 == 0) goto L_0x0054
            X.1VX r1 = r15.A0O
            r0 = 6786(0x1a82, float:9.509E-42)
            boolean r0 = r1.A0X(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            X.30w r0 = r8.A0y()
            X.C626936e.A06(r0)
            boolean r0 = r0.A05()
            r3 = 0
            r12 = 0
            r2 = 8
            if (r0 == 0) goto L_0x018b
            r5.setVisibility(r2)
            X.C86624Kv.A0y(r6, r12, r7)
            X.5UY r1 = r15.A0K
            if (r4 == 0) goto L_0x0186
            r1.A06(r12)
            android.widget.ImageView r0 = r15.A0A
            r0.setVisibility(r2)
            r0.setTag(r3)
        L_0x007b:
            X.1sV r6 = r15.A22
            if (r4 == 0) goto L_0x0182
            android.view.View r7 = r1.A04()
        L_0x0083:
            X.8tp r9 = r15.A0I
            X.2z0 r10 = r8.A1J
            r11 = 480(0x1e0, float:6.73E-43)
            r14 = 1
            r13 = r12
            r6.A0C(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x008e:
            java.lang.String r4 = r8.A01
            android.view.View r1 = r15.A06
            com.whatsapp.TextEmojiLabel r0 = r15.A0F
            r15.A25(r1, r0, r4)
            boolean r0 = X.C87094Nz.A0m(r15)
            if (r0 == 0) goto L_0x0138
            android.view.View r0 = r15.A04
            r0.setVisibility(r12)
            com.whatsapp.WaImageView r4 = r15.A0H
            r0 = 2131232942(0x7f0808ae, float:1.8082007E38)
            r4.setImageResource(r0)
            X.5ez r0 = r15.A08
            r4.setOnClickListener(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            X.C107295b4.A03(r4, r0)
            X.2z0 r0 = r8.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0128
            boolean r0 = r8.A1o()
            if (r0 != 0) goto L_0x0128
            android.content.Context r1 = r15.getContext()
            r0 = 2131894315(0x7f12202b, float:1.9423431E38)
            X.C18300x5.A13(r1, r4, r0)
        L_0x00cb:
            android.view.View r4 = r15.A03
            X.5ez r0 = r15.A0B
        L_0x00cf:
            r4.setOnClickListener(r0)
        L_0x00d2:
            android.widget.TextView r0 = r15.A0E
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r15.A07
            r0.setVisibility(r12)
            r15.A1L()
            android.widget.TextView r5 = r15.A0B
            X.33j r3 = r15.A0M
            long r0 = r8.A00
            X.C86634Kw.A1J(r5, r3, r0)
            int r0 = r8.A00
            android.widget.TextView r1 = r15.A0D
            if (r0 == 0) goto L_0x011f
            r1.setVisibility(r12)
            android.view.View r0 = r15.A02
            r0.setVisibility(r12)
            X.33j r0 = r15.A0M
            java.lang.String r0 = X.C107105ah.A01(r0, r8)
            r1.setText(r0)
        L_0x00ff:
            java.lang.String r1 = X.C106695a0.A01(r8)
            r0 = 10
            java.lang.String r0 = X.C107575bX.A0D(r1, r0)
            android.widget.TextView r1 = r15.A0C
            java.lang.CharSequence r0 = r15.A1E(r0)
            r1.setText(r0)
            X.C93314oJ.A0q(r4, r15)
            r15.A26(r8)
            r15.A1n(r8)
            r15.A1l(r8)
            return
        L_0x011f:
            r1.setVisibility(r2)
            android.view.View r0 = r15.A02
            r0.setVisibility(r2)
            goto L_0x00ff
        L_0x0128:
            android.content.Context r1 = r15.getContext()
            r0 = 2131894314(0x7f12202a, float:1.942343E38)
            X.C18300x5.A13(r1, r4, r0)
            android.view.View r4 = r15.A03
            r4.setOnClickListener(r3)
            goto L_0x00d2
        L_0x0138:
            boolean r1 = X.C87094Nz.A0j(r15)
            com.whatsapp.WaImageView r3 = r15.A0H
            X.C107295b4.A01(r3)
            android.view.View r0 = r15.A04
            if (r1 == 0) goto L_0x0149
            r0.setVisibility(r2)
            goto L_0x00cb
        L_0x0149:
            r0.setVisibility(r12)
            boolean r0 = X.C87094Nz.A0k(r15)
            if (r0 == 0) goto L_0x016b
            r0 = 2131232947(0x7f0808b3, float:1.8082018E38)
            r3.setImageResource(r0)
            android.content.Context r1 = r15.getContext()
            r0 = 2131887188(0x7f120454, float:1.9408976E38)
            X.C18300x5.A13(r1, r3, r0)
            X.5ez r0 = r15.A09
            r3.setOnClickListener(r0)
            android.view.View r4 = r15.A03
            goto L_0x00cf
        L_0x016b:
            r0 = 2131232959(0x7f0808bf, float:1.8082042E38)
            r3.setImageResource(r0)
            android.content.Context r1 = r15.getContext()
            r0 = 2131893203(0x7f121bd3, float:1.9421176E38)
            X.C18300x5.A13(r1, r3, r0)
            X.5ez r0 = r15.A0A
            r3.setOnClickListener(r0)
            goto L_0x00cb
        L_0x0182:
            android.widget.ImageView r7 = r15.A0A
            goto L_0x0083
        L_0x0186:
            r1.A06(r2)
            goto L_0x007b
        L_0x018b:
            r5.setVisibility(r12)
            X.C86644Kx.A0z(r6, r7)
            X.5UY r0 = r15.A0K
            r0.A06(r2)
            android.widget.ImageView r0 = r15.A0A
            r0.setTag(r3)
            r0.setVisibility(r2)
            android.view.View r0 = r15.A05
            r0.setVisibility(r2)
            goto L_0x008e
        L_0x01a5:
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.C107575bX.A0D(r1, r0)
            java.lang.CharSequence r1 = r15.A1E(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93114nv.A28():void");
    }

    public AnonymousClass1nF getFMessage() {
        return (AnonymousClass1nF) ((C30471mV) this.A0S);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof AnonymousClass1nF);
        super.setFMessage(r2);
    }

    public C93114nv(Context context, AnonymousClass677 r5, AnonymousClass1nF r6) {
        super(context, r5, r6);
        AnonymousClass5UY A0X = C18290x4.A0X(this, R.id.progress_bar);
        this.A0J = A0X;
        AnonymousClass5UY.A02(A0X, context, 5);
        this.A0G = C86644Kx.A0M(this, R.id.title);
        this.A0E = C18300x5.A0G(this, R.id.media_transfer_eta);
        this.A07 = C86644Kx.A0I(this, R.id.metadata_container);
        this.A03 = findViewById(R.id.content);
        this.A0D = AnonymousClass002.A09(this, R.id.info);
        this.A02 = findViewById(R.id.bullet_info);
        this.A0B = AnonymousClass002.A09(this, R.id.file_size);
        this.A0C = AnonymousClass002.A09(this, R.id.file_type);
        this.A0A = AnonymousClass0x9.A0F(this, R.id.preview);
        this.A05 = findViewById(R.id.preview_separator);
        FrameLayout A0s = C86664Kz.A0s(this, R.id.document_frame);
        this.A08 = A0s;
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.caption);
        this.A0F = A0M;
        if (A0M != null) {
            C86964Mo.A00(this.A0O, A0M);
        }
        this.A06 = findViewById(R.id.text_and_date);
        if (A0s != null) {
            A0s.setForeground(getInnerFrameForegroundDrawable());
        }
        A28();
    }

    public void A1H() {
        A28();
        A1t(false);
    }

    public void A1N() {
        super.A1N();
        Activity A042 = C111095hX.A04(this);
        if (A042 instanceof C89654ea) {
            C105025Tg r7 = this.A0T;
            C626936e.A06(r7);
            C69263Wi r3 = this.A0X;
            C626936e.A06(r3);
            C55682qk r1 = this.A0F;
            C626936e.A06(r1);
            AnonymousClass4FS r9 = this.A25;
            C626936e.A06(r9);
            C111095hX r0 = this.A0V;
            C626936e.A06(r0);
            C48042eF r5 = this.A01;
            C626936e.A06(r5);
            AnonymousClass5ZR r4 = this.A02;
            C626936e.A06(r4);
            int A002 = C100335An.A00(r0, r1, (C89654ea) A042, r3, r4, r5, (AnonymousClass1nF) ((C30471mV) this.A0S), r7, this.A23, r9);
            if (A002 == 2) {
                A27();
            } else if (A002 == 4) {
                this.A0X.A0F(R.string.f11nameremoved, 1);
            }
        }
    }

    public void A25(View view, TextEmojiLabel textEmojiLabel, String str) {
        super.A25(view, textEmojiLabel, str);
        if (TextUtils.isEmpty(str) && textEmojiLabel != null) {
            ViewGroup viewGroup = this.A08;
            viewGroup.setPadding(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, C86614Ku.A05(this, R.dimen.f6nameremoved), 0);
            C86604Kt.A19(viewGroup);
            this.A0K.setTextColor(getSecondaryTextColor());
            View view2 = this.A06;
            if (view2 == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                AnonymousClass001.A0T(view2).bottomMargin = dimensionPixelSize;
                AnonymousClass001.A0T(view2).topMargin = dimensionPixelSize2;
                return;
            }
            AnonymousClass001.A0T(view2).topMargin = C86664Kz.A09(getResources(), R.dimen.f6nameremoved, -viewGroup.getMeasuredHeight());
        }
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        return C87094Nz.A05(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
