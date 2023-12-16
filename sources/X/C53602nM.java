package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2nM  reason: invalid class name and case insensitive filesystem */
public class C53602nM {
    public C56972sr A00;
    public AnonymousClass1VX A01;
    public C54322oX A02;
    public C51072jE A03;
    public final C29441ip A04;
    public final C620733j A05;
    public final C66433Lk A06;

    public String A00(String str) {
        Uri.Builder A012 = this.A06.A01();
        A012.appendPath("cxt");
        A012.appendQueryParameter("entrypointid", str);
        C620733j r2 = this.A05;
        A012.appendQueryParameter("lg", r2.A07());
        A012.appendQueryParameter("lc", r2.A06());
        A012.appendQueryParameter("platform", "android");
        A012.appendQueryParameter("anid", (String) this.A02.A00().second);
        return A012.toString();
    }

    public void A01(C003203q r5, String str) {
        boolean A022;
        if (!this.A04.A0F()) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], C29441ip.A00(r5));
            A002.A01(new AnonymousClass4I1(0), R.string.f11nameremoved);
            C18270x1.A0t(A002.A00(), r5);
            return;
        }
        if (C56972sr.A00(this.A00) != null && this.A03.A02()) {
            if (A02(str, 6518)) {
                A022 = this.A01.A0Y(C58422vE.A02, 6519);
            } else {
                A022 = A02(str, 3063);
            }
            if (A022) {
                r5.startActivity(C627736r.A0s(r5.getBaseContext(), str));
                return;
            }
        }
        Context baseContext = r5.getBaseContext();
        String A003 = A00(str);
        Intent A07 = C18320x8.A07();
        A07.setClassName(baseContext, "com.whatsapp.contextualhelp.ContextualHelpActivity");
        A07.putExtra("webview_url", A003);
        A07.putExtra("webview_hide_url", true);
        A07.putExtra("webview_javascript_enabled", true);
        A07.putExtra("webview_avoid_external", true);
        A07.putExtra("webview_deeplink_enabled", true);
        r5.startActivity(A07);
    }

    public boolean A02(String str, int i) {
        String A0R = this.A01.A0R(C58422vE.A02, i);
        if (A0R != null) {
            try {
                JSONArray jSONArray = AnonymousClass0x9.A1H(A0R).getJSONArray("entrypoints_allowed_list");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (jSONArray.getString(i2).equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            } catch (JSONException e) {
                Log.e("ContextualHelpHandler/allowContentInBloks", e);
            }
        }
        return false;
    }

    public C53602nM(C29441ip r1, C620733j r2, C66433Lk r3) {
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = r1;
    }
}
