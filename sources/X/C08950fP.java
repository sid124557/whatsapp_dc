package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: X.0fP  reason: invalid class name and case insensitive filesystem */
public class C08950fP implements C16130sW {
    public final C15380rF A00;
    public final C17060uV A01;
    public final C16180sb A02;

    static {
        C06240Wu.A01("WMFgUpdater");
    }

    public C08950fP(WorkDatabase workDatabase, C15380rF r3, C16180sb r4) {
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = workDatabase.A0J();
    }

    public C188268yc BmK(Context context, AnonymousClass0PW r9, UUID uuid) {
        AnonymousClass0BT A002 = AnonymousClass0BT.A00();
        this.A02.B2t(new C13060mZ(context, r9, this, A002, uuid));
        return A002;
    }
}
