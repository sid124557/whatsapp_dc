package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.registration.ChangeNumberNotifyContacts;
import com.whatsapp.registration.NotifyContactsSelector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Em  reason: invalid class name and case insensitive filesystem */
public class C22091Em extends C86994Mr {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22091Em(Context context, ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        super(context);
        this.A00 = changeNumberNotifyContacts;
    }

    public void onClick(View view) {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        Intent A08 = AnonymousClass0x9.A08(changeNumberNotifyContacts, NotifyContactsSelector.class);
        List list = changeNumberNotifyContacts.A0G;
        ArrayList A0u = C18300x5.A0u(list);
        C627336j.A0H(list, A0u);
        A08.putStringArrayListExtra("selected", A0u);
        changeNumberNotifyContacts.startActivityForResult(A08, 1);
    }
}
