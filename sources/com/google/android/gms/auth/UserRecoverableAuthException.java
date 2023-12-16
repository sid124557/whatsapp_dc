package com.google.android.gms.auth;

import X.C143906zf;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class UserRecoverableAuthException extends C143906zf {
    public final Intent zza;

    public Intent A00() {
        Intent intent = this.zza;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }

    public UserRecoverableAuthException(Intent intent, String str) {
        super(str);
        this.zza = intent;
    }
}
