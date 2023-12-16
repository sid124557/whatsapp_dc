package X;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.3A4  reason: invalid class name */
public class AnonymousClass3A4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass3A4(ChangeNumberNotifyContacts changeNumberNotifyContacts, boolean z) {
        this.A00 = changeNumberNotifyContacts;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        AnonymousClass0x7.A16(changeNumberNotifyContacts.A04, this);
        SwitchCompat switchCompat = changeNumberNotifyContacts.A09;
        boolean z = this.A01;
        switchCompat.setChecked(!z);
        changeNumberNotifyContacts.A09.setChecked(z);
        return false;
    }
}
