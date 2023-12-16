package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import com.whatsapp.TextData;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4QG  reason: invalid class name */
public final class AnonymousClass4QG extends FrameLayout implements AnonymousClass4GJ {
    public CardView A00;
    public AnonymousClass64E A01;
    public TextEmojiLabel A02;
    public C620633i A03;
    public C56612sH A04;
    public AnonymousClass5Y0 A05;
    public AnonymousClass67B A06;
    public C106685Zz A07;
    public C60152y5 A08;
    public C30481mW A09;
    public C104835Sn A0A;
    public C116855qy A0B;
    public boolean A0C;
    public final List A0D;

    public final void setEmojiLoader(AnonymousClass5Y0 r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setLinkifyWeb(C106685Zz r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setMessage(C30481mW r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setSharedPreferencesFactory(C60152y5 r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(C620633i r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setTime(C56612sH r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r5.length != 0) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTextContent(java.lang.String r24) {
        /*
            r23 = this;
            r9 = r24
            android.text.SpannableStringBuilder r8 = X.C18330xA.A00(r9)
            r7 = r23
            X.33i r1 = r7.getSystemServices()
            X.2y5 r0 = r7.getSharedPreferencesFactory()
            X.C107635bd.A07(r1, r0, r8)
            X.5Zz r0 = r7.getLinkifyWeb()
            r0.A06(r8)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r6 = 0
            java.lang.Object[] r5 = r8.getSpans(r6, r1, r0)
            android.text.style.URLSpan[] r5 = (android.text.style.URLSpan[]) r5
            X.5Zz r0 = r7.getLinkifyWeb()
            int r10 = X.C107415bH.A02(r0, r9)
            com.whatsapp.TextEmojiLabel r3 = r7.A02
            java.lang.String r0 = "textContentView"
            if (r3 != 0) goto L_0x003a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x003a:
            r0 = 150(0x96, float:2.1E-43)
            if (r10 >= r0) goto L_0x012e
            r0 = 17
            r3.setGravity(r0)
            r0 = 4
            r3.setTextAlignment(r0)
        L_0x0047:
            android.util.DisplayMetrics r1 = X.C86614Ku.A0E(r7)
            int r0 = r1.heightPixels
            float r11 = (float) r0
            float r0 = r1.density
            float r11 = r11 / r0
            X.67B r0 = r7.A06
            if (r0 == 0) goto L_0x012b
            X.1mW r0 = r7.A09
            if (r0 == 0) goto L_0x012b
            X.C162457s7.A0H(r5)
            int r0 = r5.length
            if (r0 == 0) goto L_0x012b
            X.1mW r4 = r7.A09
            if (r4 == 0) goto L_0x012b
            X.67B r2 = r7.A06
            if (r2 == 0) goto L_0x012b
            r0 = r5[r6]
            java.lang.String r1 = r0.getURL()
            X.4uZ r0 = r4.A0n()
            java.util.Set r2 = r2.BBH(r0, r4, r1)
        L_0x0075:
            r0 = 350(0x15e, float:4.9E-43)
            r1 = 0
            if (r10 > r0) goto L_0x007b
            r1 = 1
        L_0x007b:
            X.1mW r0 = r7.A09
            if (r0 == 0) goto L_0x0090
            byte[] r0 = r0.A1z()
            if (r0 == 0) goto L_0x0090
            if (r1 == 0) goto L_0x0090
            if (r2 != 0) goto L_0x0090
            X.C162457s7.A0H(r5)
            int r0 = r5.length
            r1 = 1
            if (r0 != 0) goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            int r0 = (int) r11
            int r0 = X.C107415bH.A01(r10, r0, r1)
            float r1 = (float) r0
            r0 = 2
            r3.setTextSize(r0, r1)
            android.content.Context r2 = r7.getContext()
            android.text.TextPaint r1 = r3.getPaint()
            X.5Y0 r0 = r7.getEmojiLoader()
            X.C107345b9.A03(r2, r1, r0, r8)
            X.C162457s7.A0H(r5)
            int r4 = r5.length
            r11 = 0
            r14 = 0
        L_0x00b0:
            if (r11 >= r4) goto L_0x013c
            r10 = r5[r11]
            java.lang.String r18 = r10.getURL()
            int r2 = r8.getSpanStart(r10)
            int r1 = r8.getSpanEnd(r10)
            int r0 = r1 - r2
            int r14 = r14 + r0
            r8.removeSpan(r10)
            X.C162457s7.A0H(r18)
            java.lang.String r12 = X.AnonymousClass5CC.A00(r18)
            r8.replace(r2, r1, r12)
            int r1 = X.C86664Kz.A0L(r12, r2)
            android.content.res.Resources r10 = r7.getResources()
            r0 = 2131168338(0x7f070c52, float:1.7950975E38)
            int r13 = X.AnonymousClass4L0.A01(r10, r0)
            float r10 = (float) r13
            r0 = 0
            r3.setShadowLayer(r10, r0, r0, r6)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r10 >= r0) goto L_0x00ef
            r10 = 1
            r0 = 0
            r3.setLayerType(r10, r0)
        L_0x00ef:
            r3.setPadding(r13, r13, r13, r13)
            float r0 = r3.getTextSize()
            int r10 = (int) r0
            java.lang.String r0 = "…"
            boolean r22 = X.C175728Zm.A0S(r12, r0, r6)
            X.64E r0 = r7.A01
            X.5i0 r15 = new X.5i0
            r20 = r1
            r21 = r10
            r19 = r2
            r17 = r3
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r8.setSpan(r15, r2, r1, r6)
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r10 = r8.getSpans(r2, r1, r0)
            android.text.style.ImageSpan[] r10 = (android.text.style.ImageSpan[]) r10
            X.C162457s7.A0H(r10)
            int r2 = r10.length
            r1 = 0
        L_0x011e:
            if (r1 >= r2) goto L_0x0128
            r0 = r10[r1]
            r8.removeSpan(r0)
            int r1 = r1 + 1
            goto L_0x011e
        L_0x0128:
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x012b:
            r2 = 0
            goto L_0x0075
        L_0x012e:
            r0 = 16
            r3.setGravity(r0)
            r0 = 5
            r3.setTextAlignment(r0)
            r3.setTextDirection(r0)
            goto L_0x0047
        L_0x013c:
            r3.setText(r8)
            r3.requestLayout()
            int r8 = X.AnonymousClass5VB.A00(r9)
            int r3 = r9.length()
            r2 = 0
        L_0x014b:
            if (r2 >= r3) goto L_0x0161
            if (r8 <= 0) goto L_0x0161
            int r1 = r9.codePointAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 == 0) goto L_0x015b
            int r8 = r8 + -1
        L_0x015b:
            int r0 = java.lang.Character.charCount(r1)
            int r2 = r2 + r0
            goto L_0x014b
        L_0x0161:
            int r8 = r8 - r14
            int r8 = r8 + r4
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r8 <= r0) goto L_0x0169
            r8 = 1000(0x3e8, float:1.401E-42)
        L_0x0169:
            int r0 = r8 * 60
            long r2 = (long) r0
            r0 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r0
            X.2sH r1 = r7.getTime()
            X.5Sn r0 = new X.5Sn
            r0.<init>(r1, r2)
            r7.A0A = r0
            java.util.List r1 = r7.A0D
            r1.clear()
        L_0x017f:
            if (r6 >= r4) goto L_0x0190
            r0 = r5[r6]
            java.lang.String r0 = r0.getURL()
            X.C162457s7.A0D(r0)
            r1.add(r0)
            int r6 = r6 + 1
            goto L_0x017f
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QG.setTextContent(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void setTextContentProperties(TextData textData) {
        int i = textData.textColor;
        if (i != 0) {
            TextEmojiLabel textEmojiLabel = this.A02;
            if (textEmojiLabel == null) {
                throw C18270x1.A0S("textContentView");
            }
            textEmojiLabel.setTextColor(i);
        }
        int i2 = textData.backgroundColor;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 == null) {
            throw C18270x1.A0S("textContentView");
        }
        textEmojiLabel2.setTypeface(C107415bH.A04(C18290x4.A0F(this), textData.fontStyle));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final List getDisplayedUrls() {
        return this.A0D;
    }

    public final AnonymousClass5Y0 getEmojiLoader() {
        AnonymousClass5Y0 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public final C106685Zz getLinkifyWeb() {
        C106685Zz r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifyWeb");
    }

    public final C60152y5 getSharedPreferencesFactory() {
        C60152y5 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("sharedPreferencesFactory");
    }

    public final C104835Sn getStaticContentPlayer() {
        C104835Sn r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("staticContentPlayer");
    }

    public final C620633i getSystemServices() {
        C620633i r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemServices");
    }

    public final C56612sH getTime() {
        C56612sH r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("time");
    }

    public final CardView getWebPagePreviewContainer() {
        CardView cardView = this.A00;
        if (cardView != null) {
            return cardView;
        }
        throw C18270x1.A0S("webPagePreviewContainer");
    }

    public AnonymousClass4QG(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A07 = C86634Kw.A0m(A002);
            this.A04 = C64333Db.A2p(A002);
            this.A05 = C64333Db.A3o(A002);
            this.A03 = C64333Db.A2o(A002);
            this.A08 = C64333Db.A74(A002);
        }
        this.A0D = AnonymousClass001.A0s();
        View A0h = C86664Kz.A0h(LayoutInflater.from(context), this, R.layout.f8nameremoved);
        this.A02 = (TextEmojiLabel) C18290x4.A0M(A0h, R.id.message_text);
        this.A00 = (CardView) C18290x4.A0M(A0h, R.id.web_page_preview_container);
    }

    public final void setLinkCallback(AnonymousClass64E r1) {
        this.A01 = r1;
    }

    public final void setPhishingManager(AnonymousClass67B r1) {
        this.A06 = r1;
    }
}
