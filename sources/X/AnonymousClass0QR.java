package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0QR  reason: invalid class name */
public class AnonymousClass0QR {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A03 = this.A01.A03(C58152un.A0A);
        this.A00 = A03;
        return A03;
    }

    public AnonymousClass0QR(C60152y5 r1) {
        this.A01 = r1;
    }

    public String A01(String str, String str2) {
        SharedPreferences A002 = A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gbackup-ResumableUrl-");
        String string = A002.getString(AnonymousClass000.A0U(str, "-", str2, A0o), (String) null);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("gdrive-api/get-resumable-uri ");
        A0o2.append(str2);
        Log.d(AnonymousClass000.A0V(":", string, A0o2));
        return string;
    }

    public void A02(String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator<String> it = A00().getAll().keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m != null && (A0m.startsWith("ResumableUrl-") || A0m.startsWith(AnonymousClass000.A0V("gdrive-ResumableUrl-", str, AnonymousClass001.A0o())) || A0m.startsWith(AnonymousClass000.A0V("gbackup-ResumableUrl-", str, AnonymousClass001.A0o())))) {
                A0s.add(A0m);
            }
        }
        SharedPreferences.Editor edit = A00().edit();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            edit.remove(AnonymousClass001.A0m(it2));
        }
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-all-resumable-uris unable to commit after cleanup to shared prefs.");
        }
    }

    public void A03(String str, String str2) {
        Log.d(AnonymousClass000.A0V("gdrive-api/remove-uri ", str2, AnonymousClass001.A0o()));
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gbackup-ResumableUrl-");
        edit.remove(AnonymousClass000.A0U(str, "-", str2, A0o));
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-resumable-uri unable to commit resumable uri to shared prefs.");
        }
    }

    public void A04(String str, String str2, String str3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive-api/insert-uri ");
        A0o.append(str2);
        Log.d(AnonymousClass000.A0V(":", str3, A0o));
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("gbackup-ResumableUrl-");
        edit.putString(AnonymousClass000.A0U(str, "-", str2, A0o2), str3);
        if (!edit.commit()) {
            Log.w("gdrive-api/insert-resumable-uri unable to commit resumable uri to shared prefs.");
        }
    }
}
