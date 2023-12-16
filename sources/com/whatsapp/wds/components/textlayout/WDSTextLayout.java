package com.whatsapp.wds.components.textlayout;

import X.AnonymousClass4GP;
import X.AnonymousClass75U;
import X.AnonymousClass75V;
import X.AnonymousClass8ZZ;
import X.C141376vT;
import X.C141626vs;
import X.C141636vt;
import X.C162457s7;
import X.C183528qB;
import X.C188468yw;
import X.C188488yy;
import X.C378924l;
import X.C86624Kv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class WDSTextLayout extends FrameLayout {
    public static final /* synthetic */ C188488yy[] A0G;
    public C183528qB A00;
    public C183528qB A01;
    public final AnonymousClass4GP A02;
    public final C188468yw A03;
    public final C188468yw A04;
    public final C188468yw A05;
    public final C188468yw A06;
    public final C188468yw A07;
    public final C188468yw A08;
    public final C188468yw A09;
    public final C188468yw A0A;
    public final C188468yw A0B;
    public final C188468yw A0C;
    public final C188468yw A0D;
    public final C188468yw A0E;
    public final C188468yw A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WDSTextLayout(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r0 = 1
            X.C162457s7.A0J(r6, r0)
            r5.<init>(r6, r7)
            X.8Wk r1 = new X.8Wk
            r1.<init>(r5)
            r5.A02 = r1
            X.6tA r2 = X.C140106tA.A00
            X.8Ze r0 = new X.8Ze
            r0.<init>(r5, r2)
            r5.A0F = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A0A = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A09 = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A07 = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A08 = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A04 = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A06 = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A0C = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A0E = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A0B = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A0D = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A05 = r0
            X.8PF r0 = new X.8PF
            r0.<init>(r1)
            r5.A03 = r0
            r1 = -2
            r4 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r4, r1)
            r5.setLayoutParams(r0)
            if (r7 == 0) goto L_0x010f
            int[] r0 = X.C1462679k.A0C
            r1 = 0
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r7, r0, r1, r1)
            X.C162457s7.A0D(r3)
            r0 = 3
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r5.setHeaderImage(r0)
            r0 = 4
            java.lang.String r0 = r3.getString(r0)
            r5.setHeadlineText(r0)
            java.lang.String r0 = r3.getString(r1)
            r5.setDescriptionText(r0)
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r5.setFootnoteText(r0)
            r0 = 6
            java.lang.String r0 = r3.getString(r0)
            r5.setPrimaryButtonText(r0)
            r0 = 7
            java.lang.String r0 = r3.getString(r0)
            r5.setSecondaryButtonText(r0)
            r0 = 9
            int r1 = r3.getResourceId(r0, r4)
            if (r1 == r4) goto L_0x00c0
            X.6t7 r0 = new X.6t7
            r0.<init>(r1)
            r5.setContent(r0)
        L_0x00c0:
            X.6vs[] r2 = X.C141626vs.values()
            r0 = 1
            int r1 = r3.getInt(r0, r4)
            if (r1 < 0) goto L_0x0116
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0116
            r0 = r2[r1]
        L_0x00d6:
            r5.setFootnotePosition(r0)
            X.6vt[] r2 = X.C141636vt.values()
            r0 = 8
            int r1 = r3.getInt(r0, r4)
            if (r1 < 0) goto L_0x0113
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0113
            r0 = r2[r1]
        L_0x00f0:
            r5.setLayoutSize(r0)
            X.6vT[] r2 = X.C141376vT.values()
            r0 = 5
            int r1 = r3.getInt(r0, r4)
            if (r1 < 0) goto L_0x0110
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            int r0 = r2.length
            int r0 = r0 + -1
            if (r1 > r0) goto L_0x0110
            r0 = r2[r1]
        L_0x0109:
            r5.setLayoutStyle(r0)
            r3.recycle()
        L_0x010f:
            return
        L_0x0110:
            X.6vT r0 = X.C141376vT.CARD
            goto L_0x0109
        L_0x0113:
            X.6vt r0 = X.C141636vt.MEDIUM
            goto L_0x00f0
        L_0x0116:
            X.6vs r0 = X.C141626vs.CONTENT_END
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.textlayout.WDSTextLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void setTextLayoutViewState(AnonymousClass75V r4) {
        C162457s7.A0J(r4, 0);
        this.A0F.Bnj(this, r4, A0G[0]);
    }

    static {
        Class<WDSTextLayout> cls = WDSTextLayout.class;
        A0G = new C188488yy[]{new AnonymousClass8ZZ(cls, "textLayoutViewState", "getTextLayoutViewState()Lcom/whatsapp/wds/components/textlayout/model/TextLayoutViewState;"), new AnonymousClass8ZZ(cls, "layoutStyle", "getLayoutStyle()Lcom/whatsapp/wds/components/textlayout/attributes/TextLayoutStyle;"), new AnonymousClass8ZZ(cls, "layoutSize", "getLayoutSize()Lcom/whatsapp/wds/components/textlayout/attributes/TextLayoutSize;"), new AnonymousClass8ZZ(cls, "headerImage", "getHeaderImage()Landroid/graphics/drawable/Drawable;"), new AnonymousClass8ZZ(cls, "headlineText", "getHeadlineText()Ljava/lang/CharSequence;"), new AnonymousClass8ZZ(cls, "descriptionText", "getDescriptionText()Ljava/lang/CharSequence;"), new AnonymousClass8ZZ(cls, "footnoteText", "getFootnoteText()Ljava/lang/CharSequence;"), new AnonymousClass8ZZ(cls, "primaryButtonText", "getPrimaryButtonText()Ljava/lang/String;"), new AnonymousClass8ZZ(cls, "secondaryButtonText", "getSecondaryButtonText()Ljava/lang/String;"), new AnonymousClass8ZZ(cls, "primaryButtonClickListener", "getPrimaryButtonClickListener()Landroid/view/View$OnClickListener;"), new AnonymousClass8ZZ(cls, "secondaryButtonClickListener", "getSecondaryButtonClickListener()Landroid/view/View$OnClickListener;"), new AnonymousClass8ZZ(cls, "footnotePosition", "getFootnotePosition()Lcom/whatsapp/wds/components/textlayout/attributes/FootnotePosition;"), new AnonymousClass8ZZ(cls, "content", "getContent()Lcom/whatsapp/wds/components/textlayout/model/TextLayoutViewState$ContentView$Content;")};
    }

    public final AnonymousClass75U getContent() {
        return (AnonymousClass75U) this.A03.BEB(this, A0G[12]);
    }

    public final CharSequence getDescriptionText() {
        return (CharSequence) this.A04.BEB(this, A0G[5]);
    }

    public final C141626vs getFootnotePosition() {
        return (C141626vs) this.A05.BEB(this, A0G[11]);
    }

    public final CharSequence getFootnoteText() {
        return (CharSequence) this.A06.BEB(this, A0G[6]);
    }

    public final Drawable getHeaderImage() {
        return (Drawable) this.A07.BEB(this, A0G[3]);
    }

    public final CharSequence getHeadlineText() {
        return (CharSequence) this.A08.BEB(this, A0G[4]);
    }

    public final C141636vt getLayoutSize() {
        return (C141636vt) this.A09.BEB(this, A0G[2]);
    }

    public final C141376vT getLayoutStyle() {
        return (C141376vT) this.A0A.BEB(this, A0G[1]);
    }

    public final View.OnClickListener getPrimaryButtonClickListener() {
        return (View.OnClickListener) this.A0B.BEB(this, A0G[9]);
    }

    public final String getPrimaryButtonText() {
        return (String) this.A0C.BEB(this, A0G[7]);
    }

    public final View.OnClickListener getSecondaryButtonClickListener() {
        return (View.OnClickListener) this.A0D.BEB(this, A0G[10]);
    }

    public final String getSecondaryButtonText() {
        return (String) this.A0E.BEB(this, A0G[8]);
    }

    public final AnonymousClass75V getTextLayoutViewState() {
        return (AnonymousClass75V) this.A0F.BEB(this, A0G[0]);
    }

    public final void setContent(AnonymousClass75U r4) {
        this.A03.Bnj(this, r4, A0G[12]);
    }

    public final void setDescriptionText(CharSequence charSequence) {
        this.A04.Bnj(this, charSequence, A0G[5]);
    }

    public final void setFootnotePosition(C141626vs r4) {
        this.A05.Bnj(this, r4, A0G[11]);
    }

    public final void setFootnoteText(CharSequence charSequence) {
        this.A06.Bnj(this, charSequence, A0G[6]);
    }

    public final void setHeaderImage(Drawable drawable) {
        this.A07.Bnj(this, drawable, A0G[3]);
    }

    public final void setHeadlineText(CharSequence charSequence) {
        this.A08.Bnj(this, charSequence, A0G[4]);
    }

    public final void setLayoutSize(C141636vt r4) {
        this.A09.Bnj(this, r4, A0G[2]);
    }

    public final void setLayoutStyle(C141376vT r4) {
        this.A0A.Bnj(this, r4, A0G[1]);
    }

    public final void setPrimaryButtonClickListener(View.OnClickListener onClickListener) {
        this.A0B.Bnj(this, onClickListener, A0G[9]);
    }

    public final void setPrimaryButtonText(String str) {
        this.A0C.Bnj(this, str, A0G[7]);
    }

    public final void setSecondaryButtonClickListener(View.OnClickListener onClickListener) {
        this.A0D.Bnj(this, onClickListener, A0G[10]);
    }

    public final void setSecondaryButtonText(String str) {
        this.A0E.Bnj(this, str, A0G[8]);
    }

    public /* synthetic */ WDSTextLayout(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSTextLayout(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
