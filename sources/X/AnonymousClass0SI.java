package X;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0SI  reason: invalid class name */
public final class AnonymousClass0SI {
    public static final String A00;

    static {
        String A01 = C06240Wu.A01("DiagnosticsWrkr");
        C162457s7.A0D(A01);
        A00 = A01;
    }

    /* JADX INFO: finally extract failed */
    public static final String A00(C16770tw r11, C15400rH r12, C16170sa r13, List list) {
        String str;
        Integer num;
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("\n Id \t Class Name\t ");
        A0o2.append(str);
        A0o2.append("\t State\t Unique Name\t Tags\t");
        AnonymousClass000.A1B(A0o2, A0o);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C06250Wv r7 = (C06250Wv) it.next();
            AnonymousClass0PX BDR = r11.BDR(AnonymousClass0J0.A00(r7));
            if (BDR != null) {
                num = Integer.valueOf(BDR.A01);
            } else {
                num = null;
            }
            String str3 = r7.A0J;
            C08700eu A002 = C02920Ic.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A002.Axu(1, str3);
            AnonymousClass0R5 r0 = ((C09120fg) r12).A01;
            r0.A09();
            Cursor A003 = C02930Id.A00(r0, A002, false);
            try {
                ArrayList A0o3 = AnonymousClass000.A0o(A003);
                while (A003.moveToNext()) {
                    if (A003.isNull(0)) {
                        str2 = null;
                    } else {
                        str2 = A003.getString(0);
                    }
                    A0o3.add(str2);
                }
                A003.close();
                A002.A01();
                String A08 = C73723fy.A08(",", (CharSequence) null, (CharSequence) null, A0o3, 62);
                String A082 = C73723fy.A08(",", (CharSequence) null, (CharSequence) null, r13.BDX(str3), 62);
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append(10);
                A0o4.append(str3);
                A0o4.append("\t ");
                A0o4.append(r7.A0G);
                A0o4.append("\t ");
                A0o4.append(num);
                A0o4.append("\t ");
                AnonymousClass001.A1K(r7.A0E.name(), "\t ", A08, A0o4);
                A0o4.append("\t ");
                A0o4.append(A082);
                A0o4.append(9);
                AnonymousClass000.A1B(A0o4, A0o);
            } catch (Throwable th) {
                A003.close();
                A002.A01();
                throw th;
            }
        }
        String obj = A0o.toString();
        C162457s7.A0D(obj);
        return obj;
    }
}
