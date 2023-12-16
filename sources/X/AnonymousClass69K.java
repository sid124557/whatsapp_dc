package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.status.playback.fragment.OpenLinkDialogFragment;

/* renamed from: X.69K  reason: invalid class name */
public class AnonymousClass69K implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass69K(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent A002;
        switch (this.A02) {
            case 0:
                OpenLinkDialogFragment openLinkDialogFragment = (OpenLinkDialogFragment) this.A00;
                String str = this.A01;
                AnonymousClass66G r0 = openLinkDialogFragment.A04;
                if (r0 != null) {
                    r0.BP9();
                }
                C85244Fm r1 = openLinkDialogFragment.A01;
                if (r1 != null) {
                    C86604Kt.A12(openLinkDialogFragment.A0G(), r1, str);
                    return;
                }
                throw C18270x1.A0S("linkLauncher");
            case 1:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A00;
                String str2 = this.A01;
                if (AnonymousClass345.A01(deepLinkActivity, "com.whatsapp.w4b") != null) {
                    A002 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                } else {
                    A002 = deepLinkActivity.A0u.A00("smb_linking_back2wa");
                }
                deepLinkActivity.A00.A0A(deepLinkActivity, A002);
                C86624Kv.A0f(deepLinkActivity);
                return;
            case 2:
                C97674z3 r2 = (C97674z3) this.A00;
                String str3 = this.A01;
                C621433s.A00(r2, 22);
                r2.A0B.A01(r2, str3);
                return;
            default:
                OpenLinkDialogFragment openLinkDialogFragment2 = (OpenLinkDialogFragment) this.A00;
                String str4 = this.A01;
                AnonymousClass66G r02 = openLinkDialogFragment2.A04;
                if (r02 != null) {
                    r02.BP9();
                }
                Context A1D = openLinkDialogFragment2.A1D();
                if (A1D != null) {
                    C85244Fm r3 = openLinkDialogFragment2.A01;
                    if (r3 != null) {
                        r3.BkY(A1D, Uri.parse(str4), (C624134x) null, 0, 1);
                    } else {
                        throw C18270x1.A0S("linkLauncher");
                    }
                }
                openLinkDialogFragment2.A1L();
                return;
        }
    }
}
