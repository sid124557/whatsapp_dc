package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2df  reason: invalid class name and case insensitive filesystem */
public abstract class C47692df {
    public void A01(List list) {
        Cursor A0E;
        C22231Io r9 = (C22231Io) this;
        C22221In r1 = r9.A00;
        C622834k r6 = r1.A01.A00;
        String str = r1.A04;
        String str2 = r1.A03;
        ArrayList A0p = AnonymousClass000.A0p(list);
        if (!list.isEmpty()) {
            int size = list.size();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SELECT rowid, * FROM ");
            AnonymousClass0x2.A1P(A0o, str);
            C57212tH.A02("(rowid IN ", A0o, size);
            String A0e = AnonymousClass000.A0e(A0o);
            String[] strArr = new String[list.size()];
            int i = 0;
            for (Object valueOf : list) {
                strArr[i] = String.valueOf(valueOf);
                i++;
            }
            AnonymousClass4GK A03 = r6.A00.get();
            try {
                A0E = ((AnonymousClass3H0) A03).A03.A0E(A0e, "BackupChangesStore/INCREMENTAL_BACKUP_QUERY_ROWS", strArr);
                String[] columnNames = A0E.getColumnNames();
                int columnIndex = A0E.getColumnIndex(str2);
                while (A0E.moveToNext()) {
                    Map A01 = C622834k.A01(A0E, columnNames);
                    if (!A01.isEmpty()) {
                        if (columnIndex >= 0) {
                            AnonymousClass0x2.A1K(str2, A01, A0E.getLong(columnIndex));
                        }
                        A0p.add(A01);
                    }
                }
                A0E.close();
                A03.close();
            } catch (Throwable th) {
                try {
                    A03.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        r9.A01.addAll(A0p);
        return;
        throw th;
    }

    public void A00(CancellationSignal cancellationSignal, List list) {
        if (list.size() > 0 && !cancellationSignal.isCanceled()) {
            int i = 0;
            while (i < list.size()) {
                List subList = list.subList(i, Math.min(list.size(), i + 100));
                A01(subList);
                i += subList.size();
            }
        }
    }
}
