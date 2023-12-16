package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;

/* renamed from: X.5Ia  reason: invalid class name and case insensitive filesystem */
public final class C102245Ia {
    public final Intent A00;
    public final Drawable A01;
    public final CharSequence A02;

    public C102245Ia(Intent intent, ActivityInfo activityInfo, Drawable drawable, CharSequence charSequence) {
        C162457s7.A0J(intent, 1);
        Intent intent2 = new Intent(intent);
        C18320x8.A10(intent2, activityInfo.packageName, activityInfo.name);
        this.A00 = intent2;
        this.A01 = drawable;
        this.A02 = charSequence;
    }
}
