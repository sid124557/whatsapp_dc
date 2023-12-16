package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;

/* renamed from: X.2Xy  reason: invalid class name and case insensitive filesystem */
public class C44912Xy {
    public final C623334p A00;
    public final C72303dV A01;

    public void A00(C624134x r11) {
        Cursor A0E;
        if (!(r11 instanceof C30341mI)) {
            HashSet A0K = AnonymousClass002.A0K();
            C72303dV r3 = this.A01;
            AnonymousClass4GK A03 = r3.get();
            try {
                C56862sg r8 = ((AnonymousClass3H0) A03).A03;
                String[] strArr = new String[1];
                boolean A1W = AnonymousClass0x7.A1W(strArr, r11.A1L);
                A0E = r8.A0E("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?", "GET_DEVICE_RECEIPTS_SQL", strArr);
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("receipt_device_jid_row_id");
                while (A0E.moveToNext()) {
                    DeviceJid of = DeviceJid.of(this.A00.A08(A0E.getLong(columnIndexOrThrow)));
                    if (of != null) {
                        A0K.add(of.userJid);
                    }
                }
                A0E.close();
                A03.close();
                if (A0K.size() <= 0) {
                    A03 = r3.get();
                    C56862sg r32 = ((AnonymousClass3H0) A03).A03;
                    String[] strArr2 = new String[1];
                    C624134x.A0Y(r11, strArr2, A1W ? 1 : 0);
                    A0E = r32.A0E("SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?", "GET_MESSAGE_RECEIPTS_USER_SQL", strArr2);
                    int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("receipt_user_jid_row_id");
                    while (A0E.moveToNext()) {
                        UserJid A02 = AnonymousClass32Y.A02(this.A00, A0E.getLong(columnIndexOrThrow2));
                        if (A02 != null) {
                            A0K.add(A02);
                        }
                    }
                    A0E.close();
                    A03.close();
                    if (A0K.size() <= 0) {
                        return;
                    }
                }
                r11.A1h(AnonymousClass002.A0J(A0K));
                return;
            } catch (Throwable th) {
                try {
                    A03.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public C44912Xy(C623334p r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
