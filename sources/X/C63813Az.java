package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.3Az  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63813Az implements OnFailureListener {
    public final /* synthetic */ AnonymousClass2I1 A00;
    public final /* synthetic */ Boolean A01;

    public final void onFailure(Exception exc) {
        AnonymousClass2I1 r1 = this.A00;
        Boolean bool = this.A01;
        Log.e("BackupTokenUtils/setBlockStoreBytes/exception storing bytes", exc);
        if (r1 != null) {
            Log.e("BackupTokenProtocolHelper/encryptAndSaveToken/onFailure", exc);
            C59772xS.A00(r1.A00.A01, exc, bool.booleanValue());
        }
    }

    public /* synthetic */ C63813Az(AnonymousClass2I1 r1, Boolean bool) {
        this.A00 = r1;
        this.A01 = bool;
    }
}
