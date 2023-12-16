package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.settings.SettingsUserProxyViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4JV  reason: invalid class name */
public class AnonymousClass4JV implements C1228866f {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4JV(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* synthetic */ void BPk(String str) {
        if (2 - this.A02 == 0) {
            ((AnonymousClass2U2) this.A00).A08.A0D.A05(str);
        }
    }

    public /* synthetic */ void BQe(long j) {
        switch (this.A02) {
            case 1:
                C18260x0.A10("app/CrashLogs/uploadServerOkay/sent ", AnonymousClass001.A0o(), j);
                return;
            case 2:
                ((AnonymousClass2U2) this.A00).A08.A0C(j);
                return;
            case 4:
                ((File) this.A01).delete();
                return;
            default:
                return;
        }
    }

    public void BSF(String str) {
        SharedPreferences.Editor A08;
        StringBuilder sb;
        String str2;
        String substring;
        switch (this.A02) {
            case 0:
                if (C107575bX.A0F(str)) {
                    substring = "";
                } else {
                    substring = str.substring(0, Math.min(str.length(), 500));
                }
                C55682qk r4 = ((AnonymousClass364) this.A00).A01;
                StringBuilder A0o = AnonymousClass001.A0o();
                File file = (File) this.A01;
                A0o.append(file.length());
                StringBuilder A03 = C55682qk.A03(r4, "voip-time-series-upload-fail", AnonymousClass000.A0V(":uploadServiceError:", substring, A0o), false);
                C18270x1.A0y(file, "app/VoipTimeSeriesLogger: failed upload of ", A03);
                C18280x3.A11(file, " with size ", A03);
                C18260x0.A0t("reason: ", substring, A03);
                return;
            case 1:
                sb = AnonymousClass001.A0o();
                str2 = "app/CrashLogs/uploadServerOkay/error received: ";
                break;
            case 2:
                sb = AnonymousClass001.A0o();
                str2 = "mediaupload/error = ";
                break;
            case 3:
                sb = AnonymousClass001.A0o();
                str2 = "mediaupload/finalizeupload/error = ";
                break;
            case 4:
                sb = AnonymousClass001.A0o();
                str2 = "ProfiloUpload/Error: ";
                break;
            case 5:
                C43692Tc r42 = (C43692Tc) this.A00;
                C183538qC r3 = r42.A06.A01;
                int A022 = C18280x3.A02(C18270x1.A05(r3), "qpl_failed_upload_count");
                AnonymousClass33p A0J = C18320x8.A0J(r3);
                int i = A022 + 1;
                if (i == 0) {
                    A08 = C18300x5.A09(A0J, "qpl_failed_upload_count");
                } else {
                    A08 = C18320x8.A08(A0J, "qpl_failed_upload_count", i);
                }
                A08.apply();
                if (i >= 5) {
                    AnonymousClass4FX r2 = r42.A05;
                    StringBuilder A0l = AnonymousClass000.A0l(str);
                    A0l.append(" (");
                    A0l.append(i);
                    r2.B2g(AnonymousClass000.A0e(A0l));
                }
                r42.A00 = false;
                ((ConditionVariable) this.A01).open();
                return;
            default:
                C18260x0.A0r("SettingsUserProxyViewModel/MediaHealthCheck on error: ", str, AnonymousClass001.A0o());
                SettingsUserProxyViewModel settingsUserProxyViewModel = (SettingsUserProxyViewModel) this.A00;
                String A002 = settingsUserProxyViewModel.A0E.A00();
                String str3 = ((C60962zS) this.A01).A03;
                if (A002 != null && A002.split(":")[0].equalsIgnoreCase(str3)) {
                    settingsUserProxyViewModel.A0H.A04.A05(6);
                    return;
                }
                return;
        }
        C18260x0.A0r(str2, str, sb);
    }

    public void BaA(String str, Map map) {
        StringBuilder A0o;
        switch (this.A02) {
            case 0:
                C55682qk r4 = ((AnonymousClass364) this.A00).A01;
                File file = (File) this.A01;
                StringBuilder A03 = C55682qk.A03(r4, "voip-time-series-upload-success", String.valueOf(file.length()), false);
                C18270x1.A0y(file, "app/VoipTimeSeriesLogger: successful upload of ", A03);
                Log.i(AnonymousClass000.A0N(file, " with size ", A03));
                return;
            case 1:
                try {
                    if ("only_exception".equals(AnonymousClass0x9.A1H(str).optString("upload", ""))) {
                        ((AnonymousClass2CH) this.A01).A00 = "exception_only";
                        return;
                    } else {
                        ((AnonymousClass2CH) this.A01).A00 = "exception_and_logs";
                        return;
                    }
                } catch (JSONException e) {
                    ((AnonymousClass2CH) this.A01).A00 = "exception_and_logs";
                    C18260x0.A1P(AnonymousClass001.A0o(), "app/CrashLogs/uploadServerOkay/response json parsing error: ", e);
                    return;
                }
            case 2:
                AnonymousClass2U2 r2 = (AnonymousClass2U2) this.A00;
                r2.A00 = new C149927Ol();
                if (!((C43762Tj) this.A01).A08) {
                    try {
                        JSONObject A1H = AnonymousClass0x9.A1H(str);
                        r2.A00.A05 = A1H.optString("url");
                        r2.A00.A02 = A1H.optString("handle");
                        r2.A00.A00 = A1H.optString("direct_path");
                        r2.A00.A03 = A1H.optString("meta_hmac");
                        r2.A00.A01 = A1H.optString("fbid");
                        r2.A00.A04 = A1H.optString("ts");
                    } catch (JSONException e2) {
                        Log.e("mediaupload/jsonexception", e2);
                    }
                }
                r2.A02 = true;
                return;
            case 3:
                String str2 = null;
                try {
                    JSONObject A1H2 = AnonymousClass0x9.A1H(str);
                    str2 = A1H2.optString("url");
                    ((C102665Ju) this.A01).A02 = A1H2.optString("direct_path");
                } catch (JSONException e3) {
                    Log.e("mediaupload/jsonexception", e3);
                }
                ((C102665Ju) this.A01).A03 = str2;
                return;
            case 4:
                A0o = AnonymousClass001.A0o();
                A0o.append("ProfiloUpload/Response: ");
                A0o.append(str);
                break;
            case 5:
                C43692Tc r1 = (C43692Tc) this.A00;
                r1.A00 = true;
                C18260x0.A0K(C18320x8.A0J(r1.A06.A01), "qpl_failed_upload_count");
                ((ConditionVariable) this.A01).open();
                return;
            default:
                A0o = AnonymousClass001.A0o();
                A0o.append("SettingsUserProxyViewModel/MediaHealthCheck on response: ");
                A0o.append(str);
                A0o.append(", health check successful!");
                break;
        }
        AnonymousClass0x2.A18(A0o);
    }
}
