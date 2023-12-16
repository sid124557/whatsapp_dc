package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.32N  reason: invalid class name */
public final class AnonymousClass32N {
    public final C69263Wi A00;
    public final AnonymousClass3DP A01;
    public final C54292oU A02;
    public final AnonymousClass33T A03;
    public final AnonymousClass317 A04;
    public final AnonymousClass2XB A05;

    public AnonymousClass32N(C69263Wi r2, AnonymousClass3DP r3, C54292oU r4, AnonymousClass33T r5, AnonymousClass317 r6, AnonymousClass2XB r7) {
        C18260x0.A0f(r2, r4, r3, r6, r7);
        C162457s7.A0J(r5, 6);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
    }

    public static final Intent A00(Context context, String str, String str2, int i, int i2, int i3) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.waffle.wfac.ui.WfacBanActivity");
        A07.putExtra("ban_violation_type", i);
        A07.putExtra("ban_violation_reason", str);
        A07.putExtra("ban_violation_source", i2);
        A07.putExtra("launch_source", i3);
        A07.putExtra("appeal_decision", str2);
        return A07;
    }
}
