package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;

/* renamed from: X.9TJ  reason: invalid class name */
public class AnonymousClass9TJ {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final C40602Ha A04;
    public final AnonymousClass9U5 A05;
    public final AnonymousClass9U4 A06;
    public final C191169De A07;

    public final void A00(Drawable drawable, ImageView imageView, C166587yw r9, boolean z) {
        C133786hw r1 = (C133786hw) r9.A08;
        ImageView imageView2 = imageView;
        if (r1 == null || TextUtils.isEmpty(r1.A0E)) {
            Log.w(AnonymousClass000.A0b("PAY: Failed to display card art, card art url missing, re-fetch: ", AnonymousClass001.A0o(), z));
            if (z) {
                A01(imageView, r9);
                return;
            }
            return;
        }
        C191169De r0 = this.A07;
        String str = r1.A0E;
        r0.A00().A01(drawable, drawable, imageView2, new C197829dw(imageView, r9, this, z), str);
    }

    public final void A01(ImageView imageView, C166587yw r18) {
        C166587yw r3 = r18;
        AnonymousClass99I r2 = (AnonymousClass99I) r3.A08;
        if (r2 == null || TextUtils.isEmpty(r2.A0C)) {
            C18260x0.A1S(AnonymousClass001.A0o(), "PAY: fetchCardArtImageContentDetails card method data invalid: ", r2);
            return;
        }
        C56612sH r10 = this.A02;
        Context context = this.A03.A00;
        C69263Wi r8 = this.A00;
        C56972sr r9 = this.A01;
        AnonymousClass9U5 r12 = this.A05;
        AnonymousClass9Q5 r6 = new AnonymousClass9Q5(context, r8, r9, r10, this.A04, r12, new AnonymousClass9RZ(imageView, r3, r2, this), r3.A0A, r2.A0C);
        String str = r6.A07;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A08;
            if (!TextUtils.isEmpty(str2)) {
                String A022 = AnonymousClass35J.A02(r6.A02, r6.A03);
                AnonymousClass9U5 r82 = r6.A05;
                AnonymousClass39V[] r22 = new AnonymousClass39V[4];
                AnonymousClass39V.A04("action", "get-image-content", r22);
                AnonymousClass39V.A05("credential-id", str, r22);
                AnonymousClass39V.A06("image-content-id", str2, r22);
                AnonymousClass39V.A07("nonce", A022, r22);
                r82.A0G(new C203889oT(r6.A00, r6.A04, r6.A01, r6, 3), C1899693i.A0U(r22), "get", C625635p.A0L);
                return;
            }
        }
        r6.A06.A00(C1899693i.A0M(), str);
    }

    public AnonymousClass9TJ(C69263Wi r1, C56972sr r2, C56612sH r3, C54292oU r4, C40602Ha r5, AnonymousClass9U5 r6, AnonymousClass9U4 r7, C191169De r8) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void A02(C166587yw r4, PaymentMethodRow paymentMethodRow) {
        C195169Wk.A07(r4, paymentMethodRow);
        A00(C54292oU.A00(this.A03).getDrawable(C195169Wk.A00(((C133736hr) r4).A01)), paymentMethodRow.A01, r4, false);
    }
}
