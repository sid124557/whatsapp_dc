package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import org.npci.upi.security.services.CLRemoteService;

/* renamed from: X.7h3  reason: invalid class name and case insensitive filesystem */
public class C156697h3 {
    public static C156697h3 A04;
    public static final Uri A05 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/execute");
    public static final Uri A06 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getChallenge");
    public static final Uri A07 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getCredentialIntent");
    public static final Uri A08 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getCredential");
    public static final Uri A09 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/registerApp");
    public Context A00;
    public ServiceConnection A01 = new C162717sd(this);
    public C40652Hf A02;
    public CLRemoteService A03 = null;

    public C156697h3(Context context, C40652Hf r6) {
        this.A00 = context;
        this.A02 = r6;
        Intent intent = new Intent();
        intent.setAction("org.npci.upi.security.services.CLRemoteService");
        intent.setPackage(this.A00.getPackageName());
        this.A00.bindService(intent, this.A01, 1);
    }
}
