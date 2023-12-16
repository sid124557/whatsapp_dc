package com.whatsapp.contactinput.contactscreen;

import X.AnonymousClass66R;
import X.AnonymousClass6HZ;
import X.AnonymousClass8PJ;
import X.AnonymousClass8WG;
import X.AnonymousClass8X0;
import X.C119405wv;
import X.C125176Gq;
import X.C13750ng;
import X.C162457s7;
import X.C18290x4;
import X.C89704el;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;

public final class NativeContactActivity extends C89704el {
    public final AnonymousClass66R A00 = new C13750ng(new C119405wv(this), new AnonymousClass8WG(this), new AnonymousClass8X0(this), new AnonymousClass8PJ(C125176Gq.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        List emptyList = Collections.emptyList();
        C162457s7.A0D(emptyList);
        ((RecyclerView) C18290x4.A0N(this, R.id.form_recycler_view)).setAdapter(new AnonymousClass6HZ(emptyList));
    }
}
