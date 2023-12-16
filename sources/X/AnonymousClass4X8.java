package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4X8  reason: invalid class name */
public class AnonymousClass4X8 extends AnonymousClass0R6 {
    public C102355In A00;
    public C102355In A01;
    public C102365Io A02;
    public C88464Yv A03;
    public String A04;
    public String A05;
    public List A06 = AnonymousClass001.A0s();
    public List A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final View.OnClickListener A0B;
    public final LinearLayoutManager A0C;
    public final C55682qk A0D;
    public final C69263Wi A0E;
    public final C66663Mh A0F;
    public final AnonymousClass64J A0G;
    public final C64773Ex A0H;
    public final AnonymousClass5ZU A0I;
    public final C105365Uq A0J;
    public final C620733j A0K;
    public final AnonymousClass4FV A0L;
    public final AnonymousClass4UC A0M;
    public final Runnable A0N = new C117635sF(this, 35);
    public final String A0O;
    public final LinkedHashMap A0P;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C88464Yv r5 = this.A03;
            if (r5 != null) {
                return r5;
            }
            C88464Yv r52 = new C88464Yv(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0D, this.A0K);
            this.A03 = r52;
            return r52;
        } else if (i == 2) {
            return new AnonymousClass4Xo(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        } else {
            if (i == 3) {
                AnonymousClass4FV r3 = this.A0L;
                return new C88344Yj(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0K, r3);
            } else if (i == 4) {
                return new AnonymousClass4YM(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            } else {
                if (i == 6) {
                    return new AnonymousClass4YL(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0K);
                } else if (i == 7) {
                    C95364tW r53 = new C95364tW(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                    View view = r53.A0H;
                    C86634Kw.A1B(view, r53.A00, view.getPaddingLeft(), C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved), view.getPaddingRight());
                    return r53;
                } else if (i == 8) {
                    return new AnonymousClass4YT(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A04);
                } else if (i == 9) {
                    return new C95354tV(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                } else {
                    AnonymousClass4FV r12 = this.A0L;
                    C66663Mh r7 = this.A0F;
                    C64773Ex r9 = this.A0H;
                    AnonymousClass5ZU r10 = this.A0I;
                    C620733j r11 = this.A0K;
                    return new C88314Yg(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), r7, this.A0G, r9, r10, r11, r12);
                }
            }
        }
    }

    public final int A0K() {
        Iterator A0u = AnonymousClass001.A0u(this.A0P);
        int i = 0;
        while (A0u.hasNext()) {
            if (AnonymousClass001.A1Z(AnonymousClass0x2.A0W(A0u))) {
                i++;
            }
        }
        return i;
    }

    public final int A0L() {
        int i = 0;
        for (AnonymousClass3ZS r0 : this.A06) {
            if (r0.A00.A0I == 0) {
                i++;
            }
        }
        return i;
    }

    public final int A0M(int i) {
        Iterator A0u = AnonymousClass001.A0u(this.A0P);
        int i2 = 0;
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (AnonymousClass001.A1Z(A0w.getValue())) {
                if (C18280x3.A06(A0w) == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r2 < 4) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.A02.size() < 4) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N() {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = r7.A0P
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r6.get(r5)
            if (r0 == 0) goto L_0x003d
            X.5In r0 = r7.A01
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 4
            r3 = 1
            if (r1 >= r0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            X.5In r0 = r7.A00
            if (r0 == 0) goto L_0x002a
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r3 != 0) goto L_0x003e
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r6.get(r5)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 0
        L_0x003a:
            r7.A0O(r4, r0)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r6.get(r5)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x003d
            r0 = 1
            goto L_0x003a
        L_0x004e:
            int r0 = r7.A0M(r4)
            if (r0 < 0) goto L_0x003d
            r7.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X8.A0N():void");
    }

    public final void A0O(int i, boolean z) {
        LinkedHashMap linkedHashMap = this.A0P;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.get(valueOf) != null && AnonymousClass001.A1Z(linkedHashMap.get(valueOf)) != z) {
            if (z) {
                linkedHashMap.put(valueOf, Boolean.TRUE);
                int A0M2 = A0M(i);
                A07(A0M2);
                if (A0M2 == 0) {
                    LinearLayoutManager linearLayoutManager = this.A0C;
                    if (linearLayoutManager.A1G() == 0) {
                        linearLayoutManager.A0Z(0);
                        return;
                    }
                    return;
                }
                return;
            }
            A08(A0M(i));
            linkedHashMap.put(valueOf, Boolean.FALSE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0437, code lost:
        if (r3 != 0) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x044c, code lost:
        if (r3 <= 0) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f2, code lost:
        if (r12.A02.size() < 4) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r21, int r22) {
        /*
            r20 = this;
            r10 = r21
            boolean r0 = r10 instanceof X.C88464Yv
            r7 = r20
            if (r0 == 0) goto L_0x0073
            X.4Yv r10 = (X.C88464Yv) r10
            X.5Io r1 = r7.A02
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "storage-usage-summary-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r8 = r1.A01
            long r6 = r1.A00
            long r13 = r1.A02
            long r4 = r13 - r6
            long r4 = r4 - r8
            double r11 = (double) r6
            double r2 = (double) r13
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = r2 * r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r0
            r0 = 4737168216739020800(0x41bdcd6500000000, double:5.0E8)
            double r1 = java.lang.Math.min(r2, r0)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            boolean r17 = X.AnonymousClass001.A1V(r0)
            X.33j r2 = r10.A0F
            java.lang.String r3 = X.AnonymousClass35V.A03(r2, r8)
            java.lang.String r11 = X.AnonymousClass35V.A03(r2, r6)
            r0 = 0
            long r0 = java.lang.Math.max(r0, r4)
            java.lang.String r12 = X.AnonymousClass35V.A03(r2, r0)
            long r0 = r10.A01
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            boolean r0 = X.AnonymousClass75J.A00(r3, r0)
            if (r0 == 0) goto L_0x01ec
            long r0 = r10.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
            boolean r0 = X.AnonymousClass75J.A00(r11, r0)
            if (r0 == 0) goto L_0x01ec
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            boolean r0 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 == 0) goto L_0x01ec
        L_0x0072:
            return
        L_0x0073:
            boolean r0 = r10 instanceof X.C88314Yg
            if (r0 == 0) goto L_0x00d3
            X.4Yg r10 = (X.C88314Yg) r10
            java.util.List r1 = r7.A06
            int r0 = r7.A0K()
            int r2 = r22 - r0
            java.lang.Object r8 = r1.get(r2)
            X.3ZS r8 = (X.AnonymousClass3ZS) r8
            X.5Uq r9 = r7.A0J
            java.lang.String r3 = r7.A05
            java.util.List r2 = r7.A07
            java.lang.String r6 = r7.A0O
            int r5 = r7.A0A
            X.4UC r7 = r7.A0M
            X.3Ex r1 = r10.A04
            X.4uZ r0 = r8.A01()
            X.3ZH r1 = r1.A07(r0)
            if (r1 != 0) goto L_0x00a6
            android.view.View r0 = r10.A0H
            r9 = 0
        L_0x00a2:
            r0.setOnClickListener(r9)
            return
        L_0x00a6:
            com.whatsapp.components.button.ThumbnailButton r0 = r10.A03
            r4 = 0
            r9.A0A(r0, r1, r4)
            X.5YB r0 = r10.A02
            if (r3 == 0) goto L_0x00cf
            r0.A0A(r1, r2)
        L_0x00b3:
            android.widget.TextView r3 = r10.A00
            X.33j r2 = r10.A06
            X.39K r0 = r8.A00
            long r0 = r0.A0I
            java.lang.String r0 = X.AnonymousClass35V.A05(r2, r0)
            r3.setText(r0)
            android.view.View r0 = r10.A0H
            X.5eq r9 = new X.5eq
            r11 = r8
            r12 = r7
            r13 = r6
            r14 = r5
            r15 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x00a2
        L_0x00cf:
            r0.A08(r1)
            goto L_0x00b3
        L_0x00d3:
            boolean r0 = r10 instanceof X.C88344Yj
            if (r0 == 0) goto L_0x0186
            X.4Yj r10 = (X.C88344Yj) r10
            X.5In r6 = r7.A01
            X.5In r12 = r7.A00
            java.lang.String r3 = r7.A0O
            int r2 = r7.A0A
            X.4UC r4 = r7.A0M
            java.lang.String r0 = "storage-usage-cleanup-suggestions-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r12 == 0) goto L_0x00f4
            java.util.List r0 = r12.A02
            int r5 = r0.size()
            r1 = 4
            r0 = 1
            if (r5 >= r1) goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            r5 = 0
            r7 = 8
            if (r0 == 0) goto L_0x0180
            android.view.View r11 = r10.A00
            r19 = 1
            X.5eq r13 = new X.5eq
            r14 = r10
            r15 = r12
            r16 = r4
            r17 = r3
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r11.setOnClickListener(r13)
            long r0 = r12.A01
            android.widget.TextView r9 = r10.A02
            X.33j r8 = r10.A05
            java.lang.String r8 = X.AnonymousClass35V.A05(r8, r0)
            r9.setText(r8)
            r13 = 0
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            int r0 = X.C86664Kz.A03(r8)
            r11.setVisibility(r0)
            com.whatsapp.storage.StorageUsageMediaPreviewView r9 = r10.A07
            java.util.List r8 = r12.A02
            int r1 = r12.A00
            java.lang.String r0 = "forwarded_files"
            r9.setPreviewMediaItems(r8, r1, r0)
            r11.setVisibility(r5)
        L_0x0134:
            if (r6 == 0) goto L_0x0422
            java.util.List r8 = r6.A02
            int r1 = r8.size()
            r0 = 4
            if (r1 < r0) goto L_0x0422
            android.view.View r7 = r10.A01
            r15 = 2
            X.5eq r9 = new X.5eq
            r11 = r6
            r12 = r4
            r13 = r3
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r7.setOnClickListener(r9)
            android.widget.TextView r1 = r10.A04
            android.content.Context r0 = X.C86664Kz.A0T(r10)
            X.33j r2 = r10.A05
            java.lang.String r0 = X.AnonymousClass35X.A04(r0, r2)
            r1.setText(r0)
            long r3 = r6.A01
            android.widget.TextView r1 = r10.A03
            java.lang.String r0 = X.AnonymousClass35V.A05(r2, r3)
            r1.setText(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r0 = X.C86664Kz.A03(r0)
            r7.setVisibility(r0)
            com.whatsapp.storage.StorageUsageMediaPreviewView r2 = r10.A08
            int r1 = r6.A00
            java.lang.String r0 = "large_files"
            r2.setPreviewMediaItems(r8, r1, r0)
            r7.setVisibility(r5)
            return
        L_0x0180:
            android.view.View r0 = r10.A00
            r0.setVisibility(r7)
            goto L_0x0134
        L_0x0186:
            boolean r0 = r10 instanceof X.AnonymousClass4YM
            if (r0 == 0) goto L_0x01a8
            java.util.List r0 = r7.A06
            java.util.Iterator r1 = r0.iterator()
            r3 = 0
        L_0x0191:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0428
            java.lang.Object r0 = r1.next()
            X.3ZS r0 = (X.AnonymousClass3ZS) r0
            X.4uZ r0 = r0.A01()
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0191
            int r3 = r3 + 1
            goto L_0x0191
        L_0x01a8:
            boolean r0 = r10 instanceof X.AnonymousClass4YL
            if (r0 == 0) goto L_0x01d6
            X.4YL r10 = (X.AnonymousClass4YL) r10
            java.util.List r0 = r7.A06
            java.util.Iterator r6 = r0.iterator()
            r9 = 0
        L_0x01b5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x044f
            java.lang.Object r5 = r6.next()
            X.3ZS r5 = (X.AnonymousClass3ZS) r5
            X.39K r0 = r5.A00
            long r3 = r0.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b5
            X.4uZ r0 = r5.A01()
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x01b5
            int r9 = r9 + 1
            goto L_0x01b5
        L_0x01d6:
            boolean r0 = r10 instanceof X.AnonymousClass4YT
            if (r0 == 0) goto L_0x0072
            X.4YT r10 = (X.AnonymousClass4YT) r10
            X.4UC r2 = r7.A0M
            com.whatsapp.settings.SettingsRowIconText r1 = r10.A01
            r0 = 12
            X.C109495ei.A00(r1, r10, r2, r0)
            com.whatsapp.WaTextView r1 = r10.A00
            r0 = 3
            r1.setMaxLines(r0)
            return
        L_0x01ec:
            r10.A01 = r8
            r10.A00 = r6
            com.whatsapp.WaTextView r11 = r10.A0B
            r1 = 2131894120(0x7f121f68, float:1.9423036E38)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = r2.A0E(r1, r0)
            r11.setText(r0)
            com.whatsapp.WaTextView r3 = r10.A0C
            r1 = 2131894122(0x7f121f6a, float:1.942304E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            java.lang.String r0 = r2.A0E(r1, r0)
            r3.setText(r0)
            boolean r1 = r10.A03
            r0 = r17
            if (r1 == r0) goto L_0x02a6
            r10.A03 = r0
            android.animation.AnimatorSet r0 = r10.A02
            if (r0 == 0) goto L_0x0221
            r0.cancel()
        L_0x0221:
            android.animation.AnimatorSet r0 = X.C86664Kz.A0O()
            r10.A02 = r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            boolean r0 = r10.A03
            r15 = 0
            if (r0 == 0) goto L_0x0238
            com.whatsapp.WaImageView r0 = r10.A09
            r0.setAlpha(r15)
            r0.setVisibility(r4)
        L_0x0238:
            android.animation.FloatEvaluator r16 = new android.animation.FloatEvaluator
            r16.<init>()
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            boolean r1 = r10.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0247
            r0 = 0
        L_0x0247:
            X.AnonymousClass001.A1P(r12, r0, r4)
            if (r1 == 0) goto L_0x024e
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x024e:
            X.AnonymousClass001.A1P(r12, r15, r5)
            r0 = r16
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r0, r12)
            r0 = 21
            X.C100295Aj.A03(r1, r10, r0)
            r3.add(r1)
            android.animation.ArgbEvaluator r12 = new android.animation.ArgbEvaluator
            r12.<init>()
            java.lang.Object[] r11 = new java.lang.Object[r11]
            boolean r1 = r10.A03
            if (r1 == 0) goto L_0x03ee
            int r0 = r10.A05
        L_0x026c:
            X.AnonymousClass000.A1P(r11, r0, r4)
            if (r1 == 0) goto L_0x03ea
            int r0 = r10.A04
        L_0x0273:
            X.AnonymousClass000.A1P(r11, r0, r5)
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r12, r11)
            r0 = 22
            X.C100295Aj.A03(r1, r10, r0)
            r3.add(r1)
            android.animation.AnimatorSet r1 = r10.A02
            r0 = 26
            X.AnonymousClass67L.A01(r1, r10, r0)
            android.animation.AnimatorSet r0 = r10.A02
            X.C86614Ku.A0y(r0)
            android.animation.AnimatorSet r11 = r10.A02
            r0 = 300(0x12c, double:1.48E-321)
            r11.setStartDelay(r0)
            android.animation.AnimatorSet r11 = r10.A02
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.setDuration(r0)
            android.animation.AnimatorSet r0 = r10.A02
            r0.playTogether(r3)
            android.animation.AnimatorSet r0 = r10.A02
            r0.start()
        L_0x02a6:
            com.whatsapp.storage.SizeTickerView r12 = r10.A0H
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r12.A01 = r1
            r12.A00 = r0
            android.view.View r11 = r10.A0H
            android.content.Context r15 = r11.getContext()
            android.content.Context r3 = r11.getContext()
            r1 = 2130970558(0x7f0407be, float:1.754983E38)
            r0 = 2131102413(0x7f060acd, float:1.7817263E38)
            int r0 = X.AnonymousClass5Yj.A03(r3, r15, r1, r0)
            r12.A0E(r8, r0, r5)
            com.whatsapp.WaTextView r12 = r10.A0D
            r15 = 2131755338(0x7f10014a, float:1.9141552E38)
            android.util.Pair r0 = X.AnonymousClass35V.A00(r2, r8, r4, r4)
            java.lang.Object r3 = r0.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r0 = r0.first
            r1[r4] = r0
            java.lang.String r0 = r2.A0J(r3, r1, r15)
            r12.setText(r0)
            com.whatsapp.storage.SizeTickerView r3 = r10.A0G
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r3.A01 = r1
            r3.A00 = r0
            android.content.Context r1 = r11.getContext()
            r0 = 2131102525(0x7f060b3d, float:1.781749E38)
            if (r17 == 0) goto L_0x02f7
            r0 = 2131102527(0x7f060b3f, float:1.7817494E38)
        L_0x02f7:
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r3.A0E(r6, r0, r5)
            com.whatsapp.WaTextView r11 = r10.A0A
            r12 = 2131755337(0x7f100149, float:1.914155E38)
            android.util.Pair r0 = X.AnonymousClass35V.A00(r2, r6, r4, r4)
            java.lang.Object r3 = r0.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r0 = r0.first
            r1[r4] = r0
            java.lang.String r0 = r2.A0J(r3, r1, r12)
            r11.setText(r0)
            float r2 = (float) r8
            float r0 = (float) r13
            float r2 = r2 / r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r1
            float r3 = (float) r6
            float r3 = r3 / r0
            float r3 = r3 * r1
            float r1 = r1 - r3
            float r1 = r1 - r2
            r0 = 0
            r9 = 2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0400
            float[] r8 = new float[r9]
            r8[r4] = r2
            r8[r5] = r1
            if (r17 == 0) goto L_0x03e6
            int r7 = r10.A04
        L_0x0333:
            com.whatsapp.components.SegmentedProgressBar r3 = r10.A0E
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r3.A01 = r1
            r3.A00 = r0
            int[] r6 = r10.A0I
            int r0 = r6.length
            if (r9 != r0) goto L_0x03f9
            r2 = 0
            r3.A06 = r4
            r1 = 0
        L_0x0346:
            float r1 = (float) r1
            r0 = r8[r2]
            float r1 = r1 + r0
            int r1 = (int) r1
            r3.A06 = r1
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x0346
            if (r1 < 0) goto L_0x03f2
            r0 = 100
            if (r1 > r0) goto L_0x03f2
            float[] r0 = r3.A0D
            if (r0 == 0) goto L_0x035e
            int r0 = r0.length
            if (r0 == r9) goto L_0x0362
        L_0x035e:
            float[] r0 = new float[r9]
            r3.A0D = r0
        L_0x0362:
            r3.A0E = r6
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            android.animation.AnimatorSet r0 = r3.A08
            if (r0 == 0) goto L_0x036f
            r0.cancel()
        L_0x036f:
            android.animation.AnimatorSet r0 = X.C86664Kz.A0O()
            r3.A08 = r0
            r11 = 0
        L_0x0376:
            float[] r0 = r3.A0D
            r2 = r0[r11]
            r0 = r8[r11]
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0395
            float[] r1 = new float[r9]
            r1[r4] = r2
            r0 = r8[r11]
            android.animation.ValueAnimator r1 = X.C86664Kz.A0P(r1, r0)
            X.5Aq r0 = new X.5Aq
            r0.<init>(r3, r11, r5)
            r1.addUpdateListener(r0)
            r6.add(r1)
        L_0x0395:
            int r11 = r11 + 1
            if (r11 < r9) goto L_0x0376
            int r0 = r3.A02
            if (r0 == r7) goto L_0x03b4
            android.animation.ArgbEvaluator r2 = new android.animation.ArgbEvaluator
            r2.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r9]
            int r0 = r3.A02
            X.C86604Kt.A1X(r1, r0, r4, r7, r5)
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r2, r1)
            r0 = 7
            X.C100295Aj.A03(r1, r3, r0)
            r6.add(r1)
        L_0x03b4:
            android.animation.AnimatorSet r1 = r3.A08
            X.4L2 r0 = new X.4L2
            r0.<init>(r3, r8, r7)
            r1.addListener(r0)
            android.animation.AnimatorSet r0 = r3.A08
            X.C86614Ku.A0y(r0)
            android.animation.AnimatorSet r2 = r3.A08
            int r0 = r3.A01
            long r0 = (long) r0
            r2.setDuration(r0)
            android.animation.AnimatorSet r2 = r3.A08
            int r0 = r3.A00
            long r0 = (long) r0
            r2.setStartDelay(r0)
            android.animation.AnimatorSet r0 = r3.A08
            r0.playTogether(r6)
            android.animation.AnimatorSet r0 = r3.A08
            r0.start()
            r3.setVisibility(r4)
            android.view.View r0 = r10.A07
            r0.setVisibility(r4)
            return
        L_0x03e6:
            int r7 = r10.A06
            goto L_0x0333
        L_0x03ea:
            int r0 = r10.A05
            goto L_0x0273
        L_0x03ee:
            int r0 = r10.A04
            goto L_0x026c
        L_0x03f2:
            java.lang.String r0 = "Progress sum must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x03f9:
            java.lang.String r0 = "Lengths of the progressPercentages and progressColors should match"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0400:
            com.whatsapp.components.SegmentedProgressBar r0 = r10.A0E
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r10.A07
            r0.setVisibility(r1)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.AnonymousClass001.A1P(r1, r2, r4)
            X.AnonymousClass001.A1P(r1, r3, r5)
            java.lang.String r0 = "usedSpacePercentage: %s, freeSpacePercentage: %s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            X.2qk r1 = r10.A08
            java.lang.String r0 = "storage-usage-summary progress percentages sum up above 100"
            r1.A0A(r0, r5, r2)
            return
        L_0x0422:
            android.view.View r0 = r10.A01
            r0.setVisibility(r7)
            return
        L_0x0428:
            X.4YM r10 = (X.AnonymousClass4YM) r10
            java.util.List r0 = r7.A06
            int r0 = X.AnonymousClass002.A04(r0, r3)
            android.view.View$OnClickListener r2 = r7.A0B
            if (r0 <= 0) goto L_0x0447
            r1 = 2131893593(0x7f121d59, float:1.9421967E38)
            if (r3 == 0) goto L_0x043c
        L_0x0439:
            r1 = 2131894105(0x7f121f59, float:1.9423005E38)
        L_0x043c:
            com.whatsapp.WaTextView r0 = r10.A01
            r0.setText(r1)
            com.whatsapp.WaImageView r0 = r10.A00
            r0.setOnClickListener(r2)
            return
        L_0x0447:
            if (r0 != 0) goto L_0x0439
            r1 = 2131894104(0x7f121f58, float:1.9423003E38)
            if (r3 > 0) goto L_0x043c
            goto L_0x0439
        L_0x044f:
            java.util.List r0 = r7.A06
            java.util.Iterator r5 = r0.iterator()
            r8 = 0
        L_0x0456:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0477
            java.lang.Object r1 = r5.next()
            X.3ZS r1 = (X.AnonymousClass3ZS) r1
            X.4uZ r0 = r1.A01()
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0456
            X.39K r0 = r1.A00
            long r3 = r0.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0456
            int r8 = r8 + 1
            goto L_0x0456
        L_0x0477:
            if (r9 != 0) goto L_0x048e
            if (r8 != 0) goto L_0x048e
            android.widget.TextView r0 = r10.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131894121(0x7f121f69, float:1.9423038E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0488:
            android.widget.TextView r0 = r10.A00
            r0.setText(r1)
            return
        L_0x048e:
            r7 = 0
            r6 = 1
            if (r9 != 0) goto L_0x04a5
            X.33j r5 = r10.A01
            r4 = 2131755334(0x7f100146, float:1.9141544E38)
            long r2 = (long) r8
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x049e:
            r1[r7] = r0
            java.lang.String r1 = r5.A0L(r1, r4, r2)
            goto L_0x0488
        L_0x04a5:
            if (r8 != 0) goto L_0x04b4
            X.33j r5 = r10.A01
            r4 = 2131755335(0x7f100147, float:1.9141546E38)
            long r2 = (long) r9
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x049e
        L_0x04b4:
            android.widget.TextView r0 = r10.A00
            android.content.Context r2 = r0.getContext()
            r1 = 2131894106(0x7f121f5a, float:1.9423007E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r9 = r9 + r8
            X.AnonymousClass000.A1P(r0, r9, r7)
            java.lang.String r1 = r2.getString(r1, r0)
            goto L_0x0488
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X8.BNf(X.0Ua, int):void");
    }

    public int getItemViewType(int i) {
        Iterator A0u = AnonymousClass001.A0u(this.A0P);
        int i2 = 0;
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (AnonymousClass001.A1Z(A0w.getValue())) {
                if (i2 == i) {
                    return C18280x3.A06(A0w);
                }
                i2++;
            }
        }
        if (this.A08 && !this.A09 && ((this.A06.size() == 0 || A0L() > 0) && i == A0G() - 1)) {
            return 6;
        }
        if (!this.A09 || this.A06.size() != 0) {
            return 5;
        }
        return 7;
    }

    public AnonymousClass4X8(View.OnClickListener onClickListener, LinearLayoutManager linearLayoutManager, C55682qk r7, C69263Wi r8, C66663Mh r9, AnonymousClass64J r10, C64773Ex r11, AnonymousClass5ZU r12, C105365Uq r13, C620733j r14, AnonymousClass4FV r15, AnonymousClass4UC r16, String str, String str2, int i) {
        this.A0E = r8;
        this.A0D = r7;
        this.A0L = r15;
        this.A0F = r9;
        this.A0H = r11;
        this.A0I = r12;
        this.A0K = r14;
        this.A0G = r10;
        this.A0C = linearLayoutManager;
        this.A0J = r13;
        this.A0A = i;
        this.A0O = str;
        this.A0M = r16;
        this.A0B = onClickListener;
        this.A04 = str2;
        LinkedHashMap A0r = C18320x8.A0r();
        this.A0P = A0r;
        Integer A0S = C18280x3.A0S();
        Boolean bool = Boolean.FALSE;
        Integer A0D2 = C18270x1.A0D(A0S, bool, A0r);
        Boolean bool2 = Boolean.TRUE;
        A0r.put(C18270x1.A0G(C18270x1.A0K(C18270x1.A0F(A0D2, bool2, A0r), bool, A0r), bool2, A0r), bool2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.A06.size() != 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0G() {
        /*
            r3 = this;
            int r2 = r3.A0K()
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0041
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0041
            java.util.List r0 = r3.A06
            int r1 = r0.size()
            int r0 = r3.A0L()
            int r1 = r1 - r0
        L_0x0017:
            int r2 = r2 + r1
            boolean r0 = r3.A08
            r1 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = r3.A06
            int r0 = r0.size()
            if (r0 == 0) goto L_0x002f
            int r0 = r3.A0L()
            if (r0 <= 0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r2 = r2 + r1
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r3.A06
            int r1 = r0.size()
            r0 = 1
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            int r2 = r2 + r0
            return r2
        L_0x0041:
            java.util.List r0 = r3.A06
            int r1 = r0.size()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X8.A0G():int");
    }
}
