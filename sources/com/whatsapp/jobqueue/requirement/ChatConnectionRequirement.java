package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.C1228065u;
import X.C29411im;
import X.C389229y;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class ChatConnectionRequirement implements Requirement, C1228065u {
    public static final long serialVersionUID = 1;
    public transient C29411im A00;

    public boolean BIR() {
        return AnonymousClass000.A1U(this.A00.A04, 2);
    }

    public void Bm4(Context context) {
        this.A00 = (C29411im) C389229y.A01(context).AcJ.get();
    }
}
