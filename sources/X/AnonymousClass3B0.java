package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.util.Log;

/* renamed from: X.3B0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3B0 implements OnSuccessListener {
    public final /* synthetic */ AnonymousClass2I1 A00;
    public final /* synthetic */ Boolean A01;

    public final void onSuccess(Object obj) {
        AnonymousClass2I1 r3 = this.A00;
        Boolean bool = this.A01;
        Log.i("BackupTokenUtils/setBlockStoreBytes/bytes stored");
        if (r3 != null) {
            boolean booleanValue = bool.booleanValue();
            Log.i("BackupTokenProtocolHelper/encryptAndSaveToken/onSuccess");
            C59772xS.A00(r3.A00.A01, (Exception) null, booleanValue);
        }
    }

    public /* synthetic */ AnonymousClass3B0(AnonymousClass2I1 r1, Boolean bool) {
        this.A00 = r1;
        this.A01 = bool;
    }
}
