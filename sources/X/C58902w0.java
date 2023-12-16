package X;

import com.whatsapp.util.Log;

/* renamed from: X.2w0  reason: invalid class name and case insensitive filesystem */
public class C58902w0 {
    public final C56972sr A00;
    public final AnonymousClass4F4 A01;
    public final AnonymousClass2NH A02;
    public final C56662sM A03;
    public final C49822h9 A04;
    public final AnonymousClass32U A05;
    public final C49092fy A06;
    public final C183538qC A07;
    public final C183538qC A08;

    public C58902w0(C56972sr r1, AnonymousClass4F4 r2, AnonymousClass2NH r3, C56662sM r4, C49822h9 r5, AnonymousClass32U r6, C49092fy r7, C183538qC r8, C183538qC r9) {
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A01 = r2;
        this.A05 = r6;
        this.A08 = r9;
        this.A02 = r3;
    }

    public static final boolean A00(C624134x r5) {
        String str;
        C55162pu A0t = r5.A0t();
        if (!C624134x.A0g(r5) || A0t == null) {
            str = "CommentProtobufHelper/commentMessageInfo is null";
        } else {
            Long A032 = A0t.A03();
            if (A032 != null && A032.longValue() > 0) {
                return true;
            }
            str = "CommentProtobufHelper/commentMessageInfo does not have row id populated";
        }
        Log.e(str);
        return false;
    }
}
