package X;

import android.os.Bundle;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.5bB  reason: invalid class name and case insensitive filesystem */
public class C107355bB implements C182958pG {
    public Object A00;
    public final int A01;

    public C107355bB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BaP(String str, int i) {
        AnonymousClass33I r2;
        boolean z;
        int i2;
        AnonymousClass2z0 r3;
        String str2 = str;
        if (this.A01 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
            if (i == 2) {
                mediaViewFragment.A1Y.A01(2);
                Bundle bundle = mediaViewFragment.A06;
                if (mediaViewFragment.A1X != null && bundle != null) {
                    r3 = C107395bF.A03(bundle, "");
                    r2 = mediaViewFragment.A1X;
                    C626936e.A06(str);
                    z = false;
                    i2 = 3;
                } else {
                    return;
                }
            } else {
                C18260x0.A0w("MediaViewFragment/no qr detected, result=", AnonymousClass001.A0o(), i);
                mediaViewFragment.A1Y.A01(3);
                return;
            }
        } else {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
            if (mediaComposerActivity.BHW()) {
                return;
            }
            if (i == 2) {
                r2 = mediaComposerActivity.A1C;
                if (r2 != null) {
                    z = false;
                    i2 = 3;
                    r3 = null;
                } else {
                    return;
                }
            } else {
                C18260x0.A0w("MediaComposerActivity/no qr detected, result=", AnonymousClass001.A0o(), i);
                return;
            }
        }
        r2.A02(r3, str2, i2, z, z);
    }
}
