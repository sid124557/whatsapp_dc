package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.5Xl  reason: invalid class name and case insensitive filesystem */
public class C106055Xl {
    public int A00;
    public int A01;
    public C94004ph A02;
    public boolean A03;
    public final Context A04;
    public final C85244Fm A05;
    public final AnonymousClass5KC A06;
    public final C93314oJ A07;
    public final AnonymousClass679 A08;
    public final C114635nM A09;
    public final AnonymousClass1VX A0A;
    public final C56072rN A0B;
    public final C33141sV A0C;
    public final WebPagePreviewView A0D;

    public static final float A00(C624134x r2, AnonymousClass32K r3) {
        if (r3.A01 != 4) {
            new BitmapFactory.Options().inJustDecodeBounds = true;
            C55592qb r1 = r2.A0l;
            if (r1 != null) {
                float f = ((float) r1.A00) / ((float) r1.A01);
                if (f < 1.0f) {
                    return Math.max(f, 0.5625f);
                }
                return Math.min(f, 1.0f);
            }
        }
        return 0.5625f;
    }

    public final int A01(C624134x r4) {
        int A012;
        AnonymousClass679 r2 = this.A08;
        boolean BHf = r2.BHf(r4);
        Context context = this.A04;
        if (BHf) {
            A012 = r2.B5v(context, this.A07.A0d.left);
        } else {
            A012 = AnonymousClass5YO.A01(context, 72);
        }
        return (A012 - this.A00) - this.A01;
    }

