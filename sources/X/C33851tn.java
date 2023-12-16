package X;

import android.app.ProgressDialog;
import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1tn  reason: invalid class name and case insensitive filesystem */
public class C33851tn extends AnonymousClass5ZM {
    public ProgressDialog A00;
    public final C56492s4 A01;
    public final C50102hd A02;
    public final AnonymousClass33K A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public C33851tn(C89654ea r2, C56492s4 r3, C50102hd r4, AnonymousClass33K r5, String str, String str2) {
        super(r2, true);
        this.A06 = AnonymousClass0x9.A14(r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = str;
        this.A04 = str2;
    }

    public void A0A() {
        Context context = (Context) this.A06.get();
        if (context != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new C85824Ht(this, 10));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                C18320x8.A0w(this.A00, context, R.string.f11nameremoved);
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r12) {
        /*
            r11 = this;
            X.2Rn r12 = (X.C43282Rn) r12
            if (r12 == 0) goto L_0x0082
            java.lang.String r10 = r12.A02
            if (r10 == 0) goto L_0x0082
            java.lang.String r8 = r12.A03
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0082
            java.lang.String r7 = r12.A01
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0082
            java.lang.String r9 = r12.A00
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "GetFaqPageTask/getHelpPagePostExecute success"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.ref.WeakReference r0 = r11.A06
            X.4ea r3 = X.C18320x8.A0F(r0)
            if (r3 == 0) goto L_0x0072
            r6 = 0
            boolean r5 = r12.A04
            java.lang.String r4 = r11.A04
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.support.faq.FaqItemActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "title"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "content"
            r2.putExtra(r0, r9)
            java.lang.String r0 = "url"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "article_id"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "show_contact_support_button"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "contact_us_context"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "describe_problem_fields"
            r2.putExtra(r0, r6)
            r0 = 0
            r3.A6T(r2, r0)
            r1 = 2130772051(0x7f010053, float:1.714721E38)
            r0 = 2130772053(0x7f010055, float:1.7147214E38)
            r3.overridePendingTransition(r1, r0)
        L_0x0072:
            android.app.ProgressDialog r0 = r11.A00
            if (r0 == 0) goto L_0x0081
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0081
            android.app.ProgressDialog r0 = r11.A00
            r0.cancel()
        L_0x0081:
            return
        L_0x0082:
            java.lang.String r0 = "GetFaqPageTask/getHelpPagePostExecute failure"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.ref.WeakReference r0 = r11.A06
            X.4ea r4 = X.C18320x8.A0F(r0)
            if (r4 == 0) goto L_0x0072
            X.2hd r3 = r11.A02
            java.lang.String r2 = r11.A04
            r1 = 0
            r0 = 0
            r3.A00(r0, r4, r2, r1)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33851tn.A0C(java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        InputStreamReader inputStreamReader;
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("/get-help/ ");
            String str = this.A05;
            C18260x0.A1J(A0o, str);
            try {
                AnonymousClass4GL A022 = this.A03.A02(20, str, (String) null, (String) null, (Map) null, false, false, false);
                try {
                    inputStreamReader = new InputStreamReader(A022.B47(this.A01, (Integer) null, 20));
                    char[] cArr = new char[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
                    int read = inputStreamReader.read(cArr, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    int i = 0;
                    while (read != -1) {
                        i += read;
                        if (i <= 65536) {
                            A0o2.append(cArr, 0, read);
                            read = inputStreamReader.read(cArr, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                        } else {
                            throw AnonymousClass002.A0C("The response from server is too big.");
                        }
                    }
                    JSONObject A1H = AnonymousClass0x9.A1H(A0o2.toString());
                    String optString = A1H.optString("title");
                    A1H.optString("platform");
                    A1H.optString("lang");
                    C43282Rn r9 = new C43282Rn(optString, A1H.optString("url"), A1H.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), A1H.optString("description"), A1H.optBoolean("open_flow", true));
                    inputStreamReader.close();
                    A022.close();
                    return r9;
                } catch (Throwable th) {
                    A022.close();
                    throw th;
                }
                throw th;
            } catch (Exception e) {
                Log.e("http/get-help/httperror", e);
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (Exception e2) {
            Log.e("Could not fetch help response", e2);
            return null;
        }
    }
}
