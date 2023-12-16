package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ce  reason: invalid class name and case insensitive filesystem */
public final class C47062ce {
    public final C111095hX A00;
    public final C69263Wi A01;
    public final AnonymousClass31C A02;
    public final C161447pg A03;
    public final C44522Wj A04;
    public final C194259Se A05;
    public final AnonymousClass4FS A06;

    public final void A00(Context context, Uri uri) {
        Collection<C161447pg> values;
        AnonymousClass4GB r1;
        if (context != null) {
            Intent A0D = C18310x6.A0D(uri);
            A0D.addFlags(268435456);
            A0D.setPackage("com.whatsapp.w4b");
            this.A00.A0A(context, A0D);
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 5) {
            String scheme = uri.getScheme();
            if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(scheme) || "whatsapp-smb".equals(scheme)) {
                pathSegments = C73723fy.A0K(pathSegments, AnonymousClass8UF.A0m("ph"));
            } else {
                C18260x0.A1S(AnonymousClass001.A0o(), "Invalid phoenix deeplink URI: ", uri);
                return;
            }
        }
        String str = pathSegments.get(1);
        C162457s7.A0D(str);
        int parseInt = Integer.parseInt(str);
        String A0n = AnonymousClass001.A0n(pathSegments, 2);
        if (parseInt <= 1 && C162457s7.A0P(A0n, "pay")) {
            String A0n2 = AnonymousClass001.A0n(pathSegments, 3);
            String A0n3 = AnonymousClass001.A0n(pathSegments, 4);
            C18280x3.A16(A0n, A0n2, A0n3);
            String A002 = C616931w.A00(A0n, A0n2, A0n3);
            C44522Wj r12 = this.A04;
            synchronized (r12) {
                values = r12.A00.values();
            }
            for (C161447pg r13 : values) {
                if ("br_merchant_onboarding".equalsIgnoreCase(A0n2) && "account_set_up".equalsIgnoreCase(A0n3)) {
                    break;
                }
                C159127lA r2 = r13.A00;
                if (r2 != null) {
                    AnonymousClass7SR r14 = r2.A06;
                    if ((r14 instanceof C137066ni) && (r1 = (AnonymousClass4GB) r2.A00(((C137066ni) r14).A04)) != null && r1.AwF(A002)) {
                        r1.BEs(A002, C18290x4.A0o(uri));
                        return;
                    }
                }
            }
            LinkedHashMap A0r = C18320x8.A0r();
            Map A003 = AnonymousClass283.A00(uri);
            if (A003 != null) {
                A0r.putAll(A003);
            }
            this.A01.A0G(0, R.string.f11nameremoved);
            A0r.put("action", A0n3);
            String A012 = this.A05.A01();
            if (!(A012 == null || A012.length() == 0)) {
                A0r.put("device_id", A012);
            }
            C71403c3.A00(this.A06, this, A0r, A0n2, 4);
        }
    }

    public C47062ce(C111095hX r2, AnonymousClass2VM r3, C69263Wi r4, AnonymousClass31C r5, C44522Wj r6, C194259Se r7, AnonymousClass4FS r8) {
        C18260x0.A0f(r4, r3, r7, r6, r2);
        C18260x0.A0U(r5, r8);
        this.A01 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r5;
        this.A06 = r8;
        this.A03 = r3.A00((C51052jC) null);
    }
}