    public final C185528tp A02(C624134x r8, AnonymousClass32K r9, Bitmap[] bitmapArr) {
        WebPagePreviewView webPagePreviewView = this.A0D;
        webPagePreviewView.setLargeThumbSizeWidthMatchParent(this.A03);
        int A012 = A01(r8);
        int A002 = (int) (((float) A012) * A00(r8, r9));
        if (this.A03) {
            webPagePreviewView.setVideoLargeThumbFrameHeight(A002);
        } else {
            webPagePreviewView.setImageLargeThumbFrameHeight(A002);
        }
        return new C116335q7(this.A04, webPagePreviewView, bitmapArr, A012, this.A03);
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [X.5q9] */
    /* JADX WARNING: type inference failed for: r7v6, types: [X.8tp] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        if (r4.A0X(2060) == false) goto L_0x011b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C93314oJ r22, X.C624134x r23, X.AnonymousClass66v r24, X.AnonymousClass32K r25, boolean r26, boolean r27, boolean r28) {
        /*
            r21 = this;
            r15 = r21
            X.5nM r4 = r15.A09
            r1 = r25
            java.lang.String r3 = r1.A03
            r0 = r23
            com.whatsapp.jid.UserJid r2 = r0.A0o()
            java.util.Set r17 = r4.BBH(r2, r0, r3)
            if (r17 == 0) goto L_0x0056
            com.whatsapp.webpagepreview.WebPagePreviewView r10 = r15.A0D
            r10.A03()
            r2 = r22
            X.4QQ r4 = r2.A0J
            if (r4 == 0) goto L_0x002c
            X.58V r3 = X.AnonymousClass58V.FORWARD
            X.58V r2 = r4.A00
            if (r3 != r2) goto L_0x002c
            android.widget.ImageView r3 = r4.A01
            r2 = 8
            r3.setVisibility(r2)
        L_0x002c:
            r19 = 2
            X.5ep r14 = new X.5ep
            r16 = r1
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0037:
            r10.setOnClickListener(r14)
        L_0x003a:
            r1 = 2131430996(0x7f0b0e54, float:1.8483709E38)
            android.widget.FrameLayout r2 = X.C86664Kz.A0s(r10, r1)
            X.2z0 r0 = r0.A1J
            boolean r1 = r0.A02
            android.content.Context r0 = r15.A04
            if (r1 == 0) goto L_0x0051
            android.graphics.drawable.Drawable r0 = X.C106205Ya.A02(r0)
        L_0x004d:
            r2.setForeground(r0)
            return
        L_0x0051:
            android.graphics.drawable.Drawable r0 = X.C106205Ya.A00(r0)
            goto L_0x004d
        L_0x0056:
            r5 = r27
            if (r26 == 0) goto L_0x013b
            com.whatsapp.webpagepreview.WebPagePreviewView r10 = r15.A0D
            r10.A04()
            android.widget.ProgressBar r2 = r10.A0G
            X.C86624Kv.A0s(r2)
            android.view.View r2 = r10.A04
            X.C86624Kv.A0s(r2)
            android.view.View r2 = r10.A05
            X.C86624Kv.A0s(r2)
            android.widget.ProgressBar r2 = r10.A0G
            r4 = 0
            r2.setAlpha(r4)
            android.view.View r3 = r10.A04
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r2)
            android.view.View r2 = r10.A05
            r2.setAlpha(r4)
            android.view.View r2 = r10.A06
            r2.setAlpha(r4)
            android.widget.ImageView r2 = r10.A0C
            r2.setAlpha(r4)
            r10.A04()
            int r2 = r1.A01
            r10.setVideoLargeLogo(r2)
            r3 = 1
            X.5NI r8 = new X.5NI
            r8.<init>(r0, r10)
            r4 = r24
            X.2z0 r2 = r4.B6Q()
            if (r2 == 0) goto L_0x00bb
            boolean r2 = X.C86664Kz.A1X(r0, r2)
            if (r2 == 0) goto L_0x00bb
            r4.BmL(r8)
            int r7 = r4.B6P()
            r6 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r7 == r3) goto L_0x012c
            r2 = 2
            if (r7 == r2) goto L_0x0125
            r2 = 3
            if (r7 != r2) goto L_0x00bb
            r10.A08(r4, r6, r4, r4)
        L_0x00bb:
            android.graphics.Bitmap[] r11 = new android.graphics.Bitmap[r3]
            X.54A r14 = new X.54A
            r16 = r0
            r17 = r1
            r18 = r8
            r19 = r11
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r10.setOnClickListener(r14)
            X.1sV r2 = r15.A0C
            boolean r4 = X.C57132t9.A01(r0, r2, r5)
            if (r4 == 0) goto L_0x00fe
            X.679 r4 = r15.A08
            boolean r4 = r4.BHf(r0)
            if (r4 == 0) goto L_0x00ee
            X.8tp r7 = r15.A02(r0, r1, r11)
        L_0x00e3:
            X.2U8 r1 = r0.A0c
            if (r1 == 0) goto L_0x0130
            android.widget.ImageView r1 = r10.A0D
            r2.A0E(r1, r0, r7, r3)
            goto L_0x003a
        L_0x00ee:
            android.content.Context r8 = r15.A04
            boolean r14 = r15.A03
            int r12 = r15.A01
            int r13 = r15.A00
            X.4ph r9 = r15.A02
            X.5q9 r7 = new X.5q9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00e3
        L_0x00fe:
            int r6 = r15.A01(r0)
            float r4 = A00(r0, r1)
            float r1 = (float) r6
            float r1 = r1 * r4
            int r1 = (int) r1
            r10.setVideoLargeThumbFrameHeight(r1)
            android.content.Context r5 = r15.A04
            X.1VX r4 = r15.A0A
            if (r4 == 0) goto L_0x011b
            r1 = 2060(0x80c, float:2.887E-42)
            boolean r1 = r4.A0X(r1)
            r13 = 1
            if (r1 != 0) goto L_0x011c
        L_0x011b:
            r13 = 0
        L_0x011c:
            X.5q8 r7 = new X.5q8
            r8 = r7
            r9 = r5
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e3
        L_0x0125:
            r2 = 1059816735(0x3f2b851f, float:0.67)
            r10.A08(r4, r6, r6, r2)
            goto L_0x00bb
        L_0x012c:
            r10.A08(r6, r4, r4, r4)
            goto L_0x00bb
        L_0x0130:
            boolean r1 = r0 instanceof X.C30481mW
            if (r1 == 0) goto L_0x003a
            android.widget.ImageView r1 = r10.A0D
            r2.A09(r1, r0, r7)
            goto L_0x003a
        L_0x013b:
            X.1sV r4 = r15.A0C
            boolean r2 = X.C57132t9.A01(r0, r4, r5)
            com.whatsapp.webpagepreview.WebPagePreviewView r10 = r15.A0D
            if (r2 == 0) goto L_0x019f
            r10.A01()
            r6 = 0
            if (r28 == 0) goto L_0x019d
            int r2 = r1.A00
        L_0x014d:
            r10.setImageLargeLogo(r2)
            X.679 r2 = r15.A08
            boolean r2 = r2.BHf(r0)
            r5 = 1
            if (r2 == 0) goto L_0x016d
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r5]
            X.8tp r7 = r15.A02(r0, r1, r2)
        L_0x015f:
            com.whatsapp.components.button.ThumbnailButton r2 = r10.A0O
            r4.A09(r2, r0, r7)
        L_0x0164:
            r2 = 15
            X.547 r14 = new X.547
            r14.<init>(r0, r15, r1, r2)
            goto L_0x0037
        L_0x016d:
            X.2U8 r2 = r0.A0c
            if (r2 != 0) goto L_0x0191
            android.widget.FrameLayout r2 = r10.A08
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r2 = -2
            r3.width = r2
            android.widget.FrameLayout r2 = r10.A08
            r2.requestLayout()
            android.graphics.Bitmap[] r11 = new android.graphics.Bitmap[r5]
            android.content.Context r8 = r15.A04
            boolean r14 = r15.A03
            int r12 = r15.A01
            int r13 = r15.A00
            X.4ph r9 = r15.A02
            X.5q9 r7 = new X.5q9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x015f
        L_0x0191:
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r5]
            X.8tp r3 = r15.A02(r0, r1, r2)
            com.whatsapp.components.button.ThumbnailButton r2 = r10.A0O
            r4.A0E(r2, r0, r3, r6)
            goto L_0x0164
        L_0x019d:
            r2 = 0
            goto L_0x014d
        L_0x019f:
            r10.A03()
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106055Xl.A03(X.4oJ, X.34x, X.66v, X.32K, boolean, boolean, boolean):void");
    }

    public void A04(C624134x r22, AnonymousClass66v r23, AnonymousClass32K r24, boolean z, boolean z2, boolean z3, boolean z4) {
        C94004ph r1;
        ArrayList searchTerms;
        ArrayList searchTerms2;
        int A002 = AnonymousClass5YO.A00(this.A04);
        boolean z5 = z;
        this.A03 = z5;
        if (z4) {
            r1 = new C133576hb(A002);
        } else {
            r1 = new C94004ph(A002);
        }
        this.A02 = r1;
        C93314oJ r2 = this.A07;
        C624134x r9 = r22;
        AnonymousClass32K r3 = r24;
        boolean z6 = z2;
        C624134x r15 = r9;
        AnonymousClass32K r17 = r3;
        boolean z7 = z5;
        boolean z8 = z6;
        AnonymousClass66v r16 = r23;
        boolean z9 = z3;
        A03(r2, r15, r16, r17, z7, z8, z9);
        if (r9.A1s(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            AnonymousClass5KC r6 = this.A06;
            AnonymousClass1VX r8 = this.A0A;
            WebPagePreviewView webPagePreviewView = this.A0D;
            AnonymousClass677 r12 = r2.A0m;
            if (r12 == null) {
                searchTerms2 = null;
            } else {
                searchTerms2 = r12.getSearchTerms();
            }
            AnonymousClass5KW r13 = new AnonymousClass5KW(this, r15, r16, r17, z7, z8, z9);
            boolean A012 = this.A0B.A01();
            AnonymousClass2U8 r32 = r9.A0c;
            if (r32 != null) {
                AnonymousClass1Hk r5 = new AnonymousClass1Hk(r6.A01, r6.A03, r32);
                r5.A01 = z5;
                webPagePreviewView.setTag(new C103945Pa(r5, r9));
                webPagePreviewView.A0F(r5, searchTerms2, z6, A012);
                if (r32.A09 != null && r32.A00 == null) {
                    Set set = r6.A05;
                    String str = r9.A1J.A01;
                    if (!set.contains(str)) {
                        set.add(str);
                        r6.A04.BkN(new C117495s1(r5, r6, r13, r8, r9, webPagePreviewView, searchTerms2, z6, A012), str);
                    }
                }
            }
        } else if (r9 instanceof C30481mW) {
            WebPagePreviewView webPagePreviewView2 = this.A0D;
            C30481mW r14 = (C30481mW) r9;
            AnonymousClass677 r25 = r2.A0m;
            if (r25 == null) {
                searchTerms = null;
            } else {
                searchTerms = r25.getSearchTerms();
            }
            boolean A013 = C57132t9.A01(r9, this.A0C, z6);
            boolean A014 = this.A0B.A01();
            String str2 = r3.A02;
            String str3 = r3.A03;
            Set BBH = webPagePreviewView2.A0S.BBH(r14.A0o(), r14, str3);
            String str4 = r14.A06;
            String str5 = r14.A04;
            byte[] A1z = r14.A1z();
            webPagePreviewView2.A0K(Integer.valueOf(r14.A00), str4, str5, str2, str3, searchTerms, A1z, -1, r14.A01, AnonymousClass000.A1W(BBH), A013, z5, false, false, A014);
        }
    }

    public C106055Xl(Context context, C85244Fm r4, AnonymousClass5KC r5, C93314oJ r6, AnonymousClass679 r7, C114635nM r8, AnonymousClass1VX r9, C56072rN r10, C33141sV r11) {
        this.A0A = r9;
        this.A04 = context;
        this.A08 = r7;
        this.A05 = r4;
        this.A07 = r6;
        this.A0B = r10;
        this.A09 = r8;
        this.A0C = r11;
        this.A0D = new WebPagePreviewView(context);
        this.A06 = r5;
        this.A02 = new C94004ph(AnonymousClass5YO.A00(context));
    }
}
