package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8zL  reason: invalid class name and case insensitive filesystem */
public class C188698zL extends ResultReceiver {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188698zL(Handler handler, C182818p2 r3, AnonymousClass8I0 r4) {
        super(handler);
        this.A00 = r3;
        this.A01 = r4;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        if (this.A02 != 0) {
            super.onReceiveResult(i, bundle);
            if (i == 2) {
                try {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    JSONObject A1G2 = AnonymousClass0x9.A1G();
                    try {
                        ((C182818p2) this.A00).BZY(i, bundle);
                        A1G.put("status", "0");
                        A1G2.put("data", A1G);
                    } catch (JSONException unused) {
                        Log.e("onReceiveResult JSONException");
                    }
                    C156697h3 r3 = ((AnonymousClass8I0) this.A01).A0A.A00;
                    if (r3 != null) {
                        String obj = A1G2.toString();
                        android.util.Log.d(C156697h3.class.getName(), "Common Library Callback Called");
                        try {
                            r3.A03.B2r(obj);
                        } catch (RemoteException unused2) {
                            android.util.Log.e("CLServices", "Remote Exception in Common Library Callback");
                        }
                    }
                } catch (Exception unused3) {
                    Log.e("onReceiveResult java.lang.Exception");
                }
            } else {
                ((C182818p2) this.A00).BZY(i, bundle);
            }
        } else {
            AnonymousClass7JN r32 = (AnonymousClass7JN) this.A01;
            ((C159117l9) this.A00).A03(r32.A01, false);
            C147707Fi r1 = r32.A00;
            if (r1 != null) {
                r1.A01.release();
                r1.A00.release();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188698zL(AnonymousClass7JN r2, C159117l9 r3) {
        super((Handler) null);
        this.A00 = r3;
        this.A01 = r2;
    }
}
