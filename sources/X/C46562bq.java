package X;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: X.2bq  reason: invalid class name and case insensitive filesystem */
public final class C46562bq {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C79773xA(this));

    public final void A00(ImageView imageView, C58572vT r14, String str, String str2) {
        AnonymousClass3WV r7;
        String str3 = str;
        C162457s7.A0J(str, 0);
        ImageView imageView2 = imageView;
        String str4 = str2;
        C18260x0.A0Q(str4, imageView);
        if (C175738Zn.A0Y(str, "file:///", false) || C175738Zn.A0Y(str, "file:/", false)) {
            imageView.setImageBitmap(BitmapFactory.decodeFile(C175738Zn.A0U(C175738Zn.A0U(str, "file:///", "", false), "file:/", "", false)));
        } else if (C175738Zn.A0Y(str, "android.resource", false)) {
            imageView.setImageURI(Uri.parse(str));
        } else {
            if (r14 != null) {
                r7 = new AnonymousClass3WV(r14);
            } else {
                r7 = null;
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width <= 0 || height <= 0) {
                C54722pB r0 = (C54722pB) this.A04.getValue();
                int i = r0.A01;
                r0.A02.A02(new AnonymousClass8EH((Drawable) null, (Drawable) null, imageView2, r7, str3, str4, i, i), r0.A03);
                return;
            }
            C54722pB r02 = (C54722pB) this.A04.getValue();
            r02.A02.A02(new AnonymousClass8EH((Drawable) null, (Drawable) null, imageView2, r7, str3, str4, width, height), r02.A03);
        }
    }

    public C46562bq(C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5) {
        C18260x0.A0c(r2, r3, r4, r5);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r5;
    }
}
