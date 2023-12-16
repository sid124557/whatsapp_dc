package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C011409i;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ExpandButton extends Preference {
    public long A00;

    public ExpandButton(Context context, List list, long j) {
        super(context, (AttributeSet) null);
        this.A01 = R.layout.f8nameremoved;
        A0C(R.drawable.ic_arrow_down_24dp);
        A0D(R.string.f11nameremoved);
        if (999 != this.A02) {
            this.A02 = 999;
            A07();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.A0H;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                A0s.add(preference);
            }
            if (A0s.contains(preference.A0E)) {
                if (z) {
                    A0s.add(preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    Context context2 = this.A05;
                    Object[] A0M = AnonymousClass002.A0M();
                    AnonymousClass000.A16(charSequence, charSequence2, A0M);
                    charSequence = context2.getString(R.string.f11nameremoved, A0M);
                }
            }
        }
        A0L(charSequence);
        this.A00 = j + SearchActionVerificationClientService.MS_TO_NS;
    }

    public long A02() {
        return this.A00;
    }

    public void A0T(C011409i r2) {
        super.A0T(r2);
        r2.A00 = false;
    }
}
