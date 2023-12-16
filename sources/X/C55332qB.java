package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2qB  reason: invalid class name and case insensitive filesystem */
public class C55332qB {
    public final AnonymousClass1R2 A00;
    public final AnonymousClass1R3 A01;
    public final C72303dV A02;
    public final C55832qz A03;

    public static C56632sJ A00(C55332qB r1, Object obj) {
        if (obj instanceof C30331mH) {
            return r1.A00;
        }
        return r1.A01;
    }

    public Set A01(AnonymousClass2z0 r3) {
        Object obj;
        if (this.A03.A05(r3) == null) {
            obj = this.A00;
        } else {
            obj = this.A01;
        }
        if (!(obj instanceof AnonymousClass1R3)) {
            return AnonymousClass0x9.A15(((AnonymousClass1R2) obj).A06(r3).A00.keySet());
        }
        AnonymousClass1R3 r1 = (AnonymousClass1R3) obj;
        C624134x A05 = r1.A02.A05(r3);
        if (A05 != null) {
            return AnonymousClass0x9.A15(r1.A01(A05).A00.keySet());
        }
        return AnonymousClass002.A0K();
    }

    public void A02(DeviceJid deviceJid, C624134x r26, long j) {
        String str;
        String str2;
        C85284Fq A04;
        String str3;
        C624134x r11 = r26;
        C56632sJ A002 = A00(this, r11);
        if (!r11.A1N && r11.A1L != -1) {
            C40442Fv A012 = A002.A01(r11);
            StringBuilder A0o = AnonymousClass001.A0o();
            boolean z = A002 instanceof AnonymousClass1R3;
            if (z) {
                str = "MessageReceiptDeviceStore/";
            } else {
                str = "MessageAddOnReceiptDeviceStore/";
            }
            A0o.append(str);
            AnonymousClass2z0 A08 = C624134x.A08(r11, "updateDeviceReceiptsForMessage/key=", A0o);
            A0o.append(A08);
            A0o.append("; deviceJid=");
            DeviceJid deviceJid2 = deviceJid;
            A0o.append(deviceJid2);
            A0o.append("; receipt=");
            ConcurrentHashMap concurrentHashMap = A012.A00;
            A0o.append(concurrentHashMap.get(deviceJid2));
            long j2 = j;
            C18260x0.A12("; timestamp=", A0o, j2);
            if (j > 0) {
                C44422Vz r3 = (C44422Vz) concurrentHashMap.get(deviceJid2);
                if (r3 == null) {
                    concurrentHashMap.put(deviceJid2, new C44422Vz(j2));
                } else {
                    long j3 = r3.A00;
                    if (j3 <= 0 || j3 > j) {
                        r3.A00 = j2;
                    } else {
                        return;
                    }
                }
                long A05 = A002.A02.A05(deviceJid2);
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append("writeDeviceReceipt: Key=");
                A0l.append(A08);
                A0l.append(", remoteDevice=");
                A0l.append(deviceJid2);
                C18260x0.A10(", deviceJidRowId=", A0l, A05);
                ContentValues A0E = C18290x4.A0E();
                if (z) {
                    str2 = "message_row_id";
                } else {
                    str2 = "message_add_on_row_id";
                }
                C18270x1.A0c(A0E, str2, r11.A1L);
                C18270x1.A0c(A0E, "receipt_device_timestamp", j2);
                C18270x1.A0c(A0E, "receipt_device_jid_row_id", A05);
                try {
                    A04 = A002.A04.A04();
                    C56862sg r7 = ((AnonymousClass3H0) A04).A03;
                    if (z) {
                        str3 = "receipt_device";
                    } else {
                        str3 = "message_add_on_receipt_device";
                    }
                    StringBuilder A0l2 = AnonymousClass000.A0l(str2);
                    A0l2.append("=? AND ");
                    A0l2.append("receipt_device_jid_row_id");
                    String A0X = AnonymousClass000.A0X("=?", A0l2);
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18260x0.A1X(A1Z, r11.A1L);
                    A1Z[1] = String.valueOf(A05);
                    if (((long) r7.A05(A0E, str3, A0X, AnonymousClass000.A0X("writeDeviceReceipt/UPDATE_RECEIPT_DEVICE", AnonymousClass000.A0l(str)), A1Z)) == 0) {
                        A0E.put("primary_device_version", A002.A05.A00(deviceJid2.userJid));
                        if (r7.A08(str3, AnonymousClass000.A0X("writeDeviceReceipt/INSERT_RECEIPT_DEVICE", AnonymousClass000.A0l(str)), A0E) == -1) {
                            StringBuilder A0l3 = AnonymousClass000.A0l(str);
                            A0l3.append("writedevicereceipt/replace/failed ");
                            A0l3.append(A08);
                            C18260x0.A1Q(A0l3, " ", deviceJid2);
                            C55682qk r5 = A002.A01;
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("key=");
                            A0o2.append(A08);
                            r5.A0A("ReceiptsMessageStore: replace failed", true, AnonymousClass000.A0P(deviceJid2, " device=", A0o2));
                        }
                    }
                    A04.close();
                    return;
                } catch (SQLiteDatabaseCorruptException e) {
                    C55272q5.A00(A002, e);
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public void A05(Set set) {
        C69833Yo Axl;
        C85284Fq A04 = this.A02.A04();
        try {
            Axl = A04.Axl();
            this.A01.A04(set);
            this.A00.A04(set);
            Axl.A00();
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C55332qB(AnonymousClass1R2 r1, AnonymousClass1R3 r2, C72303dV r3, C55832qz r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(C624134x r5, Set set) {
        C56632sJ A002 = A00(this, r5);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A08 = C624134x.A08(r5, "BaseReceiptDeviceStore/addBlankReceiptsForTargetDevices: msg_key=", A0o);
        A0o.append(A08);
        C624134x.A0P(r5, " row_id=", A0o);
        A0o.append(" device count=");
        C18260x0.A1F(A0o, set.size());
        try {
            A002.A03(r5, set, false);
        } catch (SQLiteConstraintException e) {
            Log.e((Throwable) e);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("BaseReceiptDeviceStore: Tried to add message twice: Message id:");
            throw AnonymousClass000.A0I(A08.A01, A0o2);
        }
    }

    public void A04(C624134x r4, Set set) {
        C56632sJ A002 = A00(this, r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r4, "BaseReceiptDeviceStore/appendBlankReceiptsForTargetDevices: msg_key=", A0o);
        C624134x.A0P(r4, " row_id=", A0o);
        A0o.append(" device count=");
        C18260x0.A1F(A0o, set.size());
        A002.A03(r4, set, false);
    }
}
