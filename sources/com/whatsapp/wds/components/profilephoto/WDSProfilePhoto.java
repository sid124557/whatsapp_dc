package com.whatsapp.wds.components.profilephoto;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass576;
import X.AnonymousClass57t;
import X.AnonymousClass593;
import X.AnonymousClass5CO;
import X.AnonymousClass66R;
import X.AnonymousClass6G3;
import X.AnonymousClass7YX;
import X.AnonymousClass84D;
import X.AnonymousClass8P7;
import X.AnonymousClass8X6;
import X.C106895aL;
import X.C124556Cz;
import X.C142556xO;
import X.C142746xh;
import X.C1462679k;
import X.C150647Rq;
import X.C153317b2;
import X.C156257gJ;
import X.C157787is;
import X.C158547k9;
import X.C159497lw;
import X.C162457s7;
import X.C175148Xg;
import X.C175158Xh;
import X.C175168Xi;
import X.C18270x1;
import X.C18300x5;
import X.C183508q9;
import X.C378924l;
import X.C620733j;
import X.C73153f1;
import X.C73723fy;
import X.C86624Kv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

public final class WDSProfilePhoto extends AnonymousClass6G3 implements C183508q9 {
    public C620733j A00;
    public AnonymousClass57t A01;
    public C142746xh A02;
    public C142556xO A03;
    public C156257gJ A04;
    public AnonymousClass5CO A05;
    public boolean A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        this.A07 = AnonymousClass8P7.A00(C175148Xg.A00);
        this.A09 = AnonymousClass8P7.A00(C175168Xi.A00);
        this.A08 = AnonymousClass8P7.A00(C175158Xh.A00);
        this.A0A = AnonymousClass8P7.A00(new AnonymousClass8X6(context, this));
        this.A01 = AnonymousClass57t.NONE;
        C142556xO r3 = C142556xO.MEDIUM;
        this.A03 = r3;
        C142746xh r7 = C142746xh.CIRCLE;
        this.A02 = r7;
        this.A05 = new AnonymousClass576(AnonymousClass593.UNSEEN);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1462679k.A09, 0, 0);
            C162457s7.A0D(obtainStyledAttributes);
            int i = obtainStyledAttributes.getInt(2, 2);
            C142556xO[] values = C142556xO.values();
            if (i >= 0) {
                C162457s7.A0J(values, 0);
                if (i <= values.length - 1) {
                    r3 = values[i];
                }
            }
            setProfilePhotoSize(r3);
            int i2 = obtainStyledAttributes.getInt(1, -1);
            C142746xh[] values2 = C142746xh.values();
            if (i2 >= 0) {
                C162457s7.A0J(values2, 0);
                if (i2 <= values2.length - 1) {
                    r7 = values2[i2];
                }
            }
            setProfilePhotoShape(r7);
            setStatusIndicatorEnabled(obtainStyledAttributes.getBoolean(3, false));
            setProfileBadge((C156257gJ) C73723fy.A06((List) C156257gJ.A02.getValue(), obtainStyledAttributes.getInt(0, -1)));
            obtainStyledAttributes.recycle();
        }
        setCropToPadding(true);
    }

    public final void A00(AnonymousClass57t r9, boolean z) {
        double d;
        C162457s7.A0J(r9, 0);
        this.A01 = r9;
        C157787is profilePhotoRenderer = getProfilePhotoRenderer();
        AnonymousClass57t r6 = this.A01;
        C162457s7.A0J(r6, 0);
        AnonymousClass84D r5 = profilePhotoRenderer.A0K;
        int ordinal = r6.ordinal();
        if (ordinal == 1) {
            C124556Cz r3 = r5.A04;
            if (r3 == null) {
                C156257gJ r2 = (C156257gJ) r5.A0B.getValue();
                Context context = r5.A07;
                C150647Rq r0 = r5.A05;
                C18270x1.A10(r2, 0, r0);
                r3 = new C124556Cz(context, r0, r2);
                r5.A04 = r3;
            }
            r3.A07 = true;
            d = 1.0d;
        } else if (ordinal == 0) {
            C124556Cz r02 = r5.A04;
            if (r02 != null) {
                r02.A07 = false;
            }
            d = 0.0d;
        } else {
            throw C73153f1.A00();
        }
        C153317b2 r03 = (C153317b2) r5.A0C.getValue();
        if (z) {
            r03.A02(d);
            return;
        }
        r03.A01(d);
        r5.A00 = r6;
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014e, code lost:
        if (r2 == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028c, code lost:
        if (1 <= r9) goto L_0x026b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r6 = 0
            X.C162457s7.A0J(r15, r6)
            X.7is r1 = r14.getProfilePhotoRenderer()
            android.widget.ImageView$ScaleType r0 = r14.getScaleType()
            X.C162457s7.A0D(r0)
            r1.A01 = r0
            X.7is r1 = r14.getProfilePhotoRenderer()
            r0 = 0
            r1.A00 = r0
            android.graphics.drawable.Drawable r1 = r14.getDrawable()
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x02b7
            X.7is r0 = r14.getProfilePhotoRenderer()
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            r0.A00 = r1
        L_0x002a:
            X.7is r5 = r14.getProfilePhotoRenderer()
            android.graphics.RectF r4 = r5.A0E
            r4.setEmpty()
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x02b0
            android.graphics.RectF r0 = r5.A0I
            r4.set(r0)
            X.7Yy r0 = r5.A04
            float r1 = r0.A01
            r0 = 2
            float r7 = (float) r0
            float r1 = r1 / r7
            r4.inset(r1, r1)
            android.graphics.Path r9 = r5.A0B
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0066
            X.6xh r0 = r5.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x02ac
            r0 = 1
            if (r1 != r0) goto L_0x02c6
            X.6sn r0 = X.C139886sn.A00
        L_0x005b:
            boolean r0 = r0 instanceof X.C139886sn
            if (r0 == 0) goto L_0x0296
            android.graphics.Path r8 = X.C107245ax.A03(r4)
        L_0x0063:
            r9.addPath(r8)
        L_0x0066:
            X.5CO r2 = r5.A05
            boolean r0 = r2 instanceof X.AnonymousClass576
            if (r0 == 0) goto L_0x01f4
            X.66R r0 = r5.A0P
            X.AnonymousClass6C9.A0s(r15, r9, r0)
        L_0x0071:
            android.graphics.RectF r0 = r5.A0G
            r4.set(r0)
            X.7Yy r0 = r5.A04
            float r0 = r0.A00
            r4.inset(r0, r0)
        L_0x007d:
            android.graphics.Path r7 = r5.A0A
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x009d
            X.6xh r0 = r5.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x01f0
            r0 = 1
            if (r1 != r0) goto L_0x02bc
            X.6sn r0 = X.C139886sn.A00
        L_0x0092:
            boolean r0 = r0 instanceof X.C139886sn
            if (r0 == 0) goto L_0x01d8
            android.graphics.Path r8 = X.C107245ax.A03(r4)
        L_0x009a:
            r7.addPath(r8)
        L_0x009d:
            android.graphics.drawable.BitmapDrawable r0 = r5.A00
            if (r0 == 0) goto L_0x0126
            android.graphics.Bitmap r8 = r0.getBitmap()
            if (r8 == 0) goto L_0x0126
            android.graphics.RectF r3 = r5.A0F
            r3.set(r4)
            int r10 = r8.getWidth()
            int r11 = r8.getHeight()
            android.graphics.Rect r4 = r5.A0C
            r4.set(r6, r6, r10, r11)
            android.widget.ImageView$ScaleType r1 = r5.A01
            int[] r0 = X.AnonymousClass781.A00
            int r1 = X.AnonymousClass6CA.A04(r1, r0)
            r0 = 1
            r9 = 2
            if (r1 == r0) goto L_0x019e
            if (r1 == r9) goto L_0x0180
            float r2 = (float) r10
            float r0 = r3.height()
            float r2 = r2 * r0
            float r1 = (float) r11
            float r0 = r3.width()
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015e
            int r0 = r4.height()
            float r2 = (float) r0
            float r0 = r3.width()
            float r2 = r2 * r0
            float r0 = r3.height()
            float r2 = r2 / r0
            int r0 = r4.centerX()
            float r1 = (float) r0
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.left = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r4.right = r0
        L_0x00f7:
            r0 = 31
            r10 = 0
            int r9 = r15.saveLayer(r3, r10, r0)
            r15.drawARGB(r6, r6, r6, r6)
            X.66R r2 = r5.A0M
            X.AnonymousClass6C9.A0s(r15, r7, r2)
            java.lang.Object r1 = r2.getValue()
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            android.graphics.PorterDuffXfermode r0 = X.C157787is.A0Q
            r1.setXfermode(r0)
            java.lang.Object r0 = r2.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r15.drawBitmap(r8, r4, r3, r0)
            java.lang.Object r0 = r2.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setXfermode(r10)
            r15.restoreToCount(r9)
        L_0x0126:
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x012f
            X.66R r0 = r5.A0N
            X.AnonymousClass6C9.A0s(r15, r7, r0)
        L_0x012f:
            X.84D r3 = r5.A0K
            X.66R r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            X.7b2 r0 = (X.C153317b2) r0
            boolean r0 = r0.A04()
            r2 = r0 ^ 1
            if (r2 != 0) goto L_0x0147
            X.57t r1 = r3.A00
            X.57t r0 = X.AnonymousClass57t.CHECKED
            if (r1 != r0) goto L_0x0150
        L_0x0147:
            X.6Cz r0 = r3.A04
            if (r0 == 0) goto L_0x014e
            r0.draw(r15)
        L_0x014e:
            if (r2 != 0) goto L_0x0156
        L_0x0150:
            X.57t r1 = r3.A00
            X.57t r0 = X.AnonymousClass57t.NONE
            if (r1 != r0) goto L_0x015d
        L_0x0156:
            X.6Cz r0 = r3.A03
            if (r0 == 0) goto L_0x015d
            r0.draw(r15)
        L_0x015d:
            return
        L_0x015e:
            int r0 = r4.width()
            float r2 = (float) r0
            float r0 = r3.height()
            float r2 = r2 * r0
            float r0 = r3.width()
            float r2 = r2 / r0
            int r0 = r4.centerY()
            float r1 = (float) r0
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r0 = (int) r1
            r4.top = r0
            float r0 = (float) r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r4.bottom = r0
            goto L_0x00f7
        L_0x0180:
            float r2 = r3.centerX()
            float r1 = (float) r10
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r9
            float r2 = r2 - r0
            r3.left = r2
            float r2 = r2 + r1
            r3.right = r2
            float r2 = r3.centerY()
            float r1 = (float) r11
            float r0 = r1 / r9
            float r2 = r2 - r0
            r3.top = r2
            float r2 = r2 + r1
            r3.bottom = r2
            goto L_0x00f7
        L_0x019e:
            float r10 = (float) r10
            float r2 = r3.height()
            float r2 = r2 * r10
            float r1 = (float) r11
            float r0 = r3.width()
            float r0 = r0 * r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c3
            float r2 = r3.width()
            float r2 = r2 * r1
            float r2 = r2 / r10
            float r1 = r3.centerY()
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            r3.top = r1
            float r1 = r1 + r2
            r3.bottom = r1
            goto L_0x00f7
        L_0x01c3:
            float r2 = r3.height()
            float r2 = r2 * r10
            float r2 = r2 / r1
            float r1 = r3.centerX()
            float r0 = (float) r9
            float r0 = r2 / r0
            float r1 = r1 - r0
            r3.left = r1
            float r1 = r1 + r2
            r3.right = r1
            goto L_0x00f7
        L_0x01d8:
            android.graphics.Path r8 = X.AnonymousClass002.A06()
            float r3 = r4.width()
            r0 = 2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r2 = r4.left
            float r2 = r2 + r3
            float r1 = r4.top
            float r1 = r1 + r3
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r8.addCircle(r2, r1, r3, r0)
            goto L_0x009a
        L_0x01f0:
            X.6sm r0 = X.C139876sm.A00
            goto L_0x0092
        L_0x01f4:
            boolean r0 = r2 instanceof X.AnonymousClass577
            if (r0 == 0) goto L_0x0071
            X.6xh r0 = r5.A02
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x0292
            r0 = 1
            if (r1 != r0) goto L_0x02c1
            X.6sn r0 = X.C139886sn.A00
        L_0x0205:
            X.577 r2 = (X.AnonymousClass577) r2
            java.util.List r10 = r2.A00
            int r9 = r10.size()
            boolean r0 = r0 instanceof X.C139886sn
            if (r0 == 0) goto L_0x025f
            android.graphics.Path r0 = X.C107245ax.A03(r4)
            java.util.List r8 = X.C18290x4.A12(r0)
        L_0x0219:
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
        L_0x021e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r7 = r8.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x0231
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0231:
            android.graphics.Path r7 = (android.graphics.Path) r7
            X.66R r0 = r5.A0O
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r10.get(r2)
            X.593 r0 = (X.AnonymousClass593) r0
            int r0 = r0.statusColor
            java.lang.Object r0 = X.AnonymousClass001.A0i(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x025d
            int r2 = r0.intValue()
            X.66R r1 = r5.A0P
            java.lang.Object r0 = r1.getValue()
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r2)
            X.AnonymousClass6C9.A0s(r15, r7, r1)
        L_0x025d:
            r2 = r3
            goto L_0x021e
        L_0x025f:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            r13 = 1135869952(0x43b40000, float:360.0)
            float r0 = (float) r9
            float r13 = r13 / r0
            r3 = 1
            if (r9 != r3) goto L_0x0282
            r12 = 0
        L_0x026b:
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x026d:
            android.graphics.Path r2 = X.AnonymousClass002.A06()
            float r1 = r12 / r7
            float r1 = r1 + r11
            float r0 = r13 - r12
            r2.addArc(r4, r1, r0)
            r8.add(r2)
            float r11 = r11 + r13
            if (r3 == r9) goto L_0x0219
            int r3 = r3 + 1
            goto L_0x026d
        L_0x0282:
            r0 = 1103101952(0x41c00000, float:24.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x028f
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r13 / r0
        L_0x028c:
            if (r3 > r9) goto L_0x0219
            goto L_0x026b
        L_0x028f:
            r12 = 1094713344(0x41400000, float:12.0)
            goto L_0x028c
        L_0x0292:
            X.6sm r0 = X.C139876sm.A00
            goto L_0x0205
        L_0x0296:
            android.graphics.Path r8 = X.AnonymousClass002.A06()
            float r3 = r4.width()
            float r3 = r3 / r7
            float r2 = r4.left
            float r2 = r2 + r3
            float r1 = r4.top
            float r1 = r1 + r3
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r8.addCircle(r2, r1, r3, r0)
            goto L_0x0063
        L_0x02ac:
            X.6sm r0 = X.C139876sm.A00
            goto L_0x005b
        L_0x02b0:
            android.graphics.RectF r0 = r5.A0G
            r4.set(r0)
            goto L_0x007d
        L_0x02b7:
            super.onDraw(r15)
            goto L_0x002a
        L_0x02bc:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x02c1:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x02c6:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.profilephoto.WDSProfilePhoto.onDraw(android.graphics.Canvas):void");
    }

    public final void setProfilePhotoShape(C142746xh r4) {
        C162457s7.A0J(r4, 0);
        boolean A1W = C18300x5.A1W(r4, this.A02);
        this.A02 = r4;
        if (A1W && this.A0A.BHk()) {
            C157787is profilePhotoRenderer = getProfilePhotoRenderer();
            C142746xh r1 = this.A02;
            C162457s7.A0J(r1, 0);
            profilePhotoRenderer.A02 = r1;
            profilePhotoRenderer.A0K.A01 = r1;
            requestLayout();
        }
    }

    public final void setProfilePhotoSize(C142556xO r7) {
        C124556Cz r0;
        C124556Cz r02;
        C162457s7.A0J(r7, 0);
        boolean A1W = C18300x5.A1W(r7, this.A03);
        this.A03 = r7;
        if (A1W && this.A0A.BHk()) {
            C157787is profilePhotoRenderer = getProfilePhotoRenderer();
            C142556xO r2 = this.A03;
            C162457s7.A0J(r2, 0);
            profilePhotoRenderer.A03 = r2;
            profilePhotoRenderer.A04 = C159497lw.A02(r2).A00(profilePhotoRenderer.A08);
            profilePhotoRenderer.A00();
            AnonymousClass84D r4 = profilePhotoRenderer.A0K;
            boolean A1W2 = C18300x5.A1W(r4.A02, r2);
            r4.A02 = r2;
            if (A1W2) {
                Context context = r4.A07;
                r4.A05 = C159497lw.A01(context, r2);
                if (r4.A04 != null) {
                    C156257gJ r22 = (C156257gJ) r4.A0B.getValue();
                    C150647Rq r1 = r4.A05;
                    C18270x1.A10(r22, 0, r1);
                    r0 = new C124556Cz(context, r1, r22);
                } else {
                    r0 = null;
                }
                r4.A04 = r0;
                C156257gJ r23 = r4.A06;
                if (r23 != null) {
                    C150647Rq r12 = r4.A05;
                    C162457s7.A0J(r12, 2);
                    r02 = new C124556Cz(context, r12, r23);
                } else {
                    r02 = null;
                }
                r4.A03 = r02;
            }
            requestLayout();
        }
    }

    public final void setProfileStatus(AnonymousClass5CO r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
        C157787is profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A05 = r2;
        profilePhotoRenderer.A00();
        invalidate();
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    private final RectF getDrawRectF() {
        return (RectF) this.A07.getValue();
    }

    private final C158547k9 getMarginOffsets() {
        return (C158547k9) this.A08.getValue();
    }

    private final C158547k9 getOriginalMargins() {
        return (C158547k9) this.A09.getValue();
    }

    private final C157787is getProfilePhotoRenderer() {
        return (C157787is) this.A0A.getValue();
    }

    public final C156257gJ getProfileBadge() {
        return this.A04;
    }

    public final AnonymousClass57t getProfilePhotoSelectionState() {
        return this.A01;
    }

    public final C142746xh getProfilePhotoShape() {
        return this.A02;
    }

    public final C142556xO getProfilePhotoSize() {
        return this.A03;
    }

    public final AnonymousClass5CO getProfileStatus() {
        return this.A05;
    }

    public final boolean getStatusIndicatorEnabled() {
        return this.A06;
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C158547k9 originalMargins = getOriginalMargins();
            int i = marginLayoutParams.leftMargin;
            originalMargins.A01 = i;
            originalMargins.A03 = marginLayoutParams.topMargin;
            originalMargins.A02 = marginLayoutParams.rightMargin;
            originalMargins.A00 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = i + getMarginOffsets().A01;
            marginLayoutParams.topMargin += getMarginOffsets().A03;
            marginLayoutParams.rightMargin += getMarginOffsets().A02;
            marginLayoutParams.bottomMargin += getMarginOffsets().A00;
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setProfileBadge(C156257gJ r6) {
        C124556Cz r0;
        boolean z = !C162457s7.A0P(r6, this.A04);
        this.A04 = r6;
        if (z && this.A0A.BHk()) {
            C157787is profilePhotoRenderer = getProfilePhotoRenderer();
            AnonymousClass84D r3 = profilePhotoRenderer.A0K;
            boolean z2 = !C162457s7.A0P(r3.A06, r6);
            r3.A06 = r6;
            if (z2) {
                if (r6 != null) {
                    Context context = r3.A07;
                    C150647Rq r1 = r3.A05;
                    C162457s7.A0J(r1, 2);
                    r0 = new C124556Cz(context, r1, r6);
                } else {
                    r0 = null;
                }
                r3.A03 = r0;
            }
            r3.A02(profilePhotoRenderer.A0G);
            invalidate();
        }
    }

    public final void setStatusIndicatorEnabled(boolean z) {
        boolean A1X = AnonymousClass001.A1X(z ? 1 : 0, this.A06 ? 1 : 0);
        this.A06 = z;
        if (A1X && this.A0A.BHk()) {
            getProfilePhotoRenderer().A07 = z;
            requestLayout();
        }
    }

    public void onMeasure(int i, int i2) {
        float f;
        C157787is profilePhotoRenderer = getProfilePhotoRenderer();
        C142556xO r2 = profilePhotoRenderer.A03;
        Context context = profilePhotoRenderer.A08;
        PointF A002 = C159497lw.A00(context, profilePhotoRenderer.A02, r2);
        float A003 = C159497lw.A01(context, profilePhotoRenderer.A03).A00();
        A002.offset(A003, A003);
        float dimension = context.getResources().getDimension(profilePhotoRenderer.A03.dimension);
        AnonymousClass7YX r0 = new AnonymousClass7YX(dimension, dimension);
        float f2 = r0.A01;
        A002.offset(f2, r0.A00);
        float f3 = (profilePhotoRenderer.A04.A02.A01 - f2) / ((float) 2);
        A002.offset(f3, f3);
        AnonymousClass7YX r3 = profilePhotoRenderer.A04.A02;
        AnonymousClass7YX r02 = new AnonymousClass7YX(Math.max(r3.A01, A002.x), Math.max(r3.A00, A002.y));
        float f4 = r02.A00;
        int i3 = (int) f4;
        float f5 = r02.A01;
        int i4 = (int) f5;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(i4, i3);
        getDrawRectF().set(0.0f, 0.0f, f5, f4);
        C157787is profilePhotoRenderer2 = getProfilePhotoRenderer();
        RectF drawRectF = getDrawRectF();
        C162457s7.A0J(drawRectF, 0);
        RectF rectF = profilePhotoRenderer2.A0D;
        rectF.set(drawRectF);
        RectF rectF2 = profilePhotoRenderer2.A0I;
        float f6 = rectF.top;
        rectF2.top = f6;
        rectF2.bottom = f6 + profilePhotoRenderer2.A04.A02.A00;
        if (profilePhotoRenderer2.A0J.A0U()) {
            f = rectF.right - profilePhotoRenderer2.A04.A02.A01;
        } else {
            f = rectF.left;
        }
        rectF2.left = f;
        rectF2.right = f + profilePhotoRenderer2.A04.A02.A01;
        RectF rectF3 = profilePhotoRenderer2.A0G;
        rectF3.set(rectF2);
        float f7 = profilePhotoRenderer2.A04.A01;
        rectF3.inset(f7, f7);
        RectF rectF4 = profilePhotoRenderer2.A0H;
        rectF4.set(rectF3);
        if (profilePhotoRenderer2.A07) {
            float f8 = profilePhotoRenderer2.A04.A00;
            rectF4.inset(f8, f8);
        }
        profilePhotoRenderer2.A0K.A02(rectF3);
        profilePhotoRenderer2.A0A.reset();
        profilePhotoRenderer2.A09.reset();
        profilePhotoRenderer2.A0B.reset();
        profilePhotoRenderer2.A00();
        setBackgroundDrawable((Drawable) getProfilePhotoRenderer().A0L.getValue());
        RectF rectF5 = getProfilePhotoRenderer().A0G;
        C158547k9 marginOffsets = getMarginOffsets();
        marginOffsets.A01 = (int) (getDrawRectF().left - rectF5.left);
        marginOffsets.A03 = (int) (getDrawRectF().top - rectF5.top);
        marginOffsets.A02 = (int) (rectF5.right - getDrawRectF().right);
        marginOffsets.A00 = (int) (rectF5.bottom - getDrawRectF().bottom);
        RectF rectF6 = getProfilePhotoRenderer().A0H;
        setPadding((int) (rectF6.left - getDrawRectF().left), (int) (rectF6.top - getDrawRectF().top), (int) (getDrawRectF().right - rectF6.right), (int) (getDrawRectF().bottom - rectF6.bottom));
        C106895aL.A01(this, getOriginalMargins());
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        C157787is profilePhotoRenderer = getProfilePhotoRenderer();
        profilePhotoRenderer.A06 = z;
        if (z) {
            ((Paint) profilePhotoRenderer.A0N.getValue()).setColor(AnonymousClass0Y8.A04(profilePhotoRenderer.A08, R.color.f5nameremoved));
        }
    }

    public /* synthetic */ WDSProfilePhoto(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSProfilePhoto(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
