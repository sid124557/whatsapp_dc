package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0mt  reason: invalid class name and case insensitive filesystem */
public class C13260mt implements Runnable {
    public final AnonymousClass0BT A00;
    public final /* synthetic */ C06310Xb A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13260mt(C06310Xb r1, String str) {
        this();
        this.A01 = r1;
        this.A02 = str;
    }

    public C188268yc A00() {
        return this.A00;
    }

    public void run() {
        Cursor A002;
        String str;
        byte[] bArr;
        try {
            C09140fi r2 = (C09140fi) this.A01.A04.A0J();
            C08700eu A012 = C02920Ic.A01("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", this.A02);
            AnonymousClass0R5 r7 = r2.A02;
            r7.A09();
            r7.A0A();
            try {
                A002 = C02930Id.A00(r7, A012, true);
                AnonymousClass05C r5 = new AnonymousClass05C();
                AnonymousClass05C r4 = new AnonymousClass05C();
                while (A002.moveToNext()) {
                    String string = A002.getString(0);
                    if (((ArrayList) r5.get(string)) == null) {
                        r5.put(string, AnonymousClass001.A0s());
                    }
                    String string2 = A002.getString(0);
                    if (((ArrayList) r4.get(string2)) == null) {
                        r4.put(string2, AnonymousClass001.A0s());
                    }
                }
                A002.moveToPosition(-1);
                r2.A01(r5);
                r2.A00(r4);
                ArrayList A0o = AnonymousClass000.A0o(A002);
                while (A002.moveToNext()) {
                    if (A002.isNull(0)) {
                        str = null;
                    } else {
                        str = A002.getString(0);
                    }
                    AnonymousClass0GD A07 = AnonymousClass0YN.A07(A002.getInt(1));
                    if (A002.isNull(2)) {
                        bArr = null;
                    } else {
                        bArr = A002.getBlob(2);
                    }
                    AnonymousClass0Xq A003 = AnonymousClass0Xq.A00(bArr);
                    int i = A002.getInt(3);
                    int i2 = A002.getInt(4);
                    ArrayList arrayList = (ArrayList) r5.get(A002.getString(0));
                    if (arrayList == null) {
                        arrayList = AnonymousClass001.A0s();
                    }
                    ArrayList arrayList2 = (ArrayList) r4.get(A002.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass001.A0s();
                    }
                    A0o.add(new C04620Pw(A003, A07, str, arrayList, arrayList2, i, i2));
                }
                r7.A0B();
                A002.close();
                A012.A01();
                r7.A0C();
                this.A00.A09((List) C06250Wv.A0K.apply(A0o));
            } catch (Throwable th) {
                r7.A0C();
                throw th;
            }
        } catch (Throwable th2) {
            this.A00.A0A(th2);
        }
    }

    public C13260mt() {
        this.A00 = AnonymousClass0BT.A00();
    }
}
