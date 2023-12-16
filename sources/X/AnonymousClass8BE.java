package X;

import android.os.BaseBundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: X.8BE  reason: invalid class name */
public final class AnonymousClass8BE implements C181138mD {
    public final /* synthetic */ C151127Tn A00;

    public AnonymousClass8BE(C151127Tn r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object Bqf(Task task) {
        BaseBundle baseBundle = (BaseBundle) task.getResult(IOException.class);
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string != null || (string = baseBundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = baseBundle.getString("error");
            if ("RST".equals(string2)) {
                throw AnonymousClass002.A0C("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw AnonymousClass002.A0C(string2);
            } else {
                String valueOf = String.valueOf(baseBundle);
                Log.w("FirebaseInstanceId", AnonymousClass000.A0V("Unexpected response: ", valueOf, AnonymousClass6CA.A0Y(valueOf.length() + 21)), new Throwable());
                throw AnonymousClass002.A0C("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw AnonymousClass002.A0C("SERVICE_NOT_AVAILABLE");
        }
    }
}
