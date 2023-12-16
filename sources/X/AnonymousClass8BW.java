package X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8BW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BW implements C181158mI {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final Task Bqe(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = (String) obj;
        C160237nI r3 = FirebaseInstanceId.A08;
        String A05 = firebaseInstanceId.A03.A05();
        synchronized (r3) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("token", str3);
                A1G.put("appVersion", A05);
                A1G.put("timestamp", currentTimeMillis);
                String obj2 = A1G.toString();
                if (obj2 != null) {
                    SharedPreferences.Editor edit = r3.A01.edit();
                    edit.putString(C160237nI.A01(str, str2), obj2);
                    edit.commit();
                }
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", AnonymousClass000.A0V("Failed to encode token: ", valueOf, AnonymousClass6CA.A0Y(valueOf.length() + 24)));
            }
        }
        C146677Be r1 = new C146677Be(str3);
        AnonymousClass6YV r0 = new AnonymousClass6YV();
        r0.A04(r1);
        return r0;
    }

    public AnonymousClass8BW(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
