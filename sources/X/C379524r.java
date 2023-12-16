package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.24r  reason: invalid class name and case insensitive filesystem */
public class C379524r {
    public static Intent A00(Intent intent) {
        return new Intent(intent).setComponent((ComponentName) null).setFlags(intent.getFlags() & -4);
    }
}
