package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.639  reason: invalid class name */
public final class AnonymousClass639 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5K6 $asyncBannerData;
    public final /* synthetic */ C833748d $quickPromotion;
    public final /* synthetic */ C111265ho this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass639(AnonymousClass5K6 r2, C111265ho r3, C833748d r4) {
        super(1);
        this.this$0 = r3;
        this.$asyncBannerData = r2;
        this.$quickPromotion = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        Intent A0G;
        String str3;
        String A0o;
        C111265ho r3 = this.this$0;
        C117165rU.A00(r3.A06, r3, this.$quickPromotion, 29);
        this.$asyncBannerData.A00 = null;
        C111265ho r4 = this.this$0;
        AnonymousClass3YL r1 = (AnonymousClass3YL) this.$quickPromotion;
        AnonymousClass2TD r0 = r1.A07;
        if (r0 != null) {
            Map map = null;
            C43352Ru r2 = r0.A01;
            if (r2 != null) {
                C41062Iu r02 = r1.A06;
                if (r02 != null) {
                    map = r02.A00;
                }
                AnonymousClass5HH r7 = r4.A04;
                Context A0F = C18290x4.A0F(r4.A02);
                String str4 = null;
                if (map == null || (A0o = C18310x6.A0o("wa_open_links_via_in_app_browser", map)) == null) {
                    str2 = null;
                } else {
                    str2 = C18320x8.A0g(Locale.ROOT, A0o);
                }
                boolean A0P = C162457s7.A0P(str2, "true");
                if (map != null) {
                    str4 = C18310x6.A0o("wa_iab_callback_url", map);
                }
                String str5 = r2.A03;
                if (C107575bX.A0F(str5)) {
                    str5 = r2.A01;
                    if (C107575bX.A0F(str5)) {
                        str = "BaseBannerQP/handleCTA/No valid url present";
                        Log.i(str);
                        this.this$0.BFb();
                        return C59022wD.A00;
                    }
                }
                if (str5 == null) {
                    str3 = "BaseBannerQP/navigateToUrl/url was null";
                } else {
                    Uri parse = Uri.parse(str5);
                    if (parse == null) {
                        str3 = "BaseBannerQP/navigateToUrl/uri was null";
                    } else {
                        if (1 != r7.A01.A0B(parse, (Uri) null)) {
                            A0G = C627736r.A0G(A0F, parse);
                        } else if (A0P) {
                            A0G = C627736r.A17(A0F, str5, str4, true, true);
                        } else {
                            r7.A00.BkW(A0F, parse, (C624134x) null);
                            this.this$0.BFb();
                            return C59022wD.A00;
                        }
                        r7.A00.A0A(A0F, A0G);
                        this.this$0.BFb();
                        return C59022wD.A00;
                    }
                }
                Log.e(str3);
                this.this$0.BFb();
                return C59022wD.A00;
            }
        }
        str = "InAppBannerQP/handleCTA no primary action";
        Log.i(str);
        this.this$0.BFb();
        return C59022wD.A00;
    }
}
