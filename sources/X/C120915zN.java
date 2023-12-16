package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5zN  reason: invalid class name and case insensitive filesystem */
public final class C120915zN extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass57D $rootNode;
    public final /* synthetic */ AnonymousClass4GP $stopLoggingCallback;
    public final /* synthetic */ AnonymousClass5KN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120915zN(AnonymousClass5KN r2, AnonymousClass57D r3, AnonymousClass4GP r4) {
        super(0);
        this.this$0 = r2;
        this.$rootNode = r3;
        this.$stopLoggingCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        File[] listFiles;
        AnonymousClass5KN r2 = this.this$0;
        C105715Wc r7 = r2.A04;
        AnonymousClass57D r4 = this.$rootNode;
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("app_id", C58172up.A0B);
        A1G.put("bundle_id", r2.A01.getPackageName());
        A1G.put("event_count", 1);
        JSONArray A1F = AnonymousClass0x9.A1F();
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        JSONObject A1G3 = AnonymousClass0x9.A1G();
        C162457s7.A0J(r4, 0);
        String jSONObject = AnonymousClass5VX.A00(r4).toString(0);
        C162457s7.A0D(jSONObject);
        A1G3.put("tree", jSONObject);
        Object obj = r4.A04;
        A1G3.put("client_current_module", AnonymousClass000.A0O(obj));
        A1G3.put("client_sample_rate", AnonymousClass0x2.A09(r2.A03.A06));
        View view = (View) obj;
        C162457s7.A0J(view, 0);
        int[] iArr = C105785Wk.A08;
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.offsetTo(iArr[0], iArr[1]);
        A1G3.put("root_view_bounds_on_screen", rect.flattenToString());
        A1G3.put("logging_version", 0);
        A1G3.put("buildId", 546598543);
        A1G3.put("pipeline", "whatsapp_android");
        A1G2.put("extra", A1G3);
        A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mobile_uitracker_events");
        A1G2.put("sampling_rate", 1);
        A1G2.put("time", ((double) System.currentTimeMillis()) / 1000.0d);
        A1F.put(A1G2);
        A1G.put("data", A1F);
        A1G.put("app_ver", "2.23.26.14");
        A1G.put("session_id", r2.A05.get());
        int i = r2.A00;
        r2.A00 = i + 1;
        A1G.put("seq", i);
        try {
            Context context = r7.A00;
            AnonymousClass002.A0A(context.getCacheDir(), "wds_metrics").mkdir();
            File A0A = AnonymousClass002.A0A(context.getCacheDir(), "wds_metrics");
            File A0A2 = AnonymousClass002.A0A(context.getCacheDir(), "wds_metrics");
            if (!A0A2.exists() || !A0A2.isDirectory() || (listFiles = A0A2.listFiles(new C123866Ab(2))) == null) {
                list = C72023d3.A00;
            } else {
                list = C73703fw.A04(listFiles);
            }
            int A09 = AnonymousClass0x2.A09(r7.A02.A04);
            if (list.size() >= A09) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[2];
                C86604Kt.A1X(objArr, list.size(), 0, A09, 1);
                Log.d(C86654Ky.A0n(locale, "Max cached logs. allowed=%d, current=%d", Arrays.copyOf(objArr, 2)));
                this.$stopLoggingCallback.invoke();
                return C59022wD.A00;
            }
            Locale locale2 = Locale.ENGLISH;
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1P(objArr2, list.size(), 0);
            FileWriter fileWriter = new FileWriter(AnonymousClass002.A0A(A0A, C86654Ky.A0n(locale2, "wds_metric_event_%d.json", Arrays.copyOf(objArr2, 1))));
            fileWriter.write(A1G.toString());
            fileWriter.close();
            return C59022wD.A00;
        } catch (Exception e) {
            Log.d(C86654Ky.A0n(Locale.ENGLISH, "Failed to cache hierarchy event", Arrays.copyOf(new Object[]{e}, 1)));
        }
    }
}
