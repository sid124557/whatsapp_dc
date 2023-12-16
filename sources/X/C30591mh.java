package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1mh  reason: invalid class name and case insensitive filesystem */
public class C30591mh extends C30331mH implements AnonymousClass4BB {
    public long A00;
    public List A01;
    public byte[] A02;
    @Deprecated
    public byte[] A03;
    @Deprecated
    public byte[] A04;
    @Deprecated
    public byte[] A05;
    public final List A06;

    public C30591mh(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 67, j);
        this.A06 = AnonymousClass001.A0s();
    }

    public void A1y(Cursor cursor, C623334p r4, HashMap hashMap) {
        super.A1y(cursor, r4, hashMap);
        this.A00 = cursor.getLong(AnonymousClass001.A0K(C18290x4.A0i("sender_timestamp", hashMap)));
    }

    public List BDE() {
        AnonymousClass39V[] A1V = AnonymousClass0x9.A1V();
        AnonymousClass39V.A04("polltype", "vote", A1V);
        return C624134x.A0D(A1V);
    }

    public C30591mh(long j, AnonymousClass2z0 r5, C52042kn r6, List list, long j2, long j3) {
        super(r5, (byte) 67, j);
        this.A05 = r6;
        this.A04 = null;
        this.A02 = j2;
        this.A06 = AnonymousClass001.A0s();
        this.A01 = list;
        this.A00 = j3;
    }

    public C30591mh(AnonymousClass2z0 r3, C52042kn r4, List list, long j, long j2, long j3) {
        super(r3, (byte) 67, j);
        this.A05 = r4;
        this.A04 = null;
        this.A02 = j2;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A06 = A0s;
        A0s.addAll(list);
        this.A00 = j3;
    }
}
