package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.conversation.viewmodel.CustomStickerViewModel$1;
import com.whatsapp.stickers.WebpUtils;

/* renamed from: X.10o  reason: invalid class name and case insensitive filesystem */
public final class C194410o extends C05550Ty {
    public boolean A00;
    public final Uri A01;
    public final C56352rq A02;
    public final C621033m A03;
    public final C54292oU A04;
    public final C106695a0 A05;
    public final WebpUtils A06;
    public final C59452ww A07;
    public final C73853gB A08;
    public final C85524Gp A09;
    public final C85564Gt A0A;

    public C194410o(Uri uri, C56352rq r6, C621033m r7, C54292oU r8, C106695a0 r9, WebpUtils webpUtils, C59452ww r11, C73853gB r12) {
        C162457s7.A0J(webpUtils, 1);
        C18260x0.A0b(r9, r7, r6, 2);
        C162457s7.A0J(r8, 6);
        this.A06 = webpUtils;
        this.A05 = r9;
        this.A07 = r11;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A08 = r12;
        this.A01 = uri;
        C832246p r0 = new C832246p(new C60392yU((Bitmap) null));
        this.A09 = r0;
        this.A0A = r0;
        C616131n.A02(r12, new CustomStickerViewModel$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
    }

    public void A0C() {
        if (!this.A00) {
            A0D();
        }
    }

    public final void A0D() {
        C85524Gp r3 = this.A09;
        Bitmap bitmap = ((C60392yU) r3.getValue()).A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
        do {
        } while (!r3.AzD(r3.getValue(), new C60392yU((Bitmap) null)));
    }
}
