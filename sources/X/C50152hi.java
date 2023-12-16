package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2hi  reason: invalid class name and case insensitive filesystem */
public class C50152hi {
    public C33851tn A00;
    public final C56492s4 A01;
    public final C620733j A02;
    public final C50102hd A03;
    public final AnonymousClass33K A04;
    public final C66433Lk A05;
    public final AnonymousClass4FS A06;

    public void A00() {
        ProgressDialog progressDialog;
        C33851tn r1 = this.A00;
        if (r1 != null && (progressDialog = r1.A00) != null && progressDialog.isShowing()) {
            r1.A00.cancel();
        }
    }

    public void A01(C89654ea r12, C55092pm r13, String str) {
        String str2;
        String obj;
        C18290x4.A1L(this.A00);
        Uri.Builder appendPath = this.A05.A01().appendPath("verification.php");
        C620733j r0 = this.A02;
        String A062 = r0.A06();
        String A07 = r0.A07();
        r13.A01();
        C620633i r3 = r13.A09;
        TelephonyManager A0N = r3.A0N();
        if (A0N != null) {
            str2 = AnonymousClass34d.A01(A0N.getNetworkOperator(), "000-000");
        } else {
            str2 = "none";
        }
        HashMap A0t = AnonymousClass001.A0t();
        if (r13.A00 != null) {
            A0t.put("platform", "android");
            A0t.put("network", str2);
            A0t.put("lc", A062);
            A0t.put("lg", A07);
            A0t.put("context", r13.A00);
            r13.A01();
            StringBuilder A0o = AnonymousClass001.A0o();
            if (C627236i.A0E(r3)) {
                A0o.append("rted ");
            }
            try {
                Class.forName("org.acra.ACRA");
                A0o.append("nw-wap ");
            } catch (ClassNotFoundException unused) {
            }
            if (A0o.length() == 0) {
                obj = null;
            } else {
                obj = A0o.toString();
            }
            A0t.put("diagnostic", obj);
            String str3 = "true";
            String str4 = "false";
            if (r13.A01) {
                str4 = str3;
            }
            A0t.put("fail_too_many", str4);
            String str5 = "false";
            if (r13.A03) {
                str5 = str3;
            }
            A0t.put("no_route_sms", str5);
            String str6 = "false";
            if (r13.A04) {
                str6 = str3;
            }
            A0t.put("no_route_voice", str6);
            String str7 = "false";
            if (r13.A06) {
                str7 = str3;
            }
            A0t.put("valid_number", str7);
            if (!r13.A05) {
                str3 = "false";
            }
            A0t.put("no_number", str3);
            A0t.put("debug-context", r13.A00(r13.A00));
        }
        Iterator A11 = C18290x4.A11(A0t);
        while (A11.hasNext()) {
            String A0m = AnonymousClass001.A0m(A11);
            String A0e = C18320x8.A0e(A0m, A0t);
            if (TextUtils.isEmpty(A0e)) {
                A0e = "";
            }
            appendPath.appendQueryParameter(A0m, A0e);
        }
        C33851tn r4 = new C33851tn(r12, this.A01, this.A03, this.A04, appendPath.toString(), r13.A00(str));
        this.A00 = r4;
        this.A06.BkL(r4, new String[0]);
    }

    public C50152hi(C56492s4 r1, C620733j r2, C50102hd r3, AnonymousClass33K r4, C66433Lk r5, AnonymousClass4FS r6) {
        this.A06 = r6;
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }
}
