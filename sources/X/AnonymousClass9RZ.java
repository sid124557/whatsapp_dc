package X;

import android.widget.ImageView;

/* renamed from: X.9RZ  reason: invalid class name */
public class AnonymousClass9RZ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C166587yw A01;
    public final /* synthetic */ AnonymousClass99I A02;
    public final /* synthetic */ AnonymousClass9TJ A03;

    public AnonymousClass9RZ(ImageView imageView, C166587yw r2, AnonymousClass99I r3, AnonymousClass9TJ r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public void A00(AnonymousClass34V r3, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: fetchCardArtImageContentDetails Couldn't get card art for: ");
        A0o.append(str);
        C18260x0.A1S(A0o, " with error: ", r3);
    }
}
