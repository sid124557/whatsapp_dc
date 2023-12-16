package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.0wH  reason: invalid class name and case insensitive filesystem */
public class C17810wH implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C17810wH(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onClick(View view) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass0R2) this.A01).A05();
                return;
            case 1:
                C07580bG r0 = (C07580bG) this.A01;
                Window.Callback callback = r0.A07;
                if (callback != null && r0.A0D) {
                    callback.onMenuItemSelected(0, (C07900d0) this.A00);
                    return;
                }
                return;
            case 2:
                AnonymousClass0Og r3 = (AnonymousClass0Og) this.A00;
                r3.A02.post(new C11200jG(r3));
                C04190Ne r02 = (C04190Ne) ((AnonymousClass0Kj) this.A01).A00.A0A.peek();
                if (r02 != null) {
                    r02.A03.A04();
                    throw AnonymousClass000.A0L();
                }
                return;
            case 3:
                AnonymousClass0XR.A00((Context) this.A01, (AnonymousClass0XR) this.A00);
                return;
            case 4:
                AnonymousClass0XR.A01((View) this.A01, (AnonymousClass0XR) this.A00);
                return;
            default:
                ((SettingsGoogleDrive) this.A00).A1c((C03650La) this.A01);
                return;
        }
    }

    public C17810wH(C07580bG r4) {
        this.A02 = 1;
        this.A01 = r4;
        this.A00 = new C07900d0(r4.A09.getContext(), r4.A0C);
    }
}
