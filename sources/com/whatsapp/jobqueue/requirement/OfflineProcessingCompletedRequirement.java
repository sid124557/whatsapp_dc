package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass1VX;
import X.C1228065u;
import X.C29411im;
import X.C389229y;
import X.C58422vE;
import X.C64333Db;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class OfflineProcessingCompletedRequirement implements Requirement, C1228065u {
    public static final long serialVersionUID = 1;
    public transient C29411im A00;
    public transient AnonymousClass1VX A01;

    public boolean BIR() {
        if (!this.A01.A0Y(C58422vE.A02, 560) || !this.A00.A0A()) {
            return true;
        }
        return false;
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bso();
        this.A01 = A012.Avy();
    }
}
