package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5qg  reason: invalid class name and case insensitive filesystem */
public final class C116675qg implements C16430tO {
    public final /* synthetic */ WaBloksBottomSheetActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ WeakReference A03;

    public void BPR(AnonymousClass0JP r11) {
        StringBuilder A0o;
        Exception exc;
        String A0R;
        C162457s7.A0J(r11, 0);
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null && !A0F.isDestroyed() && !A0F.isFinishing()) {
            A0F.BjL();
        }
        if (!(r11 instanceof AnonymousClass0F8)) {
            WaBloksBottomSheetActivity waBloksBottomSheetActivity = this.A00;
            AnonymousClass5OS A002 = C1001459r.A00(new Object[0], -1, R.string.f11nameremoved);
            A002.A01 = R.string.f11nameremoved;
            C86644Kx.A1D(A002.A00(), waBloksBottomSheetActivity);
            C54322oX r3 = waBloksBottomSheetActivity.A00;
            if (r3 != null) {
                String str = this.A01;
                String str2 = this.A02;
                if (r11.equals(AnonymousClass0F7.A00)) {
                    A0R = "activity_no_longer_active";
                } else if (r11.equals(AnonymousClass0F8.A00)) {
                    A0R = "success";
                } else {
                    if (r11 instanceof AnonymousClass0F5) {
                        A0o = AnonymousClass001.A0o();
                        A0o.append("bk_layout_data_error_");
                        exc = ((AnonymousClass0F5) r11).A00.A02;
                    } else if (r11 instanceof AnonymousClass0F6) {
                        A0o = AnonymousClass001.A0o();
                        A0o.append("unknown_error_");
                        exc = ((AnonymousClass0F6) r11).A00;
                    } else {
                        throw C73153f1.A00();
                    }
                    A0R = AnonymousClass000.A0R(exc, A0o);
                }
                C162457s7.A0J(A0R, 2);
                String str3 = null;
                if (str != null) {
                    C162457s7.A0J("com.bloks.www.cxthelp", 1);
                    if (str.startsWith("com.bloks.www.cxthelp")) {
                        if (!(str2 == null || str2.length() == 0)) {
                            try {
                                JSONObject A1H = AnonymousClass0x9.A1H(str2);
                                if (A1H.has("params")) {
                                    JSONObject jSONObject = A1H.getJSONObject("params");
                                    if (jSONObject.has("server_params")) {
                                        JSONObject jSONObject2 = jSONObject.getJSONObject("server_params");
                                        C162457s7.A0H(jSONObject2);
                                        C162457s7.A0J(jSONObject2, 0);
                                        str3 = C57282tO.A00("entrypointid", jSONObject2, false);
                                    }
                                }
                            } catch (JSONException e) {
                                Log.e("SupportLogger/getEntryPointId", e);
                            }
                        }
                        r3.A03(str, A0R, str3, 5);
                    }
                }
                Log.w("WaBloksBottomSheetActivity - failed to launch via Bloks async action");
                return;
            }
            throw C18270x1.A0S("supportLogging");
        }
    }

    public C116675qg(WaBloksBottomSheetActivity waBloksBottomSheetActivity, String str, String str2, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A00 = waBloksBottomSheetActivity;
        this.A01 = str;
        this.A02 = str2;
    }
}
