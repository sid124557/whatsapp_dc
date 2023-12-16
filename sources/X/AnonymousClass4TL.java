package X;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.R;
import com.whatsapp.crop.CropImageView;
import java.util.List;

/* renamed from: X.4TL  reason: invalid class name */
public final class AnonymousClass4TL extends AnonymousClass066 {
    public Rect A00 = AnonymousClass001.A0N();
    public Rect A01 = AnonymousClass001.A0N();
    public Rect A02 = AnonymousClass001.A0N();
    public Rect A03 = AnonymousClass001.A0N();
    public Rect A04 = AnonymousClass001.A0N();
    public Rect A05 = AnonymousClass001.A0N();
    public Rect A06 = AnonymousClass001.A0N();
    public Rect A07 = AnonymousClass001.A0N();
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public final int A0P;
    public final View A0Q;
    public final C179288iu A0R;

    public void A0L(C05650Ui r3, int i) {
        Rect rect;
        C162457s7.A0J(r3, 1);
        if (A0T()) {
            String simpleName = CropImageView.class.getSimpleName();
            AccessibilityNodeInfo accessibilityNodeInfo = r3.A01;
            accessibilityNodeInfo.setClassName(simpleName);
            r3.A07(C06220Ws.A08);
            if (i == AnonymousClass59K.LEFT_CROP_TO_LEFT.value) {
                r3.A09(this.A0I);
                rect = this.A02;
            } else if (i == AnonymousClass59K.LEFT_CROP_TO_RIGHT.value) {
                r3.A09(this.A0J);
                rect = this.A03;
            } else if (i == AnonymousClass59K.RIGHT_CROP_TO_LEFT.value) {
                r3.A09(this.A0K);
                rect = this.A04;
            } else if (i == AnonymousClass59K.RIGHT_CROP_TO_RIGHT.value) {
                r3.A09(this.A0L);
                rect = this.A05;
            } else if (i == AnonymousClass59K.TOP_CROP_TO_TOP.value) {
                r3.A09(this.A0N);
                rect = this.A07;
            } else if (i == AnonymousClass59K.TOP_CROP_TO_BOTTOM.value) {
                r3.A09(this.A0M);
                rect = this.A06;
            } else if (i == AnonymousClass59K.BOTTOM_CROP_TO_TOP.value) {
                r3.A09(this.A09);
                rect = this.A01;
            } else if (i == AnonymousClass59K.BOTTOM_CROP_TO_BOTTOM.value) {
                r3.A09(this.A08);
                rect = this.A00;
            } else {
                return;
            }
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    public void A0M(List list) {
        C162457s7.A0J(list, 0);
        if (A0T()) {
            for (AnonymousClass59K r0 : AnonymousClass59K.values()) {
                C86634Kw.A1V(list, r0.value);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        if (r3 == r2) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0098, code lost:
        if (r3 == r1) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00aa, code lost:
        if (r3 == r0) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P(int r11, int r12, android.os.Bundle r13) {
        /*
            r10 = this;
            X.8iu r4 = r10.A0R
            if (r4 == 0) goto L_0x0111
            boolean r0 = r10.A0T()
            if (r0 == 0) goto L_0x0111
            r0 = 16
            if (r12 != r0) goto L_0x0111
            X.59K[] r3 = X.AnonymousClass59K.values()
            int r2 = r3.length
            r1 = 0
        L_0x0014:
            if (r1 >= r2) goto L_0x010c
            r7 = r3[r1]
            int r0 = r7.value
            if (r0 != r11) goto L_0x00cb
            int r6 = r7.origin
            X.595[] r5 = X.AnonymousClass595.values()
            int r2 = r5.length
            r1 = 0
        L_0x0024:
            if (r1 >= r2) goto L_0x0107
            r3 = r5[r1]
            int r0 = r3.value
            if (r0 != r6) goto L_0x00c7
            int r6 = r7.direction
            X.595[] r5 = X.AnonymousClass595.values()
            int r2 = r5.length
            r1 = 0
        L_0x0034:
            if (r1 >= r2) goto L_0x0102
            r7 = r5[r1]
            int r0 = r7.value
            if (r0 != r6) goto L_0x00c3
            int r5 = r7.ordinal()
            r0 = 1
            r2 = 0
            if (r5 == r0) goto L_0x00c0
            r0 = 3
            r1 = -70
            if (r5 == r0) goto L_0x0051
            r1 = 0
            r0 = 2
            if (r5 == r0) goto L_0x00bd
            if (r5 != r2) goto L_0x0051
            r2 = -70
        L_0x0051:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.3Z6 r1 = X.AnonymousClass3Z6.A01(r0, r2)
            java.lang.Object r0 = r1.first
            int r6 = X.AnonymousClass001.A0K(r0)
            java.lang.Object r0 = r1.second
            int r5 = X.AnonymousClass001.A0K(r0)
            X.595 r2 = X.AnonymousClass595.LEFT
            if (r3 != r2) goto L_0x0086
            if (r7 != r2) goto L_0x0088
            java.lang.String r9 = r10.A0C
        L_0x006d:
            int r1 = r3.ordinal()
            r0 = 2
            r8 = 16
            if (r1 == r0) goto L_0x00d1
            r8 = 2
            r0 = 0
            if (r1 == r0) goto L_0x00cf
            r0 = 3
            if (r1 == r0) goto L_0x00d1
            r8 = 4
            r0 = 1
            if (r1 == r0) goto L_0x00d1
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0086:
            if (r3 != r2) goto L_0x008f
        L_0x0088:
            X.595 r0 = X.AnonymousClass595.RIGHT
            if (r7 != r0) goto L_0x008f
            java.lang.String r9 = r10.A0D
            goto L_0x006d
        L_0x008f:
            X.595 r1 = X.AnonymousClass595.TOP
            if (r3 != r1) goto L_0x0098
            if (r7 != r1) goto L_0x009a
            java.lang.String r9 = r10.A0H
            goto L_0x006d
        L_0x0098:
            if (r3 != r1) goto L_0x00a1
        L_0x009a:
            X.595 r0 = X.AnonymousClass595.BOTTOM
            if (r7 != r0) goto L_0x00a1
            java.lang.String r9 = r10.A0G
            goto L_0x006d
        L_0x00a1:
            X.595 r0 = X.AnonymousClass595.RIGHT
            if (r3 != r0) goto L_0x00aa
            if (r7 != r0) goto L_0x00ac
            java.lang.String r9 = r10.A0F
            goto L_0x006d
        L_0x00aa:
            if (r3 != r0) goto L_0x00b1
        L_0x00ac:
            if (r7 != r2) goto L_0x00b1
            java.lang.String r9 = r10.A0E
            goto L_0x006d
        L_0x00b1:
            X.595 r0 = X.AnonymousClass595.BOTTOM
            if (r3 != r0) goto L_0x00ba
            if (r7 != r1) goto L_0x00ba
            java.lang.String r9 = r10.A0B
            goto L_0x006d
        L_0x00ba:
            java.lang.String r9 = r10.A0A
            goto L_0x006d
        L_0x00bd:
            r2 = 70
            goto L_0x0051
        L_0x00c0:
            r1 = 70
            goto L_0x0051
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x0034
        L_0x00c7:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x00cb:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x00cf:
            r8 = 8
        L_0x00d1:
            com.whatsapp.crop.CropImageView r4 = (com.whatsapp.crop.CropImageView) r4
            java.util.ArrayList r0 = r4.A07
            java.util.Iterator r7 = r0.iterator()
        L_0x00d9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r2 = r7.next()
            X.5UE r2 = (X.AnonymousClass5UE) r2
            r2.A02()
            float r1 = (float) r6
            float r0 = (float) r5
            r2.A04(r8, r1, r0)
            android.graphics.Rect r0 = r2.A02()
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            int r0 = r0.left
            r4.A05(r3, r2, r1, r0)
            r4.announceForAccessibility(r9)
            goto L_0x00d9
        L_0x0100:
            r0 = 1
            return r0
        L_0x0102:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()
            throw r0
        L_0x0107:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()
            throw r0
        L_0x010c:
            java.util.NoSuchElementException r0 = X.C18320x8.A0t()
            throw r0
        L_0x0111:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TL.A0P(int, int, android.os.Bundle):boolean");
    }

    public final boolean A0T() {
        if (this.A0O && !this.A02.isEmpty() && !this.A03.isEmpty()) {
            Rect rect = this.A04;
            if (rect.isEmpty() || rect.isEmpty() || this.A07.isEmpty() || this.A06.isEmpty() || this.A01.isEmpty() || this.A00.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass4TL(View view, C179288iu r4, int i) {
        super(view);
        this.A0Q = view;
        this.A0P = i;
        this.A0R = r4;
        this.A0I = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0J = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0K = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0L = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0N = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0M = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A09 = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A08 = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0C = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0D = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0E = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0F = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0H = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0G = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0B = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
        this.A0A = C86624Kv.A0a(view.getResources(), R.string.f11nameremoved);
    }

    public int A0E(float f, float f2) {
        AnonymousClass59K r0;
        if (!A0T()) {
            return -1;
        }
        int i = (int) f;
        int i2 = (int) f2;
        if (this.A02.contains(i, i2)) {
            r0 = AnonymousClass59K.LEFT_CROP_TO_LEFT;
        } else if (this.A03.contains(i, i2)) {
            r0 = AnonymousClass59K.LEFT_CROP_TO_RIGHT;
        } else if (this.A04.contains(i, i2)) {
            r0 = AnonymousClass59K.RIGHT_CROP_TO_LEFT;
        } else if (this.A05.contains(i, i2)) {
            r0 = AnonymousClass59K.RIGHT_CROP_TO_RIGHT;
        } else if (this.A07.contains(i, i2)) {
            r0 = AnonymousClass59K.TOP_CROP_TO_TOP;
        } else if (this.A06.contains(i, i2)) {
            r0 = AnonymousClass59K.TOP_CROP_TO_BOTTOM;
        } else if (this.A01.contains(i, i2)) {
            r0 = AnonymousClass59K.BOTTOM_CROP_TO_TOP;
        } else if (!this.A00.contains(i, i2)) {
            return -1;
        } else {
            r0 = AnonymousClass59K.BOTTOM_CROP_TO_BOTTOM;
        }
        return r0.value;
    }
}
