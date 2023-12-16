package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.63m  reason: invalid class name and case insensitive filesystem */
public final class C1222063m extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass7P9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1222063m(AnonymousClass7P9 r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        String str = (String) obj2;
        C18260x0.A0O(imageView, str);
        AnonymousClass2F5 r3 = this.this$0.A03;
        r3.A00.A02((Drawable) null, C107335b8.A03(imageView.getContext(), R.drawable.ic_business_category, R.color.f5nameremoved), imageView, str);
        return C59022wD.A00;
    }
}
