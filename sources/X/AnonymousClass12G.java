package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.12G  reason: invalid class name */
public class AnonymousClass12G extends C05570Ua {
    public AnonymousClass12G(View view, C111095hX r14, C69263Wi r15, AnonymousClass2FN r16, C620633i r17, AnonymousClass1VX r18, C66433Lk r19) {
        super(view);
        Context context = view.getContext();
        C107635bd.A0E(context, r19.A04("download-and-installation", "about-linked-devices"), r14, r15, AnonymousClass0x7.A0K(view, R.id.linked_devices_description_text), r17, r18, AnonymousClass002.A0F(context, "learn-more", AnonymousClass002.A0L(), 0, R.string.f11nameremoved), "learn-more");
        TextView A0G = C18300x5.A0G(view, R.id.link_device_button);
        A0G.setText(R.string.f11nameremoved);
        C18310x6.A17(A0G, r16, 5);
    }
}
