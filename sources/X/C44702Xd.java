package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.2Xd  reason: invalid class name and case insensitive filesystem */
public class C44702Xd {
    public final AnonymousClass1VX A00;
    public final C54722pB A01;

    public C44702Xd(C69263Wi r10, C56492s4 r11, C54292oU r12, AnonymousClass1VX r13, AnonymousClass33K r14) {
        this.A00 = r13;
        Context context = r12.A00;
        C47432dF r3 = new C47432dF(r10, r11, r14, AnonymousClass002.A0A(context.getCacheDir(), "biz_directory_cache"), "directory-image");
        C47432dF.A00(context, r3);
        r3.A05 = true;
        this.A01 = r3.A01();
        if (this.A00.A0Y(C58422vE.A02, 2185)) {
            this.A01.A02.A03.A01 = true;
        }
    }

    public void A00(ImageView imageView, String str) {
        this.A01.A02((Drawable) null, C107335b8.A04(imageView.getContext(), R.drawable.ic_business_category, R.color.f5nameremoved), imageView, str);
    }
}
