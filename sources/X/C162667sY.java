package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: X.7sY  reason: invalid class name and case insensitive filesystem */
public abstract class C162667sY implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this instanceof AnonymousClass6UE) {
                AnonymousClass6UE r3 = (AnonymousClass6UE) this;
                Intent intent = r3.A00;
                if (intent != null) {
                    r3.A01.startActivityForResult(intent, 2);
                }
            } else {
                AnonymousClass6UF r32 = (AnonymousClass6UF) this;
                Intent intent2 = r32.A02;
                if (intent2 != null) {
                    r32.A01.startActivityForResult(intent2, r32.A00);
                }
            }
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
