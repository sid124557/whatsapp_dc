package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1R3  reason: invalid class name */
public class AnonymousClass1R3 extends C56632sJ {
    public final C56972sr A00;
    public final C56082rO A01;
    public final C55832qz A02;

    public AnonymousClass1R3(C55682qk r7, C56972sr r8, C623334p r9, C55272q5 r10, C72303dV r11, C56082rO r12, C52382lO r13, C55832qz r14) {
        super(r7, r9, r10, r11, r13);
        this.A00 = r8;
        this.A02 = r14;
        this.A01 = r12;
    }

    public final C40442Fv A06(AnonymousClass2z0 r11, long j) {
        Cursor A0E;
        C40442Fv r3 = new C40442Fv();
        if (j != -1) {
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1S(A1Y, j);
            try {
                AnonymousClass4GK A03 = this.A04.get();
                try {
                    A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?", "MessageReceiptDeviceStore/`GET_DEVICE_RECEIPTS_SQL`", A1Y);
                    int columnIndexOrThrow = A0E.getColumnIndexOrThrow("receipt_device_timestamp");
                    int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("receipt_device_jid_row_id");
                    while (A0E.moveToNext()) {
                        long j2 = A0E.getLong(columnIndexOrThrow2);
                        C623334p r8 = this.A02;
                        DeviceJid deviceJid = (DeviceJid) r8.A0B(DeviceJid.class, j2);
                        if (deviceJid != null) {
                            r3.A00.put(deviceJid, new C44422Vz(A0E.getLong(columnIndexOrThrow)));
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("receiptsmessagestore/getmessagedevicereceipts: got a null deviceJid for key=");
                            A0o.append(r11);
                            A0o.append(", deviceJidRowId=");
                            A0o.append(j2);
                            A0o.append(", jid=");
                            C18260x0.A0n(r8.A08(j2), A0o);
                        }
                    }
                    A0E.close();
                    A03.close();
                    return r3;
                } catch (Throwable th) {
                    A03.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                C55272q5.A00(this, e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return r3;
        throw th;
    }

    public boolean A07(UserJid userJid, long j) {
        C85284Fq A04;
        long A05 = this.A02.A05(userJid.getPrimaryDevice());
        try {
            A04 = this.A04.A04();
            ContentValues A09 = C18280x3.A09();
            C18270x1.A0a(A09, j);
            if (AnonymousClass3H0.A02(A09, A04, "receipt_device_jid_row_id", A05).A08("receipt_device", "MessageReceiptDeviceStore/addBlankReceiptForMasterDevice/INSERT_RECEIPT_DEVICE", A09) != -1) {
                A04.close();
                return true;
            }
            A04.close();
            return false;
        } catch (SQLiteDatabaseCorruptException e) {
            C55272q5.A00(this, e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
