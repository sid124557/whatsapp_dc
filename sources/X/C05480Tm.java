package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.0Tm  reason: invalid class name and case insensitive filesystem */
public class C05480Tm {
    @Deprecated
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Bundle A07;
    public final C03950Me[] A08;
    public final C03950Me[] A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C05480Tm(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(pendingIntent, AnonymousClass002.A08(), i != 0 ? IconCompat.A02((Resources) null, "", i) : null, charSequence, (C03950Me[]) null, (C03950Me[]) null, 0, true, true);
    }

    public IconCompat A00() {
        int i;
        IconCompat iconCompat = this.A02;
        if (iconCompat != null || (i = this.A00) == 0) {
            return iconCompat;
        }
        IconCompat A022 = IconCompat.A02((Resources) null, "", i);
        this.A02 = A022;
        return A022;
    }

    public C05480Tm(PendingIntent pendingIntent, Bundle bundle, IconCompat iconCompat, CharSequence charSequence, C03950Me[] r7, C03950Me[] r8, int i, boolean z, boolean z2) {
        this.A05 = true;
        this.A02 = iconCompat;
        if (iconCompat != null && iconCompat.A05() == 2) {
            this.A00 = iconCompat.A04();
        }
        this.A03 = C05610Ue.A00(charSequence);
        this.A01 = pendingIntent;
        this.A07 = bundle == null ? AnonymousClass002.A08() : bundle;
        this.A09 = r7;
        this.A08 = r8;
        this.A04 = z;
        this.A06 = i;
        this.A05 = z2;
    }
}
