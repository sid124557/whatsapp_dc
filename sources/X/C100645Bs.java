package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5Bs  reason: invalid class name and case insensitive filesystem */
public class C100645Bs implements C185528tp {
    public Object A00;
    public Object A01;
    public final int A02;

    public C100645Bs(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public int BD5() {
        if (this.A02 != 0) {
            return ((MediaViewFragment) this.A00).A1k.A05(((View) this.A01).getContext());
        }
        return AnonymousClass5YO.A01((Context) this.A00, 65);
    }

    public void BTR() {
        Runnable runnable;
        if (this.A02 == 0 && (runnable = ((PushToVideoInlineVideoPlayer) this.A01).getUiState().A06) != null) {
            runnable.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r1 != 43) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r12 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bof(android.graphics.Bitmap r12, android.view.View r13, X.C624134x r14) {
        /*
            r11 = this;
            int r0 = r11.A02
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r4 = r11.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            android.content.Context r0 = r4.A1D()
            if (r0 == 0) goto L_0x0079
            X.1mV r14 = (X.C30471mV) r14
            r8 = 0
            r7 = 43
            r6 = 42
            r9 = 13
            r5 = 9
            r2 = 3
            r3 = 1
            if (r12 == 0) goto L_0x0099
            java.lang.Object r10 = r11.A01
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.res.Resources r1 = X.C08310eF.A09(r4)
            X.0y1 r0 = new X.0y1
            r0.<init>(r1, r12, r14)
        L_0x002a:
            r10.A07(r0)
        L_0x002d:
            byte r1 = r14.A1I
            if (r1 == r3) goto L_0x008d
            if (r1 == r2) goto L_0x0081
            if (r1 == r5) goto L_0x007a
            if (r1 == r9) goto L_0x0081
            r0 = 28
            if (r1 == r0) goto L_0x0081
            r0 = 29
            if (r1 == r0) goto L_0x0081
            if (r1 == r6) goto L_0x008d
            if (r1 == r7) goto L_0x0081
        L_0x0043:
            X.33C r1 = X.C30471mV.A00(r14)
            int r0 = r1.A08
            if (r0 == 0) goto L_0x0052
            int r0 = r1.A06
            if (r0 == 0) goto L_0x0052
            r2 = 1
            if (r12 != 0) goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            boolean r0 = X.C107275b2.A00
            if (r0 == 0) goto L_0x006e
            X.1mV r1 = r4.A1S
            if (r1 == 0) goto L_0x006e
            X.2z0 r0 = r14.A1J
            boolean r0 = X.C86664Kz.A1X(r1, r0)
            if (r0 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0069
            X.3cR r0 = r4.A0E
            if (r0 != 0) goto L_0x006e
        L_0x0069:
            r4.A1s = r3
            com.whatsapp.mediaview.MediaViewFragment.A05(r4)
        L_0x006e:
            X.3cR r1 = r4.A0E
            if (r1 == 0) goto L_0x0079
            java.lang.Object r0 = r11.A01
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r1.A01(r0, r14)
        L_0x0079:
            return
        L_0x007a:
            java.lang.Object r0 = r11.A01
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r0.A0M = r8
            goto L_0x0043
        L_0x0081:
            java.lang.Object r2 = r11.A01
            com.whatsapp.mediaview.PhotoView r2 = (com.whatsapp.mediaview.PhotoView) r2
            r0 = 35
            X.5eh r1 = new X.5eh
            r1.<init>(r11, r0, r14)
            goto L_0x0096
        L_0x008d:
            java.lang.Object r2 = r11.A01
            com.whatsapp.mediaview.PhotoView r2 = (com.whatsapp.mediaview.PhotoView) r2
            X.6lC r1 = new X.6lC
            r1.<init>(r11, r14)
        L_0x0096:
            r2.A0M = r1
            goto L_0x0043
        L_0x0099:
            byte r0 = r14.A1I
            if (r0 == r3) goto L_0x00bd
            if (r0 == r2) goto L_0x00c9
            if (r0 == r5) goto L_0x00b1
            if (r0 == r9) goto L_0x00c9
            if (r0 == r6) goto L_0x00a8
            if (r0 == r7) goto L_0x00a8
            goto L_0x002d
        L_0x00a8:
            java.lang.Object r0 = r11.A01
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r0.A07(r8)
            goto L_0x002d
        L_0x00b1:
            java.lang.Object r10 = r11.A01
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.Context r1 = r4.A0G()
            r0 = 2131232902(0x7f080886, float:1.8081926E38)
            goto L_0x00d4
        L_0x00bd:
            java.lang.Object r10 = r11.A01
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.Context r1 = r4.A0G()
            r0 = 2131230979(0x7f080103, float:1.8078026E38)
            goto L_0x00d4
        L_0x00c9:
            java.lang.Object r10 = r11.A01
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.Context r1 = r4.A0G()
            r0 = 2131230980(0x7f080104, float:1.8078028E38)
        L_0x00d4:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            goto L_0x002a
        L_0x00dc:
            if (r12 != 0) goto L_0x00ec
            java.lang.Object r0 = r11.A01
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = (com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer) r0
            com.whatsapp.WaImageView r1 = r0.A08
            java.lang.Object r0 = r11.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C86604Kt.A10(r0, r1)
            return
        L_0x00ec:
            int r3 = r12.getWidth()
            int r2 = r12.getHeight()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ptv/messageThumbRenderer/show width="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " height="
            X.C18260x0.A0w(r0, r1, r2)
            java.lang.Object r0 = r11.A01
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = (com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer) r0
            com.whatsapp.WaImageView r0 = r0.A08
            r0.setImageBitmap(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100645Bs.Bof(android.graphics.Bitmap, android.view.View, X.34x):void");
    }

    public void Bp1(View view) {
        if (this.A02 != 0) {
            PhotoView photoView = (PhotoView) this.A01;
            photoView.A0J = null;
            photoView.A04 = 0.0f;
            return;
        }
        C86624Kv.A1B(((PushToVideoInlineVideoPlayer) this.A01).A08);
    }
}
