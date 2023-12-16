package X;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tM  reason: invalid class name and case insensitive filesystem */
public class C33581tM extends AnonymousClass5ZM {
    public Context A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C112515jr A04;
    public final C613330g A05;
    public final List A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            Context context = this.A00;
            if (context != null) {
                if (this.A05.A03(context, A0R, (float) this.A01, this.A02, true) == null) {
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public C33581tM(Context context, C112515jr r2, C613330g r3, List list, int i, int i2, int i3) {
        this.A00 = context;
        this.A06 = list;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = r2;
        C626936e.A06(r3);
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass001.A1Z(obj)) {
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("notification_type", this.A03);
            this.A04.A00(new C106645Zu("refresh_notification", A08));
        }
    }
}
