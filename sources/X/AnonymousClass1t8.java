package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1t8  reason: invalid class name */
public class AnonymousClass1t8 extends AnonymousClass5ZM {
    public final C620633i A00;
    public final C54292oU A01;
    public final AnonymousClass5ZR A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass2KB r14 = (AnonymousClass2KB) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A03.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.BHW()) {
            phoneContactsSelector.A0M = null;
            List<C104215Qc> list = phoneContactsSelector.A0h;
            list.removeAll(r14.A00);
            phoneContactsSelector.A0e.A05();
            ArrayList arrayList = phoneContactsSelector.A0g;
            arrayList.clear();
            arrayList.addAll(r14.A01);
            for (C104215Qc r11 : list) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C104215Qc r9 = (C104215Qc) it.next();
                    if (r9.A04 == r11.A04) {
                        r9.A03 = true;
                    }
                }
            }
            if (list.isEmpty()) {
                phoneContactsSelector.A76();
            }
            phoneContactsSelector.A77(list.size());
            MenuItem menuItem = phoneContactsSelector.A00;
            if (menuItem != null) {
                menuItem.setVisible(AnonymousClass0x7.A1S(arrayList));
            }
            if (phoneContactsSelector.A0W.A01.A0Y(C58422vE.A02, 3789)) {
                C33271sj r0 = phoneContactsSelector.A0J;
                if (r0 != null) {
                    r0.A0D(true);
                    phoneContactsSelector.A0J = null;
                }
                C33271sj r1 = new C33271sj(C64333Db.A26(phoneContactsSelector.A09.A00.A03), phoneContactsSelector, list, arrayList);
                phoneContactsSelector.A0J = r1;
                C18270x1.A0w(r1, phoneContactsSelector.A04);
                return;
            }
            phoneContactsSelector.A75();
        }
    }

    public AnonymousClass1t8(PhoneContactsSelector phoneContactsSelector, C620633i r3, C54292oU r4, AnonymousClass5ZR r5) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = AnonymousClass0x9.A14(phoneContactsSelector);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056 A[SYNTHETIC, Splitter:B:13:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            X.C626936e.A00()
            X.33i r2 = r13.A00
            X.5ZR r1 = r13.A02
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "returning empty name map because contact permissions are denied"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0019:
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            java.lang.String r1 = "_id"
            java.lang.String r0 = "display_name"
            java.lang.String[] r9 = new java.lang.String[]{r1, r0}
            X.5UR r7 = r2.A0R()
            r10 = 0
            if (r7 != 0) goto L_0x0097
            java.lang.String r0 = "phone-contacts-selector/contact cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0032:
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
        L_0x0036:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "contact_id"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            X.5UR r7 = r2.A0R()
            if (r7 != 0) goto L_0x0056
            java.lang.String r0 = "phone-contacts-selector/contact cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004c:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
        L_0x0050:
            X.2KB r0 = new X.2KB
            r0.<init>(r5, r6)
            return r0
        L_0x0056:
            android.net.Uri r8 = android.provider.ContactsContract.DeletedContacts.CONTENT_URI     // Catch:{ Exception -> 0x008f }
            r12 = r10
            r11 = r10
            android.database.Cursor r4 = r7.A03(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x008f }
            if (r4 == 0) goto L_0x007c
            int r3 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0083 }
        L_0x0064:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0078
            int r0 = r4.getInt(r3)     // Catch:{ all -> 0x0083 }
            long r1 = (long) r0     // Catch:{ all -> 0x0083 }
            X.5Qc r0 = new X.5Qc     // Catch:{ all -> 0x0083 }
            r0.<init>(r10, r1, r10)     // Catch:{ all -> 0x0083 }
            r5.add(r0)     // Catch:{ all -> 0x0083 }
            goto L_0x0064
        L_0x0078:
            r4.close()     // Catch:{ Exception -> 0x008f }
            goto L_0x0050
        L_0x007c:
            java.lang.String r0 = "phone-contacts-selector/search deleted contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x004c
        L_0x0083:
            r1 = move-exception
            if (r4 == 0) goto L_0x008e
            r4.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x008f }
        L_0x008e:
            throw r1     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "phone-contacts-selector/query deleted contact exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x004c
        L_0x0097:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x00f1 }
            android.net.Uri$Builder r5 = r0.buildUpon()     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r4 = "directory"
            r0 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00f1 }
            android.net.Uri r8 = X.C18290x4.A0H(r5, r4, r0)     // Catch:{ Exception -> 0x00f1 }
            r12 = r10
            r11 = r10
            android.database.Cursor r8 = r7.A03(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00f1 }
            if (r8 != 0) goto L_0x00b9
            java.lang.String r0 = "phone-contacts-selector/contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x0032
        L_0x00b9:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00e0
            r0 = 0
            long r4 = r8.getLong(r0)     // Catch:{ all -> 0x00e5 }
            r0 = 1
            java.lang.String r7 = r8.getString(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = X.C18320x8.A0e(r0, r3)     // Catch:{ all -> 0x00e5 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00b9
            X.5Qc r0 = new X.5Qc     // Catch:{ all -> 0x00e5 }
            r0.<init>(r7, r4, r1)     // Catch:{ all -> 0x00e5 }
            r6.add(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b9
        L_0x00e0:
            r8.close()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x0036
        L_0x00e5:
            r1 = move-exception
            if (r8 == 0) goto L_0x00f0
            r8.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ec:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00f1 }
        L_0x00f0:
            throw r1     // Catch:{ Exception -> 0x00f1 }
        L_0x00f1:
            r1 = move-exception
            java.lang.String r0 = "phone-contacts-selector/contact exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0032
        L_0x00fa:
            java.lang.String r0 = "contact_id"
            java.lang.String r5 = "mimetype"
            java.lang.String r1 = "data2"
            java.lang.String[] r8 = new java.lang.String[]{r0, r5, r1}
            java.lang.String r4 = "vnd.android.cursor.item/name"
            java.lang.String[] r10 = new java.lang.String[]{r4}
            X.5UR r6 = r2.A0R()
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String r9 = "mimetype IN (?)"
            r11 = 0
            android.database.Cursor r8 = r6.A03(r7, r8, r9, r10, r11)
            if (r8 != 0) goto L_0x0124
            java.lang.String r0 = "null cursor returned from structured name query"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x0019
        L_0x0124:
            int r9 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x01a7 }
            r0 = -1
            if (r9 != r0) goto L_0x0131
            java.lang.String r0 = "invalid column index for the raw contact id"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x01a2
        L_0x0131:
            int r7 = r8.getColumnIndex(r5)     // Catch:{ all -> 0x01a7 }
            if (r7 != r0) goto L_0x013d
            java.lang.String r0 = "invalid column index for the mimetype"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x01a2
        L_0x013d:
            int r6 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x01a7 }
            if (r6 != r0) goto L_0x0149
            java.lang.String r0 = "invalid column index for the given name"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x01a2
        L_0x0149:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r8.isNull(r9)     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "null raw contact id for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x0149
        L_0x015c:
            boolean r0 = r8.isNull(r7)     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x0169
            java.lang.String r0 = "null mimetype for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x0149
        L_0x0169:
            java.lang.Long r10 = X.C18280x3.A0T(r8, r9)     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = X.C18320x8.A0e(r10, r3)     // Catch:{ all -> 0x01a7 }
            if (r0 != 0) goto L_0x0149
            java.lang.String r5 = r8.getString(r7)     // Catch:{ all -> 0x01a7 }
            if (r5 != 0) goto L_0x0180
            java.lang.String r0 = "mimetype was returned as null even though cursor said it wasn't null; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x0149
        L_0x0180:
            int r1 = r5.hashCode()     // Catch:{ all -> 0x01a7 }
            r0 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r1 != r0) goto L_0x0197
            boolean r0 = r5.equals(r4)     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r8.getString(r6)     // Catch:{ all -> 0x01a7 }
            r3.put(r10, r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x0149
        L_0x0197:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "unrecognized mimetype; skipping; mimetype="
            X.C18260x0.A0r(r0, r5, r1)     // Catch:{ all -> 0x01a7 }
            goto L_0x0149
        L_0x01a2:
            r8.close()
            goto L_0x0019
        L_0x01a7:
            r1 = move-exception
            if (r8 == 0) goto L_0x01b2
            r8.close()     // Catch:{ all -> 0x01ae }
            throw r1
        L_0x01ae:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x01b2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1t8.A08(java.lang.Object[]):java.lang.Object");
    }
}
