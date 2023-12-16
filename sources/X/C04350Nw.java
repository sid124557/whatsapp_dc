package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Nw  reason: invalid class name and case insensitive filesystem */
public final class C04350Nw {
    public int A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public final PendingIntent A04;
    public final Bundle A05;
    public final IconCompat A06;
    public final CharSequence A07;

    public C04350Nw(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat A022 = IconCompat.A02((Resources) null, "", i);
        Bundle A08 = AnonymousClass002.A08();
        this.A06 = A022;
        this.A07 = C05610Ue.A00(charSequence);
        this.A04 = pendingIntent;
        this.A05 = A08;
        this.A01 = null;
        this.A02 = true;
        this.A00 = 0;
        this.A03 = true;
    }

    public C05480Tm A00() {
        C03950Me[] r6;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0s2.add((C03950Me) it.next());
            }
        }
        C03950Me[] r5 = null;
        if (A0s.isEmpty()) {
            r6 = null;
        } else {
            r6 = (C03950Me[]) A0s.toArray(new C03950Me[A0s.size()]);
        }
        if (!A0s2.isEmpty()) {
            r5 = (C03950Me[]) A0s2.toArray(new C03950Me[A0s2.size()]);
        }
        return new C05480Tm(this.A04, this.A05, this.A06, this.A07, r5, r6, this.A00, this.A02, this.A03);
    }
}
