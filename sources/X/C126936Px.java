package X;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: X.6Px  reason: invalid class name and case insensitive filesystem */
public class C126936Px extends UserRecoverableAuthException {
    public final int zza;

    public C126936Px(Intent intent, String str, int i) {
        super(intent, str);
        this.zza = i;
    }
}
