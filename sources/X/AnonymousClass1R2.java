package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1R2  reason: invalid class name */
public class AnonymousClass1R2 extends C56632sJ {
    public final C56922sm A00;

    public AnonymousClass1R2(C55682qk r7, C56922sm r8, C623334p r9, C55272q5 r10, C72303dV r11, C52382lO r12) {
        super(r7, r9, r10, r11, r12);
        this.A00 = r8;
    }

    public final C40442Fv A06(AnonymousClass2z0 r11) {
        Cursor A0E;
        C40442Fv r7 = new C40442Fv();
        long A07 = this.A00.A07(AnonymousClass2z0.A01(r11));
        String[] A1a = AnonymousClass0x9.A1a();
        C18270x1.A1S(A1a, A07);
        A1a[1] = AnonymousClass2z0.A08(r11);
        A1a[2] = r11.A01;
        AnonymousClass4GK A03 = this.A04.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "GET_MESSAGE_ADD_ON_DEVICE_RECEIPTS_SQL", A1a);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("receipt_device_jid_row_id");
            int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("receipt_device_timestamp");
            while (A0E.moveToNext()) {
                long j = A0E.getLong(columnIndexOrThrow);
                C623334p r8 = this.A02;
                DeviceJid deviceJid = (DeviceJid) r8.A0B(DeviceJid.class, j);
                if (deviceJid != null) {
                    r7.A00.put(deviceJid, new C44422Vz(A0E.getLong(columnIndexOrThrow2)));
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("MessageAddOnReceiptDeviceStore//getmessagedevicereceipts: got a null deviceJid for ");
                    A0o.append(r11);
                    A0o.append(", deviceJidRowId=");
                    A0o.append(j);
                    A0o.append(", jid=");
                    C18260x0.A0n(r8.A08(j), A0o);
                }
            }
            A0E.close();
            A03.close();
            return r7;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
