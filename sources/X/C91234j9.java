package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaRoundCornerImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.4j9  reason: invalid class name and case insensitive filesystem */
public class C91234j9 extends AnonymousClass4Z7 implements C182078np {
    public Drawable A00;
    public ScaleGestureDetector A01;
    public WaRoundCornerImageView A02;
    public AnonymousClass5MO A03;
    public AnonymousClass5O4 A04;
    public AnonymousClass6D2 A05;
    public C182078np A06;
    public AnonymousClass8KC A07;
    public Runnable A08;
    public String A09;
    public boolean A0A = false;
    public final int A0B;
    public final Rect A0C = AnonymousClass001.A0N();
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final ViewGroup A0G;
    public final ViewTreeObserver.OnGlobalLayoutListener A0H;
    public final ConstraintLayout A0I;
    public final ConstraintLayout A0J;
    public final WaDynamicRoundCornerImageView A0K;
    public final WaDynamicRoundCornerImageView A0L;
    public final WaImageView A0M;
    public final WaTextView A0N;
    public final C116655qe A0O;
    public final C152857aH A0P;
    public final ThumbnailButton A0Q;
    public final AnonymousClass5UY A0R;
    public final AnonymousClass5UY A0S;
    public final AnonymousClass5UY A0T;
    public final C179828jm A0U;
    public final boolean A0V;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91234j9(android.view.View r15, X.AnonymousClass30B r16, X.AnonymousClass7D2 r17, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r18, X.C116655qe r19, X.AnonymousClass5UX r20, X.AnonymousClass5ZU r21, X.AnonymousClass1VX r22, boolean r23, boolean r24) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r20
            r13 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3 = 0
            r14.A0A = r3
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r14.A0C = r0
            r5 = 0
            X.8KB r0 = new X.8KB
            r0.<init>(r14)
            r14.A0U = r0
            r0 = 2131431627(0x7f0b10cb, float:1.8484989E38)
            android.view.View r0 = X.C06560Yg.A02(r15, r0)
            r14.A0E = r0
            r0 = 2131431092(0x7f0b0eb4, float:1.8483903E38)
            X.5UY r0 = X.AnonymousClass0x2.A0M(r15, r0)
            r14.A0R = r0
            r0 = 2131429259(0x7f0b078b, float:1.8480186E38)
            android.view.View r0 = X.C06560Yg.A02(r15, r0)
            r14.A0D = r0
            r0 = 2131430254(0x7f0b0b6e, float:1.8482204E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass0x9.A0L(r15, r0)
            r14.A0M = r0
            r0 = 2131434662(0x7f0b1ca6, float:1.8491144E38)
            android.view.View r0 = X.C06560Yg.A02(r15, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r14.A0J = r0
            r0 = 2131434677(0x7f0b1cb5, float:1.8491175E38)
            android.view.ViewGroup r1 = X.C86644Kx.A0J(r15, r0)
            r14.A0G = r1
            r0 = 2131432076(0x7f0b128c, float:1.84859E38)
            android.view.View r4 = X.C06560Yg.A02(r15, r0)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r14.A0I = r4
            r0 = 2131428414(0x7f0b043e, float:1.8478472E38)
            android.view.View r0 = X.C06560Yg.A02(r15, r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r14.A0K = r0
            r0 = 2131434272(0x7f0b1b20, float:1.8490353E38)
            android.view.View r0 = X.C06560Yg.A02(r15, r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r14.A0L = r0
            r0 = 2131432075(0x7f0b128b, float:1.8485897E38)
            com.whatsapp.components.button.ThumbnailButton r2 = X.C86664Kz.A16(r15, r0)
            r14.A0Q = r2
            r0 = 2131430405(0x7f0b0c05, float:1.848251E38)
            android.view.View r0 = r15.findViewById(r0)
            com.whatsapp.WaRoundCornerImageView r0 = (com.whatsapp.WaRoundCornerImageView) r0
            r14.A02 = r0
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            X.5UY r0 = X.AnonymousClass0x2.A0M(r15, r0)
            r14.A0T = r0
            r0 = 2131431681(0x7f0b1101, float:1.8485098E38)
            X.5UY r0 = X.AnonymousClass0x2.A0M(r15, r0)
            r14.A0S = r0
            r0 = r19
            r14.A0O = r0
            r0 = r24
            r14.A0V = r0
            if (r1 == 0) goto L_0x00b0
            r0 = 2131433880(0x7f0b1998, float:1.8489558E38)
            com.whatsapp.WaTextView r5 = X.C86644Kx.A0O(r1, r0)
        L_0x00b0:
            r14.A0N = r5
            r0 = 2131434107(0x7f0b1a7b, float:1.8490019E38)
            if (r23 == 0) goto L_0x00ba
            r0 = 2131434243(0x7f0b1b03, float:1.8490294E38)
        L_0x00ba:
            android.view.View r1 = X.C06560Yg.A02(r15, r0)
            r14.A0F = r1
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x015e
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            X.6gA r0 = new X.6gA
            r0.<init>(r1)
        L_0x00cb:
            r14.A0P = r0
            android.content.res.Resources$Theme r6 = X.C86614Ku.A0C(r15)
            android.util.TypedValue r5 = X.AnonymousClass4L0.A0B()
            r1 = 2130968848(0x7f040110, float:1.7546361E38)
            r0 = 1
            r6.resolveAttribute(r1, r5, r0)
            android.content.res.Resources r1 = r15.getResources()
            int r0 = r5.data
            if (r0 == 0) goto L_0x015a
            int r0 = r5.resourceId
        L_0x00e6:
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A00 = r0
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165540(0x7f070164, float:1.79453E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A01 = r0
            android.util.DisplayMetrics r0 = X.C86614Ku.A0E(r15)
            int r0 = r0.widthPixels
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r2.A02 = r1
            android.content.res.Resources r1 = X.C18290x4.A0G(r15)
            r0 = 2131099845(0x7f0600c5, float:1.7812055E38)
            int r2 = r1.getColor(r0)
            r14.A0B = r2
            int r0 = r14.A00
            X.6D2 r1 = new X.6D2
            r1.<init>(r0, r2)
            r14.A05 = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r3, r3, r3, r3)
            r1.A00 = r0
            X.6D2 r3 = r14.A05
            android.view.View r2 = r14.A0H
            boolean r1 = r2 instanceof android.widget.FrameLayout
            java.lang.String r0 = "FrameLayout required as root to support corner rounding via overlay"
            X.C626936e.A0D(r1, r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setForeground(r3)
            r1 = 3
            X.92I r0 = new X.92I
            r0.<init>(r14, r1)
            r14.A0H = r0
            int r0 = X.C86664Kz.A0J(r22)
            if (r0 < r1) goto L_0x0151
            r2 = r8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.util.List r1 = java.util.Collections.singletonList(r4)
            X.5O4 r0 = new X.5O4
            r0.<init>(r2, r1)
            r14.A04 = r0
        L_0x0151:
            X.5eO r0 = new X.5eO
            r0.<init>(r15, r14)
            r15.addOnAttachStateChangeListener(r0)
            return
        L_0x015a:
            r0 = 2131165538(0x7f070162, float:1.7945296E38)
            goto L_0x00e6
        L_0x015e:
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x016b
            android.view.TextureView r1 = (android.view.TextureView) r1
            X.6gB r0 = new X.6gB
            r0.<init>(r1)
            goto L_0x00cb
        L_0x016b:
            java.lang.String r0 = "videoView must be one of [SurfaceView, TextureView]"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91234j9.<init>(android.view.View, X.30B, X.7D2, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, X.5qe, X.5UX, X.5ZU, X.1VX, boolean, boolean):void");
    }

    public void BZq() {
        boolean z = true;
        this.A0A = true;
        AnonymousClass8KC r2 = this.A07;
        if (r2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(this.A09);
            A0o.append("onRenderStarted  for ");
            C18260x0.A0o(r2.A0F, A0o);
            C105175Tw r3 = this.A07;
            if (r3 == null || !r3.A0J) {
                z = false;
            }
            this.A0M.post(new C117665sI(this, r3, 9, z));
        }
        C117695sL.A01(this.A0I, this, 4);
    }

    public void A0A(int i) {
        this.A02 = i;
        A0D(this.A0G, this.A0N);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0256, code lost:
        if (r1 != 3) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x035a, code lost:
        if (r3 != false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0189, code lost:
        if (r10.A0X != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019c, code lost:
        if (r9.A0I.getVisibility() == 0) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C105175Tw r10) {
        /*
            r9 = this;
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x037b
            java.lang.String r0 = "preview - "
        L_0x0006:
            r9.A09 = r0
            boolean r0 = r9.A06()
            if (r0 == 0) goto L_0x002b
            X.5Tw r0 = r9.A07
            com.whatsapp.jid.UserJid r1 = r0.A0b
            com.whatsapp.jid.UserJid r0 = r10.A0b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r9.A09
            r1.append(r0)
            java.lang.String r0 = "bind() called with new participant before unbind()"
            X.C18260x0.A1M(r1, r0)
            r9.A08()
        L_0x002b:
            X.8KC r0 = r9.A07
            if (r0 != 0) goto L_0x003f
            com.whatsapp.jid.UserJid r1 = r10.A0b
            r0 = 0
            r9.A0A = r0
            X.5qe r0 = r9.A0O
            X.8KC r0 = r0.A00(r1)
            r9.A07 = r0
            r0.A09(r9)
        L_0x003f:
            X.7aH r5 = r9.A0P
            X.8KC r1 = r9.A07
            X.8KC r0 = r5.A01
            if (r0 != 0) goto L_0x0372
            r5.A01 = r1
            r5.A01()
        L_0x004c:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r9.A06
            if (r1 == 0) goto L_0x0081
            boolean r0 = r9.A06()
            if (r0 != 0) goto L_0x0081
            r0 = 59
            X.6C6 r4 = X.AnonymousClass6C6.A00(r9, r0)
            r9.A05 = r4
            X.7SG r3 = r1.A0Y
            com.whatsapp.jid.UserJid r2 = r10.A0b
            java.util.Map r1 = r3.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x006e
            r0 = 0
            r1.put(r2, r0)
        L_0x006e:
            java.util.Map r0 = r3.A00
            r0.put(r2, r4)
            X.3ZH r3 = r10.A0a
            com.whatsapp.WaDynamicRoundCornerImageView r2 = r9.A0K
            r0 = 1
            r1 = 0
            r9.A0E(r2, r3, r0, r1)
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0Q
            r9.A0E(r0, r3, r1, r1)
        L_0x0081:
            r9.A07 = r10
            android.view.View r2 = r9.A0F
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x0368
            android.content.Context r1 = r2.getContext()
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0094:
            r2.setContentDescription(r0)
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0361
            com.whatsapp.WaRoundCornerImageView r7 = r9.A02
            if (r7 == 0) goto L_0x00d0
            android.content.Context r1 = r7.getContext()
            android.graphics.drawable.Drawable r0 = r9.A00
            r6 = 0
            if (r0 != 0) goto L_0x00c8
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r3 = X.C86664Kz.A1Z()
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r3[r6] = r0
            r0 = 2131099858(0x7f0600d2, float:1.7812081E38)
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            r0 = 1
            r3[r0] = r1
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r4, r3)
            r9.A00 = r0
        L_0x00c8:
            r7.setVisibility(r6)
            android.graphics.drawable.Drawable r0 = r9.A00
            r7.setImageDrawable(r0)
        L_0x00d0:
            boolean r4 = r10.A0F
            boolean r3 = r10.A0B
            boolean r1 = r10.A0D
            boolean r0 = r9.A0V
            if (r0 != 0) goto L_0x035c
            if (r1 == 0) goto L_0x0355
            r0 = 2131165546(0x7f07016a, float:1.7945312E38)
        L_0x00df:
            android.view.View r3 = r9.A0H
            int r4 = X.C86614Ku.A05(r3, r0)
            X.6D2 r0 = r9.A05
            if (r0 != 0) goto L_0x00f7
            float r1 = (float) r4
            float r0 = r5.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x00f7
            r5.A00 = r1
            r5.A02()
        L_0x00f7:
            int r0 = r9.A00
            if (r4 == r0) goto L_0x0127
            r9.A00 = r4
            X.6D2 r0 = r9.A05
            if (r0 == 0) goto L_0x0344
            int r0 = r9.A0B
            X.6D2 r2 = new X.6D2
            r2.<init>(r4, r0)
            r9.A05 = r2
            boolean r1 = r3 instanceof android.widget.FrameLayout
            java.lang.String r0 = "FrameLayout required as root to support corner rounding via overlay"
            X.C626936e.A0D(r1, r0)
            r0 = r3
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setForeground(r2)
        L_0x0117:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r9.A0K
            int r0 = r9.A00
            float r0 = (float) r0
            r1.setRadius(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r9.A0L
            int r0 = r9.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x0127:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r9.A0J
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x013d
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r9.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x013d:
            X.7Qw r7 = r10.A09
            boolean r0 = r10.A0W
            r5 = 0
            r4 = 8
            if (r0 != 0) goto L_0x014e
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x033f
            boolean r0 = r10.A0Z
            if (r0 == 0) goto L_0x033f
        L_0x014e:
            r9.A0J(r5)
        L_0x0151:
            if (r7 == 0) goto L_0x0329
            boolean r0 = r10.A0W
            if (r0 != 0) goto L_0x0329
            boolean r0 = r10.A0T
            if (r0 != 0) goto L_0x0329
            android.view.ViewGroup r2 = r9.A0G
            if (r2 == 0) goto L_0x0322
            com.whatsapp.WaTextView r1 = r9.A0N
            if (r1 == 0) goto L_0x0322
            r2.setVisibility(r5)
            X.5Tw r0 = r9.A07
            if (r0 == 0) goto L_0x0170
            int r0 = r0.A03
            float r0 = (float) r0
            r2.setRotation(r0)
        L_0x0170:
            android.content.Context r0 = r1.getContext()
            X.C86614Ku.A12(r0, r1, r7)
            r1.setVisibility(r5)
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0Q
            r0.setVisibility(r4)
        L_0x017f:
            X.5UY r2 = r9.A0R
            boolean r0 = r10.A0T
            if (r0 != 0) goto L_0x018b
            boolean r1 = r10.A0X
            r0 = 8
            if (r1 == 0) goto L_0x018c
        L_0x018b:
            r0 = 0
        L_0x018c:
            r2.A06(r0)
            android.view.View r7 = r9.A0E
            boolean r0 = r10.A0U
            if (r0 == 0) goto L_0x019e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A0I
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L_0x01a0
        L_0x019e:
            r0 = 8
        L_0x01a0:
            r7.setVisibility(r0)
            X.5Tw r0 = r9.A07
            int r0 = r0.A03
            float r0 = (float) r0
            r7.setRotation(r0)
            boolean r0 = r10.A0U
            if (r0 != 0) goto L_0x01b3
            boolean r0 = r10.A0M
            if (r0 != 0) goto L_0x01c0
        L_0x01b3:
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r9.A01
            if (r1 == 0) goto L_0x01c0
            r1.setStroke(r0, r5)
        L_0x01c0:
            int r0 = r10.A04
            if (r0 == 0) goto L_0x01ff
            X.5UY r8 = r9.A0S
            android.view.View r1 = r8.A04()
            r0 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.widget.ImageView r6 = X.AnonymousClass0x9.A0E(r1, r0)
            boolean r2 = X.C1001059l.A04
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167552(0x7f070940, float:1.794938E38)
            if (r2 == 0) goto L_0x01df
            r0 = 2131167553(0x7f070941, float:1.7949383E38)
        L_0x01df:
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.width = r1
            r0.height = r1
            r6.setLayoutParams(r0)
            int r0 = r10.A04
            r6.setImageResource(r0)
            android.view.View r1 = r8.A04()
            X.5Tw r0 = r9.A07
            int r0 = r0.A03
            float r0 = (float) r0
            r1.setRotation(r0)
        L_0x01ff:
            X.5UY r6 = r9.A0S
            int r0 = r10.A04
            if (r0 == 0) goto L_0x031e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A0I
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x031e
        L_0x020d:
            r6.A06(r5)
            X.5Tw r0 = r9.A07
            int r1 = r0.A06
            int r0 = r9.A03
            if (r0 == r1) goto L_0x0272
            r9.A03 = r1
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            X.02c r2 = (X.C001702c) r2
            r0 = -1
            r2.A0p = r0
            r2.A0n = r0
            r2.A0I = r0
            r2.A0B = r0
            int r1 = r9.A03
            r0 = 1
            r5 = 0
            if (r1 == r0) goto L_0x0315
            r0 = 2
            if (r1 == r0) goto L_0x0318
            r0 = 3
            if (r1 == r0) goto L_0x0311
            r2.A0n = r5
        L_0x0237:
            r2.A0p = r5
        L_0x0239:
            r7.setLayoutParams(r2)
            android.view.ViewGroup$LayoutParams r2 = r6.A05()
            X.02c r2 = (X.C001702c) r2
            r0 = -1
            r2.A0p = r0
            r2.A0n = r0
            r2.A0I = r0
            r2.A0B = r0
            int r1 = r9.A03
            r0 = 1
            if (r1 == r0) goto L_0x030d
            r0 = 2
            if (r1 == r0) goto L_0x0307
            r0 = 3
            r2.A0I = r5
            if (r1 == r0) goto L_0x0309
        L_0x0258:
            r2.A0p = r5
        L_0x025a:
            r6.A08(r2)
            r9.A0I()
            X.5O4 r2 = r9.A04
            if (r2 == 0) goto L_0x0272
            int r1 = r9.A03
            r0 = 1
            r2.A03 = r0
            int r0 = r2.A02
            if (r1 == r0) goto L_0x0272
            r2.A02 = r1
            r2.A00()
        L_0x0272:
            android.graphics.Bitmap r0 = r10.A07
            r9.A0K(r0)
            boolean r0 = r10.A0P
            if (r0 != 0) goto L_0x0283
            boolean r0 = r10.A0Q
            if (r0 != 0) goto L_0x0283
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x02a4
        L_0x0283:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x029b
            android.view.ScaleGestureDetector r0 = r9.A01
            if (r0 != 0) goto L_0x029b
            android.content.Context r2 = r3.getContext()
            X.6ER r1 = new X.6ER
            r1.<init>(r9)
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            r0.<init>(r2, r1)
            r9.A01 = r0
        L_0x029b:
            r1 = 1
            X.7ck r0 = new X.7ck
            r0.<init>(r10, r1, r9)
            r3.setOnTouchListener(r0)
        L_0x02a4:
            boolean r0 = r10.A0P
            if (r0 == 0) goto L_0x02ad
            r0 = 41
            X.C109705f3.A00(r3, r9, r10, r0)
        L_0x02ad:
            boolean r0 = r10.A0Q
            if (r0 == 0) goto L_0x02ba
            r1 = 0
            X.919 r0 = new X.919
            r0.<init>(r9, r1, r10)
            r3.setOnLongClickListener(r0)
        L_0x02ba:
            boolean r0 = r10.A0X
            if (r0 == 0) goto L_0x02e8
            X.5UY r1 = r9.A0T
            int r0 = r1.A03()
            if (r0 != r4) goto L_0x02e8
            X.8np r0 = r9.A06
            if (r0 != 0) goto L_0x02d1
            X.8Fe r0 = new X.8Fe
            r0.<init>(r9)
            r9.A06 = r0
        L_0x02d1:
            java.lang.Runnable r0 = r9.A08
            if (r0 != 0) goto L_0x02dc
            r0 = 6
            X.5sL r0 = X.C117695sL.A00(r9, r0)
            r9.A08 = r0
        L_0x02dc:
            r0 = 0
            r1.A06(r0)
            java.lang.Runnable r2 = r9.A08
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x02e7:
            return
        L_0x02e8:
            boolean r0 = r10.A0X
            if (r0 != 0) goto L_0x02e7
            X.5UY r0 = r9.A0T
            r0.A06(r4)
            java.lang.Runnable r0 = r9.A08
            r2 = 0
            if (r0 == 0) goto L_0x02fb
            r3.removeCallbacks(r0)
            r9.A08 = r2
        L_0x02fb:
            X.8np r1 = r9.A06
            if (r1 == 0) goto L_0x02e7
            X.8KC r0 = r9.A07
            r0.A0A(r1)
            r9.A06 = r2
            return
        L_0x0307:
            r2.A0n = r5
        L_0x0309:
            r2.A0B = r5
            goto L_0x025a
        L_0x030d:
            r2.A0n = r5
            goto L_0x0258
        L_0x0311:
            r2.A0I = r5
            goto L_0x0237
        L_0x0315:
            r2.A0n = r5
            goto L_0x031a
        L_0x0318:
            r2.A0I = r5
        L_0x031a:
            r2.A0B = r5
            goto L_0x0239
        L_0x031e:
            r5 = 8
            goto L_0x020d
        L_0x0322:
            java.lang.String r0 = "VideoParticipantView: One of the status views is null"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x017f
        L_0x0329:
            android.view.ViewGroup r0 = r9.A0G
            if (r0 == 0) goto L_0x017f
            r0.setVisibility(r4)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A0I
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x017f
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0Q
            r0.setVisibility(r5)
            goto L_0x017f
        L_0x033f:
            r9.A0J(r4)
            goto L_0x0151
        L_0x0344:
            X.8KC r0 = r9.A07
            if (r0 == 0) goto L_0x0117
            float r1 = (float) r4
            r0.setCornerRadius(r1)
            boolean r0 = r2 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0117
            X.C107235av.A03(r2, r1)
            goto L_0x0117
        L_0x0355:
            if (r4 == 0) goto L_0x035c
            r0 = 2131165551(0x7f07016f, float:1.7945322E38)
            if (r3 == 0) goto L_0x00df
        L_0x035c:
            r0 = 2131165539(0x7f070163, float:1.7945298E38)
            goto L_0x00df
        L_0x0361:
            com.whatsapp.WaRoundCornerImageView r0 = r9.A02
            X.C86604Kt.A1A(r0)
            goto L_0x00d0
        L_0x0368:
            X.5ZU r1 = r9.A0C
            X.3ZH r0 = r10.A0a
            java.lang.String r0 = r1.A0H(r0)
            goto L_0x0094
        L_0x0372:
            if (r0 == r1) goto L_0x004c
            java.lang.String r0 = "Callback must be disconnected before connecting a different callback"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x037b:
            java.lang.String r0 = "display - "
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91234j9.A0G(X.5Tw):void");
    }

    public void A0H() {
        View view = this.A0F;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(true);
        }
        this.A05 = null;
        View view2 = this.A0H;
        C626936e.A0D(view2 instanceof FrameLayout, "FrameLayout required as root to support corner rounding via overlay");
        ((FrameLayout) view2).setForeground((Drawable) null);
    }

    public final void A0I() {
        int i;
        WaImageView waImageView = this.A0M;
        if (waImageView.getVisibility() == 0) {
            C105175Tw r0 = this.A07;
            if (r0 == null || r0.A0J) {
                i = 0;
            } else {
                i = this.A03;
            }
            waImageView.post(new C117705sM((Object) this, i, 15));
        }
    }

    public void A0J(int i) {
        AnonymousClass5UY r1;
        this.A0I.setVisibility(i);
        WaTextView waTextView = this.A0N;
        int i2 = 8;
        if (waTextView != null && waTextView.getVisibility() == 0) {
            this.A0Q.setVisibility(8);
        }
        if (i == 0) {
            this.A0E.setVisibility(8);
            r1 = this.A0S;
        } else {
            C105175Tw r0 = this.A07;
            if (r0 != null) {
                this.A0E.setVisibility(AnonymousClass001.A08(r0.A0U ? 1 : 0));
                r1 = this.A0S;
                if (this.A07.A04 != 0) {
                    i2 = 0;
                }
            } else {
                return;
            }
        }
        r1.A06(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r4 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            int r0 = r3.A03
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.whatsapp.WaImageView r0 = r3.A0M
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0010
            r1 = 1
            if (r4 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            com.whatsapp.WaImageView r0 = r3.A0M
            r0.setImageBitmap(r4)
            if (r4 != 0) goto L_0x001a
            r2 = 8
        L_0x001a:
            r0.setVisibility(r2)
            if (r1 == 0) goto L_0x0022
            r3.A0I()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91234j9.A0K(android.graphics.Bitmap):void");
    }

    public void A08() {
        C15930sC r5;
        if (A06()) {
            CallGridViewModel callGridViewModel = this.A06;
            if (!(callGridViewModel == null || (r5 = this.A05) == null)) {
                AnonymousClass7SG r1 = callGridViewModel.A0Y;
                UserJid userJid = this.A07.A0b;
                Map map = r1.A01;
                if (map.containsKey(userJid)) {
                    Map map2 = r1.A00;
                    if (r5.equals(map2.get(userJid))) {
                        map2.remove(userJid);
                        map.remove(userJid);
                    }
                }
                this.A05 = null;
            }
            C152857aH r2 = this.A0P;
            if (r2.A01 != null) {
                Object A002 = r2.A00();
                if (A002 != null) {
                    r2.A01.A0C(A002);
                }
                r2.A01 = null;
                r2.A03();
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.A0J.getBackground();
            int i = this.A01;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(i, 0);
            }
            this.A07 = null;
            View view = this.A0H;
            view.setOnClickListener((View.OnClickListener) null);
            view.setOnLongClickListener((View.OnLongClickListener) null);
            AnonymousClass8KC r0 = this.A07;
            if (r0 != null) {
                r0.A0A(this);
            }
            this.A07 = null;
            this.A0A = false;
            this.A01 = null;
        }
    }
}
