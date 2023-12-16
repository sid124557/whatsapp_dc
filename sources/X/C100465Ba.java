package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.5Ba  reason: invalid class name and case insensitive filesystem */
public class C100465Ba implements C185528tp {
    public Object A00;
    public final int A01;

    public C100465Ba(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Bitmap bitmap, C100465Ba r4) {
        WebPagePreviewView webPagePreviewView = ((AnonymousClass4Z3) r4.A00).A09;
        webPagePreviewView.A0Q.setVisibility(0);
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
            ThumbnailButton thumbnailButton = webPagePreviewView.A0Q;
            C107335b8.A0C(thumbnailButton.getContext(), thumbnailButton, R.drawable.ic_group_invite_link, R.color.f5nameremoved);
            webPagePreviewView.A0Q.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            webPagePreviewView.A0Q.setScaleY(1.5f);
            webPagePreviewView.A0Q.setScaleX(1.5f);
            ThumbnailButton thumbnailButton2 = webPagePreviewView.A0Q;
            C86604Kt.A0z(thumbnailButton2.getContext(), thumbnailButton2, R.color.f5nameremoved);
            return;
        }
        C86644Kx.A1A(webPagePreviewView.A0Q);
        webPagePreviewView.A0Q.setImageBitmap(bitmap);
    }

    public static void A01(C100465Ba r1) {
        WebPagePreviewView webPagePreviewView = ((AnonymousClass4Z3) r1.A00).A09;
        C86644Kx.A1A(webPagePreviewView.A0Q);
        C86624Kv.A1B(webPagePreviewView.A0Q);
    }

    public final void A02(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A00;
        Drawable drawable = imageView.getDrawable();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), bitmap);
        if (drawable == null || (drawable instanceof ColorDrawable)) {
            imageView.setImageDrawable(bitmapDrawable);
            return;
        }
        Drawable[] drawableArr = new Drawable[2];
        AnonymousClass000.A16(drawable, bitmapDrawable, drawableArr);
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(150);
    }

    public int BD5() {
        Resources resources;
        Context context;
        switch (this.A01) {
            case 0:
                return 0;
            case 2:
                return AnonymousClass5YO.A02((View) this.A00);
            case 3:
                return AnonymousClass5YO.A01(((View) this.A00).getContext(), 36);
            case 4:
                return 96;
            case 5:
                return AnonymousClass5YO.A02((View) this.A00);
            case 8:
                C93324oK r2 = (C93324oK) this.A00;
                int i = 72;
                if (r2.A0W) {
                    i = 100;
                }
                return AnonymousClass5YO.A01(r2.getContext(), i);
            case 9:
                return C18290x4.A0G(((C106145Xu) this.A00).A0F).getDimensionPixelSize(R.dimen.f6nameremoved);
            case 10:
                return AnonymousClass5Y3.A01(((C93214o9) this.A00).A0G.A0A);
            case 11:
                return ((C93374oS) this.A00).A04;
            case 12:
                return ((C93384oT) this.A00).A05;
            case 13:
                C131916eO r0 = ((C93444oZ) this.A00).A00;
                if (r0 == null || (context = r0.getContext()) == null || (resources = context.getResources()) == null) {
                    return 0;
                }
            case 14:
                C89734eq r02 = ((C93454oa) this.A00).A00;
                if (r02 != null) {
                    resources = C18290x4.A0G(r02);
                    break;
                } else {
                    return 0;
                }
            case 15:
                AnonymousClass4Z3 r22 = (AnonymousClass4Z3) this.A00;
                return r22.A0A.A08.A05(r22.A09.A0Q.getContext());
            case 16:
                return ((View) this.A00).getWidth();
            case 17:
                return C54292oU.A00((C54292oU) this.A00).getDimensionPixelSize(R.dimen.f6nameremoved);
            default:
                return ((View) this.A00).getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        return resources.getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public /* synthetic */ void BTR() {
        switch (this.A01) {
            case 1:
            case 2:
            case 5:
            case 8:
            case 10:
                ((C93244oC) this.A00).A27();
                return;
            case 9:
                Log.w("ConversationRowSticker/onFileReadError");
                ((C106145Xu) this.A00).A01 = false;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022f, code lost:
        r2.A02(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0232, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024d, code lost:
        r7.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0252, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r6 == null) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r7 = (android.widget.ImageView) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r7.setImageBitmap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0146, code lost:
        r0.setImageBitmap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c0, code lost:
        if (r6 != null) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c2, code lost:
        r0 = com.whatsapp.R.drawable.media_location;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c5, code lost:
        r1.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c9, code lost:
        r1.setImageBitmap(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bof(android.graphics.Bitmap r6, android.view.View r7, X.C624134x r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x009a;
                case 2: goto L_0x00c8;
                case 3: goto L_0x0028;
                case 4: goto L_0x00ff;
                case 5: goto L_0x0030;
                case 6: goto L_0x0118;
                case 7: goto L_0x01ba;
                case 8: goto L_0x0120;
                case 9: goto L_0x016b;
                case 10: goto L_0x0212;
                case 11: goto L_0x005e;
                case 12: goto L_0x018d;
                case 13: goto L_0x0092;
                case 14: goto L_0x0096;
                case 15: goto L_0x01cd;
                case 16: goto L_0x01d1;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            boolean r0 = r7 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0014
            if (r6 == 0) goto L_0x0014
        L_0x000f:
            android.widget.ImageView r7 = (android.widget.ImageView) r7
        L_0x0011:
            r7.setImageBitmap(r6)
        L_0x0014:
            return
        L_0x0015:
            if (r6 == 0) goto L_0x0014
            java.lang.Object r0 = r5.A00
            X.5PD r0 = (X.AnonymousClass5PD) r0
            com.whatsapp.WaImageView r1 = r0.A08
            X.C86644Kx.A1A(r1)
            r1.setImageBitmap(r6)
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0028:
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r6 == 0) goto L_0x01f3
            X.C86644Kx.A1A(r7)
            goto L_0x0011
        L_0x0030:
            r3 = 0
            java.lang.Object r0 = r5.A00
            X.4nX r0 = (X.C92894nX) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r0.A06
            if (r6 == 0) goto L_0x0047
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r6)
            r2.setImageDrawable(r0)
            goto L_0x0227
        L_0x0047:
            android.content.Context r0 = r0.getContext()
            X.C86604Kt.A10(r0, r2)
            boolean r0 = r8 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0014
            X.1mV r8 = (X.C30471mV) r8
            X.33C r0 = r8.A01
            if (r0 == 0) goto L_0x0014
            int r1 = r0.A08
            int r0 = r0.A06
            goto L_0x022f
        L_0x005e:
            r0 = 2
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r8, r0)
            java.lang.String r0 = "LinkCarouselItemView/show "
            X.2z0 r0 = X.C624134x.A08(r8, r0, r1)
            X.AnonymousClass2z0.A0A(r0, r1)
            java.lang.String r0 = " bitmap is"
            r1.append(r0)
            if (r6 != 0) goto L_0x008f
            java.lang.String r0 = " null"
        L_0x0075:
            X.C18260x0.A1J(r1, r0)
            java.lang.Object r0 = r5.A00
            X.4oS r0 = (X.C93374oS) r0
            com.whatsapp.components.button.ThumbnailButton r2 = r0.A0A
            r1 = 0
            int r0 = X.C86644Kx.A08(r6)
            r2.setVisibility(r0)
            if (r6 == 0) goto L_0x0014
            r2.setVisibility(r1)
            r2.setImageBitmap(r6)
            return
        L_0x008f:
            java.lang.String r0 = " not null"
            goto L_0x0075
        L_0x0092:
            r0 = 0
            X.C162457s7.A0J(r7, r0)
        L_0x0096:
            if (r6 == 0) goto L_0x024d
            goto L_0x000f
        L_0x009a:
            if (r6 == 0) goto L_0x0249
            boolean r0 = r7 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0249
            r2 = r7
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.1mV r8 = (X.C30471mV) r8
            java.lang.String r0 = r8.A05
            r1 = 0
            if (r0 == 0) goto L_0x00c5
            boolean r0 = X.C989053r.A07(r0)
            if (r0 == 0) goto L_0x00c5
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x00b2:
            r2.setScaleType(r0)
            r2.setImageBitmap(r6)
            r7.setVisibility(r1)
            java.lang.Object r0 = r5.A00
            X.4nv r0 = (X.C93114nv) r0
            android.view.View r0 = r0.A05
            r0.setVisibility(r1)
            return
        L_0x00c5:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            goto L_0x00b2
        L_0x00c8:
            java.lang.Object r4 = r5.A00
            X.4nz r4 = (X.C93154nz) r4
            if (r6 == 0) goto L_0x00f5
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r3 = r4.A0E
            android.content.res.Resources r1 = X.C18290x4.A0G(r4)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r6)
            r3.setImageDrawable(r0)
            int r2 = r6.getWidth()
            int r1 = r6.getHeight()
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x00ec
            int r0 = r4.A01
            if (r0 > 0) goto L_0x00f0
        L_0x00ec:
            r4.A00 = r1
            r4.A01 = r2
        L_0x00f0:
            r0 = 0
            r3.A02(r2, r1, r0)
            return
        L_0x00f5:
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r4.A0E
            android.content.Context r0 = r4.getContext()
            X.C86604Kt.A10(r0, r1)
            return
        L_0x00ff:
            java.lang.Object r1 = r5.A00
            X.4o5 r1 = (X.C93174o5) r1
            if (r6 == 0) goto L_0x0108
            android.widget.ImageView r0 = r1.A03
            goto L_0x0146
        L_0x0108:
            boolean r0 = r1 instanceof X.C92814nJ
            android.widget.ImageView r1 = r1.A03
            if (r0 == 0) goto L_0x0113
            r0 = 2131231018(0x7f08012a, float:1.8078105E38)
            goto L_0x01c5
        L_0x0113:
            r0 = 2131231013(0x7f080125, float:1.8078095E38)
            goto L_0x01c5
        L_0x0118:
            java.lang.Object r0 = r5.A00
            X.4o6 r0 = (X.C93184o6) r0
            android.widget.ImageView r1 = r0.A0E
            goto L_0x01c0
        L_0x0120:
            if (r6 == 0) goto L_0x014a
            boolean r0 = r8 instanceof X.C30471mV
            if (r0 == 0) goto L_0x014a
            X.1mV r8 = (X.C30471mV) r8
            X.33C r0 = X.C30471mV.A00(r8)
            int r2 = r0.A08
            if (r2 == 0) goto L_0x0140
            int r1 = r0.A06
            if (r1 == 0) goto L_0x0140
            java.lang.Object r0 = r5.A00
            X.4nY r0 = (X.C92904nY) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r0.A0I
            r0.A04(r2, r1)
            X.C86644Kx.A1A(r0)
        L_0x0140:
            java.lang.Object r0 = r5.A00
            X.4nY r0 = (X.C92904nY) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r0.A0I
        L_0x0146:
            r0.setImageBitmap(r6)
            return
        L_0x014a:
            java.lang.Object r2 = r5.A00
            X.4nY r2 = (X.C92904nY) r2
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r3 = r2.A0I
            X.C86664Kz.A1R(r3)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            X.C86624Kv.A0l(r1, r3, r0)
            android.content.Context r2 = r2.getContext()
            r1 = 2131231236(0x7f080204, float:1.8078547E38)
            r0 = 2131101274(0x7f06065a, float:1.7814953E38)
            X.C107335b8.A0C(r2, r3, r1, r0)
            return
        L_0x016b:
            if (r6 == 0) goto L_0x0180
            boolean r0 = r8 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0180
            java.lang.Object r0 = r5.A00
            X.5Xu r0 = (X.C106145Xu) r0
            com.whatsapp.stickers.StickerView r0 = r0.A0F
            r0.setImageBitmap(r6)
            java.lang.String r0 = "ConversationRowSticker/displayed thumbnail"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0180:
            java.lang.Object r1 = r5.A00
            X.5Xu r1 = (X.C106145Xu) r1
            r0 = 0
            r1.A01 = r0
            com.whatsapp.stickers.StickerView r1 = r1.A0F
            r0 = 2131233689(0x7f080b99, float:1.8083523E38)
            goto L_0x01c5
        L_0x018d:
            r0 = 2
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r8, r0)
            java.lang.String r0 = "LinkCarouselItemView/show "
            X.2z0 r0 = X.C624134x.A08(r8, r0, r1)
            X.AnonymousClass2z0.A0A(r0, r1)
            java.lang.String r0 = " bitmap is"
            r1.append(r0)
            if (r6 != 0) goto L_0x01b7
            java.lang.String r0 = " null"
        L_0x01a4:
            X.C18260x0.A1J(r1, r0)
            java.lang.Object r0 = r5.A00
            X.4oT r0 = (X.C93384oT) r0
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A09
            int r0 = X.C86644Kx.A08(r6)
            r1.setVisibility(r0)
            if (r6 != 0) goto L_0x01c9
            return
        L_0x01b7:
            java.lang.String r0 = " not null"
            goto L_0x01a4
        L_0x01ba:
            java.lang.Object r0 = r5.A00
            X.4o7 r0 = (X.C93194o7) r0
            android.widget.ImageView r1 = r0.A0A
        L_0x01c0:
            if (r6 != 0) goto L_0x01c9
            r0 = 2131233099(0x7f08094b, float:1.8082326E38)
        L_0x01c5:
            r1.setImageResource(r0)
            return
        L_0x01c9:
            r1.setImageBitmap(r6)
            return
        L_0x01cd:
            A00(r6, r5)
            return
        L_0x01d1:
            java.lang.Object r2 = r5.A00
            com.whatsapp.search.views.MessageThumbView r2 = (com.whatsapp.search.views.MessageThumbView) r2
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x01ef
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168089(0x7f070b59, float:1.795047E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r2.A00
            float r0 = (float) r0
            android.graphics.Bitmap r0 = X.C107655bf.A0H(r6, r0, r1)
            r5.A02(r0)
            return
        L_0x01ef:
            r5.A02(r6)
            return
        L_0x01f3:
            X.C86664Kz.A1R(r7)
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            X.C86624Kv.A0l(r1, r7, r0)
            android.content.Context r2 = r2.getContext()
            r1 = 2131231236(0x7f080204, float:1.8078547E38)
            r0 = 2131101274(0x7f06065a, float:1.7814953E38)
            X.C107335b8.A0C(r2, r7, r1, r0)
            return
        L_0x0212:
            r3 = 0
            java.lang.Object r2 = r5.A00
            X.4o9 r2 = (X.C93214o9) r2
            if (r6 == 0) goto L_0x0233
            android.content.res.Resources r1 = X.C18290x4.A0G(r2)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r6)
            r2.setThumbnail(r0)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r2.A0G
        L_0x0227:
            int r1 = r6.getWidth()
            int r0 = r6.getHeight()
        L_0x022f:
            r2.A02(r1, r0, r3)
            return
        L_0x0233:
            r2.A06 = r3
            android.content.Context r1 = r2.getContext()
            r0 = 2131100243(0x7f060253, float:1.7812862E38)
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setThumbnail(r0)
            return
        L_0x0249:
            r0 = 0
            r7.setTag(r0)
        L_0x024d:
            r0 = 8
            r7.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100465Ba.Bof(android.graphics.Bitmap, android.view.View, X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r1.setImageDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r1.setBackgroundColor(-7829368);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r1.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r6.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Bp1(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x001d;
                case 3: goto L_0x0027;
                case 4: goto L_0x0034;
                case 5: goto L_0x0046;
                case 6: goto L_0x004d;
                case 7: goto L_0x0054;
                case 8: goto L_0x005f;
                case 9: goto L_0x006c;
                case 10: goto L_0x0081;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0094;
                case 14: goto L_0x0098;
                case 15: goto L_0x009e;
                case 16: goto L_0x00a2;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r6 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0005
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            X.C86624Kv.A1B(r6)
            r1 = 0
            r6.setVisibility(r1)
            java.lang.Object r0 = r5.A00
            X.4nv r0 = (X.C93114nv) r0
            android.view.View r0 = r0.A05
            r0.setVisibility(r1)
            return
        L_0x001d:
            java.lang.Object r0 = r5.A00
            X.4nz r0 = (X.C93154nz) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r0.A0E
            X.C86624Kv.A1B(r0)
            return
        L_0x0027:
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 0
            r6.setImageDrawable(r0)
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r6.setBackgroundColor(r0)
            return
        L_0x0034:
            java.lang.Object r1 = r5.A00
            X.4o5 r1 = (X.C93174o5) r1
            boolean r0 = r1 instanceof X.C92814nJ
            android.widget.ImageView r1 = r1.A03
            if (r0 == 0) goto L_0x0042
            r0 = 2131231018(0x7f08012a, float:1.8078105E38)
            goto L_0x007d
        L_0x0042:
            r0 = 2131231013(0x7f080125, float:1.8078095E38)
            goto L_0x007d
        L_0x0046:
            java.lang.Object r0 = r5.A00
            X.4nX r0 = (X.C92894nX) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r1 = r0.A06
            goto L_0x0065
        L_0x004d:
            java.lang.Object r0 = r5.A00
            X.4o6 r0 = (X.C93184o6) r0
            android.widget.ImageView r1 = r0.A0E
            goto L_0x005a
        L_0x0054:
            java.lang.Object r0 = r5.A00
            X.4o7 r0 = (X.C93194o7) r0
            android.widget.ImageView r1 = r0.A0A
        L_0x005a:
            r0 = 0
            r1.setImageDrawable(r0)
            goto L_0x0065
        L_0x005f:
            java.lang.Object r0 = r5.A00
            X.4nY r0 = (X.C92904nY) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r0.A0I
        L_0x0065:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r1.setBackgroundColor(r0)
            return
        L_0x006c:
            java.lang.String r0 = "ConversationRowSticker/showPlaceholder"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Object r1 = r5.A00
            X.5Xu r1 = (X.C106145Xu) r1
            r0 = 0
            r1.A01 = r0
            com.whatsapp.stickers.StickerView r1 = r1.A0F
            r0 = 2131233689(0x7f080b99, float:1.8083523E38)
        L_0x007d:
            r1.setImageResource(r0)
            return
        L_0x0081:
            java.lang.Object r2 = r5.A00
            X.4o9 r2 = (X.C93214o9) r2
            r0 = 0
            r2.A06 = r0
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setThumbnail(r0)
            return
        L_0x0094:
            r0 = 0
            X.C162457s7.A0J(r6, r0)
        L_0x0098:
            r0 = 8
            r6.setVisibility(r0)
            return
        L_0x009e:
            A01(r5)
            return
        L_0x00a2:
            java.lang.Object r4 = r5.A00
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.content.res.Resources r3 = r6.getResources()
            android.content.Context r2 = r4.getContext()
            r1 = 2130970490(0x7f04077a, float:1.7549692E38)
            r0 = 2131102337(0x7f060a81, float:1.781711E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            int r1 = r3.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setImageDrawable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100465Ba.Bp1(android.view.View):void");
    }
}
