package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.4c8  reason: invalid class name and case insensitive filesystem */
public class C89234c8 extends C88944b3 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5X8 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89234c8(Context context, Context context2, C184988ss r9, C69263Wi r10, AnonymousClass5X8 r11, C620633i r12, String str) {
        super(context, r9, r10, r12, str);
        this.A01 = r11;
        this.A00 = context2;
    }

    public void onClick(View view) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wa-link-factory/click-link ");
        String str = this.A0A;
        C18260x0.A1L(A0o, str);
        String A0o2 = C18310x6.A0o(str, AnonymousClass5X8.A05);
        if (A0o2 != null) {
            Uri parse = Uri.parse(A0o2);
            if (parse.getAuthority().contains(SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME)) {
                Uri.Builder buildUpon = parse.buildUpon();
                C620733j r2 = this.A01.A03;
                buildUpon.appendQueryParameter("lg", r2.A07());
                buildUpon.appendQueryParameter("lc", r2.A06());
                buildUpon.appendQueryParameter("eea", "1");
                parse = buildUpon.build();
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "wa-link-factory/open-link ", parse);
            this.A01.A00.BkW(this.A00, parse, (C624134x) null);
        }
    }
}
