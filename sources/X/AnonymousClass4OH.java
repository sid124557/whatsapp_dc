package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.4OH  reason: invalid class name */
public class AnonymousClass4OH extends ArrayAdapter {
    public final /* synthetic */ PhoneContactsSelector A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4OH(Context context, PhoneContactsSelector phoneContactsSelector, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A00 = phoneContactsSelector;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102605Jm r0;
        Object item = getItem(i);
        C626936e.A06(item);
        C104215Qc r6 = (C104215Qc) item;
        if (view == null) {
            view = this.A00.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, false);
            r0 = new C102605Jm(view);
            view.setTag(r0);
        } else {
            r0 = (C102605Jm) view.getTag();
        }
        PhoneContactsSelector phoneContactsSelector = this.A00;
        AnonymousClass5UX r3 = phoneContactsSelector.A0D;
        ImageView imageView = r0.A01;
        r3.A06(imageView, R.drawable.avatar_contact);
        phoneContactsSelector.A0G.A03(imageView, r6);
        r0.A02.A0K(phoneContactsSelector.A0b, r6.A06);
        SelectionCheckView selectionCheckView = r0.A04;
        selectionCheckView.A06(r6.A03, false);
        selectionCheckView.setTag(r6);
        return view;
    }
}
