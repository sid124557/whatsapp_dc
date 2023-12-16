package X;

import android.database.Cursor;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1mg  reason: invalid class name and case insensitive filesystem */
public class C30581mg extends C30331mH implements AnonymousClass4BB {
    public int A00 = 0;

    public C30581mg(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 86, j);
    }

    public void A1y(Cursor cursor, C623334p r7, HashMap hashMap) {
        int i;
        super.A1y(cursor, r7, hashMap);
        int A0K = AnonymousClass001.A0K(C18290x4.A0i("edit_type", hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("message_edit_version", hashMap));
        int i2 = cursor.getInt(A0K);
        int i3 = 0;
        if (cursor.isNull(A0K2)) {
            i = 0;
        } else {
            i = cursor.getInt(A0K2);
        }
        if (i2 != 1) {
            C18260x0.A0x("FMessageScheduledCallEdit/fillMessageAddOn unknown edit type: ", AnonymousClass001.A0o(), i2);
            i2 = 0;
        }
        if (i == 7 || i == 8) {
            i3 = i;
        } else {
            C18260x0.A0x("FMessageScheduledCallEdit/fillMessageAddOn unknown edit version: ", AnonymousClass001.A0o(), i);
        }
        this.A00 = i2;
        this.A01 = i3;
    }

    public List BDE() {
        AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
        AnonymousClass39V.A04("scheduled_call_type", "edit", A1V);
        return C624134x.A0D(A1V);
    }

    public C30581mg(AnonymousClass2z0 r3, C52042kn r4, long j, long j2) {
        super(r3, (byte) 86, j);
        this.A05 = r4;
        this.A04 = null;
        this.A02 = j2;
        this.A01 = r4.A01.A02 ? 7 : 8;
        this.A00 = 1;
    }
}
