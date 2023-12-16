package X;

import android.net.Uri;
import com.whatsapp.payments.phoenix.webview.activity.FcsWebViewActivity;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONTokener;

/* renamed from: X.3ai  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70573ai implements Runnable {
    public final /* synthetic */ C19100yl A00;
    public final /* synthetic */ FcsWebViewActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        Map map;
        C19100yl r2 = this.A00;
        String str = this.A02;
        FcsWebViewActivity fcsWebViewActivity = this.A01;
        String str2 = this.A03;
        boolean z = this.A04;
        if (r2.A05(str)) {
            String host = C624635d.A01(r2.getUrl()).getHost();
            Uri uri = fcsWebViewActivity.A01;
            if (uri == null) {
                throw C18270x1.A0S("launchUri");
            } else if (!C162457s7.A0P(uri.getHost(), host)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Invalid host. Current host: ");
                A0o.append(host);
                A0o.append(", expected: ");
                Uri uri2 = fcsWebViewActivity.A01;
                if (uri2 == null) {
                    throw C18270x1.A0S("launchUri");
                }
                C18260x0.A1K(A0o, uri2.getHost());
            } else {
                try {
                    Object nextValue = new JSONTokener(str2).nextValue();
                    C162457s7.A0H(nextValue);
                    Object A002 = AnonymousClass355.A00(nextValue);
                    if (!(A002 instanceof Map) || (map = (Map) A002) == null) {
                        map = C72043d5.A00();
                    }
                    fcsWebViewActivity.A7D(map, z);
                } catch (Exception e) {
                    Log.e("Exception while parsing data from JS", e);
                }
            }
        }
    }

    public /* synthetic */ C70573ai(C19100yl r1, FcsWebViewActivity fcsWebViewActivity, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = fcsWebViewActivity;
        this.A03 = str2;
        this.A04 = z;
    }
}
